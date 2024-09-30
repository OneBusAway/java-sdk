// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.TripDetailRetrieveParams
import org.onebusaway.models.TripDetailRetrieveResponse
import org.onebusaway.services.errorHandler
import org.onebusaway.services.jsonHandler
import org.onebusaway.services.withErrorHandler

class TripDetailServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TripDetailService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<TripDetailRetrieveResponse> =
        jsonHandler<TripDetailRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve Trip Details */
    override fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions
    ): TripDetailRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "trip-details", "{tripID}.json")
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
