// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.ResponseWrapper
import org.onebusaway.models.reportproblemwithtrip.ReportProblemWithTripRetrieveParams

interface ReportProblemWithTripServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit a user-generated problem report for a particular trip. */
    fun retrieve(tripId: String): CompletableFuture<ResponseWrapper> =
        retrieve(tripId, ReportProblemWithTripRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseWrapper> =
        retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
    ): CompletableFuture<ResponseWrapper> = retrieve(tripId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseWrapper>

    /** @see [retrieve] */
    fun retrieve(params: ReportProblemWithTripRetrieveParams): CompletableFuture<ResponseWrapper> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        tripId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseWrapper> =
        retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)

    /**
     * A view of [ReportProblemWithTripServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/report-problem-with-trip/{tripID}.json`,
         * but is otherwise the same as [ReportProblemWithTripServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(tripId: String): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(tripId, ReportProblemWithTripRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: ReportProblemWithTripRetrieveParams =
                ReportProblemWithTripRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(params.toBuilder().tripId(tripId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            params: ReportProblemWithTripRetrieveParams = ReportProblemWithTripRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(tripId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithTripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReportProblemWithTripRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            tripId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseWrapper>> =
            retrieve(tripId, ReportProblemWithTripRetrieveParams.none(), requestOptions)
    }
}
