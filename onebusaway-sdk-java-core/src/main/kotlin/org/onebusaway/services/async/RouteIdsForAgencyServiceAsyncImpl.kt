// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.RouteIdsForAgencyListParams
import org.onebusaway.models.RouteIdsForAgencyListResponse

class RouteIdsForAgencyServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RouteIdsForAgencyServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RouteIdsForAgencyListResponse> =
        jsonHandler<RouteIdsForAgencyListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get route IDs for a specific agency */
    override fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RouteIdsForAgencyListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "where",
                    "route-ids-for-agency",
                    "${params.getPathParam(0)}.json"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
