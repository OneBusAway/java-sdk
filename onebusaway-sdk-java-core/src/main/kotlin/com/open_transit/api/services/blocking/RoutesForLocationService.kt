// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.RoutesForLocationListParams
import com.open_transit.api.models.RoutesForLocationListResponse

interface RoutesForLocationService {

    /** routes-for-location */
    @JvmOverloads
    fun list(
        params: RoutesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForLocationListResponse
}
