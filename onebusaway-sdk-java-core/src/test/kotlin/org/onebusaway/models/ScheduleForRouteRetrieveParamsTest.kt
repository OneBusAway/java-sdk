// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class ScheduleForRouteRetrieveParamsTest {

    @Test
    fun createScheduleForRouteRetrieveParams() {
        ScheduleForRouteRetrieveParams.builder()
            .routeId("1_100223")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ScheduleForRouteRetrieveParams.builder()
                .routeId("1_100223")
                .date(LocalDate.parse("2019-12-27"))
                .build()
        val expected = QueryParams.builder()
        expected.put("date", "2019-12-27")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("1_100223").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ScheduleForRouteRetrieveParams.builder().routeId("1_100223").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("1_100223")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
