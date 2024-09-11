// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.models.BlockRetrieveParams
import com.open_transit.api.models.BlockRetrieveResponse
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.withErrorHandler

class BlockServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BlockService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<BlockRetrieveResponse> =
        jsonHandler<BlockRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details of a specific block by ID */
    override fun retrieve(
        params: BlockRetrieveParams,
        requestOptions: RequestOptions
    ): BlockRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "block", "{blockID}.json")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
