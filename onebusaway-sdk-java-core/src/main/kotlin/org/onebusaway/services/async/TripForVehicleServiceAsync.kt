// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve trip for a specific vehicle */
    fun retrieve(vehicleId: String): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(vehicleId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: TripForVehicleRetrieveParams
    ): CompletableFuture<TripForVehicleRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)

    /**
     * A view of [TripForVehicleServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trip-for-vehicle/{vehicleID}.json`, but
         * is otherwise the same as [TripForVehicleServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            vehicleId: String
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripForVehicleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripForVehicleRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)
    }
}
