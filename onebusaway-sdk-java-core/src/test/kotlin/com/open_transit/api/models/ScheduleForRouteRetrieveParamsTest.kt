// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScheduleForRouteRetrieveParamsTest {

    @Test
    fun createScheduleForRouteRetrieveParams() {
        ScheduleForRouteRetrieveParams.builder().routeId("routeID").date("date").build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ScheduleForRouteRetrieveParams.builder().routeId("routeID").date("date").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("date", listOf("date"))
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
