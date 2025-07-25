// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.currenttime.CurrentTimeRetrieveParams
import org.onebusaway.models.currenttime.CurrentTimeRetrieveResponse

interface CurrentTimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentTimeServiceAsync

    /** current-time */
    fun retrieve(): CompletableFuture<CurrentTimeRetrieveResponse> =
        retrieve(CurrentTimeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentTimeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
    ): CompletableFuture<CurrentTimeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<CurrentTimeRetrieveResponse> =
        retrieve(CurrentTimeRetrieveParams.none(), requestOptions)

    /**
     * A view of [CurrentTimeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CurrentTimeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/current-time.json`, but is otherwise the
         * same as [CurrentTimeServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(CurrentTimeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CurrentTimeRetrieveParams = CurrentTimeRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentTimeRetrieveResponse>> =
            retrieve(CurrentTimeRetrieveParams.none(), requestOptions)
    }
}
