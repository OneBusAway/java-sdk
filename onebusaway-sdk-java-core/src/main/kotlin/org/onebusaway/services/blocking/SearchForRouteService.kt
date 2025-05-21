// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.searchforroute.SearchForRouteListParams
import org.onebusaway.models.searchforroute.SearchForRouteListResponse

interface SearchForRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Search for a route based on its name. */
    fun list(params: SearchForRouteListParams): SearchForRouteListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchForRouteListResponse

    /**
     * A view of [SearchForRouteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/search/route.json`, but is otherwise the
         * same as [SearchForRouteService.list].
         */
        @MustBeClosed
        fun list(params: SearchForRouteListParams): HttpResponseFor<SearchForRouteListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SearchForRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchForRouteListResponse>
    }
}
