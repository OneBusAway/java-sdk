// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.RouteIdsForAgencyListParams
import com.open_transit.api.models.RouteIdsForAgencyListResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

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
                .addPathSegments("api", "where", "route-ids-for-agency", "{agencyID}.json")
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
