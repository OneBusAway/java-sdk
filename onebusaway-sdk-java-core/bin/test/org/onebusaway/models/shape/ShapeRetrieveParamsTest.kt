// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.shape

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShapeRetrieveParamsTest {

    @Test
    fun create() {
        ShapeRetrieveParams.builder().shapeId("shapeID").build()
    }

    @Test
    fun pathParams() {
        val params = ShapeRetrieveParams.builder().shapeId("shapeID").build()

        assertThat(params._pathParam(0)).isEqualTo("shapeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
