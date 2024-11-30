package org.onebusaway.errors

import org.onebusaway.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(403, headers, body, error)
