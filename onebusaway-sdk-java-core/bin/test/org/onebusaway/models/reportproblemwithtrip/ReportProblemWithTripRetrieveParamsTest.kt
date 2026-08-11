// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.reportproblemwithtrip

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ReportProblemWithTripRetrieveParamsTest {

    @Test
    fun create() {
        ReportProblemWithTripRetrieveParams.builder()
            .tripId("tripID")
            .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
            .serviceDate(0L)
            .stopId("stopID")
            .userComment("userComment")
            .userLat(0.0f)
            .userLocationAccuracy(0.0f)
            .userLon(0.0f)
            .userOnVehicle(true)
            .userVehicleNumber("userVehicleNumber")
            .vehicleId("vehicleID")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ReportProblemWithTripRetrieveParams.builder().tripId("tripID").build()

        assertThat(params._pathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReportProblemWithTripRetrieveParams.builder()
                .tripId("tripID")
                .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
                .serviceDate(0L)
                .stopId("stopID")
                .userComment("userComment")
                .userLat(0.0f)
                .userLocationAccuracy(0.0f)
                .userLon(0.0f)
                .userOnVehicle(true)
                .userVehicleNumber("userVehicleNumber")
                .vehicleId("vehicleID")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("code", "vehicle_never_came")
                    .put("serviceDate", "0")
                    .put("stopID", "stopID")
                    .put("userComment", "userComment")
                    .put("userLat", "0.0")
                    .put("userLocationAccuracy", "0.0")
                    .put("userLon", "0.0")
                    .put("userOnVehicle", "true")
                    .put("userVehicleNumber", "userVehicleNumber")
                    .put("vehicleID", "vehicleID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportProblemWithTripRetrieveParams.builder().tripId("tripID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
