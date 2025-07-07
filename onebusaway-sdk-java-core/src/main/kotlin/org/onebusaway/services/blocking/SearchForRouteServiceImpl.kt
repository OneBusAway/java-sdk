// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.JsonValue
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.handlers.errorHandler
import org.onebusaway.core.handlers.jsonHandler
import org.onebusaway.core.handlers.withErrorHandler
import org.onebusaway.core.http.HttpMethod
import org.onebusaway.core.http.HttpRequest
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.core.http.parseable
import org.onebusaway.core.prepare
import org.onebusaway.models.searchforroute.SearchForRouteListParams
import org.onebusaway.models.searchforroute.SearchForRouteListResponse

class SearchForRouteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchForRouteService {

    private val withRawResponse: SearchForRouteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SearchForRouteService.WithRawResponse = withRawResponse

    override fun list(
        params: SearchForRouteListParams,
        requestOptions: RequestOptions,
    ): SearchForRouteListResponse =
        // get /api/where/search/route.json
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchForRouteService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<SearchForRouteListResponse> =
            jsonHandler<SearchForRouteListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: SearchForRouteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SearchForRouteListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "where", "search", "route.json")
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
