// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforagency.RoutesForAgencyListParams
import org.onebusaway.models.routesforagency.RoutesForAgencyListResponse

interface RoutesForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the list of all routes for a particular agency by id */
    fun list(agencyId: String): RoutesForAgencyListResponse =
        list(agencyId, RoutesForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
    ): RoutesForAgencyListResponse = list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForAgencyListResponse

    /** @see [list] */
    fun list(params: RoutesForAgencyListParams): RoutesForAgencyListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(agencyId: String, requestOptions: RequestOptions): RoutesForAgencyListResponse =
        list(agencyId, RoutesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [RoutesForAgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-agency/{agencyID}.json`, but
         * is otherwise the same as [RoutesForAgencyService.list].
         */
        @MustBeClosed
        fun list(agencyId: String): HttpResponseFor<RoutesForAgencyListResponse> =
            list(agencyId, RoutesForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: RoutesForAgencyListParams): HttpResponseFor<RoutesForAgencyListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutesForAgencyListResponse> =
            list(agencyId, RoutesForAgencyListParams.none(), requestOptions)
    }
}
