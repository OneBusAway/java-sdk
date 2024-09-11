// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.open_transit.api.core.ClientOptions
import com.open_transit.api.core.http.HttpMethod
import com.open_transit.api.core.http.HttpRequest
import com.open_transit.api.core.http.HttpResponse.Handler
import com.open_transit.api.core.JsonField
import com.open_transit.api.core.RequestOptions
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.errors.OnebusawaySdkInvalidDataException
import com.open_transit.api.models.*
import com.open_transit.api.services.async.*
import com.open_transit.api.services.emptyHandler
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.json
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.stringHandler
import com.open_transit.api.services.binaryHandler
import com.open_transit.api.services.withErrorHandler

interface OnebusawaySdkClientAsync {

    fun sync(): OnebusawaySdkClient

    fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync

    fun agency(): AgencyServiceAsync

    fun vehiclesForAgency(): VehiclesForAgencyServiceAsync

    fun config(): ConfigServiceAsync

    fun currentTime(): CurrentTimeServiceAsync

    fun stopsForLocation(): StopsForLocationServiceAsync

    fun stopsForRoute(): StopsForRouteServiceAsync

    fun stop(): StopServiceAsync

    fun stopIdsForAgency(): StopIdsForAgencyServiceAsync

    fun scheduleForStop(): ScheduleForStopServiceAsync

    fun route(): RouteServiceAsync

    fun routeIdsForAgency(): RouteIdsForAgencyServiceAsync

    fun routesForLocation(): RoutesForLocationServiceAsync

    fun routesForAgency(): RoutesForAgencyServiceAsync

    fun scheduleForRoute(): ScheduleForRouteServiceAsync

    fun arrivalAndDeparture(): ArrivalAndDepartureServiceAsync

    fun trip(): TripServiceAsync

    fun tripsForLocation(): TripsForLocationServiceAsync

    fun tripDetails(): TripDetailServiceAsync

    fun tripForVehicle(): TripForVehicleServiceAsync

    fun tripsForRoute(): TripsForRouteServiceAsync

    fun reportProblemWithStop(): ReportProblemWithStopServiceAsync

    fun reportProblemWithTrip(): ReportProblemWithTripServiceAsync

    fun searchForStop(): SearchForStopServiceAsync

    fun searchForRoute(): SearchForRouteServiceAsync

    fun block(): BlockServiceAsync

    fun shape(): ShapeServiceAsync
}
