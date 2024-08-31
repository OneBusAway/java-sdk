// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.AgencyRetrieveParams
import com.open_transit.api.models.AgencyRetrieveResponse
import java.util.concurrent.CompletableFuture

interface AgencyServiceAsync {

    /** Retrieve information for a specific transit agency identified by its unique ID. */
    @JvmOverloads
    fun retrieve(
        params: AgencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AgencyRetrieveResponse>
}
