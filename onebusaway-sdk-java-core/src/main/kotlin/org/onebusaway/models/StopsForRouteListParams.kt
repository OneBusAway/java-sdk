// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable
import org.onebusaway.models.*

class StopsForRouteListParams
constructor(
    private val routeId: String,
    private val includePolylines: Boolean?,
    private val time: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun routeId(): String = routeId

    fun includePolylines(): Optional<Boolean> = Optional.ofNullable(includePolylines)

    fun time(): Optional<String> = Optional.ofNullable(time)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.includePolylines?.let { params.put("includePolylines", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> routeId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForRouteListParams && this.routeId == other.routeId && this.includePolylines == other.includePolylines && this.time == other.time && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(routeId, includePolylines, time, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "StopsForRouteListParams{routeId=$routeId, includePolylines=$includePolylines, time=$time, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routeId: String? = null
        private var includePolylines: Boolean? = null
        private var time: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopsForRouteListParams: StopsForRouteListParams) = apply {
            this.routeId = stopsForRouteListParams.routeId
            this.includePolylines = stopsForRouteListParams.includePolylines
            this.time = stopsForRouteListParams.time
            additionalQueryParams(stopsForRouteListParams.additionalQueryParams)
            additionalHeaders(stopsForRouteListParams.additionalHeaders)
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Include polyline elements in the response (default true) */
        fun includePolylines(includePolylines: Boolean) = apply {
            this.includePolylines = includePolylines
        }

        /** Specify service date (YYYY-MM-DD or epoch) (default today) */
        fun time(time: String) = apply { this.time = time }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): StopsForRouteListParams =
            StopsForRouteListParams(
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                includePolylines,
                time,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
