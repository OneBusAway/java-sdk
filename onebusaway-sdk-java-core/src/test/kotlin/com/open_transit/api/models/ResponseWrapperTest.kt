// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.open_transit.api.core.JsonNull
import com.open_transit.api.core.JsonString
import com.open_transit.api.core.JsonValue
import com.open_transit.api.models.ResponseWrapper

class ResponseWrapperTest {

    @Test
    fun createResponseWrapper() {
      val responseWrapper = ResponseWrapper.builder()
          .code(123L)
          .currentTime(123L)
          .text("text")
          .version(123L)
          .build()
      assertThat(responseWrapper).isNotNull
      assertThat(responseWrapper.code()).isEqualTo(123L)
      assertThat(responseWrapper.currentTime()).isEqualTo(123L)
      assertThat(responseWrapper.text()).isEqualTo("text")
      assertThat(responseWrapper.version()).isEqualTo(123L)
    }
}
