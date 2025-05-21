// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the full schedule for a route on a particular day */
    fun retrieve(routeId: String): CompletableFuture<ScheduleForRouteRetrieveResponse> =
        retrieve(routeId, ScheduleForRouteRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleForRouteRetrieveResponse> =
        retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
    ): CompletableFuture<ScheduleForRouteRetrieveResponse> =
        retrieve(routeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleForRouteRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForRouteRetrieveParams
    ): CompletableFuture<ScheduleForRouteRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleForRouteRetrieveResponse> =
        retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForRouteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-route/{routeID}.json`, but
         * is otherwise the same as [ScheduleForRouteServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            routeId: String
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>> =
            retrieve(routeId, ScheduleForRouteRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: ScheduleForRouteRetrieveParams = ScheduleForRouteRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>> =
            retrieve(routeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForRouteRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleForRouteRetrieveResponse>> =
            retrieve(routeId, ScheduleForRouteRetrieveParams.none(), requestOptions)
    }
}
