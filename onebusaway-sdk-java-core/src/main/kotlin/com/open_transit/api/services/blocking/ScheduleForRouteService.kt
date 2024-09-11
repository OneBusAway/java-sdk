// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ScheduleForRouteRetrieveParams
import com.open_transit.api.models.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteService {

    /** Retrieve the full schedule for a route on a particular day */
    @JvmOverloads
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleForRouteRetrieveResponse
}
