// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.http.HttpResponse.Handler
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.models.*
import org.onebusaway.services.blocking.*
import org.onebusaway.services.errorHandler

class OnebusawaySdkClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OnebusawaySdkClient {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val async: OnebusawaySdkClientAsync by lazy {
        OnebusawaySdkClientAsyncImpl(clientOptions)
    }

    private val agenciesWithCoverage: AgenciesWithCoverageService by lazy {
        AgenciesWithCoverageServiceImpl(clientOptions)
    }

    private val agency: AgencyService by lazy { AgencyServiceImpl(clientOptions) }

    private val vehiclesForAgency: VehiclesForAgencyService by lazy {
        VehiclesForAgencyServiceImpl(clientOptions)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptions) }

    private val currentTime: CurrentTimeService by lazy { CurrentTimeServiceImpl(clientOptions) }

    private val stopsForLocation: StopsForLocationService by lazy {
        StopsForLocationServiceImpl(clientOptions)
    }

    private val stopsForRoute: StopsForRouteService by lazy {
        StopsForRouteServiceImpl(clientOptions)
    }

    private val stop: StopService by lazy { StopServiceImpl(clientOptions) }

    private val stopIdsForAgency: StopIdsForAgencyService by lazy {
        StopIdsForAgencyServiceImpl(clientOptions)
    }

    private val scheduleForStop: ScheduleForStopService by lazy {
        ScheduleForStopServiceImpl(clientOptions)
    }

    private val route: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val routeIdsForAgency: RouteIdsForAgencyService by lazy {
        RouteIdsForAgencyServiceImpl(clientOptions)
    }

    private val routesForLocation: RoutesForLocationService by lazy {
        RoutesForLocationServiceImpl(clientOptions)
    }

    private val routesForAgency: RoutesForAgencyService by lazy {
        RoutesForAgencyServiceImpl(clientOptions)
    }

    private val scheduleForRoute: ScheduleForRouteService by lazy {
        ScheduleForRouteServiceImpl(clientOptions)
    }

    private val arrivalAndDeparture: ArrivalAndDepartureService by lazy {
        ArrivalAndDepartureServiceImpl(clientOptions)
    }

    private val trip: TripService by lazy { TripServiceImpl(clientOptions) }

    private val tripsForLocation: TripsForLocationService by lazy {
        TripsForLocationServiceImpl(clientOptions)
    }

    private val tripDetails: TripDetailService by lazy { TripDetailServiceImpl(clientOptions) }

    private val tripForVehicle: TripForVehicleService by lazy {
        TripForVehicleServiceImpl(clientOptions)
    }

    private val tripsForRoute: TripsForRouteService by lazy {
        TripsForRouteServiceImpl(clientOptions)
    }

    private val reportProblemWithStop: ReportProblemWithStopService by lazy {
        ReportProblemWithStopServiceImpl(clientOptions)
    }

    private val reportProblemWithTrip: ReportProblemWithTripService by lazy {
        ReportProblemWithTripServiceImpl(clientOptions)
    }

    private val searchForStop: SearchForStopService by lazy {
        SearchForStopServiceImpl(clientOptions)
    }

    private val searchForRoute: SearchForRouteService by lazy {
        SearchForRouteServiceImpl(clientOptions)
    }

    private val block: BlockService by lazy { BlockServiceImpl(clientOptions) }

    private val shape: ShapeService by lazy { ShapeServiceImpl(clientOptions) }

    override fun async(): OnebusawaySdkClientAsync = async

    override fun agenciesWithCoverage(): AgenciesWithCoverageService = agenciesWithCoverage

    override fun agency(): AgencyService = agency

    override fun vehiclesForAgency(): VehiclesForAgencyService = vehiclesForAgency

    override fun config(): ConfigService = config

    override fun currentTime(): CurrentTimeService = currentTime

    override fun stopsForLocation(): StopsForLocationService = stopsForLocation

    override fun stopsForRoute(): StopsForRouteService = stopsForRoute

    override fun stop(): StopService = stop

    override fun stopIdsForAgency(): StopIdsForAgencyService = stopIdsForAgency

    override fun scheduleForStop(): ScheduleForStopService = scheduleForStop

    override fun route(): RouteService = route

    override fun routeIdsForAgency(): RouteIdsForAgencyService = routeIdsForAgency

    override fun routesForLocation(): RoutesForLocationService = routesForLocation

    override fun routesForAgency(): RoutesForAgencyService = routesForAgency

    override fun scheduleForRoute(): ScheduleForRouteService = scheduleForRoute

    override fun arrivalAndDeparture(): ArrivalAndDepartureService = arrivalAndDeparture

    override fun trip(): TripService = trip

    override fun tripsForLocation(): TripsForLocationService = tripsForLocation

    override fun tripDetails(): TripDetailService = tripDetails

    override fun tripForVehicle(): TripForVehicleService = tripForVehicle

    override fun tripsForRoute(): TripsForRouteService = tripsForRoute

    override fun reportProblemWithStop(): ReportProblemWithStopService = reportProblemWithStop

    override fun reportProblemWithTrip(): ReportProblemWithTripService = reportProblemWithTrip

    override fun searchForStop(): SearchForStopService = searchForStop

    override fun searchForRoute(): SearchForRouteService = searchForRoute

    override fun block(): BlockService = block

    override fun shape(): ShapeService = shape
}
