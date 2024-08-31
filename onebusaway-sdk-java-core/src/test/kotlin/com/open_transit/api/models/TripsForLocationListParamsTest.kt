// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripsForLocationListParamsTest {

    @Test
    fun createTripsForLocationListParams() {
        TripsForLocationListParams.builder()
            .lat(42.23)
            .latSpan(42.23)
            .lon(42.23)
            .lonSpan(42.23)
            .includeSchedule(true)
            .includeTrip(true)
            .time(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TripsForLocationListParams.builder()
                .lat(42.23)
                .latSpan(42.23)
                .lon(42.23)
                .lonSpan(42.23)
                .includeSchedule(true)
                .includeTrip(true)
                .time(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("lat", listOf("42.23"))
        expected.put("latSpan", listOf("42.23"))
        expected.put("lon", listOf("42.23"))
        expected.put("lonSpan", listOf("42.23"))
        expected.put("includeSchedule", listOf("true"))
        expected.put("includeTrip", listOf("true"))
        expected.put("time", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            TripsForLocationListParams.builder()
                .lat(42.23)
                .latSpan(42.23)
                .lon(42.23)
                .lonSpan(42.23)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("lat", listOf("42.23"))
        expected.put("latSpan", listOf("42.23"))
        expected.put("lon", listOf("42.23"))
        expected.put("lonSpan", listOf("42.23"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
