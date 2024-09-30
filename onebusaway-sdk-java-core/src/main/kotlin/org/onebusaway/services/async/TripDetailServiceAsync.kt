// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.TripDetailRetrieveParams
import org.onebusaway.models.TripDetailRetrieveResponse

interface TripDetailServiceAsync {

    /** Retrieve Trip Details */
    @JvmOverloads
    fun retrieve(
        params: TripDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TripDetailRetrieveResponse>
}
