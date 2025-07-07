// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.currenttime.CurrentTimeRetrieveParams
import org.onebusaway.models.currenttime.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** current-time */
    fun retrieve(): CompletableFuture<CurrentTimeRetrieveResponse> =
        retrieve(CurrentTimeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentTimeRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
    ): CompletableFuture<CurrentTimeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<CurrentTimeRetrieveResponse> =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)

    /**
     * A view of [CurrentTimeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/current-time.json`, but is otherwise the
         * same as [CurrentTimeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(CurrentTimeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
    }
}
