// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stopsforroute

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class StopsForRouteListParamsTest {

    @Test
    fun create() {
        StopsForRouteListParams.builder()
            .routeId("routeID")
            .includePolylines(true)
            .time("time")
            .build()
    }

    @Test
    fun pathParams() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StopsForRouteListParams.builder()
                .routeId("routeID")
                .includePolylines(true)
                .time("time")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("includePolylines", "true").put("time", "time").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StopsForRouteListParams.builder().routeId("routeID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
