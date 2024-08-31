// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ArrivalAndDepartureListParams
import com.open_transit.api.models.ArrivalAndDepartureListResponse
import com.open_transit.api.models.ArrivalAndDepartureRetrieveParams
import com.open_transit.api.models.ArrivalAndDepartureRetrieveResponse

interface ArrivalAndDepartureService {

    /** arrival-and-departure-for-stop */
    @JvmOverloads
    fun retrieve(
        params: ArrivalAndDepartureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureRetrieveResponse

    /** arrivals-and-departures-for-stop */
    @JvmOverloads
    fun list(
        params: ArrivalAndDepartureListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ArrivalAndDepartureListResponse
}
