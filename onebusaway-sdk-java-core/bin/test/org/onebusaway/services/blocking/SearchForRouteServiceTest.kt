// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.searchforroute.SearchForRouteListParams

@ExtendWith(TestServerExtension::class)
internal class SearchForRouteServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchForRouteService = client.searchForRoute()

        val searchForRoutes =
            searchForRouteService.list(
                SearchForRouteListParams.builder().input("input").maxCount(0L).build()
            )

        searchForRoutes.validate()
    }
}
