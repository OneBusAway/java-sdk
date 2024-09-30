// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.BlockRetrieveParams
import org.onebusaway.models.BlockRetrieveResponse

interface BlockServiceAsync {

    /** Get details of a specific block by ID */
    @JvmOverloads
    fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BlockRetrieveResponse>
}
