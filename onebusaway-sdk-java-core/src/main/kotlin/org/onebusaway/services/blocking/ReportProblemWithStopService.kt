// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithstop.ReportProblemWithStopRetrieveParams

interface ReportProblemWithStopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportProblemWithStopService

    /** Submit a user-generated problem report for a stop */
    fun retrieve(stopId: String): ResponseWrapper =
        retrieve(stopId, ReportProblemWithStopRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper = retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
    ): ResponseWrapper = retrieve(stopId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseWrapper

    /** @see retrieve */
    fun retrieve(params: ReportProblemWithStopRetrieveParams): ResponseWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(stopId: String, requestOptions: RequestOptions): ResponseWrapper =
        retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithStopService] that provides access to raw HTTP responses for each
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
        ): ReportProblemWithStopService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-stop/{stopID}.json`,
         * but is otherwise the same as [ReportProblemWithStopService.retrieve].
         */
        @MustBeClosed
        fun retrieve(stopId: String): HttpResponseFor<ResponseWrapper> =
            retrieve(stopId, ReportProblemWithStopRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ReportProblemWithStopRetrieveParams =
                ReportProblemWithStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
        ): HttpResponseFor<ResponseWrapper> = retrieve(stopId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithStopRetrieveParams
        ): HttpResponseFor<ResponseWrapper> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseWrapper> =
            retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)
    }
}
