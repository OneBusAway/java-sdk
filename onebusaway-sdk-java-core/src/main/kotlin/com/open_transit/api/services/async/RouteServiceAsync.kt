// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.RouteRetrieveParams
import com.open_transit.api.models.RouteRetrieveResponse
import java.util.concurrent.CompletableFuture

interface RouteServiceAsync {

    /** Retrieve information for a specific route identified by its unique ID. */
    @JvmOverloads
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RouteRetrieveResponse>
}
