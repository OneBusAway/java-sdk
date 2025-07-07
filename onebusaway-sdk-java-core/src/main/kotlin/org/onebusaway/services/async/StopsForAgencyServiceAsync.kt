// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforagency.StopsForAgencyListParams
import org.onebusaway.models.stopsforagency.StopsForAgencyListResponse

interface StopsForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get stops for a specific agency */
    fun list(agencyId: String): CompletableFuture<StopsForAgencyListResponse> =
        list(agencyId, StopsForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopsForAgencyListResponse> =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
    ): CompletableFuture<StopsForAgencyListResponse> = list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StopsForAgencyListResponse>

    /** @see [list] */
    fun list(params: StopsForAgencyListParams): CompletableFuture<StopsForAgencyListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StopsForAgencyListResponse> =
        list(agencyId, StopsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [StopsForAgencyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-agency/{agencyID}.json`, but is
         * otherwise the same as [StopsForAgencyServiceAsync.list].
         */
        @MustBeClosed
        fun list(agencyId: String): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>> =
            list(agencyId, StopsForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
        ): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StopsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StopsForAgencyListParams
        ): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StopsForAgencyListResponse>> =
            list(agencyId, StopsForAgencyListParams.none(), requestOptions)
    }
}
