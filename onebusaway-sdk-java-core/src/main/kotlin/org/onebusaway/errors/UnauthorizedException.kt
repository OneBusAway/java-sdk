package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(401, headers, body, error)
