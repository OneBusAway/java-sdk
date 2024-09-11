// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.BlockRetrieveParams
import com.open_transit.api.models.BlockRetrieveResponse
import java.util.concurrent.CompletableFuture

interface BlockServiceAsync {

    /** Get details of a specific block by ID */
    @JvmOverloads
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BlockRetrieveResponse>
}
