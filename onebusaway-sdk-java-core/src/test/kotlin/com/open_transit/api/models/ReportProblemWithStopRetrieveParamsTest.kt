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
import com.open_transit.api.models.ReportProblemWithStopRetrieveParams

class ReportProblemWithStopRetrieveParamsTest {

    @Test
    fun createReportProblemWithStopRetrieveParams() {
      ReportProblemWithStopRetrieveParams.builder()
          .stopId("stopID")
          .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
          .userComment("userComment")
          .userLat(42.23)
          .userLocationAccuracy(42.23)
          .userLon(42.23)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ReportProblemWithStopRetrieveParams.builder()
          .stopId("stopID")
          .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
          .userComment("userComment")
          .userLat(42.23)
          .userLocationAccuracy(42.23)
          .userLon(42.23)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("code", listOf(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG.toString()))
      expected.put("userComment", listOf("userComment"))
      expected.put("userLat", listOf("42.23"))
      expected.put("userLocationAccuracy", listOf("42.23"))
      expected.put("userLon", listOf("42.23"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ReportProblemWithStopRetrieveParams.builder()
          .stopId("stopID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ReportProblemWithStopRetrieveParams.builder()
          .stopId("stopID")
          .build()
      assertThat(params).isNotNull
      // path param "stopId"
      assertThat(params.getPathParam(0)).isEqualTo("stopID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
