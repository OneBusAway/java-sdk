// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.AgencyRetrieveParams
import org.onebusaway.models.AgencyRetrieveResponse

interface AgencyService {

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    @JvmOverloads
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgencyRetrieveResponse
}
