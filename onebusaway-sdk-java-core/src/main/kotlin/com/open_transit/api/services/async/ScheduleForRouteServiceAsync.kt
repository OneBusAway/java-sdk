// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ScheduleForRouteRetrieveParams
import com.open_transit.api.models.ScheduleForRouteRetrieveResponse
import java.util.concurrent.CompletableFuture

interface ScheduleForRouteServiceAsync {

    /** Retrieve the full schedule for a route on a particular day */
    @JvmOverloads
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ScheduleForRouteRetrieveResponse>
}
