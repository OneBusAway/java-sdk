// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

class ReportProblemWithTripRetrieveParamsTest {

    @Test
    fun createReportProblemWithTripRetrieveParams() {
        ReportProblemWithTripRetrieveParams.builder()
            .tripId("tripID")
            .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
            .serviceDate(0L)
            .stopId("stopID")
            .userComment("userComment")
            .userLat(0.0)
            .userLocationAccuracy(0.0)
            .userLon(0.0)
            .userOnVehicle(true)
            .userVehicleNumber("userVehicleNumber")
            .vehicleId("vehicleID")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ReportProblemWithTripRetrieveParams.builder()
                .tripId("tripID")
                .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
                .serviceDate(0L)
                .stopId("stopID")
                .userComment("userComment")
                .userLat(0.0)
                .userLocationAccuracy(0.0)
                .userLon(0.0)
                .userOnVehicle(true)
                .userVehicleNumber("userVehicleNumber")
                .vehicleId("vehicleID")
                .build()
        val expected = QueryParams.builder()
        expected.put("code", ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME.toString())
        expected.put("serviceDate", "0")
        expected.put("stopID", "stopID")
        expected.put("userComment", "userComment")
        expected.put("userLat", "0.0")
        expected.put("userLocationAccuracy", "0.0")
        expected.put("userLon", "0.0")
        expected.put("userOnVehicle", "true")
        expected.put("userVehicleNumber", "userVehicleNumber")
        expected.put("vehicleID", "vehicleID")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ReportProblemWithTripRetrieveParams.builder().tripId("tripID").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ReportProblemWithTripRetrieveParams.builder().tripId("tripID").build()
        assertThat(params).isNotNull
        // path param "tripId"
        assertThat(params.getPathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
