// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListParams
import org.onebusaway.models.agencieswithcoverage.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    fun list(): CompletableFuture<AgenciesWithCoverageListResponse> =
        list(AgenciesWithCoverageListParams.none())

    /** @see [list] */
    fun list(
        params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgenciesWithCoverageListResponse>

    /** @see [list] */
    fun list(
        params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none()
    ): CompletableFuture<AgenciesWithCoverageListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgenciesWithCoverageListResponse> =
        list(AgenciesWithCoverageListParams.none(), requestOptions)

    /**
     * A view of [AgenciesWithCoverageServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agencies-with-coverage.json`, but is
         * otherwise the same as [AgenciesWithCoverageServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AgenciesWithCoverageListResponse>> =
            list(AgenciesWithCoverageListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgenciesWithCoverageListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AgenciesWithCoverageListParams = AgenciesWithCoverageListParams.none()
        ): CompletableFuture<HttpResponseFor<AgenciesWithCoverageListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgenciesWithCoverageListResponse>> =
            list(AgenciesWithCoverageListParams.none(), requestOptions)
    }
}
