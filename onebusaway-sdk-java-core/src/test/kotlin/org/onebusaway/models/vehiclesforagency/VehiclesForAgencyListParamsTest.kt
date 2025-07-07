// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.vehiclesforagency

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class VehiclesForAgencyListParamsTest {

    @Test
    fun create() {
        VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
    }

    @Test
    fun pathParams() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()

        assertThat(params._pathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("time", "time").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
