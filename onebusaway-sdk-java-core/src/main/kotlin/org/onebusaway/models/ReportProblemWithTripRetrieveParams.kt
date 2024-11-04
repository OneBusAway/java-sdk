// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.Enum
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException
import org.onebusaway.models.*

class ReportProblemWithTripRetrieveParams
constructor(
    private val tripId: String,
    private val code: Code?,
    private val serviceDate: Long?,
    private val stopId: String?,
    private val userComment: String?,
    private val userLat: Double?,
    private val userLocationAccuracy: Double?,
    private val userLon: Double?,
    private val userOnVehicle: Boolean?,
    private val userVehicleNumber: String?,
    private val vehicleId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun tripId(): String = tripId

    fun code(): Optional<Code> = Optional.ofNullable(code)

    fun serviceDate(): Optional<Long> = Optional.ofNullable(serviceDate)

    fun stopId(): Optional<String> = Optional.ofNullable(stopId)

    fun userComment(): Optional<String> = Optional.ofNullable(userComment)

    fun userLat(): Optional<Double> = Optional.ofNullable(userLat)

    fun userLocationAccuracy(): Optional<Double> = Optional.ofNullable(userLocationAccuracy)

    fun userLon(): Optional<Double> = Optional.ofNullable(userLon)

    fun userOnVehicle(): Optional<Boolean> = Optional.ofNullable(userOnVehicle)

    fun userVehicleNumber(): Optional<String> = Optional.ofNullable(userVehicleNumber)

    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.code?.let { params.put("code", listOf(it.toString())) }
        this.serviceDate?.let { params.put("serviceDate", listOf(it.toString())) }
        this.stopId?.let { params.put("stopID", listOf(it.toString())) }
        this.userComment?.let { params.put("userComment", listOf(it.toString())) }
        this.userLat?.let { params.put("userLat", listOf(it.toString())) }
        this.userLocationAccuracy?.let { params.put("userLocationAccuracy", listOf(it.toString())) }
        this.userLon?.let { params.put("userLon", listOf(it.toString())) }
        this.userOnVehicle?.let { params.put("userOnVehicle", listOf(it.toString())) }
        this.userVehicleNumber?.let { params.put("userVehicleNumber", listOf(it.toString())) }
        this.vehicleId?.let { params.put("vehicleID", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tripId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportProblemWithTripRetrieveParams && this.tripId == other.tripId && this.code == other.code && this.serviceDate == other.serviceDate && this.stopId == other.stopId && this.userComment == other.userComment && this.userLat == other.userLat && this.userLocationAccuracy == other.userLocationAccuracy && this.userLon == other.userLon && this.userOnVehicle == other.userOnVehicle && this.userVehicleNumber == other.userVehicleNumber && this.vehicleId == other.vehicleId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(tripId, code, serviceDate, stopId, userComment, userLat, userLocationAccuracy, userLon, userOnVehicle, userVehicleNumber, vehicleId, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ReportProblemWithTripRetrieveParams{tripId=$tripId, code=$code, serviceDate=$serviceDate, stopId=$stopId, userComment=$userComment, userLat=$userLat, userLocationAccuracy=$userLocationAccuracy, userLon=$userLon, userOnVehicle=$userOnVehicle, userVehicleNumber=$userVehicleNumber, vehicleId=$vehicleId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var tripId: String? = null
        private var code: Code? = null
        private var serviceDate: Long? = null
        private var stopId: String? = null
        private var userComment: String? = null
        private var userLat: Double? = null
        private var userLocationAccuracy: Double? = null
        private var userLon: Double? = null
        private var userOnVehicle: Boolean? = null
        private var userVehicleNumber: String? = null
        private var vehicleId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(
            reportProblemWithTripRetrieveParams: ReportProblemWithTripRetrieveParams
        ) = apply {
            this.tripId = reportProblemWithTripRetrieveParams.tripId
            this.code = reportProblemWithTripRetrieveParams.code
            this.serviceDate = reportProblemWithTripRetrieveParams.serviceDate
            this.stopId = reportProblemWithTripRetrieveParams.stopId
            this.userComment = reportProblemWithTripRetrieveParams.userComment
            this.userLat = reportProblemWithTripRetrieveParams.userLat
            this.userLocationAccuracy = reportProblemWithTripRetrieveParams.userLocationAccuracy
            this.userLon = reportProblemWithTripRetrieveParams.userLon
            this.userOnVehicle = reportProblemWithTripRetrieveParams.userOnVehicle
            this.userVehicleNumber = reportProblemWithTripRetrieveParams.userVehicleNumber
            this.vehicleId = reportProblemWithTripRetrieveParams.vehicleId
            additionalHeaders(reportProblemWithTripRetrieveParams.additionalHeaders)
            additionalQueryParams(reportProblemWithTripRetrieveParams.additionalQueryParams)
        }

        fun tripId(tripId: String) = apply { this.tripId = tripId }

        /** A string code identifying the nature of the problem */
        fun code(code: Code) = apply { this.code = code }

        /** The service date of the trip */
        fun serviceDate(serviceDate: Long) = apply { this.serviceDate = serviceDate }

        /** A stop ID indicating where the user is experiencing the problem */
        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** Additional comment text supplied by the user describing the problem */
        fun userComment(userComment: String) = apply { this.userComment = userComment }

        /** The reporting user’s current latitude */
        fun userLat(userLat: Double) = apply { this.userLat = userLat }

        /** The reporting user’s location accuracy, in meters */
        fun userLocationAccuracy(userLocationAccuracy: Double) = apply {
            this.userLocationAccuracy = userLocationAccuracy
        }

        /** The reporting user’s current longitude */
        fun userLon(userLon: Double) = apply { this.userLon = userLon }

        /** Indicator if the user is on the transit vehicle experiencing the problem */
        fun userOnVehicle(userOnVehicle: Boolean) = apply { this.userOnVehicle = userOnVehicle }

        /** The vehicle number, as reported by the user */
        fun userVehicleNumber(userVehicleNumber: String) = apply {
            this.userVehicleNumber = userVehicleNumber
        }

        /** The vehicle actively serving the trip */
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

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

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

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): ReportProblemWithTripRetrieveParams =
            ReportProblemWithTripRetrieveParams(
                checkNotNull(tripId) { "`tripId` is required but was not set" },
                code,
                serviceDate,
                stopId,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                userOnVehicle,
                userVehicleNumber,
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

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val VEHICLE_NEVER_CAME = Code(JsonField.of("vehicle_never_came"))

            @JvmField val VEHICLE_CAME_EARLY = Code(JsonField.of("vehicle_came_early"))

            @JvmField val VEHICLE_CAME_LATE = Code(JsonField.of("vehicle_came_late"))

            @JvmField val WRONG_HEADSIGN = Code(JsonField.of("wrong_headsign"))

            @JvmField
            val VEHICLE_DOES_NOT_STOP_HERE = Code(JsonField.of("vehicle_does_not_stop_here"))

            @JvmField val OTHER = Code(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        enum class Known {
            VEHICLE_NEVER_CAME,
            VEHICLE_CAME_EARLY,
            VEHICLE_CAME_LATE,
            WRONG_HEADSIGN,
            VEHICLE_DOES_NOT_STOP_HERE,
            OTHER,
        }

        enum class Value {
            VEHICLE_NEVER_CAME,
            VEHICLE_CAME_EARLY,
            VEHICLE_CAME_LATE,
            WRONG_HEADSIGN,
            VEHICLE_DOES_NOT_STOP_HERE,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VEHICLE_NEVER_CAME -> Value.VEHICLE_NEVER_CAME
                VEHICLE_CAME_EARLY -> Value.VEHICLE_CAME_EARLY
                VEHICLE_CAME_LATE -> Value.VEHICLE_CAME_LATE
                WRONG_HEADSIGN -> Value.WRONG_HEADSIGN
                VEHICLE_DOES_NOT_STOP_HERE -> Value.VEHICLE_DOES_NOT_STOP_HERE
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VEHICLE_NEVER_CAME -> Known.VEHICLE_NEVER_CAME
                VEHICLE_CAME_EARLY -> Known.VEHICLE_CAME_EARLY
                VEHICLE_CAME_LATE -> Known.VEHICLE_CAME_LATE
                WRONG_HEADSIGN -> Known.WRONG_HEADSIGN
                VEHICLE_DOES_NOT_STOP_HERE -> Known.VEHICLE_DOES_NOT_STOP_HERE
                OTHER -> Known.OTHER
                else -> throw OnebusawaySdkInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
