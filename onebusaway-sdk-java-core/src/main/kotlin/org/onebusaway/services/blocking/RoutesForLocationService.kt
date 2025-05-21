// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams
import org.onebusaway.models.routesforlocation.RoutesForLocationListResponse

interface RoutesForLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** routes-for-location */
    fun list(params: RoutesForLocationListParams): RoutesForLocationListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutesForLocationListResponse

    /**
     * A view of [RoutesForLocationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/routes-for-location.json`, but is
         * otherwise the same as [RoutesForLocationService.list].
         */
        @MustBeClosed
        fun list(
            params: RoutesForLocationListParams
        ): HttpResponseFor<RoutesForLocationListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoutesForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutesForLocationListResponse>
    }
}
