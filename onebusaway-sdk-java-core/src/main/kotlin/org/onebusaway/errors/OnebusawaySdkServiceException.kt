package org.onebusaway.errors

import org.onebusaway.core.http.Headers

abstract class OnebusawaySdkServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: OnebusawaySdkError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OnebusawaySdkException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): OnebusawaySdkError = error
}
