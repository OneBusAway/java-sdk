// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Get stops for a specific route */
class StopsForRouteListParams
private constructor(
    private val routeId: String,
    private val includePolylines: Boolean?,
    private val time: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): String = routeId

    /** Include polyline elements in the response (default true) */
    fun includePolylines(): Optional<Boolean> = Optional.ofNullable(includePolylines)

    /** Specify service date (YYYY-MM-DD or epoch) (default today) */
    fun time(): Optional<String> = Optional.ofNullable(time)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includePolylines?.let { queryParams.put("includePolylines", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> routeId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StopsForRouteListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var routeId: String? = null
        private var includePolylines: Boolean? = null
        private var time: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stopsForRouteListParams: StopsForRouteListParams) = apply {
            routeId = stopsForRouteListParams.routeId
            includePolylines = stopsForRouteListParams.includePolylines
            time = stopsForRouteListParams.time
            additionalHeaders = stopsForRouteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = stopsForRouteListParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Include polyline elements in the response (default true) */
        fun includePolylines(includePolylines: Boolean?) = apply {
            this.includePolylines = includePolylines
        }

        /** Include polyline elements in the response (default true) */
        fun includePolylines(includePolylines: Boolean) =
            includePolylines(includePolylines as Boolean?)

        /** Include polyline elements in the response (default true) */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includePolylines(includePolylines: Optional<Boolean>) =
            includePolylines(includePolylines.orElse(null) as Boolean?)

        /** Specify service date (YYYY-MM-DD or epoch) (default today) */
        fun time(time: String?) = apply { this.time = time }

        /** Specify service date (YYYY-MM-DD or epoch) (default today) */
        fun time(time: Optional<String>) = time(time.orElse(null))

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

        fun build(): StopsForRouteListParams =
            StopsForRouteListParams(
                checkRequired("routeId", routeId),
                includePolylines,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForRouteListParams && routeId == other.routeId && includePolylines == other.includePolylines && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, includePolylines, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StopsForRouteListParams{routeId=$routeId, includePolylines=$includePolylines, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
