// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the full schedule for a route on a particular day */
    fun retrieve(routeId: String): ScheduleForRouteRetrieveResponse =
        retrieve(routeId, ScheduleForRouteRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse =
        retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
    ): ScheduleForRouteRetrieveResponse = retrieve(routeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForRouteRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: ScheduleForRouteRetrieveParams): ScheduleForRouteRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        requestOptions: RequestOptions,
    ): ScheduleForRouteRetrieveResponse =
        retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForRouteService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-route/{routeID}.json`, but
         * is otherwise the same as [ScheduleForRouteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(routeId: String): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(routeId, ScheduleForRouteRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(routeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForRouteRetrieveParams
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForRouteRetrieveResponse> =
            retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)
    }
}
