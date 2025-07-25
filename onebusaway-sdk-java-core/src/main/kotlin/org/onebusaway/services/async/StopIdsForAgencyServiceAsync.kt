// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListParams
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListResponse

interface StopIdsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopIdsForAgencyServiceAsync

    /** Get stop IDs for a specific agency */
    fun list(agencyId: String): CompletableFuture<StopIdsForAgencyListResponse> =
        list(agencyId, StopIdsForAgencyListParams.none())

    /** @see list */
    fun list(
        agencyId: String,
        params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopIdsForAgencyListResponse> =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see list */
    fun list(
        agencyId: String,
        params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
    ): CompletableFuture<StopIdsForAgencyListResponse> =
        list(agencyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopIdsForAgencyListResponse>

    /** @see list */
    fun list(params: StopIdsForAgencyListParams): CompletableFuture<StopIdsForAgencyListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StopIdsForAgencyListResponse> =
        list(agencyId, StopIdsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [StopIdsForAgencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): StopIdsForAgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stop-ids-for-agency/{agencyID}.json`, but
         * is otherwise the same as [StopIdsForAgencyServiceAsync.list].
         */
        fun list(
            agencyId: String
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>> =
            list(agencyId, StopIdsForAgencyListParams.none())

        /** @see list */
        fun list(
            agencyId: String,
            params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see list */
        fun list(
            agencyId: String,
            params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>> =
            list(agencyId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: StopIdsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>>

        /** @see list */
        fun list(
            params: StopIdsForAgencyListParams
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StopIdsForAgencyListResponse>> =
            list(agencyId, StopIdsForAgencyListParams.none(), requestOptions)
    }
}
