// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.agency.AgencyRetrieveParams
import org.onebusaway.models.agency.AgencyRetrieveResponse

interface AgencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(agencyId: String): CompletableFuture<AgencyRetrieveResponse> =
        retrieve(agencyId, AgencyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        agencyId: String,
        params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgencyRetrieveResponse> =
        retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        agencyId: String,
        params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
    ): CompletableFuture<AgencyRetrieveResponse> = retrieve(agencyId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgencyRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: AgencyRetrieveParams): CompletableFuture<AgencyRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        agencyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgencyRetrieveResponse> =
        retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)

    /**
     * A view of [AgencyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/agency/{agencyID}.json`, but is otherwise
         * the same as [AgencyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(agencyId: String): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>> =
            retrieve(agencyId, AgencyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>> =
            retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>> =
            retrieve(agencyId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AgencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AgencyRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgencyRetrieveResponse>> =
            retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)
    }
}
