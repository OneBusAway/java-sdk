// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.RoutesForAgencyListParams

@ExtendWith(TestServerExtension::class)
class RoutesForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routesForAgencyService = client.routesForAgency()
        val routesForAgencyListResponse =
            routesForAgencyService.list(RoutesForAgencyListParams.builder().agencyId("40").build())
        println(routesForAgencyListResponse)
    }
}
