// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListParams
import org.onebusaway.models.routeidsforagency.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteIdsForAgencyServiceAsync

    /** Get route IDs for a specific agency */
    fun list(agencyId: String): CompletableFuture<RouteIdsForAgencyListResponse> =
        list(agencyId, RouteIdsForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteIdsForAgencyListResponse> =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
    ): CompletableFuture<RouteIdsForAgencyListResponse> =
        list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteIdsForAgencyListResponse>

    /** @see [list] */
    fun list(
        params: RouteIdsForAgencyListParams
    ): CompletableFuture<RouteIdsForAgencyListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RouteIdsForAgencyListResponse> =
        list(agencyId, RouteIdsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [RouteIdsForAgencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): RouteIdsForAgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/route-ids-for-agency/{agencyID}.json`,
         * but is otherwise the same as [RouteIdsForAgencyServiceAsync.list].
         */
        fun list(
            agencyId: String
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> =
            list(agencyId, RouteIdsForAgencyListParams.none())

        /** @see [list] */
        fun list(
            agencyId: String,
            params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        fun list(
            agencyId: String,
            params: RouteIdsForAgencyListParams = RouteIdsForAgencyListParams.none(),
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: RouteIdsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>>

        /** @see [list] */
        fun list(
            params: RouteIdsForAgencyListParams
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RouteIdsForAgencyListResponse>> =
            list(agencyId, RouteIdsForAgencyListParams.none(), requestOptions)
    }
}
