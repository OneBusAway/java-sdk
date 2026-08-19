// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync

@ExtendWith(TestServerExtension::class)
internal class StopIdsForAgencyServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stopIdsForAgencyServiceAsync = client.stopIdsForAgency()

        val stopIdsForAgenciesFuture = stopIdsForAgencyServiceAsync.list("agencyID")

        val stopIdsForAgencies = stopIdsForAgenciesFuture.get()
        stopIdsForAgencies.validate()
    }
}
