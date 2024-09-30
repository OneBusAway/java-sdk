// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripsForLocationListParams
import org.onebusaway.models.TripsForLocationListResponse

interface TripsForLocationServiceAsync {

    /** Retrieve trips for a given location */
    @JvmOverloads
    fun list(
        params: TripsForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TripsForLocationListResponse>
}
