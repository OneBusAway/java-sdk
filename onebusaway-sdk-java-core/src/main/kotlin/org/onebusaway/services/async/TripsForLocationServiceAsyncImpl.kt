// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.JsonValue
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepareAsync
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams
import org.onebusaway.models.tripsforlocation.TripsForLocationListResponse

class TripsForLocationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TripsForLocationServiceAsync {

    private val withRawResponse: TripsForLocationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TripsForLocationServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TripsForLocationListResponse> =
        // get /api/where/trips-for-location.json
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TripsForLocationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<TripsForLocationListResponse> =
            jsonHandler<TripsForLocationListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TripsForLocationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripsForLocationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "where", "trips-for-location.json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
