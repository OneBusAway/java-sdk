// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.core.jsonMapper
import org.onebusaway.models.CurrentTimeRetrieveParams
import org.onebusaway.models.CurrentTimeRetrieveResponse
import org.onebusaway.models.References

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OnebusawaySdkOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun currentTimesRetrieveWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            CurrentTimeRetrieveParams.builder()
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            CurrentTimeRetrieveResponse.builder()
                .code(0L)
                .currentTime(0L)
                .text("text")
                .version(0L)
                .data(
                    CurrentTimeRetrieveResponse.Data.builder()
                        .entry(
                            CurrentTimeRetrieveResponse.Data.Entry.builder()
                                .readableTime("readableTime")
                                .time(0L)
                                .build()
                        )
                        .references(
                            References.builder()
                                .addAgency(
                                    References.Agency.builder()
                                        .id("id")
                                        .name("name")
                                        .timezone("timezone")
                                        .url("url")
                                        .disclaimer("disclaimer")
                                        .email("email")
                                        .fareUrl("fareUrl")
                                        .lang("lang")
                                        .phone("phone")
                                        .privateService(true)
                                        .build()
                                )
                                .addRoute(
                                    References.Route.builder()
                                        .id("id")
                                        .agencyId("agencyId")
                                        .type(0L)
                                        .color("color")
                                        .description("description")
                                        .longName("longName")
                                        .nullSafeShortName("nullSafeShortName")
                                        .shortName("shortName")
                                        .textColor("textColor")
                                        .url("url")
                                        .build()
                                )
                                .addSituation(
                                    References.Situation.builder()
                                        .id("id")
                                        .creationTime(0L)
                                        .addActiveWindow(
                                            References.Situation.ActiveWindow.builder()
                                                .from(0L)
                                                .to(0L)
                                                .build()
                                        )
                                        .addAllAffect(
                                            References.Situation.AllAffect.builder()
                                                .agencyId("agencyId")
                                                .applicationId("applicationId")
                                                .directionId("directionId")
                                                .routeId("routeId")
                                                .stopId("stopId")
                                                .tripId("tripId")
                                                .build()
                                        )
                                        .consequenceMessage("consequenceMessage")
                                        .addConsequence(
                                            References.Situation.Consequence.builder()
                                                .condition("condition")
                                                .conditionDetails(
                                                    References.Situation.Consequence
                                                        .ConditionDetails
                                                        .builder()
                                                        .diversionPath(
                                                            References.Situation.Consequence
                                                                .ConditionDetails
                                                                .DiversionPath
                                                                .builder()
                                                                .length(0L)
                                                                .levels("levels")
                                                                .points("points")
                                                                .build()
                                                        )
                                                        .addDiversionStopId("string")
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .description(
                                            References.Situation.Description.builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .addPublicationWindow(
                                            References.Situation.PublicationWindow.builder()
                                                .from(0L)
                                                .to(0L)
                                                .build()
                                        )
                                        .reason(References.Situation.Reason.EQUIPMENT_REASON)
                                        .severity("severity")
                                        .summary(
                                            References.Situation.Summary.builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .url(
                                            References.Situation.Url.builder()
                                                .lang("lang")
                                                .value("value")
                                                .build()
                                        )
                                        .build()
                                )
                                .addStop(
                                    References.Stop.builder()
                                        .id("id")
                                        .lat(0.0)
                                        .lon(0.0)
                                        .name("name")
                                        .parent("parent")
                                        .addRouteId("string")
                                        .addStaticRouteId("string")
                                        .code("code")
                                        .direction("direction")
                                        .locationType(0L)
                                        .wheelchairBoarding("wheelchairBoarding")
                                        .build()
                                )
                                .addStopTime(
                                    References.StopTime.builder()
                                        .arrivalTime(0L)
                                        .departureTime(0L)
                                        .distanceAlongTrip(0.0)
                                        .historicalOccupancy("historicalOccupancy")
                                        .stopHeadsign("stopHeadsign")
                                        .stopId("stopId")
                                        .build()
                                )
                                .addTrip(
                                    References.Trip.builder()
                                        .id("id")
                                        .routeId("routeId")
                                        .serviceId("serviceId")
                                        .blockId("blockId")
                                        .directionId("directionId")
                                        .peakOffpeak(0L)
                                        .routeShortName("routeShortName")
                                        .shapeId("shapeId")
                                        .timeZone("timeZone")
                                        .tripHeadsign("tripHeadsign")
                                        .tripShortName("tripShortName")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.currentTime().retrieve(params)

        verify(getRequestedFor(anyUrl()))
    }
}
