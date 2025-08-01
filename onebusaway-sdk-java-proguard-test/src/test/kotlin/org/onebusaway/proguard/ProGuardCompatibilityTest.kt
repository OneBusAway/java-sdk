// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.core.jsonMapper
import org.onebusaway.models.References

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/onebusaway-sdk-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = OnebusawaySdkOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.agenciesWithCoverage()).isNotNull()
        assertThat(client.agency()).isNotNull()
        assertThat(client.vehiclesForAgency()).isNotNull()
        assertThat(client.config()).isNotNull()
        assertThat(client.currentTime()).isNotNull()
        assertThat(client.stopsForLocation()).isNotNull()
        assertThat(client.stopsForRoute()).isNotNull()
        assertThat(client.stopsForAgency()).isNotNull()
        assertThat(client.stop()).isNotNull()
        assertThat(client.stopIdsForAgency()).isNotNull()
        assertThat(client.scheduleForStop()).isNotNull()
        assertThat(client.route()).isNotNull()
        assertThat(client.routeIdsForAgency()).isNotNull()
        assertThat(client.routesForLocation()).isNotNull()
        assertThat(client.routesForAgency()).isNotNull()
        assertThat(client.scheduleForRoute()).isNotNull()
        assertThat(client.arrivalAndDeparture()).isNotNull()
        assertThat(client.trip()).isNotNull()
        assertThat(client.tripsForLocation()).isNotNull()
        assertThat(client.tripDetails()).isNotNull()
        assertThat(client.tripForVehicle()).isNotNull()
        assertThat(client.tripsForRoute()).isNotNull()
        assertThat(client.reportProblemWithStop()).isNotNull()
        assertThat(client.reportProblemWithTrip()).isNotNull()
        assertThat(client.searchForStop()).isNotNull()
        assertThat(client.searchForRoute()).isNotNull()
        assertThat(client.block()).isNotNull()
        assertThat(client.shape()).isNotNull()
    }

    @Test
    fun referencesRoundtrip() {
        val jsonMapper = jsonMapper()
        val references =
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
                            References.Situation.PublicationWindow.builder().from(0L).to(0L).build()
                        )
                        .reason(References.Situation.Reason.EQUIPMENT_REASON)
                        .severity("severity")
                        .summary(
                            References.Situation.Summary.builder()
                                .lang("lang")
                                .value("value")
                                .build()
                        )
                        .url(References.Situation.Url.builder().lang("lang").value("value").build())
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

        val roundtrippedReferences =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(references),
                jacksonTypeRef<References>(),
            )

        assertThat(roundtrippedReferences).isEqualTo(references)
    }
}
