// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.TripsForLocationListParams
import com.open_transit.api.models.TripsForLocationListResponse

interface TripsForLocationService {

    /** Retrieve trips for a given location */
    @JvmOverloads
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripsForLocationListResponse
}
