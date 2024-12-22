// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.models.BlockRetrieveParams

@ExtendWith(TestServerExtension::class)
class BlockServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val blockService = client.block()
        val blockRetrieveResponse =
            blockService.retrieve(BlockRetrieveParams.builder().blockId("blockID").build())
        println(blockRetrieveResponse)
    }
}
