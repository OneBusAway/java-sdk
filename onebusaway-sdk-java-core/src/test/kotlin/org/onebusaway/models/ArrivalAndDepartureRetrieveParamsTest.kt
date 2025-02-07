// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class ArrivalAndDepartureRetrieveParamsTest {

    @Test
    fun create() {
        ArrivalAndDepartureRetrieveParams.builder()
            .stopId("1_75403")
            .serviceDate(0L)
            .tripId("tripId")
            .stopSequence(0L)
            .time(0L)
            .vehicleId("vehicleId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .stopSequence(0L)
                .time(0L)
                .vehicleId("vehicleId")
                .build()
        val expected = QueryParams.builder()
        expected.put("serviceDate", "0")
        expected.put("tripId", "tripId")
        expected.put("stopSequence", "0")
        expected.put("time", "0")
        expected.put("vehicleId", "vehicleId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .build()
        val expected = QueryParams.builder()
        expected.put("serviceDate", "0")
        expected.put("tripId", "tripId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("1_75403")
                .serviceDate(0L)
                .tripId("tripId")
                .build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("1_75403")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
