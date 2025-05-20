// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class SearchForRouteListParamsTest {

    @Test
    fun create() {
        SearchForRouteListParams.builder().input("input").maxCount(0L).build()
    }

    @Test
    fun queryParams() {
        val params = SearchForRouteListParams.builder().input("input").maxCount(0L).build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        expected.put("maxCount", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SearchForRouteListParams.builder().input("input").build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
