// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stopsforroute

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Get stops for a specific route */
class StopsForRouteListParams
private constructor(
    private val routeId: String?,
    private val includePolylines: Boolean?,
    private val time: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    /** Include polyline elements in the response (default true) */
    fun includePolylines(): Optional<Boolean> = Optional.ofNullable(includePolylines)

    /** Specify service date (YYYY-MM-DD or epoch) (default today) */
    fun time(): Optional<String> = Optional.ofNullable(time)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StopsForRouteListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StopsForRouteListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StopsForRouteListParams]. */
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

        fun routeId(routeId: String?) = apply { this.routeId = routeId }

        /** Alias for calling [Builder.routeId] with `routeId.orElse(null)`. */
        fun routeId(routeId: Optional<String>) = routeId(routeId.getOrNull())

        /** Include polyline elements in the response (default true) */
        fun includePolylines(includePolylines: Boolean?) = apply {
            this.includePolylines = includePolylines
        }

        /**
         * Alias for [Builder.includePolylines].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includePolylines(includePolylines: Boolean) =
            includePolylines(includePolylines as Boolean?)

        /** Alias for calling [Builder.includePolylines] with `includePolylines.orElse(null)`. */
        fun includePolylines(includePolylines: Optional<Boolean>) =
            includePolylines(includePolylines.getOrNull())

        /** Specify service date (YYYY-MM-DD or epoch) (default today) */
        fun time(time: String?) = apply { this.time = time }

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<String>) = time(time.getOrNull())

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
         * Returns an immutable instance of [StopsForRouteListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StopsForRouteListParams =
            StopsForRouteListParams(
                routeId,
                includePolylines,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> routeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includePolylines?.let { put("includePolylines", it.toString()) }
                time?.let { put("time", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StopsForRouteListParams &&
            routeId == other.routeId &&
            includePolylines == other.includePolylines &&
            time == other.time &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(routeId, includePolylines, time, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StopsForRouteListParams{routeId=$routeId, includePolylines=$includePolylines, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
