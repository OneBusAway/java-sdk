// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalsanddeparturesforlocation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ArrivalsAndDeparturesForLocationListParamsTest {

    @Test
    fun create() {
        ArrivalsAndDeparturesForLocationListParams.builder()
            .lat(0.0)
            .lon(0.0)
            .emptyReturnsNotFound(true)
            .latSpan(0.0)
            .lonSpan(0.0)
            .maxCount(1000L)
            .minutesAfter(0L)
            .minutesBefore(0L)
            .radius(0.0)
            .routeType("routeType")
            .time(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ArrivalsAndDeparturesForLocationListParams.builder()
                .lat(0.0)
                .lon(0.0)
                .emptyReturnsNotFound(true)
                .latSpan(0.0)
                .lonSpan(0.0)
                .maxCount(1000L)
                .minutesAfter(0L)
                .minutesBefore(0L)
                .radius(0.0)
                .routeType("routeType")
                .time(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("lat", "0.0")
                    .put("lon", "0.0")
                    .put("emptyReturnsNotFound", "true")
                    .put("latSpan", "0.0")
                    .put("lonSpan", "0.0")
                    .put("maxCount", "1000")
                    .put("minutesAfter", "0")
                    .put("minutesBefore", "0")
                    .put("radius", "0.0")
                    .put("routeType", "routeType")
                    .put("time", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ArrivalsAndDeparturesForLocationListParams.builder().lat(0.0).lon(0.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "0.0").put("lon", "0.0").build())
    }
}
