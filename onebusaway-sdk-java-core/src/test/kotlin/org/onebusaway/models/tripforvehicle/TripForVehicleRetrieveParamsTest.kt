// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripforvehicle

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class TripForVehicleRetrieveParamsTest {

    @Test
    fun create() {
        TripForVehicleRetrieveParams.builder()
            .vehicleId("vehicleID")
            .includeSchedule(true)
            .includeStatus(true)
            .includeTrip(true)
            .time(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TripForVehicleRetrieveParams.builder().vehicleId("vehicleID").build()

        assertThat(params._pathParam(0)).isEqualTo("vehicleID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TripForVehicleRetrieveParams.builder()
                .vehicleId("vehicleID")
                .includeSchedule(true)
                .includeStatus(true)
                .includeTrip(true)
                .time(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeSchedule", "true")
                    .put("includeStatus", "true")
                    .put("includeTrip", "true")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripForVehicleRetrieveParams.builder().vehicleId("vehicleID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
