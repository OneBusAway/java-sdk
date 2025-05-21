// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ScheduleForRouteServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForRouteService = client.scheduleForRoute()

        val scheduleForRoute =
            scheduleForRouteService.retrieve(
                ScheduleForRouteRetrieveParams.builder()
                    .routeId("1_100223")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        scheduleForRoute.validate()
    }
}
