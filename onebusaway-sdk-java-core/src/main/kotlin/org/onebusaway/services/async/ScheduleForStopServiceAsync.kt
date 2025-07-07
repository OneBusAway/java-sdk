// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveParams
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveResponse

interface ScheduleForStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleForStopServiceAsync

    /** Get schedule for a specific stop */
    fun retrieve(stopId: String): CompletableFuture<ScheduleForStopRetrieveResponse> =
        retrieve(stopId, ScheduleForStopRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleForStopRetrieveResponse> =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
    ): CompletableFuture<ScheduleForStopRetrieveResponse> =
        retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleForStopRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduleForStopRetrieveParams
    ): CompletableFuture<ScheduleForStopRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleForStopRetrieveResponse> =
        retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ScheduleForStopServiceAsync] that provides access to raw HTTP responses for each
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
        ): ScheduleForStopServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/schedule-for-stop/{stopID}.json`, but is
         * otherwise the same as [ScheduleForStopServiceAsync.retrieve].
         */
        fun retrieve(
            stopId: String
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            stopId: String,
            params: ScheduleForStopRetrieveParams = ScheduleForStopRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ScheduleForStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: ScheduleForStopRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleForStopRetrieveResponse>> =
            retrieve(stopId, ScheduleForStopRetrieveParams.none(), requestOptions)
    }
}
