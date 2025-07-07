// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListParams
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get route IDs for a specific agency */
    fun list(agencyId: String): RouteIdsForAgencyListResponse =
        list(agencyId, RouteIdsForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteIdsForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
    ): RouteIdsForAgencyListResponse = list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteIdsForAgencyListResponse

    /** @see [list] */
    fun list(params: RouteIdsForAgencyListParams): RouteIdsForAgencyListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(agencyId: String, requestOptions: RequestOptions): RouteIdsForAgencyListResponse =
        list(agencyId, RouteIdsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [RouteIdsForAgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/route-ids-for-agency/{agencyID}.json`,
         * but is otherwise the same as [RouteIdsForAgencyService.list].
         */
        @MustBeClosed
        fun list(agencyId: String): HttpResponseFor<RouteIdsForAgencyListResponse> =
            list(agencyId, RouteIdsForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteIdsForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
        ): HttpResponseFor<RouteIdsForAgencyListResponse> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RouteIdsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteIdsForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RouteIdsForAgencyListParams
        ): HttpResponseFor<RouteIdsForAgencyListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteIdsForAgencyListResponse> =
            list(agencyId, RouteIdsForAgencyListParams.none(), requestOptions)
    }
}
