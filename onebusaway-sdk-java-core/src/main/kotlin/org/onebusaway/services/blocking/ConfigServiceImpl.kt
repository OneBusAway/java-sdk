// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.prepare
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.ConfigRetrieveParams
import org.onebusaway.models.ConfigRetrieveResponse

class ConfigServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ConfigService {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ConfigRetrieveResponse> =
        jsonHandler<ConfigRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** config */
    override fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions
    ): ConfigRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "where", "config.json")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
