// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.config.ConfigRetrieveParams
import org.onebusaway.models.config.ConfigRetrieveResponse

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** config */
    fun retrieve(): CompletableFuture<ConfigRetrieveResponse> =
        retrieve(ConfigRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none()
    ): CompletableFuture<ConfigRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<ConfigRetrieveResponse> =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/config.json`, but is otherwise the same
         * as [ConfigServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(ConfigRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)
    }
}
