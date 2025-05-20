// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripRetrieveParamsTest {

    @Test
    fun create() {
        TripRetrieveParams.builder().tripId("tripID").build()
    }

    @Test
    fun getPathParam() {
        val params = TripRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
