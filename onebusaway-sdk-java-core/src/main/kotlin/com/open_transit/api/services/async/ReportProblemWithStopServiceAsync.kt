// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.services.async

import com.open_transit.api.core.RequestOptions
import com.open_transit.api.models.ReportProblemWithStopRetrieveParams
import com.open_transit.api.models.ResponseWrapper
import java.util.concurrent.CompletableFuture

interface ReportProblemWithStopServiceAsync {

    /** Submit a user-generated problem report for a stop */
    @JvmOverloads
    fun retrieve(
        params: ReportProblemWithStopRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ResponseWrapper>
}
