// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

@ExtendWith(TestServerExtension::class)
class ReportProblemWithTripServiceTest {

    @Test
    fun callRetrieve() {
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
                    .userLat(0.0)
                    .userLocationAccuracy(0.0)
                    .userLon(0.0)
                    .userOnVehicle(true)
                    .userVehicleNumber("userVehicleNumber")
                    .vehicleId("vehicleID")
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }
}
