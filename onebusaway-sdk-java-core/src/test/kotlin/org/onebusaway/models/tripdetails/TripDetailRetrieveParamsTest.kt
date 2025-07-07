// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripdetails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class TripDetailRetrieveParamsTest {

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
    fun pathParams() {
        val params = TripDetailRetrieveParams.builder().tripId("tripID").build()

        assertThat(params._pathParam(0)).isEqualTo("tripID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeSchedule", "true")
                    .put("includeStatus", "true")
                    .put("includeTrip", "true")
                    .put("serviceDate", "0")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripDetailRetrieveParams.builder().tripId("tripID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
