// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalanddeparture

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** arrival-and-departure-for-stop */
class ArrivalAndDepartureRetrieveParams
private constructor(
    private val stopId: String?,
    private val serviceDate: Long,
    private val tripId: String,
    private val stopSequence: Long?,
    private val time: Long?,
    private val vehicleId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun stopId(): Optional<String> = Optional.ofNullable(stopId)

    fun serviceDate(): Long = serviceDate

    fun tripId(): String = tripId

    fun stopSequence(): Optional<Long> = Optional.ofNullable(stopSequence)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ArrivalAndDepartureRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .serviceDate()
         * .tripId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArrivalAndDepartureRetrieveParams]. */
    class Builder internal constructor() {

        private var stopId: String? = null
        private var serviceDate: Long? = null
        private var tripId: String? = null
        private var stopSequence: Long? = null
        private var time: Long? = null
        private var vehicleId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(arrivalAndDepartureRetrieveParams: ArrivalAndDepartureRetrieveParams) =
            apply {
                stopId = arrivalAndDepartureRetrieveParams.stopId
                serviceDate = arrivalAndDepartureRetrieveParams.serviceDate
                tripId = arrivalAndDepartureRetrieveParams.tripId
                stopSequence = arrivalAndDepartureRetrieveParams.stopSequence
                time = arrivalAndDepartureRetrieveParams.time
                vehicleId = arrivalAndDepartureRetrieveParams.vehicleId
                additionalHeaders = arrivalAndDepartureRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    arrivalAndDepartureRetrieveParams.additionalQueryParams.toBuilder()
            }

        fun stopId(stopId: String?) = apply { this.stopId = stopId }

        /** Alias for calling [Builder.stopId] with `stopId.orElse(null)`. */
        fun stopId(stopId: Optional<String>) = stopId(stopId.getOrNull())

        fun serviceDate(serviceDate: Long) = apply { this.serviceDate = serviceDate }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        fun stopSequence(stopSequence: Long?) = apply { this.stopSequence = stopSequence }

        /**
         * Alias for [Builder.stopSequence].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stopSequence(stopSequence: Long) = stopSequence(stopSequence as Long?)

        /** Alias for calling [Builder.stopSequence] with `stopSequence.orElse(null)`. */
        fun stopSequence(stopSequence: Optional<Long>) = stopSequence(stopSequence.getOrNull())

        fun time(time: Long?) = apply { this.time = time }

        /**
         * Alias for [Builder.time].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun time(time: Long) = time(time as Long?)

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<Long>) = time(time.getOrNull())

        fun vehicleId(vehicleId: String?) = apply { this.vehicleId = vehicleId }

        /** Alias for calling [Builder.vehicleId] with `vehicleId.orElse(null)`. */
        fun vehicleId(vehicleId: Optional<String>) = vehicleId(vehicleId.getOrNull())

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
         * Returns an immutable instance of [ArrivalAndDepartureRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .serviceDate()
         * .tripId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArrivalAndDepartureRetrieveParams =
            ArrivalAndDepartureRetrieveParams(
                stopId,
                checkRequired("serviceDate", serviceDate),
                checkRequired("tripId", tripId),
                stopSequence,
                time,
                vehicleId,
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
                put("serviceDate", serviceDate.toString())
                put("tripId", tripId)
                stopSequence?.let { put("stopSequence", it.toString()) }
                time?.let { put("time", it.toString()) }
                vehicleId?.let { put("vehicleId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArrivalAndDepartureRetrieveParams && stopId == other.stopId && serviceDate == other.serviceDate && tripId == other.tripId && stopSequence == other.stopSequence && time == other.time && vehicleId == other.vehicleId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stopId, serviceDate, tripId, stopSequence, time, vehicleId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ArrivalAndDepartureRetrieveParams{stopId=$stopId, serviceDate=$serviceDate, tripId=$tripId, stopSequence=$stopSequence, time=$time, vehicleId=$vehicleId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
