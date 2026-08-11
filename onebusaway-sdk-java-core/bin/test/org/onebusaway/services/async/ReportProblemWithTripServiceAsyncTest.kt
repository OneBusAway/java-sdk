// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.reportproblemwithtrip.ReportProblemWithTripRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ReportProblemWithTripServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportProblemWithTripServiceAsync = client.reportProblemWithTrip()

        val responseWrapperFuture =
            reportProblemWithTripServiceAsync.retrieve(
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

        val responseWrapper = responseWrapperFuture.get()
        responseWrapper.validate()
    }
}
