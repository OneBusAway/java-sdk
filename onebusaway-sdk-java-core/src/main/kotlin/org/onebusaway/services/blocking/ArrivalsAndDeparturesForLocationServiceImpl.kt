// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorBodyHandler
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepare
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListParams
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListResponse

class ArrivalsAndDeparturesForLocationServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    ArrivalsAndDeparturesForLocationService {

    private val withRawResponse: ArrivalsAndDeparturesForLocationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArrivalsAndDeparturesForLocationService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ArrivalsAndDeparturesForLocationService =
        ArrivalsAndDeparturesForLocationServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: ArrivalsAndDeparturesForLocationListParams,
        requestOptions: RequestOptions,
    ): ArrivalsAndDeparturesForLocationListResponse =
        // get /api/where/arrivals-and-departures-for-location.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArrivalsAndDeparturesForLocationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArrivalsAndDeparturesForLocationService.WithRawResponse =
            ArrivalsAndDeparturesForLocationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ArrivalsAndDeparturesForLocationListResponse> =
            jsonHandler<ArrivalsAndDeparturesForLocationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ArrivalsAndDeparturesForLocationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArrivalsAndDeparturesForLocationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "where", "arrivals-and-departures-for-location.json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
