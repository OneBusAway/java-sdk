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
import com.open_transit.api.models.SearchForStopListParams

class SearchForStopListParamsTest {

    @Test
    fun createSearchForStopListParams() {
      SearchForStopListParams.builder()
          .input("input")
          .maxCount(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = SearchForStopListParams.builder()
          .input("input")
          .maxCount(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("input", listOf("input"))
      expected.put("maxCount", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = SearchForStopListParams.builder()
          .input("input")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("input", listOf("input"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
