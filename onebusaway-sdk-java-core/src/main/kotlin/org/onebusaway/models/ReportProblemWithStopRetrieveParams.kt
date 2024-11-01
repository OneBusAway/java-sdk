// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.Enum
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException
import org.onebusaway.models.*

class ReportProblemWithStopRetrieveParams
constructor(
    private val stopId: String,
    private val code: Code?,
    private val userComment: String?,
    private val userLat: Double?,
    private val userLocationAccuracy: Double?,
    private val userLon: Double?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun stopId(): String = stopId

    fun code(): Optional<Code> = Optional.ofNullable(code)

    fun userComment(): Optional<String> = Optional.ofNullable(userComment)

    fun userLat(): Optional<Double> = Optional.ofNullable(userLat)

    fun userLocationAccuracy(): Optional<Double> = Optional.ofNullable(userLocationAccuracy)

    fun userLon(): Optional<Double> = Optional.ofNullable(userLon)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.code?.let { params.put("code", listOf(it.toString())) }
        this.userComment?.let { params.put("userComment", listOf(it.toString())) }
        this.userLat?.let { params.put("userLat", listOf(it.toString())) }
        this.userLocationAccuracy?.let { params.put("userLocationAccuracy", listOf(it.toString())) }
        this.userLon?.let { params.put("userLon", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
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

        return /* spotless:off */ other is ReportProblemWithStopRetrieveParams && this.stopId == other.stopId && this.code == other.code && this.userComment == other.userComment && this.userLat == other.userLat && this.userLocationAccuracy == other.userLocationAccuracy && this.userLon == other.userLon && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(stopId, code, userComment, userLat, userLocationAccuracy, userLon, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ReportProblemWithStopRetrieveParams{stopId=$stopId, code=$code, userComment=$userComment, userLat=$userLat, userLocationAccuracy=$userLocationAccuracy, userLon=$userLon, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var stopId: String? = null
        private var code: Code? = null
        private var userComment: String? = null
        private var userLat: Double? = null
        private var userLocationAccuracy: Double? = null
        private var userLon: Double? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            reportProblemWithStopRetrieveParams: ReportProblemWithStopRetrieveParams
        ) = apply {
            this.stopId = reportProblemWithStopRetrieveParams.stopId
            this.code = reportProblemWithStopRetrieveParams.code
            this.userComment = reportProblemWithStopRetrieveParams.userComment
            this.userLat = reportProblemWithStopRetrieveParams.userLat
            this.userLocationAccuracy = reportProblemWithStopRetrieveParams.userLocationAccuracy
            this.userLon = reportProblemWithStopRetrieveParams.userLon
            additionalQueryParams(reportProblemWithStopRetrieveParams.additionalQueryParams)
            additionalHeaders(reportProblemWithStopRetrieveParams.additionalHeaders)
        }

        fun stopId(stopId: String) = apply { this.stopId = stopId }

        /** A string code identifying the nature of the problem */
        fun code(code: Code) = apply { this.code = code }

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

        fun build(): ReportProblemWithStopRetrieveParams =
            ReportProblemWithStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                code,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
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

            @JvmField val STOP_NAME_WRONG = Code(JsonField.of("stop_name_wrong"))

            @JvmField val STOP_NUMBER_WRONG = Code(JsonField.of("stop_number_wrong"))

            @JvmField val STOP_LOCATION_WRONG = Code(JsonField.of("stop_location_wrong"))

            @JvmField val ROUTE_OR_TRIP_MISSING = Code(JsonField.of("route_or_trip_missing"))

            @JvmField val OTHER = Code(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        enum class Known {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
        }

        enum class Value {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                STOP_NAME_WRONG -> Value.STOP_NAME_WRONG
                STOP_NUMBER_WRONG -> Value.STOP_NUMBER_WRONG
                STOP_LOCATION_WRONG -> Value.STOP_LOCATION_WRONG
                ROUTE_OR_TRIP_MISSING -> Value.ROUTE_OR_TRIP_MISSING
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                STOP_NAME_WRONG -> Known.STOP_NAME_WRONG
                STOP_NUMBER_WRONG -> Known.STOP_NUMBER_WRONG
                STOP_LOCATION_WRONG -> Known.STOP_LOCATION_WRONG
                ROUTE_OR_TRIP_MISSING -> Known.ROUTE_OR_TRIP_MISSING
                OTHER -> Known.OTHER
                else -> throw OnebusawaySdkInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
