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
import com.open_transit.api.models.ArrivalAndDepartureListParams

class ArrivalAndDepartureListParamsTest {

    @Test
    fun createArrivalAndDepartureListParams() {
      ArrivalAndDepartureListParams.builder()
          .stopId("stopID")
          .minutesAfter(123L)
          .minutesBefore(123L)
          .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ArrivalAndDepartureListParams.builder()
          .stopId("stopID")
          .minutesAfter(123L)
          .minutesBefore(123L)
          .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("minutesAfter", listOf("123"))
      expected.put("minutesBefore", listOf("123"))
      expected.put("time", listOf("2019-12-27T18:11:19.117Z"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ArrivalAndDepartureListParams.builder()
          .stopId("stopID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ArrivalAndDepartureListParams.builder()
          .stopId("stopID")
          .build()
      assertThat(params).isNotNull
      // path param "stopId"
      assertThat(params.getPathParam(0)).isEqualTo("stopID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
