// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.ShapeRetrieveParams
import com.open_transit.api.models.ShapeRetrieveResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ShapeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ShapeServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ShapeRetrieveResponse> =
        jsonHandler<ShapeRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    override fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ShapeRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "shape", "{shapeID}.json")
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