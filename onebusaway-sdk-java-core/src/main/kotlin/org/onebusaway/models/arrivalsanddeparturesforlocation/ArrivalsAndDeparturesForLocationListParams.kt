// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalsanddeparturesforlocation

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/**
 * Returns real-time arrival and departure data for stops within a bounding box or radius centered
 * on a specific location.
 */
class ArrivalsAndDeparturesForLocationListParams
private constructor(
    private val lat: Double,
    private val lon: Double,
    private val emptyReturnsNotFound: Boolean?,
    private val latSpan: Double?,
    private val lonSpan: Double?,
    private val maxCount: Long?,
    private val minutesAfter: Long?,
    private val minutesBefore: Long?,
    private val radius: Double?,
    private val routeType: String?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The latitude coordinate of the search center. */
    fun lat(): Double = lat

    /** The longitude coordinate of the search center. */
    fun lon(): Double = lon

    /** If true, returns a 404 Not Found error instead of an empty result. */
    fun emptyReturnsNotFound(): Optional<Boolean> = Optional.ofNullable(emptyReturnsNotFound)

    /** Sets the latitude limits of the search bounding box. */
    fun latSpan(): Optional<Double> = Optional.ofNullable(latSpan)

    /** Sets the longitude limits of the search bounding box. */
    fun lonSpan(): Optional<Double> = Optional.ofNullable(lonSpan)

    /**
     * The max size of the list of nearby stops and arrivals to return. Defaults to 250, max 1000.
     */
    fun maxCount(): Optional<Long> = Optional.ofNullable(maxCount)

    /** Include arrivals and departures this many minutes after the query time. */
    fun minutesAfter(): Optional<Long> = Optional.ofNullable(minutesAfter)

    /** Include arrivals and departures this many minutes before the query time. */
    fun minutesBefore(): Optional<Long> = Optional.ofNullable(minutesBefore)

    /** The search radius in meters. */
    fun radius(): Optional<Double> = Optional.ofNullable(radius)

    /** Optional list of GTFS routeTypes to filter by (comma delimited) e.g. "1,2,3". */
    fun routeType(): Optional<String> = Optional.ofNullable(routeType)

    /**
     * By default, returns the status right now. Can be queried at a specific time (milliseconds
     * since epoch) for testing.
     */
    fun time(): Optional<Long> = Optional.ofNullable(time)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ArrivalsAndDeparturesForLocationListParams].
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lon()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArrivalsAndDeparturesForLocationListParams]. */
    class Builder internal constructor() {

        private var lat: Double? = null
        private var lon: Double? = null
        private var emptyReturnsNotFound: Boolean? = null
        private var latSpan: Double? = null
        private var lonSpan: Double? = null
        private var maxCount: Long? = null
        private var minutesAfter: Long? = null
        private var minutesBefore: Long? = null
        private var radius: Double? = null
        private var routeType: String? = null
        private var time: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            arrivalsAndDeparturesForLocationListParams: ArrivalsAndDeparturesForLocationListParams
        ) = apply {
            lat = arrivalsAndDeparturesForLocationListParams.lat
            lon = arrivalsAndDeparturesForLocationListParams.lon
            emptyReturnsNotFound = arrivalsAndDeparturesForLocationListParams.emptyReturnsNotFound
            latSpan = arrivalsAndDeparturesForLocationListParams.latSpan
            lonSpan = arrivalsAndDeparturesForLocationListParams.lonSpan
            maxCount = arrivalsAndDeparturesForLocationListParams.maxCount
            minutesAfter = arrivalsAndDeparturesForLocationListParams.minutesAfter
            minutesBefore = arrivalsAndDeparturesForLocationListParams.minutesBefore
            radius = arrivalsAndDeparturesForLocationListParams.radius
            routeType = arrivalsAndDeparturesForLocationListParams.routeType
            time = arrivalsAndDeparturesForLocationListParams.time
            additionalHeaders =
                arrivalsAndDeparturesForLocationListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                arrivalsAndDeparturesForLocationListParams.additionalQueryParams.toBuilder()
        }

        /** The latitude coordinate of the search center. */
        fun lat(lat: Double) = apply { this.lat = lat }

        /** The longitude coordinate of the search center. */
        fun lon(lon: Double) = apply { this.lon = lon }

        /** If true, returns a 404 Not Found error instead of an empty result. */
        fun emptyReturnsNotFound(emptyReturnsNotFound: Boolean?) = apply {
            this.emptyReturnsNotFound = emptyReturnsNotFound
        }

        /**
         * Alias for [Builder.emptyReturnsNotFound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun emptyReturnsNotFound(emptyReturnsNotFound: Boolean) =
            emptyReturnsNotFound(emptyReturnsNotFound as Boolean?)

        /**
         * Alias for calling [Builder.emptyReturnsNotFound] with
         * `emptyReturnsNotFound.orElse(null)`.
         */
        fun emptyReturnsNotFound(emptyReturnsNotFound: Optional<Boolean>) =
            emptyReturnsNotFound(emptyReturnsNotFound.getOrNull())

        /** Sets the latitude limits of the search bounding box. */
        fun latSpan(latSpan: Double?) = apply { this.latSpan = latSpan }

        /**
         * Alias for [Builder.latSpan].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latSpan(latSpan: Double) = latSpan(latSpan as Double?)

        /** Alias for calling [Builder.latSpan] with `latSpan.orElse(null)`. */
        fun latSpan(latSpan: Optional<Double>) = latSpan(latSpan.getOrNull())

        /** Sets the longitude limits of the search bounding box. */
        fun lonSpan(lonSpan: Double?) = apply { this.lonSpan = lonSpan }

        /**
         * Alias for [Builder.lonSpan].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lonSpan(lonSpan: Double) = lonSpan(lonSpan as Double?)

        /** Alias for calling [Builder.lonSpan] with `lonSpan.orElse(null)`. */
        fun lonSpan(lonSpan: Optional<Double>) = lonSpan(lonSpan.getOrNull())

        /**
         * The max size of the list of nearby stops and arrivals to return. Defaults to 250,
         * max 1000.
         */
        fun maxCount(maxCount: Long?) = apply { this.maxCount = maxCount }

        /**
         * Alias for [Builder.maxCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxCount(maxCount: Long) = maxCount(maxCount as Long?)

        /** Alias for calling [Builder.maxCount] with `maxCount.orElse(null)`. */
        fun maxCount(maxCount: Optional<Long>) = maxCount(maxCount.getOrNull())

        /** Include arrivals and departures this many minutes after the query time. */
        fun minutesAfter(minutesAfter: Long?) = apply { this.minutesAfter = minutesAfter }

        /**
         * Alias for [Builder.minutesAfter].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesAfter(minutesAfter: Long) = minutesAfter(minutesAfter as Long?)

        /** Alias for calling [Builder.minutesAfter] with `minutesAfter.orElse(null)`. */
        fun minutesAfter(minutesAfter: Optional<Long>) = minutesAfter(minutesAfter.getOrNull())

        /** Include arrivals and departures this many minutes before the query time. */
        fun minutesBefore(minutesBefore: Long?) = apply { this.minutesBefore = minutesBefore }

        /**
         * Alias for [Builder.minutesBefore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesBefore(minutesBefore: Long) = minutesBefore(minutesBefore as Long?)

        /** Alias for calling [Builder.minutesBefore] with `minutesBefore.orElse(null)`. */
        fun minutesBefore(minutesBefore: Optional<Long>) = minutesBefore(minutesBefore.getOrNull())

        /** The search radius in meters. */
        fun radius(radius: Double?) = apply { this.radius = radius }

        /**
         * Alias for [Builder.radius].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun radius(radius: Double) = radius(radius as Double?)

        /** Alias for calling [Builder.radius] with `radius.orElse(null)`. */
        fun radius(radius: Optional<Double>) = radius(radius.getOrNull())

        /** Optional list of GTFS routeTypes to filter by (comma delimited) e.g. "1,2,3". */
        fun routeType(routeType: String?) = apply { this.routeType = routeType }

        /** Alias for calling [Builder.routeType] with `routeType.orElse(null)`. */
        fun routeType(routeType: Optional<String>) = routeType(routeType.getOrNull())

        /**
         * By default, returns the status right now. Can be queried at a specific time (milliseconds
         * since epoch) for testing.
         */
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
         * Returns an immutable instance of [ArrivalsAndDeparturesForLocationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lon()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArrivalsAndDeparturesForLocationListParams =
            ArrivalsAndDeparturesForLocationListParams(
                checkRequired("lat", lat),
                checkRequired("lon", lon),
                emptyReturnsNotFound,
                latSpan,
                lonSpan,
                maxCount,
                minutesAfter,
                minutesBefore,
                radius,
                routeType,
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
                put("lon", lon.toString())
                emptyReturnsNotFound?.let { put("emptyReturnsNotFound", it.toString()) }
                latSpan?.let { put("latSpan", it.toString()) }
                lonSpan?.let { put("lonSpan", it.toString()) }
                maxCount?.let { put("maxCount", it.toString()) }
                minutesAfter?.let { put("minutesAfter", it.toString()) }
                minutesBefore?.let { put("minutesBefore", it.toString()) }
                radius?.let { put("radius", it.toString()) }
                routeType?.let { put("routeType", it) }
                time?.let { put("time", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArrivalsAndDeparturesForLocationListParams &&
            lat == other.lat &&
            lon == other.lon &&
            emptyReturnsNotFound == other.emptyReturnsNotFound &&
            latSpan == other.latSpan &&
            lonSpan == other.lonSpan &&
            maxCount == other.maxCount &&
            minutesAfter == other.minutesAfter &&
            minutesBefore == other.minutesBefore &&
            radius == other.radius &&
            routeType == other.routeType &&
            time == other.time &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            lat,
            lon,
            emptyReturnsNotFound,
            latSpan,
            lonSpan,
            maxCount,
            minutesAfter,
            minutesBefore,
            radius,
            routeType,
            time,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ArrivalsAndDeparturesForLocationListParams{lat=$lat, lon=$lon, emptyReturnsNotFound=$emptyReturnsNotFound, latSpan=$latSpan, lonSpan=$lonSpan, maxCount=$maxCount, minutesAfter=$minutesAfter, minutesBefore=$minutesBefore, radius=$radius, routeType=$routeType, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
