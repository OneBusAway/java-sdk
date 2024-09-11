// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.blocking

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.AgenciesWithCoverageListParams
import com.open_transit.api.models.AgenciesWithCoverageListResponse

interface AgenciesWithCoverageService {

    /**
     * Returns a list of all transit agencies currently supported by OneBusAway along with the
     * center of their coverage area.
     */
    @JvmOverloads
    fun list(
        params: AgenciesWithCoverageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgenciesWithCoverageListResponse
}
