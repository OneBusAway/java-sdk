// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.*

@ExtendWith(TestServerExtension::class)
class StopsForLocationServiceTest {

    @Test
    fun callList() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stopsForLocationService = client.stopsForLocation()
        val stopsForLocationListResponse =
            stopsForLocationService.list(
                StopsForLocationListParams.builder()
                    .lat(0.0)
                    .lon(0.0)
                    .latSpan(0.0)
                    .lonSpan(0.0)
                    .query("query")
                    .radius(0.0)
                    .build()
            )
        println(stopsForLocationListResponse)
    }
}
