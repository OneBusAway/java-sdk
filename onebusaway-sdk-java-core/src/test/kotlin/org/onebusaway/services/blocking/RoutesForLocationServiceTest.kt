// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams

@ExtendWith(TestServerExtension::class)
internal class RoutesForLocationServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routesForLocationService = client.routesForLocation()

        val routesForLocations =
            routesForLocationService.list(
                RoutesForLocationListParams.builder()
                    .lat(0.0)
                    .lon(0.0)
                    .latSpan(0.0)
                    .lonSpan(0.0)
                    .query("query")
                    .radius(0.0)
                    .build()
            )

        routesForLocations.validate()
    }
}
