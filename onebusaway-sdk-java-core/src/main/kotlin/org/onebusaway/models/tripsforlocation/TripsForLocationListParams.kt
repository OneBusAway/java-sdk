// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripsforlocation

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Retrieve trips for a given location */
class TripsForLocationListParams
private constructor(
    private val lat: Float,
    private val latSpan: Float,
    private val lon: Float,
    private val lonSpan: Float,
    private val includeSchedule: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The latitude coordinate of the search center */
    fun lat(): Float = lat

    /** Latitude span of the search bounding box */
    fun latSpan(): Float = latSpan

    /** The longitude coordinate of the search center */
    fun lon(): Float = lon

    /** Longitude span of the search bounding box */
    fun lonSpan(): Float = lonSpan

    /** Whether to include full schedule elements in the tripDetails section. Defaults to false. */
    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    /** Whether to include full trip elements in the references section. Defaults to false. */
    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    /** Specific time for the query. Defaults to the current time. */
    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TripsForLocationListParams].
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .latSpan()
         * .lon()
         * .lonSpan()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripsForLocationListParams]. */
    class Builder internal constructor() {

        private var lat: Float? = null
        private var latSpan: Float? = null
        private var lon: Float? = null
        private var lonSpan: Float? = null
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
        fun lat(lat: Float) = apply { this.lat = lat }

        /** Latitude span of the search bounding box */
        fun latSpan(latSpan: Float) = apply { this.latSpan = latSpan }

        /** The longitude coordinate of the search center */
        fun lon(lon: Float) = apply { this.lon = lon }

        /** Longitude span of the search bounding box */
        fun lonSpan(lonSpan: Float) = apply { this.lonSpan = lonSpan }

        /**
         * Whether to include full schedule elements in the tripDetails section. Defaults to false.
         */
        fun includeSchedule(includeSchedule: Boolean?) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Alias for [Builder.includeSchedule].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSchedule(includeSchedule: Boolean) = includeSchedule(includeSchedule as Boolean?)

        /** Alias for calling [Builder.includeSchedule] with `includeSchedule.orElse(null)`. */
        fun includeSchedule(includeSchedule: Optional<Boolean>) =
            includeSchedule(includeSchedule.getOrNull())

        /** Whether to include full trip elements in the references section. Defaults to false. */
        fun includeTrip(includeTrip: Boolean?) = apply { this.includeTrip = includeTrip }

        /**
         * Alias for [Builder.includeTrip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTrip(includeTrip: Boolean) = includeTrip(includeTrip as Boolean?)

        /** Alias for calling [Builder.includeTrip] with `includeTrip.orElse(null)`. */
        fun includeTrip(includeTrip: Optional<Boolean>) = includeTrip(includeTrip.getOrNull())

        /** Specific time for the query. Defaults to the current time. */
        fun time(time: Long?) = apply { this.time = time }

        /**
         * Alias for [Builder.time].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun time(time: Long) = time(time as Long?)

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<Long>) = time(time.getOrNull())

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

        /**
         * Returns an immutable instance of [TripsForLocationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .latSpan()
         * .lon()
         * .lonSpan()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TripsForLocationListParams =
            TripsForLocationListParams(
                checkRequired("lat", lat),
                checkRequired("latSpan", latSpan),
                checkRequired("lon", lon),
                checkRequired("lonSpan", lonSpan),
                includeSchedule,
                includeTrip,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("lat", lat.toString())
                put("latSpan", latSpan.toString())
                put("lon", lon.toString())
                put("lonSpan", lonSpan.toString())
                includeSchedule?.let { put("includeSchedule", it.toString()) }
                includeTrip?.let { put("includeTrip", it.toString()) }
                time?.let { put("time", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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
