// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stopsforlocation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class StopsForLocationListParamsTest {

    @Test
    fun create() {
        StopsForLocationListParams.builder()
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
            StopsForLocationListParams.builder()
                .lat(0.0)
                .lon(0.0)
                .latSpan(0.0)
                .lonSpan(0.0)
                .query("query")
                .radius(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("lat", "0.0")
                    .put("lon", "0.0")
                    .put("latSpan", "0.0")
                    .put("lonSpan", "0.0")
                    .put("query", "query")
                    .put("radius", "0.0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StopsForLocationListParams.builder().lat(0.0).lon(0.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "0.0").put("lon", "0.0").build())
    }
}
