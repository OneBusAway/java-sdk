// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.scheduleforroute.ScheduleForRouteRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ScheduleForRouteServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduleForRouteServiceAsync = client.scheduleForRoute()

        val scheduleForRouteFuture =
            scheduleForRouteServiceAsync.retrieve(
                ScheduleForRouteRetrieveParams.builder()
                    .routeId("1_100223")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val scheduleForRoute = scheduleForRouteFuture.get()
        scheduleForRoute.validate()
    }
}
