// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams
import org.onebusaway.models.tripsforlocation.TripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve trips for a given location */
    fun list(params: TripsForLocationListParams): CompletableFuture<TripsForLocationListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripsForLocationListResponse>

    /**
     * A view of [TripsForLocationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/trips-for-location.json`, but is
         * otherwise the same as [TripsForLocationServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: TripsForLocationListParams
        ): CompletableFuture<HttpResponseFor<TripsForLocationListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TripsForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripsForLocationListResponse>>
    }
}
