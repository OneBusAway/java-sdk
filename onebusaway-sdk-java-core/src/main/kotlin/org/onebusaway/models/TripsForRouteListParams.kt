// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class TripsForRouteListParams
constructor(
    private val routeId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun routeId(): String = routeId

    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    fun includeStatus(): Optional<Boolean> = Optional.ofNullable(includeStatus)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.includeSchedule?.let { params.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { params.put("includeStatus", listOf(it.toString())) }
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

        return /* spotless:off */ other is TripsForRouteListParams && this.routeId == other.routeId && this.includeSchedule == other.includeSchedule && this.includeStatus == other.includeStatus && this.time == other.time && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(routeId, includeSchedule, includeStatus, time, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "TripsForRouteListParams{routeId=$routeId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routeId: String? = null
        private var includeSchedule: Boolean? = null
        private var includeStatus: Boolean? = null
        private var time: Long? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(tripsForRouteListParams: TripsForRouteListParams) = apply {
            this.routeId = tripsForRouteListParams.routeId
            this.includeSchedule = tripsForRouteListParams.includeSchedule
            this.includeStatus = tripsForRouteListParams.includeStatus
            this.time = tripsForRouteListParams.time
            additionalHeaders(tripsForRouteListParams.additionalHeaders)
            additionalQueryParams(tripsForRouteListParams.additionalQueryParams)
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /** Determine whether full schedule elements are included. Defaults to false. */
        fun includeSchedule(includeSchedule: Boolean) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Determine whether full tripStatus elements with real-time information are included.
         * Defaults to false.
         */
        fun includeStatus(includeStatus: Boolean) = apply { this.includeStatus = includeStatus }

        /** Query the system at a specific time. Useful for testing. */
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

        fun build(): TripsForRouteListParams =
            TripsForRouteListParams(
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                includeSchedule,
                includeStatus,
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
