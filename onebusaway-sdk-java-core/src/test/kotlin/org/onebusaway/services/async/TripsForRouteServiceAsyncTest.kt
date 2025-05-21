// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.tripsforroute.TripsForRouteListParams

@ExtendWith(TestServerExtension::class)
internal class TripsForRouteServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForRouteServiceAsync = client.tripsForRoute()

        val tripsForRoutesFuture =
            tripsForRouteServiceAsync.list(
                TripsForRouteListParams.builder()
                    .routeId("routeID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .time(0L)
                    .build()
            )

        val tripsForRoutes = tripsForRoutesFuture.get()
        tripsForRoutes.validate()
    }
}
