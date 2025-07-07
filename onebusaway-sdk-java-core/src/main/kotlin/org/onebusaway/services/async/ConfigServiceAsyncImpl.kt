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
import org.onebusaway.models.config.ConfigRetrieveParams
import org.onebusaway.models.config.ConfigRetrieveResponse

class ConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigServiceAsync {

    private val withRawResponse: ConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigRetrieveResponse> =
        // get /api/where/config.json
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ConfigRetrieveResponse> =
            jsonHandler<ConfigRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "where", "config.json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
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
