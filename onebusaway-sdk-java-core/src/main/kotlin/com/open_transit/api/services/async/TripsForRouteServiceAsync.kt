// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.TripsForRouteListParams
import com.open_transit.api.models.TripsForRouteListResponse
import java.util.concurrent.CompletableFuture

interface TripsForRouteServiceAsync {

    /** Search for active trips for a specific route. */
    @JvmOverloads
    fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TripsForRouteListResponse>
}
