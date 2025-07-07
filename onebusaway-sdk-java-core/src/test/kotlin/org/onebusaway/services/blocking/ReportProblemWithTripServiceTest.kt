// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.reportproblemwithtrip.ReportProblemWithTripRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ReportProblemWithTripServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportProblemWithTripService = client.reportProblemWithTrip()

        val responseWrapper =
            reportProblemWithTripService.retrieve(
                ReportProblemWithTripRetrieveParams.builder()
                    .tripId("tripID")
                    .code(ReportProblemWithTripRetrieveParams.Code.VEHICLE_NEVER_CAME)
                    .serviceDate(0L)
                    .stopId("stopID")
                    .userComment("userComment")
                    .userLat(0.0f)
                    .userLocationAccuracy(0.0f)
                    .userLon(0.0f)
                    .userOnVehicle(true)
                    .userVehicleNumber("userVehicleNumber")
                    .vehicleId("vehicleID")
                    .build()
            )

        responseWrapper.validate()
    }
}
