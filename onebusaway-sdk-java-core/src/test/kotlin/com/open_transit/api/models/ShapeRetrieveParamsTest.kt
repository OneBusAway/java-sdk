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
import com.open_transit.api.models.ShapeRetrieveParams

class ShapeRetrieveParamsTest {

    @Test
    fun createShapeRetrieveParams() {
      ShapeRetrieveParams.builder()
          .shapeId("shapeID")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = ShapeRetrieveParams.builder()
          .shapeId("shapeID")
          .build()
      assertThat(params).isNotNull
      // path param "shapeId"
      assertThat(params.getPathParam(0)).isEqualTo("shapeID")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
