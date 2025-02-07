// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Retrieve Trip Details */
class TripDetailRetrieveParams
private constructor(
    private val tripId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val includeTrip: Boolean?,
    private val serviceDate: Long?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tripId(): String = tripId

    /**
     * Whether to include the full schedule element in the tripDetails section (defaults to true).
     */
    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    /** Whether to include the full status element in the tripDetails section (defaults to true). */
    fun includeStatus(): Optional<Boolean> = Optional.ofNullable(includeStatus)

    /** Whether to include the full trip element in the references section (defaults to true). */
    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    /** Service date for the trip as Unix time in milliseconds (optional). */
    fun serviceDate(): Optional<Long> = Optional.ofNullable(serviceDate)

    /** Time parameter to query the system at a specific time (optional). */
    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeSchedule?.let { queryParams.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { queryParams.put("includeStatus", listOf(it.toString())) }
        this.includeTrip?.let { queryParams.put("includeTrip", listOf(it.toString())) }
        this.serviceDate?.let { queryParams.put("serviceDate", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tripId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripDetailRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var tripId: String? = null
        private var includeSchedule: Boolean? = null
        private var includeStatus: Boolean? = null
        private var includeTrip: Boolean? = null
        private var serviceDate: Long? = null
        private var time: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tripDetailRetrieveParams: TripDetailRetrieveParams) = apply {
            tripId = tripDetailRetrieveParams.tripId
            includeSchedule = tripDetailRetrieveParams.includeSchedule
            includeStatus = tripDetailRetrieveParams.includeStatus
            includeTrip = tripDetailRetrieveParams.includeTrip
            serviceDate = tripDetailRetrieveParams.serviceDate
            time = tripDetailRetrieveParams.time
            additionalHeaders = tripDetailRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = tripDetailRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        /**
         * Whether to include the full schedule element in the tripDetails section (defaults to
         * true).
         */
        fun includeSchedule(includeSchedule: Boolean?) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Whether to include the full schedule element in the tripDetails section (defaults to
         * true).
         */
        fun includeSchedule(includeSchedule: Boolean) = includeSchedule(includeSchedule as Boolean?)

        /**
         * Whether to include the full schedule element in the tripDetails section (defaults to
         * true).
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includeSchedule(includeSchedule: Optional<Boolean>) =
            includeSchedule(includeSchedule.orElse(null) as Boolean?)

        /**
         * Whether to include the full status element in the tripDetails section (defaults to true).
         */
        fun includeStatus(includeStatus: Boolean?) = apply { this.includeStatus = includeStatus }

        /**
         * Whether to include the full status element in the tripDetails section (defaults to true).
         */
        fun includeStatus(includeStatus: Boolean) = includeStatus(includeStatus as Boolean?)

        /**
         * Whether to include the full status element in the tripDetails section (defaults to true).
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includeStatus(includeStatus: Optional<Boolean>) =
            includeStatus(includeStatus.orElse(null) as Boolean?)

        /**
         * Whether to include the full trip element in the references section (defaults to true).
         */
        fun includeTrip(includeTrip: Boolean?) = apply { this.includeTrip = includeTrip }

        /**
         * Whether to include the full trip element in the references section (defaults to true).
         */
        fun includeTrip(includeTrip: Boolean) = includeTrip(includeTrip as Boolean?)

        /**
         * Whether to include the full trip element in the references section (defaults to true).
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includeTrip(includeTrip: Optional<Boolean>) =
            includeTrip(includeTrip.orElse(null) as Boolean?)

        /** Service date for the trip as Unix time in milliseconds (optional). */
        fun serviceDate(serviceDate: Long?) = apply { this.serviceDate = serviceDate }

        /** Service date for the trip as Unix time in milliseconds (optional). */
        fun serviceDate(serviceDate: Long) = serviceDate(serviceDate as Long?)

        /** Service date for the trip as Unix time in milliseconds (optional). */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun serviceDate(serviceDate: Optional<Long>) =
            serviceDate(serviceDate.orElse(null) as Long?)

        /** Time parameter to query the system at a specific time (optional). */
        fun time(time: Long?) = apply { this.time = time }

        /** Time parameter to query the system at a specific time (optional). */
        fun time(time: Long) = time(time as Long?)

        /** Time parameter to query the system at a specific time (optional). */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun time(time: Optional<Long>) = time(time.orElse(null) as Long?)

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

        fun build(): TripDetailRetrieveParams =
            TripDetailRetrieveParams(
                checkRequired("tripId", tripId),
                includeSchedule,
                includeStatus,
                includeTrip,
                serviceDate,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripDetailRetrieveParams && tripId == other.tripId && includeSchedule == other.includeSchedule && includeStatus == other.includeStatus && includeTrip == other.includeTrip && serviceDate == other.serviceDate && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tripId, includeSchedule, includeStatus, includeTrip, serviceDate, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TripDetailRetrieveParams{tripId=$tripId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, includeTrip=$includeTrip, serviceDate=$serviceDate, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
