// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.currenttime.CurrentTimeRetrieveParams
import org.onebusaway.models.currenttime.CurrentTimeRetrieveResponse

interface CurrentTimeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** current-time */
    fun retrieve(): CurrentTimeRetrieveResponse = retrieve(CurrentTimeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentTimeRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
    ): CurrentTimeRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CurrentTimeRetrieveResponse =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)

    /**
     * A view of [CurrentTimeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/current-time.json`, but is otherwise the
         * same as [CurrentTimeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<CurrentTimeRetrieveResponse> =
            retrieve(CurrentTimeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentTimeRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
        ): HttpResponseFor<CurrentTimeRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<CurrentTimeRetrieveResponse> =
            retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
    }
}
