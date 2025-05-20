// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class VehiclesForAgencyListParamsTest {

    @Test
    fun create() {
        VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
    }

    @Test
    fun queryParams() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
        val expected = QueryParams.builder()
        expected.put("time", "time")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = VehiclesForAgencyListParams.builder().agencyId("agencyID").build()
        assertThat(params).isNotNull
        // path param "agencyId"
        assertThat(params.getPathParam(0)).isEqualTo("agencyID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
