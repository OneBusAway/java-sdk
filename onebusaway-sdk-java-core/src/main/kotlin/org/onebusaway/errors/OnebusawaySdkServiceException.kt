// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.errors

import org.onebusaway.core.JsonValue
import org.onebusaway.core.http.Headers

abstract class OnebusawaySdkServiceException
protected constructor(message: String, cause: Throwable? = null) :
    OnebusawaySdkException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
