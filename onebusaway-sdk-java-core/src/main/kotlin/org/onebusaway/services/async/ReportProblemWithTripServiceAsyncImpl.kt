// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.ReportProblemWithTripRetrieveParams
import org.onebusaway.models.ResponseWrapper

class ReportProblemWithTripServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ReportProblemWithTripServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ResponseWrapper> =
        jsonHandler<ResponseWrapper>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Submit a user-generated problem report for a particular trip. */
    override fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ResponseWrapper> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "where",
                    "report-problem-with-trip",
                    "${params.getPathParam(0)}.json"
                )
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
