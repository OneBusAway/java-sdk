// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalanddeparture

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams

internal class ArrivalAndDepartureListParamsTest {

    @Test
    fun create() {
        ArrivalAndDepartureListParams.builder()
            .stopId("1_75403")
            .minutesAfter(0L)
            .minutesBefore(0L)
            .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = ArrivalAndDepartureListParams.builder().stopId("1_75403").build()

        assertThat(params._pathParam(0)).isEqualTo("1_75403")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ArrivalAndDepartureListParams.builder()
                .stopId("1_75403")
                .minutesAfter(0L)
                .minutesBefore(0L)
                .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("minutesAfter", "0")
                    .put("minutesBefore", "0")
                    .put("time", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ArrivalAndDepartureListParams.builder().stopId("1_75403").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
