// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripsforlocation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class TripsForLocationListParamsTest {

    @Test
    fun create() {
        TripsForLocationListParams.builder()
            .latSpan(0.0f)
            .lonSpan(0.0f)
            .includeSchedule(true)
            .includeTrip(true)
            .lat(0.0f)
            .lon(0.0f)
            .time(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TripsForLocationListParams.builder()
                .latSpan(0.0f)
                .lonSpan(0.0f)
                .includeSchedule(true)
                .includeTrip(true)
                .lat(0.0f)
                .lon(0.0f)
                .time(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("latSpan", "0.0")
                    .put("lonSpan", "0.0")
                    .put("includeSchedule", "true")
                    .put("includeTrip", "true")
                    .put("lat", "0.0")
                    .put("lon", "0.0")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripsForLocationListParams.builder().latSpan(0.0f).lonSpan(0.0f).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("latSpan", "0.0").put("lonSpan", "0.0").build())
    }
}
