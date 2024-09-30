// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.models.*

class ScheduleForRouteRetrieveParamsTest {

    @Test
    fun createScheduleForRouteRetrieveParams() {
        ScheduleForRouteRetrieveParams.builder()
            .routeId("routeID")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ScheduleForRouteRetrieveParams.builder()
                .routeId("routeID")
                .date(LocalDate.parse("2019-12-27"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("date", listOf("2019-12-27"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("routeID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
