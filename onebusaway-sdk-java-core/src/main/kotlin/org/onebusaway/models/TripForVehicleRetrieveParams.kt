// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable
import org.onebusaway.models.*

class TripForVehicleRetrieveParams
constructor(
    private val vehicleId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun vehicleId(): String = vehicleId

    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    fun includeStatus(): Optional<Boolean> = Optional.ofNullable(includeStatus)

    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    fun time(): Optional<Long> = Optional.ofNullable(time)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.includeSchedule?.let { params.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { params.put("includeStatus", listOf(it.toString())) }
        this.includeTrip?.let { params.put("includeTrip", listOf(it.toString())) }
        this.time?.let { params.put("time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> vehicleId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TripForVehicleRetrieveParams &&
            this.vehicleId == other.vehicleId &&
            this.includeSchedule == other.includeSchedule &&
            this.includeStatus == other.includeStatus &&
            this.includeTrip == other.includeTrip &&
            this.time == other.time &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            vehicleId,
            includeSchedule,
            includeStatus,
            includeTrip,
            time,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "TripForVehicleRetrieveParams{vehicleId=$vehicleId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, includeTrip=$includeTrip, time=$time, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var vehicleId: String? = null
        private var includeSchedule: Boolean? = null
        private var includeStatus: Boolean? = null
        private var includeTrip: Boolean? = null
        private var time: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tripForVehicleRetrieveParams: TripForVehicleRetrieveParams) = apply {
            this.vehicleId = tripForVehicleRetrieveParams.vehicleId
            this.includeSchedule = tripForVehicleRetrieveParams.includeSchedule
            this.includeStatus = tripForVehicleRetrieveParams.includeStatus
            this.includeTrip = tripForVehicleRetrieveParams.includeTrip
            this.time = tripForVehicleRetrieveParams.time
            additionalQueryParams(tripForVehicleRetrieveParams.additionalQueryParams)
            additionalHeaders(tripForVehicleRetrieveParams.additionalHeaders)
        }

        fun vehicleId(vehicleId: String) = apply { this.vehicleId = vehicleId }

        /**
         * Determines whether full <schedule/> element is included in the <tripDetails/> section.
         * Defaults to false.
         */
        fun includeSchedule(includeSchedule: Boolean) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Determines whether the full <status/> element is included in the <tripDetails/> section.
         * Defaults to true.
         */
        fun includeStatus(includeStatus: Boolean) = apply { this.includeStatus = includeStatus }

        /**
         * Determines whether full <trip/> element is included in the <references/> section.
         * Defaults to false.
         */
        fun includeTrip(includeTrip: Boolean) = apply { this.includeTrip = includeTrip }

        /** Time parameter to query the system at a specific time (optional). */
        fun time(time: Long) = apply { this.time = time }

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

        fun build(): TripForVehicleRetrieveParams =
            TripForVehicleRetrieveParams(
                checkNotNull(vehicleId) { "`vehicleId` is required but was not set" },
                includeSchedule,
                includeStatus,
                includeTrip,
                time,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
