// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResponseWrapperTest {

    @Test
    fun createResponseWrapper() {
        val responseWrapper =
            ResponseWrapper.builder().code(0L).currentTime(0L).text("text").version(0L).build()
        assertThat(responseWrapper).isNotNull
        assertThat(responseWrapper.code()).isEqualTo(0L)
        assertThat(responseWrapper.currentTime()).isEqualTo(0L)
        assertThat(responseWrapper.text()).isEqualTo("text")
        assertThat(responseWrapper.version()).isEqualTo(0L)
    }
}
