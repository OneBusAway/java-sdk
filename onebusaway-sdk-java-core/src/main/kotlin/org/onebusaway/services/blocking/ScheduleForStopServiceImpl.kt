// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.ScheduleForStopRetrieveParams
import org.onebusaway.models.ScheduleForStopRetrieveResponse
import org.onebusaway.services.errorHandler
import org.onebusaway.services.jsonHandler
import org.onebusaway.services.withErrorHandler

class ScheduleForStopServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ScheduleForStopService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ScheduleForStopRetrieveResponse> =
        jsonHandler<ScheduleForStopRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get schedule for a specific stop */
    override fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions
    ): ScheduleForStopRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "schedule-for-stop", "{stopID}.json")
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
