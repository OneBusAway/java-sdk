package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
        headers: ListMultimap<String, String>,
        private val error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 422
    fun error(): OnebusawaySdkError = error
}
