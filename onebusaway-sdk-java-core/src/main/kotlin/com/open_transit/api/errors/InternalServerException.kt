package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = statusCode

    fun error(): OnebusawaySdkError = error
}
