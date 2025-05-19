// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutesForAgencyListParamsTest {

    @Test
    fun createRoutesForAgencyListParams() {
        RoutesForAgencyListParams.builder().agencyId("40").build()
    }

    @Test
    fun getPathParam() {
        val params = RoutesForAgencyListParams.builder().agencyId("40").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("40")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
