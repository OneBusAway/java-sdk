// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stopsforroute

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

class StopsForRouteListResponse
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
         * Returns a mutable builder for constructing an instance of [StopsForRouteListResponse].
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

    /** A builder for [StopsForRouteListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopsForRouteListResponse: StopsForRouteListResponse) = apply {
            code = stopsForRouteListResponse.code
            currentTime = stopsForRouteListResponse.currentTime
            text = stopsForRouteListResponse.text
            version = stopsForRouteListResponse.version
            data = stopsForRouteListResponse.data
            additionalProperties = stopsForRouteListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [StopsForRouteListResponse].
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
        fun build(): StopsForRouteListResponse =
            StopsForRouteListResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StopsForRouteListResponse = apply {
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
            private val polylines: JsonField<List<Polyline>>,
            private val routeId: JsonField<String>,
            private val stopGroupings: JsonField<List<StopGrouping>>,
            private val stopIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("polylines")
                @ExcludeMissing
                polylines: JsonField<List<Polyline>> = JsonMissing.of(),
                @JsonProperty("routeId")
                @ExcludeMissing
                routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopGroupings")
                @ExcludeMissing
                stopGroupings: JsonField<List<StopGrouping>> = JsonMissing.of(),
                @JsonProperty("stopIds")
                @ExcludeMissing
                stopIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(polylines, routeId, stopGroupings, stopIds, mutableMapOf())

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun polylines(): Optional<List<Polyline>> = polylines.getOptional("polylines")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routeId(): Optional<String> = routeId.getOptional("routeId")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stopGroupings(): Optional<List<StopGrouping>> =
                stopGroupings.getOptional("stopGroupings")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stopIds(): Optional<List<String>> = stopIds.getOptional("stopIds")

            /**
             * Returns the raw JSON value of [polylines].
             *
             * Unlike [polylines], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("polylines")
            @ExcludeMissing
            fun _polylines(): JsonField<List<Polyline>> = polylines

            /**
             * Returns the raw JSON value of [routeId].
             *
             * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            /**
             * Returns the raw JSON value of [stopGroupings].
             *
             * Unlike [stopGroupings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stopGroupings")
            @ExcludeMissing
            fun _stopGroupings(): JsonField<List<StopGrouping>> = stopGroupings

            /**
             * Returns the raw JSON value of [stopIds].
             *
             * Unlike [stopIds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stopIds")
            @ExcludeMissing
            fun _stopIds(): JsonField<List<String>> = stopIds

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

                /** Returns a mutable builder for constructing an instance of [Entry]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var polylines: JsonField<MutableList<Polyline>>? = null
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopGroupings: JsonField<MutableList<StopGrouping>>? = null
                private var stopIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    polylines = entry.polylines.map { it.toMutableList() }
                    routeId = entry.routeId
                    stopGroupings = entry.stopGroupings.map { it.toMutableList() }
                    stopIds = entry.stopIds.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                /**
                 * Sets [Builder.polylines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.polylines] with a well-typed `List<Polyline>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                    this.polylines = polylines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Polyline] to [polylines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPolyline(polyline: Polyline) = apply {
                    polylines =
                        (polylines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("polylines", it).add(polyline)
                        }
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

                fun stopGroupings(stopGroupings: List<StopGrouping>) =
                    stopGroupings(JsonField.of(stopGroupings))

                /**
                 * Sets [Builder.stopGroupings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopGroupings] with a well-typed
                 * `List<StopGrouping>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun stopGroupings(stopGroupings: JsonField<List<StopGrouping>>) = apply {
                    this.stopGroupings = stopGroupings.map { it.toMutableList() }
                }

                /**
                 * Adds a single [StopGrouping] to [stopGroupings].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStopGrouping(stopGrouping: StopGrouping) = apply {
                    stopGroupings =
                        (stopGroupings ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stopGroupings", it).add(stopGrouping)
                        }
                }

                fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                /**
                 * Sets [Builder.stopIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopIds] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 */
                fun build(): Entry =
                    Entry(
                        (polylines ?: JsonMissing.of()).map { it.toImmutable() },
                        routeId,
                        (stopGroupings ?: JsonMissing.of()).map { it.toImmutable() },
                        (stopIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                polylines().ifPresent { it.forEach { it.validate() } }
                routeId()
                stopGroupings().ifPresent { it.forEach { it.validate() } }
                stopIds()
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
                (polylines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (routeId.asKnown().isPresent) 1 else 0) +
                    (stopGroupings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (stopIds.asKnown().getOrNull()?.size ?: 0)

            class Polyline
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val length: JsonField<Long>,
                private val levels: JsonField<String>,
                private val points: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("levels")
                    @ExcludeMissing
                    levels: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("points")
                    @ExcludeMissing
                    points: JsonField<String> = JsonMissing.of(),
                ) : this(length, levels, points, mutableMapOf())

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun levels(): Optional<String> = levels.getOptional("levels")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun points(): Optional<String> = points.getOptional("points")

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [levels].
                 *
                 * Unlike [levels], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("levels") @ExcludeMissing fun _levels(): JsonField<String> = levels

                /**
                 * Returns the raw JSON value of [points].
                 *
                 * Unlike [points], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("points") @ExcludeMissing fun _points(): JsonField<String> = points

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

                    /** Returns a mutable builder for constructing an instance of [Polyline]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Polyline]. */
                class Builder internal constructor() {

                    private var length: JsonField<Long> = JsonMissing.of()
                    private var levels: JsonField<String> = JsonMissing.of()
                    private var points: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(polyline: Polyline) = apply {
                        length = polyline.length
                        levels = polyline.levels
                        points = polyline.points
                        additionalProperties = polyline.additionalProperties.toMutableMap()
                    }

                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    fun levels(levels: String) = levels(JsonField.of(levels))

                    /**
                     * Sets [Builder.levels] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.levels] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                    fun points(points: String) = points(JsonField.of(points))

                    /**
                     * Sets [Builder.points] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.points] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun points(points: JsonField<String>) = apply { this.points = points }

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
                     * Returns an immutable instance of [Polyline].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Polyline =
                        Polyline(length, levels, points, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Polyline = apply {
                    if (validated) {
                        return@apply
                    }

                    length()
                    levels()
                    points()
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
                    (if (length.asKnown().isPresent) 1 else 0) +
                        (if (levels.asKnown().isPresent) 1 else 0) +
                        (if (points.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Polyline &&
                        length == other.length &&
                        levels == other.levels &&
                        points == other.points &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(length, levels, points, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
            }

            class StopGrouping
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<Name>,
                private val polylines: JsonField<List<Polyline>>,
                private val stopIds: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
                    @JsonProperty("polylines")
                    @ExcludeMissing
                    polylines: JsonField<List<Polyline>> = JsonMissing.of(),
                    @JsonProperty("stopIds")
                    @ExcludeMissing
                    stopIds: JsonField<List<String>> = JsonMissing.of(),
                ) : this(id, name, polylines, stopIds, mutableMapOf())

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<Name> = name.getOptional("name")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun polylines(): Optional<List<Polyline>> = polylines.getOptional("polylines")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun stopIds(): Optional<List<String>> = stopIds.getOptional("stopIds")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

                /**
                 * Returns the raw JSON value of [polylines].
                 *
                 * Unlike [polylines], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("polylines")
                @ExcludeMissing
                fun _polylines(): JsonField<List<Polyline>> = polylines

                /**
                 * Returns the raw JSON value of [stopIds].
                 *
                 * Unlike [stopIds], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stopIds")
                @ExcludeMissing
                fun _stopIds(): JsonField<List<String>> = stopIds

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

                    /** Returns a mutable builder for constructing an instance of [StopGrouping]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopGrouping]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<Name> = JsonMissing.of()
                    private var polylines: JsonField<MutableList<Polyline>>? = null
                    private var stopIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopGrouping: StopGrouping) = apply {
                        id = stopGrouping.id
                        name = stopGrouping.name
                        polylines = stopGrouping.polylines.map { it.toMutableList() }
                        stopIds = stopGrouping.stopIds.map { it.toMutableList() }
                        additionalProperties = stopGrouping.additionalProperties.toMutableMap()
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

                    fun name(name: Name) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [Name] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<Name>) = apply { this.name = name }

                    fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                    /**
                     * Sets [Builder.polylines] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.polylines] with a well-typed
                     * `List<Polyline>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                        this.polylines = polylines.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Polyline] to [polylines].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addPolyline(polyline: Polyline) = apply {
                        polylines =
                            (polylines ?: JsonField.of(mutableListOf())).also {
                                checkKnown("polylines", it).add(polyline)
                            }
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
                     * Returns an immutable instance of [StopGrouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): StopGrouping =
                        StopGrouping(
                            id,
                            name,
                            (polylines ?: JsonMissing.of()).map { it.toImmutable() },
                            (stopIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): StopGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name().ifPresent { it.validate() }
                    polylines().ifPresent { it.forEach { it.validate() } }
                    stopIds()
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
                        (name.asKnown().getOrNull()?.validity() ?: 0) +
                        (polylines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (stopIds.asKnown().getOrNull()?.size ?: 0)

                class Name
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val names: JsonField<List<String>>,
                    private val type: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("names")
                        @ExcludeMissing
                        names: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                    ) : this(name, names, type, mutableMapOf())

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = name.getOptional("name")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun names(): Optional<List<String>> = names.getOptional("names")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<String> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [names].
                     *
                     * Unlike [names], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("names")
                    @ExcludeMissing
                    fun _names(): JsonField<List<String>> = names

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                        /** Returns a mutable builder for constructing an instance of [Name]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Name]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var names: JsonField<MutableList<String>>? = null
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(name: Name) = apply {
                            this.name = name.name
                            names = name.names.map { it.toMutableList() }
                            type = name.type
                            additionalProperties = name.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun names(names: List<String>) = names(JsonField.of(names))

                        /**
                         * Sets [Builder.names] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.names] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun names(names: JsonField<List<String>>) = apply {
                            this.names = names.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [names].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addName(name: String) = apply {
                            names =
                                (names ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("names", it).add(name)
                                }
                        }

                        fun type(type: String) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<String>) = apply { this.type = type }

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
                         * Returns an immutable instance of [Name].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Name =
                            Name(
                                name,
                                (names ?: JsonMissing.of()).map { it.toImmutable() },
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Name = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        names()
                        type()
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
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (names.asKnown().getOrNull()?.size ?: 0) +
                            (if (type.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Name &&
                            name == other.name &&
                            names == other.names &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, names, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Name{name=$name, names=$names, type=$type, additionalProperties=$additionalProperties}"
                }

                class Polyline
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val length: JsonField<Long>,
                    private val levels: JsonField<String>,
                    private val points: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("length")
                        @ExcludeMissing
                        length: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("levels")
                        @ExcludeMissing
                        levels: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("points")
                        @ExcludeMissing
                        points: JsonField<String> = JsonMissing.of(),
                    ) : this(length, levels, points, mutableMapOf())

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun length(): Optional<Long> = length.getOptional("length")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun levels(): Optional<String> = levels.getOptional("levels")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun points(): Optional<String> = points.getOptional("points")

                    /**
                     * Returns the raw JSON value of [length].
                     *
                     * Unlike [length], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                    /**
                     * Returns the raw JSON value of [levels].
                     *
                     * Unlike [levels], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("levels")
                    @ExcludeMissing
                    fun _levels(): JsonField<String> = levels

                    /**
                     * Returns the raw JSON value of [points].
                     *
                     * Unlike [points], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("points")
                    @ExcludeMissing
                    fun _points(): JsonField<String> = points

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

                        /** Returns a mutable builder for constructing an instance of [Polyline]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Polyline]. */
                    class Builder internal constructor() {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(polyline: Polyline) = apply {
                            length = polyline.length
                            levels = polyline.levels
                            points = polyline.points
                            additionalProperties = polyline.additionalProperties.toMutableMap()
                        }

                        fun length(length: Long) = length(JsonField.of(length))

                        /**
                         * Sets [Builder.length] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.length] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        fun levels(levels: String) = levels(JsonField.of(levels))

                        /**
                         * Sets [Builder.levels] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.levels] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        fun points(points: String) = points(JsonField.of(points))

                        /**
                         * Sets [Builder.points] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.points] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun points(points: JsonField<String>) = apply { this.points = points }

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
                         * Returns an immutable instance of [Polyline].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Polyline =
                            Polyline(length, levels, points, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Polyline = apply {
                        if (validated) {
                            return@apply
                        }

                        length()
                        levels()
                        points()
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
                        (if (length.asKnown().isPresent) 1 else 0) +
                            (if (levels.asKnown().isPresent) 1 else 0) +
                            (if (points.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Polyline &&
                            length == other.length &&
                            levels == other.levels &&
                            points == other.points &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(length, levels, points, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopGrouping &&
                        id == other.id &&
                        name == other.name &&
                        polylines == other.polylines &&
                        stopIds == other.stopIds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, name, polylines, stopIds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopGrouping{id=$id, name=$name, polylines=$polylines, stopIds=$stopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    polylines == other.polylines &&
                    routeId == other.routeId &&
                    stopGroupings == other.stopGroupings &&
                    stopIds == other.stopIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(polylines, routeId, stopGroupings, stopIds, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{polylines=$polylines, routeId=$routeId, stopGroupings=$stopGroupings, stopIds=$stopIds, additionalProperties=$additionalProperties}"
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

        return other is StopsForRouteListResponse &&
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
        "StopsForRouteListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
