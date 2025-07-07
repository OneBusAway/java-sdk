// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams

@ExtendWith(TestServerExtension::class)
internal class TripsForLocationServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForLocationService = client.tripsForLocation()

        val tripsForLocations =
            tripsForLocationService.list(
                TripsForLocationListParams.builder()
                    .lat(0.0f)
                    .latSpan(0.0f)
                    .lon(0.0f)
                    .lonSpan(0.0f)
                    .includeSchedule(true)
                    .includeTrip(true)
                    .time(0L)
                    .build()
            )

        tripsForLocations.validate()
    }
}
