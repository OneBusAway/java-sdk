// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.SearchForStopListParams
import com.open_transit.api.models.SearchForStopListResponse
import java.util.concurrent.CompletableFuture

interface SearchForStopServiceAsync {

    /** Search for a stop based on its name. */
    @JvmOverloads
    fun list(
        params: SearchForStopListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SearchForStopListResponse>
}
