// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stopsforagency

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.core.jsonMapper
import org.onebusaway.models.References

internal class StopsForAgencyListResponseTest {

    @Test
    fun create() {
        val stopsForAgencyListResponse =
            StopsForAgencyListResponse.builder()
                .code(0L)
                .currentTime(0L)
                .text("text")
                .version(0L)
                .limitExceeded(true)
                .addList(
                    StopsForAgencyListResponse.List.builder()
                        .id("id")
                        .lat(0.0)
                        .locationType(0L)
                        .lon(0.0)
                        .name("name")
                        .parent("parent")
                        .addRouteId("string")
                        .addStaticRouteId("string")
                        .code("code")
                        .direction("direction")
                        .wheelchairBoarding("wheelchairBoarding")
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
                                            References.Situation.Consequence.ConditionDetails
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
                                .locationType(0L)
                                .lon(0.0)
                                .name("name")
                                .parent("parent")
                                .addRouteId("string")
                                .addStaticRouteId("string")
                                .code("code")
                                .direction("direction")
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
                .outOfRange(true)
                .build()

        assertThat(stopsForAgencyListResponse.code()).isEqualTo(0L)
        assertThat(stopsForAgencyListResponse.currentTime()).isEqualTo(0L)
        assertThat(stopsForAgencyListResponse.text()).isEqualTo("text")
        assertThat(stopsForAgencyListResponse.version()).isEqualTo(0L)
        assertThat(stopsForAgencyListResponse.limitExceeded()).isEqualTo(true)
        assertThat(stopsForAgencyListResponse.list())
            .containsExactly(
                StopsForAgencyListResponse.List.builder()
                    .id("id")
                    .lat(0.0)
                    .locationType(0L)
                    .lon(0.0)
                    .name("name")
                    .parent("parent")
                    .addRouteId("string")
                    .addStaticRouteId("string")
                    .code("code")
                    .direction("direction")
                    .wheelchairBoarding("wheelchairBoarding")
                    .build()
            )
        assertThat(stopsForAgencyListResponse.references())
            .isEqualTo(
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
                                References.Situation.ActiveWindow.builder().from(0L).to(0L).build()
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
                                        References.Situation.Consequence.ConditionDetails.builder()
                                            .diversionPath(
                                                References.Situation.Consequence.ConditionDetails
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
                            .locationType(0L)
                            .lon(0.0)
                            .name("name")
                            .parent("parent")
                            .addRouteId("string")
                            .addStaticRouteId("string")
                            .code("code")
                            .direction("direction")
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
        assertThat(stopsForAgencyListResponse.outOfRange()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stopsForAgencyListResponse =
            StopsForAgencyListResponse.builder()
                .code(0L)
                .currentTime(0L)
                .text("text")
                .version(0L)
                .limitExceeded(true)
                .addList(
                    StopsForAgencyListResponse.List.builder()
                        .id("id")
                        .lat(0.0)
                        .locationType(0L)
                        .lon(0.0)
                        .name("name")
                        .parent("parent")
                        .addRouteId("string")
                        .addStaticRouteId("string")
                        .code("code")
                        .direction("direction")
                        .wheelchairBoarding("wheelchairBoarding")
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
                                            References.Situation.Consequence.ConditionDetails
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
                                .locationType(0L)
                                .lon(0.0)
                                .name("name")
                                .parent("parent")
                                .addRouteId("string")
                                .addStaticRouteId("string")
                                .code("code")
                                .direction("direction")
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
                .outOfRange(true)
                .build()

        val roundtrippedStopsForAgencyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stopsForAgencyListResponse),
                jacksonTypeRef<StopsForAgencyListResponse>(),
            )

        assertThat(roundtrippedStopsForAgencyListResponse).isEqualTo(stopsForAgencyListResponse)
    }
}
