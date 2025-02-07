// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BlockRetrieveParamsTest {

    @Test
    fun create() {
        BlockRetrieveParams.builder().blockId("blockID").build()
    }

    @Test
    fun getPathParam() {
        val params = BlockRetrieveParams.builder().blockId("blockID").build()
        assertThat(params).isNotNull
        // path param "blockId"
        assertThat(params.getPathParam(0)).isEqualTo("blockID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
