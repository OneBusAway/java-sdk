// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.SearchForRouteListParams
import org.onebusaway.models.SearchForRouteListResponse

interface SearchForRouteServiceAsync {

    /** Search for a route based on its name. */
    @JvmOverloads
    fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SearchForRouteListResponse>
}
