// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
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

/**
 * A client for interacting with the Onebusaway SDK REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface OnebusawaySdkClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): OnebusawaySdkClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnebusawaySdkClient

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

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [OnebusawaySdkClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnebusawaySdkClient.WithRawResponse

        fun agenciesWithCoverage(): AgenciesWithCoverageService.WithRawResponse

        fun agency(): AgencyService.WithRawResponse

        fun vehiclesForAgency(): VehiclesForAgencyService.WithRawResponse

        fun config(): ConfigService.WithRawResponse

        fun currentTime(): CurrentTimeService.WithRawResponse

        fun stopsForLocation(): StopsForLocationService.WithRawResponse

        fun stopsForRoute(): StopsForRouteService.WithRawResponse

        fun stopsForAgency(): StopsForAgencyService.WithRawResponse

        fun stop(): StopService.WithRawResponse

        fun stopIdsForAgency(): StopIdsForAgencyService.WithRawResponse

        fun scheduleForStop(): ScheduleForStopService.WithRawResponse

        fun route(): RouteService.WithRawResponse

        fun routeIdsForAgency(): RouteIdsForAgencyService.WithRawResponse

        fun routesForLocation(): RoutesForLocationService.WithRawResponse

        fun routesForAgency(): RoutesForAgencyService.WithRawResponse

        fun scheduleForRoute(): ScheduleForRouteService.WithRawResponse

        fun arrivalAndDeparture(): ArrivalAndDepartureService.WithRawResponse

        fun trip(): TripService.WithRawResponse

        fun tripsForLocation(): TripsForLocationService.WithRawResponse

        fun tripDetails(): TripDetailService.WithRawResponse

        fun tripForVehicle(): TripForVehicleService.WithRawResponse

        fun tripsForRoute(): TripsForRouteService.WithRawResponse

        fun reportProblemWithStop(): ReportProblemWithStopService.WithRawResponse

        fun reportProblemWithTrip(): ReportProblemWithTripService.WithRawResponse

        fun searchForStop(): SearchForStopService.WithRawResponse

        fun searchForRoute(): SearchForRouteService.WithRawResponse

        fun block(): BlockService.WithRawResponse

        fun shape(): ShapeService.WithRawResponse
    }
}
