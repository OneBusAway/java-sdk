// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.tripsforroute.TripsForRouteListParams

@ExtendWith(TestServerExtension::class)
internal class TripsForRouteServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForRouteService = client.tripsForRoute()

        val tripsForRoutes =
            tripsForRouteService.list(
                TripsForRouteListParams.builder()
                    .routeId("routeID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .time(0L)
                    .build()
            )

        tripsForRoutes.validate()
    }
}
