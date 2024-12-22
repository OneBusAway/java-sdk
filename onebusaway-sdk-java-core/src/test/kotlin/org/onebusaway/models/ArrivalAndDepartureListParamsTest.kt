// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class ArrivalAndDepartureListParamsTest {

    @Test
    fun createArrivalAndDepartureListParams() {
        ArrivalAndDepartureListParams.builder()
            .stopId("1_75403")
            .minutesAfter(0L)
            .minutesBefore(0L)
            .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ArrivalAndDepartureListParams.builder()
                .stopId("1_75403")
                .minutesAfter(0L)
                .minutesBefore(0L)
                .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("minutesAfter", "0")
        expected.put("minutesBefore", "0")
        expected.put("time", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ArrivalAndDepartureListParams.builder().stopId("1_75403").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ArrivalAndDepartureListParams.builder().stopId("1_75403").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("1_75403")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
