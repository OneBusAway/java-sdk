package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 401

    fun error(): OnebusawaySdkError = error
}
