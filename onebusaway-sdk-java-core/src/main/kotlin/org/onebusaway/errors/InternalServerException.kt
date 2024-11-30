package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(statusCode, headers, body, error)
