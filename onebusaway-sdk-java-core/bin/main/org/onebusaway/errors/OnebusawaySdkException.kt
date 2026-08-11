package org.onebusaway.errors

open class OnebusawaySdkException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
