// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.searchforroute

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class SearchForRouteListParamsTest {

    @Test
    fun create() {
        SearchForRouteListParams.builder().input("input").maxCount(0L).build()
    }

    @Test
    fun queryParams() {
        val params = SearchForRouteListParams.builder().input("input").maxCount(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("input", "input").put("maxCount", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SearchForRouteListParams.builder().input("input").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("input", "input").build())
    }
}
