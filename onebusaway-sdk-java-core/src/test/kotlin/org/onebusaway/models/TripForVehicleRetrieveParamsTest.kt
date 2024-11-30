// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

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
        val expected = QueryParams.builder()
        expected.put("includeSchedule", "true")
        expected.put("includeStatus", "true")
        expected.put("includeTrip", "true")
        expected.put("time", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TripForVehicleRetrieveParams.builder().vehicleId("vehicleID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
