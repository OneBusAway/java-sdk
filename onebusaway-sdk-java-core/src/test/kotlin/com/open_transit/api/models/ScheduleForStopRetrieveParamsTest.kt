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
import com.open_transit.api.models.ScheduleForStopRetrieveParams

class ScheduleForStopRetrieveParamsTest {

    @Test
    fun createScheduleForStopRetrieveParams() {
      ScheduleForStopRetrieveParams.builder()
          .stopId("stopID")
          .date(LocalDate.parse("2019-12-27"))
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ScheduleForStopRetrieveParams.builder()
          .stopId("stopID")
          .date(LocalDate.parse("2019-12-27"))
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("date", listOf("2019-12-27"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ScheduleForStopRetrieveParams.builder()
          .stopId("stopID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ScheduleForStopRetrieveParams.builder()
          .stopId("stopID")
          .build()
      assertThat(params).isNotNull
      // path param "stopId"
      assertThat(params.getPathParam(0)).isEqualTo("stopID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
