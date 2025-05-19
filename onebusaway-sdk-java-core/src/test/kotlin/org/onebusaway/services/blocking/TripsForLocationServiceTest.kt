// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.TripsForLocationListParams

@ExtendWith(TestServerExtension::class)
class TripsForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForLocationService = client.tripsForLocation()
        val tripsForLocationListResponse =
            tripsForLocationService.list(
                TripsForLocationListParams.builder()
                    .lat(0.0)
                    .latSpan(0.0)
                    .lon(0.0)
                    .lonSpan(0.0)
                    .includeSchedule(true)
                    .includeTrip(true)
                    .time(0L)
                    .build()
            )
        println(tripsForLocationListResponse)
    }
}
