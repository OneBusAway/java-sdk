// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripsForRouteListParamsTest {

    @Test
    fun createTripsForRouteListParams() {
        TripsForRouteListParams.builder()
            .routeId("routeID")
            .includeSchedule(true)
            .includeStatus(true)
            .time(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TripsForRouteListParams.builder()
                .routeId("routeID")
                .includeSchedule(true)
                .includeStatus(true)
                .time(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("includeSchedule", listOf("true"))
        expected.put("includeStatus", listOf("true"))
        expected.put("time", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
