// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteRetrieveParamsTest {

    @Test
    fun createRouteRetrieveParams() {
        RouteRetrieveParams.builder().routeId("routeID").build()
    }

    @Test
    fun getPathParam() {
        val params = RouteRetrieveParams.builder().routeId("routeID").build()
        assertThat(params).isNotNull
        // path param "routeId"
        assertThat(params.getPathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
