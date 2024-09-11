package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
        headers: ListMultimap<String, String>,
        private val error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429
    fun error(): OnebusawaySdkError = error
}
