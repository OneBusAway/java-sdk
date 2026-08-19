// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stop.StopRetrieveParams
import org.onebusaway.models.stop.StopRetrieveResponse

interface StopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopServiceAsync

    /** Get details of a specific stop */
    fun retrieve(stopId: String): CompletableFuture<StopRetrieveResponse> =
        retrieve(stopId, StopRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopRetrieveResponse> =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
    ): CompletableFuture<StopRetrieveResponse> = retrieve(stopId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: StopRetrieveParams): CompletableFuture<StopRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StopRetrieveResponse> =
        retrieve(stopId, StopRetrieveParams.none(), requestOptions)

    /** A view of [StopServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stop/{stopID}.json`, but is otherwise the
         * same as [StopServiceAsync.retrieve].
         */
        fun retrieve(stopId: String): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, StopRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StopRetrieveParams
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, StopRetrieveParams.none(), requestOptions)
    }
}
