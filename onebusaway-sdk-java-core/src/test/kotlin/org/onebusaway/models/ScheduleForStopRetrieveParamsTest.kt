// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class ScheduleForStopRetrieveParamsTest {

    @Test
    fun create() {
        ScheduleForStopRetrieveParams.builder()
            .stopId("stopID")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScheduleForStopRetrieveParams.builder()
                .stopId("stopID")
                .date(LocalDate.parse("2019-12-27"))
                .build()
        val expected = QueryParams.builder()
        expected.put("date", "2019-12-27")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScheduleForStopRetrieveParams.builder().stopId("stopID").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ScheduleForStopRetrieveParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
