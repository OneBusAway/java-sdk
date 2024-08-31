// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ScheduleForStopRetrieveParams
import com.open_transit.api.models.ScheduleForStopRetrieveResponse

interface ScheduleForStopService {

    /** Get schedule for a specific stop */
    @JvmOverloads
    fun retrieve(
        params: ScheduleForStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScheduleForStopRetrieveResponse
}
