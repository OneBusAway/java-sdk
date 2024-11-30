package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(429, headers, body, error)
