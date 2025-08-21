// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.getPackageVersion
import org.onebusaway.services.blocking.AgenciesWithCoverageService
import org.onebusaway.services.blocking.AgenciesWithCoverageServiceImpl
import org.onebusaway.services.blocking.AgencyService
import org.onebusaway.services.blocking.AgencyServiceImpl
import org.onebusaway.services.blocking.ArrivalAndDepartureService
import org.onebusaway.services.blocking.ArrivalAndDepartureServiceImpl
import org.onebusaway.services.blocking.BlockService
import org.onebusaway.services.blocking.BlockServiceImpl
import org.onebusaway.services.blocking.ConfigService
import org.onebusaway.services.blocking.ConfigServiceImpl
import org.onebusaway.services.blocking.CurrentTimeService
import org.onebusaway.services.blocking.CurrentTimeServiceImpl
import org.onebusaway.services.blocking.ReportProblemWithStopService
import org.onebusaway.services.blocking.ReportProblemWithStopServiceImpl
import org.onebusaway.services.blocking.ReportProblemWithTripService
import org.onebusaway.services.blocking.ReportProblemWithTripServiceImpl
import org.onebusaway.services.blocking.RouteIdsForAgencyService
import org.onebusaway.services.blocking.RouteIdsForAgencyServiceImpl
import org.onebusaway.services.blocking.RouteService
import org.onebusaway.services.blocking.RouteServiceImpl
import org.onebusaway.services.blocking.RoutesForAgencyService
import org.onebusaway.services.blocking.RoutesForAgencyServiceImpl
import org.onebusaway.services.blocking.RoutesForLocationService
import org.onebusaway.services.blocking.RoutesForLocationServiceImpl
import org.onebusaway.services.blocking.ScheduleForRouteService
import org.onebusaway.services.blocking.ScheduleForRouteServiceImpl
import org.onebusaway.services.blocking.ScheduleForStopService
import org.onebusaway.services.blocking.ScheduleForStopServiceImpl
import org.onebusaway.services.blocking.SearchForRouteService
import org.onebusaway.services.blocking.SearchForRouteServiceImpl
import org.onebusaway.services.blocking.SearchForStopService
import org.onebusaway.services.blocking.SearchForStopServiceImpl
import org.onebusaway.services.blocking.ShapeService
import org.onebusaway.services.blocking.ShapeServiceImpl
import org.onebusaway.services.blocking.StopIdsForAgencyService
import org.onebusaway.services.blocking.StopIdsForAgencyServiceImpl
import org.onebusaway.services.blocking.StopService
import org.onebusaway.services.blocking.StopServiceImpl
import org.onebusaway.services.blocking.StopsForAgencyService
import org.onebusaway.services.blocking.StopsForAgencyServiceImpl
import org.onebusaway.services.blocking.StopsForLocationService
import org.onebusaway.services.blocking.StopsForLocationServiceImpl
import org.onebusaway.services.blocking.StopsForRouteService
import org.onebusaway.services.blocking.StopsForRouteServiceImpl
import org.onebusaway.services.blocking.TripDetailService
import org.onebusaway.services.blocking.TripDetailServiceImpl
import org.onebusaway.services.blocking.TripForVehicleService
import org.onebusaway.services.blocking.TripForVehicleServiceImpl
import org.onebusaway.services.blocking.TripService
import org.onebusaway.services.blocking.TripServiceImpl
import org.onebusaway.services.blocking.TripsForLocationService
import org.onebusaway.services.blocking.TripsForLocationServiceImpl
import org.onebusaway.services.blocking.TripsForRouteService
import org.onebusaway.services.blocking.TripsForRouteServiceImpl
import org.onebusaway.services.blocking.VehiclesForAgencyService
import org.onebusaway.services.blocking.VehiclesForAgencyServiceImpl

class OnebusawaySdkClientImpl(private val clientOptions: ClientOptions) : OnebusawaySdkClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OnebusawaySdkClientAsync by lazy {
        OnebusawaySdkClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: OnebusawaySdkClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agenciesWithCoverage: AgenciesWithCoverageService by lazy {
        AgenciesWithCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val agency: AgencyService by lazy { AgencyServiceImpl(clientOptionsWithUserAgent) }

    private val vehiclesForAgency: VehiclesForAgencyService by lazy {
        VehiclesForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptionsWithUserAgent) }

    private val currentTime: CurrentTimeService by lazy {
        CurrentTimeServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForLocation: StopsForLocationService by lazy {
        StopsForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForRoute: StopsForRouteService by lazy {
        StopsForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForAgency: StopsForAgencyService by lazy {
        StopsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val stop: StopService by lazy { StopServiceImpl(clientOptionsWithUserAgent) }

    private val stopIdsForAgency: StopIdsForAgencyService by lazy {
        StopIdsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForStop: ScheduleForStopService by lazy {
        ScheduleForStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val route: RouteService by lazy { RouteServiceImpl(clientOptionsWithUserAgent) }

    private val routeIdsForAgency: RouteIdsForAgencyService by lazy {
        RouteIdsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val routesForLocation: RoutesForLocationService by lazy {
        RoutesForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val routesForAgency: RoutesForAgencyService by lazy {
        RoutesForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForRoute: ScheduleForRouteService by lazy {
        ScheduleForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val arrivalAndDeparture: ArrivalAndDepartureService by lazy {
        ArrivalAndDepartureServiceImpl(clientOptionsWithUserAgent)
    }

    private val trip: TripService by lazy { TripServiceImpl(clientOptionsWithUserAgent) }

    private val tripsForLocation: TripsForLocationService by lazy {
        TripsForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripDetails: TripDetailService by lazy {
        TripDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripForVehicle: TripForVehicleService by lazy {
        TripForVehicleServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripsForRoute: TripsForRouteService by lazy {
        TripsForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithStop: ReportProblemWithStopService by lazy {
        ReportProblemWithStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithTrip: ReportProblemWithTripService by lazy {
        ReportProblemWithTripServiceImpl(clientOptionsWithUserAgent)
    }

    private val searchForStop: SearchForStopService by lazy {
        SearchForStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val searchForRoute: SearchForRouteService by lazy {
        SearchForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val block: BlockService by lazy { BlockServiceImpl(clientOptionsWithUserAgent) }

    private val shape: ShapeService by lazy { ShapeServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): OnebusawaySdkClientAsync = async

    override fun withRawResponse(): OnebusawaySdkClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnebusawaySdkClient =
        OnebusawaySdkClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agenciesWithCoverage(): AgenciesWithCoverageService = agenciesWithCoverage

    override fun agency(): AgencyService = agency

    override fun vehiclesForAgency(): VehiclesForAgencyService = vehiclesForAgency

    override fun config(): ConfigService = config

    override fun currentTime(): CurrentTimeService = currentTime

    override fun stopsForLocation(): StopsForLocationService = stopsForLocation

    override fun stopsForRoute(): StopsForRouteService = stopsForRoute

    override fun stopsForAgency(): StopsForAgencyService = stopsForAgency

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

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnebusawaySdkClient.WithRawResponse {

        private val agenciesWithCoverage: AgenciesWithCoverageService.WithRawResponse by lazy {
            AgenciesWithCoverageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val agency: AgencyService.WithRawResponse by lazy {
            AgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vehiclesForAgency: VehiclesForAgencyService.WithRawResponse by lazy {
            VehiclesForAgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val currentTime: CurrentTimeService.WithRawResponse by lazy {
            CurrentTimeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stopsForLocation: StopsForLocationService.WithRawResponse by lazy {
            StopsForLocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stopsForRoute: StopsForRouteService.WithRawResponse by lazy {
            StopsForRouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stopsForAgency: StopsForAgencyService.WithRawResponse by lazy {
            StopsForAgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stop: StopService.WithRawResponse by lazy {
            StopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stopIdsForAgency: StopIdsForAgencyService.WithRawResponse by lazy {
            StopIdsForAgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduleForStop: ScheduleForStopService.WithRawResponse by lazy {
            ScheduleForStopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val route: RouteService.WithRawResponse by lazy {
            RouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeIdsForAgency: RouteIdsForAgencyService.WithRawResponse by lazy {
            RouteIdsForAgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routesForLocation: RoutesForLocationService.WithRawResponse by lazy {
            RoutesForLocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routesForAgency: RoutesForAgencyService.WithRawResponse by lazy {
            RoutesForAgencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduleForRoute: ScheduleForRouteService.WithRawResponse by lazy {
            ScheduleForRouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val arrivalAndDeparture: ArrivalAndDepartureService.WithRawResponse by lazy {
            ArrivalAndDepartureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val trip: TripService.WithRawResponse by lazy {
            TripServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tripsForLocation: TripsForLocationService.WithRawResponse by lazy {
            TripsForLocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tripDetails: TripDetailService.WithRawResponse by lazy {
            TripDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tripForVehicle: TripForVehicleService.WithRawResponse by lazy {
            TripForVehicleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tripsForRoute: TripsForRouteService.WithRawResponse by lazy {
            TripsForRouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reportProblemWithStop: ReportProblemWithStopService.WithRawResponse by lazy {
            ReportProblemWithStopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reportProblemWithTrip: ReportProblemWithTripService.WithRawResponse by lazy {
            ReportProblemWithTripServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val searchForStop: SearchForStopService.WithRawResponse by lazy {
            SearchForStopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val searchForRoute: SearchForRouteService.WithRawResponse by lazy {
            SearchForRouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val block: BlockService.WithRawResponse by lazy {
            BlockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shape: ShapeService.WithRawResponse by lazy {
            ShapeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnebusawaySdkClient.WithRawResponse =
            OnebusawaySdkClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agenciesWithCoverage(): AgenciesWithCoverageService.WithRawResponse =
            agenciesWithCoverage

        override fun agency(): AgencyService.WithRawResponse = agency

        override fun vehiclesForAgency(): VehiclesForAgencyService.WithRawResponse =
            vehiclesForAgency

        override fun config(): ConfigService.WithRawResponse = config

        override fun currentTime(): CurrentTimeService.WithRawResponse = currentTime

        override fun stopsForLocation(): StopsForLocationService.WithRawResponse = stopsForLocation

        override fun stopsForRoute(): StopsForRouteService.WithRawResponse = stopsForRoute

        override fun stopsForAgency(): StopsForAgencyService.WithRawResponse = stopsForAgency

        override fun stop(): StopService.WithRawResponse = stop

        override fun stopIdsForAgency(): StopIdsForAgencyService.WithRawResponse = stopIdsForAgency

        override fun scheduleForStop(): ScheduleForStopService.WithRawResponse = scheduleForStop

        override fun route(): RouteService.WithRawResponse = route

        override fun routeIdsForAgency(): RouteIdsForAgencyService.WithRawResponse =
            routeIdsForAgency

        override fun routesForLocation(): RoutesForLocationService.WithRawResponse =
            routesForLocation

        override fun routesForAgency(): RoutesForAgencyService.WithRawResponse = routesForAgency

        override fun scheduleForRoute(): ScheduleForRouteService.WithRawResponse = scheduleForRoute

        override fun arrivalAndDeparture(): ArrivalAndDepartureService.WithRawResponse =
            arrivalAndDeparture

        override fun trip(): TripService.WithRawResponse = trip

        override fun tripsForLocation(): TripsForLocationService.WithRawResponse = tripsForLocation

        override fun tripDetails(): TripDetailService.WithRawResponse = tripDetails

        override fun tripForVehicle(): TripForVehicleService.WithRawResponse = tripForVehicle

        override fun tripsForRoute(): TripsForRouteService.WithRawResponse = tripsForRoute

        override fun reportProblemWithStop(): ReportProblemWithStopService.WithRawResponse =
            reportProblemWithStop

        override fun reportProblemWithTrip(): ReportProblemWithTripService.WithRawResponse =
            reportProblemWithTrip

        override fun searchForStop(): SearchForStopService.WithRawResponse = searchForStop

        override fun searchForRoute(): SearchForRouteService.WithRawResponse = searchForRoute

        override fun block(): BlockService.WithRawResponse = block

        override fun shape(): ShapeService.WithRawResponse = shape
    }
}
