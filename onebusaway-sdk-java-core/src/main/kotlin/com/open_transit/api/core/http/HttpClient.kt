package com.open_transit.api.core.http

import java.lang.AutoCloseable
import java.util.concurrent.CompletableFuture
import com.open_transit.api.core.RequestOptions

interface HttpClient : AutoCloseable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
