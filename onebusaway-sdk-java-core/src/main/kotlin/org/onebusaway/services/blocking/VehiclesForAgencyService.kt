// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListParams
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListResponse

interface VehiclesForAgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get vehicles for a specific agency */
    fun list(agencyId: String): VehiclesForAgencyListResponse =
        list(agencyId, VehiclesForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
    ): VehiclesForAgencyListResponse = list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VehiclesForAgencyListResponse

    /** @see [list] */
    fun list(params: VehiclesForAgencyListParams): VehiclesForAgencyListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(agencyId: String, requestOptions: RequestOptions): VehiclesForAgencyListResponse =
        list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [VehiclesForAgencyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/vehicles-for-agency/{agencyID}.json`, but
         * is otherwise the same as [VehiclesForAgencyService.list].
         */
        @MustBeClosed
        fun list(agencyId: String): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(agencyId, VehiclesForAgencyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VehiclesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VehiclesForAgencyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VehiclesForAgencyListParams
        ): HttpResponseFor<VehiclesForAgencyListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VehiclesForAgencyListResponse> =
            list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)
    }
}
