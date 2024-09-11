// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.open_transit.api.core.ContentTypes
import com.open_transit.api.core.JsonNull
import com.open_transit.api.core.JsonString
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.MultipartFormValue
import com.open_transit.api.models.*
import com.open_transit.api.models.StopsForRouteListParams

class StopsForRouteListParamsTest {

    @Test
    fun createStopsForRouteListParams() {
      StopsForRouteListParams.builder()
          .routeId("routeID")
          .includePolylines(true)
          .time("time")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = StopsForRouteListParams.builder()
          .routeId("routeID")
          .includePolylines(true)
          .time("time")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("includePolylines", listOf("true"))
      expected.put("time", listOf("time"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = StopsForRouteListParams.builder()
          .routeId("routeID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = StopsForRouteListParams.builder()
          .routeId("routeID")
          .build()
      assertThat(params).isNotNull
      // path param "routeId"
      assertThat(params.getPathParam(0)).isEqualTo("routeID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
