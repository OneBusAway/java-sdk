// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.CurrentTimeRetrieveParams

@ExtendWith(TestServerExtension::class)
class CurrentTimeServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val currentTimeService = client.currentTime()
        val currentTimeRetrieveResponse =
            currentTimeService.retrieve(CurrentTimeRetrieveParams.builder().build())
        println(currentTimeRetrieveResponse)
    }
}
