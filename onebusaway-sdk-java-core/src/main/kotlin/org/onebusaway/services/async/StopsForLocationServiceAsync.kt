// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforlocation.StopsForLocationListParams
import org.onebusaway.models.stopsforlocation.StopsForLocationListResponse

interface StopsForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopsForLocationServiceAsync

    /** stops-for-location */
    fun list(): CompletableFuture<StopsForLocationListResponse> =
        list(StopsForLocationListParams.none())

    /** @see list */
    fun list(
        params: StopsForLocationListParams = StopsForLocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopsForLocationListResponse>

    /** @see list */
    fun list(
        params: StopsForLocationListParams = StopsForLocationListParams.none()
    ): CompletableFuture<StopsForLocationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StopsForLocationListResponse> =
        list(StopsForLocationListParams.none(), requestOptions)

    /**
     * A view of [StopsForLocationServiceAsync] that provides access to raw HTTP responses for each
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
        ): StopsForLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-location.json`, but is
         * otherwise the same as [StopsForLocationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StopsForLocationListResponse>> =
            list(StopsForLocationListParams.none())

        /** @see list */
        fun list(
            params: StopsForLocationListParams = StopsForLocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopsForLocationListResponse>>

        /** @see list */
        fun list(
            params: StopsForLocationListParams = StopsForLocationListParams.none()
        ): CompletableFuture<HttpResponseFor<StopsForLocationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StopsForLocationListResponse>> =
            list(StopsForLocationListParams.none(), requestOptions)
    }
}
