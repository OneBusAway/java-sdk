// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.delete
import com.github.tomakehurst.wiremock.client.WireMock.deleteRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import java.io.IOException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import com.open_transit.api.client.OnebusawaySdkClient
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.core.jsonMapper
import com.open_transit.api.core.JsonNull
import com.open_transit.api.core.JsonString
import com.open_transit.api.core.JsonValue
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.errors.OnebusawaySdkInvalidDataException
import com.open_transit.api.errors.OnebusawaySdkServiceException
import com.open_transit.api.errors.UnexpectedStatusCodeException
import com.open_transit.api.models.*

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
      client = OnebusawaySdkOkHttpClient.builder()
          .apiKey("My API Key")
          .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
          .build()
    }

    @Test
    fun currentTimesRetrieveWithAdditionalParams() {
      val additionalHeaders = mutableMapOf<String, List<String>>()

      additionalHeaders.put("x-test-header", listOf("abc1234"))

      val additionalQueryParams = mutableMapOf<String, List<String>>()

      additionalQueryParams.put("test_query_param", listOf("def567"))

      val params = CurrentTimeRetrieveParams.builder()
          .additionalHeaders(additionalHeaders)
          .additionalQueryParams(additionalQueryParams)
          .build()

      val apiResponse = CurrentTimeRetrieveResponse.builder().build()

      stubFor(get(anyUrl())
          .withHeader("x-test-header", equalTo("abc1234"))
          .withQueryParam("test_query_param", equalTo("def567"))
          .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse))))

      client.currentTime().retrieve(params)

      verify(getRequestedFor(anyUrl()))
    }
}
