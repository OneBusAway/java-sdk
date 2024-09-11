// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services.blocking

import com.open_transit.api.TestServerExtension
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

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
                    .userLat(42.23)
                    .userLocationAccuracy(42.23)
                    .userLon(42.23)
                    .build()
            )
        println(responseWrapper)
        responseWrapper.validate()
    }
}
