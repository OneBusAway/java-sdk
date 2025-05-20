// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class RoutesForLocationListParamsTest {

    @Test
    fun create() {
        RoutesForLocationListParams.builder()
            .lat(0.0)
            .lon(0.0)
            .latSpan(0.0)
            .lonSpan(0.0)
            .query("query")
            .radius(0.0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoutesForLocationListParams.builder()
                .lat(0.0)
                .lon(0.0)
                .latSpan(0.0)
                .lonSpan(0.0)
                .query("query")
                .radius(0.0)
                .build()
        val expected = QueryParams.builder()
        expected.put("lat", "0.0")
        expected.put("lon", "0.0")
        expected.put("latSpan", "0.0")
        expected.put("lonSpan", "0.0")
        expected.put("query", "query")
        expected.put("radius", "0.0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoutesForLocationListParams.builder().lat(0.0).lon(0.0).build()
        val expected = QueryParams.builder()
        expected.put("lat", "0.0")
        expected.put("lon", "0.0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
