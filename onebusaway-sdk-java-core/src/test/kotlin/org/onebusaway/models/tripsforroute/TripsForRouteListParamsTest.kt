// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripsforroute

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class TripsForRouteListParamsTest {

    @Test
    fun create() {
        TripsForRouteListParams.builder()
            .routeId("routeID")
            .includeSchedule(true)
            .includeStatus(true)
            .time(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TripsForRouteListParams.builder()
                .routeId("routeID")
                .includeSchedule(true)
                .includeStatus(true)
                .time(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeSchedule", "true")
                    .put("includeStatus", "true")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripsForRouteListParams.builder().routeId("routeID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
