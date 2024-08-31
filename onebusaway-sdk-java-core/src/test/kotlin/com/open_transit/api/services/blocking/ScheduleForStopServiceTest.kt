// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

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
