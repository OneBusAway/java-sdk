// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RouteIdsForAgencyListParams
import org.onebusaway.models.RouteIdsForAgencyListResponse

interface RouteIdsForAgencyService {

    /** Get route IDs for a specific agency */
    @JvmOverloads
    fun list(
        params: RouteIdsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteIdsForAgencyListResponse
}
