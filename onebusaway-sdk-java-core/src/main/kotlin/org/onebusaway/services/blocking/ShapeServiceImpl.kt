// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.prepare
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.ShapeRetrieveParams
import org.onebusaway.models.ShapeRetrieveResponse

class ShapeServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ShapeService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ShapeRetrieveResponse> =
        jsonHandler<ShapeRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    override fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions
    ): ShapeRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "shape", "${params.getPathParam(0)}.json")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
