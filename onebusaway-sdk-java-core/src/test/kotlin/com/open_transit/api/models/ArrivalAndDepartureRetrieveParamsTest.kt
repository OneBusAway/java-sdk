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
import com.open_transit.api.models.ArrivalAndDepartureRetrieveParams

class ArrivalAndDepartureRetrieveParamsTest {

    @Test
    fun createArrivalAndDepartureRetrieveParams() {
      ArrivalAndDepartureRetrieveParams.builder()
          .stopId("stopID")
          .serviceDate(123L)
          .tripId("tripId")
          .stopSequence(123L)
          .time(123L)
          .vehicleId("vehicleId")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ArrivalAndDepartureRetrieveParams.builder()
          .stopId("stopID")
          .serviceDate(123L)
          .tripId("tripId")
          .stopSequence(123L)
          .time(123L)
          .vehicleId("vehicleId")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("serviceDate", listOf("123"))
      expected.put("tripId", listOf("tripId"))
      expected.put("stopSequence", listOf("123"))
      expected.put("time", listOf("123"))
      expected.put("vehicleId", listOf("vehicleId"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ArrivalAndDepartureRetrieveParams.builder()
          .stopId("stopID")
          .serviceDate(123L)
          .tripId("tripId")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("serviceDate", listOf("123"))
      expected.put("tripId", listOf("tripId"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ArrivalAndDepartureRetrieveParams.builder()
          .stopId("stopID")
          .serviceDate(123L)
          .tripId("tripId")
          .build()
      assertThat(params).isNotNull
      // path param "stopId"
      assertThat(params.getPathParam(0)).isEqualTo("stopID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
