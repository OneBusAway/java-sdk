// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ScheduleForRouteRetrieveParams
import org.onebusaway.models.ScheduleForRouteRetrieveResponse

interface ScheduleForRouteServiceAsync {

    /** Retrieve the full schedule for a route on a particular day */
    @JvmOverloads
    fun retrieve(
        params: ScheduleForRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ScheduleForRouteRetrieveResponse>
}
