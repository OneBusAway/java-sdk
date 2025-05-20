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
import org.onebusaway.models.RouteIdsForAgencyListParams
import org.onebusaway.models.RouteIdsForAgencyListResponse

class RouteIdsForAgencyServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RouteIdsForAgencyService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<RouteIdsForAgencyListResponse> =
        jsonHandler<RouteIdsForAgencyListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get route IDs for a specific agency */
    override fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions
    ): RouteIdsForAgencyListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "where",
                    "route-ids-for-agency",
                    "${params.getPathParam(0)}.json"
                )
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
