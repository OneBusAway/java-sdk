// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.scheduleforstop

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ScheduleForStopRetrieveParamsTest {

    @Test
    fun create() {
        ScheduleForStopRetrieveParams.builder()
            .stopId("stopID")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = ScheduleForStopRetrieveParams.builder().stopId("stopID").build()

        assertThat(params._pathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ScheduleForStopRetrieveParams.builder()
                .stopId("stopID")
                .date(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("date", "2019-12-27").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScheduleForStopRetrieveParams.builder().stopId("stopID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
