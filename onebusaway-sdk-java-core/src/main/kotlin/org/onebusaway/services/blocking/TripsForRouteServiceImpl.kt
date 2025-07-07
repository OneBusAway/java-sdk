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
import org.onebusaway.models.tripsforroute.TripsForRouteListParams
import org.onebusaway.models.tripsforroute.TripsForRouteListResponse

class TripsForRouteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TripsForRouteService {

    private val withRawResponse: TripsForRouteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TripsForRouteService.WithRawResponse = withRawResponse

    override fun list(
        params: TripsForRouteListParams,
        requestOptions: RequestOptions,
    ): TripsForRouteListResponse =
        // get /api/where/trips-for-route/{routeID}.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TripsForRouteService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<TripsForRouteListResponse> =
            jsonHandler<TripsForRouteListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TripsForRouteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripsForRouteListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("routeId", params.routeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "where",
                        "trips-for-route",
                        "${params._pathParam(0)}.json",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
