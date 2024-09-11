package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val body: String
) : OnebusawaySdkServiceException(headers, "Unexpected status code: ${statusCode}") {
    override fun statusCode(): Int = statusCode

    fun body() = body
}
