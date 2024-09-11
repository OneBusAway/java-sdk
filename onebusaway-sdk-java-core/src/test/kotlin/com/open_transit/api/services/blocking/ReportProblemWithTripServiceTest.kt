// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.OnebusawaySdkClient
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.core.JsonNull
import com.open_transit.api.core.JsonString
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.http.BinaryResponseContent
import com.open_transit.api.services.blocking.ReportProblemWithTripService
import com.open_transit.api.models.*

@ExtendWith(TestServerExtension::class)
class ReportProblemWithTripServiceTest {

    @Test
    fun callRetrieve() {
      val client = OnebusawaySdkOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val reportProblemWithTripService = client.reportProblemWithTrip()
      val responseWrapper = reportProblemWithTripService.retrieve(ReportProblemWithTripRetrieveParams.builder()
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
          .build())
      println(responseWrapper)
      responseWrapper.validate()
    }
}
