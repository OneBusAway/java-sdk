// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.blocking

import org.onebusaway.core.RequestOptions
import org.onebusaway.models.ReportProblemWithTripRetrieveParams
import org.onebusaway.models.ResponseWrapper

interface ReportProblemWithTripService {

    /** Submit a user-generated problem report for a particular trip. */
    @JvmOverloads
    fun retrieve(
        params: ReportProblemWithTripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseWrapper
}
