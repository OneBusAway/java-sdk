// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.models.*

class RoutesForLocationListParamsTest {

    @Test
    fun createRoutesForLocationListParams() {
        RoutesForLocationListParams.builder()
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
            RoutesForLocationListParams.builder()
                .lat(42.23)
                .lon(42.23)
                .latSpan(42.23)
                .lonSpan(42.23)
                .query("query")
                .radius(42.23)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("lat", listOf("42.23"))
        expected.put("lon", listOf("42.23"))
        expected.put("latSpan", listOf("42.23"))
        expected.put("lonSpan", listOf("42.23"))
        expected.put("query", listOf("query"))
        expected.put("radius", listOf("42.23"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = RoutesForLocationListParams.builder().lat(42.23).lon(42.23).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("lat", listOf("42.23"))
        expected.put("lon", listOf("42.23"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
