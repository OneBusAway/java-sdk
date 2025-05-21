// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripdetails.TripDetailRetrieveParams
import org.onebusaway.models.tripdetails.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve Trip Details */
    fun retrieve(tripId: String): CompletableFuture<TripDetailRetrieveResponse> =
        retrieve(tripId, TripDetailRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripDetailRetrieveResponse> =
        retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
    ): CompletableFuture<TripDetailRetrieveResponse> =
        retrieve(tripId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripDetailRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: TripDetailRetrieveParams): CompletableFuture<TripDetailRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TripDetailRetrieveResponse> =
        retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)

    /**
     * A view of [TripDetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip-details/{tripID}.json`, but is
         * otherwise the same as [TripDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            tripId: String
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, TripDetailRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)
    }
}
