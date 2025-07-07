// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.scheduleforstop.ScheduleForStopRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ScheduleForStopServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForStopService = client.scheduleForStop()

        val scheduleForStop =
            scheduleForStopService.retrieve(
                ScheduleForStopRetrieveParams.builder()
                    .stopId("stopID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        scheduleForStop.validate()
    }
}
