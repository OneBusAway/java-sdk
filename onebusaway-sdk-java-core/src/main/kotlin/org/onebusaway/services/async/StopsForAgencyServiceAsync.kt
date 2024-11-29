// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.onebusaway.services.async

import java.util.concurrent.CompletableFuture
import org.onebusaway.core.RequestOptions
import org.onebusaway.models.StopsForAgencyListParams
import org.onebusaway.models.StopsForAgencyListResponse

interface StopsForAgencyServiceAsync {

    /** Get stops for a specific agency */
    @JvmOverloads
    fun list(
        params: StopsForAgencyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<StopsForAgencyListResponse>
}
