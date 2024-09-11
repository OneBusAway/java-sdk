// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponseWrapperTest {

    @Test
    fun createResponseWrapper() {
        val responseWrapper =
            ResponseWrapper.builder()
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
