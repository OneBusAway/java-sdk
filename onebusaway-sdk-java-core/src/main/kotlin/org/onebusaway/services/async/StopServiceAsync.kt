// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stop.StopRetrieveParams
import org.onebusaway.models.stop.StopRetrieveResponse

interface StopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific stop */
    fun retrieve(stopId: String): CompletableFuture<StopRetrieveResponse> =
        retrieve(stopId, StopRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopRetrieveResponse> =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
    ): CompletableFuture<StopRetrieveResponse> = retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: StopRetrieveParams): CompletableFuture<StopRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StopRetrieveResponse> =
        retrieve(stopId, StopRetrieveParams.none(), requestOptions)

    /** A view of [StopServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stop/{stopID}.json`, but is otherwise the
         * same as [StopServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(stopId: String): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, StopRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StopRetrieveParams
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StopRetrieveResponse>> =
            retrieve(stopId, StopRetrieveParams.none(), requestOptions)
    }
}
