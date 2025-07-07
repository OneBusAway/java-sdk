// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripdetails.TripDetailRetrieveParams
import org.onebusaway.models.tripdetails.TripDetailRetrieveResponse

interface TripDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve Trip Details */
    fun retrieve(tripId: String): TripDetailRetrieveResponse =
        retrieve(tripId, TripDetailRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripDetailRetrieveResponse =
        retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
    ): TripDetailRetrieveResponse = retrieve(tripId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripDetailRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: TripDetailRetrieveParams): TripDetailRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(tripId: String, requestOptions: RequestOptions): TripDetailRetrieveResponse =
        retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)

    /** A view of [TripDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip-details/{tripID}.json`, but is
         * otherwise the same as [TripDetailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tripId: String): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(tripId, TripDetailRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: TripDetailRetrieveParams = TripDetailRetrieveParams.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(tripId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripDetailRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripDetailRetrieveParams
        ): HttpResponseFor<TripDetailRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripDetailRetrieveResponse> =
            retrieve(tripId, TripDetailRetrieveParams.none(), requestOptions)
    }
}
