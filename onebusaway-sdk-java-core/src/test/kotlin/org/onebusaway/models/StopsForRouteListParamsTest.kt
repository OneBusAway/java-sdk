// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class StopsForRouteListParamsTest {

    @Test
    fun createStopsForRouteListParams() {
        StopsForRouteListParams.builder()
            .routeId("routeID")
            .includePolylines(true)
            .time("time")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            StopsForRouteListParams.builder()
                .routeId("routeID")
                .includePolylines(true)
                .time("time")
                .build()
        val expected = QueryParams.builder()
        expected.put("includePolylines", "true")
        expected.put("time", "time")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
