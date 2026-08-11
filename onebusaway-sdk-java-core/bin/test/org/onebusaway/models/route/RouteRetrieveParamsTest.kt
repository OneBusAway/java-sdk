// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.route

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteRetrieveParamsTest {

    @Test
    fun create() {
        RouteRetrieveParams.builder().routeId("routeID").build()
    }

    @Test
    fun pathParams() {
        val params = RouteRetrieveParams.builder().routeId("routeID").build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
