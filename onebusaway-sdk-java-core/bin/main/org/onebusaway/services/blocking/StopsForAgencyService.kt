// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopsforagency.StopsForAgencyListParams
import org.onebusaway.models.stopsforagency.StopsForAgencyListResponse

interface StopsForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopsForAgencyService

    /** Get stops for a specific agency */
    fun list(agencyId: String): StopsForAgencyListResponse =
        list(agencyId, StopsForAgencyListParams.none())

    /** @see list */
    fun list(
        agencyId: String,
        params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see list */
    fun list(
        agencyId: String,
        params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
    ): StopsForAgencyListResponse = list(agencyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopsForAgencyListResponse

    /** @see list */
    fun list(params: StopsForAgencyListParams): StopsForAgencyListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(agencyId: String, requestOptions: RequestOptions): StopsForAgencyListResponse =
        list(agencyId, StopsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [StopsForAgencyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StopsForAgencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stops-for-agency/{agencyID}.json`, but is
         * otherwise the same as [StopsForAgencyService.list].
         */
        @MustBeClosed
        fun list(agencyId: String): HttpResponseFor<StopsForAgencyListResponse> =
            list(agencyId, StopsForAgencyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopsForAgencyListParams = StopsForAgencyListParams.none(),
        ): HttpResponseFor<StopsForAgencyListResponse> =
            list(agencyId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StopsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopsForAgencyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: StopsForAgencyListParams): HttpResponseFor<StopsForAgencyListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopsForAgencyListResponse> =
            list(agencyId, StopsForAgencyListParams.none(), requestOptions)
    }
}
