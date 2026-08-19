// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.checkRequired
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
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListParams
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListResponse

class StopIdsForAgencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StopIdsForAgencyService {

    private val withRawResponse: StopIdsForAgencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StopIdsForAgencyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopIdsForAgencyService =
        StopIdsForAgencyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions,
    ): StopIdsForAgencyListResponse =
        // get /api/where/stop-ids-for-agency/{agencyID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StopIdsForAgencyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StopIdsForAgencyService.WithRawResponse =
            StopIdsForAgencyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<StopIdsForAgencyListResponse> =
            jsonHandler<StopIdsForAgencyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: StopIdsForAgencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopIdsForAgencyListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agencyId", params.agencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "where",
                        "stop-ids-for-agency",
                        "${params._pathParam(0)}.json",
                    )
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
