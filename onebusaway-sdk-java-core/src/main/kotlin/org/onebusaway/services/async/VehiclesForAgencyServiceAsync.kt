// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListParams
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListResponse

interface VehiclesForAgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VehiclesForAgencyServiceAsync

    /** Get vehicles for a specific agency */
    fun list(agencyId: String): CompletableFuture<VehiclesForAgencyListResponse> =
        list(agencyId, VehiclesForAgencyListParams.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VehiclesForAgencyListResponse> =
        list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [list] */
    fun list(
        agencyId: String,
        params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
    ): CompletableFuture<VehiclesForAgencyListResponse> =
        list(agencyId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: VehiclesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VehiclesForAgencyListResponse>

    /** @see [list] */
    fun list(
        params: VehiclesForAgencyListParams
    ): CompletableFuture<VehiclesForAgencyListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VehiclesForAgencyListResponse> =
        list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)

    /**
     * A view of [VehiclesForAgencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): VehiclesForAgencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/vehicles-for-agency/{agencyID}.json`, but
         * is otherwise the same as [VehiclesForAgencyServiceAsync.list].
         */
        fun list(
            agencyId: String
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>> =
            list(agencyId, VehiclesForAgencyListParams.none())

        /** @see [list] */
        fun list(
            agencyId: String,
            params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>> =
            list(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [list] */
        fun list(
            agencyId: String,
            params: VehiclesForAgencyListParams = VehiclesForAgencyListParams.none(),
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>> =
            list(agencyId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: VehiclesForAgencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>>

        /** @see [list] */
        fun list(
            params: VehiclesForAgencyListParams
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VehiclesForAgencyListResponse>> =
            list(agencyId, VehiclesForAgencyListParams.none(), requestOptions)
    }
}
