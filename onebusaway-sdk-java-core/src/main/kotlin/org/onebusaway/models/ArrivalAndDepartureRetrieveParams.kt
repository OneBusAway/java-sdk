// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

class ArrivalAndDepartureRetrieveParams
constructor(
    private val stopId: String,
    private val serviceDate: Long,
    private val tripId: String,
    private val stopSequence: Long?,
    private val time: Long?,
    private val vehicleId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun stopId(): String = stopId

    fun serviceDate(): Long = serviceDate

    fun tripId(): String = tripId

    fun stopSequence(): Optional<Long> = Optional.ofNullable(stopSequence)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.serviceDate.let { queryParams.put("serviceDate", listOf(it.toString())) }
        this.tripId.let { queryParams.put("tripId", listOf(it.toString())) }
        this.stopSequence?.let { queryParams.put("stopSequence", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        this.vehicleId?.let { queryParams.put("vehicleId", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> stopId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

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

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        fun serviceDate(serviceDate: Long) = apply { this.serviceDate = serviceDate }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        fun stopSequence(stopSequence: Long) = apply { this.stopSequence = stopSequence }

        fun time(time: Long) = apply { this.time = time }

        fun vehicleId(vehicleId: String) = apply { this.vehicleId = vehicleId }

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

        fun build(): ArrivalAndDepartureRetrieveParams =
            ArrivalAndDepartureRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                checkNotNull(serviceDate) { "`serviceDate` is required but was not set" },
                checkNotNull(tripId) { "`tripId` is required but was not set" },
                stopSequence,
                time,
                vehicleId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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
