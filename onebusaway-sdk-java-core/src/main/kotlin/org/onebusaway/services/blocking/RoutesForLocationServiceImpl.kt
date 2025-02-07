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
import org.onebusaway.models.RoutesForLocationListParams
import org.onebusaway.models.RoutesForLocationListResponse

class RoutesForLocationServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RoutesForLocationService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RoutesForLocationListResponse> =
        jsonHandler<RoutesForLocationListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** routes-for-location */
    override fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions
    ): RoutesForLocationListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "routes-for-location.json")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
