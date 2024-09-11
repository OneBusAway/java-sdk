// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.TripsForRouteListParams
import com.open_transit.api.models.TripsForRouteListResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class TripsForRouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripsForRouteServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<TripsForRouteListResponse> =
        jsonHandler<TripsForRouteListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for active trips for a specific route. */
    override fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TripsForRouteListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trips-for-route", "{routeID}.json")
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
