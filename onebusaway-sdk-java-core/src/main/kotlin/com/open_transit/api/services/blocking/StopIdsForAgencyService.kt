// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.StopIdsForAgencyListParams
import com.open_transit.api.models.StopIdsForAgencyListResponse

interface StopIdsForAgencyService {

    /** Get stop IDs for a specific agency */
    @JvmOverloads
    fun list(
        params: StopIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StopIdsForAgencyListResponse
}
