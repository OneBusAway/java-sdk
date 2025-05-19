// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.ReportProblemWithStopRetrieveParams

@ExtendWith(TestServerExtension::class)
class ReportProblemWithStopServiceTest {

    @Test
    fun callRetrieve() {
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
                    .userLat(0.0)
                    .userLocationAccuracy(0.0)
                    .userLon(0.0)
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }
}
