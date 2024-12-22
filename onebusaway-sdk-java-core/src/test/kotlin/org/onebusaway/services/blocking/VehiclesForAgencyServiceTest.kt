// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.VehiclesForAgencyListParams

@ExtendWith(TestServerExtension::class)
class VehiclesForAgencyServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vehiclesForAgencyService = client.vehiclesForAgency()
        val vehiclesForAgencyListResponse =
            vehiclesForAgencyService.list(
                VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
            )
        println(vehiclesForAgencyListResponse)
    }
}
