// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.TripDetailRetrieveParams
import com.open_transit.api.models.TripDetailRetrieveResponse
import java.util.concurrent.CompletableFuture

interface TripDetailServiceAsync {

    /** Retrieve Trip Details */
    @JvmOverloads
    fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TripDetailRetrieveResponse>
}
