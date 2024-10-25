// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.getPackageVersion
import org.onebusaway.models.*
import org.onebusaway.services.async.*

class OnebusawaySdkClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OnebusawaySdkClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
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
}
