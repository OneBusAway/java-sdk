// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureListParams
import org.onebusaway.models.arrivalanddeparture.ArrivalAndDepartureRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ArrivalAndDepartureServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureService = client.arrivalAndDeparture()

        val arrivalAndDeparture =
            arrivalAndDepartureService.retrieve(
                ArrivalAndDepartureRetrieveParams.builder()
                    .stopId("1_75403")
                    .serviceDate(0L)
                    .tripId("tripId")
                    .stopSequence(0L)
                    .time(0L)
                    .vehicleId("vehicleId")
                    .build()
            )

        arrivalAndDeparture.validate()
    }

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalAndDepartureService = client.arrivalAndDeparture()

        val arrivalAndDepartures =
            arrivalAndDepartureService.list(
                ArrivalAndDepartureListParams.builder()
                    .stopId("1_75403")
                    .minutesAfter(0L)
                    .minutesBefore(0L)
                    .time(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        arrivalAndDepartures.validate()
    }
}
