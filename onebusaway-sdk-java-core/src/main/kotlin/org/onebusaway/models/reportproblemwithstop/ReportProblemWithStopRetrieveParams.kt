// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.reportproblemwithstop

import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Enum
import org.onebusaway.core.JsonField
import org.onebusaway.core.Params
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

/** Submit a user-generated problem report for a stop */
class ReportProblemWithStopRetrieveParams
private constructor(
    private val stopId: String?,
    private val code: Code?,
    private val userComment: String?,
    private val userLat: Float?,
    private val userLocationAccuracy: Float?,
    private val userLon: Float?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun stopId(): Optional<String> = Optional.ofNullable(stopId)

    /** A string code identifying the nature of the problem */
    fun code(): Optional<Code> = Optional.ofNullable(code)

    /** Additional comment text supplied by the user describing the problem */
    fun userComment(): Optional<String> = Optional.ofNullable(userComment)

    /** The reporting user’s current latitude */
    fun userLat(): Optional<Float> = Optional.ofNullable(userLat)

    /** The reporting user’s location accuracy, in meters */
    fun userLocationAccuracy(): Optional<Float> = Optional.ofNullable(userLocationAccuracy)

    /** The reporting user’s current longitude */
    fun userLon(): Optional<Float> = Optional.ofNullable(userLon)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportProblemWithStopRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportProblemWithStopRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportProblemWithStopRetrieveParams]. */
    class Builder internal constructor() {

        private var stopId: String? = null
        private var code: Code? = null
        private var userComment: String? = null
        private var userLat: Float? = null
        private var userLocationAccuracy: Float? = null
        private var userLon: Float? = null
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

        fun stopId(stopId: String?) = apply { this.stopId = stopId }

        /** Alias for calling [Builder.stopId] with `stopId.orElse(null)`. */
        fun stopId(stopId: Optional<String>) = stopId(stopId.getOrNull())

        /** A string code identifying the nature of the problem */
        fun code(code: Code?) = apply { this.code = code }

        /** Alias for calling [Builder.code] with `code.orElse(null)`. */
        fun code(code: Optional<Code>) = code(code.getOrNull())

        /** Additional comment text supplied by the user describing the problem */
        fun userComment(userComment: String?) = apply { this.userComment = userComment }

        /** Alias for calling [Builder.userComment] with `userComment.orElse(null)`. */
        fun userComment(userComment: Optional<String>) = userComment(userComment.getOrNull())

        /** The reporting user’s current latitude */
        fun userLat(userLat: Float?) = apply { this.userLat = userLat }

        /**
         * Alias for [Builder.userLat].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userLat(userLat: Float) = userLat(userLat as Float?)

        /** Alias for calling [Builder.userLat] with `userLat.orElse(null)`. */
        fun userLat(userLat: Optional<Float>) = userLat(userLat.getOrNull())

        /** The reporting user’s location accuracy, in meters */
        fun userLocationAccuracy(userLocationAccuracy: Float?) = apply {
            this.userLocationAccuracy = userLocationAccuracy
        }

        /**
         * Alias for [Builder.userLocationAccuracy].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userLocationAccuracy(userLocationAccuracy: Float) =
            userLocationAccuracy(userLocationAccuracy as Float?)

        /**
         * Alias for calling [Builder.userLocationAccuracy] with
         * `userLocationAccuracy.orElse(null)`.
         */
        fun userLocationAccuracy(userLocationAccuracy: Optional<Float>) =
            userLocationAccuracy(userLocationAccuracy.getOrNull())

        /** The reporting user’s current longitude */
        fun userLon(userLon: Float?) = apply { this.userLon = userLon }

        /**
         * Alias for [Builder.userLon].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userLon(userLon: Float) = userLon(userLon as Float?)

        /** Alias for calling [Builder.userLon] with `userLon.orElse(null)`. */
        fun userLon(userLon: Optional<Float>) = userLon(userLon.getOrNull())

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
         * Returns an immutable instance of [ReportProblemWithStopRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportProblemWithStopRetrieveParams =
            ReportProblemWithStopRetrieveParams(
                stopId,
                code,
                userComment,
                userLat,
                userLocationAccuracy,
                userLon,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> stopId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                code?.let { put("code", it.toString()) }
                userComment?.let { put("userComment", it) }
                userLat?.let { put("userLat", it.toString()) }
                userLocationAccuracy?.let { put("userLocationAccuracy", it.toString()) }
                userLon?.let { put("userLon", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** A string code identifying the nature of the problem */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OnebusawaySdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                OnebusawaySdkInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Code = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
