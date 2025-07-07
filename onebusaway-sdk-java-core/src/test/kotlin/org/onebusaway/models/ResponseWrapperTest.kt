// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.jsonMapper

internal class ResponseWrapperTest {

    @Test
    fun create() {
        val responseWrapper =
            ResponseWrapper.builder().code(0L).currentTime(0L).text("text").version(0L).build()

        assertThat(responseWrapper.code()).isEqualTo(0L)
        assertThat(responseWrapper.currentTime()).isEqualTo(0L)
        assertThat(responseWrapper.text()).isEqualTo("text")
        assertThat(responseWrapper.version()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseWrapper =
            ResponseWrapper.builder().code(0L).currentTime(0L).text("text").version(0L).build()

        val roundtrippedResponseWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseWrapper),
                jacksonTypeRef<ResponseWrapper>(),
            )

        assertThat(roundtrippedResponseWrapper).isEqualTo(responseWrapper)
    }
}
