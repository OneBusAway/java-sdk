// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.Enum
import org.onebusaway.core.JsonField
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

class ReportProblemWithStopRetrieveParams
constructor(
    private val stopId: String,
    private val code: Code?,
    private val userComment: String?,
    private val userLat: Double?,
    private val userLocationAccuracy: Double?,
    private val userLon: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun stopId(): String = stopId

    fun code(): Optional<Code> = Optional.ofNullable(code)

    fun userComment(): Optional<String> = Optional.ofNullable(userComment)

    fun userLat(): Optional<Double> = Optional.ofNullable(userLat)

    fun userLocationAccuracy(): Optional<Double> = Optional.ofNullable(userLocationAccuracy)

    fun userLon(): Optional<Double> = Optional.ofNullable(userLon)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.code?.let { queryParams.put("code", listOf(it.toString())) }
        this.userComment?.let { queryParams.put("userComment", listOf(it.toString())) }
        this.userLat?.let { queryParams.put("userLat", listOf(it.toString())) }
        this.userLocationAccuracy?.let {
            queryParams.put("userLocationAccuracy", listOf(it.toString()))
        }
        this.userLon?.let { queryParams.put("userLon", listOf(it.toString())) }
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
        private var code: Code? = null
        private var userComment: String? = null
        private var userLat: Double? = null
        private var userLocationAccuracy: Double? = null
        private var userLon: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            reportProblemWithStopRetrieveParams: ReportProblemWithStopRetrieveParams
        ) = apply {
            stopId = reportProblemWithStopRetrieveParams.stopId
            code = reportProblemWithStopRetrieveParams.code
            userComment = reportProblemWithStopRetrieveParams.userComment
            userLat = reportProblemWithStopRetrieveParams.userLat
            userLocationAccuracy = reportProblemWithStopRetrieveParams.userLocationAccuracy
            userLon = reportProblemWithStopRetrieveParams.userLon
            additionalHeaders = reportProblemWithStopRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                reportProblemWithStopRetrieveParams.additionalQueryParams.toBuilder()
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

        fun build(): ReportProblemWithStopRetrieveParams =
            ReportProblemWithStopRetrieveParams(
                checkNotNull(stopId) { "`stopId` is required but was not set" },
                code,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val STOP_NAME_WRONG = of("stop_name_wrong")

            @JvmField val STOP_NUMBER_WRONG = of("stop_number_wrong")

            @JvmField val STOP_LOCATION_WRONG = of("stop_location_wrong")

            @JvmField val ROUTE_OR_TRIP_MISSING = of("route_or_trip_missing")

            @JvmField val OTHER = of("other")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportProblemWithStopRetrieveParams && stopId == other.stopId && code == other.code && userComment == other.userComment && userLat == other.userLat && userLocationAccuracy == other.userLocationAccuracy && userLon == other.userLon && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stopId, code, userComment, userLat, userLocationAccuracy, userLon, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReportProblemWithStopRetrieveParams{stopId=$stopId, code=$code, userComment=$userComment, userLat=$userLat, userLocationAccuracy=$userLocationAccuracy, userLon=$userLon, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
