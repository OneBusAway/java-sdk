// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.searchforstop.SearchForStopListParams
import org.onebusaway.models.searchforstop.SearchForStopListResponse

interface SearchForStopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for a stop based on its name. */
    fun list(params: SearchForStopListParams): SearchForStopListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForStopListResponse

    /**
     * A view of [SearchForStopService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/search/stop.json`, but is otherwise the
         * same as [SearchForStopService.list].
         */
        @MustBeClosed
        fun list(params: SearchForStopListParams): HttpResponseFor<SearchForStopListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SearchForStopListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchForStopListResponse>
    }
}
