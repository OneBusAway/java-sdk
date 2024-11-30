// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class ArrivalAndDepartureRetrieveParamsTest {

    @Test
    fun createArrivalAndDepartureRetrieveParams() {
        ArrivalAndDepartureRetrieveParams.builder()
            .stopId("stopID")
            .serviceDate(123L)
            .tripId("tripId")
            .stopSequence(123L)
            .time(123L)
            .vehicleId("vehicleId")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("stopID")
                .serviceDate(123L)
                .tripId("tripId")
                .stopSequence(123L)
                .time(123L)
                .vehicleId("vehicleId")
                .build()
        val expected = QueryParams.builder()
        expected.put("serviceDate", "123")
        expected.put("tripId", "tripId")
        expected.put("stopSequence", "123")
        expected.put("time", "123")
        expected.put("vehicleId", "vehicleId")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("stopID")
                .serviceDate(123L)
                .tripId("tripId")
                .build()
        val expected = QueryParams.builder()
        expected.put("serviceDate", "123")
        expected.put("tripId", "tripId")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ArrivalAndDepartureRetrieveParams.builder()
                .stopId("stopID")
                .serviceDate(123L)
                .tripId("tripId")
                .build()
        assertThat(params).isNotNull
        // path param "stopId"
        assertThat(params.getPathParam(0)).isEqualTo("stopID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
