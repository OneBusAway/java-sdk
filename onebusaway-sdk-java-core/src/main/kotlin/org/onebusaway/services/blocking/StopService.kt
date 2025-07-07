// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stop.StopRetrieveParams
import org.onebusaway.models.stop.StopRetrieveResponse

interface StopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific stop */
    fun retrieve(stopId: String): StopRetrieveResponse = retrieve(stopId, StopRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopRetrieveResponse = retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: StopRetrieveParams = StopRetrieveParams.none(),
    ): StopRetrieveResponse = retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: StopRetrieveParams): StopRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(stopId: String, requestOptions: RequestOptions): StopRetrieveResponse =
        retrieve(stopId, StopRetrieveParams.none(), requestOptions)

    /** A view of [StopService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stop/{stopID}.json`, but is otherwise the
         * same as [StopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(stopId: String): HttpResponseFor<StopRetrieveResponse> =
            retrieve(stopId, StopRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: StopRetrieveParams = StopRetrieveParams.none(),
        ): HttpResponseFor<StopRetrieveResponse> = retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: StopRetrieveParams): HttpResponseFor<StopRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopRetrieveResponse> =
            retrieve(stopId, StopRetrieveParams.none(), requestOptions)
    }
}
