// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.trip

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripRetrieveParamsTest {

    @Test
    fun create() {
        TripRetrieveParams.builder().tripId("tripID").build()
    }

    @Test
    fun pathParams() {
        val params = TripRetrieveParams.builder().tripId("tripID").build()

        assertThat(params._pathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
