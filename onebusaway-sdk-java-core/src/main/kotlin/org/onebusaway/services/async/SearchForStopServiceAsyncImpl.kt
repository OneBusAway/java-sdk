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
import org.onebusaway.core.prepareAsync
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.SearchForStopListParams
import org.onebusaway.models.SearchForStopListResponse

class SearchForStopServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : SearchForStopServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<SearchForStopListResponse> =
        jsonHandler<SearchForStopListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Search for a stop based on its name. */
    override fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<SearchForStopListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "search", "stop.json")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
