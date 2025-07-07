// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforroute.StopsForRouteListParams
import org.onebusaway.models.stopsforroute.StopsForRouteListResponse

interface StopsForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stops for a specific route */
    fun list(routeId: String): StopsForRouteListResponse =
        list(routeId, StopsForRouteListParams.none())

    /** @see [list] */
    fun list(
        routeId: String,
        params: StopsForRouteListParams = StopsForRouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForRouteListResponse = list(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [list] */
    fun list(
        routeId: String,
        params: StopsForRouteListParams = StopsForRouteListParams.none(),
    ): StopsForRouteListResponse = list(routeId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: StopsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForRouteListResponse

    /** @see [list] */
    fun list(params: StopsForRouteListParams): StopsForRouteListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(routeId: String, requestOptions: RequestOptions): StopsForRouteListResponse =
        list(routeId, StopsForRouteListParams.none(), requestOptions)

    /**
     * A view of [StopsForRouteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-route/{routeID}.json`, but is
         * otherwise the same as [StopsForRouteService.list].
         */
        @MustBeClosed
        fun list(routeId: String): HttpResponseFor<StopsForRouteListResponse> =
            list(routeId, StopsForRouteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: StopsForRouteListParams = StopsForRouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForRouteListResponse> =
            list(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            params: StopsForRouteListParams = StopsForRouteListParams.none(),
        ): HttpResponseFor<StopsForRouteListResponse> = list(routeId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StopsForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForRouteListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: StopsForRouteListParams): HttpResponseFor<StopsForRouteListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForRouteListResponse> =
            list(routeId, StopsForRouteListParams.none(), requestOptions)
    }
}
