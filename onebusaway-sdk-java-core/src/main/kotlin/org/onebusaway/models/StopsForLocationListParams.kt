// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

class StopsForLocationListParams
constructor(
    private val lat: Double,
    private val lon: Double,
    private val latSpan: Double?,
    private val lonSpan: Double?,
    private val query: String?,
    private val radius: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun lat(): Double = lat

    fun lon(): Double = lon

    /** An alternative to radius to set the search bounding box (optional) */
    fun latSpan(): Optional<Double> = Optional.ofNullable(latSpan)

    /** An alternative to radius to set the search bounding box (optional) */
    fun lonSpan(): Optional<Double> = Optional.ofNullable(lonSpan)

    /** A search query string to filter the results */
    fun query(): Optional<String> = Optional.ofNullable(query)

    /** The radius in meters to search within */
    fun radius(): Optional<Double> = Optional.ofNullable(radius)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.lat.let { queryParams.put("lat", listOf(it.toString())) }
        this.lon.let { queryParams.put("lon", listOf(it.toString())) }
        this.latSpan?.let { queryParams.put("latSpan", listOf(it.toString())) }
        this.lonSpan?.let { queryParams.put("lonSpan", listOf(it.toString())) }
        this.query?.let { queryParams.put("query", listOf(it.toString())) }
        this.radius?.let { queryParams.put("radius", listOf(it.toString())) }
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
        private var lon: Double? = null
        private var latSpan: Double? = null
        private var lonSpan: Double? = null
        private var query: String? = null
        private var radius: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stopsForLocationListParams: StopsForLocationListParams) = apply {
            lat = stopsForLocationListParams.lat
            lon = stopsForLocationListParams.lon
            latSpan = stopsForLocationListParams.latSpan
            lonSpan = stopsForLocationListParams.lonSpan
            query = stopsForLocationListParams.query
            radius = stopsForLocationListParams.radius
            additionalHeaders = stopsForLocationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = stopsForLocationListParams.additionalQueryParams.toBuilder()
        }

        fun lat(lat: Double) = apply { this.lat = lat }

        fun lon(lon: Double) = apply { this.lon = lon }

        /** An alternative to radius to set the search bounding box (optional) */
        fun latSpan(latSpan: Double) = apply { this.latSpan = latSpan }

        /** An alternative to radius to set the search bounding box (optional) */
        fun lonSpan(lonSpan: Double) = apply { this.lonSpan = lonSpan }

        /** A search query string to filter the results */
        fun query(query: String) = apply { this.query = query }

        /** The radius in meters to search within */
        fun radius(radius: Double) = apply { this.radius = radius }

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

        fun build(): StopsForLocationListParams =
            StopsForLocationListParams(
                checkNotNull(lat) { "`lat` is required but was not set" },
                checkNotNull(lon) { "`lon` is required but was not set" },
                latSpan,
                lonSpan,
                query,
                radius,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForLocationListParams && lat == other.lat && lon == other.lon && latSpan == other.latSpan && lonSpan == other.lonSpan && query == other.query && radius == other.radius && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lat, lon, latSpan, lonSpan, query, radius, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StopsForLocationListParams{lat=$lat, lon=$lon, latSpan=$latSpan, lonSpan=$lonSpan, query=$query, radius=$radius, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
