// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.agency.AgencyRetrieveParams
import org.onebusaway.models.agency.AgencyRetrieveResponse

interface AgencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgencyService

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    fun retrieve(agencyId: String): AgencyRetrieveResponse =
        retrieve(agencyId, AgencyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        agencyId: String,
        params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgencyRetrieveResponse =
        retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        agencyId: String,
        params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
    ): AgencyRetrieveResponse = retrieve(agencyId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgencyRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: AgencyRetrieveParams): AgencyRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(agencyId: String, requestOptions: RequestOptions): AgencyRetrieveResponse =
        retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)

    /** A view of [AgencyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/agency/{agencyID}.json`, but is otherwise
         * the same as [AgencyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(agencyId: String): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(agencyId, AgencyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(params.toBuilder().agencyId(agencyId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            params: AgencyRetrieveParams = AgencyRetrieveParams.none(),
        ): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(agencyId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AgencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgencyRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AgencyRetrieveParams): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            agencyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgencyRetrieveResponse> =
            retrieve(agencyId, AgencyRetrieveParams.none(), requestOptions)
    }
}
