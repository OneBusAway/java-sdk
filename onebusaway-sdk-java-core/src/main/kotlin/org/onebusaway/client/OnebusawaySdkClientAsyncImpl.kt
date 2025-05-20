// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.getPackageVersion
import org.onebusaway.services.async.AgenciesWithCoverageServiceAsync
import org.onebusaway.services.async.AgenciesWithCoverageServiceAsyncImpl
import org.onebusaway.services.async.AgencyServiceAsync
import org.onebusaway.services.async.AgencyServiceAsyncImpl
import org.onebusaway.services.async.ArrivalAndDepartureServiceAsync
import org.onebusaway.services.async.ArrivalAndDepartureServiceAsyncImpl
import org.onebusaway.services.async.BlockServiceAsync
import org.onebusaway.services.async.BlockServiceAsyncImpl
import org.onebusaway.services.async.ConfigServiceAsync
import org.onebusaway.services.async.ConfigServiceAsyncImpl
import org.onebusaway.services.async.CurrentTimeServiceAsync
import org.onebusaway.services.async.CurrentTimeServiceAsyncImpl
import org.onebusaway.services.async.ReportProblemWithStopServiceAsync
import org.onebusaway.services.async.ReportProblemWithStopServiceAsyncImpl
import org.onebusaway.services.async.ReportProblemWithTripServiceAsync
import org.onebusaway.services.async.ReportProblemWithTripServiceAsyncImpl
import org.onebusaway.services.async.RouteIdsForAgencyServiceAsync
import org.onebusaway.services.async.RouteIdsForAgencyServiceAsyncImpl
import org.onebusaway.services.async.RouteServiceAsync
import org.onebusaway.services.async.RouteServiceAsyncImpl
import org.onebusaway.services.async.RoutesForAgencyServiceAsync
import org.onebusaway.services.async.RoutesForAgencyServiceAsyncImpl
import org.onebusaway.services.async.RoutesForLocationServiceAsync
import org.onebusaway.services.async.RoutesForLocationServiceAsyncImpl
import org.onebusaway.services.async.ScheduleForRouteServiceAsync
import org.onebusaway.services.async.ScheduleForRouteServiceAsyncImpl
import org.onebusaway.services.async.ScheduleForStopServiceAsync
import org.onebusaway.services.async.ScheduleForStopServiceAsyncImpl
import org.onebusaway.services.async.SearchForRouteServiceAsync
import org.onebusaway.services.async.SearchForRouteServiceAsyncImpl
import org.onebusaway.services.async.SearchForStopServiceAsync
import org.onebusaway.services.async.SearchForStopServiceAsyncImpl
import org.onebusaway.services.async.ShapeServiceAsync
import org.onebusaway.services.async.ShapeServiceAsyncImpl
import org.onebusaway.services.async.StopIdsForAgencyServiceAsync
import org.onebusaway.services.async.StopIdsForAgencyServiceAsyncImpl
import org.onebusaway.services.async.StopServiceAsync
import org.onebusaway.services.async.StopServiceAsyncImpl
import org.onebusaway.services.async.StopsForAgencyServiceAsync
import org.onebusaway.services.async.StopsForAgencyServiceAsyncImpl
import org.onebusaway.services.async.StopsForLocationServiceAsync
import org.onebusaway.services.async.StopsForLocationServiceAsyncImpl
import org.onebusaway.services.async.StopsForRouteServiceAsync
import org.onebusaway.services.async.StopsForRouteServiceAsyncImpl
import org.onebusaway.services.async.TripDetailServiceAsync
import org.onebusaway.services.async.TripDetailServiceAsyncImpl
import org.onebusaway.services.async.TripForVehicleServiceAsync
import org.onebusaway.services.async.TripForVehicleServiceAsyncImpl
import org.onebusaway.services.async.TripServiceAsync
import org.onebusaway.services.async.TripServiceAsyncImpl
import org.onebusaway.services.async.TripsForLocationServiceAsync
import org.onebusaway.services.async.TripsForLocationServiceAsyncImpl
import org.onebusaway.services.async.TripsForRouteServiceAsync
import org.onebusaway.services.async.TripsForRouteServiceAsyncImpl
import org.onebusaway.services.async.VehiclesForAgencyServiceAsync
import org.onebusaway.services.async.VehiclesForAgencyServiceAsyncImpl

class OnebusawaySdkClientAsyncImpl(
    private val clientOptions: ClientOptions,
) : OnebusawaySdkClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OnebusawaySdkClient by lazy { OnebusawaySdkClientImpl(clientOptions) }

    private val agenciesWithCoverage: AgenciesWithCoverageServiceAsync by lazy {
        AgenciesWithCoverageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val agency: AgencyServiceAsync by lazy {
        AgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vehiclesForAgency: VehiclesForAgencyServiceAsync by lazy {
        VehiclesForAgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigServiceAsync by lazy {
        ConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val currentTime: CurrentTimeServiceAsync by lazy {
        CurrentTimeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stopsForLocation: StopsForLocationServiceAsync by lazy {
        StopsForLocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stopsForRoute: StopsForRouteServiceAsync by lazy {
        StopsForRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stopsForAgency: StopsForAgencyServiceAsync by lazy {
        StopsForAgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stop: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val stopIdsForAgency: StopIdsForAgencyServiceAsync by lazy {
        StopIdsForAgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForStop: ScheduleForStopServiceAsync by lazy {
        ScheduleForStopServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val route: RouteServiceAsync by lazy {
        RouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routeIdsForAgency: RouteIdsForAgencyServiceAsync by lazy {
        RouteIdsForAgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routesForLocation: RoutesForLocationServiceAsync by lazy {
        RoutesForLocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routesForAgency: RoutesForAgencyServiceAsync by lazy {
        RoutesForAgencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForRoute: ScheduleForRouteServiceAsync by lazy {
        ScheduleForRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val arrivalAndDeparture: ArrivalAndDepartureServiceAsync by lazy {
        ArrivalAndDepartureServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val trip: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val tripsForLocation: TripsForLocationServiceAsync by lazy {
        TripsForLocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tripDetails: TripDetailServiceAsync by lazy {
        TripDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tripForVehicle: TripForVehicleServiceAsync by lazy {
        TripForVehicleServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tripsForRoute: TripsForRouteServiceAsync by lazy {
        TripsForRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithStop: ReportProblemWithStopServiceAsync by lazy {
        ReportProblemWithStopServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithTrip: ReportProblemWithTripServiceAsync by lazy {
        ReportProblemWithTripServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val searchForStop: SearchForStopServiceAsync by lazy {
        SearchForStopServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val searchForRoute: SearchForRouteServiceAsync by lazy {
        SearchForRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val block: BlockServiceAsync by lazy {
        BlockServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val shape: ShapeServiceAsync by lazy {
        ShapeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OnebusawaySdkClient = sync

    override fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync = agenciesWithCoverage

    override fun agency(): AgencyServiceAsync = agency

    override fun vehiclesForAgency(): VehiclesForAgencyServiceAsync = vehiclesForAgency

    override fun config(): ConfigServiceAsync = config

    override fun currentTime(): CurrentTimeServiceAsync = currentTime

    override fun stopsForLocation(): StopsForLocationServiceAsync = stopsForLocation

    override fun stopsForRoute(): StopsForRouteServiceAsync = stopsForRoute

    override fun stopsForAgency(): StopsForAgencyServiceAsync = stopsForAgency

    override fun stop(): StopServiceAsync = stop

    override fun stopIdsForAgency(): StopIdsForAgencyServiceAsync = stopIdsForAgency

    override fun scheduleForStop(): ScheduleForStopServiceAsync = scheduleForStop

    override fun route(): RouteServiceAsync = route

    override fun routeIdsForAgency(): RouteIdsForAgencyServiceAsync = routeIdsForAgency

    override fun routesForLocation(): RoutesForLocationServiceAsync = routesForLocation

    override fun routesForAgency(): RoutesForAgencyServiceAsync = routesForAgency

    override fun scheduleForRoute(): ScheduleForRouteServiceAsync = scheduleForRoute

    override fun arrivalAndDeparture(): ArrivalAndDepartureServiceAsync = arrivalAndDeparture

    override fun trip(): TripServiceAsync = trip

    override fun tripsForLocation(): TripsForLocationServiceAsync = tripsForLocation

    override fun tripDetails(): TripDetailServiceAsync = tripDetails

    override fun tripForVehicle(): TripForVehicleServiceAsync = tripForVehicle

    override fun tripsForRoute(): TripsForRouteServiceAsync = tripsForRoute

    override fun reportProblemWithStop(): ReportProblemWithStopServiceAsync = reportProblemWithStop

    override fun reportProblemWithTrip(): ReportProblemWithTripServiceAsync = reportProblemWithTrip

    override fun searchForStop(): SearchForStopServiceAsync = searchForStop

    override fun searchForRoute(): SearchForRouteServiceAsync = searchForRoute

    override fun block(): BlockServiceAsync = block

    override fun shape(): ShapeServiceAsync = shape

    override fun close() = clientOptions.httpClient.close()
}
