// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.scheduleforstop

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

class ScheduleForStopRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * [ScheduleForStopRetrieveResponse].
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

    /** A builder for [ScheduleForStopRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleForStopRetrieveResponse: ScheduleForStopRetrieveResponse) =
            apply {
                code = scheduleForStopRetrieveResponse.code
                currentTime = scheduleForStopRetrieveResponse.currentTime
                text = scheduleForStopRetrieveResponse.text
                version = scheduleForStopRetrieveResponse.version
                data = scheduleForStopRetrieveResponse.data
                additionalProperties =
                    scheduleForStopRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ScheduleForStopRetrieveResponse].
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
        fun build(): ScheduleForStopRetrieveResponse =
            ScheduleForStopRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduleForStopRetrieveResponse = apply {
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val date: JsonField<Long>,
            private val stopId: JsonField<String>,
            private val stopRouteSchedules: JsonField<List<StopRouteSchedule>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("date") @ExcludeMissing date: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("stopId")
                @ExcludeMissing
                stopId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopRouteSchedules")
                @ExcludeMissing
                stopRouteSchedules: JsonField<List<StopRouteSchedule>> = JsonMissing.of(),
            ) : this(date, stopId, stopRouteSchedules, mutableMapOf())

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): Long = date.getRequired("date")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stopId(): String = stopId.getRequired("stopId")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stopRouteSchedules(): List<StopRouteSchedule> =
                stopRouteSchedules.getRequired("stopRouteSchedules")

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<Long> = date

            /**
             * Returns the raw JSON value of [stopId].
             *
             * Unlike [stopId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stopId") @ExcludeMissing fun _stopId(): JsonField<String> = stopId

            /**
             * Returns the raw JSON value of [stopRouteSchedules].
             *
             * Unlike [stopRouteSchedules], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stopRouteSchedules")
            @ExcludeMissing
            fun _stopRouteSchedules(): JsonField<List<StopRouteSchedule>> = stopRouteSchedules

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
                 * .date()
                 * .stopId()
                 * .stopRouteSchedules()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var date: JsonField<Long>? = null
                private var stopId: JsonField<String>? = null
                private var stopRouteSchedules: JsonField<MutableList<StopRouteSchedule>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    date = entry.date
                    stopId = entry.stopId
                    stopRouteSchedules = entry.stopRouteSchedules.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun date(date: Long) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun date(date: JsonField<Long>) = apply { this.date = date }

                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                /**
                 * Sets [Builder.stopId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                fun stopRouteSchedules(stopRouteSchedules: List<StopRouteSchedule>) =
                    stopRouteSchedules(JsonField.of(stopRouteSchedules))

                /**
                 * Sets [Builder.stopRouteSchedules] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopRouteSchedules] with a well-typed
                 * `List<StopRouteSchedule>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun stopRouteSchedules(stopRouteSchedules: JsonField<List<StopRouteSchedule>>) =
                    apply {
                        this.stopRouteSchedules = stopRouteSchedules.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [StopRouteSchedule] to [stopRouteSchedules].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStopRouteSchedule(stopRouteSchedule: StopRouteSchedule) = apply {
                    stopRouteSchedules =
                        (stopRouteSchedules ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stopRouteSchedules", it).add(stopRouteSchedule)
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
                 * .date()
                 * .stopId()
                 * .stopRouteSchedules()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entry =
                    Entry(
                        checkRequired("date", date),
                        checkRequired("stopId", stopId),
                        checkRequired("stopRouteSchedules", stopRouteSchedules).map {
                            it.toImmutable()
                        },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                date()
                stopId()
                stopRouteSchedules().forEach { it.validate() }
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
                (if (date.asKnown().isPresent) 1 else 0) +
                    (if (stopId.asKnown().isPresent) 1 else 0) +
                    (stopRouteSchedules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class StopRouteSchedule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val routeId: JsonField<String>,
                private val stopRouteDirectionSchedules:
                    JsonField<List<StopRouteDirectionSchedule>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("routeId")
                    @ExcludeMissing
                    routeId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stopRouteDirectionSchedules")
                    @ExcludeMissing
                    stopRouteDirectionSchedules: JsonField<List<StopRouteDirectionSchedule>> =
                        JsonMissing.of(),
                ) : this(routeId, stopRouteDirectionSchedules, mutableMapOf())

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
                fun stopRouteDirectionSchedules(): List<StopRouteDirectionSchedule> =
                    stopRouteDirectionSchedules.getRequired("stopRouteDirectionSchedules")

                /**
                 * Returns the raw JSON value of [routeId].
                 *
                 * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

                /**
                 * Returns the raw JSON value of [stopRouteDirectionSchedules].
                 *
                 * Unlike [stopRouteDirectionSchedules], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("stopRouteDirectionSchedules")
                @ExcludeMissing
                fun _stopRouteDirectionSchedules(): JsonField<List<StopRouteDirectionSchedule>> =
                    stopRouteDirectionSchedules

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
                     * [StopRouteSchedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .routeId()
                     * .stopRouteDirectionSchedules()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopRouteSchedule]. */
                class Builder internal constructor() {

                    private var routeId: JsonField<String>? = null
                    private var stopRouteDirectionSchedules:
                        JsonField<MutableList<StopRouteDirectionSchedule>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopRouteSchedule: StopRouteSchedule) = apply {
                        routeId = stopRouteSchedule.routeId
                        stopRouteDirectionSchedules =
                            stopRouteSchedule.stopRouteDirectionSchedules.map { it.toMutableList() }
                        additionalProperties = stopRouteSchedule.additionalProperties.toMutableMap()
                    }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    /**
                     * Sets [Builder.routeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.routeId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: List<StopRouteDirectionSchedule>
                    ) = stopRouteDirectionSchedules(JsonField.of(stopRouteDirectionSchedules))

                    /**
                     * Sets [Builder.stopRouteDirectionSchedules] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stopRouteDirectionSchedules] with a
                     * well-typed `List<StopRouteDirectionSchedule>` value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: JsonField<List<StopRouteDirectionSchedule>>
                    ) = apply {
                        this.stopRouteDirectionSchedules =
                            stopRouteDirectionSchedules.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [StopRouteDirectionSchedule] to [stopRouteDirectionSchedules].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addStopRouteDirectionSchedule(
                        stopRouteDirectionSchedule: StopRouteDirectionSchedule
                    ) = apply {
                        stopRouteDirectionSchedules =
                            (stopRouteDirectionSchedules ?: JsonField.of(mutableListOf())).also {
                                checkKnown("stopRouteDirectionSchedules", it)
                                    .add(stopRouteDirectionSchedule)
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
                     * Returns an immutable instance of [StopRouteSchedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .routeId()
                     * .stopRouteDirectionSchedules()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): StopRouteSchedule =
                        StopRouteSchedule(
                            checkRequired("routeId", routeId),
                            checkRequired(
                                    "stopRouteDirectionSchedules",
                                    stopRouteDirectionSchedules,
                                )
                                .map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): StopRouteSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    routeId()
                    stopRouteDirectionSchedules().forEach { it.validate() }
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
                        (stopRouteDirectionSchedules.asKnown().getOrNull()?.sumOf {
                            it.validity().toInt()
                        } ?: 0)

                class StopRouteDirectionSchedule
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val scheduleStopTimes: JsonField<List<ScheduleStopTime>>,
                    private val tripHeadsign: JsonField<String>,
                    private val scheduleFrequencies: JsonField<List<ScheduleFrequency>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("scheduleStopTimes")
                        @ExcludeMissing
                        scheduleStopTimes: JsonField<List<ScheduleStopTime>> = JsonMissing.of(),
                        @JsonProperty("tripHeadsign")
                        @ExcludeMissing
                        tripHeadsign: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("scheduleFrequencies")
                        @ExcludeMissing
                        scheduleFrequencies: JsonField<List<ScheduleFrequency>> = JsonMissing.of(),
                    ) : this(scheduleStopTimes, tripHeadsign, scheduleFrequencies, mutableMapOf())

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun scheduleStopTimes(): List<ScheduleStopTime> =
                        scheduleStopTimes.getRequired("scheduleStopTimes")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun scheduleFrequencies(): Optional<List<ScheduleFrequency>> =
                        scheduleFrequencies.getOptional("scheduleFrequencies")

                    /**
                     * Returns the raw JSON value of [scheduleStopTimes].
                     *
                     * Unlike [scheduleStopTimes], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("scheduleStopTimes")
                    @ExcludeMissing
                    fun _scheduleStopTimes(): JsonField<List<ScheduleStopTime>> = scheduleStopTimes

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
                     * Returns the raw JSON value of [scheduleFrequencies].
                     *
                     * Unlike [scheduleFrequencies], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("scheduleFrequencies")
                    @ExcludeMissing
                    fun _scheduleFrequencies(): JsonField<List<ScheduleFrequency>> =
                        scheduleFrequencies

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
                         * [StopRouteDirectionSchedule].
                         *
                         * The following fields are required:
                         * ```java
                         * .scheduleStopTimes()
                         * .tripHeadsign()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StopRouteDirectionSchedule]. */
                    class Builder internal constructor() {

                        private var scheduleStopTimes: JsonField<MutableList<ScheduleStopTime>>? =
                            null
                        private var tripHeadsign: JsonField<String>? = null
                        private var scheduleFrequencies:
                            JsonField<MutableList<ScheduleFrequency>>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(stopRouteDirectionSchedule: StopRouteDirectionSchedule) =
                            apply {
                                scheduleStopTimes =
                                    stopRouteDirectionSchedule.scheduleStopTimes.map {
                                        it.toMutableList()
                                    }
                                tripHeadsign = stopRouteDirectionSchedule.tripHeadsign
                                scheduleFrequencies =
                                    stopRouteDirectionSchedule.scheduleFrequencies.map {
                                        it.toMutableList()
                                    }
                                additionalProperties =
                                    stopRouteDirectionSchedule.additionalProperties.toMutableMap()
                            }

                        fun scheduleStopTimes(scheduleStopTimes: List<ScheduleStopTime>) =
                            scheduleStopTimes(JsonField.of(scheduleStopTimes))

                        /**
                         * Sets [Builder.scheduleStopTimes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.scheduleStopTimes] with a well-typed
                         * `List<ScheduleStopTime>` value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun scheduleStopTimes(
                            scheduleStopTimes: JsonField<List<ScheduleStopTime>>
                        ) = apply {
                            this.scheduleStopTimes = scheduleStopTimes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [ScheduleStopTime] to [scheduleStopTimes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addScheduleStopTime(scheduleStopTime: ScheduleStopTime) = apply {
                            scheduleStopTimes =
                                (scheduleStopTimes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("scheduleStopTimes", it).add(scheduleStopTime)
                                }
                        }

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

                        fun scheduleFrequencies(scheduleFrequencies: List<ScheduleFrequency>) =
                            scheduleFrequencies(JsonField.of(scheduleFrequencies))

                        /**
                         * Sets [Builder.scheduleFrequencies] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.scheduleFrequencies] with a well-typed
                         * `List<ScheduleFrequency>` value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun scheduleFrequencies(
                            scheduleFrequencies: JsonField<List<ScheduleFrequency>>
                        ) = apply {
                            this.scheduleFrequencies =
                                scheduleFrequencies.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [ScheduleFrequency] to [scheduleFrequencies].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addScheduleFrequency(scheduleFrequency: ScheduleFrequency) = apply {
                            scheduleFrequencies =
                                (scheduleFrequencies ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("scheduleFrequencies", it).add(scheduleFrequency)
                                }
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
                         * Returns an immutable instance of [StopRouteDirectionSchedule].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .scheduleStopTimes()
                         * .tripHeadsign()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): StopRouteDirectionSchedule =
                            StopRouteDirectionSchedule(
                                checkRequired("scheduleStopTimes", scheduleStopTimes).map {
                                    it.toImmutable()
                                },
                                checkRequired("tripHeadsign", tripHeadsign),
                                (scheduleFrequencies ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): StopRouteDirectionSchedule = apply {
                        if (validated) {
                            return@apply
                        }

                        scheduleStopTimes().forEach { it.validate() }
                        tripHeadsign()
                        scheduleFrequencies().ifPresent { it.forEach { it.validate() } }
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
                        (scheduleStopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                            (if (tripHeadsign.asKnown().isPresent) 1 else 0) +
                            (scheduleFrequencies.asKnown().getOrNull()?.sumOf {
                                it.validity().toInt()
                            } ?: 0)

                    class ScheduleStopTime
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val arrivalEnabled: JsonField<Boolean>,
                        private val arrivalTime: JsonField<Long>,
                        private val departureEnabled: JsonField<Boolean>,
                        private val departureTime: JsonField<Long>,
                        private val serviceId: JsonField<String>,
                        private val tripId: JsonField<String>,
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
                            @JsonProperty("serviceId")
                            @ExcludeMissing
                            serviceId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("tripId")
                            @ExcludeMissing
                            tripId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("stopHeadsign")
                            @ExcludeMissing
                            stopHeadsign: JsonField<String> = JsonMissing.of(),
                        ) : this(
                            arrivalEnabled,
                            arrivalTime,
                            departureEnabled,
                            departureTime,
                            serviceId,
                            tripId,
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
                        fun serviceId(): String = serviceId.getRequired("serviceId")

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
                         * Returns the raw JSON value of [serviceId].
                         *
                         * Unlike [serviceId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

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
                             * Returns a mutable builder for constructing an instance of
                             * [ScheduleStopTime].
                             *
                             * The following fields are required:
                             * ```java
                             * .arrivalEnabled()
                             * .arrivalTime()
                             * .departureEnabled()
                             * .departureTime()
                             * .serviceId()
                             * .tripId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ScheduleStopTime]. */
                        class Builder internal constructor() {

                            private var arrivalEnabled: JsonField<Boolean>? = null
                            private var arrivalTime: JsonField<Long>? = null
                            private var departureEnabled: JsonField<Boolean>? = null
                            private var departureTime: JsonField<Long>? = null
                            private var serviceId: JsonField<String>? = null
                            private var tripId: JsonField<String>? = null
                            private var stopHeadsign: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleStopTime: ScheduleStopTime) = apply {
                                arrivalEnabled = scheduleStopTime.arrivalEnabled
                                arrivalTime = scheduleStopTime.arrivalTime
                                departureEnabled = scheduleStopTime.departureEnabled
                                departureTime = scheduleStopTime.departureTime
                                serviceId = scheduleStopTime.serviceId
                                tripId = scheduleStopTime.tripId
                                stopHeadsign = scheduleStopTime.stopHeadsign
                                additionalProperties =
                                    scheduleStopTime.additionalProperties.toMutableMap()
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

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            /**
                             * Sets [Builder.tripId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tripId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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
                             * Returns an immutable instance of [ScheduleStopTime].
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
                             * .serviceId()
                             * .tripId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ScheduleStopTime =
                                ScheduleStopTime(
                                    checkRequired("arrivalEnabled", arrivalEnabled),
                                    checkRequired("arrivalTime", arrivalTime),
                                    checkRequired("departureEnabled", departureEnabled),
                                    checkRequired("departureTime", departureTime),
                                    checkRequired("serviceId", serviceId),
                                    checkRequired("tripId", tripId),
                                    stopHeadsign,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ScheduleStopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            arrivalEnabled()
                            arrivalTime()
                            departureEnabled()
                            departureTime()
                            serviceId()
                            tripId()
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
                                (if (serviceId.asKnown().isPresent) 1 else 0) +
                                (if (tripId.asKnown().isPresent) 1 else 0) +
                                (if (stopHeadsign.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ScheduleStopTime &&
                                arrivalEnabled == other.arrivalEnabled &&
                                arrivalTime == other.arrivalTime &&
                                departureEnabled == other.departureEnabled &&
                                departureTime == other.departureTime &&
                                serviceId == other.serviceId &&
                                tripId == other.tripId &&
                                stopHeadsign == other.stopHeadsign &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                arrivalEnabled,
                                arrivalTime,
                                departureEnabled,
                                departureTime,
                                serviceId,
                                tripId,
                                stopHeadsign,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleStopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, serviceId=$serviceId, tripId=$tripId, stopHeadsign=$stopHeadsign, additionalProperties=$additionalProperties}"
                    }

                    class ScheduleFrequency
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val endTime: JsonField<Long>,
                        private val headway: JsonField<Int>,
                        private val serviceDate: JsonField<Long>,
                        private val serviceId: JsonField<String>,
                        private val startTime: JsonField<Long>,
                        private val tripId: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("endTime")
                            @ExcludeMissing
                            endTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("headway")
                            @ExcludeMissing
                            headway: JsonField<Int> = JsonMissing.of(),
                            @JsonProperty("serviceDate")
                            @ExcludeMissing
                            serviceDate: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("serviceId")
                            @ExcludeMissing
                            serviceId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("startTime")
                            @ExcludeMissing
                            startTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("tripId")
                            @ExcludeMissing
                            tripId: JsonField<String> = JsonMissing.of(),
                        ) : this(
                            endTime,
                            headway,
                            serviceDate,
                            serviceId,
                            startTime,
                            tripId,
                            mutableMapOf(),
                        )

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun endTime(): Long = endTime.getRequired("endTime")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun headway(): Int = headway.getRequired("headway")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun serviceId(): String = serviceId.getRequired("serviceId")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun startTime(): Long = startTime.getRequired("startTime")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun tripId(): String = tripId.getRequired("tripId")

                        /**
                         * Returns the raw JSON value of [endTime].
                         *
                         * Unlike [endTime], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("endTime")
                        @ExcludeMissing
                        fun _endTime(): JsonField<Long> = endTime

                        /**
                         * Returns the raw JSON value of [headway].
                         *
                         * Unlike [headway], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("headway")
                        @ExcludeMissing
                        fun _headway(): JsonField<Int> = headway

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
                         * Returns the raw JSON value of [serviceId].
                         *
                         * Unlike [serviceId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

                        /**
                         * Returns the raw JSON value of [startTime].
                         *
                         * Unlike [startTime], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("startTime")
                        @ExcludeMissing
                        fun _startTime(): JsonField<Long> = startTime

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
                             * [ScheduleFrequency].
                             *
                             * The following fields are required:
                             * ```java
                             * .endTime()
                             * .headway()
                             * .serviceDate()
                             * .serviceId()
                             * .startTime()
                             * .tripId()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ScheduleFrequency]. */
                        class Builder internal constructor() {

                            private var endTime: JsonField<Long>? = null
                            private var headway: JsonField<Int>? = null
                            private var serviceDate: JsonField<Long>? = null
                            private var serviceId: JsonField<String>? = null
                            private var startTime: JsonField<Long>? = null
                            private var tripId: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleFrequency: ScheduleFrequency) = apply {
                                endTime = scheduleFrequency.endTime
                                headway = scheduleFrequency.headway
                                serviceDate = scheduleFrequency.serviceDate
                                serviceId = scheduleFrequency.serviceId
                                startTime = scheduleFrequency.startTime
                                tripId = scheduleFrequency.tripId
                                additionalProperties =
                                    scheduleFrequency.additionalProperties.toMutableMap()
                            }

                            fun endTime(endTime: Long) = endTime(JsonField.of(endTime))

                            /**
                             * Sets [Builder.endTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.endTime] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun endTime(endTime: JsonField<Long>) = apply { this.endTime = endTime }

                            fun headway(headway: Int) = headway(JsonField.of(headway))

                            /**
                             * Sets [Builder.headway] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.headway] with a well-typed [Int]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun headway(headway: JsonField<Int>) = apply { this.headway = headway }

                            fun serviceDate(serviceDate: Long) =
                                serviceDate(JsonField.of(serviceDate))

                            /**
                             * Sets [Builder.serviceDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.serviceDate] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun serviceDate(serviceDate: JsonField<Long>) = apply {
                                this.serviceDate = serviceDate
                            }

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

                            fun startTime(startTime: Long) = startTime(JsonField.of(startTime))

                            /**
                             * Sets [Builder.startTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.startTime] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun startTime(startTime: JsonField<Long>) = apply {
                                this.startTime = startTime
                            }

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            /**
                             * Sets [Builder.tripId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tripId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
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
                             * Returns an immutable instance of [ScheduleFrequency].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .endTime()
                             * .headway()
                             * .serviceDate()
                             * .serviceId()
                             * .startTime()
                             * .tripId()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ScheduleFrequency =
                                ScheduleFrequency(
                                    checkRequired("endTime", endTime),
                                    checkRequired("headway", headway),
                                    checkRequired("serviceDate", serviceDate),
                                    checkRequired("serviceId", serviceId),
                                    checkRequired("startTime", startTime),
                                    checkRequired("tripId", tripId),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ScheduleFrequency = apply {
                            if (validated) {
                                return@apply
                            }

                            endTime()
                            headway()
                            serviceDate()
                            serviceId()
                            startTime()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (endTime.asKnown().isPresent) 1 else 0) +
                                (if (headway.asKnown().isPresent) 1 else 0) +
                                (if (serviceDate.asKnown().isPresent) 1 else 0) +
                                (if (serviceId.asKnown().isPresent) 1 else 0) +
                                (if (startTime.asKnown().isPresent) 1 else 0) +
                                (if (tripId.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ScheduleFrequency &&
                                endTime == other.endTime &&
                                headway == other.headway &&
                                serviceDate == other.serviceDate &&
                                serviceId == other.serviceId &&
                                startTime == other.startTime &&
                                tripId == other.tripId &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                endTime,
                                headway,
                                serviceDate,
                                serviceId,
                                startTime,
                                tripId,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleFrequency{endTime=$endTime, headway=$headway, serviceDate=$serviceDate, serviceId=$serviceId, startTime=$startTime, tripId=$tripId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StopRouteDirectionSchedule &&
                            scheduleStopTimes == other.scheduleStopTimes &&
                            tripHeadsign == other.tripHeadsign &&
                            scheduleFrequencies == other.scheduleFrequencies &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            scheduleStopTimes,
                            tripHeadsign,
                            scheduleFrequencies,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StopRouteDirectionSchedule{scheduleStopTimes=$scheduleStopTimes, tripHeadsign=$tripHeadsign, scheduleFrequencies=$scheduleFrequencies, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopRouteSchedule &&
                        routeId == other.routeId &&
                        stopRouteDirectionSchedules == other.stopRouteDirectionSchedules &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(routeId, stopRouteDirectionSchedules, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopRouteSchedule{routeId=$routeId, stopRouteDirectionSchedules=$stopRouteDirectionSchedules, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    date == other.date &&
                    stopId == other.stopId &&
                    stopRouteSchedules == other.stopRouteSchedules &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(date, stopId, stopRouteSchedules, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{date=$date, stopId=$stopId, stopRouteSchedules=$stopRouteSchedules, additionalProperties=$additionalProperties}"
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

        return other is ScheduleForStopRetrieveResponse &&
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
        "ScheduleForStopRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
