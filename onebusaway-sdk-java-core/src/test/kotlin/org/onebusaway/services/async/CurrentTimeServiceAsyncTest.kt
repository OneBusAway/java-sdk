// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync

@ExtendWith(TestServerExtension::class)
internal class CurrentTimeServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val currentTimeServiceAsync = client.currentTime()

        val currentTimeFuture = currentTimeServiceAsync.retrieve()

        val currentTime = currentTimeFuture.get()
        currentTime.validate()
    }
}
