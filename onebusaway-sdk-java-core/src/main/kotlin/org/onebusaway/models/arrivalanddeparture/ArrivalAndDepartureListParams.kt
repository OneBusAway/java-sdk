// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalanddeparture

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** arrivals-and-departures-for-stop */
class ArrivalAndDepartureListParams
private constructor(
    private val stopId: String?,
    private val minutesAfter: Long?,
    private val minutesBefore: Long?,
    private val time: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun stopId(): Optional<String> = Optional.ofNullable(stopId)

    /** Include vehicles arriving or departing in the next n minutes. */
    fun minutesAfter(): Optional<Long> = Optional.ofNullable(minutesAfter)

    /** Include vehicles having arrived or departed in the previous n minutes. */
    fun minutesBefore(): Optional<Long> = Optional.ofNullable(minutesBefore)

    /** The specific time for querying the system status. */
    fun time(): Optional<OffsetDateTime> = Optional.ofNullable(time)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ArrivalAndDepartureListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ArrivalAndDepartureListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArrivalAndDepartureListParams]. */
    class Builder internal constructor() {

        private var stopId: String? = null
        private var minutesAfter: Long? = null
        private var minutesBefore: Long? = null
        private var time: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(arrivalAndDepartureListParams: ArrivalAndDepartureListParams) = apply {
            stopId = arrivalAndDepartureListParams.stopId
            minutesAfter = arrivalAndDepartureListParams.minutesAfter
            minutesBefore = arrivalAndDepartureListParams.minutesBefore
            time = arrivalAndDepartureListParams.time
            additionalHeaders = arrivalAndDepartureListParams.additionalHeaders.toBuilder()
            additionalQueryParams = arrivalAndDepartureListParams.additionalQueryParams.toBuilder()
        }

        fun stopId(stopId: String?) = apply { this.stopId = stopId }

        /** Alias for calling [Builder.stopId] with `stopId.orElse(null)`. */
        fun stopId(stopId: Optional<String>) = stopId(stopId.getOrNull())

        /** Include vehicles arriving or departing in the next n minutes. */
        fun minutesAfter(minutesAfter: Long?) = apply { this.minutesAfter = minutesAfter }

        /**
         * Alias for [Builder.minutesAfter].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesAfter(minutesAfter: Long) = minutesAfter(minutesAfter as Long?)

        /** Alias for calling [Builder.minutesAfter] with `minutesAfter.orElse(null)`. */
        fun minutesAfter(minutesAfter: Optional<Long>) = minutesAfter(minutesAfter.getOrNull())

        /** Include vehicles having arrived or departed in the previous n minutes. */
        fun minutesBefore(minutesBefore: Long?) = apply { this.minutesBefore = minutesBefore }

        /**
         * Alias for [Builder.minutesBefore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesBefore(minutesBefore: Long) = minutesBefore(minutesBefore as Long?)

        /** Alias for calling [Builder.minutesBefore] with `minutesBefore.orElse(null)`. */
        fun minutesBefore(minutesBefore: Optional<Long>) = minutesBefore(minutesBefore.getOrNull())

        /** The specific time for querying the system status. */
        fun time(time: OffsetDateTime?) = apply { this.time = time }

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<OffsetDateTime>) = time(time.getOrNull())

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
         * Returns an immutable instance of [ArrivalAndDepartureListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ArrivalAndDepartureListParams =
            ArrivalAndDepartureListParams(
                stopId,
                minutesAfter,
                minutesBefore,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> stopId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                minutesAfter?.let { put("minutesAfter", it.toString()) }
                minutesBefore?.let { put("minutesBefore", it.toString()) }
                time?.let { put("time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArrivalAndDepartureListParams && stopId == other.stopId && minutesAfter == other.minutesAfter && minutesBefore == other.minutesBefore && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stopId, minutesAfter, minutesBefore, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ArrivalAndDepartureListParams{stopId=$stopId, minutesAfter=$minutesAfter, minutesBefore=$minutesBefore, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
