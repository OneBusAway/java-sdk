package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(422, headers, body, error)
