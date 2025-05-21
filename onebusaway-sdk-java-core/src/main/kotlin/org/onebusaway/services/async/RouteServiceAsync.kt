// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.route.RouteRetrieveParams
import org.onebusaway.models.route.RouteRetrieveResponse

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific route identified by its unique ID. */
    fun retrieve(routeId: String): CompletableFuture<RouteRetrieveResponse> =
        retrieve(routeId, RouteRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: RouteRetrieveParams = RouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteRetrieveResponse> =
        retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        params: RouteRetrieveParams = RouteRetrieveParams.none(),
    ): CompletableFuture<RouteRetrieveResponse> = retrieve(routeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: RouteRetrieveParams): CompletableFuture<RouteRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        routeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RouteRetrieveResponse> =
        retrieve(routeId, RouteRetrieveParams.none(), requestOptions)

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/route/{routeID}.json`, but is otherwise
         * the same as [RouteServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(routeId: String): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>> =
            retrieve(routeId, RouteRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: RouteRetrieveParams = RouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>> =
            retrieve(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            params: RouteRetrieveParams = RouteRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>> =
            retrieve(routeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RouteRetrieveParams
        ): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            routeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RouteRetrieveResponse>> =
            retrieve(routeId, RouteRetrieveParams.none(), requestOptions)
    }
}
