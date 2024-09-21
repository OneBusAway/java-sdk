package com.open_transit.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(422, headers, body, error)
