// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.reportproblemwithstop.ReportProblemWithStopRetrieveParams

@ExtendWith(TestServerExtension::class)
internal class ReportProblemWithStopServiceTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportProblemWithStopService = client.reportProblemWithStop()

        val responseWrapper =
            reportProblemWithStopService.retrieve(
                ReportProblemWithStopRetrieveParams.builder()
                    .stopId("stopID")
                    .code(ReportProblemWithStopRetrieveParams.Code.STOP_NAME_WRONG)
                    .userComment("userComment")
                    .userLat(0.0f)
                    .userLocationAccuracy(0.0f)
                    .userLon(0.0f)
                    .build()
            )

        responseWrapper.validate()
    }
}
