// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.JsonValue
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.checkRequired
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepareAsync
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListParams
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListResponse

class RouteIdsForAgencyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RouteIdsForAgencyServiceAsync {

    private val withRawResponse: RouteIdsForAgencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RouteIdsForAgencyServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RouteIdsForAgencyListResponse> =
        // get /api/where/route-ids-for-agency/{agencyID}.json
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RouteIdsForAgencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<RouteIdsForAgencyListResponse> =
            jsonHandler<RouteIdsForAgencyListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RouteIdsForAgencyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agencyId", params.agencyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "route-ids-for-agency",
                        "${params._pathParam(0)}.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
