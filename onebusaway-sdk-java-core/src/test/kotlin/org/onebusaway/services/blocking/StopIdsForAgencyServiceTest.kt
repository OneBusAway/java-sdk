// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

@ExtendWith(TestServerExtension::class)
class StopIdsForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stopIdsForAgencyService = client.stopIdsForAgency()
        val stopIdsForAgencyListResponse =
            stopIdsForAgencyService.list(
                StopIdsForAgencyListParams.builder().agencyId("agencyID").build()
            )
        println(stopIdsForAgencyListResponse)
    }
}
