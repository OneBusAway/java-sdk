// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforroute.TripsForRouteListParams
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for active trips for a specific route. */
    fun list(routeId: String): CompletableFuture<TripsForRouteListResponse> =
        list(routeId, TripsForRouteListParams.none())

    /** @see [list] */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripsForRouteListResponse> =
        list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
    ): CompletableFuture<TripsForRouteListResponse> = list(routeId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripsForRouteListResponse>

    /** @see [list] */
    fun list(params: TripsForRouteListParams): CompletableFuture<TripsForRouteListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        routeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TripsForRouteListResponse> =
        list(routeId, TripsForRouteListParams.none(), requestOptions)

    /**
     * A view of [TripsForRouteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`, but is
         * otherwise the same as [TripsForRouteServiceAsync.list].
         */
        @MustBeClosed
        fun list(routeId: String): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, TripsForRouteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TripsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TripsForRouteListParams
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, TripsForRouteListParams.none(), requestOptions)
    }
}
