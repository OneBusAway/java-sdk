// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListResponse
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArrivalAndDepartureServiceAsync

    /** arrival-and-departure-for-stop */
    fun retrieve(
        stopId: String,
        params: ArrivalAndDepartureRetrieveParams,
    ): CompletableFuture<ArrivalAndDepartureRetrieveResponse> =
        retrieve(stopId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        stopId: String,
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArrivalAndDepartureRetrieveResponse> =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ArrivalAndDepartureRetrieveParams
    ): CompletableFuture<ArrivalAndDepartureRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArrivalAndDepartureRetrieveResponse>

    /** arrivals-and-departures-for-stop */
    fun list(stopId: String): CompletableFuture<ArrivalAndDepartureListResponse> =
        list(stopId, ArrivalAndDepartureListParams.none())

    /** @see list */
    fun list(
        stopId: String,
        params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArrivalAndDepartureListResponse> =
        list(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see list */
    fun list(
        stopId: String,
        params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
    ): CompletableFuture<ArrivalAndDepartureListResponse> =
        list(stopId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ArrivalAndDepartureListResponse>

    /** @see list */
    fun list(
        params: ArrivalAndDepartureListParams
    ): CompletableFuture<ArrivalAndDepartureListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        stopId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArrivalAndDepartureListResponse> =
        list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)

    /**
     * A view of [ArrivalAndDepartureServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArrivalAndDepartureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrival-and-departure-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureServiceAsync.retrieve].
         */
        fun retrieve(
            stopId: String,
            params: ArrivalAndDepartureRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureRetrieveResponse>> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            stopId: String,
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureRetrieveResponse>> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ArrivalAndDepartureRetrieveParams
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrivals-and-departures-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureServiceAsync.list].
         */
        fun list(
            stopId: String
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>> =
            list(stopId, ArrivalAndDepartureListParams.none())

        /** @see list */
        fun list(
            stopId: String,
            params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>> =
            list(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see list */
        fun list(
            stopId: String,
            params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>> =
            list(stopId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ArrivalAndDepartureListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>>

        /** @see list */
        fun list(
            params: ArrivalAndDepartureListParams
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            stopId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArrivalAndDepartureListResponse>> =
            list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)
    }
}
