// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.block.BlockRetrieveParams
import org.onebusaway.models.block.BlockRetrieveResponse

interface BlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlockService

    /** Get details of a specific block by ID */
    fun retrieve(blockId: String): BlockRetrieveResponse =
        retrieve(blockId, BlockRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        blockId: String,
        params: BlockRetrieveParams = BlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockRetrieveResponse = retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        blockId: String,
        params: BlockRetrieveParams = BlockRetrieveParams.none(),
    ): BlockRetrieveResponse = retrieve(blockId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: BlockRetrieveParams): BlockRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(blockId: String, requestOptions: RequestOptions): BlockRetrieveResponse =
        retrieve(blockId, BlockRetrieveParams.none(), requestOptions)

    /** A view of [BlockService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/where/block/{blockID}.json`, but is otherwise
         * the same as [BlockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(blockId: String): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(blockId, BlockRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            params: BlockRetrieveParams = BlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            params: BlockRetrieveParams = BlockRetrieveParams.none(),
        ): HttpResponseFor<BlockRetrieveResponse> = retrieve(blockId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BlockRetrieveParams): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            blockId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockRetrieveResponse> =
            retrieve(blockId, BlockRetrieveParams.none(), requestOptions)
    }
}
