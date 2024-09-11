// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.TripForVehicleRetrieveParams
import com.open_transit.api.models.TripForVehicleRetrieveResponse

interface TripForVehicleService {

    /** Retrieve trip for a specific vehicle */
    @JvmOverloads
    fun retrieve(
        params: TripForVehicleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripForVehicleRetrieveResponse
}
