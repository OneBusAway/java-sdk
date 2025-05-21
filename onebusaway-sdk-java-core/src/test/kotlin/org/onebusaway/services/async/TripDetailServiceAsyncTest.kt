// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.tripdetails.TripDetailRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class TripDetailServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripDetailServiceAsync = client.tripDetails()

        val tripDetailFuture =
            tripDetailServiceAsync.retrieve(
                TripDetailRetrieveParams.builder()
                    .tripId("tripID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .serviceDate(0L)
                    .time(0L)
                    .build()
            )

        val tripDetail = tripDetailFuture.get()
        tripDetail.validate()
    }
}
