// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class TripForVehicleServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripForVehicleServiceAsync = client.tripForVehicle()

        val tripForVehicleFuture =
            tripForVehicleServiceAsync.retrieve(
                TripForVehicleRetrieveParams.builder()
                    .vehicleId("vehicleID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .time(0L)
                    .build()
            )

        val tripForVehicle = tripForVehicleFuture.get()
        tripForVehicle.validate()
    }
}
