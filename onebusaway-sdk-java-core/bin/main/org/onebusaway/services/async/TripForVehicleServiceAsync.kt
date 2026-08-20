// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveResponse

interface TripForVehicleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripForVehicleServiceAsync

    /** Retrieve trip for a specific vehicle */
    fun retrieve(vehicleId: String): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse> =
        retrieve(vehicleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripForVehicleRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TripForVehicleRetrieveParams
    ): CompletableFuture<TripForVehicleRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripForVehicleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip-for-vehicle/{vehicleID}.json`, but
         * is otherwise the same as [TripForVehicleServiceAsync.retrieve].
         */
        fun retrieve(
            vehicleId: String
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TripForVehicleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TripForVehicleRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            vehicleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripForVehicleRetrieveResponse>> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)
    }
}
