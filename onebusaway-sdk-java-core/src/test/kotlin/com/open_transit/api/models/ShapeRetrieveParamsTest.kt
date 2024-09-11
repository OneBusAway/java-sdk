// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShapeRetrieveParamsTest {

    @Test
    fun createShapeRetrieveParams() {
        ShapeRetrieveParams.builder().shapeId("shapeID").build()
    }

    @Test
    fun getPathParam() {
        val params = ShapeRetrieveParams.builder().shapeId("shapeID").build()
        assertThat(params).isNotNull
        // path param "shapeId"
        assertThat(params.getPathParam(0)).isEqualTo("shapeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
