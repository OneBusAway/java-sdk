// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.arrivalanddeparture

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.checkKnown
import org.onebusaway.core.checkRequired
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException
import org.onebusaway.models.References
import org.onebusaway.models.ResponseWrapper

class ArrivalAndDepartureRetrieveResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currentTime")
        @ExcludeMissing
        currentTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
    ) : this(code, currentTime, text, version, data, mutableMapOf())

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Long = code.getRequired("code")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentTime(): Long = currentTime.getRequired("currentTime")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [currentTime].
     *
     * Unlike [currentTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ArrivalAndDepartureRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .currentTime()
         * .text()
         * .version()
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArrivalAndDepartureRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            arrivalAndDepartureRetrieveResponse: ArrivalAndDepartureRetrieveResponse
        ) = apply {
            code = arrivalAndDepartureRetrieveResponse.code
            currentTime = arrivalAndDepartureRetrieveResponse.currentTime
            text = arrivalAndDepartureRetrieveResponse.text
            version = arrivalAndDepartureRetrieveResponse.version
            data = arrivalAndDepartureRetrieveResponse.data
            additionalProperties =
                arrivalAndDepartureRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        /**
         * Sets [Builder.currentTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ArrivalAndDepartureRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .currentTime()
         * .text()
         * .version()
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArrivalAndDepartureRetrieveResponse =
            ArrivalAndDepartureRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ArrivalAndDepartureRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        currentTime()
        text()
        version()
        data().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (code.asKnown().isPresent) 1 else 0) +
            (if (currentTime.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    private constructor(
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entry") @ExcludeMissing entry: JsonField<Entry> = JsonMissing.of(),
            @JsonProperty("references")
            @ExcludeMissing
            references: JsonField<References> = JsonMissing.of(),
        ) : this(entry, references, mutableMapOf())

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entry(): Entry = entry.getRequired("entry")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun references(): References = references.getRequired("references")

        /**
         * Returns the raw JSON value of [entry].
         *
         * Unlike [entry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

        /**
         * Returns the raw JSON value of [references].
         *
         * Unlike [references], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("references")
        @ExcludeMissing
        fun _references(): JsonField<References> = references

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .entry()
             * .references()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var entry: JsonField<Entry>? = null
            private var references: JsonField<References>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                entry = data.entry
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            /**
             * Sets [Builder.entry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entry] with a well-typed [Entry] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            /**
             * Sets [Builder.references] to an arbitrary JSON value.
             *
             * You should usually call [Builder.references] with a well-typed [References] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .entry()
             * .references()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("entry", entry),
                    checkRequired("references", references),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entry().validate()
            references().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (entry.asKnown().getOrNull()?.validity() ?: 0) +
                (references.asKnown().getOrNull()?.validity() ?: 0)

        class Entry
        private constructor(
            private val arrivalEnabled: JsonField<Boolean>,
            private val blockTripSequence: JsonField<Long>,
            private val departureEnabled: JsonField<Boolean>,
            private val numberOfStopsAway: JsonField<Long>,
            private val predictedArrivalTime: JsonField<Long>,
            private val predictedDepartureTime: JsonField<Long>,
            private val routeId: JsonField<String>,
            private val scheduledArrivalTime: JsonField<Long>,
            private val scheduledDepartureTime: JsonField<Long>,
            private val serviceDate: JsonField<Long>,
            private val stopId: JsonField<String>,
            private val stopSequence: JsonField<Long>,
            private val totalStopsInTrip: JsonField<Long>,
            private val tripHeadsign: JsonField<String>,
            private val tripId: JsonField<String>,
            private val vehicleId: JsonField<String>,
            private val actualTrack: JsonField<String>,
            private val distanceFromStop: JsonField<Double>,
            private val frequency: JsonField<String>,
            private val historicalOccupancy: JsonField<String>,
            private val lastUpdateTime: JsonField<Long>,
            private val occupancyStatus: JsonField<String>,
            private val predicted: JsonField<Boolean>,
            private val predictedArrivalInterval: JsonField<String>,
            private val predictedDepartureInterval: JsonField<String>,
            private val predictedOccupancy: JsonField<String>,
            private val routeLongName: JsonField<String>,
            private val routeShortName: JsonField<String>,
            private val scheduledArrivalInterval: JsonField<String>,
            private val scheduledDepartureInterval: JsonField<String>,
            private val scheduledTrack: JsonField<String>,
            private val situationIds: JsonField<List<String>>,
            private val status: JsonField<String>,
            private val tripStatus: JsonField<TripStatus>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("arrivalEnabled")
                @ExcludeMissing
                arrivalEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                blockTripSequence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("departureEnabled")
                @ExcludeMissing
                departureEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("numberOfStopsAway")
                @ExcludeMissing
                numberOfStopsAway: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("predictedArrivalTime")
                @ExcludeMissing
                predictedArrivalTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("predictedDepartureTime")
                @ExcludeMissing
                predictedDepartureTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("routeId")
                @ExcludeMissing
                routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledArrivalTime")
                @ExcludeMissing
                scheduledArrivalTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("scheduledDepartureTime")
                @ExcludeMissing
                scheduledDepartureTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("serviceDate")
                @ExcludeMissing
                serviceDate: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("stopId")
                @ExcludeMissing
                stopId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopSequence")
                @ExcludeMissing
                stopSequence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalStopsInTrip")
                @ExcludeMissing
                totalStopsInTrip: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                tripHeadsign: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tripId")
                @ExcludeMissing
                tripId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vehicleId")
                @ExcludeMissing
                vehicleId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actualTrack")
                @ExcludeMissing
                actualTrack: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distanceFromStop")
                @ExcludeMissing
                distanceFromStop: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                frequency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("historicalOccupancy")
                @ExcludeMissing
                historicalOccupancy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                lastUpdateTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                occupancyStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predicted")
                @ExcludeMissing
                predicted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("predictedArrivalInterval")
                @ExcludeMissing
                predictedArrivalInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predictedDepartureInterval")
                @ExcludeMissing
                predictedDepartureInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predictedOccupancy")
                @ExcludeMissing
                predictedOccupancy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeLongName")
                @ExcludeMissing
                routeLongName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeShortName")
                @ExcludeMissing
                routeShortName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledArrivalInterval")
                @ExcludeMissing
                scheduledArrivalInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledDepartureInterval")
                @ExcludeMissing
                scheduledDepartureInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledTrack")
                @ExcludeMissing
                scheduledTrack: JsonField<String> = JsonMissing.of(),
                @JsonProperty("situationIds")
                @ExcludeMissing
                situationIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tripStatus")
                @ExcludeMissing
                tripStatus: JsonField<TripStatus> = JsonMissing.of(),
            ) : this(
                arrivalEnabled,
                blockTripSequence,
                departureEnabled,
                numberOfStopsAway,
                predictedArrivalTime,
                predictedDepartureTime,
                routeId,
                scheduledArrivalTime,
                scheduledDepartureTime,
                serviceDate,
                stopId,
                stopSequence,
                totalStopsInTrip,
                tripHeadsign,
                tripId,
                vehicleId,
                actualTrack,
                distanceFromStop,
                frequency,
                historicalOccupancy,
                lastUpdateTime,
                occupancyStatus,
                predicted,
                predictedArrivalInterval,
                predictedDepartureInterval,
                predictedOccupancy,
                routeLongName,
                routeShortName,
                scheduledArrivalInterval,
                scheduledDepartureInterval,
                scheduledTrack,
                situationIds,
                status,
                tripStatus,
                mutableMapOf(),
            )

            /**
             * Indicates if riders can arrive on this transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

            /**
             * Index of this arrival’s trip into the sequence of trips for the active block.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

            /**
             * Indicates if riders can depart from this transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun departureEnabled(): Boolean = departureEnabled.getRequired("departureEnabled")

            /**
             * Number of stops between the arriving transit vehicle and the current stop (excluding
             * the current stop).
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun numberOfStopsAway(): Long = numberOfStopsAway.getRequired("numberOfStopsAway")

            /**
             * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
             * available).
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun predictedArrivalTime(): Long =
                predictedArrivalTime.getRequired("predictedArrivalTime")

            /**
             * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
             * available).
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun predictedDepartureTime(): Long =
                predictedDepartureTime.getRequired("predictedDepartureTime")

            /**
             * The ID of the route for the arriving vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routeId(): String = routeId.getRequired("routeId")

            /**
             * Scheduled arrival time, in milliseconds since Unix epoch.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduledArrivalTime(): Long =
                scheduledArrivalTime.getRequired("scheduledArrivalTime")

            /**
             * Scheduled departure time, in milliseconds since Unix epoch.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduledDepartureTime(): Long =
                scheduledDepartureTime.getRequired("scheduledDepartureTime")

            /**
             * Time, in milliseconds since the Unix epoch, of midnight for the start of the service
             * date for the trip.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

            /**
             * The ID of the stop the vehicle is arriving at.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stopId(): String = stopId.getRequired("stopId")

            /**
             * Index of the stop into the sequence of stops that make up the trip for this arrival.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stopSequence(): Long = stopSequence.getRequired("stopSequence")

            /**
             * Total number of stops visited on the trip for this arrival.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalStopsInTrip(): Long = totalStopsInTrip.getRequired("totalStopsInTrip")

            /**
             * Optional trip headsign that potentially overrides the trip headsign in the referenced
             * trip element.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

            /**
             * The ID of the trip for the arriving vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tripId(): String = tripId.getRequired("tripId")

            /**
             * ID of the transit vehicle serving this trip.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun vehicleId(): String = vehicleId.getRequired("vehicleId")

            /**
             * The actual track information of the arriving transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun actualTrack(): Optional<String> = actualTrack.getOptional("actualTrack")

            /**
             * Distance of the arriving transit vehicle from the stop, in meters.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distanceFromStop(): Optional<Double> =
                distanceFromStop.getOptional("distanceFromStop")

            /**
             * Information about frequency-based scheduling, if applicable to the trip.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun frequency(): Optional<String> = frequency.getOptional("frequency")

            /**
             * Historical occupancy information of the transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun historicalOccupancy(): Optional<String> =
                historicalOccupancy.getOptional("historicalOccupancy")

            /**
             * Timestamp of the last update time for this arrival.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lastUpdateTime(): Optional<Long> = lastUpdateTime.getOptional("lastUpdateTime")

            /**
             * Current occupancy status of the transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun occupancyStatus(): Optional<String> = occupancyStatus.getOptional("occupancyStatus")

            /**
             * Indicates if real-time arrival info is available for this trip.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun predicted(): Optional<Boolean> = predicted.getOptional("predicted")

            /**
             * Interval for predicted arrival time, if available.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun predictedArrivalInterval(): Optional<String> =
                predictedArrivalInterval.getOptional("predictedArrivalInterval")

            /**
             * Interval for predicted departure time, if available.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun predictedDepartureInterval(): Optional<String> =
                predictedDepartureInterval.getOptional("predictedDepartureInterval")

            /**
             * Predicted occupancy status of the transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun predictedOccupancy(): Optional<String> =
                predictedOccupancy.getOptional("predictedOccupancy")

            /**
             * Optional route long name that potentially overrides the route long name in the
             * referenced route element.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routeLongName(): Optional<String> = routeLongName.getOptional("routeLongName")

            /**
             * Optional route short name that potentially overrides the route short name in the
             * referenced route element.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routeShortName(): Optional<String> = routeShortName.getOptional("routeShortName")

            /**
             * Interval for scheduled arrival time.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun scheduledArrivalInterval(): Optional<String> =
                scheduledArrivalInterval.getOptional("scheduledArrivalInterval")

            /**
             * Interval for scheduled departure time.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun scheduledDepartureInterval(): Optional<String> =
                scheduledDepartureInterval.getOptional("scheduledDepartureInterval")

            /**
             * Scheduled track information of the arriving transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun scheduledTrack(): Optional<String> = scheduledTrack.getOptional("scheduledTrack")

            /**
             * References to situation elements (if any) applicable to this arrival.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun situationIds(): Optional<List<String>> = situationIds.getOptional("situationIds")

            /**
             * Current status of the arrival.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<String> = status.getOptional("status")

            /**
             * Trip-specific status for the arriving transit vehicle.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tripStatus(): Optional<TripStatus> = tripStatus.getOptional("tripStatus")

            /**
             * Returns the raw JSON value of [arrivalEnabled].
             *
             * Unlike [arrivalEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("arrivalEnabled")
            @ExcludeMissing
            fun _arrivalEnabled(): JsonField<Boolean> = arrivalEnabled

            /**
             * Returns the raw JSON value of [blockTripSequence].
             *
             * Unlike [blockTripSequence], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("blockTripSequence")
            @ExcludeMissing
            fun _blockTripSequence(): JsonField<Long> = blockTripSequence

            /**
             * Returns the raw JSON value of [departureEnabled].
             *
             * Unlike [departureEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("departureEnabled")
            @ExcludeMissing
            fun _departureEnabled(): JsonField<Boolean> = departureEnabled

            /**
             * Returns the raw JSON value of [numberOfStopsAway].
             *
             * Unlike [numberOfStopsAway], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("numberOfStopsAway")
            @ExcludeMissing
            fun _numberOfStopsAway(): JsonField<Long> = numberOfStopsAway

            /**
             * Returns the raw JSON value of [predictedArrivalTime].
             *
             * Unlike [predictedArrivalTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictedArrivalTime")
            @ExcludeMissing
            fun _predictedArrivalTime(): JsonField<Long> = predictedArrivalTime

            /**
             * Returns the raw JSON value of [predictedDepartureTime].
             *
             * Unlike [predictedDepartureTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictedDepartureTime")
            @ExcludeMissing
            fun _predictedDepartureTime(): JsonField<Long> = predictedDepartureTime

            /**
             * Returns the raw JSON value of [routeId].
             *
             * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            /**
             * Returns the raw JSON value of [scheduledArrivalTime].
             *
             * Unlike [scheduledArrivalTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduledArrivalTime")
            @ExcludeMissing
            fun _scheduledArrivalTime(): JsonField<Long> = scheduledArrivalTime

            /**
             * Returns the raw JSON value of [scheduledDepartureTime].
             *
             * Unlike [scheduledDepartureTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduledDepartureTime")
            @ExcludeMissing
            fun _scheduledDepartureTime(): JsonField<Long> = scheduledDepartureTime

            /**
             * Returns the raw JSON value of [serviceDate].
             *
             * Unlike [serviceDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("serviceDate")
            @ExcludeMissing
            fun _serviceDate(): JsonField<Long> = serviceDate

            /**
             * Returns the raw JSON value of [stopId].
             *
             * Unlike [stopId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stopId") @ExcludeMissing fun _stopId(): JsonField<String> = stopId

            /**
             * Returns the raw JSON value of [stopSequence].
             *
             * Unlike [stopSequence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stopSequence")
            @ExcludeMissing
            fun _stopSequence(): JsonField<Long> = stopSequence

            /**
             * Returns the raw JSON value of [totalStopsInTrip].
             *
             * Unlike [totalStopsInTrip], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("totalStopsInTrip")
            @ExcludeMissing
            fun _totalStopsInTrip(): JsonField<Long> = totalStopsInTrip

            /**
             * Returns the raw JSON value of [tripHeadsign].
             *
             * Unlike [tripHeadsign], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tripHeadsign")
            @ExcludeMissing
            fun _tripHeadsign(): JsonField<String> = tripHeadsign

            /**
             * Returns the raw JSON value of [tripId].
             *
             * Unlike [tripId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tripId") @ExcludeMissing fun _tripId(): JsonField<String> = tripId

            /**
             * Returns the raw JSON value of [vehicleId].
             *
             * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vehicleId")
            @ExcludeMissing
            fun _vehicleId(): JsonField<String> = vehicleId

            /**
             * Returns the raw JSON value of [actualTrack].
             *
             * Unlike [actualTrack], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("actualTrack")
            @ExcludeMissing
            fun _actualTrack(): JsonField<String> = actualTrack

            /**
             * Returns the raw JSON value of [distanceFromStop].
             *
             * Unlike [distanceFromStop], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("distanceFromStop")
            @ExcludeMissing
            fun _distanceFromStop(): JsonField<Double> = distanceFromStop

            /**
             * Returns the raw JSON value of [frequency].
             *
             * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<String> = frequency

            /**
             * Returns the raw JSON value of [historicalOccupancy].
             *
             * Unlike [historicalOccupancy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("historicalOccupancy")
            @ExcludeMissing
            fun _historicalOccupancy(): JsonField<String> = historicalOccupancy

            /**
             * Returns the raw JSON value of [lastUpdateTime].
             *
             * Unlike [lastUpdateTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lastUpdateTime")
            @ExcludeMissing
            fun _lastUpdateTime(): JsonField<Long> = lastUpdateTime

            /**
             * Returns the raw JSON value of [occupancyStatus].
             *
             * Unlike [occupancyStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("occupancyStatus")
            @ExcludeMissing
            fun _occupancyStatus(): JsonField<String> = occupancyStatus

            /**
             * Returns the raw JSON value of [predicted].
             *
             * Unlike [predicted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("predicted")
            @ExcludeMissing
            fun _predicted(): JsonField<Boolean> = predicted

            /**
             * Returns the raw JSON value of [predictedArrivalInterval].
             *
             * Unlike [predictedArrivalInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictedArrivalInterval")
            @ExcludeMissing
            fun _predictedArrivalInterval(): JsonField<String> = predictedArrivalInterval

            /**
             * Returns the raw JSON value of [predictedDepartureInterval].
             *
             * Unlike [predictedDepartureInterval], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("predictedDepartureInterval")
            @ExcludeMissing
            fun _predictedDepartureInterval(): JsonField<String> = predictedDepartureInterval

            /**
             * Returns the raw JSON value of [predictedOccupancy].
             *
             * Unlike [predictedOccupancy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictedOccupancy")
            @ExcludeMissing
            fun _predictedOccupancy(): JsonField<String> = predictedOccupancy

            /**
             * Returns the raw JSON value of [routeLongName].
             *
             * Unlike [routeLongName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routeLongName")
            @ExcludeMissing
            fun _routeLongName(): JsonField<String> = routeLongName

            /**
             * Returns the raw JSON value of [routeShortName].
             *
             * Unlike [routeShortName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("routeShortName")
            @ExcludeMissing
            fun _routeShortName(): JsonField<String> = routeShortName

            /**
             * Returns the raw JSON value of [scheduledArrivalInterval].
             *
             * Unlike [scheduledArrivalInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduledArrivalInterval")
            @ExcludeMissing
            fun _scheduledArrivalInterval(): JsonField<String> = scheduledArrivalInterval

            /**
             * Returns the raw JSON value of [scheduledDepartureInterval].
             *
             * Unlike [scheduledDepartureInterval], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("scheduledDepartureInterval")
            @ExcludeMissing
            fun _scheduledDepartureInterval(): JsonField<String> = scheduledDepartureInterval

            /**
             * Returns the raw JSON value of [scheduledTrack].
             *
             * Unlike [scheduledTrack], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduledTrack")
            @ExcludeMissing
            fun _scheduledTrack(): JsonField<String> = scheduledTrack

            /**
             * Returns the raw JSON value of [situationIds].
             *
             * Unlike [situationIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("situationIds")
            @ExcludeMissing
            fun _situationIds(): JsonField<List<String>> = situationIds

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

            /**
             * Returns the raw JSON value of [tripStatus].
             *
             * Unlike [tripStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tripStatus")
            @ExcludeMissing
            fun _tripStatus(): JsonField<TripStatus> = tripStatus

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Entry].
                 *
                 * The following fields are required:
                 * ```java
                 * .arrivalEnabled()
                 * .blockTripSequence()
                 * .departureEnabled()
                 * .numberOfStopsAway()
                 * .predictedArrivalTime()
                 * .predictedDepartureTime()
                 * .routeId()
                 * .scheduledArrivalTime()
                 * .scheduledDepartureTime()
                 * .serviceDate()
                 * .stopId()
                 * .stopSequence()
                 * .totalStopsInTrip()
                 * .tripHeadsign()
                 * .tripId()
                 * .vehicleId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var arrivalEnabled: JsonField<Boolean>? = null
                private var blockTripSequence: JsonField<Long>? = null
                private var departureEnabled: JsonField<Boolean>? = null
                private var numberOfStopsAway: JsonField<Long>? = null
                private var predictedArrivalTime: JsonField<Long>? = null
                private var predictedDepartureTime: JsonField<Long>? = null
                private var routeId: JsonField<String>? = null
                private var scheduledArrivalTime: JsonField<Long>? = null
                private var scheduledDepartureTime: JsonField<Long>? = null
                private var serviceDate: JsonField<Long>? = null
                private var stopId: JsonField<String>? = null
                private var stopSequence: JsonField<Long>? = null
                private var totalStopsInTrip: JsonField<Long>? = null
                private var tripHeadsign: JsonField<String>? = null
                private var tripId: JsonField<String>? = null
                private var vehicleId: JsonField<String>? = null
                private var actualTrack: JsonField<String> = JsonMissing.of()
                private var distanceFromStop: JsonField<Double> = JsonMissing.of()
                private var frequency: JsonField<String> = JsonMissing.of()
                private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                private var occupancyStatus: JsonField<String> = JsonMissing.of()
                private var predicted: JsonField<Boolean> = JsonMissing.of()
                private var predictedArrivalInterval: JsonField<String> = JsonMissing.of()
                private var predictedDepartureInterval: JsonField<String> = JsonMissing.of()
                private var predictedOccupancy: JsonField<String> = JsonMissing.of()
                private var routeLongName: JsonField<String> = JsonMissing.of()
                private var routeShortName: JsonField<String> = JsonMissing.of()
                private var scheduledArrivalInterval: JsonField<String> = JsonMissing.of()
                private var scheduledDepartureInterval: JsonField<String> = JsonMissing.of()
                private var scheduledTrack: JsonField<String> = JsonMissing.of()
                private var situationIds: JsonField<MutableList<String>>? = null
                private var status: JsonField<String> = JsonMissing.of()
                private var tripStatus: JsonField<TripStatus> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    arrivalEnabled = entry.arrivalEnabled
                    blockTripSequence = entry.blockTripSequence
                    departureEnabled = entry.departureEnabled
                    numberOfStopsAway = entry.numberOfStopsAway
                    predictedArrivalTime = entry.predictedArrivalTime
                    predictedDepartureTime = entry.predictedDepartureTime
                    routeId = entry.routeId
                    scheduledArrivalTime = entry.scheduledArrivalTime
                    scheduledDepartureTime = entry.scheduledDepartureTime
                    serviceDate = entry.serviceDate
                    stopId = entry.stopId
                    stopSequence = entry.stopSequence
                    totalStopsInTrip = entry.totalStopsInTrip
                    tripHeadsign = entry.tripHeadsign
                    tripId = entry.tripId
                    vehicleId = entry.vehicleId
                    actualTrack = entry.actualTrack
                    distanceFromStop = entry.distanceFromStop
                    frequency = entry.frequency
                    historicalOccupancy = entry.historicalOccupancy
                    lastUpdateTime = entry.lastUpdateTime
                    occupancyStatus = entry.occupancyStatus
                    predicted = entry.predicted
                    predictedArrivalInterval = entry.predictedArrivalInterval
                    predictedDepartureInterval = entry.predictedDepartureInterval
                    predictedOccupancy = entry.predictedOccupancy
                    routeLongName = entry.routeLongName
                    routeShortName = entry.routeShortName
                    scheduledArrivalInterval = entry.scheduledArrivalInterval
                    scheduledDepartureInterval = entry.scheduledDepartureInterval
                    scheduledTrack = entry.scheduledTrack
                    situationIds = entry.situationIds.map { it.toMutableList() }
                    status = entry.status
                    tripStatus = entry.tripStatus
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                /** Indicates if riders can arrive on this transit vehicle. */
                fun arrivalEnabled(arrivalEnabled: Boolean) =
                    arrivalEnabled(JsonField.of(arrivalEnabled))

                /**
                 * Sets [Builder.arrivalEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arrivalEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                    this.arrivalEnabled = arrivalEnabled
                }

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                fun blockTripSequence(blockTripSequence: Long) =
                    blockTripSequence(JsonField.of(blockTripSequence))

                /**
                 * Sets [Builder.blockTripSequence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockTripSequence] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                    this.blockTripSequence = blockTripSequence
                }

                /** Indicates if riders can depart from this transit vehicle. */
                fun departureEnabled(departureEnabled: Boolean) =
                    departureEnabled(JsonField.of(departureEnabled))

                /**
                 * Sets [Builder.departureEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.departureEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                    this.departureEnabled = departureEnabled
                }

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                fun numberOfStopsAway(numberOfStopsAway: Long) =
                    numberOfStopsAway(JsonField.of(numberOfStopsAway))

                /**
                 * Sets [Builder.numberOfStopsAway] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numberOfStopsAway] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun numberOfStopsAway(numberOfStopsAway: JsonField<Long>) = apply {
                    this.numberOfStopsAway = numberOfStopsAway
                }

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedArrivalTime(predictedArrivalTime: Long) =
                    predictedArrivalTime(JsonField.of(predictedArrivalTime))

                /**
                 * Sets [Builder.predictedArrivalTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictedArrivalTime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun predictedArrivalTime(predictedArrivalTime: JsonField<Long>) = apply {
                    this.predictedArrivalTime = predictedArrivalTime
                }

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedDepartureTime(predictedDepartureTime: Long) =
                    predictedDepartureTime(JsonField.of(predictedDepartureTime))

                /**
                 * Sets [Builder.predictedDepartureTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictedDepartureTime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun predictedDepartureTime(predictedDepartureTime: JsonField<Long>) = apply {
                    this.predictedDepartureTime = predictedDepartureTime
                }

                /** The ID of the route for the arriving vehicle. */
                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                /**
                 * Sets [Builder.routeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                fun scheduledArrivalTime(scheduledArrivalTime: Long) =
                    scheduledArrivalTime(JsonField.of(scheduledArrivalTime))

                /**
                 * Sets [Builder.scheduledArrivalTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledArrivalTime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun scheduledArrivalTime(scheduledArrivalTime: JsonField<Long>) = apply {
                    this.scheduledArrivalTime = scheduledArrivalTime
                }

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                fun scheduledDepartureTime(scheduledDepartureTime: Long) =
                    scheduledDepartureTime(JsonField.of(scheduledDepartureTime))

                /**
                 * Sets [Builder.scheduledDepartureTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledDepartureTime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun scheduledDepartureTime(scheduledDepartureTime: JsonField<Long>) = apply {
                    this.scheduledDepartureTime = scheduledDepartureTime
                }

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                /**
                 * Sets [Builder.serviceDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceDate] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun serviceDate(serviceDate: JsonField<Long>) = apply {
                    this.serviceDate = serviceDate
                }

                /** The ID of the stop the vehicle is arriving at. */
                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                /**
                 * Sets [Builder.stopId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                fun stopSequence(stopSequence: Long) = stopSequence(JsonField.of(stopSequence))

                /**
                 * Sets [Builder.stopSequence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopSequence] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stopSequence(stopSequence: JsonField<Long>) = apply {
                    this.stopSequence = stopSequence
                }

                /** Total number of stops visited on the trip for this arrival. */
                fun totalStopsInTrip(totalStopsInTrip: Long) =
                    totalStopsInTrip(JsonField.of(totalStopsInTrip))

                /**
                 * Sets [Builder.totalStopsInTrip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalStopsInTrip] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalStopsInTrip(totalStopsInTrip: JsonField<Long>) = apply {
                    this.totalStopsInTrip = totalStopsInTrip
                }

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

                /**
                 * Sets [Builder.tripHeadsign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripHeadsign] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                    this.tripHeadsign = tripHeadsign
                }

                /** The ID of the trip for the arriving vehicle. */
                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /**
                 * Sets [Builder.tripId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                /** ID of the transit vehicle serving this trip. */
                fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                /**
                 * Sets [Builder.vehicleId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vehicleId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vehicleId(vehicleId: JsonField<String>) = apply { this.vehicleId = vehicleId }

                /** The actual track information of the arriving transit vehicle. */
                fun actualTrack(actualTrack: String) = actualTrack(JsonField.of(actualTrack))

                /**
                 * Sets [Builder.actualTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actualTrack] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun actualTrack(actualTrack: JsonField<String>) = apply {
                    this.actualTrack = actualTrack
                }

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                fun distanceFromStop(distanceFromStop: Double) =
                    distanceFromStop(JsonField.of(distanceFromStop))

                /**
                 * Sets [Builder.distanceFromStop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distanceFromStop] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun distanceFromStop(distanceFromStop: JsonField<Double>) = apply {
                    this.distanceFromStop = distanceFromStop
                }

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frequency(frequency: JsonField<String>) = apply { this.frequency = frequency }

                /** Historical occupancy information of the transit vehicle. */
                fun historicalOccupancy(historicalOccupancy: String) =
                    historicalOccupancy(JsonField.of(historicalOccupancy))

                /**
                 * Sets [Builder.historicalOccupancy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.historicalOccupancy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                    this.historicalOccupancy = historicalOccupancy
                }

                /** Timestamp of the last update time for this arrival. */
                fun lastUpdateTime(lastUpdateTime: Long) =
                    lastUpdateTime(JsonField.of(lastUpdateTime))

                /**
                 * Sets [Builder.lastUpdateTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastUpdateTime] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                    this.lastUpdateTime = lastUpdateTime
                }

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(occupancyStatus: String) =
                    occupancyStatus(JsonField.of(occupancyStatus))

                /**
                 * Sets [Builder.occupancyStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occupancyStatus] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                    this.occupancyStatus = occupancyStatus
                }

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                /**
                 * Sets [Builder.predicted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predicted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun predicted(predicted: JsonField<Boolean>) = apply { this.predicted = predicted }

                /** Interval for predicted arrival time, if available. */
                fun predictedArrivalInterval(predictedArrivalInterval: String) =
                    predictedArrivalInterval(JsonField.of(predictedArrivalInterval))

                /**
                 * Sets [Builder.predictedArrivalInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictedArrivalInterval] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun predictedArrivalInterval(predictedArrivalInterval: JsonField<String>) = apply {
                    this.predictedArrivalInterval = predictedArrivalInterval
                }

                /** Interval for predicted departure time, if available. */
                fun predictedDepartureInterval(predictedDepartureInterval: String) =
                    predictedDepartureInterval(JsonField.of(predictedDepartureInterval))

                /**
                 * Sets [Builder.predictedDepartureInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictedDepartureInterval] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun predictedDepartureInterval(predictedDepartureInterval: JsonField<String>) =
                    apply {
                        this.predictedDepartureInterval = predictedDepartureInterval
                    }

                /** Predicted occupancy status of the transit vehicle. */
                fun predictedOccupancy(predictedOccupancy: String) =
                    predictedOccupancy(JsonField.of(predictedOccupancy))

                /**
                 * Sets [Builder.predictedOccupancy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictedOccupancy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun predictedOccupancy(predictedOccupancy: JsonField<String>) = apply {
                    this.predictedOccupancy = predictedOccupancy
                }

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                fun routeLongName(routeLongName: String) =
                    routeLongName(JsonField.of(routeLongName))

                /**
                 * Sets [Builder.routeLongName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeLongName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeLongName(routeLongName: JsonField<String>) = apply {
                    this.routeLongName = routeLongName
                }

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                fun routeShortName(routeShortName: String) =
                    routeShortName(JsonField.of(routeShortName))

                /**
                 * Sets [Builder.routeShortName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeShortName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeShortName(routeShortName: JsonField<String>) = apply {
                    this.routeShortName = routeShortName
                }

                /** Interval for scheduled arrival time. */
                fun scheduledArrivalInterval(scheduledArrivalInterval: String) =
                    scheduledArrivalInterval(JsonField.of(scheduledArrivalInterval))

                /**
                 * Sets [Builder.scheduledArrivalInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledArrivalInterval] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun scheduledArrivalInterval(scheduledArrivalInterval: JsonField<String>) = apply {
                    this.scheduledArrivalInterval = scheduledArrivalInterval
                }

                /** Interval for scheduled departure time. */
                fun scheduledDepartureInterval(scheduledDepartureInterval: String) =
                    scheduledDepartureInterval(JsonField.of(scheduledDepartureInterval))

                /**
                 * Sets [Builder.scheduledDepartureInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledDepartureInterval] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun scheduledDepartureInterval(scheduledDepartureInterval: JsonField<String>) =
                    apply {
                        this.scheduledDepartureInterval = scheduledDepartureInterval
                    }

                /** Scheduled track information of the arriving transit vehicle. */
                fun scheduledTrack(scheduledTrack: String) =
                    scheduledTrack(JsonField.of(scheduledTrack))

                /**
                 * Sets [Builder.scheduledTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledTrack] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scheduledTrack(scheduledTrack: JsonField<String>) = apply {
                    this.scheduledTrack = scheduledTrack
                }

                /** References to situation elements (if any) applicable to this arrival. */
                fun situationIds(situationIds: List<String>) =
                    situationIds(JsonField.of(situationIds))

                /**
                 * Sets [Builder.situationIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.situationIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun situationIds(situationIds: JsonField<List<String>>) = apply {
                    this.situationIds = situationIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [situationIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSituationId(situationId: String) = apply {
                    situationIds =
                        (situationIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("situationIds", it).add(situationId)
                        }
                }

                /** Current status of the arrival. */
                fun status(status: String) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<String>) = apply { this.status = status }

                /** Trip-specific status for the arriving transit vehicle. */
                fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                /**
                 * Sets [Builder.tripStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripStatus] with a well-typed [TripStatus] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                    this.tripStatus = tripStatus
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Entry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .arrivalEnabled()
                 * .blockTripSequence()
                 * .departureEnabled()
                 * .numberOfStopsAway()
                 * .predictedArrivalTime()
                 * .predictedDepartureTime()
                 * .routeId()
                 * .scheduledArrivalTime()
                 * .scheduledDepartureTime()
                 * .serviceDate()
                 * .stopId()
                 * .stopSequence()
                 * .totalStopsInTrip()
                 * .tripHeadsign()
                 * .tripId()
                 * .vehicleId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entry =
                    Entry(
                        checkRequired("arrivalEnabled", arrivalEnabled),
                        checkRequired("blockTripSequence", blockTripSequence),
                        checkRequired("departureEnabled", departureEnabled),
                        checkRequired("numberOfStopsAway", numberOfStopsAway),
                        checkRequired("predictedArrivalTime", predictedArrivalTime),
                        checkRequired("predictedDepartureTime", predictedDepartureTime),
                        checkRequired("routeId", routeId),
                        checkRequired("scheduledArrivalTime", scheduledArrivalTime),
                        checkRequired("scheduledDepartureTime", scheduledDepartureTime),
                        checkRequired("serviceDate", serviceDate),
                        checkRequired("stopId", stopId),
                        checkRequired("stopSequence", stopSequence),
                        checkRequired("totalStopsInTrip", totalStopsInTrip),
                        checkRequired("tripHeadsign", tripHeadsign),
                        checkRequired("tripId", tripId),
                        checkRequired("vehicleId", vehicleId),
                        actualTrack,
                        distanceFromStop,
                        frequency,
                        historicalOccupancy,
                        lastUpdateTime,
                        occupancyStatus,
                        predicted,
                        predictedArrivalInterval,
                        predictedDepartureInterval,
                        predictedOccupancy,
                        routeLongName,
                        routeShortName,
                        scheduledArrivalInterval,
                        scheduledDepartureInterval,
                        scheduledTrack,
                        (situationIds ?: JsonMissing.of()).map { it.toImmutable() },
                        status,
                        tripStatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                arrivalEnabled()
                blockTripSequence()
                departureEnabled()
                numberOfStopsAway()
                predictedArrivalTime()
                predictedDepartureTime()
                routeId()
                scheduledArrivalTime()
                scheduledDepartureTime()
                serviceDate()
                stopId()
                stopSequence()
                totalStopsInTrip()
                tripHeadsign()
                tripId()
                vehicleId()
                actualTrack()
                distanceFromStop()
                frequency()
                historicalOccupancy()
                lastUpdateTime()
                occupancyStatus()
                predicted()
                predictedArrivalInterval()
                predictedDepartureInterval()
                predictedOccupancy()
                routeLongName()
                routeShortName()
                scheduledArrivalInterval()
                scheduledDepartureInterval()
                scheduledTrack()
                situationIds()
                status()
                tripStatus().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (arrivalEnabled.asKnown().isPresent) 1 else 0) +
                    (if (blockTripSequence.asKnown().isPresent) 1 else 0) +
                    (if (departureEnabled.asKnown().isPresent) 1 else 0) +
                    (if (numberOfStopsAway.asKnown().isPresent) 1 else 0) +
                    (if (predictedArrivalTime.asKnown().isPresent) 1 else 0) +
                    (if (predictedDepartureTime.asKnown().isPresent) 1 else 0) +
                    (if (routeId.asKnown().isPresent) 1 else 0) +
                    (if (scheduledArrivalTime.asKnown().isPresent) 1 else 0) +
                    (if (scheduledDepartureTime.asKnown().isPresent) 1 else 0) +
                    (if (serviceDate.asKnown().isPresent) 1 else 0) +
                    (if (stopId.asKnown().isPresent) 1 else 0) +
                    (if (stopSequence.asKnown().isPresent) 1 else 0) +
                    (if (totalStopsInTrip.asKnown().isPresent) 1 else 0) +
                    (if (tripHeadsign.asKnown().isPresent) 1 else 0) +
                    (if (tripId.asKnown().isPresent) 1 else 0) +
                    (if (vehicleId.asKnown().isPresent) 1 else 0) +
                    (if (actualTrack.asKnown().isPresent) 1 else 0) +
                    (if (distanceFromStop.asKnown().isPresent) 1 else 0) +
                    (if (frequency.asKnown().isPresent) 1 else 0) +
                    (if (historicalOccupancy.asKnown().isPresent) 1 else 0) +
                    (if (lastUpdateTime.asKnown().isPresent) 1 else 0) +
                    (if (occupancyStatus.asKnown().isPresent) 1 else 0) +
                    (if (predicted.asKnown().isPresent) 1 else 0) +
                    (if (predictedArrivalInterval.asKnown().isPresent) 1 else 0) +
                    (if (predictedDepartureInterval.asKnown().isPresent) 1 else 0) +
                    (if (predictedOccupancy.asKnown().isPresent) 1 else 0) +
                    (if (routeLongName.asKnown().isPresent) 1 else 0) +
                    (if (routeShortName.asKnown().isPresent) 1 else 0) +
                    (if (scheduledArrivalInterval.asKnown().isPresent) 1 else 0) +
                    (if (scheduledDepartureInterval.asKnown().isPresent) 1 else 0) +
                    (if (scheduledTrack.asKnown().isPresent) 1 else 0) +
                    (situationIds.asKnown().getOrNull()?.size ?: 0) +
                    (if (status.asKnown().isPresent) 1 else 0) +
                    (tripStatus.asKnown().getOrNull()?.validity() ?: 0)

            /** Trip-specific status for the arriving transit vehicle. */
            class TripStatus
            private constructor(
                private val activeTripId: JsonField<String>,
                private val blockTripSequence: JsonField<Long>,
                private val closestStop: JsonField<String>,
                private val distanceAlongTrip: JsonField<Double>,
                private val lastKnownDistanceAlongTrip: JsonField<Double>,
                private val lastLocationUpdateTime: JsonField<Long>,
                private val lastUpdateTime: JsonField<Long>,
                private val occupancyCapacity: JsonField<Long>,
                private val occupancyCount: JsonField<Long>,
                private val occupancyStatus: JsonField<String>,
                private val phase: JsonField<String>,
                private val predicted: JsonField<Boolean>,
                private val scheduleDeviation: JsonField<Long>,
                private val serviceDate: JsonField<Long>,
                private val status: JsonField<String>,
                private val totalDistanceAlongTrip: JsonField<Double>,
                private val closestStopTimeOffset: JsonField<Long>,
                private val frequency: JsonField<String>,
                private val lastKnownLocation: JsonField<LastKnownLocation>,
                private val lastKnownOrientation: JsonField<Double>,
                private val nextStop: JsonField<String>,
                private val nextStopTimeOffset: JsonField<Long>,
                private val orientation: JsonField<Double>,
                private val position: JsonField<Position>,
                private val scheduledDistanceAlongTrip: JsonField<Double>,
                private val situationIds: JsonField<List<String>>,
                private val vehicleId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("activeTripId")
                    @ExcludeMissing
                    activeTripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    blockTripSequence: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("closestStop")
                    @ExcludeMissing
                    closestStop: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lastKnownDistanceAlongTrip")
                    @ExcludeMissing
                    lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    lastLocationUpdateTime: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    lastUpdateTime: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyCapacity")
                    @ExcludeMissing
                    occupancyCapacity: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyCount")
                    @ExcludeMissing
                    occupancyCount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    occupancyStatus: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phase")
                    @ExcludeMissing
                    phase: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    predicted: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    scheduleDeviation: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    serviceDate: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    closestStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lastKnownLocation")
                    @ExcludeMissing
                    lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of(),
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    lastKnownOrientation: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("nextStop")
                    @ExcludeMissing
                    nextStop: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nextStopTimeOffset")
                    @ExcludeMissing
                    nextStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("orientation")
                    @ExcludeMissing
                    orientation: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("position")
                    @ExcludeMissing
                    position: JsonField<Position> = JsonMissing.of(),
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    situationIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    vehicleId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    activeTripId,
                    blockTripSequence,
                    closestStop,
                    distanceAlongTrip,
                    lastKnownDistanceAlongTrip,
                    lastLocationUpdateTime,
                    lastUpdateTime,
                    occupancyCapacity,
                    occupancyCount,
                    occupancyStatus,
                    phase,
                    predicted,
                    scheduleDeviation,
                    serviceDate,
                    status,
                    totalDistanceAlongTrip,
                    closestStopTimeOffset,
                    frequency,
                    lastKnownLocation,
                    lastKnownOrientation,
                    nextStop,
                    nextStopTimeOffset,
                    orientation,
                    position,
                    scheduledDistanceAlongTrip,
                    situationIds,
                    vehicleId,
                    mutableMapOf(),
                )

                /**
                 * Trip ID of the trip the vehicle is actively serving.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                /**
                 * Index of the active trip into the sequence of trips for the active block.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /**
                 * ID of the closest stop to the current location of the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun closestStop(): String = closestStop.getRequired("closestStop")

                /**
                 * Distance, in meters, the transit vehicle has progressed along the active trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun distanceAlongTrip(): Double = distanceAlongTrip.getRequired("distanceAlongTrip")

                /**
                 * Last known distance along the trip received in real-time from the transit
                 * vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lastKnownDistanceAlongTrip(): Double =
                    lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                /**
                 * Timestamp of the last known real-time location update from the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lastLocationUpdateTime(): Long =
                    lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                /**
                 * Timestamp of the last known real-time update from the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                /**
                 * Capacity of the transit vehicle in terms of occupancy.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun occupancyCapacity(): Long = occupancyCapacity.getRequired("occupancyCapacity")

                /**
                 * Current count of occupants in the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                /**
                 * Current occupancy status of the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                /**
                 * Current journey phase of the trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun phase(): String = phase.getRequired("phase")

                /**
                 * Indicates if real-time arrival info is available for this trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun predicted(): Boolean = predicted.getRequired("predicted")

                /**
                 * Deviation from the schedule in seconds (positive for late, negative for early).
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scheduleDeviation(): Long = scheduleDeviation.getRequired("scheduleDeviation")

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /**
                 * Current status modifiers for the trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): String = status.getRequired("status")

                /**
                 * Total length of the trip, in meters.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalDistanceAlongTrip(): Double =
                    totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                /**
                 * Time offset from the closest stop to the current position of the transit vehicle
                 * (in seconds).
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun closestStopTimeOffset(): Optional<Long> =
                    closestStopTimeOffset.getOptional("closestStopTimeOffset")

                /**
                 * Information about frequency-based scheduling, if applicable to the trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun frequency(): Optional<String> = frequency.getOptional("frequency")

                /**
                 * Last known location of the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun lastKnownLocation(): Optional<LastKnownLocation> =
                    lastKnownLocation.getOptional("lastKnownLocation")

                /**
                 * Last known orientation value received in real-time from the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun lastKnownOrientation(): Optional<Double> =
                    lastKnownOrientation.getOptional("lastKnownOrientation")

                /**
                 * ID of the next stop the transit vehicle is scheduled to arrive at.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nextStop(): Optional<String> = nextStop.getOptional("nextStop")

                /**
                 * Time offset from the next stop to the current position of the transit vehicle (in
                 * seconds).
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nextStopTimeOffset(): Optional<Long> =
                    nextStopTimeOffset.getOptional("nextStopTimeOffset")

                /**
                 * Orientation of the transit vehicle, represented as an angle in degrees.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun orientation(): Optional<Double> = orientation.getOptional("orientation")

                /**
                 * Current position of the transit vehicle.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun position(): Optional<Position> = position.getOptional("position")

                /**
                 * Distance, in meters, the transit vehicle is scheduled to have progressed along
                 * the active trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun scheduledDistanceAlongTrip(): Optional<Double> =
                    scheduledDistanceAlongTrip.getOptional("scheduledDistanceAlongTrip")

                /**
                 * References to situation elements (if any) applicable to this trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun situationIds(): Optional<List<String>> =
                    situationIds.getOptional("situationIds")

                /**
                 * ID of the transit vehicle currently serving the trip.
                 *
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun vehicleId(): Optional<String> = vehicleId.getOptional("vehicleId")

                /**
                 * Returns the raw JSON value of [activeTripId].
                 *
                 * Unlike [activeTripId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activeTripId")
                @ExcludeMissing
                fun _activeTripId(): JsonField<String> = activeTripId

                /**
                 * Returns the raw JSON value of [blockTripSequence].
                 *
                 * Unlike [blockTripSequence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                fun _blockTripSequence(): JsonField<Long> = blockTripSequence

                /**
                 * Returns the raw JSON value of [closestStop].
                 *
                 * Unlike [closestStop], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("closestStop")
                @ExcludeMissing
                fun _closestStop(): JsonField<String> = closestStop

                /**
                 * Returns the raw JSON value of [distanceAlongTrip].
                 *
                 * Unlike [distanceAlongTrip], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("distanceAlongTrip")
                @ExcludeMissing
                fun _distanceAlongTrip(): JsonField<Double> = distanceAlongTrip

                /**
                 * Returns the raw JSON value of [lastKnownDistanceAlongTrip].
                 *
                 * Unlike [lastKnownDistanceAlongTrip], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("lastKnownDistanceAlongTrip")
                @ExcludeMissing
                fun _lastKnownDistanceAlongTrip(): JsonField<Double> = lastKnownDistanceAlongTrip

                /**
                 * Returns the raw JSON value of [lastLocationUpdateTime].
                 *
                 * Unlike [lastLocationUpdateTime], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("lastLocationUpdateTime")
                @ExcludeMissing
                fun _lastLocationUpdateTime(): JsonField<Long> = lastLocationUpdateTime

                /**
                 * Returns the raw JSON value of [lastUpdateTime].
                 *
                 * Unlike [lastUpdateTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun _lastUpdateTime(): JsonField<Long> = lastUpdateTime

                /**
                 * Returns the raw JSON value of [occupancyCapacity].
                 *
                 * Unlike [occupancyCapacity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("occupancyCapacity")
                @ExcludeMissing
                fun _occupancyCapacity(): JsonField<Long> = occupancyCapacity

                /**
                 * Returns the raw JSON value of [occupancyCount].
                 *
                 * Unlike [occupancyCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("occupancyCount")
                @ExcludeMissing
                fun _occupancyCount(): JsonField<Long> = occupancyCount

                /**
                 * Returns the raw JSON value of [occupancyStatus].
                 *
                 * Unlike [occupancyStatus], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun _occupancyStatus(): JsonField<String> = occupancyStatus

                /**
                 * Returns the raw JSON value of [phase].
                 *
                 * Unlike [phase], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<String> = phase

                /**
                 * Returns the raw JSON value of [predicted].
                 *
                 * Unlike [predicted], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("predicted")
                @ExcludeMissing
                fun _predicted(): JsonField<Boolean> = predicted

                /**
                 * Returns the raw JSON value of [scheduleDeviation].
                 *
                 * Unlike [scheduleDeviation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("scheduleDeviation")
                @ExcludeMissing
                fun _scheduleDeviation(): JsonField<Long> = scheduleDeviation

                /**
                 * Returns the raw JSON value of [serviceDate].
                 *
                 * Unlike [serviceDate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("serviceDate")
                @ExcludeMissing
                fun _serviceDate(): JsonField<Long> = serviceDate

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

                /**
                 * Returns the raw JSON value of [totalDistanceAlongTrip].
                 *
                 * Unlike [totalDistanceAlongTrip], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("totalDistanceAlongTrip")
                @ExcludeMissing
                fun _totalDistanceAlongTrip(): JsonField<Double> = totalDistanceAlongTrip

                /**
                 * Returns the raw JSON value of [closestStopTimeOffset].
                 *
                 * Unlike [closestStopTimeOffset], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("closestStopTimeOffset")
                @ExcludeMissing
                fun _closestStopTimeOffset(): JsonField<Long> = closestStopTimeOffset

                /**
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<String> = frequency

                /**
                 * Returns the raw JSON value of [lastKnownLocation].
                 *
                 * Unlike [lastKnownLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lastKnownLocation")
                @ExcludeMissing
                fun _lastKnownLocation(): JsonField<LastKnownLocation> = lastKnownLocation

                /**
                 * Returns the raw JSON value of [lastKnownOrientation].
                 *
                 * Unlike [lastKnownOrientation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lastKnownOrientation")
                @ExcludeMissing
                fun _lastKnownOrientation(): JsonField<Double> = lastKnownOrientation

                /**
                 * Returns the raw JSON value of [nextStop].
                 *
                 * Unlike [nextStop], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("nextStop")
                @ExcludeMissing
                fun _nextStop(): JsonField<String> = nextStop

                /**
                 * Returns the raw JSON value of [nextStopTimeOffset].
                 *
                 * Unlike [nextStopTimeOffset], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nextStopTimeOffset")
                @ExcludeMissing
                fun _nextStopTimeOffset(): JsonField<Long> = nextStopTimeOffset

                /**
                 * Returns the raw JSON value of [orientation].
                 *
                 * Unlike [orientation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("orientation")
                @ExcludeMissing
                fun _orientation(): JsonField<Double> = orientation

                /**
                 * Returns the raw JSON value of [position].
                 *
                 * Unlike [position], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("position")
                @ExcludeMissing
                fun _position(): JsonField<Position> = position

                /**
                 * Returns the raw JSON value of [scheduledDistanceAlongTrip].
                 *
                 * Unlike [scheduledDistanceAlongTrip], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("scheduledDistanceAlongTrip")
                @ExcludeMissing
                fun _scheduledDistanceAlongTrip(): JsonField<Double> = scheduledDistanceAlongTrip

                /**
                 * Returns the raw JSON value of [situationIds].
                 *
                 * Unlike [situationIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("situationIds")
                @ExcludeMissing
                fun _situationIds(): JsonField<List<String>> = situationIds

                /**
                 * Returns the raw JSON value of [vehicleId].
                 *
                 * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("vehicleId")
                @ExcludeMissing
                fun _vehicleId(): JsonField<String> = vehicleId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TripStatus].
                     *
                     * The following fields are required:
                     * ```java
                     * .activeTripId()
                     * .blockTripSequence()
                     * .closestStop()
                     * .distanceAlongTrip()
                     * .lastKnownDistanceAlongTrip()
                     * .lastLocationUpdateTime()
                     * .lastUpdateTime()
                     * .occupancyCapacity()
                     * .occupancyCount()
                     * .occupancyStatus()
                     * .phase()
                     * .predicted()
                     * .scheduleDeviation()
                     * .serviceDate()
                     * .status()
                     * .totalDistanceAlongTrip()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TripStatus]. */
                class Builder internal constructor() {

                    private var activeTripId: JsonField<String>? = null
                    private var blockTripSequence: JsonField<Long>? = null
                    private var closestStop: JsonField<String>? = null
                    private var distanceAlongTrip: JsonField<Double>? = null
                    private var lastKnownDistanceAlongTrip: JsonField<Double>? = null
                    private var lastLocationUpdateTime: JsonField<Long>? = null
                    private var lastUpdateTime: JsonField<Long>? = null
                    private var occupancyCapacity: JsonField<Long>? = null
                    private var occupancyCount: JsonField<Long>? = null
                    private var occupancyStatus: JsonField<String>? = null
                    private var phase: JsonField<String>? = null
                    private var predicted: JsonField<Boolean>? = null
                    private var scheduleDeviation: JsonField<Long>? = null
                    private var serviceDate: JsonField<Long>? = null
                    private var status: JsonField<String>? = null
                    private var totalDistanceAlongTrip: JsonField<Double>? = null
                    private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of()
                    private var lastKnownOrientation: JsonField<Double> = JsonMissing.of()
                    private var nextStop: JsonField<String> = JsonMissing.of()
                    private var nextStopTimeOffset: JsonField<Long> = JsonMissing.of()
                    private var orientation: JsonField<Double> = JsonMissing.of()
                    private var position: JsonField<Position> = JsonMissing.of()
                    private var scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                    private var situationIds: JsonField<MutableList<String>>? = null
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tripStatus: TripStatus) = apply {
                        activeTripId = tripStatus.activeTripId
                        blockTripSequence = tripStatus.blockTripSequence
                        closestStop = tripStatus.closestStop
                        distanceAlongTrip = tripStatus.distanceAlongTrip
                        lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                        lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                        lastUpdateTime = tripStatus.lastUpdateTime
                        occupancyCapacity = tripStatus.occupancyCapacity
                        occupancyCount = tripStatus.occupancyCount
                        occupancyStatus = tripStatus.occupancyStatus
                        phase = tripStatus.phase
                        predicted = tripStatus.predicted
                        scheduleDeviation = tripStatus.scheduleDeviation
                        serviceDate = tripStatus.serviceDate
                        status = tripStatus.status
                        totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                        closestStopTimeOffset = tripStatus.closestStopTimeOffset
                        frequency = tripStatus.frequency
                        lastKnownLocation = tripStatus.lastKnownLocation
                        lastKnownOrientation = tripStatus.lastKnownOrientation
                        nextStop = tripStatus.nextStop
                        nextStopTimeOffset = tripStatus.nextStopTimeOffset
                        orientation = tripStatus.orientation
                        position = tripStatus.position
                        scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                        situationIds = tripStatus.situationIds.map { it.toMutableList() }
                        vehicleId = tripStatus.vehicleId
                        additionalProperties = tripStatus.additionalProperties.toMutableMap()
                    }

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(activeTripId: String) =
                        activeTripId(JsonField.of(activeTripId))

                    /**
                     * Sets [Builder.activeTripId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activeTripId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun activeTripId(activeTripId: JsonField<String>) = apply {
                        this.activeTripId = activeTripId
                    }

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(blockTripSequence: Long) =
                        blockTripSequence(JsonField.of(blockTripSequence))

                    /**
                     * Sets [Builder.blockTripSequence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.blockTripSequence] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(closestStop: String) = closestStop(JsonField.of(closestStop))

                    /**
                     * Sets [Builder.closestStop] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.closestStop] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun closestStop(closestStop: JsonField<String>) = apply {
                        this.closestStop = closestStop
                    }

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(distanceAlongTrip: Double) =
                        distanceAlongTrip(JsonField.of(distanceAlongTrip))

                    /**
                     * Sets [Builder.distanceAlongTrip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distanceAlongTrip] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                        this.distanceAlongTrip = distanceAlongTrip
                    }

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) =
                        lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                    /**
                     * Sets [Builder.lastKnownDistanceAlongTrip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastKnownDistanceAlongTrip] with a
                     * well-typed [Double] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip
                        }

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                        lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                    /**
                     * Sets [Builder.lastLocationUpdateTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastLocationUpdateTime] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                        this.lastLocationUpdateTime = lastLocationUpdateTime
                    }

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(lastUpdateTime: Long) =
                        lastUpdateTime(JsonField.of(lastUpdateTime))

                    /**
                     * Sets [Builder.lastUpdateTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastUpdateTime] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(occupancyCapacity: Long) =
                        occupancyCapacity(JsonField.of(occupancyCapacity))

                    /**
                     * Sets [Builder.occupancyCapacity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.occupancyCapacity] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                        this.occupancyCapacity = occupancyCapacity
                    }

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(occupancyCount: Long) =
                        occupancyCount(JsonField.of(occupancyCount))

                    /**
                     * Sets [Builder.occupancyCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.occupancyCount] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                        this.occupancyCount = occupancyCount
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) =
                        occupancyStatus(JsonField.of(occupancyStatus))

                    /**
                     * Sets [Builder.occupancyStatus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.occupancyStatus] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Current journey phase of the trip. */
                    fun phase(phase: String) = phase(JsonField.of(phase))

                    /**
                     * Sets [Builder.phase] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phase] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /**
                     * Sets [Builder.predicted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.predicted] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(scheduleDeviation: Long) =
                        scheduleDeviation(JsonField.of(scheduleDeviation))

                    /**
                     * Sets [Builder.scheduleDeviation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scheduleDeviation] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                        this.scheduleDeviation = scheduleDeviation
                    }

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                    /**
                     * Sets [Builder.serviceDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceDate] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** Current status modifiers for the trip. */
                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) =
                        totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                    /**
                     * Sets [Builder.totalDistanceAlongTrip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalDistanceAlongTrip] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) = apply {
                        this.totalDistanceAlongTrip = totalDistanceAlongTrip
                    }

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(closestStopTimeOffset: Long) =
                        closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                    /**
                     * Sets [Builder.closestStopTimeOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.closestStopTimeOffset] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                        this.closestStopTimeOffset = closestStopTimeOffset
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /**
                     * Sets [Builder.frequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.frequency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(lastKnownLocation: LastKnownLocation) =
                        lastKnownLocation(JsonField.of(lastKnownLocation))

                    /**
                     * Sets [Builder.lastKnownLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastKnownLocation] with a well-typed
                     * [LastKnownLocation] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) = apply {
                        this.lastKnownLocation = lastKnownLocation
                    }

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(lastKnownOrientation: Double) =
                        lastKnownOrientation(JsonField.of(lastKnownOrientation))

                    /**
                     * Sets [Builder.lastKnownOrientation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastKnownOrientation] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                        this.lastKnownOrientation = lastKnownOrientation
                    }

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                    /**
                     * Sets [Builder.nextStop] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nextStop] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun nextStop(nextStop: JsonField<String>) = apply { this.nextStop = nextStop }

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(nextStopTimeOffset: Long) =
                        nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                    /**
                     * Sets [Builder.nextStopTimeOffset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nextStopTimeOffset] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                        this.nextStopTimeOffset = nextStopTimeOffset
                    }

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(orientation: Double) = orientation(JsonField.of(orientation))

                    /**
                     * Sets [Builder.orientation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.orientation] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun orientation(orientation: JsonField<Double>) = apply {
                        this.orientation = orientation
                    }

                    /** Current position of the transit vehicle. */
                    fun position(position: Position) = position(JsonField.of(position))

                    /**
                     * Sets [Builder.position] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.position] with a well-typed [Position] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun position(position: JsonField<Position>) = apply { this.position = position }

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) =
                        scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                    /**
                     * Sets [Builder.scheduledDistanceAlongTrip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scheduledDistanceAlongTrip] with a
                     * well-typed [Double] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: JsonField<Double>) =
                        apply {
                            this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip
                        }

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(situationIds: List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /**
                     * Sets [Builder.situationIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.situationIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun situationIds(situationIds: JsonField<List<String>>) = apply {
                        this.situationIds = situationIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [situationIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSituationId(situationId: String) = apply {
                        situationIds =
                            (situationIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("situationIds", it).add(situationId)
                            }
                    }

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /**
                     * Sets [Builder.vehicleId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vehicleId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [TripStatus].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .activeTripId()
                     * .blockTripSequence()
                     * .closestStop()
                     * .distanceAlongTrip()
                     * .lastKnownDistanceAlongTrip()
                     * .lastLocationUpdateTime()
                     * .lastUpdateTime()
                     * .occupancyCapacity()
                     * .occupancyCount()
                     * .occupancyStatus()
                     * .phase()
                     * .predicted()
                     * .scheduleDeviation()
                     * .serviceDate()
                     * .status()
                     * .totalDistanceAlongTrip()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TripStatus =
                        TripStatus(
                            checkRequired("activeTripId", activeTripId),
                            checkRequired("blockTripSequence", blockTripSequence),
                            checkRequired("closestStop", closestStop),
                            checkRequired("distanceAlongTrip", distanceAlongTrip),
                            checkRequired("lastKnownDistanceAlongTrip", lastKnownDistanceAlongTrip),
                            checkRequired("lastLocationUpdateTime", lastLocationUpdateTime),
                            checkRequired("lastUpdateTime", lastUpdateTime),
                            checkRequired("occupancyCapacity", occupancyCapacity),
                            checkRequired("occupancyCount", occupancyCount),
                            checkRequired("occupancyStatus", occupancyStatus),
                            checkRequired("phase", phase),
                            checkRequired("predicted", predicted),
                            checkRequired("scheduleDeviation", scheduleDeviation),
                            checkRequired("serviceDate", serviceDate),
                            checkRequired("status", status),
                            checkRequired("totalDistanceAlongTrip", totalDistanceAlongTrip),
                            closestStopTimeOffset,
                            frequency,
                            lastKnownLocation,
                            lastKnownOrientation,
                            nextStop,
                            nextStopTimeOffset,
                            orientation,
                            position,
                            scheduledDistanceAlongTrip,
                            (situationIds ?: JsonMissing.of()).map { it.toImmutable() },
                            vehicleId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TripStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    activeTripId()
                    blockTripSequence()
                    closestStop()
                    distanceAlongTrip()
                    lastKnownDistanceAlongTrip()
                    lastLocationUpdateTime()
                    lastUpdateTime()
                    occupancyCapacity()
                    occupancyCount()
                    occupancyStatus()
                    phase()
                    predicted()
                    scheduleDeviation()
                    serviceDate()
                    status()
                    totalDistanceAlongTrip()
                    closestStopTimeOffset()
                    frequency()
                    lastKnownLocation().ifPresent { it.validate() }
                    lastKnownOrientation()
                    nextStop()
                    nextStopTimeOffset()
                    orientation()
                    position().ifPresent { it.validate() }
                    scheduledDistanceAlongTrip()
                    situationIds()
                    vehicleId()
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (activeTripId.asKnown().isPresent) 1 else 0) +
                        (if (blockTripSequence.asKnown().isPresent) 1 else 0) +
                        (if (closestStop.asKnown().isPresent) 1 else 0) +
                        (if (distanceAlongTrip.asKnown().isPresent) 1 else 0) +
                        (if (lastKnownDistanceAlongTrip.asKnown().isPresent) 1 else 0) +
                        (if (lastLocationUpdateTime.asKnown().isPresent) 1 else 0) +
                        (if (lastUpdateTime.asKnown().isPresent) 1 else 0) +
                        (if (occupancyCapacity.asKnown().isPresent) 1 else 0) +
                        (if (occupancyCount.asKnown().isPresent) 1 else 0) +
                        (if (occupancyStatus.asKnown().isPresent) 1 else 0) +
                        (if (phase.asKnown().isPresent) 1 else 0) +
                        (if (predicted.asKnown().isPresent) 1 else 0) +
                        (if (scheduleDeviation.asKnown().isPresent) 1 else 0) +
                        (if (serviceDate.asKnown().isPresent) 1 else 0) +
                        (if (status.asKnown().isPresent) 1 else 0) +
                        (if (totalDistanceAlongTrip.asKnown().isPresent) 1 else 0) +
                        (if (closestStopTimeOffset.asKnown().isPresent) 1 else 0) +
                        (if (frequency.asKnown().isPresent) 1 else 0) +
                        (lastKnownLocation.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (lastKnownOrientation.asKnown().isPresent) 1 else 0) +
                        (if (nextStop.asKnown().isPresent) 1 else 0) +
                        (if (nextStopTimeOffset.asKnown().isPresent) 1 else 0) +
                        (if (orientation.asKnown().isPresent) 1 else 0) +
                        (position.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (scheduledDistanceAlongTrip.asKnown().isPresent) 1 else 0) +
                        (situationIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (vehicleId.asKnown().isPresent) 1 else 0)

                /** Last known location of the transit vehicle. */
                class LastKnownLocation
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        lon: JsonField<Double> = JsonMissing.of(),
                    ) : this(lat, lon, mutableMapOf())

                    /**
                     * Latitude of the last known location of the transit vehicle.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun lat(): Optional<Double> = lat.getOptional("lat")

                    /**
                     * Longitude of the last known location of the transit vehicle.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun lon(): Optional<Double> = lon.getOptional("lon")

                    /**
                     * Returns the raw JSON value of [lat].
                     *
                     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /**
                     * Returns the raw JSON value of [lon].
                     *
                     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [LastKnownLocation].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [LastKnownLocation]. */
                    class Builder internal constructor() {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                            lat = lastKnownLocation.lat
                            lon = lastKnownLocation.lon
                            additionalProperties =
                                lastKnownLocation.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /**
                         * Sets [Builder.lat] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lat] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /**
                         * Sets [Builder.lon] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lon] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [LastKnownLocation].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): LastKnownLocation =
                            LastKnownLocation(lat, lon, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): LastKnownLocation = apply {
                        if (validated) {
                            return@apply
                        }

                        lat()
                        lon()
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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (lat.asKnown().isPresent) 1 else 0) +
                            (if (lon.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is LastKnownLocation &&
                            lat == other.lat &&
                            lon == other.lon &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(lat, lon, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                /** Current position of the transit vehicle. */
                class Position
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        lon: JsonField<Double> = JsonMissing.of(),
                    ) : this(lat, lon, mutableMapOf())

                    /**
                     * Latitude of the current position of the transit vehicle.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun lat(): Optional<Double> = lat.getOptional("lat")

                    /**
                     * Longitude of the current position of the transit vehicle.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun lon(): Optional<Double> = lon.getOptional("lon")

                    /**
                     * Returns the raw JSON value of [lat].
                     *
                     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /**
                     * Returns the raw JSON value of [lon].
                     *
                     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Position]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Position]. */
                    class Builder internal constructor() {

                        private var lat: JsonField<Double> = JsonMissing.of()
                        private var lon: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(position: Position) = apply {
                            lat = position.lat
                            lon = position.lon
                            additionalProperties = position.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /**
                         * Sets [Builder.lat] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lat] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /**
                         * Sets [Builder.lon] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lon] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Position].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Position =
                            Position(lat, lon, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Position = apply {
                        if (validated) {
                            return@apply
                        }

                        lat()
                        lon()
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
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (lat.asKnown().isPresent) 1 else 0) +
                            (if (lon.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Position &&
                            lat == other.lat &&
                            lon == other.lon &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(lat, lon, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TripStatus &&
                        activeTripId == other.activeTripId &&
                        blockTripSequence == other.blockTripSequence &&
                        closestStop == other.closestStop &&
                        distanceAlongTrip == other.distanceAlongTrip &&
                        lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip &&
                        lastLocationUpdateTime == other.lastLocationUpdateTime &&
                        lastUpdateTime == other.lastUpdateTime &&
                        occupancyCapacity == other.occupancyCapacity &&
                        occupancyCount == other.occupancyCount &&
                        occupancyStatus == other.occupancyStatus &&
                        phase == other.phase &&
                        predicted == other.predicted &&
                        scheduleDeviation == other.scheduleDeviation &&
                        serviceDate == other.serviceDate &&
                        status == other.status &&
                        totalDistanceAlongTrip == other.totalDistanceAlongTrip &&
                        closestStopTimeOffset == other.closestStopTimeOffset &&
                        frequency == other.frequency &&
                        lastKnownLocation == other.lastKnownLocation &&
                        lastKnownOrientation == other.lastKnownOrientation &&
                        nextStop == other.nextStop &&
                        nextStopTimeOffset == other.nextStopTimeOffset &&
                        orientation == other.orientation &&
                        position == other.position &&
                        scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip &&
                        situationIds == other.situationIds &&
                        vehicleId == other.vehicleId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        activeTripId,
                        blockTripSequence,
                        closestStop,
                        distanceAlongTrip,
                        lastKnownDistanceAlongTrip,
                        lastLocationUpdateTime,
                        lastUpdateTime,
                        occupancyCapacity,
                        occupancyCount,
                        occupancyStatus,
                        phase,
                        predicted,
                        scheduleDeviation,
                        serviceDate,
                        status,
                        totalDistanceAlongTrip,
                        closestStopTimeOffset,
                        frequency,
                        lastKnownLocation,
                        lastKnownOrientation,
                        nextStop,
                        nextStopTimeOffset,
                        orientation,
                        position,
                        scheduledDistanceAlongTrip,
                        situationIds,
                        vehicleId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, distanceAlongTrip=$distanceAlongTrip, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, phase=$phase, predicted=$predicted, scheduleDeviation=$scheduleDeviation, serviceDate=$serviceDate, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, closestStopTimeOffset=$closestStopTimeOffset, frequency=$frequency, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, orientation=$orientation, position=$position, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, situationIds=$situationIds, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    arrivalEnabled == other.arrivalEnabled &&
                    blockTripSequence == other.blockTripSequence &&
                    departureEnabled == other.departureEnabled &&
                    numberOfStopsAway == other.numberOfStopsAway &&
                    predictedArrivalTime == other.predictedArrivalTime &&
                    predictedDepartureTime == other.predictedDepartureTime &&
                    routeId == other.routeId &&
                    scheduledArrivalTime == other.scheduledArrivalTime &&
                    scheduledDepartureTime == other.scheduledDepartureTime &&
                    serviceDate == other.serviceDate &&
                    stopId == other.stopId &&
                    stopSequence == other.stopSequence &&
                    totalStopsInTrip == other.totalStopsInTrip &&
                    tripHeadsign == other.tripHeadsign &&
                    tripId == other.tripId &&
                    vehicleId == other.vehicleId &&
                    actualTrack == other.actualTrack &&
                    distanceFromStop == other.distanceFromStop &&
                    frequency == other.frequency &&
                    historicalOccupancy == other.historicalOccupancy &&
                    lastUpdateTime == other.lastUpdateTime &&
                    occupancyStatus == other.occupancyStatus &&
                    predicted == other.predicted &&
                    predictedArrivalInterval == other.predictedArrivalInterval &&
                    predictedDepartureInterval == other.predictedDepartureInterval &&
                    predictedOccupancy == other.predictedOccupancy &&
                    routeLongName == other.routeLongName &&
                    routeShortName == other.routeShortName &&
                    scheduledArrivalInterval == other.scheduledArrivalInterval &&
                    scheduledDepartureInterval == other.scheduledDepartureInterval &&
                    scheduledTrack == other.scheduledTrack &&
                    situationIds == other.situationIds &&
                    status == other.status &&
                    tripStatus == other.tripStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    arrivalEnabled,
                    blockTripSequence,
                    departureEnabled,
                    numberOfStopsAway,
                    predictedArrivalTime,
                    predictedDepartureTime,
                    routeId,
                    scheduledArrivalTime,
                    scheduledDepartureTime,
                    serviceDate,
                    stopId,
                    stopSequence,
                    totalStopsInTrip,
                    tripHeadsign,
                    tripId,
                    vehicleId,
                    actualTrack,
                    distanceFromStop,
                    frequency,
                    historicalOccupancy,
                    lastUpdateTime,
                    occupancyStatus,
                    predicted,
                    predictedArrivalInterval,
                    predictedDepartureInterval,
                    predictedOccupancy,
                    routeLongName,
                    routeShortName,
                    scheduledArrivalInterval,
                    scheduledDepartureInterval,
                    scheduledTrack,
                    situationIds,
                    status,
                    tripStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{arrivalEnabled=$arrivalEnabled, blockTripSequence=$blockTripSequence, departureEnabled=$departureEnabled, numberOfStopsAway=$numberOfStopsAway, predictedArrivalTime=$predictedArrivalTime, predictedDepartureTime=$predictedDepartureTime, routeId=$routeId, scheduledArrivalTime=$scheduledArrivalTime, scheduledDepartureTime=$scheduledDepartureTime, serviceDate=$serviceDate, stopId=$stopId, stopSequence=$stopSequence, totalStopsInTrip=$totalStopsInTrip, tripHeadsign=$tripHeadsign, tripId=$tripId, vehicleId=$vehicleId, actualTrack=$actualTrack, distanceFromStop=$distanceFromStop, frequency=$frequency, historicalOccupancy=$historicalOccupancy, lastUpdateTime=$lastUpdateTime, occupancyStatus=$occupancyStatus, predicted=$predicted, predictedArrivalInterval=$predictedArrivalInterval, predictedDepartureInterval=$predictedDepartureInterval, predictedOccupancy=$predictedOccupancy, routeLongName=$routeLongName, routeShortName=$routeShortName, scheduledArrivalInterval=$scheduledArrivalInterval, scheduledDepartureInterval=$scheduledDepartureInterval, scheduledTrack=$scheduledTrack, situationIds=$situationIds, status=$status, tripStatus=$tripStatus, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                entry == other.entry &&
                references == other.references &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entry, references, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArrivalAndDepartureRetrieveResponse &&
            code == other.code &&
            currentTime == other.currentTime &&
            text == other.text &&
            version == other.version &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, currentTime, text, version, data, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArrivalAndDepartureRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
