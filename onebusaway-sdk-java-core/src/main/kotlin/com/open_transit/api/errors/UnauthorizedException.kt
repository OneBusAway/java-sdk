package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(401, headers, body, error)
