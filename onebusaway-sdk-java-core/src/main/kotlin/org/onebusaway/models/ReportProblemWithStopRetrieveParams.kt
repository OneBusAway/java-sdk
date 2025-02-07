// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.Enum
import org.onebusaway.core.JsonField
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.Params
import org.onebusaway.core.checkRequired
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

/** Submit a user-generated problem report for a stop */
class ReportProblemWithStopRetrieveParams
private constructor(
    private val stopId: String,
    private val code: Code?,
    private val userComment: String?,
    private val userLat: Double?,
    private val userLocationAccuracy: Double?,
    private val userLon: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun stopId(): String = stopId

    /** A string code identifying the nature of the problem */
    fun code(): Optional<Code> = Optional.ofNullable(code)

    /** Additional comment text supplied by the user describing the problem */
    fun userComment(): Optional<String> = Optional.ofNullable(userComment)

    /** The reporting user’s current latitude */
    fun userLat(): Optional<Double> = Optional.ofNullable(userLat)

    /** The reporting user’s location accuracy, in meters */
    fun userLocationAccuracy(): Optional<Double> = Optional.ofNullable(userLocationAccuracy)

    /** The reporting user’s current longitude */
    fun userLon(): Optional<Double> = Optional.ofNullable(userLon)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
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

    /** A builder for [ReportProblemWithStopRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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
        fun code(code: Code?) = apply { this.code = code }

        /** A string code identifying the nature of the problem */
        fun code(code: Optional<Code>) = code(code.orElse(null))

        /** Additional comment text supplied by the user describing the problem */
        fun userComment(userComment: String?) = apply { this.userComment = userComment }

        /** Additional comment text supplied by the user describing the problem */
        fun userComment(userComment: Optional<String>) = userComment(userComment.orElse(null))

        /** The reporting user’s current latitude */
        fun userLat(userLat: Double?) = apply { this.userLat = userLat }

        /** The reporting user’s current latitude */
        fun userLat(userLat: Double) = userLat(userLat as Double?)

        /** The reporting user’s current latitude */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun userLat(userLat: Optional<Double>) = userLat(userLat.orElse(null) as Double?)

        /** The reporting user’s location accuracy, in meters */
        fun userLocationAccuracy(userLocationAccuracy: Double?) = apply {
            this.userLocationAccuracy = userLocationAccuracy
        }

        /** The reporting user’s location accuracy, in meters */
        fun userLocationAccuracy(userLocationAccuracy: Double) =
            userLocationAccuracy(userLocationAccuracy as Double?)

        /** The reporting user’s location accuracy, in meters */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun userLocationAccuracy(userLocationAccuracy: Optional<Double>) =
            userLocationAccuracy(userLocationAccuracy.orElse(null) as Double?)

        /** The reporting user’s current longitude */
        fun userLon(userLon: Double?) = apply { this.userLon = userLon }

        /** The reporting user’s current longitude */
        fun userLon(userLon: Double) = userLon(userLon as Double?)

        /** The reporting user’s current longitude */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun userLon(userLon: Optional<Double>) = userLon(userLon.orElse(null) as Double?)

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
                checkRequired("stopId", stopId),
                code,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** A string code identifying the nature of the problem */
    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val STOP_NAME_WRONG = of("stop_name_wrong")

            @JvmField val STOP_NUMBER_WRONG = of("stop_number_wrong")

            @JvmField val STOP_LOCATION_WRONG = of("stop_location_wrong")

            @JvmField val ROUTE_OR_TRIP_MISSING = of("route_or_trip_missing")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STOP_NAME_WRONG,
            STOP_NUMBER_WRONG,
            STOP_LOCATION_WRONG,
            ROUTE_OR_TRIP_MISSING,
            OTHER,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                STOP_NAME_WRONG -> Value.STOP_NAME_WRONG
                STOP_NUMBER_WRONG -> Value.STOP_NUMBER_WRONG
                STOP_LOCATION_WRONG -> Value.STOP_LOCATION_WRONG
                ROUTE_OR_TRIP_MISSING -> Value.ROUTE_OR_TRIP_MISSING
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OnebusawaySdkInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
