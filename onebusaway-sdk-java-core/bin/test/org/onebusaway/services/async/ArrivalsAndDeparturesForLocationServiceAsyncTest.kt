// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.onebusaway.TestServerExtension
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClientAsync
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListParams

@ExtendWith(TestServerExtension::class)
internal class ArrivalsAndDeparturesForLocationServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OnebusawaySdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val arrivalsAndDeparturesForLocationServiceAsync = client.arrivalsAndDeparturesForLocation()

        val arrivalsAndDeparturesForLocationsFuture =
            arrivalsAndDeparturesForLocationServiceAsync.list(
                ArrivalsAndDeparturesForLocationListParams.builder()
                    .lat(0.0)
                    .lon(0.0)
                    .emptyReturnsNotFound(true)
                    .latSpan(0.0)
                    .lonSpan(0.0)
                    .maxCount(1000L)
                    .minutesAfter(0L)
                    .minutesBefore(0L)
                    .radius(0.0)
                    .routeType("routeType")
                    .time(0L)
                    .build()
            )

        val arrivalsAndDeparturesForLocations = arrivalsAndDeparturesForLocationsFuture.get()
        arrivalsAndDeparturesForLocations.validate()
    }
}
