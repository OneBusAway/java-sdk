// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.searchforstop.SearchForStopListParams
import org.onebusaway.models.searchforstop.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchForStopServiceAsync

    /** Search for a stop based on its name. */
    fun list(params: SearchForStopListParams): CompletableFuture<SearchForStopListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchForStopListResponse>

    /**
     * A view of [SearchForStopServiceAsync] that provides access to raw HTTP responses for each
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
        ): SearchForStopServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/search/stop.json`, but is otherwise the
         * same as [SearchForStopServiceAsync.list].
         */
        fun list(
            params: SearchForStopListParams
        ): CompletableFuture<HttpResponseFor<SearchForStopListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SearchForStopListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchForStopListResponse>>
    }
}
