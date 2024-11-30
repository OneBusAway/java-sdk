package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(404, headers, body, error)
