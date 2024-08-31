// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SearchForRouteListParamsTest {

    @Test
    fun createSearchForRouteListParams() {
        SearchForRouteListParams.builder().input("input").maxCount(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = SearchForRouteListParams.builder().input("input").maxCount(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        expected.put("maxCount", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SearchForRouteListParams.builder().input("input").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("input", listOf("input"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
