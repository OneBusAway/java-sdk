// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.open_transit.api.client

import com.open_transit.api.models.*
import com.open_transit.api.services.blocking.*

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
