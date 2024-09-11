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
import com.open_transit.api.services.blocking.ReportProblemWithStopService
import com.open_transit.api.models.*

@ExtendWith(TestServerExtension::class)
class ReportProblemWithStopServiceTest {

    @Test
    fun callRetrieve() {
      val client = OnebusawaySdkOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val reportProblemWithStopService = client.reportProblemWithStop()
      val responseWrapper = reportProblemWithStopService.retrieve(ReportProblemWithStopRetrieveParams.builder()
          .stopId("stopID")
          .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
          .userComment("userComment")
          .userLat(42.23)
          .userLocationAccuracy(42.23)
          .userLon(42.23)
          .build())
      println(responseWrapper)
      responseWrapper.validate()
    }
}
