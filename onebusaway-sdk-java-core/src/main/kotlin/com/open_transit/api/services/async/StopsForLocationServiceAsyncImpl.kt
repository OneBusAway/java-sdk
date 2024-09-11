// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.open_transit.api.core.Enum
import com.open_transit.api.core.NoAutoDetect
import com.open_transit.api.errors.OnebusawaySdkInvalidDataException
import com.open_transit.api.models.StopsForLocationListParams
import com.open_transit.api.models.StopsForLocationListResponse
import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.core.http.BinaryResponseContent
import com.open_transit.api.core.JsonField
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.services.emptyHandler
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.json
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.multipartFormData
import com.open_transit.api.services.stringHandler
import com.open_transit.api.services.binaryHandler
import com.open_transit.api.services.withErrorHandler

class StopsForLocationServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : StopsForLocationServiceAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<StopsForLocationListResponse> =
    jsonHandler<StopsForLocationListResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** stops-for-location */
    override fun list(params: StopsForLocationListParams, requestOptions: RequestOptions): CompletableFuture<StopsForLocationListResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("api", "where", "stops-for-location.json")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
