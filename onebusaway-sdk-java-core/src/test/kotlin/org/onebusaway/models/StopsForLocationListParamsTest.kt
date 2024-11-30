// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class StopsForLocationListParamsTest {

    @Test
    fun createStopsForLocationListParams() {
        StopsForLocationListParams.builder()
            .lat(42.23)
            .lon(42.23)
            .latSpan(42.23)
            .lonSpan(42.23)
            .query("query")
            .radius(42.23)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            StopsForLocationListParams.builder()
                .lat(42.23)
                .lon(42.23)
                .latSpan(42.23)
                .lonSpan(42.23)
                .query("query")
                .radius(42.23)
                .build()
        val expected = QueryParams.builder()
        expected.put("lat", "42.23")
        expected.put("lon", "42.23")
        expected.put("latSpan", "42.23")
        expected.put("lonSpan", "42.23")
        expected.put("query", "query")
        expected.put("radius", "42.23")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StopsForLocationListParams.builder().lat(42.23).lon(42.23).build()
        val expected = QueryParams.builder()
        expected.put("lat", "42.23")
        expected.put("lon", "42.23")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
