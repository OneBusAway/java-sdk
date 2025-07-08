// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListResponse
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArrivalAndDepartureService

    /** arrival-and-departure-for-stop */
    fun retrieve(
        stopId: String,
        params: ArrivalAndDepartureRetrieveParams,
    ): ArrivalAndDepartureRetrieveResponse = retrieve(stopId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        stopId: String,
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureRetrieveResponse =
        retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: ArrivalAndDepartureRetrieveParams): ArrivalAndDepartureRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    fun list(stopId: String): ArrivalAndDepartureListResponse =
        list(stopId, ArrivalAndDepartureListParams.none())

    /** @see [list] */
    fun list(
        stopId: String,
        params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureListResponse =
        list(params.toBuilder().stopId(stopId).build(), requestOptions)

    /** @see [list] */
    fun list(
        stopId: String,
        params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
    ): ArrivalAndDepartureListResponse = list(stopId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalAndDepartureListResponse

    /** @see [list] */
    fun list(params: ArrivalAndDepartureListParams): ArrivalAndDepartureListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(stopId: String, requestOptions: RequestOptions): ArrivalAndDepartureListResponse =
        list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)

    /**
     * A view of [ArrivalAndDepartureService] that provides access to raw HTTP responses for each
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
        ): ArrivalAndDepartureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrival-and-departure-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ArrivalAndDepartureRetrieveParams,
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse> =
            retrieve(stopId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            stopId: String,
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse> =
            retrieve(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ArrivalAndDepartureRetrieveParams
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ArrivalAndDepartureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrivals-and-departures-for-stop/{stopID}.json`, but is otherwise the same as
         * [ArrivalAndDepartureService.list].
         */
        @MustBeClosed
        fun list(stopId: String): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(stopId, ArrivalAndDepartureListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            stopId: String,
            params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(params.toBuilder().stopId(stopId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            stopId: String,
            params: ArrivalAndDepartureListParams = ArrivalAndDepartureListParams.none(),
        ): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(stopId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ArrivalAndDepartureListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalAndDepartureListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ArrivalAndDepartureListParams
        ): HttpResponseFor<ArrivalAndDepartureListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            stopId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArrivalAndDepartureListResponse> =
            list(stopId, ArrivalAndDepartureListParams.none(), requestOptions)
    }
}
