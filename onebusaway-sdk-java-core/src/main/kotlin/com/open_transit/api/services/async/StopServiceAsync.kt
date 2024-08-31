// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.StopRetrieveParams
import com.open_transit.api.models.StopRetrieveResponse
import java.util.concurrent.CompletableFuture

interface StopServiceAsync {

    /** Get details of a specific stop */
    @JvmOverloads
    fun retrieve(
        params: StopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<StopRetrieveResponse>
}
