// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripdetails.TripDetailRetrieveParams
import org.onebusaway.models.tripdetails.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripDetailServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip-details/{tripID}.json`, but is
         * otherwise the same as [TripDetailServiceAsync.retrieve].
         */
        fun retrieve(
            tripId: String
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, TripDetailRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: TripDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripDetailRetrieveResponse>> =
            retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)
    }
}
