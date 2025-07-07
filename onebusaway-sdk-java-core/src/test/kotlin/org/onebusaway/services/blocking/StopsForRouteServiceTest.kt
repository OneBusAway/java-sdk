// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.stopsforroute.StopsForRouteListParams

@ExtendWith(TestServerExtension::class)
internal class StopsForRouteServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stopsForRouteService = client.stopsForRoute()

        val stopsForRoutes =
            stopsForRouteService.list(
                StopsForRouteListParams.builder()
                    .routeId("routeID")
                    .includePolylines(true)
                    .time("time")
                    .build()
            )

        stopsForRoutes.validate()
    }
}
