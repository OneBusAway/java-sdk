// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.scheduleforroute

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
import org.onebusaway.models.ResponseWrapper

class ScheduleForRouteRetrieveResponse
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
         * [ScheduleForRouteRetrieveResponse].
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

    /** A builder for [ScheduleForRouteRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleForRouteRetrieveResponse: ScheduleForRouteRetrieveResponse) =
            apply {
                code = scheduleForRouteRetrieveResponse.code
                currentTime = scheduleForRouteRetrieveResponse.currentTime
                text = scheduleForRouteRetrieveResponse.text
                version = scheduleForRouteRetrieveResponse.version
                data = scheduleForRouteRetrieveResponse.data
                additionalProperties =
                    scheduleForRouteRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ScheduleForRouteRetrieveResponse].
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
        fun build(): ScheduleForRouteRetrieveResponse =
            ScheduleForRouteRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduleForRouteRetrieveResponse = apply {
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entry") @ExcludeMissing entry: JsonField<Entry> = JsonMissing.of()
        ) : this(entry, mutableMapOf())

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entry(): Entry = entry.getRequired("entry")

        /**
         * Returns the raw JSON value of [entry].
         *
         * Unlike [entry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var entry: JsonField<Entry>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                entry = data.entry
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(checkRequired("entry", entry), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entry().validate()
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
        @JvmSynthetic internal fun validity(): Int = (entry.asKnown().getOrNull()?.validity() ?: 0)

        class Entry
        private constructor(
            private val routeId: JsonField<String>,
            private val scheduleDate: JsonField<Long>,
            private val serviceIds: JsonField<List<String>>,
            private val stops: JsonField<List<Stop>>,
            private val stopTripGroupings: JsonField<List<StopTripGrouping>>,
            private val trips: JsonField<List<Trip>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("routeId")
                @ExcludeMissing
                routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduleDate")
                @ExcludeMissing
                scheduleDate: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("serviceIds")
                @ExcludeMissing
                serviceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("stops")
                @ExcludeMissing
                stops: JsonField<List<Stop>> = JsonMissing.of(),
                @JsonProperty("stopTripGroupings")
                @ExcludeMissing
                stopTripGroupings: JsonField<List<StopTripGrouping>> = JsonMissing.of(),
                @JsonProperty("trips")
                @ExcludeMissing
                trips: JsonField<List<Trip>> = JsonMissing.of(),
            ) : this(
                routeId,
                scheduleDate,
                serviceIds,
                stops,
                stopTripGroupings,
                trips,
                mutableMapOf(),
            )

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routeId(): String = routeId.getRequired("routeId")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleDate(): Long = scheduleDate.getRequired("scheduleDate")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun serviceIds(): List<String> = serviceIds.getRequired("serviceIds")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stops(): List<Stop> = stops.getRequired("stops")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stopTripGroupings(): List<StopTripGrouping> =
                stopTripGroupings.getRequired("stopTripGroupings")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun trips(): List<Trip> = trips.getRequired("trips")

            /**
             * Returns the raw JSON value of [routeId].
             *
             * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            /**
             * Returns the raw JSON value of [scheduleDate].
             *
             * Unlike [scheduleDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("scheduleDate")
            @ExcludeMissing
            fun _scheduleDate(): JsonField<Long> = scheduleDate

            /**
             * Returns the raw JSON value of [serviceIds].
             *
             * Unlike [serviceIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("serviceIds")
            @ExcludeMissing
            fun _serviceIds(): JsonField<List<String>> = serviceIds

            /**
             * Returns the raw JSON value of [stops].
             *
             * Unlike [stops], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stops") @ExcludeMissing fun _stops(): JsonField<List<Stop>> = stops

            /**
             * Returns the raw JSON value of [stopTripGroupings].
             *
             * Unlike [stopTripGroupings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stopTripGroupings")
            @ExcludeMissing
            fun _stopTripGroupings(): JsonField<List<StopTripGrouping>> = stopTripGroupings

            /**
             * Returns the raw JSON value of [trips].
             *
             * Unlike [trips], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

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
                 * .routeId()
                 * .scheduleDate()
                 * .serviceIds()
                 * .stops()
                 * .stopTripGroupings()
                 * .trips()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var routeId: JsonField<String>? = null
                private var scheduleDate: JsonField<Long>? = null
                private var serviceIds: JsonField<MutableList<String>>? = null
                private var stops: JsonField<MutableList<Stop>>? = null
                private var stopTripGroupings: JsonField<MutableList<StopTripGrouping>>? = null
                private var trips: JsonField<MutableList<Trip>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    routeId = entry.routeId
                    scheduleDate = entry.scheduleDate
                    serviceIds = entry.serviceIds.map { it.toMutableList() }
                    stops = entry.stops.map { it.toMutableList() }
                    stopTripGroupings = entry.stopTripGroupings.map { it.toMutableList() }
                    trips = entry.trips.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                /**
                 * Sets [Builder.routeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun scheduleDate(scheduleDate: Long) = scheduleDate(JsonField.of(scheduleDate))

                /**
                 * Sets [Builder.scheduleDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleDate] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scheduleDate(scheduleDate: JsonField<Long>) = apply {
                    this.scheduleDate = scheduleDate
                }

                fun serviceIds(serviceIds: List<String>) = serviceIds(JsonField.of(serviceIds))

                /**
                 * Sets [Builder.serviceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun serviceIds(serviceIds: JsonField<List<String>>) = apply {
                    this.serviceIds = serviceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [serviceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addServiceId(serviceId: String) = apply {
                    serviceIds =
                        (serviceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("serviceIds", it).add(serviceId)
                        }
                }

                fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

                /**
                 * Sets [Builder.stops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stops] with a well-typed `List<Stop>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stops(stops: JsonField<List<Stop>>) = apply {
                    this.stops = stops.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Stop] to [stops].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStop(stop: Stop) = apply {
                    stops =
                        (stops ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stops", it).add(stop)
                        }
                }

                fun stopTripGroupings(stopTripGroupings: List<StopTripGrouping>) =
                    stopTripGroupings(JsonField.of(stopTripGroupings))

                /**
                 * Sets [Builder.stopTripGroupings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopTripGroupings] with a well-typed
                 * `List<StopTripGrouping>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun stopTripGroupings(stopTripGroupings: JsonField<List<StopTripGrouping>>) =
                    apply {
                        this.stopTripGroupings = stopTripGroupings.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [StopTripGrouping] to [stopTripGroupings].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStopTripGrouping(stopTripGrouping: StopTripGrouping) = apply {
                    stopTripGroupings =
                        (stopTripGroupings ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stopTripGroupings", it).add(stopTripGrouping)
                        }
                }

                fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                /**
                 * Sets [Builder.trips] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trips] with a well-typed `List<Trip>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trips(trips: JsonField<List<Trip>>) = apply {
                    this.trips = trips.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Trip] to [trips].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTrip(trip: Trip) = apply {
                    trips =
                        (trips ?: JsonField.of(mutableListOf())).also {
                            checkKnown("trips", it).add(trip)
                        }
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
                 * .routeId()
                 * .scheduleDate()
                 * .serviceIds()
                 * .stops()
                 * .stopTripGroupings()
                 * .trips()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entry =
                    Entry(
                        checkRequired("routeId", routeId),
                        checkRequired("scheduleDate", scheduleDate),
                        checkRequired("serviceIds", serviceIds).map { it.toImmutable() },
                        checkRequired("stops", stops).map { it.toImmutable() },
                        checkRequired("stopTripGroupings", stopTripGroupings).map {
                            it.toImmutable()
                        },
                        checkRequired("trips", trips).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                routeId()
                scheduleDate()
                serviceIds()
                stops().forEach { it.validate() }
                stopTripGroupings().forEach { it.validate() }
                trips().forEach { it.validate() }
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
                (if (routeId.asKnown().isPresent) 1 else 0) +
                    (if (scheduleDate.asKnown().isPresent) 1 else 0) +
                    (serviceIds.asKnown().getOrNull()?.size ?: 0) +
                    (stops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (stopTripGroupings.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (trips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Stop
            private constructor(
                private val id: JsonField<String>,
                private val lat: JsonField<Double>,
                private val locationType: JsonField<Long>,
                private val lon: JsonField<Double>,
                private val name: JsonField<String>,
                private val parent: JsonField<String>,
                private val routeIds: JsonField<List<String>>,
                private val staticRouteIds: JsonField<List<String>>,
                private val code: JsonField<String>,
                private val direction: JsonField<String>,
                private val wheelchairBoarding: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("locationType")
                    @ExcludeMissing
                    locationType: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parent")
                    @ExcludeMissing
                    parent: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routeIds")
                    @ExcludeMissing
                    routeIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("staticRouteIds")
                    @ExcludeMissing
                    staticRouteIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("code")
                    @ExcludeMissing
                    code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("direction")
                    @ExcludeMissing
                    direction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("wheelchairBoarding")
                    @ExcludeMissing
                    wheelchairBoarding: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    lat,
                    locationType,
                    lon,
                    name,
                    parent,
                    routeIds,
                    staticRouteIds,
                    code,
                    direction,
                    wheelchairBoarding,
                    mutableMapOf(),
                )

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lat(): Double = lat.getRequired("lat")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun locationType(): Long = locationType.getRequired("locationType")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lon(): Double = lon.getRequired("lon")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun parent(): String = parent.getRequired("parent")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun routeIds(): List<String> = routeIds.getRequired("routeIds")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun code(): Optional<String> = code.getOptional("code")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun direction(): Optional<String> = direction.getOptional("direction")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun wheelchairBoarding(): Optional<String> =
                    wheelchairBoarding.getOptional("wheelchairBoarding")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [lat].
                 *
                 * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                /**
                 * Returns the raw JSON value of [locationType].
                 *
                 * Unlike [locationType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("locationType")
                @ExcludeMissing
                fun _locationType(): JsonField<Long> = locationType

                /**
                 * Returns the raw JSON value of [lon].
                 *
                 * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [parent].
                 *
                 * Unlike [parent], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

                /**
                 * Returns the raw JSON value of [routeIds].
                 *
                 * Unlike [routeIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("routeIds")
                @ExcludeMissing
                fun _routeIds(): JsonField<List<String>> = routeIds

                /**
                 * Returns the raw JSON value of [staticRouteIds].
                 *
                 * Unlike [staticRouteIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun _staticRouteIds(): JsonField<List<String>> = staticRouteIds

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                /**
                 * Returns the raw JSON value of [direction].
                 *
                 * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun _direction(): JsonField<String> = direction

                /**
                 * Returns the raw JSON value of [wheelchairBoarding].
                 *
                 * Unlike [wheelchairBoarding], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun _wheelchairBoarding(): JsonField<String> = wheelchairBoarding

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
                     * Returns a mutable builder for constructing an instance of [Stop].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .lat()
                     * .locationType()
                     * .lon()
                     * .name()
                     * .parent()
                     * .routeIds()
                     * .staticRouteIds()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Stop]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var lat: JsonField<Double>? = null
                    private var locationType: JsonField<Long>? = null
                    private var lon: JsonField<Double>? = null
                    private var name: JsonField<String>? = null
                    private var parent: JsonField<String>? = null
                    private var routeIds: JsonField<MutableList<String>>? = null
                    private var staticRouteIds: JsonField<MutableList<String>>? = null
                    private var code: JsonField<String> = JsonMissing.of()
                    private var direction: JsonField<String> = JsonMissing.of()
                    private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stop: Stop) = apply {
                        id = stop.id
                        lat = stop.lat
                        locationType = stop.locationType
                        lon = stop.lon
                        name = stop.name
                        parent = stop.parent
                        routeIds = stop.routeIds.map { it.toMutableList() }
                        staticRouteIds = stop.staticRouteIds.map { it.toMutableList() }
                        code = stop.code
                        direction = stop.direction
                        wheelchairBoarding = stop.wheelchairBoarding
                        additionalProperties = stop.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    /**
                     * Sets [Builder.lat] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lat] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                    /**
                     * Sets [Builder.locationType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.locationType] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun locationType(locationType: JsonField<Long>) = apply {
                        this.locationType = locationType
                    }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    /**
                     * Sets [Builder.lon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lon] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun parent(parent: String) = parent(JsonField.of(parent))

                    /**
                     * Sets [Builder.parent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parent] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                    fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                    /**
                     * Sets [Builder.routeIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routeIds] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun routeIds(routeIds: JsonField<List<String>>) = apply {
                        this.routeIds = routeIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [routeIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRouteId(routeId: String) = apply {
                        routeIds =
                            (routeIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("routeIds", it).add(routeId)
                            }
                    }

                    fun staticRouteIds(staticRouteIds: List<String>) =
                        staticRouteIds(JsonField.of(staticRouteIds))

                    /**
                     * Sets [Builder.staticRouteIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.staticRouteIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                        this.staticRouteIds = staticRouteIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [staticRouteIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addStaticRouteId(staticRouteId: String) = apply {
                        staticRouteIds =
                            (staticRouteIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("staticRouteIds", it).add(staticRouteId)
                            }
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun direction(direction: String) = direction(JsonField.of(direction))

                    /**
                     * Sets [Builder.direction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.direction] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun direction(direction: JsonField<String>) = apply {
                        this.direction = direction
                    }

                    fun wheelchairBoarding(wheelchairBoarding: String) =
                        wheelchairBoarding(JsonField.of(wheelchairBoarding))

                    /**
                     * Sets [Builder.wheelchairBoarding] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wheelchairBoarding] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun wheelchairBoarding(wheelchairBoarding: JsonField<String>) = apply {
                        this.wheelchairBoarding = wheelchairBoarding
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
                     * Returns an immutable instance of [Stop].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .lat()
                     * .locationType()
                     * .lon()
                     * .name()
                     * .parent()
                     * .routeIds()
                     * .staticRouteIds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Stop =
                        Stop(
                            checkRequired("id", id),
                            checkRequired("lat", lat),
                            checkRequired("locationType", locationType),
                            checkRequired("lon", lon),
                            checkRequired("name", name),
                            checkRequired("parent", parent),
                            checkRequired("routeIds", routeIds).map { it.toImmutable() },
                            checkRequired("staticRouteIds", staticRouteIds).map {
                                it.toImmutable()
                            },
                            code,
                            direction,
                            wheelchairBoarding,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Stop = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    lat()
                    locationType()
                    lon()
                    name()
                    parent()
                    routeIds()
                    staticRouteIds()
                    code()
                    direction()
                    wheelchairBoarding()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (lat.asKnown().isPresent) 1 else 0) +
                        (if (locationType.asKnown().isPresent) 1 else 0) +
                        (if (lon.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (parent.asKnown().isPresent) 1 else 0) +
                        (routeIds.asKnown().getOrNull()?.size ?: 0) +
                        (staticRouteIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (code.asKnown().isPresent) 1 else 0) +
                        (if (direction.asKnown().isPresent) 1 else 0) +
                        (if (wheelchairBoarding.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Stop &&
                        id == other.id &&
                        lat == other.lat &&
                        locationType == other.locationType &&
                        lon == other.lon &&
                        name == other.name &&
                        parent == other.parent &&
                        routeIds == other.routeIds &&
                        staticRouteIds == other.staticRouteIds &&
                        code == other.code &&
                        direction == other.direction &&
                        wheelchairBoarding == other.wheelchairBoarding &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        lat,
                        locationType,
                        lon,
                        name,
                        parent,
                        routeIds,
                        staticRouteIds,
                        code,
                        direction,
                        wheelchairBoarding,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Stop{id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
            }

            class StopTripGrouping
            private constructor(
                private val directionId: JsonField<String>,
                private val stopIds: JsonField<List<String>>,
                private val tripHeadsigns: JsonField<List<String>>,
                private val tripIds: JsonField<List<String>>,
                private val tripsWithStopTimes: JsonField<List<TripsWithStopTime>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("directionId")
                    @ExcludeMissing
                    directionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stopIds")
                    @ExcludeMissing
                    stopIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("tripHeadsigns")
                    @ExcludeMissing
                    tripHeadsigns: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("tripIds")
                    @ExcludeMissing
                    tripIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("tripsWithStopTimes")
                    @ExcludeMissing
                    tripsWithStopTimes: JsonField<List<TripsWithStopTime>> = JsonMissing.of(),
                ) : this(
                    directionId,
                    stopIds,
                    tripHeadsigns,
                    tripIds,
                    tripsWithStopTimes,
                    mutableMapOf(),
                )

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun directionId(): String = directionId.getRequired("directionId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun stopIds(): List<String> = stopIds.getRequired("stopIds")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tripHeadsigns(): List<String> = tripHeadsigns.getRequired("tripHeadsigns")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tripIds(): List<String> = tripIds.getRequired("tripIds")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun tripsWithStopTimes(): Optional<List<TripsWithStopTime>> =
                    tripsWithStopTimes.getOptional("tripsWithStopTimes")

                /**
                 * Returns the raw JSON value of [directionId].
                 *
                 * Unlike [directionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("directionId")
                @ExcludeMissing
                fun _directionId(): JsonField<String> = directionId

                /**
                 * Returns the raw JSON value of [stopIds].
                 *
                 * Unlike [stopIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stopIds")
                @ExcludeMissing
                fun _stopIds(): JsonField<List<String>> = stopIds

                /**
                 * Returns the raw JSON value of [tripHeadsigns].
                 *
                 * Unlike [tripHeadsigns], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tripHeadsigns")
                @ExcludeMissing
                fun _tripHeadsigns(): JsonField<List<String>> = tripHeadsigns

                /**
                 * Returns the raw JSON value of [tripIds].
                 *
                 * Unlike [tripIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tripIds")
                @ExcludeMissing
                fun _tripIds(): JsonField<List<String>> = tripIds

                /**
                 * Returns the raw JSON value of [tripsWithStopTimes].
                 *
                 * Unlike [tripsWithStopTimes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tripsWithStopTimes")
                @ExcludeMissing
                fun _tripsWithStopTimes(): JsonField<List<TripsWithStopTime>> = tripsWithStopTimes

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
                     * Returns a mutable builder for constructing an instance of [StopTripGrouping].
                     *
                     * The following fields are required:
                     * ```java
                     * .directionId()
                     * .stopIds()
                     * .tripHeadsigns()
                     * .tripIds()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopTripGrouping]. */
                class Builder internal constructor() {

                    private var directionId: JsonField<String>? = null
                    private var stopIds: JsonField<MutableList<String>>? = null
                    private var tripHeadsigns: JsonField<MutableList<String>>? = null
                    private var tripIds: JsonField<MutableList<String>>? = null
                    private var tripsWithStopTimes: JsonField<MutableList<TripsWithStopTime>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopTripGrouping: StopTripGrouping) = apply {
                        directionId = stopTripGrouping.directionId
                        stopIds = stopTripGrouping.stopIds.map { it.toMutableList() }
                        tripHeadsigns = stopTripGrouping.tripHeadsigns.map { it.toMutableList() }
                        tripIds = stopTripGrouping.tripIds.map { it.toMutableList() }
                        tripsWithStopTimes =
                            stopTripGrouping.tripsWithStopTimes.map { it.toMutableList() }
                        additionalProperties = stopTripGrouping.additionalProperties.toMutableMap()
                    }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    /**
                     * Sets [Builder.directionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.directionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    /**
                     * Sets [Builder.stopIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stopIds] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun stopIds(stopIds: JsonField<List<String>>) = apply {
                        this.stopIds = stopIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [stopIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addStopId(stopId: String) = apply {
                        stopIds =
                            (stopIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("stopIds", it).add(stopId)
                            }
                    }

                    fun tripHeadsigns(tripHeadsigns: List<String>) =
                        tripHeadsigns(JsonField.of(tripHeadsigns))

                    /**
                     * Sets [Builder.tripHeadsigns] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tripHeadsigns] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun tripHeadsigns(tripHeadsigns: JsonField<List<String>>) = apply {
                        this.tripHeadsigns = tripHeadsigns.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tripHeadsigns].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTripHeadsign(tripHeadsign: String) = apply {
                        tripHeadsigns =
                            (tripHeadsigns ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tripHeadsigns", it).add(tripHeadsign)
                            }
                    }

                    fun tripIds(tripIds: List<String>) = tripIds(JsonField.of(tripIds))

                    /**
                     * Sets [Builder.tripIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tripIds] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tripIds(tripIds: JsonField<List<String>>) = apply {
                        this.tripIds = tripIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [tripIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTripId(tripId: String) = apply {
                        tripIds =
                            (tripIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tripIds", it).add(tripId)
                            }
                    }

                    fun tripsWithStopTimes(tripsWithStopTimes: List<TripsWithStopTime>) =
                        tripsWithStopTimes(JsonField.of(tripsWithStopTimes))

                    /**
                     * Sets [Builder.tripsWithStopTimes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tripsWithStopTimes] with a well-typed
                     * `List<TripsWithStopTime>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun tripsWithStopTimes(tripsWithStopTimes: JsonField<List<TripsWithStopTime>>) =
                        apply {
                            this.tripsWithStopTimes = tripsWithStopTimes.map { it.toMutableList() }
                        }

                    /**
                     * Adds a single [TripsWithStopTime] to [tripsWithStopTimes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTripsWithStopTime(tripsWithStopTime: TripsWithStopTime) = apply {
                        tripsWithStopTimes =
                            (tripsWithStopTimes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tripsWithStopTimes", it).add(tripsWithStopTime)
                            }
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
                     * Returns an immutable instance of [StopTripGrouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .directionId()
                     * .stopIds()
                     * .tripHeadsigns()
                     * .tripIds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): StopTripGrouping =
                        StopTripGrouping(
                            checkRequired("directionId", directionId),
                            checkRequired("stopIds", stopIds).map { it.toImmutable() },
                            checkRequired("tripHeadsigns", tripHeadsigns).map { it.toImmutable() },
                            checkRequired("tripIds", tripIds).map { it.toImmutable() },
                            (tripsWithStopTimes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): StopTripGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    directionId()
                    stopIds()
                    tripHeadsigns()
                    tripIds()
                    tripsWithStopTimes().ifPresent { it.forEach { it.validate() } }
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
                    (if (directionId.asKnown().isPresent) 1 else 0) +
                        (stopIds.asKnown().getOrNull()?.size ?: 0) +
                        (tripHeadsigns.asKnown().getOrNull()?.size ?: 0) +
                        (tripIds.asKnown().getOrNull()?.size ?: 0) +
                        (tripsWithStopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0)

                class TripsWithStopTime
                private constructor(
                    private val stopTimes: JsonField<List<StopTime>>,
                    private val tripId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("stopTimes")
                        @ExcludeMissing
                        stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        tripId: JsonField<String> = JsonMissing.of(),
                    ) : this(stopTimes, tripId, mutableMapOf())

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun tripId(): String = tripId.getRequired("tripId")

                    /**
                     * Returns the raw JSON value of [stopTimes].
                     *
                     * Unlike [stopTimes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    fun _stopTimes(): JsonField<List<StopTime>> = stopTimes

                    /**
                     * Returns the raw JSON value of [tripId].
                     *
                     * Unlike [tripId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun _tripId(): JsonField<String> = tripId

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
                         * [TripsWithStopTime].
                         *
                         * The following fields are required:
                         * ```java
                         * .stopTimes()
                         * .tripId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TripsWithStopTime]. */
                    class Builder internal constructor() {

                        private var stopTimes: JsonField<MutableList<StopTime>>? = null
                        private var tripId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tripsWithStopTime: TripsWithStopTime) = apply {
                            stopTimes = tripsWithStopTime.stopTimes.map { it.toMutableList() }
                            tripId = tripsWithStopTime.tripId
                            additionalProperties =
                                tripsWithStopTime.additionalProperties.toMutableMap()
                        }

                        fun stopTimes(stopTimes: List<StopTime>) =
                            stopTimes(JsonField.of(stopTimes))

                        /**
                         * Sets [Builder.stopTimes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stopTimes] with a well-typed
                         * `List<StopTime>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
                            this.stopTimes = stopTimes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [StopTime] to [stopTimes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addStopTime(stopTime: StopTime) = apply {
                            stopTimes =
                                (stopTimes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("stopTimes", it).add(stopTime)
                                }
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        /**
                         * Sets [Builder.tripId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tripId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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
                         * Returns an immutable instance of [TripsWithStopTime].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .stopTimes()
                         * .tripId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TripsWithStopTime =
                            TripsWithStopTime(
                                checkRequired("stopTimes", stopTimes).map { it.toImmutable() },
                                checkRequired("tripId", tripId),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TripsWithStopTime = apply {
                        if (validated) {
                            return@apply
                        }

                        stopTimes().forEach { it.validate() }
                        tripId()
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
                        (stopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (if (tripId.asKnown().isPresent) 1 else 0)

                    class StopTime
                    private constructor(
                        private val arrivalEnabled: JsonField<Boolean>,
                        private val arrivalTime: JsonField<Long>,
                        private val departureEnabled: JsonField<Boolean>,
                        private val departureTime: JsonField<Long>,
                        private val stopId: JsonField<String>,
                        private val tripId: JsonField<String>,
                        private val serviceId: JsonField<String>,
                        private val stopHeadsign: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("arrivalEnabled")
                            @ExcludeMissing
                            arrivalEnabled: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            arrivalTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("departureEnabled")
                            @ExcludeMissing
                            departureEnabled: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            departureTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("stopId")
                            @ExcludeMissing
                            stopId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("tripId")
                            @ExcludeMissing
                            tripId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("serviceId")
                            @ExcludeMissing
                            serviceId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("stopHeadsign")
                            @ExcludeMissing
                            stopHeadsign: JsonField<String> = JsonMissing.of(),
                        ) : this(
                            arrivalEnabled,
                            arrivalTime,
                            departureEnabled,
                            departureTime,
                            stopId,
                            tripId,
                            serviceId,
                            stopHeadsign,
                            mutableMapOf(),
                        )

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun departureEnabled(): Boolean =
                            departureEnabled.getRequired("departureEnabled")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun departureTime(): Long = departureTime.getRequired("departureTime")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun stopId(): String = stopId.getRequired("stopId")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun tripId(): String = tripId.getRequired("tripId")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun serviceId(): Optional<String> = serviceId.getOptional("serviceId")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun stopHeadsign(): Optional<String> =
                            stopHeadsign.getOptional("stopHeadsign")

                        /**
                         * Returns the raw JSON value of [arrivalEnabled].
                         *
                         * Unlike [arrivalEnabled], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("arrivalEnabled")
                        @ExcludeMissing
                        fun _arrivalEnabled(): JsonField<Boolean> = arrivalEnabled

                        /**
                         * Returns the raw JSON value of [arrivalTime].
                         *
                         * Unlike [arrivalTime], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        fun _arrivalTime(): JsonField<Long> = arrivalTime

                        /**
                         * Returns the raw JSON value of [departureEnabled].
                         *
                         * Unlike [departureEnabled], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("departureEnabled")
                        @ExcludeMissing
                        fun _departureEnabled(): JsonField<Boolean> = departureEnabled

                        /**
                         * Returns the raw JSON value of [departureTime].
                         *
                         * Unlike [departureTime], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        fun _departureTime(): JsonField<Long> = departureTime

                        /**
                         * Returns the raw JSON value of [stopId].
                         *
                         * Unlike [stopId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("stopId")
                        @ExcludeMissing
                        fun _stopId(): JsonField<String> = stopId

                        /**
                         * Returns the raw JSON value of [tripId].
                         *
                         * Unlike [tripId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun _tripId(): JsonField<String> = tripId

                        /**
                         * Returns the raw JSON value of [serviceId].
                         *
                         * Unlike [serviceId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

                        /**
                         * Returns the raw JSON value of [stopHeadsign].
                         *
                         * Unlike [stopHeadsign], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        fun _stopHeadsign(): JsonField<String> = stopHeadsign

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
                             * Returns a mutable builder for constructing an instance of [StopTime].
                             *
                             * The following fields are required:
                             * ```java
                             * .arrivalEnabled()
                             * .arrivalTime()
                             * .departureEnabled()
                             * .departureTime()
                             * .stopId()
                             * .tripId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [StopTime]. */
                        class Builder internal constructor() {

                            private var arrivalEnabled: JsonField<Boolean>? = null
                            private var arrivalTime: JsonField<Long>? = null
                            private var departureEnabled: JsonField<Boolean>? = null
                            private var departureTime: JsonField<Long>? = null
                            private var stopId: JsonField<String>? = null
                            private var tripId: JsonField<String>? = null
                            private var serviceId: JsonField<String> = JsonMissing.of()
                            private var stopHeadsign: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(stopTime: StopTime) = apply {
                                arrivalEnabled = stopTime.arrivalEnabled
                                arrivalTime = stopTime.arrivalTime
                                departureEnabled = stopTime.departureEnabled
                                departureTime = stopTime.departureTime
                                stopId = stopTime.stopId
                                tripId = stopTime.tripId
                                serviceId = stopTime.serviceId
                                stopHeadsign = stopTime.stopHeadsign
                                additionalProperties = stopTime.additionalProperties.toMutableMap()
                            }

                            fun arrivalEnabled(arrivalEnabled: Boolean) =
                                arrivalEnabled(JsonField.of(arrivalEnabled))

                            /**
                             * Sets [Builder.arrivalEnabled] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.arrivalEnabled] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                                this.arrivalEnabled = arrivalEnabled
                            }

                            fun arrivalTime(arrivalTime: Long) =
                                arrivalTime(JsonField.of(arrivalTime))

                            /**
                             * Sets [Builder.arrivalTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.arrivalTime] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                this.arrivalTime = arrivalTime
                            }

                            fun departureEnabled(departureEnabled: Boolean) =
                                departureEnabled(JsonField.of(departureEnabled))

                            /**
                             * Sets [Builder.departureEnabled] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.departureEnabled] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                                this.departureEnabled = departureEnabled
                            }

                            fun departureTime(departureTime: Long) =
                                departureTime(JsonField.of(departureTime))

                            /**
                             * Sets [Builder.departureTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.departureTime] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun departureTime(departureTime: JsonField<Long>) = apply {
                                this.departureTime = departureTime
                            }

                            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                            /**
                             * Sets [Builder.stopId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.stopId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            /**
                             * Sets [Builder.tripId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tripId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            /**
                             * Sets [Builder.serviceId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.serviceId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

                            fun stopHeadsign(stopHeadsign: String) =
                                stopHeadsign(JsonField.of(stopHeadsign))

                            /**
                             * Sets [Builder.stopHeadsign] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.stopHeadsign] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                                this.stopHeadsign = stopHeadsign
                            }

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
                             * Returns an immutable instance of [StopTime].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .arrivalEnabled()
                             * .arrivalTime()
                             * .departureEnabled()
                             * .departureTime()
                             * .stopId()
                             * .tripId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): StopTime =
                                StopTime(
                                    checkRequired("arrivalEnabled", arrivalEnabled),
                                    checkRequired("arrivalTime", arrivalTime),
                                    checkRequired("departureEnabled", departureEnabled),
                                    checkRequired("departureTime", departureTime),
                                    checkRequired("stopId", stopId),
                                    checkRequired("tripId", tripId),
                                    serviceId,
                                    stopHeadsign,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): StopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            arrivalEnabled()
                            arrivalTime()
                            departureEnabled()
                            departureTime()
                            stopId()
                            tripId()
                            serviceId()
                            stopHeadsign()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (arrivalEnabled.asKnown().isPresent) 1 else 0) +
                                (if (arrivalTime.asKnown().isPresent) 1 else 0) +
                                (if (departureEnabled.asKnown().isPresent) 1 else 0) +
                                (if (departureTime.asKnown().isPresent) 1 else 0) +
                                (if (stopId.asKnown().isPresent) 1 else 0) +
                                (if (tripId.asKnown().isPresent) 1 else 0) +
                                (if (serviceId.asKnown().isPresent) 1 else 0) +
                                (if (stopHeadsign.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is StopTime &&
                                arrivalEnabled == other.arrivalEnabled &&
                                arrivalTime == other.arrivalTime &&
                                departureEnabled == other.departureEnabled &&
                                departureTime == other.departureTime &&
                                stopId == other.stopId &&
                                tripId == other.tripId &&
                                serviceId == other.serviceId &&
                                stopHeadsign == other.stopHeadsign &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                arrivalEnabled,
                                arrivalTime,
                                departureEnabled,
                                departureTime,
                                stopId,
                                tripId,
                                serviceId,
                                stopHeadsign,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "StopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, stopId=$stopId, tripId=$tripId, serviceId=$serviceId, stopHeadsign=$stopHeadsign, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TripsWithStopTime &&
                            stopTimes == other.stopTimes &&
                            tripId == other.tripId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(stopTimes, tripId, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TripsWithStopTime{stopTimes=$stopTimes, tripId=$tripId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopTripGrouping &&
                        directionId == other.directionId &&
                        stopIds == other.stopIds &&
                        tripHeadsigns == other.tripHeadsigns &&
                        tripIds == other.tripIds &&
                        tripsWithStopTimes == other.tripsWithStopTimes &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        directionId,
                        stopIds,
                        tripHeadsigns,
                        tripIds,
                        tripsWithStopTimes,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopTripGrouping{directionId=$directionId, stopIds=$stopIds, tripHeadsigns=$tripHeadsigns, tripIds=$tripIds, tripsWithStopTimes=$tripsWithStopTimes, additionalProperties=$additionalProperties}"
            }

            class Trip
            private constructor(
                private val id: JsonField<String>,
                private val routeId: JsonField<String>,
                private val serviceId: JsonField<String>,
                private val blockId: JsonField<String>,
                private val directionId: JsonField<String>,
                private val peakOffpeak: JsonField<Long>,
                private val routeShortName: JsonField<String>,
                private val shapeId: JsonField<String>,
                private val timeZone: JsonField<String>,
                private val tripHeadsign: JsonField<String>,
                private val tripShortName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routeId")
                    @ExcludeMissing
                    routeId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("serviceId")
                    @ExcludeMissing
                    serviceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("blockId")
                    @ExcludeMissing
                    blockId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("directionId")
                    @ExcludeMissing
                    directionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("peakOffpeak")
                    @ExcludeMissing
                    peakOffpeak: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("routeShortName")
                    @ExcludeMissing
                    routeShortName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("shapeId")
                    @ExcludeMissing
                    shapeId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timeZone")
                    @ExcludeMissing
                    timeZone: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    tripHeadsign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tripShortName")
                    @ExcludeMissing
                    tripShortName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    routeId,
                    serviceId,
                    blockId,
                    directionId,
                    peakOffpeak,
                    routeShortName,
                    shapeId,
                    timeZone,
                    tripHeadsign,
                    tripShortName,
                    mutableMapOf(),
                )

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun routeId(): String = routeId.getRequired("routeId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceId(): String = serviceId.getRequired("serviceId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun blockId(): Optional<String> = blockId.getOptional("blockId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun directionId(): Optional<String> = directionId.getOptional("directionId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun peakOffpeak(): Optional<Long> = peakOffpeak.getOptional("peakOffpeak")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun routeShortName(): Optional<String> =
                    routeShortName.getOptional("routeShortName")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun shapeId(): Optional<String> = shapeId.getOptional("shapeId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun timeZone(): Optional<String> = timeZone.getOptional("timeZone")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun tripHeadsign(): Optional<String> = tripHeadsign.getOptional("tripHeadsign")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun tripShortName(): Optional<String> = tripShortName.getOptional("tripShortName")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [routeId].
                 *
                 * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

                /**
                 * Returns the raw JSON value of [serviceId].
                 *
                 * Unlike [serviceId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("serviceId")
                @ExcludeMissing
                fun _serviceId(): JsonField<String> = serviceId

                /**
                 * Returns the raw JSON value of [blockId].
                 *
                 * Unlike [blockId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("blockId") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

                /**
                 * Returns the raw JSON value of [directionId].
                 *
                 * Unlike [directionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("directionId")
                @ExcludeMissing
                fun _directionId(): JsonField<String> = directionId

                /**
                 * Returns the raw JSON value of [peakOffpeak].
                 *
                 * Unlike [peakOffpeak], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("peakOffpeak")
                @ExcludeMissing
                fun _peakOffpeak(): JsonField<Long> = peakOffpeak

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
                 * Returns the raw JSON value of [shapeId].
                 *
                 * Unlike [shapeId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("shapeId") @ExcludeMissing fun _shapeId(): JsonField<String> = shapeId

                /**
                 * Returns the raw JSON value of [timeZone].
                 *
                 * Unlike [timeZone], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timeZone")
                @ExcludeMissing
                fun _timeZone(): JsonField<String> = timeZone

                /**
                 * Returns the raw JSON value of [tripHeadsign].
                 *
                 * Unlike [tripHeadsign], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                fun _tripHeadsign(): JsonField<String> = tripHeadsign

                /**
                 * Returns the raw JSON value of [tripShortName].
                 *
                 * Unlike [tripShortName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tripShortName")
                @ExcludeMissing
                fun _tripShortName(): JsonField<String> = tripShortName

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
                     * Returns a mutable builder for constructing an instance of [Trip].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .routeId()
                     * .serviceId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Trip]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var routeId: JsonField<String>? = null
                    private var serviceId: JsonField<String>? = null
                    private var blockId: JsonField<String> = JsonMissing.of()
                    private var directionId: JsonField<String> = JsonMissing.of()
                    private var peakOffpeak: JsonField<Long> = JsonMissing.of()
                    private var routeShortName: JsonField<String> = JsonMissing.of()
                    private var shapeId: JsonField<String> = JsonMissing.of()
                    private var timeZone: JsonField<String> = JsonMissing.of()
                    private var tripHeadsign: JsonField<String> = JsonMissing.of()
                    private var tripShortName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(trip: Trip) = apply {
                        id = trip.id
                        routeId = trip.routeId
                        serviceId = trip.serviceId
                        blockId = trip.blockId
                        directionId = trip.directionId
                        peakOffpeak = trip.peakOffpeak
                        routeShortName = trip.routeShortName
                        shapeId = trip.shapeId
                        timeZone = trip.timeZone
                        tripHeadsign = trip.tripHeadsign
                        tripShortName = trip.tripShortName
                        additionalProperties = trip.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    /**
                     * Sets [Builder.routeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routeId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                    /**
                     * Sets [Builder.serviceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun serviceId(serviceId: JsonField<String>) = apply {
                        this.serviceId = serviceId
                    }

                    fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                    /**
                     * Sets [Builder.blockId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.blockId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    /**
                     * Sets [Builder.directionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.directionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

                    /**
                     * Sets [Builder.peakOffpeak] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.peakOffpeak] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply {
                        this.peakOffpeak = peakOffpeak
                    }

                    fun routeShortName(routeShortName: String) =
                        routeShortName(JsonField.of(routeShortName))

                    /**
                     * Sets [Builder.routeShortName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routeShortName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
                    }

                    fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                    /**
                     * Sets [Builder.shapeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.shapeId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    /**
                     * Sets [Builder.timeZone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeZone] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

                    /**
                     * Sets [Builder.tripHeadsign] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tripHeadsign] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                        this.tripHeadsign = tripHeadsign
                    }

                    fun tripShortName(tripShortName: String) =
                        tripShortName(JsonField.of(tripShortName))

                    /**
                     * Sets [Builder.tripShortName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tripShortName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tripShortName(tripShortName: JsonField<String>) = apply {
                        this.tripShortName = tripShortName
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
                     * Returns an immutable instance of [Trip].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .routeId()
                     * .serviceId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Trip =
                        Trip(
                            checkRequired("id", id),
                            checkRequired("routeId", routeId),
                            checkRequired("serviceId", serviceId),
                            blockId,
                            directionId,
                            peakOffpeak,
                            routeShortName,
                            shapeId,
                            timeZone,
                            tripHeadsign,
                            tripShortName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Trip = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    routeId()
                    serviceId()
                    blockId()
                    directionId()
                    peakOffpeak()
                    routeShortName()
                    shapeId()
                    timeZone()
                    tripHeadsign()
                    tripShortName()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (routeId.asKnown().isPresent) 1 else 0) +
                        (if (serviceId.asKnown().isPresent) 1 else 0) +
                        (if (blockId.asKnown().isPresent) 1 else 0) +
                        (if (directionId.asKnown().isPresent) 1 else 0) +
                        (if (peakOffpeak.asKnown().isPresent) 1 else 0) +
                        (if (routeShortName.asKnown().isPresent) 1 else 0) +
                        (if (shapeId.asKnown().isPresent) 1 else 0) +
                        (if (timeZone.asKnown().isPresent) 1 else 0) +
                        (if (tripHeadsign.asKnown().isPresent) 1 else 0) +
                        (if (tripShortName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trip &&
                        id == other.id &&
                        routeId == other.routeId &&
                        serviceId == other.serviceId &&
                        blockId == other.blockId &&
                        directionId == other.directionId &&
                        peakOffpeak == other.peakOffpeak &&
                        routeShortName == other.routeShortName &&
                        shapeId == other.shapeId &&
                        timeZone == other.timeZone &&
                        tripHeadsign == other.tripHeadsign &&
                        tripShortName == other.tripShortName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        routeId,
                        serviceId,
                        blockId,
                        directionId,
                        peakOffpeak,
                        routeShortName,
                        shapeId,
                        timeZone,
                        tripHeadsign,
                        tripShortName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Trip{id=$id, routeId=$routeId, serviceId=$serviceId, blockId=$blockId, directionId=$directionId, peakOffpeak=$peakOffpeak, routeShortName=$routeShortName, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    routeId == other.routeId &&
                    scheduleDate == other.scheduleDate &&
                    serviceIds == other.serviceIds &&
                    stops == other.stops &&
                    stopTripGroupings == other.stopTripGroupings &&
                    trips == other.trips &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    routeId,
                    scheduleDate,
                    serviceIds,
                    stops,
                    stopTripGroupings,
                    trips,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{routeId=$routeId, scheduleDate=$scheduleDate, serviceIds=$serviceIds, stops=$stops, stopTripGroupings=$stopTripGroupings, trips=$trips, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                entry == other.entry &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entry, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{entry=$entry, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduleForRouteRetrieveResponse &&
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
        "ScheduleForRouteRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
