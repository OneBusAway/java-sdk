// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.tripforvehicle.TripForVehicleRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class TripForVehicleServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripForVehicleService = client.tripForVehicle()

        val tripForVehicle =
            tripForVehicleService.retrieve(
                TripForVehicleRetrieveParams.builder()
                    .vehicleId("vehicleID")
                    .includeSchedule(true)
                    .includeStatus(true)
                    .includeTrip(true)
                    .time(0L)
                    .build()
            )

        tripForVehicle.validate()
    }
}
