// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import java.util.Objects
import java.util.Optional
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

class TripForVehicleRetrieveParams
constructor(
    private val vehicleId: String,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun vehicleId(): String = vehicleId

    /**
     * Determines whether full <schedule/> element is included in the <tripDetails/> section.
     * Defaults to false.
     */
    fun includeSchedule(): Optional<Boolean> = Optional.ofNullable(includeSchedule)

    /**
     * Determines whether the full <status/> element is included in the <tripDetails/> section.
     * Defaults to true.
     */
    fun includeStatus(): Optional<Boolean> = Optional.ofNullable(includeStatus)

    /**
     * Determines whether full <trip/> element is included in the <references/> section. Defaults to
     * false.
     */
    fun includeTrip(): Optional<Boolean> = Optional.ofNullable(includeTrip)

    /** Time parameter to query the system at a specific time (optional). */
    fun time(): Optional<Long> = Optional.ofNullable(time)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeSchedule?.let { queryParams.put("includeSchedule", listOf(it.toString())) }
        this.includeStatus?.let { queryParams.put("includeStatus", listOf(it.toString())) }
        this.includeTrip?.let { queryParams.put("includeTrip", listOf(it.toString())) }
        this.time?.let { queryParams.put("time", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> vehicleId
            else -> ""
        }
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tripForVehicleRetrieveParams: TripForVehicleRetrieveParams) = apply {
            vehicleId = tripForVehicleRetrieveParams.vehicleId
            includeSchedule = tripForVehicleRetrieveParams.includeSchedule
            includeStatus = tripForVehicleRetrieveParams.includeStatus
            includeTrip = tripForVehicleRetrieveParams.includeTrip
            time = tripForVehicleRetrieveParams.time
            additionalHeaders = tripForVehicleRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = tripForVehicleRetrieveParams.additionalQueryParams.toBuilder()
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

        fun build(): TripForVehicleRetrieveParams =
            TripForVehicleRetrieveParams(
                checkNotNull(vehicleId) { "`vehicleId` is required but was not set" },
                includeSchedule,
                includeStatus,
                includeTrip,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripForVehicleRetrieveParams && vehicleId == other.vehicleId && includeSchedule == other.includeSchedule && includeStatus == other.includeStatus && includeTrip == other.includeTrip && time == other.time && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(vehicleId, includeSchedule, includeStatus, includeTrip, time, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TripForVehicleRetrieveParams{vehicleId=$vehicleId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, includeTrip=$includeTrip, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
