package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

abstract class OnebusawaySdkServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OnebusawaySdkError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OnebusawaySdkException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OnebusawaySdkError = error
}
