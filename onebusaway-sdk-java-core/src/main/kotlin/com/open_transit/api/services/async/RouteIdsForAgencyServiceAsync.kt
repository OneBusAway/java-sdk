// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.RouteIdsForAgencyListParams
import com.open_transit.api.models.RouteIdsForAgencyListResponse
import java.util.concurrent.CompletableFuture

interface RouteIdsForAgencyServiceAsync {

    /** Get route IDs for a specific agency */
    @JvmOverloads
    fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RouteIdsForAgencyListResponse>
}
