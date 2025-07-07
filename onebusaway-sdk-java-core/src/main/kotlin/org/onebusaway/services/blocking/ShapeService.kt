// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.shape.ShapeRetrieveParams
import org.onebusaway.models.shape.ShapeRetrieveResponse

interface ShapeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShapeService

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    fun retrieve(shapeId: String): ShapeRetrieveResponse =
        retrieve(shapeId, ShapeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        shapeId: String,
        params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShapeRetrieveResponse = retrieve(params.toBuilder().shapeId(shapeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        shapeId: String,
        params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
    ): ShapeRetrieveResponse = retrieve(shapeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShapeRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: ShapeRetrieveParams): ShapeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(shapeId: String, requestOptions: RequestOptions): ShapeRetrieveResponse =
        retrieve(shapeId, ShapeRetrieveParams.none(), requestOptions)

    /** A view of [ShapeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShapeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/shape/{shapeID}.json`, but is otherwise
         * the same as [ShapeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(shapeId: String): HttpResponseFor<ShapeRetrieveResponse> =
            retrieve(shapeId, ShapeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShapeRetrieveResponse> =
            retrieve(params.toBuilder().shapeId(shapeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
        ): HttpResponseFor<ShapeRetrieveResponse> = retrieve(shapeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ShapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShapeRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ShapeRetrieveParams): HttpResponseFor<ShapeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShapeRetrieveResponse> =
            retrieve(shapeId, ShapeRetrieveParams.none(), requestOptions)
    }
}
