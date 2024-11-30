// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams
import org.onebusaway.models.*

class TripsForLocationListParams
constructor(
    private val lat: Double,
    private val latSpan: Double,
    private val lon: Double,
    private val lonSpan: Double,
    private val includeSchedule: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun lat(): Double = lat

    fun latSpan(): Double = latSpan

    fun lon(): Double = lon

    fun lonSpan(): Double = lonSpan

    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.lat.let { queryParams.put("lat", listOf(it.toString())) }
        this.latSpan.let { queryParams.put("latSpan", listOf(it.toString())) }
        this.lon.let { queryParams.put("lon", listOf(it.toString())) }
        this.lonSpan.let { queryParams.put("lonSpan", listOf(it.toString())) }
        this.includeSchedule?.let { queryParams.put("includeSchedule", listOf(it.toString())) }
        this.includeTrip?.let { queryParams.put("includeTrip", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var lat: Double? = null
        private var latSpan: Double? = null
        private var lon: Double? = null
        private var lonSpan: Double? = null
        private var includeSchedule: Boolean? = null
        private var includeTrip: Boolean? = null
        private var time: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tripsForLocationListParams: TripsForLocationListParams) = apply {
            lat = tripsForLocationListParams.lat
            latSpan = tripsForLocationListParams.latSpan
            lon = tripsForLocationListParams.lon
            lonSpan = tripsForLocationListParams.lonSpan
            includeSchedule = tripsForLocationListParams.includeSchedule
            includeTrip = tripsForLocationListParams.includeTrip
            time = tripsForLocationListParams.time
            additionalHeaders = tripsForLocationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = tripsForLocationListParams.additionalQueryParams.toBuilder()
        }

        /** The latitude coordinate of the search center */
        fun lat(lat: Double) = apply { this.lat = lat }

        /** Latitude span of the search bounding box */
        fun latSpan(latSpan: Double) = apply { this.latSpan = latSpan }

        /** The longitude coordinate of the search center */
        fun lon(lon: Double) = apply { this.lon = lon }

        /** Longitude span of the search bounding box */
        fun lonSpan(lonSpan: Double) = apply { this.lonSpan = lonSpan }

        /**
         * Whether to include full schedule elements in the tripDetails section. Defaults to false.
         */
        fun includeSchedule(includeSchedule: Boolean) = apply {
            this.includeSchedule = includeSchedule
        }

        /** Whether to include full trip elements in the references section. Defaults to false. */
        fun includeTrip(includeTrip: Boolean) = apply { this.includeTrip = includeTrip }

        /** Specific time for the query. Defaults to the current time. */
        fun time(time: Long) = apply { this.time = time }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): TripsForLocationListParams =
            TripsForLocationListParams(
                checkNotNull(lat) { "`lat` is required but was not set" },
                checkNotNull(latSpan) { "`latSpan` is required but was not set" },
                checkNotNull(lon) { "`lon` is required but was not set" },
                checkNotNull(lonSpan) { "`lonSpan` is required but was not set" },
                includeSchedule,
                includeTrip,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripsForLocationListParams && lat == other.lat && latSpan == other.latSpan && lon == other.lon && lonSpan == other.lonSpan && includeSchedule == other.includeSchedule && includeTrip == other.includeTrip && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lat, latSpan, lon, lonSpan, includeSchedule, includeTrip, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TripsForLocationListParams{lat=$lat, latSpan=$latSpan, lon=$lon, lonSpan=$lonSpan, includeSchedule=$includeSchedule, includeTrip=$includeTrip, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
