// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.TripForVehicleRetrieveParams
import org.onebusaway.models.TripForVehicleRetrieveResponse
import org.onebusaway.services.errorHandler
import org.onebusaway.services.jsonHandler
import org.onebusaway.services.withErrorHandler

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
