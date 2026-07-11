// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams
import org.onebusaway.models.routesforlocation.RoutesForLocationListResponse

interface RoutesForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutesForLocationServiceAsync

    /** routes-for-location */
    fun list(): CompletableFuture<RoutesForLocationListResponse> =
        list(RoutesForLocationListParams.none())

    /** @see list */
    fun list(
        params: RoutesForLocationListParams = RoutesForLocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutesForLocationListResponse>

    /** @see list */
    fun list(
        params: RoutesForLocationListParams = RoutesForLocationListParams.none()
    ): CompletableFuture<RoutesForLocationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoutesForLocationListResponse> =
        list(RoutesForLocationListParams.none(), requestOptions)

    /**
     * A view of [RoutesForLocationServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoutesForLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-location.json`, but is
         * otherwise the same as [RoutesForLocationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoutesForLocationListResponse>> =
            list(RoutesForLocationListParams.none())

        /** @see list */
        fun list(
            params: RoutesForLocationListParams = RoutesForLocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutesForLocationListResponse>>

        /** @see list */
        fun list(
            params: RoutesForLocationListParams = RoutesForLocationListParams.none()
        ): CompletableFuture<HttpResponseFor<RoutesForLocationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoutesForLocationListResponse>> =
            list(RoutesForLocationListParams.none(), requestOptions)
    }
}
