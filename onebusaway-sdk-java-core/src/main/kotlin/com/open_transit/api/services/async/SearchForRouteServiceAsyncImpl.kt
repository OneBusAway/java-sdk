// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.SearchForRouteListParams
import com.open_transit.api.models.SearchForRouteListResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class SearchForRouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SearchForRouteServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<SearchForRouteListResponse> =
        jsonHandler<SearchForRouteListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for a route based on its name. */
    override fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<SearchForRouteListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "search", "route.json")
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
