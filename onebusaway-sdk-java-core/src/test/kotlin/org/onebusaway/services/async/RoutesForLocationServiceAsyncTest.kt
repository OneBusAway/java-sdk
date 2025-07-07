// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.routesforlocation.RoutesForLocationListParams

@ExtendWith(TestServerExtension::class)
internal class RoutesForLocationServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routesForLocationServiceAsync = client.routesForLocation()

        val routesForLocationsFuture =
            routesForLocationServiceAsync.list(
                RoutesForLocationListParams.builder()
                    .lat(0.0)
                    .lon(0.0)
                    .latSpan(0.0)
                    .lonSpan(0.0)
                    .query("query")
                    .radius(0.0)
                    .build()
            )

        val routesForLocations = routesForLocationsFuture.get()
        routesForLocations.validate()
    }
}
