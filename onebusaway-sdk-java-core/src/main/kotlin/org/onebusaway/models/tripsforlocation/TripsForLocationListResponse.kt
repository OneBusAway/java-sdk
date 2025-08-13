// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.tripsforlocation

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

class TripsForLocationListResponse
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
         * Returns a mutable builder for constructing an instance of [TripsForLocationListResponse].
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

    /** A builder for [TripsForLocationListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tripsForLocationListResponse: TripsForLocationListResponse) = apply {
            code = tripsForLocationListResponse.code
            currentTime = tripsForLocationListResponse.currentTime
            text = tripsForLocationListResponse.text
            version = tripsForLocationListResponse.version
            data = tripsForLocationListResponse.data
            additionalProperties = tripsForLocationListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [TripsForLocationListResponse].
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
        fun build(): TripsForLocationListResponse =
            TripsForLocationListResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TripsForLocationListResponse = apply {
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
        private val limitExceeded: JsonField<Boolean>,
        private val list: JsonField<List<List>>,
        private val references: JsonField<References>,
        private val outOfRange: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limitExceeded")
            @ExcludeMissing
            limitExceeded: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("list") @ExcludeMissing list: JsonField<List<List>> = JsonMissing.of(),
            @JsonProperty("references")
            @ExcludeMissing
            references: JsonField<References> = JsonMissing.of(),
            @JsonProperty("outOfRange")
            @ExcludeMissing
            outOfRange: JsonField<Boolean> = JsonMissing.of(),
        ) : this(limitExceeded, list, references, outOfRange, mutableMapOf())

        /**
         * Indicates if the limit of trips has been exceeded
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun list(): List<List> = list.getRequired("list")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun references(): References = references.getRequired("references")

        /**
         * Indicates if the search location is out of range
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun outOfRange(): Optional<Boolean> = outOfRange.getOptional("outOfRange")

        /**
         * Returns the raw JSON value of [limitExceeded].
         *
         * Unlike [limitExceeded], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("limitExceeded")
        @ExcludeMissing
        fun _limitExceeded(): JsonField<Boolean> = limitExceeded

        /**
         * Returns the raw JSON value of [list].
         *
         * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<List<List>> = list

        /**
         * Returns the raw JSON value of [references].
         *
         * Unlike [references], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("references")
        @ExcludeMissing
        fun _references(): JsonField<References> = references

        /**
         * Returns the raw JSON value of [outOfRange].
         *
         * Unlike [outOfRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outOfRange")
        @ExcludeMissing
        fun _outOfRange(): JsonField<Boolean> = outOfRange

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
             * .limitExceeded()
             * .list()
             * .references()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var limitExceeded: JsonField<Boolean>? = null
            private var list: JsonField<MutableList<List>>? = null
            private var references: JsonField<References>? = null
            private var outOfRange: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                limitExceeded = data.limitExceeded
                list = data.list.map { it.toMutableList() }
                references = data.references
                outOfRange = data.outOfRange
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Indicates if the limit of trips has been exceeded */
            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            /**
             * Sets [Builder.limitExceeded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitExceeded] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun list(list: List<List>) = list(JsonField.of(list))

            /**
             * Sets [Builder.list] to an arbitrary JSON value.
             *
             * You should usually call [Builder.list] with a well-typed `List<List>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun list(list: JsonField<List<List>>) = apply {
                this.list = list.map { it.toMutableList() }
            }

            /**
             * Adds a single [List] to [Builder.list].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addList(list: List) = apply {
                this.list =
                    (this.list ?: JsonField.of(mutableListOf())).also {
                        checkKnown("list", it).add(list)
                    }
            }

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

            /** Indicates if the search location is out of range */
            fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

            /**
             * Sets [Builder.outOfRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outOfRange] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

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
             * .limitExceeded()
             * .list()
             * .references()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("limitExceeded", limitExceeded),
                    checkRequired("list", list).map { it.toImmutable() },
                    checkRequired("references", references),
                    outOfRange,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            limitExceeded()
            list().forEach { it.validate() }
            references().validate()
            outOfRange()
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
            (if (limitExceeded.asKnown().isPresent) 1 else 0) +
                (list.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (references.asKnown().getOrNull()?.validity() ?: 0) +
                (if (outOfRange.asKnown().isPresent) 1 else 0)

        class List
        private constructor(
            private val schedule: JsonField<Schedule>,
            private val status: JsonField<Status>,
            private val tripId: JsonField<String>,
            private val frequency: JsonField<String>,
            private val serviceDate: JsonField<Long>,
            private val situationIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule")
                @ExcludeMissing
                schedule: JsonField<Schedule> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("tripId")
                @ExcludeMissing
                tripId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                frequency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serviceDate")
                @ExcludeMissing
                serviceDate: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("situationIds")
                @ExcludeMissing
                situationIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(schedule, status, tripId, frequency, serviceDate, situationIds, mutableMapOf())

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun schedule(): Schedule = schedule.getRequired("schedule")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tripId(): String = tripId.getRequired("tripId")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun frequency(): Optional<String> = frequency.getOptional("frequency")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun serviceDate(): Optional<Long> = serviceDate.getOptional("serviceDate")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun situationIds(): Optional<List<String>> = situationIds.getOptional("situationIds")

            /**
             * Returns the raw JSON value of [schedule].
             *
             * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule")
            @ExcludeMissing
            fun _schedule(): JsonField<Schedule> = schedule

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [tripId].
             *
             * Unlike [tripId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tripId") @ExcludeMissing fun _tripId(): JsonField<String> = tripId

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
             * Returns the raw JSON value of [serviceDate].
             *
             * Unlike [serviceDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("serviceDate")
            @ExcludeMissing
            fun _serviceDate(): JsonField<Long> = serviceDate

            /**
             * Returns the raw JSON value of [situationIds].
             *
             * Unlike [situationIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("situationIds")
            @ExcludeMissing
            fun _situationIds(): JsonField<List<String>> = situationIds

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
                 * Returns a mutable builder for constructing an instance of [List].
                 *
                 * The following fields are required:
                 * ```java
                 * .schedule()
                 * .status()
                 * .tripId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [List]. */
            class Builder internal constructor() {

                private var schedule: JsonField<Schedule>? = null
                private var status: JsonField<Status>? = null
                private var tripId: JsonField<String>? = null
                private var frequency: JsonField<String> = JsonMissing.of()
                private var serviceDate: JsonField<Long> = JsonMissing.of()
                private var situationIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(list: List) = apply {
                    schedule = list.schedule
                    status = list.status
                    tripId = list.tripId
                    frequency = list.frequency
                    serviceDate = list.serviceDate
                    situationIds = list.situationIds.map { it.toMutableList() }
                    additionalProperties = list.additionalProperties.toMutableMap()
                }

                fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

                /**
                 * Sets [Builder.schedule] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schedule] with a well-typed [Schedule] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /**
                 * Sets [Builder.tripId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                fun frequency(frequency: String?) = frequency(JsonField.ofNullable(frequency))

                /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
                fun frequency(frequency: Optional<String>) = frequency(frequency.getOrNull())

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frequency(frequency: JsonField<String>) = apply { this.frequency = frequency }

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
                 * Returns an immutable instance of [List].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .schedule()
                 * .status()
                 * .tripId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): List =
                    List(
                        checkRequired("schedule", schedule),
                        checkRequired("status", status),
                        checkRequired("tripId", tripId),
                        frequency,
                        serviceDate,
                        (situationIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): List = apply {
                if (validated) {
                    return@apply
                }

                schedule().validate()
                status().validate()
                tripId()
                frequency()
                serviceDate()
                situationIds()
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
                (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (tripId.asKnown().isPresent) 1 else 0) +
                    (if (frequency.asKnown().isPresent) 1 else 0) +
                    (if (serviceDate.asKnown().isPresent) 1 else 0) +
                    (situationIds.asKnown().getOrNull()?.size ?: 0)

            class Schedule
            private constructor(
                private val nextTripId: JsonField<String>,
                private val previousTripId: JsonField<String>,
                private val stopTimes: JsonField<List<StopTime>>,
                private val timeZone: JsonField<String>,
                private val frequency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("nextTripId")
                    @ExcludeMissing
                    nextTripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("previousTripId")
                    @ExcludeMissing
                    previousTripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
                    @JsonProperty("timeZone")
                    @ExcludeMissing
                    timeZone: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<String> = JsonMissing.of(),
                ) : this(nextTripId, previousTripId, stopTimes, timeZone, frequency, mutableMapOf())

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nextTripId(): String = nextTripId.getRequired("nextTripId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun previousTripId(): String = previousTripId.getRequired("previousTripId")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timeZone(): String = timeZone.getRequired("timeZone")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun frequency(): Optional<String> = frequency.getOptional("frequency")

                /**
                 * Returns the raw JSON value of [nextTripId].
                 *
                 * Unlike [nextTripId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nextTripId")
                @ExcludeMissing
                fun _nextTripId(): JsonField<String> = nextTripId

                /**
                 * Returns the raw JSON value of [previousTripId].
                 *
                 * Unlike [previousTripId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("previousTripId")
                @ExcludeMissing
                fun _previousTripId(): JsonField<String> = previousTripId

                /**
                 * Returns the raw JSON value of [stopTimes].
                 *
                 * Unlike [stopTimes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stopTimes")
                @ExcludeMissing
                fun _stopTimes(): JsonField<List<StopTime>> = stopTimes

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
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<String> = frequency

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
                     * Returns a mutable builder for constructing an instance of [Schedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .nextTripId()
                     * .previousTripId()
                     * .stopTimes()
                     * .timeZone()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Schedule]. */
                class Builder internal constructor() {

                    private var nextTripId: JsonField<String>? = null
                    private var previousTripId: JsonField<String>? = null
                    private var stopTimes: JsonField<MutableList<StopTime>>? = null
                    private var timeZone: JsonField<String>? = null
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(schedule: Schedule) = apply {
                        nextTripId = schedule.nextTripId
                        previousTripId = schedule.previousTripId
                        stopTimes = schedule.stopTimes.map { it.toMutableList() }
                        timeZone = schedule.timeZone
                        frequency = schedule.frequency
                        additionalProperties = schedule.additionalProperties.toMutableMap()
                    }

                    fun nextTripId(nextTripId: String) = nextTripId(JsonField.of(nextTripId))

                    /**
                     * Sets [Builder.nextTripId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nextTripId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun nextTripId(nextTripId: JsonField<String>) = apply {
                        this.nextTripId = nextTripId
                    }

                    fun previousTripId(previousTripId: String) =
                        previousTripId(JsonField.of(previousTripId))

                    /**
                     * Sets [Builder.previousTripId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.previousTripId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun previousTripId(previousTripId: JsonField<String>) = apply {
                        this.previousTripId = previousTripId
                    }

                    fun stopTimes(stopTimes: List<StopTime>) = stopTimes(JsonField.of(stopTimes))

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
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addStopTime(stopTime: StopTime) = apply {
                        stopTimes =
                            (stopTimes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("stopTimes", it).add(stopTime)
                            }
                    }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    /**
                     * Sets [Builder.timeZone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeZone] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                    fun frequency(frequency: String?) = frequency(JsonField.ofNullable(frequency))

                    /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
                    fun frequency(frequency: Optional<String>) = frequency(frequency.getOrNull())

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
                     * Returns an immutable instance of [Schedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .nextTripId()
                     * .previousTripId()
                     * .stopTimes()
                     * .timeZone()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Schedule =
                        Schedule(
                            checkRequired("nextTripId", nextTripId),
                            checkRequired("previousTripId", previousTripId),
                            checkRequired("stopTimes", stopTimes).map { it.toImmutable() },
                            checkRequired("timeZone", timeZone),
                            frequency,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Schedule = apply {
                    if (validated) {
                        return@apply
                    }

                    nextTripId()
                    previousTripId()
                    stopTimes().forEach { it.validate() }
                    timeZone()
                    frequency()
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
                    (if (nextTripId.asKnown().isPresent) 1 else 0) +
                        (if (previousTripId.asKnown().isPresent) 1 else 0) +
                        (stopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (timeZone.asKnown().isPresent) 1 else 0) +
                        (if (frequency.asKnown().isPresent) 1 else 0)

                class StopTime
                private constructor(
                    private val arrivalTime: JsonField<Long>,
                    private val departureTime: JsonField<Long>,
                    private val distanceAlongTrip: JsonField<Double>,
                    private val historicalOccupancy: JsonField<String>,
                    private val stopHeadsign: JsonField<String>,
                    private val stopId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        arrivalTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        departureTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("distanceAlongTrip")
                        @ExcludeMissing
                        distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("historicalOccupancy")
                        @ExcludeMissing
                        historicalOccupancy: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        stopHeadsign: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stopId")
                        @ExcludeMissing
                        stopId: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        arrivalTime,
                        departureTime,
                        distanceAlongTrip,
                        historicalOccupancy,
                        stopHeadsign,
                        stopId,
                        mutableMapOf(),
                    )

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun arrivalTime(): Optional<Long> = arrivalTime.getOptional("arrivalTime")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun departureTime(): Optional<Long> = departureTime.getOptional("departureTime")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun distanceAlongTrip(): Optional<Double> =
                        distanceAlongTrip.getOptional("distanceAlongTrip")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun historicalOccupancy(): Optional<String> =
                        historicalOccupancy.getOptional("historicalOccupancy")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun stopHeadsign(): Optional<String> = stopHeadsign.getOptional("stopHeadsign")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun stopId(): Optional<String> = stopId.getOptional("stopId")

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
                     * Returns the raw JSON value of [departureTime].
                     *
                     * Unlike [departureTime], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("departureTime")
                    @ExcludeMissing
                    fun _departureTime(): JsonField<Long> = departureTime

                    /**
                     * Returns the raw JSON value of [distanceAlongTrip].
                     *
                     * Unlike [distanceAlongTrip], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun _distanceAlongTrip(): JsonField<Double> = distanceAlongTrip

                    /**
                     * Returns the raw JSON value of [historicalOccupancy].
                     *
                     * Unlike [historicalOccupancy], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("historicalOccupancy")
                    @ExcludeMissing
                    fun _historicalOccupancy(): JsonField<String> = historicalOccupancy

                    /**
                     * Returns the raw JSON value of [stopHeadsign].
                     *
                     * Unlike [stopHeadsign], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("stopHeadsign")
                    @ExcludeMissing
                    fun _stopHeadsign(): JsonField<String> = stopHeadsign

                    /**
                     * Returns the raw JSON value of [stopId].
                     *
                     * Unlike [stopId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("stopId")
                    @ExcludeMissing
                    fun _stopId(): JsonField<String> = stopId

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

                        /** Returns a mutable builder for constructing an instance of [StopTime]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StopTime]. */
                    class Builder internal constructor() {

                        private var arrivalTime: JsonField<Long> = JsonMissing.of()
                        private var departureTime: JsonField<Long> = JsonMissing.of()
                        private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                        private var stopHeadsign: JsonField<String> = JsonMissing.of()
                        private var stopId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(stopTime: StopTime) = apply {
                            arrivalTime = stopTime.arrivalTime
                            departureTime = stopTime.departureTime
                            distanceAlongTrip = stopTime.distanceAlongTrip
                            historicalOccupancy = stopTime.historicalOccupancy
                            stopHeadsign = stopTime.stopHeadsign
                            stopId = stopTime.stopId
                            additionalProperties = stopTime.additionalProperties.toMutableMap()
                        }

                        fun arrivalTime(arrivalTime: Long) = arrivalTime(JsonField.of(arrivalTime))

                        /**
                         * Sets [Builder.arrivalTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arrivalTime] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                            this.arrivalTime = arrivalTime
                        }

                        fun departureTime(departureTime: Long) =
                            departureTime(JsonField.of(departureTime))

                        /**
                         * Sets [Builder.departureTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.departureTime] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun departureTime(departureTime: JsonField<Long>) = apply {
                            this.departureTime = departureTime
                        }

                        fun distanceAlongTrip(distanceAlongTrip: Double) =
                            distanceAlongTrip(JsonField.of(distanceAlongTrip))

                        /**
                         * Sets [Builder.distanceAlongTrip] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.distanceAlongTrip] with a well-typed
                         * [Double] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                            this.distanceAlongTrip = distanceAlongTrip
                        }

                        fun historicalOccupancy(historicalOccupancy: String) =
                            historicalOccupancy(JsonField.of(historicalOccupancy))

                        /**
                         * Sets [Builder.historicalOccupancy] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.historicalOccupancy] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                            this.historicalOccupancy = historicalOccupancy
                        }

                        fun stopHeadsign(stopHeadsign: String) =
                            stopHeadsign(JsonField.of(stopHeadsign))

                        /**
                         * Sets [Builder.stopHeadsign] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stopHeadsign] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                            this.stopHeadsign = stopHeadsign
                        }

                        fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                        /**
                         * Sets [Builder.stopId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stopId] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

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
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): StopTime =
                            StopTime(
                                arrivalTime,
                                departureTime,
                                distanceAlongTrip,
                                historicalOccupancy,
                                stopHeadsign,
                                stopId,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): StopTime = apply {
                        if (validated) {
                            return@apply
                        }

                        arrivalTime()
                        departureTime()
                        distanceAlongTrip()
                        historicalOccupancy()
                        stopHeadsign()
                        stopId()
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
                        (if (arrivalTime.asKnown().isPresent) 1 else 0) +
                            (if (departureTime.asKnown().isPresent) 1 else 0) +
                            (if (distanceAlongTrip.asKnown().isPresent) 1 else 0) +
                            (if (historicalOccupancy.asKnown().isPresent) 1 else 0) +
                            (if (stopHeadsign.asKnown().isPresent) 1 else 0) +
                            (if (stopId.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StopTime &&
                            arrivalTime == other.arrivalTime &&
                            departureTime == other.departureTime &&
                            distanceAlongTrip == other.distanceAlongTrip &&
                            historicalOccupancy == other.historicalOccupancy &&
                            stopHeadsign == other.stopHeadsign &&
                            stopId == other.stopId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            arrivalTime,
                            departureTime,
                            distanceAlongTrip,
                            historicalOccupancy,
                            stopHeadsign,
                            stopId,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, distanceAlongTrip=$distanceAlongTrip, historicalOccupancy=$historicalOccupancy, stopHeadsign=$stopHeadsign, stopId=$stopId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Schedule &&
                        nextTripId == other.nextTripId &&
                        previousTripId == other.previousTripId &&
                        stopTimes == other.stopTimes &&
                        timeZone == other.timeZone &&
                        frequency == other.frequency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        nextTripId,
                        previousTripId,
                        stopTimes,
                        timeZone,
                        frequency,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Schedule{nextTripId=$nextTripId, previousTripId=$previousTripId, stopTimes=$stopTimes, timeZone=$timeZone, frequency=$frequency, additionalProperties=$additionalProperties}"
            }

            class Status
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
                     * Returns a mutable builder for constructing an instance of [Status].
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

                /** A builder for [Status]. */
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
                    internal fun from(status: Status) = apply {
                        activeTripId = status.activeTripId
                        blockTripSequence = status.blockTripSequence
                        closestStop = status.closestStop
                        distanceAlongTrip = status.distanceAlongTrip
                        lastKnownDistanceAlongTrip = status.lastKnownDistanceAlongTrip
                        lastLocationUpdateTime = status.lastLocationUpdateTime
                        lastUpdateTime = status.lastUpdateTime
                        occupancyCapacity = status.occupancyCapacity
                        occupancyCount = status.occupancyCount
                        occupancyStatus = status.occupancyStatus
                        phase = status.phase
                        predicted = status.predicted
                        scheduleDeviation = status.scheduleDeviation
                        serviceDate = status.serviceDate
                        this.status = status.status
                        totalDistanceAlongTrip = status.totalDistanceAlongTrip
                        closestStopTimeOffset = status.closestStopTimeOffset
                        frequency = status.frequency
                        lastKnownLocation = status.lastKnownLocation
                        lastKnownOrientation = status.lastKnownOrientation
                        nextStop = status.nextStop
                        nextStopTimeOffset = status.nextStopTimeOffset
                        orientation = status.orientation
                        position = status.position
                        scheduledDistanceAlongTrip = status.scheduledDistanceAlongTrip
                        situationIds = status.situationIds.map { it.toMutableList() }
                        vehicleId = status.vehicleId
                        additionalProperties = status.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Status].
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
                    fun build(): Status =
                        Status(
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

                fun validate(): Status = apply {
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

                    return other is Status &&
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
                    "Status{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, distanceAlongTrip=$distanceAlongTrip, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, phase=$phase, predicted=$predicted, scheduleDeviation=$scheduleDeviation, serviceDate=$serviceDate, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, closestStopTimeOffset=$closestStopTimeOffset, frequency=$frequency, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, orientation=$orientation, position=$position, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, situationIds=$situationIds, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is List &&
                    schedule == other.schedule &&
                    status == other.status &&
                    tripId == other.tripId &&
                    frequency == other.frequency &&
                    serviceDate == other.serviceDate &&
                    situationIds == other.situationIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    schedule,
                    status,
                    tripId,
                    frequency,
                    serviceDate,
                    situationIds,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "List{schedule=$schedule, status=$status, tripId=$tripId, frequency=$frequency, serviceDate=$serviceDate, situationIds=$situationIds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                limitExceeded == other.limitExceeded &&
                list == other.list &&
                references == other.references &&
                outOfRange == other.outOfRange &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(limitExceeded, list, references, outOfRange, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, references=$references, outOfRange=$outOfRange, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TripsForLocationListResponse &&
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
        "TripsForLocationListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
