// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync

@ExtendWith(TestServerExtension::class)
internal class RouteIdsForAgencyServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeIdsForAgencyServiceAsync = client.routeIdsForAgency()

        val routeIdsForAgenciesFuture = routeIdsForAgencyServiceAsync.list("agencyID")

        val routeIdsForAgencies = routeIdsForAgenciesFuture.get()
        routeIdsForAgencies.validate()
    }
}
