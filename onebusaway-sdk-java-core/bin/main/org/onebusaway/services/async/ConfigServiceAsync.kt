// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.config.ConfigRetrieveParams
import org.onebusaway.models.config.ConfigRetrieveResponse

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    /** config */
    fun retrieve(): CompletableFuture<ConfigRetrieveResponse> =
        retrieve(ConfigRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none()
    ): CompletableFuture<ConfigRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<ConfigRetrieveResponse> =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/config.json`, but is otherwise the same
         * as [ConfigServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(ConfigRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)
    }
}
