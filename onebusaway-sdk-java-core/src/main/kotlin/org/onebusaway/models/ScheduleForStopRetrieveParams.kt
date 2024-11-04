// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class ScheduleForStopRetrieveParams
constructor(
    private val stopId: String,
    private val date: LocalDate?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun date(): Optional<LocalDate> = Optional.ofNullable(date)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.date?.let { params.put("date", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> stopId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduleForStopRetrieveParams && this.stopId == other.stopId && this.date == other.date && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(stopId, date, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ScheduleForStopRetrieveParams{stopId=$stopId, date=$date, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var date: LocalDate? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(scheduleForStopRetrieveParams: ScheduleForStopRetrieveParams) = apply {
            this.stopId = scheduleForStopRetrieveParams.stopId
            this.date = scheduleForStopRetrieveParams.date
            additionalHeaders(scheduleForStopRetrieveParams.additionalHeaders)
            additionalQueryParams(scheduleForStopRetrieveParams.additionalQueryParams)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /**
         * The date for which you want to request a schedule in the format YYYY-MM-DD (optional,
         * defaults to the current date)
         */
        fun date(date: LocalDate) = apply { this.date = date }

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

        fun build(): ScheduleForStopRetrieveParams =
            ScheduleForStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                date,
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
