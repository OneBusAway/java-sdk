// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.AgenciesWithCoverageListParams
import org.onebusaway.models.AgenciesWithCoverageListResponse
import org.onebusaway.services.errorHandler
import org.onebusaway.services.jsonHandler
import org.onebusaway.services.withErrorHandler

class AgenciesWithCoverageServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgenciesWithCoverageServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AgenciesWithCoverageListResponse> =
        jsonHandler<AgenciesWithCoverageListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    override fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AgenciesWithCoverageListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "agencies-with-coverage.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
