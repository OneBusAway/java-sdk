// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ConfigRetrieveParams
import com.open_transit.api.models.ConfigRetrieveResponse
import java.util.concurrent.CompletableFuture

interface ConfigServiceAsync {

    /** config */
    @JvmOverloads
    fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ConfigRetrieveResponse>
}
