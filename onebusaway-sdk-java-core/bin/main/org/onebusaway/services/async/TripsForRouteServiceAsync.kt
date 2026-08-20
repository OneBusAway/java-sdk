// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforroute.TripsForRouteListParams
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse

interface TripsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripsForRouteServiceAsync

    /** Search for active trips for a specific route. */
    fun list(routeId: String): CompletableFuture<TripsForRouteListResponse> =
        list(routeId, TripsForRouteListParams.none())

    /** @see list */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripsForRouteListResponse> =
        list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see list */
    fun list(
        routeId: String,
        params: TripsForRouteListParams = TripsForRouteListParams.none(),
    ): CompletableFuture<TripsForRouteListResponse> = list(routeId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripsForRouteListResponse>

    /** @see list */
    fun list(params: TripsForRouteListParams): CompletableFuture<TripsForRouteListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripsForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-route/{routeID}.json`, but is
         * otherwise the same as [TripsForRouteServiceAsync.list].
         */
        fun list(routeId: String): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, TripsForRouteListParams.none())

        /** @see list */
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see list */
        fun list(
            routeId: String,
            params: TripsForRouteListParams = TripsForRouteListParams.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TripsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>>

        /** @see list */
        fun list(
            params: TripsForRouteListParams
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TripsForRouteListResponse>> =
            list(routeId, TripsForRouteListParams.none(), requestOptions)
    }
}
