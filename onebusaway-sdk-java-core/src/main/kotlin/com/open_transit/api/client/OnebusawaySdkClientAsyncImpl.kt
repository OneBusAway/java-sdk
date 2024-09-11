// File generated from our OpenAPI spec by Stainless.

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

class OnebusawaySdkClientAsyncImpl constructor(private val clientOptions: ClientOptions, ) : OnebusawaySdkClientAsync {

    private val errorHandler: Handler<OnebusawaySdkError> = errorHandler(clientOptions.jsonMapper)

    private val sync: OnebusawaySdkClient by lazy { OnebusawaySdkClientImpl(clientOptions) }

    private val agenciesWithCoverage: AgenciesWithCoverageServiceAsync by lazy { AgenciesWithCoverageServiceAsyncImpl(clientOptions) }

    private val agency: AgencyServiceAsync by lazy { AgencyServiceAsyncImpl(clientOptions) }

    private val vehiclesForAgency: VehiclesForAgencyServiceAsync by lazy { VehiclesForAgencyServiceAsyncImpl(clientOptions) }

    private val config: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    private val currentTime: CurrentTimeServiceAsync by lazy { CurrentTimeServiceAsyncImpl(clientOptions) }

    private val stopsForLocation: StopsForLocationServiceAsync by lazy { StopsForLocationServiceAsyncImpl(clientOptions) }

    private val stopsForRoute: StopsForRouteServiceAsync by lazy { StopsForRouteServiceAsyncImpl(clientOptions) }

    private val stop: StopServiceAsync by lazy { StopServiceAsyncImpl(clientOptions) }

    private val stopIdsForAgency: StopIdsForAgencyServiceAsync by lazy { StopIdsForAgencyServiceAsyncImpl(clientOptions) }

    private val scheduleForStop: ScheduleForStopServiceAsync by lazy { ScheduleForStopServiceAsyncImpl(clientOptions) }

    private val route: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val routeIdsForAgency: RouteIdsForAgencyServiceAsync by lazy { RouteIdsForAgencyServiceAsyncImpl(clientOptions) }

    private val routesForLocation: RoutesForLocationServiceAsync by lazy { RoutesForLocationServiceAsyncImpl(clientOptions) }

    private val routesForAgency: RoutesForAgencyServiceAsync by lazy { RoutesForAgencyServiceAsyncImpl(clientOptions) }

    private val scheduleForRoute: ScheduleForRouteServiceAsync by lazy { ScheduleForRouteServiceAsyncImpl(clientOptions) }

    private val arrivalAndDeparture: ArrivalAndDepartureServiceAsync by lazy { ArrivalAndDepartureServiceAsyncImpl(clientOptions) }

    private val trip: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val tripsForLocation: TripsForLocationServiceAsync by lazy { TripsForLocationServiceAsyncImpl(clientOptions) }

    private val tripDetails: TripDetailServiceAsync by lazy { TripDetailServiceAsyncImpl(clientOptions) }

    private val tripForVehicle: TripForVehicleServiceAsync by lazy { TripForVehicleServiceAsyncImpl(clientOptions) }

    private val tripsForRoute: TripsForRouteServiceAsync by lazy { TripsForRouteServiceAsyncImpl(clientOptions) }

    private val reportProblemWithStop: ReportProblemWithStopServiceAsync by lazy { ReportProblemWithStopServiceAsyncImpl(clientOptions) }

    private val reportProblemWithTrip: ReportProblemWithTripServiceAsync by lazy { ReportProblemWithTripServiceAsyncImpl(clientOptions) }

    private val searchForStop: SearchForStopServiceAsync by lazy { SearchForStopServiceAsyncImpl(clientOptions) }

    private val searchForRoute: SearchForRouteServiceAsync by lazy { SearchForRouteServiceAsyncImpl(clientOptions) }

    private val block: BlockServiceAsync by lazy { BlockServiceAsyncImpl(clientOptions) }

    private val shape: ShapeServiceAsync by lazy { ShapeServiceAsyncImpl(clientOptions) }

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
