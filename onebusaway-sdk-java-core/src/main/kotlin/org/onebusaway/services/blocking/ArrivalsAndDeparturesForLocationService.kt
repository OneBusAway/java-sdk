// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.onebusaway.core.ClientOptions
import org.onebusaway.core.RequestOptions
import org.onebusaway.core.http.HttpResponseFor
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListParams
import org.onebusaway.models.arrivalsanddeparturesforlocation.ArrivalsAndDeparturesForLocationListResponse

interface ArrivalsAndDeparturesForLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ArrivalsAndDeparturesForLocationService

    /**
     * Returns real-time arrival and departure data for stops within a bounding box or radius
     * centered on a specific location.
     */
    fun list(
        params: ArrivalsAndDeparturesForLocationListParams
    ): ArrivalsAndDeparturesForLocationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ArrivalsAndDeparturesForLocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArrivalsAndDeparturesForLocationListResponse

    /**
     * A view of [ArrivalsAndDeparturesForLocationService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArrivalsAndDeparturesForLocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/where/arrivals-and-departures-for-location.json`, but is otherwise the same as
         * [ArrivalsAndDeparturesForLocationService.list].
         */
        @MustBeClosed
        fun list(
            params: ArrivalsAndDeparturesForLocationListParams
        ): HttpResponseFor<ArrivalsAndDeparturesForLocationListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ArrivalsAndDeparturesForLocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArrivalsAndDeparturesForLocationListResponse>
    }
}
