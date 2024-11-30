// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class SearchForStopListParamsTest {

    @Test
    fun createSearchForStopListParams() {
        SearchForStopListParams.builder().input("input").maxCount(0L).build()
    }

    @Test
    fun getQueryParams() {
        val params = SearchForStopListParams.builder().input("input").maxCount(0L).build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        expected.put("maxCount", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SearchForStopListParams.builder().input("input").build()
        val expected = QueryParams.builder()
        expected.put("input", "input")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
