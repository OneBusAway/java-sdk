package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(403, headers, body, error)
