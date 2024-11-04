// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class RoutesForLocationListParams
constructor(
    private val lat: Double,
    private val lon: Double,
    private val latSpan: Double?,
    private val lonSpan: Double?,
    private val query: String?,
    private val radius: Double?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun lat(): Double = lat

    fun lon(): Double = lon

    fun latSpan(): Optional<Double> = Optional.ofNullable(latSpan)

    fun lonSpan(): Optional<Double> = Optional.ofNullable(lonSpan)

    fun query(): Optional<String> = Optional.ofNullable(query)

    fun radius(): Optional<Double> = Optional.ofNullable(radius)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.lat.let { params.put("lat", listOf(it.toString())) }
        this.lon.let { params.put("lon", listOf(it.toString())) }
        this.latSpan?.let { params.put("latSpan", listOf(it.toString())) }
        this.lonSpan?.let { params.put("lonSpan", listOf(it.toString())) }
        this.query?.let { params.put("query", listOf(it.toString())) }
        this.radius?.let { params.put("radius", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutesForLocationListParams && this.lat == other.lat && this.lon == other.lon && this.latSpan == other.latSpan && this.lonSpan == other.lonSpan && this.query == other.query && this.radius == other.radius && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(lat, lon, latSpan, lonSpan, query, radius, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "RoutesForLocationListParams{lat=$lat, lon=$lon, latSpan=$latSpan, lonSpan=$lonSpan, query=$query, radius=$radius, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var lat: Double? = null
        private var lon: Double? = null
        private var latSpan: Double? = null
        private var lonSpan: Double? = null
        private var query: String? = null
        private var radius: Double? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(routesForLocationListParams: RoutesForLocationListParams) = apply {
            this.lat = routesForLocationListParams.lat
            this.lon = routesForLocationListParams.lon
            this.latSpan = routesForLocationListParams.latSpan
            this.lonSpan = routesForLocationListParams.lonSpan
            this.query = routesForLocationListParams.query
            this.radius = routesForLocationListParams.radius
            additionalHeaders(routesForLocationListParams.additionalHeaders)
            additionalQueryParams(routesForLocationListParams.additionalQueryParams)
        }

        fun lat(lat: Double) = apply { this.lat = lat }

        fun lon(lon: Double) = apply { this.lon = lon }

        fun latSpan(latSpan: Double) = apply { this.latSpan = latSpan }

        fun lonSpan(lonSpan: Double) = apply { this.lonSpan = lonSpan }

        fun query(query: String) = apply { this.query = query }

        fun radius(radius: Double) = apply { this.radius = radius }

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

        fun build(): RoutesForLocationListParams =
            RoutesForLocationListParams(
                checkNotNull(lat) { "`lat` is required but was not set" },
                checkNotNull(lon) { "`lon` is required but was not set" },
                latSpan,
                lonSpan,
                query,
                radius,
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
