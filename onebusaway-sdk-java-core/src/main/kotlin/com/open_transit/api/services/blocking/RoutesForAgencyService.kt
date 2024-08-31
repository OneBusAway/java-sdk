// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.RoutesForAgencyListParams
import com.open_transit.api.models.RoutesForAgencyListResponse

interface RoutesForAgencyService {

    /** Retrieve the list of all routes for a particular agency by id */
    @JvmOverloads
    fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForAgencyListResponse
}
