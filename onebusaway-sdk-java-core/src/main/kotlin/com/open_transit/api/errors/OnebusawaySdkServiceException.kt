package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

abstract class OnebusawaySdkServiceException
@JvmOverloads
constructor(
    private val headers: ListMultimap<String, String>,
    message: String? = null,
    cause: Throwable? = null
) : OnebusawaySdkException(message, cause) {
    abstract fun statusCode(): Int

    fun headers(): ListMultimap<String, String> = headers
}