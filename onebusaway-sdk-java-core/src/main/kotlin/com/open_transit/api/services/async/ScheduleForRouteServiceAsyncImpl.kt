// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.ScheduleForRouteRetrieveParams
import com.open_transit.api.models.ScheduleForRouteRetrieveResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ScheduleForRouteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ScheduleForRouteServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ScheduleForRouteRetrieveResponse> =
        jsonHandler<ScheduleForRouteRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve the full schedule for a route on a particular day */
    override fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ScheduleForRouteRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "schedule-for-route", "{routeID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
