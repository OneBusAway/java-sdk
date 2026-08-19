// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.vehiclesforagency.VehiclesForAgencyListParams

@ExtendWith(TestServerExtension::class)
internal class VehiclesForAgencyServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vehiclesForAgencyServiceAsync = client.vehiclesForAgency()

        val vehiclesForAgenciesFuture =
            vehiclesForAgencyServiceAsync.list(
                VehiclesForAgencyListParams.builder().agencyId("agencyID").time("time").build()
            )

        val vehiclesForAgencies = vehiclesForAgenciesFuture.get()
        vehiclesForAgencies.validate()
    }
}
