// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforroute.StopsForRouteListParams
import org.onebusaway.models.stopsforroute.StopsForRouteListResponse

interface StopsForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopsForRouteServiceAsync

    /** Get stops for a specific route */
    fun list(routeId: String): CompletableFuture<StopsForRouteListResponse> =
        list(routeId, StopsForRouteListParams.none())

    /** @see [list] */
    fun list(
        routeId: String,
        params: StopsForRouteListParams = StopsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopsForRouteListResponse> =
        list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    fun list(
        routeId: String,
        params: StopsForRouteListParams = StopsForRouteListParams.none(),
    ): CompletableFuture<StopsForRouteListResponse> = list(routeId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopsForRouteListResponse>

    /** @see [list] */
    fun list(params: StopsForRouteListParams): CompletableFuture<StopsForRouteListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        routeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StopsForRouteListResponse> =
        list(routeId, StopsForRouteListParams.none(), requestOptions)

    /**
     * A view of [StopsForRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): StopsForRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-route/{routeID}.json`, but is
         * otherwise the same as [StopsForRouteServiceAsync.list].
         */
        fun list(routeId: String): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>> =
            list(routeId, StopsForRouteListParams.none())

        /** @see [list] */
        fun list(
            routeId: String,
            params: StopsForRouteListParams = StopsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        fun list(
            routeId: String,
            params: StopsForRouteListParams = StopsForRouteListParams.none(),
        ): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>> =
            list(routeId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: StopsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>>

        /** @see [list] */
        fun list(
            params: StopsForRouteListParams
        ): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StopsForRouteListResponse>> =
            list(routeId, StopsForRouteListParams.none(), requestOptions)
    }
}
