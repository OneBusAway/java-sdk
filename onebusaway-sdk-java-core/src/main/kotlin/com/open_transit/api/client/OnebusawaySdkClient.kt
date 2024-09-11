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
import com.open_transit.api.services.blocking.*
import com.open_transit.api.services.emptyHandler
import com.open_transit.api.services.errorHandler
import com.open_transit.api.services.json
import com.open_transit.api.services.jsonHandler
import com.open_transit.api.services.stringHandler
import com.open_transit.api.services.binaryHandler
import com.open_transit.api.services.withErrorHandler

interface OnebusawaySdkClient {

    fun async(): OnebusawaySdkClientAsync

    fun agenciesWithCoverage(): AgenciesWithCoverageService

    fun agency(): AgencyService

    fun vehiclesForAgency(): VehiclesForAgencyService

    fun config(): ConfigService

    fun currentTime(): CurrentTimeService

    fun stopsForLocation(): StopsForLocationService

    fun stopsForRoute(): StopsForRouteService

    fun stop(): StopService

    fun stopIdsForAgency(): StopIdsForAgencyService

    fun scheduleForStop(): ScheduleForStopService

    fun route(): RouteService

    fun routeIdsForAgency(): RouteIdsForAgencyService

    fun routesForLocation(): RoutesForLocationService

    fun routesForAgency(): RoutesForAgencyService

    fun scheduleForRoute(): ScheduleForRouteService

    fun arrivalAndDeparture(): ArrivalAndDepartureService

    fun trip(): TripService

    fun tripsForLocation(): TripsForLocationService

    fun tripDetails(): TripDetailService

    fun tripForVehicle(): TripForVehicleService

    fun tripsForRoute(): TripsForRouteService

    fun reportProblemWithStop(): ReportProblemWithStopService

    fun reportProblemWithTrip(): ReportProblemWithTripService

    fun searchForStop(): SearchForStopService

    fun searchForRoute(): SearchForRouteService

    fun block(): BlockService

    fun shape(): ShapeService
}
