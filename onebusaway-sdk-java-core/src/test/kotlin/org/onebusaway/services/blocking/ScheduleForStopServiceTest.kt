// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

@ExtendWith(TestServerExtension::class)
class ScheduleForStopServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForStopService = client.scheduleForStop()
        val scheduleForStopRetrieveResponse =
            scheduleForStopService.retrieve(
                ScheduleForStopRetrieveParams.builder()
                    .stopId("stopID")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )
        println(scheduleForStopRetrieveResponse)
    }
}
