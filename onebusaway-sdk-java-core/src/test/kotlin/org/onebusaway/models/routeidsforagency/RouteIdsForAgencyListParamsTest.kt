// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.routeidsforagency

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteIdsForAgencyListParamsTest {

    @Test
    fun create() {
        RouteIdsForAgencyListParams.builder().agencyId("agencyID").build()
    }

    @Test
    fun pathParams() {
        val params = RouteIdsForAgencyListParams.builder().agencyId("agencyID").build()

        assertThat(params._pathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
