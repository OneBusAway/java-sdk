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
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListParams
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListResponse

class AgenciesWithCoverageServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AgenciesWithCoverageService {

    private val withRawResponse: AgenciesWithCoverageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgenciesWithCoverageService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AgenciesWithCoverageService =
        AgenciesWithCoverageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions,
    ): AgenciesWithCoverageListResponse =
        // get /api/where/agencies-with-coverage.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgenciesWithCoverageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgenciesWithCoverageService.WithRawResponse =
            AgenciesWithCoverageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AgenciesWithCoverageListResponse> =
            jsonHandler<AgenciesWithCoverageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgenciesWithCoverageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgenciesWithCoverageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "where", "agencies-with-coverage.json")
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
