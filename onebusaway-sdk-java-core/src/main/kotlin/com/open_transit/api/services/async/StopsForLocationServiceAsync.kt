// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.StopsForLocationListParams
import com.open_transit.api.models.StopsForLocationListResponse
import java.util.concurrent.CompletableFuture

interface StopsForLocationServiceAsync {

    /** stops-for-location */
    @JvmOverloads
    fun list(
        params: StopsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<StopsForLocationListResponse>
}
