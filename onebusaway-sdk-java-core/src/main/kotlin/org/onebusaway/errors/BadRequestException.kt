package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(400, headers, body, error)
