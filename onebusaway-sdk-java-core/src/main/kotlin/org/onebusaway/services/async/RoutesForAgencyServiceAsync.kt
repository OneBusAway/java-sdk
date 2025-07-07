// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforagency.RoutesForAgencyListParams
import org.onebusaway.models.routesforagency.RoutesForAgencyListResponse

interface RoutesForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the list of all routes for a particular agency by id */
    fun list(agencyId: String): CompletableFuture<RoutesForAgencyListResponse> =
        list(agencyId, RoutesForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutesForAgencyListResponse> =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
    ): CompletableFuture<RoutesForAgencyListResponse> =
        list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutesForAgencyListResponse>

    /** @see [list] */
    fun list(params: RoutesForAgencyListParams): CompletableFuture<RoutesForAgencyListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutesForAgencyListResponse> =
        list(agencyId, RoutesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [RoutesForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-agency/{agencyID}.json`, but
         * is otherwise the same as [RoutesForAgencyServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            agencyId: String
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>> =
            list(agencyId, RoutesForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: RoutesForAgencyListParams = RoutesForAgencyListParams.none(),
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoutesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoutesForAgencyListParams
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutesForAgencyListResponse>> =
            list(agencyId, RoutesForAgencyListParams.none(), requestOptions)
    }
}
