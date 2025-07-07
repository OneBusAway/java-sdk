// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.searchforstop.SearchForStopListParams
import org.onebusaway.models.searchforstop.SearchForStopListResponse

interface SearchForStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for a stop based on its name. */
    fun list(params: SearchForStopListParams): CompletableFuture<SearchForStopListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
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
         * Returns a raw HTTP response for `get /api/where/search/stop.json`, but is otherwise the
         * same as [SearchForStopServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: SearchForStopListParams
        ): CompletableFuture<HttpResponseFor<SearchForStopListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SearchForStopListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchForStopListResponse>>
    }
}
