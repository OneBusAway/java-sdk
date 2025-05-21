// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveParams
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveResponse

interface ScheduleForStopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get schedule for a specific stop */
    fun retrieve(stopId: String): ScheduleForStopRetrieveResponse =
        retrieve(stopId, ScheduleForStopRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
    ): ScheduleForStopRetrieveResponse = retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleForStopRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: ScheduleForStopRetrieveParams): ScheduleForStopRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(stopId: String, requestOptions: RequestOptions): ScheduleForStopRetrieveResponse =
        retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForStopService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-stop/{stopID}.json`, but is
         * otherwise the same as [ScheduleForStopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(stopId: String): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleForStopRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduleForStopRetrieveParams
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleForStopRetrieveResponse> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)
    }
}
