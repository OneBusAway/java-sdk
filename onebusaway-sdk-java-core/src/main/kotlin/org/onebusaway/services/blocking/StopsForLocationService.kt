// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforlocation.StopsForLocationListParams
import org.onebusaway.models.stopsforlocation.StopsForLocationListResponse

interface StopsForLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopsForLocationService

    /** stops-for-location */
    fun list(params: StopsForLocationListParams): StopsForLocationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForLocationListResponse

    /**
     * A view of [StopsForLocationService] that provides access to raw HTTP responses for each
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
        ): StopsForLocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-location.json`, but is
         * otherwise the same as [StopsForLocationService.list].
         */
        @MustBeClosed
        fun list(
            params: StopsForLocationListParams
        ): HttpResponseFor<StopsForLocationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StopsForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForLocationListResponse>
    }
}
