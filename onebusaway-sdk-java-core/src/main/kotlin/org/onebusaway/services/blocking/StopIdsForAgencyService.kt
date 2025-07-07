// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListParams
import org.onebusaway.models.stopidsforagency.StopIdsForAgencyListResponse

interface StopIdsForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StopIdsForAgencyService

    /** Get stop IDs for a specific agency */
    fun list(agencyId: String): StopIdsForAgencyListResponse =
        list(agencyId, StopIdsForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopIdsForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
    ): StopIdsForAgencyListResponse = list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StopIdsForAgencyListResponse

    /** @see [list] */
    fun list(params: StopIdsForAgencyListParams): StopIdsForAgencyListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(agencyId: String, requestOptions: RequestOptions): StopIdsForAgencyListResponse =
        list(agencyId, StopIdsForAgencyListParams.none(), requestOptions)

    /**
     * A view of [StopIdsForAgencyService] that provides access to raw HTTP responses for each
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
        ): StopIdsForAgencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/stop-ids-for-agency/{agencyID}.json`, but
         * is otherwise the same as [StopIdsForAgencyService.list].
         */
        @MustBeClosed
        fun list(agencyId: String): HttpResponseFor<StopIdsForAgencyListResponse> =
            list(agencyId, StopIdsForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopIdsForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: StopIdsForAgencyListParams = StopIdsForAgencyListParams.none(),
        ): HttpResponseFor<StopIdsForAgencyListResponse> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StopIdsForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StopIdsForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StopIdsForAgencyListParams
        ): HttpResponseFor<StopIdsForAgencyListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StopIdsForAgencyListResponse> =
            list(agencyId, StopIdsForAgencyListParams.none(), requestOptions)
    }
}
