// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripRetrieveParams
import org.onebusaway.models.TripRetrieveResponse

interface TripService {

    /** Get details of a specific trip */
    @JvmOverloads
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TripRetrieveResponse
}
