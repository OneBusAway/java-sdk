// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.JsonValue
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.checkRequired
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepare
import org.onebusaway.models.shape.ShapeRetrieveParams
import org.onebusaway.models.shape.ShapeRetrieveResponse

class ShapeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ShapeService {

    private val withRawResponse: ShapeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShapeService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ShapeRetrieveParams,
        requestOptions: RequestOptions,
    ): ShapeRetrieveResponse =
        // get /api/where/shape/{shapeID}.json
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShapeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ShapeRetrieveResponse> =
            jsonHandler<ShapeRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ShapeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShapeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shapeId", params.shapeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "where", "shape", "${params._pathParam(0)}.json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
