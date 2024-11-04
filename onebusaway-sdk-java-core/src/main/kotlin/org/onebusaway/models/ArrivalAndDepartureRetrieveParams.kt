// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.models.*

class ArrivalAndDepartureRetrieveParams
constructor(
    private val stopId: String,
    private val serviceDate: Long,
    private val tripId: String,
    private val stopSequence: Long?,
    private val time: Long?,
    private val vehicleId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun serviceDate(): Long = serviceDate

    fun tripId(): String = tripId

    fun stopSequence(): Optional<Long> = Optional.ofNullable(stopSequence)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.serviceDate.let { params.put("serviceDate", listOf(it.toString())) }
        this.tripId.let { params.put("tripId", listOf(it.toString())) }
        this.stopSequence?.let { params.put("stopSequence", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        this.vehicleId?.let { params.put("vehicleId", listOf(it.toString())) }
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

        return /* spotless:off */ other is ArrivalAndDepartureRetrieveParams && this.stopId == other.stopId && this.serviceDate == other.serviceDate && this.tripId == other.tripId && this.stopSequence == other.stopSequence && this.time == other.time && this.vehicleId == other.vehicleId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(stopId, serviceDate, tripId, stopSequence, time, vehicleId, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ArrivalAndDepartureRetrieveParams{stopId=$stopId, serviceDate=$serviceDate, tripId=$tripId, stopSequence=$stopSequence, time=$time, vehicleId=$vehicleId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(arrivalAndDepartureRetrieveParams: ArrivalAndDepartureRetrieveParams) =
            apply {
                this.stopId = arrivalAndDepartureRetrieveParams.stopId
                this.serviceDate = arrivalAndDepartureRetrieveParams.serviceDate
                this.tripId = arrivalAndDepartureRetrieveParams.tripId
                this.stopSequence = arrivalAndDepartureRetrieveParams.stopSequence
                this.time = arrivalAndDepartureRetrieveParams.time
                this.vehicleId = arrivalAndDepartureRetrieveParams.vehicleId
                additionalHeaders(arrivalAndDepartureRetrieveParams.additionalHeaders)
                additionalQueryParams(arrivalAndDepartureRetrieveParams.additionalQueryParams)
            }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        fun serviceDate(serviceDate: Long) = apply { this.serviceDate = serviceDate }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        fun stopSequence(stopSequence: Long) = apply { this.stopSequence = stopSequence }

        fun time(time: Long) = apply { this.time = time }

        fun vehicleId(vehicleId: String) = apply { this.vehicleId = vehicleId }

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

        fun build(): ArrivalAndDepartureRetrieveParams =
            ArrivalAndDepartureRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                checkNotNull(serviceDate) { "`serviceDate` is required but was not set" },
                checkNotNull(tripId) { "`tripId` is required but was not set" },
                stopSequence,
                time,
                vehicleId,
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
