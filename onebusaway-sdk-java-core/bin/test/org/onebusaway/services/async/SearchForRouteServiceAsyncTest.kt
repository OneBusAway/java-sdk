// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.searchforroute.SearchForRouteListParams

@ExtendWith(TestServerExtension::class)
internal class SearchForRouteServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchForRouteServiceAsync = client.searchForRoute()

        val searchForRoutesFuture =
            searchForRouteServiceAsync.list(
                SearchForRouteListParams.builder().input("input").maxCount(0L).build()
            )

        val searchForRoutes = searchForRoutesFuture.get()
        searchForRoutes.validate()
    }
}
