// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.trip.TripRetrieveParams
import org.onebusaway.models.trip.TripRetrieveResponse

interface TripServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific trip */
    fun retrieve(tripId: String): CompletableFuture<TripRetrieveResponse> =
        retrieve(tripId, TripRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripRetrieveParams = TripRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripRetrieveResponse> =
        retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripRetrieveParams = TripRetrieveParams.none(),
    ): CompletableFuture<TripRetrieveResponse> = retrieve(tripId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: TripRetrieveParams): CompletableFuture<TripRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TripRetrieveResponse> =
        retrieve(tripId, TripRetrieveParams.none(), requestOptions)

    /** A view of [TripServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip/{tripID}.json`, but is otherwise the
         * same as [TripServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(tripId: String): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(tripId, TripRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripRetrieveParams = TripRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripRetrieveParams = TripRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(tripId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(tripId, TripRetrieveParams.none(), requestOptions)
    }
}
