// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripforvehicle

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Retrieve trip for a specific vehicle */
class TripForVehicleRetrieveParams
private constructor(
    private val vehicleId: String?,
    private val includeSchedule: Boolean?,
    private val includeStatus: Boolean?,
    private val includeTrip: Boolean?,
    private val time: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TripForVehicleRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [TripForVehicleRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripForVehicleRetrieveParams]. */
    class Builder internal constructor() {

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

        fun vehicleId(vehicleId: String?) = apply { this.vehicleId = vehicleId }

        /** Alias for calling [Builder.vehicleId] with `vehicleId.orElse(null)`. */
        fun vehicleId(vehicleId: Optional<String>) = vehicleId(vehicleId.getOrNull())

        /**
         * Determines whether full <schedule/> element is included in the <tripDetails/> section.
         * Defaults to false.
         */
        fun includeSchedule(includeSchedule: Boolean?) = apply {
            this.includeSchedule = includeSchedule
        }

        /**
         * Alias for [Builder.includeSchedule].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSchedule(includeSchedule: Boolean) = includeSchedule(includeSchedule as Boolean?)

        /** Alias for calling [Builder.includeSchedule] with `includeSchedule.orElse(null)`. */
        fun includeSchedule(includeSchedule: Optional<Boolean>) =
            includeSchedule(includeSchedule.getOrNull())

        /**
         * Determines whether the full <status/> element is included in the <tripDetails/> section.
         * Defaults to true.
         */
        fun includeStatus(includeStatus: Boolean?) = apply { this.includeStatus = includeStatus }

        /**
         * Alias for [Builder.includeStatus].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStatus(includeStatus: Boolean) = includeStatus(includeStatus as Boolean?)

        /** Alias for calling [Builder.includeStatus] with `includeStatus.orElse(null)`. */
        fun includeStatus(includeStatus: Optional<Boolean>) =
            includeStatus(includeStatus.getOrNull())

        /**
         * Determines whether full <trip/> element is included in the <references/> section.
         * Defaults to false.
         */
        fun includeTrip(includeTrip: Boolean?) = apply { this.includeTrip = includeTrip }

        /**
         * Alias for [Builder.includeTrip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTrip(includeTrip: Boolean) = includeTrip(includeTrip as Boolean?)

        /** Alias for calling [Builder.includeTrip] with `includeTrip.orElse(null)`. */
        fun includeTrip(includeTrip: Optional<Boolean>) = includeTrip(includeTrip.getOrNull())

        /** Time parameter to query the system at a specific time (optional). */
        fun time(time: Long?) = apply { this.time = time }

        /**
         * Alias for [Builder.time].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun time(time: Long) = time(time as Long?)

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<Long>) = time(time.getOrNull())

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
         * Returns an immutable instance of [TripForVehicleRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TripForVehicleRetrieveParams =
            TripForVehicleRetrieveParams(
                vehicleId,
                includeSchedule,
                includeStatus,
                includeTrip,
                time,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> vehicleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeSchedule?.let { put("includeSchedule", it.toString()) }
                includeStatus?.let { put("includeStatus", it.toString()) }
                includeTrip?.let { put("includeTrip", it.toString()) }
                time?.let { put("time", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TripForVehicleRetrieveParams &&
            vehicleId == other.vehicleId &&
            includeSchedule == other.includeSchedule &&
            includeStatus == other.includeStatus &&
            includeTrip == other.includeTrip &&
            time == other.time &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            vehicleId,
            includeSchedule,
            includeStatus,
            includeTrip,
            time,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TripForVehicleRetrieveParams{vehicleId=$vehicleId, includeSchedule=$includeSchedule, includeStatus=$includeStatus, includeTrip=$includeTrip, time=$time, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
