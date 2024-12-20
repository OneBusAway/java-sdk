// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun lat(): Double = lat

    fun latSpan(): Double = latSpan

    fun lon(): Double = lon

    fun lonSpan(): Double = lonSpan

    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.lat.let { params.put("lat", listOf(it.toString())) }
        this.latSpan.let { params.put("latSpan", listOf(it.toString())) }
        this.lon.let { params.put("lon", listOf(it.toString())) }
        this.lonSpan.let { params.put("lonSpan", listOf(it.toString())) }
        this.includeSchedule?.let { params.put("includeSchedule", listOf(it.toString())) }
        this.includeTrip?.let { params.put("includeTrip", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripsForLocationListParams && this.lat == other.lat && this.latSpan == other.latSpan && this.lon == other.lon && this.lonSpan == other.lonSpan && this.includeSchedule == other.includeSchedule && this.includeTrip == other.includeTrip && this.time == other.time && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(lat, latSpan, lon, lonSpan, includeSchedule, includeTrip, time, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "TripsForLocationListParams{lat=$lat, latSpan=$latSpan, lon=$lon, lonSpan=$lonSpan, includeSchedule=$includeSchedule, includeTrip=$includeTrip, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(tripsForLocationListParams: TripsForLocationListParams) = apply {
            this.lat = tripsForLocationListParams.lat
            this.latSpan = tripsForLocationListParams.latSpan
            this.lon = tripsForLocationListParams.lon
            this.lonSpan = tripsForLocationListParams.lonSpan
            this.includeSchedule = tripsForLocationListParams.includeSchedule
            this.includeTrip = tripsForLocationListParams.includeTrip
            this.time = tripsForLocationListParams.time
            additionalHeaders(tripsForLocationListParams.additionalHeaders)
            additionalQueryParams(tripsForLocationListParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
