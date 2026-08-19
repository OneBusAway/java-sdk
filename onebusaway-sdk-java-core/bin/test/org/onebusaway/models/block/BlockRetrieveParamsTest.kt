// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.block

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockRetrieveParamsTest {

    @Test
    fun create() {
        BlockRetrieveParams.builder().blockId("blockID").build()
    }

    @Test
    fun pathParams() {
        val params = BlockRetrieveParams.builder().blockId("blockID").build()

        assertThat(params._pathParam(0)).isEqualTo("blockID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
