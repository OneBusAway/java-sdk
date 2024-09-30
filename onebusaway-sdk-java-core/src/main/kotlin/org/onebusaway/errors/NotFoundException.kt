package org.onebusaway.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OnebusawaySdkError,
) : OnebusawaySdkServiceException(404, headers, body, error)
