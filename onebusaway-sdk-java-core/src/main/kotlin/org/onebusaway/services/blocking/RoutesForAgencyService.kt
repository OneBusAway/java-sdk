// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RoutesForAgencyListParams
import org.onebusaway.models.RoutesForAgencyListResponse

interface RoutesForAgencyService {

    /** Retrieve the list of all routes for a particular agency by id */
    @JvmOverloads
    fun list(
        params: RoutesForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RoutesForAgencyListResponse
}
