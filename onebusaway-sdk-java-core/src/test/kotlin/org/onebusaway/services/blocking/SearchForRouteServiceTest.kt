// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.SearchForRouteListParams

@ExtendWith(TestServerExtension::class)
class SearchForRouteServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchForRouteService = client.searchForRoute()
        val searchForRouteListResponse =
            searchForRouteService.list(
                SearchForRouteListParams.builder().input("input").maxCount(0L).build()
            )
        println(searchForRouteListResponse)
    }
}
