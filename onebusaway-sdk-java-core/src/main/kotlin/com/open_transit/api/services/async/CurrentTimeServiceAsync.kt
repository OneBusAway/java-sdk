// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.CurrentTimeRetrieveParams
import com.open_transit.api.models.CurrentTimeRetrieveResponse
import java.util.concurrent.CompletableFuture

interface CurrentTimeServiceAsync {

    /** current-time */
    @JvmOverloads
    fun retrieve(
        params: CurrentTimeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CurrentTimeRetrieveResponse>
}
