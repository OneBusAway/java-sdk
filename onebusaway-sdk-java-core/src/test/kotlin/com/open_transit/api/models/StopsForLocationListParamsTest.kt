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
import com.open_transit.api.models.StopsForLocationListParams

class StopsForLocationListParamsTest {

    @Test
    fun createStopsForLocationListParams() {
      StopsForLocationListParams.builder()
          .lat(42.23)
          .lon(42.23)
          .latSpan(42.23)
          .lonSpan(42.23)
          .query("query")
          .radius(42.23)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = StopsForLocationListParams.builder()
          .lat(42.23)
          .lon(42.23)
          .latSpan(42.23)
          .lonSpan(42.23)
          .query("query")
          .radius(42.23)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("lat", listOf("42.23"))
      expected.put("lon", listOf("42.23"))
      expected.put("latSpan", listOf("42.23"))
      expected.put("lonSpan", listOf("42.23"))
      expected.put("query", listOf("query"))
      expected.put("radius", listOf("42.23"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = StopsForLocationListParams.builder()
          .lat(42.23)
          .lon(42.23)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("lat", listOf("42.23"))
      expected.put("lon", listOf("42.23"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
