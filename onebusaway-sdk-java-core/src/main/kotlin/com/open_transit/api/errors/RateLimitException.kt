package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(429, headers, body, error)
