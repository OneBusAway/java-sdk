// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.routesforagency

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutesForAgencyListParamsTest {

    @Test
    fun create() {
        RoutesForAgencyListParams.builder().agencyId("40").build()
    }

    @Test
    fun pathParams() {
        val params = RoutesForAgencyListParams.builder().agencyId("40").build()

        assertThat(params._pathParam(0)).isEqualTo("40")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
