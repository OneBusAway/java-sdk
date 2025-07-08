// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveResponse

interface TripForVehicleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripForVehicleService

    /** Retrieve trip for a specific vehicle */
    fun retrieve(vehicleId: String): TripForVehicleRetrieveResponse =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse =
        retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
    ): TripForVehicleRetrieveResponse = retrieve(vehicleId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripForVehicleRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: TripForVehicleRetrieveParams): TripForVehicleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        vehicleId: String,
        requestOptions: RequestOptions,
    ): TripForVehicleRetrieveResponse =
        retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)

    /**
     * A view of [TripForVehicleService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripForVehicleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trip-for-vehicle/{vehicleID}.json`, but
         * is otherwise the same as [TripForVehicleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(vehicleId: String): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(params.toBuilder().vehicleId(vehicleId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            params: TripForVehicleRetrieveParams = TripForVehicleRetrieveParams.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(vehicleId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripForVehicleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripForVehicleRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TripForVehicleRetrieveParams
        ): HttpResponseFor<TripForVehicleRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vehicleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripForVehicleRetrieveResponse> =
            retrieve(vehicleId, TripForVehicleRetrieveParams.none(), requestOptions)
    }
}
