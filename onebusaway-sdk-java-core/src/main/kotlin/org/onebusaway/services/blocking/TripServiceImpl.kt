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
import org.onebusaway.models.trip.TripRetrieveParams
import org.onebusaway.models.trip.TripRetrieveResponse

class TripServiceImpl internal constructor(private val clientOptions: ClientOptions) : TripService {

    private val withRawResponse: TripService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TripService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions,
    ): TripRetrieveResponse =
        // get /api/where/trip/{tripID}.json
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TripService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<TripRetrieveResponse> =
            jsonHandler<TripRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tripId", params.tripId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "where", "trip", "${params._pathParam(0)}.json")
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
