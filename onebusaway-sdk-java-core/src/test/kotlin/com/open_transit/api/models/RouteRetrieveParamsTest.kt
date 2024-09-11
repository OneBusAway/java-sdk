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
import com.open_transit.api.models.RouteRetrieveParams

class RouteRetrieveParamsTest {

    @Test
    fun createRouteRetrieveParams() {
      RouteRetrieveParams.builder()
          .routeId("routeID")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = RouteRetrieveParams.builder()
          .routeId("routeID")
          .build()
      assertThat(params).isNotNull
      // path param "routeId"
      assertThat(params.getPathParam(0)).isEqualTo("routeID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
