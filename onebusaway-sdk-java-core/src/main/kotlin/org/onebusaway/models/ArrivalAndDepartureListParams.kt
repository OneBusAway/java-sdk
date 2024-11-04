// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class ArrivalAndDepartureListParams
constructor(
    private val stopId: String,
    private val minutesAfter: Long?,
    private val minutesBefore: Long?,
    private val time: OffsetDateTime?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun minutesAfter(): Optional<Long> = Optional.ofNullable(minutesAfter)

    fun minutesBefore(): Optional<Long> = Optional.ofNullable(minutesBefore)

    fun time(): Optional<OffsetDateTime> = Optional.ofNullable(time)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.minutesAfter?.let { params.put("minutesAfter", listOf(it.toString())) }
        this.minutesBefore?.let { params.put("minutesBefore", listOf(it.toString())) }
        this.time?.let {
            params.put("time", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
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

        return /* spotless:off */ other is ArrivalAndDepartureListParams && this.stopId == other.stopId && this.minutesAfter == other.minutesAfter && this.minutesBefore == other.minutesBefore && this.time == other.time && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(stopId, minutesAfter, minutesBefore, time, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ArrivalAndDepartureListParams{stopId=$stopId, minutesAfter=$minutesAfter, minutesBefore=$minutesBefore, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var minutesAfter: Long? = null
        private var minutesBefore: Long? = null
        private var time: OffsetDateTime? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(arrivalAndDepartureListParams: ArrivalAndDepartureListParams) = apply {
            this.stopId = arrivalAndDepartureListParams.stopId
            this.minutesAfter = arrivalAndDepartureListParams.minutesAfter
            this.minutesBefore = arrivalAndDepartureListParams.minutesBefore
            this.time = arrivalAndDepartureListParams.time
            additionalHeaders(arrivalAndDepartureListParams.additionalHeaders)
            additionalQueryParams(arrivalAndDepartureListParams.additionalQueryParams)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** Include vehicles arriving or departing in the next n minutes. */
        fun minutesAfter(minutesAfter: Long) = apply { this.minutesAfter = minutesAfter }

        /** Include vehicles having arrived or departed in the previous n minutes. */
        fun minutesBefore(minutesBefore: Long) = apply { this.minutesBefore = minutesBefore }

        /** The specific time for querying the system status. */
        fun time(time: OffsetDateTime) = apply { this.time = time }

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

        fun build(): ArrivalAndDepartureListParams =
            ArrivalAndDepartureListParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                minutesAfter,
                minutesBefore,
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
