// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class TripDetailRetrieveParamsTest {

    @Test
    fun create() {
        TripDetailRetrieveParams.builder()
            .tripId("tripID")
            .includeSchedule(true)
            .includeStatus(true)
            .includeTrip(true)
            .serviceDate(0L)
            .time(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TripDetailRetrieveParams.builder()
                .tripId("tripID")
                .includeSchedule(true)
                .includeStatus(true)
                .includeTrip(true)
                .serviceDate(0L)
                .time(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("includeSchedule", "true")
        expected.put("includeStatus", "true")
        expected.put("includeTrip", "true")
        expected.put("serviceDate", "0")
        expected.put("time", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripDetailRetrieveParams.builder().tripId("tripID").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = TripDetailRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
