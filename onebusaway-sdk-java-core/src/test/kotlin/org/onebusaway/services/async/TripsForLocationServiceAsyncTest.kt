// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.tripsforlocation.TripsForLocationListParams

@ExtendWith(TestServerExtension::class)
internal class TripsForLocationServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripsForLocationServiceAsync = client.tripsForLocation()

        val tripsForLocationsFuture =
            tripsForLocationServiceAsync.list(
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

        val tripsForLocations = tripsForLocationsFuture.get()
        tripsForLocations.validate()
    }
}
