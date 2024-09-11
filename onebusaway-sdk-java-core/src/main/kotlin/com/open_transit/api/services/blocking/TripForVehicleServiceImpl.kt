// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.TripForVehicleRetrieveParams
import com.open_transit.api.models.TripForVehicleRetrieveResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler

class TripForVehicleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripForVehicleService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<TripForVehicleRetrieveResponse> =
        jsonHandler<TripForVehicleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve trip for a specific vehicle */
    override fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions
    ): TripForVehicleRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trip-for-vehicle", "{vehicleID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
