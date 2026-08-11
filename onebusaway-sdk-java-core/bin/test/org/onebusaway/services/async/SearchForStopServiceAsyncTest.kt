// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.searchforstop.SearchForStopListParams

@ExtendWith(TestServerExtension::class)
internal class SearchForStopServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchForStopServiceAsync = client.searchForStop()

        val searchForStopsFuture =
            searchForStopServiceAsync.list(
                SearchForStopListParams.builder().input("input").maxCount(0L).build()
            )

        val searchForStops = searchForStopsFuture.get()
        searchForStops.validate()
    }
}
