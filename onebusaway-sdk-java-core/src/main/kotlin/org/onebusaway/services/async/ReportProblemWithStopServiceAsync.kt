// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithstop.ReportProblemWithStopRetrieveParams

interface ReportProblemWithStopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit a user-generated problem report for a stop */
    fun retrieve(stopId: String): CompletableFuture<ResponseWrapper> =
        retrieve(stopId, ReportProblemWithStopRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseWrapper> =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
    ): CompletableFuture<ResponseWrapper> = retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseWrapper>

    /** @see [retrieve] */
    fun retrieve(params: ReportProblemWithStopRetrieveParams): CompletableFuture<ResponseWrapper> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseWrapper> =
        retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithStopServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-stop/{stopID}.json`,
         * but is otherwise the same as [ReportProblemWithStopServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(stopId: String): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(stopId, ReportProblemWithStopRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ReportProblemWithStopRetrieveParams =
                ReportProblemWithStopRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ReportProblemWithStopRetrieveParams = ReportProblemWithStopRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithStopRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithStopRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(stopId, ReportProblemWithStopRetrieveParams.none(), requestOptions)
    }
}
