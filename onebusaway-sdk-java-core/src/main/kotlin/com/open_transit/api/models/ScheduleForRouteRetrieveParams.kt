// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.open_transit.api.core.NoAutoDetect
import com.open_transit.api.core.toUnmodifiable
import com.open_transit.api.models.*
import java.util.Objects
import java.util.Optional

class ScheduleForRouteRetrieveParams
constructor(
    private val routeId: String,
    private val date: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun routeId(): String = routeId

    fun date(): Optional<String> = Optional.ofNullable(date)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.date?.let { params.put("date", listOf(it.toString())) }
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

        return other is ScheduleForRouteRetrieveParams &&
            this.routeId == other.routeId &&
            this.date == other.date &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            routeId,
            date,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ScheduleForRouteRetrieveParams{routeId=$routeId, date=$date, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var routeId: String? = null
        private var date: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleForRouteRetrieveParams: ScheduleForRouteRetrieveParams) = apply {
            this.routeId = scheduleForRouteRetrieveParams.routeId
            this.date = scheduleForRouteRetrieveParams.date
            additionalQueryParams(scheduleForRouteRetrieveParams.additionalQueryParams)
            additionalHeaders(scheduleForRouteRetrieveParams.additionalHeaders)
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        /**
         * The date for which you want to request a schedule in the format YYYY-MM-DD (optional,
         * defaults to current date)
         */
        fun date(date: String) = apply { this.date = date }

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

        fun build(): ScheduleForRouteRetrieveParams =
            ScheduleForRouteRetrieveParams(
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                date,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
