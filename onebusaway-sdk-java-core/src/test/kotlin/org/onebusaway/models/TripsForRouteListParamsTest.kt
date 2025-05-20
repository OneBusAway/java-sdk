// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class TripsForRouteListParamsTest {

    @Test
    fun create() {
        TripsForRouteListParams.builder()
            .routeId("routeID")
            .includeSchedule(true)
            .includeStatus(true)
            .time(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TripsForRouteListParams.builder()
                .routeId("routeID")
                .includeSchedule(true)
                .includeStatus(true)
                .time(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("includeSchedule", "true")
        expected.put("includeStatus", "true")
        expected.put("time", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
