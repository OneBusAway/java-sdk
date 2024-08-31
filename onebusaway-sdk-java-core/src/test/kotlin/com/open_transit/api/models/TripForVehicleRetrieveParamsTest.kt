// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TripForVehicleRetrieveParamsTest {

    @Test
    fun createTripForVehicleRetrieveParams() {
        TripForVehicleRetrieveParams.builder()
            .vehicleId("vehicleID")
            .includeSchedule(true)
            .includeStatus(true)
            .includeTrip(true)
            .time(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TripForVehicleRetrieveParams.builder()
                .vehicleId("vehicleID")
                .includeSchedule(true)
                .includeStatus(true)
                .includeTrip(true)
                .time(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("includeSchedule", listOf("true"))
        expected.put("includeStatus", listOf("true"))
        expected.put("includeTrip", listOf("true"))
        expected.put("time", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TripForVehicleRetrieveParams.builder().vehicleId("vehicleID").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = TripForVehicleRetrieveParams.builder().vehicleId("vehicleID").build()
        assertThat(params).isNotNull
        // path param "vehicleId"
        assertThat(params.getPathParam(0)).isEqualTo("vehicleID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
