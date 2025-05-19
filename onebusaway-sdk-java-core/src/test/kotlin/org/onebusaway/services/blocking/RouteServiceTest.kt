// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.RouteRetrieveParams

@ExtendWith(TestServerExtension::class)
class RouteServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeService = client.route()
        val routeRetrieveResponse =
            routeService.retrieve(RouteRetrieveParams.builder().routeId("routeID").build())
        println(routeRetrieveResponse)
    }
}
