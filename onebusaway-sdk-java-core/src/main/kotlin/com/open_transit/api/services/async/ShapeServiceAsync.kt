// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ShapeRetrieveParams
import com.open_transit.api.models.ShapeRetrieveResponse
import java.util.concurrent.CompletableFuture

interface ShapeServiceAsync {

    /** Retrieve a shape (the path traveled by a transit vehicle) by ID. */
    @JvmOverloads
    fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ShapeRetrieveResponse>
}