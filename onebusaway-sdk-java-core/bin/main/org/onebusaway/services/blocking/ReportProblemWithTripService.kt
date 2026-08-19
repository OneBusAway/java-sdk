// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithtrip.ReportProblemWithTripRetrieveParams

interface ReportProblemWithTripService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportProblemWithTripService

    /** Submit a user-generated problem report for a particular trip. */
    fun retrieve(tripId: String): ResponseWrapper =
        retrieve(tripId, ReportProblemWithTripRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tripId: String,
        params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper = retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tripId: String,
        params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
    ): ResponseWrapper = retrieve(tripId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

    /** @see retrieve */
    fun retrieve(params: ReportProblemWithTripRetrieveParams): ResponseWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tripId: String, requestOptions: RequestOptions): ResponseWrapper =
        retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithTripService] that provides access to raw HTTP responses for each
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
        ): ReportProblemWithTripService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-trip/{tripID}.json`,
         * but is otherwise the same as [ReportProblemWithTripService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tripId: String): HttpResponseFor<ResponseWrapper> =
            retrieve(tripId, ReportProblemWithTripRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: ReportProblemWithTripRetrieveParams =
                ReportProblemWithTripRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
        ): HttpResponseFor<ResponseWrapper> = retrieve(tripId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithTripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithTripRetrieveParams
        ): HttpResponseFor<ResponseWrapper> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)
    }
}
