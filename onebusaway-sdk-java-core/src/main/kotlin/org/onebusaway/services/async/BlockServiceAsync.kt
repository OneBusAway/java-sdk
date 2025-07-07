// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.block.BlockRetrieveParams
import org.onebusaway.models.block.BlockRetrieveResponse

interface BlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details of a specific block by ID */
    fun retrieve(blockId: String): CompletableFuture<BlockRetrieveResponse> =
        retrieve(blockId, BlockRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        blockId: String,
        params: BlockRetrieveParams = BlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockRetrieveResponse> =
        retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        blockId: String,
        params: BlockRetrieveParams = BlockRetrieveParams.none(),
    ): CompletableFuture<BlockRetrieveResponse> = retrieve(blockId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: BlockRetrieveParams): CompletableFuture<BlockRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        blockId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlockRetrieveResponse> =
        retrieve(blockId, BlockRetrieveParams.none(), requestOptions)

    /** A view of [BlockServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/where/block/{blockID}.json`, but is otherwise
         * the same as [BlockServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(blockId: String): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>> =
            retrieve(blockId, BlockRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            params: BlockRetrieveParams = BlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>> =
            retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            params: BlockRetrieveParams = BlockRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>> =
            retrieve(blockId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BlockRetrieveParams
        ): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlockRetrieveResponse>> =
            retrieve(blockId, BlockRetrieveParams.none(), requestOptions)
    }
}
