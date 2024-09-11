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
import com.open_transit.api.models.ReportProblemWithTripRetrieveParams

class ReportProblemWithTripRetrieveParamsTest {

    @Test
    fun createReportProblemWithTripRetrieveParams() {
      ReportProblemWithTripRetrieveParams.builder()
          .tripId("tripID")
          .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
          .serviceDate(123L)
          .stopId("stopID")
          .userComment("userComment")
          .userLat(42.23)
          .userLocationAccuracy(42.23)
          .userLon(42.23)
          .userOnVehicle(true)
          .userVehicleNumber("userVehicleNumber")
          .vehicleId("vehicleID")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ReportProblemWithTripRetrieveParams.builder()
          .tripId("tripID")
          .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
          .serviceDate(123L)
          .stopId("stopID")
          .userComment("userComment")
          .userLat(42.23)
          .userLocationAccuracy(42.23)
          .userLon(42.23)
          .userOnVehicle(true)
          .userVehicleNumber("userVehicleNumber")
          .vehicleId("vehicleID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("code", listOf(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME.toString()))
      expected.put("serviceDate", listOf("123"))
      expected.put("stopID", listOf("stopID"))
      expected.put("userComment", listOf("userComment"))
      expected.put("userLat", listOf("42.23"))
      expected.put("userLocationAccuracy", listOf("42.23"))
      expected.put("userLon", listOf("42.23"))
      expected.put("userOnVehicle", listOf("true"))
      expected.put("userVehicleNumber", listOf("userVehicleNumber"))
      expected.put("vehicleID", listOf("vehicleID"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ReportProblemWithTripRetrieveParams.builder()
          .tripId("tripID")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ReportProblemWithTripRetrieveParams.builder()
          .tripId("tripID")
          .build()
      assertThat(params).isNotNull
      // path param "tripId"
      assertThat(params.getPathParam(0)).isEqualTo("tripID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
