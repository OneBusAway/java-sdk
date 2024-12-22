// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.services.blocking.AgenciesWithCoverageService
import org.onebusaway.services.blocking.AgencyService
import org.onebusaway.services.blocking.ArrivalAndDepartureService
import org.onebusaway.services.blocking.BlockService
import org.onebusaway.services.blocking.ConfigService
import org.onebusaway.services.blocking.CurrentTimeService
import org.onebusaway.services.blocking.ReportProblemWithStopService
import org.onebusaway.services.blocking.ReportProblemWithTripService
import org.onebusaway.services.blocking.RouteIdsForAgencyService
import org.onebusaway.services.blocking.RouteService
import org.onebusaway.services.blocking.RoutesForAgencyService
import org.onebusaway.services.blocking.RoutesForLocationService
import org.onebusaway.services.blocking.ScheduleForRouteService
import org.onebusaway.services.blocking.ScheduleForStopService
import org.onebusaway.services.blocking.SearchForRouteService
import org.onebusaway.services.blocking.SearchForStopService
import org.onebusaway.services.blocking.ShapeService
import org.onebusaway.services.blocking.StopIdsForAgencyService
import org.onebusaway.services.blocking.StopService
import org.onebusaway.services.blocking.StopsForAgencyService
import org.onebusaway.services.blocking.StopsForLocationService
import org.onebusaway.services.blocking.StopsForRouteService
import org.onebusaway.services.blocking.TripDetailService
import org.onebusaway.services.blocking.TripForVehicleService
import org.onebusaway.services.blocking.TripService
import org.onebusaway.services.blocking.TripsForLocationService
import org.onebusaway.services.blocking.TripsForRouteService
import org.onebusaway.services.blocking.VehiclesForAgencyService

interface OnebusawaySdkClient {

    fun async(): OnebusawaySdkClientAsync

    fun agenciesWithCoverage(): AgenciesWithCoverageService

    fun agency(): AgencyService

    fun vehiclesForAgency(): VehiclesForAgencyService

    fun config(): ConfigService

    fun currentTime(): CurrentTimeService

    fun stopsForLocation(): StopsForLocationService

    fun stopsForRoute(): StopsForRouteService

    fun stopsForAgency(): StopsForAgencyService

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
