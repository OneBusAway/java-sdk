// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.searchforstop.SearchForStopListParams

@ExtendWith(TestServerExtension::class)
internal class SearchForStopServiceTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchForStopService = client.searchForStop()

        val searchForStops =
            searchForStopService.list(
                SearchForStopListParams.builder().input("input").maxCount(0L).build()
            )

        searchForStops.validate()
    }
}
