// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable
import org.onebusaway.models.*

class ArrivalAndDepartureRetrieveParams
constructor(
    private val stopId: String,
    private val serviceDate: Long,
    private val tripId: String,
    private val stopSequence: Long?,
    private val time: Long?,
    private val vehicleId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun serviceDate(): Long = serviceDate

    fun tripId(): String = tripId

    fun stopSequence(): Optional<Long> = Optional.ofNullable(stopSequence)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.serviceDate.let { params.put("serviceDate", listOf(it.toString())) }
        this.tripId.let { params.put("tripId", listOf(it.toString())) }
        this.stopSequence?.let { params.put("stopSequence", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        this.vehicleId?.let { params.put("vehicleId", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> stopId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArrivalAndDepartureRetrieveParams && this.stopId == other.stopId && this.serviceDate == other.serviceDate && this.tripId == other.tripId && this.stopSequence == other.stopSequence && this.time == other.time && this.vehicleId == other.vehicleId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(stopId, serviceDate, tripId, stopSequence, time, vehicleId, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ArrivalAndDepartureRetrieveParams{stopId=$stopId, serviceDate=$serviceDate, tripId=$tripId, stopSequence=$stopSequence, time=$time, vehicleId=$vehicleId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(arrivalAndDepartureRetrieveParams: ArrivalAndDepartureRetrieveParams) =
            apply {
                this.stopId = arrivalAndDepartureRetrieveParams.stopId
                this.serviceDate = arrivalAndDepartureRetrieveParams.serviceDate
                this.tripId = arrivalAndDepartureRetrieveParams.tripId
                this.stopSequence = arrivalAndDepartureRetrieveParams.stopSequence
                this.time = arrivalAndDepartureRetrieveParams.time
                this.vehicleId = arrivalAndDepartureRetrieveParams.vehicleId
                additionalQueryParams(arrivalAndDepartureRetrieveParams.additionalQueryParams)
                additionalHeaders(arrivalAndDepartureRetrieveParams.additionalHeaders)
            }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        fun serviceDate(serviceDate: Long) = apply { this.serviceDate = serviceDate }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        fun stopSequence(stopSequence: Long) = apply { this.stopSequence = stopSequence }

        fun time(time: Long) = apply { this.time = time }

        fun vehicleId(vehicleId: String) = apply { this.vehicleId = vehicleId }

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

        fun build(): ArrivalAndDepartureRetrieveParams =
            ArrivalAndDepartureRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                checkNotNull(serviceDate) { "`serviceDate` is required but was not set" },
                checkNotNull(tripId) { "`tripId` is required but was not set" },
                stopSequence,
                time,
                vehicleId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
