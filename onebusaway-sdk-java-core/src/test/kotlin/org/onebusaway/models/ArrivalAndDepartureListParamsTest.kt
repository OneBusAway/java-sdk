// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class ArrivalAndDepartureListParamsTest {

    @Test
    fun createArrivalAndDepartureListParams() {
        ArrivalAndDepartureListParams.builder()
            .stopId("stopID")
            .minutesAfter(0L)
            .minutesBefore(0L)
            .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ArrivalAndDepartureListParams.builder()
                .stopId("stopID")
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
        val params = ArrivalAndDepartureListParams.builder().stopId("stopID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ArrivalAndDepartureListParams.builder().stopId("stopID").build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
