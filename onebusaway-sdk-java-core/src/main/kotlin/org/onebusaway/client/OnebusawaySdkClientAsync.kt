// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.services.async.AgenciesWithCoverageServiceAsync
import org.onebusaway.services.async.AgencyServiceAsync
import org.onebusaway.services.async.ArrivalAndDepartureServiceAsync
import org.onebusaway.services.async.BlockServiceAsync
import org.onebusaway.services.async.ConfigServiceAsync
import org.onebusaway.services.async.CurrentTimeServiceAsync
import org.onebusaway.services.async.ReportProblemWithStopServiceAsync
import org.onebusaway.services.async.ReportProblemWithTripServiceAsync
import org.onebusaway.services.async.RouteIdsForAgencyServiceAsync
import org.onebusaway.services.async.RouteServiceAsync
import org.onebusaway.services.async.RoutesForAgencyServiceAsync
import org.onebusaway.services.async.RoutesForLocationServiceAsync
import org.onebusaway.services.async.ScheduleForRouteServiceAsync
import org.onebusaway.services.async.ScheduleForStopServiceAsync
import org.onebusaway.services.async.SearchForRouteServiceAsync
import org.onebusaway.services.async.SearchForStopServiceAsync
import org.onebusaway.services.async.ShapeServiceAsync
import org.onebusaway.services.async.StopIdsForAgencyServiceAsync
import org.onebusaway.services.async.StopServiceAsync
import org.onebusaway.services.async.StopsForAgencyServiceAsync
import org.onebusaway.services.async.StopsForLocationServiceAsync
import org.onebusaway.services.async.StopsForRouteServiceAsync
import org.onebusaway.services.async.TripDetailServiceAsync
import org.onebusaway.services.async.TripForVehicleServiceAsync
import org.onebusaway.services.async.TripServiceAsync
import org.onebusaway.services.async.TripsForLocationServiceAsync
import org.onebusaway.services.async.TripsForRouteServiceAsync
import org.onebusaway.services.async.VehiclesForAgencyServiceAsync

/**
 * A client for interacting with the Onebusaway SDK REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface OnebusawaySdkClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): OnebusawaySdkClient

    fun agenciesWithCoverage(): AgenciesWithCoverageServiceAsync

    fun agency(): AgencyServiceAsync

    fun vehiclesForAgency(): VehiclesForAgencyServiceAsync

    fun config(): ConfigServiceAsync

    fun currentTime(): CurrentTimeServiceAsync

    fun stopsForLocation(): StopsForLocationServiceAsync

    fun stopsForRoute(): StopsForRouteServiceAsync

    fun stopsForAgency(): StopsForAgencyServiceAsync

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
}
