// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class StopsForRouteListParams
constructor(
    private val routeId: String,
    private val includePolylines: Boolean?,
    private val time: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun routeId(): String = routeId

    fun includePolylines(): Optional<Boolean> = Optional.ofNullable(includePolylines)

    fun time(): Optional<String> = Optional.ofNullable(time)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.includePolylines?.let { params.put("includePolylines", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> routeId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForRouteListParams && this.routeId == other.routeId && this.includePolylines == other.includePolylines && this.time == other.time && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(routeId, includePolylines, time, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "StopsForRouteListParams{routeId=$routeId, includePolylines=$includePolylines, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routeId: String? = null
        private var includePolylines: Boolean? = null
        private var time: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(stopsForRouteListParams: StopsForRouteListParams) = apply {
            this.routeId = stopsForRouteListParams.routeId
            this.includePolylines = stopsForRouteListParams.includePolylines
            this.time = stopsForRouteListParams.time
            additionalHeaders(stopsForRouteListParams.additionalHeaders)
            additionalQueryParams(stopsForRouteListParams.additionalQueryParams)
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Include polyline elements in the response (default true) */
        fun includePolylines(includePolylines: Boolean) = apply {
            this.includePolylines = includePolylines
        }

        /** Specify service date (YYYY-MM-DD or epoch) (default today) */
        fun time(time: String) = apply { this.time = time }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): StopsForRouteListParams =
            StopsForRouteListParams(
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                includePolylines,
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
