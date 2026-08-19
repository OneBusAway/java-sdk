// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StopRetrieveParamsTest {

    @Test
    fun create() {
        StopRetrieveParams.builder().stopId("stopID").build()
    }

    @Test
    fun pathParams() {
        val params = StopRetrieveParams.builder().stopId("stopID").build()

        assertThat(params._pathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
