// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.RouteRetrieveParams
import org.onebusaway.models.RouteRetrieveResponse

interface RouteServiceAsync {

    /** Retrieve information for a specific route identified by its unique ID. */
    @JvmOverloads
    fun retrieve(
        params: RouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RouteRetrieveResponse>
}
