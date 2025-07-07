// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.shape.ShapeRetrieveParams
import org.onebusaway.models.shape.ShapeRetrieveResponse

interface ShapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    fun retrieve(shapeId: String): CompletableFuture<ShapeRetrieveResponse> =
        retrieve(shapeId, ShapeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        shapeId: String,
        params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShapeRetrieveResponse> =
        retrieve(params.toBuilder().shapeId(shapeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        shapeId: String,
        params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
    ): CompletableFuture<ShapeRetrieveResponse> = retrieve(shapeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShapeRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: ShapeRetrieveParams): CompletableFuture<ShapeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        shapeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShapeRetrieveResponse> =
        retrieve(shapeId, ShapeRetrieveParams.none(), requestOptions)

    /** A view of [ShapeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/shape/{shapeID}.json`, but is otherwise
         * the same as [ShapeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(shapeId: String): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>> =
            retrieve(shapeId, ShapeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>> =
            retrieve(params.toBuilder().shapeId(shapeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            params: ShapeRetrieveParams = ShapeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>> =
            retrieve(shapeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ShapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ShapeRetrieveParams
        ): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            shapeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShapeRetrieveResponse>> =
            retrieve(shapeId, ShapeRetrieveParams.none(), requestOptions)
    }
}
