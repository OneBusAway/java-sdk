// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforroute.TripsForRouteListParams
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse

interface TripsForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripsForRouteService

    /** Search for active trips for a specific route. */
    fun list(routeId: String): TripsForRouteListResponse =
        list(routeId, TripsForRouteListParams.none())

    /** @see [list] */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForRouteListResponse = list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
    ): TripsForRouteListResponse = list(routeId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripsForRouteListResponse

    /** @see [list] */
    fun list(params: TripsForRouteListParams): TripsForRouteListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(routeId: String, requestOptions: RequestOptions): TripsForRouteListResponse =
        list(routeId, TripsForRouteListParams.none(), requestOptions)

    /**
     * A view of [TripsForRouteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripsForRouteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`, but is
         * otherwise the same as [TripsForRouteService.list].
         */
        @MustBeClosed
        fun list(routeId: String): HttpResponseFor<TripsForRouteListResponse> =
            list(routeId, TripsForRouteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForRouteListResponse> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
        ): HttpResponseFor<TripsForRouteListResponse> = list(routeId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TripsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripsForRouteListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TripsForRouteListParams): HttpResponseFor<TripsForRouteListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripsForRouteListResponse> =
            list(routeId, TripsForRouteListParams.none(), requestOptions)
    }
}
