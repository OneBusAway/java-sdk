// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.StopsForAgencyListParams

@ExtendWith(TestServerExtension::class)
class StopsForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stopsForAgencyService = client.stopsForAgency()
        val stopsForAgencyListResponse =
            stopsForAgencyService.list(
                StopsForAgencyListParams.builder().agencyId("agencyID").build()
            )
        println(stopsForAgencyListResponse)
    }
}
