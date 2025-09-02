// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.block

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

class BlockRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [BlockRetrieveResponse].
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

    /** A builder for [BlockRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(blockRetrieveResponse: BlockRetrieveResponse) = apply {
            code = blockRetrieveResponse.code
            currentTime = blockRetrieveResponse.currentTime
            text = blockRetrieveResponse.text
            version = blockRetrieveResponse.version
            data = blockRetrieveResponse.data
            additionalProperties = blockRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BlockRetrieveResponse].
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
        fun build(): BlockRetrieveResponse =
            BlockRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BlockRetrieveResponse = apply {
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
            private val id: JsonField<String>,
            private val configurations: JsonField<List<Configuration>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("configurations")
                @ExcludeMissing
                configurations: JsonField<List<Configuration>> = JsonMissing.of(),
            ) : this(id, configurations, mutableMapOf())

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun configurations(): List<Configuration> = configurations.getRequired("configurations")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [configurations].
             *
             * Unlike [configurations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("configurations")
            @ExcludeMissing
            fun _configurations(): JsonField<List<Configuration>> = configurations

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
                 * .id()
                 * .configurations()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var configurations: JsonField<MutableList<Configuration>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    configurations = entry.configurations.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun configurations(configurations: List<Configuration>) =
                    configurations(JsonField.of(configurations))

                /**
                 * Sets [Builder.configurations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.configurations] with a well-typed
                 * `List<Configuration>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun configurations(configurations: JsonField<List<Configuration>>) = apply {
                    this.configurations = configurations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Configuration] to [configurations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addConfiguration(configuration: Configuration) = apply {
                    configurations =
                        (configurations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("configurations", it).add(configuration)
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
                 * .id()
                 * .configurations()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entry =
                    Entry(
                        checkRequired("id", id),
                        checkRequired("configurations", configurations).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                configurations().forEach { it.validate() }
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
                    (configurations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Configuration
            private constructor(
                private val activeServiceIds: JsonField<List<String>>,
                private val trips: JsonField<List<Trip>>,
                private val inactiveServiceIds: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("activeServiceIds")
                    @ExcludeMissing
                    activeServiceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("trips")
                    @ExcludeMissing
                    trips: JsonField<List<Trip>> = JsonMissing.of(),
                    @JsonProperty("inactiveServiceIds")
                    @ExcludeMissing
                    inactiveServiceIds: JsonField<List<String>> = JsonMissing.of(),
                ) : this(activeServiceIds, trips, inactiveServiceIds, mutableMapOf())

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun activeServiceIds(): List<String> =
                    activeServiceIds.getRequired("activeServiceIds")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun trips(): List<Trip> = trips.getRequired("trips")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun inactiveServiceIds(): Optional<List<String>> =
                    inactiveServiceIds.getOptional("inactiveServiceIds")

                /**
                 * Returns the raw JSON value of [activeServiceIds].
                 *
                 * Unlike [activeServiceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activeServiceIds")
                @ExcludeMissing
                fun _activeServiceIds(): JsonField<List<String>> = activeServiceIds

                /**
                 * Returns the raw JSON value of [trips].
                 *
                 * Unlike [trips], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

                /**
                 * Returns the raw JSON value of [inactiveServiceIds].
                 *
                 * Unlike [inactiveServiceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                fun _inactiveServiceIds(): JsonField<List<String>> = inactiveServiceIds

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
                     * Returns a mutable builder for constructing an instance of [Configuration].
                     *
                     * The following fields are required:
                     * ```java
                     * .activeServiceIds()
                     * .trips()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Configuration]. */
                class Builder internal constructor() {

                    private var activeServiceIds: JsonField<MutableList<String>>? = null
                    private var trips: JsonField<MutableList<Trip>>? = null
                    private var inactiveServiceIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(configuration: Configuration) = apply {
                        activeServiceIds = configuration.activeServiceIds.map { it.toMutableList() }
                        trips = configuration.trips.map { it.toMutableList() }
                        inactiveServiceIds =
                            configuration.inactiveServiceIds.map { it.toMutableList() }
                        additionalProperties = configuration.additionalProperties.toMutableMap()
                    }

                    fun activeServiceIds(activeServiceIds: List<String>) =
                        activeServiceIds(JsonField.of(activeServiceIds))

                    /**
                     * Sets [Builder.activeServiceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activeServiceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun activeServiceIds(activeServiceIds: JsonField<List<String>>) = apply {
                        this.activeServiceIds = activeServiceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [activeServiceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addActiveServiceId(activeServiceId: String) = apply {
                        activeServiceIds =
                            (activeServiceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("activeServiceIds", it).add(activeServiceId)
                            }
                    }

                    fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                    /**
                     * Sets [Builder.trips] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.trips] with a well-typed `List<Trip>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    fun inactiveServiceIds(inactiveServiceIds: List<String>) =
                        inactiveServiceIds(JsonField.of(inactiveServiceIds))

                    /**
                     * Sets [Builder.inactiveServiceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inactiveServiceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun inactiveServiceIds(inactiveServiceIds: JsonField<List<String>>) = apply {
                        this.inactiveServiceIds = inactiveServiceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [inactiveServiceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addInactiveServiceId(inactiveServiceId: String) = apply {
                        inactiveServiceIds =
                            (inactiveServiceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("inactiveServiceIds", it).add(inactiveServiceId)
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
                     * Returns an immutable instance of [Configuration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .activeServiceIds()
                     * .trips()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Configuration =
                        Configuration(
                            checkRequired("activeServiceIds", activeServiceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("trips", trips).map { it.toImmutable() },
                            (inactiveServiceIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Configuration = apply {
                    if (validated) {
                        return@apply
                    }

                    activeServiceIds()
                    trips().forEach { it.validate() }
                    inactiveServiceIds()
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
                    (activeServiceIds.asKnown().getOrNull()?.size ?: 0) +
                        (trips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (inactiveServiceIds.asKnown().getOrNull()?.size ?: 0)

                class Trip
                private constructor(
                    private val accumulatedSlackTime: JsonField<Float>,
                    private val blockStopTimes: JsonField<List<BlockStopTime>>,
                    private val distanceAlongBlock: JsonField<Float>,
                    private val tripId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        accumulatedSlackTime: JsonField<Float> = JsonMissing.of(),
                        @JsonProperty("blockStopTimes")
                        @ExcludeMissing
                        blockStopTimes: JsonField<List<BlockStopTime>> = JsonMissing.of(),
                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        distanceAlongBlock: JsonField<Float> = JsonMissing.of(),
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        tripId: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        accumulatedSlackTime,
                        blockStopTimes,
                        distanceAlongBlock,
                        tripId,
                        mutableMapOf(),
                    )

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun accumulatedSlackTime(): Float =
                        accumulatedSlackTime.getRequired("accumulatedSlackTime")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun blockStopTimes(): List<BlockStopTime> =
                        blockStopTimes.getRequired("blockStopTimes")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun distanceAlongBlock(): Float =
                        distanceAlongBlock.getRequired("distanceAlongBlock")

                    /**
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun tripId(): String = tripId.getRequired("tripId")

                    /**
                     * Returns the raw JSON value of [accumulatedSlackTime].
                     *
                     * Unlike [accumulatedSlackTime], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("accumulatedSlackTime")
                    @ExcludeMissing
                    fun _accumulatedSlackTime(): JsonField<Float> = accumulatedSlackTime

                    /**
                     * Returns the raw JSON value of [blockStopTimes].
                     *
                     * Unlike [blockStopTimes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("blockStopTimes")
                    @ExcludeMissing
                    fun _blockStopTimes(): JsonField<List<BlockStopTime>> = blockStopTimes

                    /**
                     * Returns the raw JSON value of [distanceAlongBlock].
                     *
                     * Unlike [distanceAlongBlock], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("distanceAlongBlock")
                    @ExcludeMissing
                    fun _distanceAlongBlock(): JsonField<Float> = distanceAlongBlock

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
                         * Returns a mutable builder for constructing an instance of [Trip].
                         *
                         * The following fields are required:
                         * ```java
                         * .accumulatedSlackTime()
                         * .blockStopTimes()
                         * .distanceAlongBlock()
                         * .tripId()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Trip]. */
                    class Builder internal constructor() {

                        private var accumulatedSlackTime: JsonField<Float>? = null
                        private var blockStopTimes: JsonField<MutableList<BlockStopTime>>? = null
                        private var distanceAlongBlock: JsonField<Float>? = null
                        private var tripId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(trip: Trip) = apply {
                            accumulatedSlackTime = trip.accumulatedSlackTime
                            blockStopTimes = trip.blockStopTimes.map { it.toMutableList() }
                            distanceAlongBlock = trip.distanceAlongBlock
                            tripId = trip.tripId
                            additionalProperties = trip.additionalProperties.toMutableMap()
                        }

                        fun accumulatedSlackTime(accumulatedSlackTime: Float) =
                            accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                        /**
                         * Sets [Builder.accumulatedSlackTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accumulatedSlackTime] with a well-typed
                         * [Float] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Float>) = apply {
                            this.accumulatedSlackTime = accumulatedSlackTime
                        }

                        fun blockStopTimes(blockStopTimes: List<BlockStopTime>) =
                            blockStopTimes(JsonField.of(blockStopTimes))

                        /**
                         * Sets [Builder.blockStopTimes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.blockStopTimes] with a well-typed
                         * `List<BlockStopTime>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun blockStopTimes(blockStopTimes: JsonField<List<BlockStopTime>>) = apply {
                            this.blockStopTimes = blockStopTimes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [BlockStopTime] to [blockStopTimes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addBlockStopTime(blockStopTime: BlockStopTime) = apply {
                            blockStopTimes =
                                (blockStopTimes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("blockStopTimes", it).add(blockStopTime)
                                }
                        }

                        fun distanceAlongBlock(distanceAlongBlock: Float) =
                            distanceAlongBlock(JsonField.of(distanceAlongBlock))

                        /**
                         * Sets [Builder.distanceAlongBlock] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.distanceAlongBlock] with a well-typed
                         * [Float] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun distanceAlongBlock(distanceAlongBlock: JsonField<Float>) = apply {
                            this.distanceAlongBlock = distanceAlongBlock
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
                         * Returns an immutable instance of [Trip].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .accumulatedSlackTime()
                         * .blockStopTimes()
                         * .distanceAlongBlock()
                         * .tripId()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Trip =
                            Trip(
                                checkRequired("accumulatedSlackTime", accumulatedSlackTime),
                                checkRequired("blockStopTimes", blockStopTimes).map {
                                    it.toImmutable()
                                },
                                checkRequired("distanceAlongBlock", distanceAlongBlock),
                                checkRequired("tripId", tripId),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Trip = apply {
                        if (validated) {
                            return@apply
                        }

                        accumulatedSlackTime()
                        blockStopTimes().forEach { it.validate() }
                        distanceAlongBlock()
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
                        (if (accumulatedSlackTime.asKnown().isPresent) 1 else 0) +
                            (blockStopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                                ?: 0) +
                            (if (distanceAlongBlock.asKnown().isPresent) 1 else 0) +
                            (if (tripId.asKnown().isPresent) 1 else 0)

                    class BlockStopTime
                    private constructor(
                        private val accumulatedSlackTime: JsonField<Float>,
                        private val blockSequence: JsonField<Long>,
                        private val distanceAlongBlock: JsonField<Float>,
                        private val stopTime: JsonField<StopTime>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("accumulatedSlackTime")
                            @ExcludeMissing
                            accumulatedSlackTime: JsonField<Float> = JsonMissing.of(),
                            @JsonProperty("blockSequence")
                            @ExcludeMissing
                            blockSequence: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("distanceAlongBlock")
                            @ExcludeMissing
                            distanceAlongBlock: JsonField<Float> = JsonMissing.of(),
                            @JsonProperty("stopTime")
                            @ExcludeMissing
                            stopTime: JsonField<StopTime> = JsonMissing.of(),
                        ) : this(
                            accumulatedSlackTime,
                            blockSequence,
                            distanceAlongBlock,
                            stopTime,
                            mutableMapOf(),
                        )

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun accumulatedSlackTime(): Float =
                            accumulatedSlackTime.getRequired("accumulatedSlackTime")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun blockSequence(): Long = blockSequence.getRequired("blockSequence")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun distanceAlongBlock(): Float =
                            distanceAlongBlock.getRequired("distanceAlongBlock")

                        /**
                         * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun stopTime(): StopTime = stopTime.getRequired("stopTime")

                        /**
                         * Returns the raw JSON value of [accumulatedSlackTime].
                         *
                         * Unlike [accumulatedSlackTime], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        fun _accumulatedSlackTime(): JsonField<Float> = accumulatedSlackTime

                        /**
                         * Returns the raw JSON value of [blockSequence].
                         *
                         * Unlike [blockSequence], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("blockSequence")
                        @ExcludeMissing
                        fun _blockSequence(): JsonField<Long> = blockSequence

                        /**
                         * Returns the raw JSON value of [distanceAlongBlock].
                         *
                         * Unlike [distanceAlongBlock], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        fun _distanceAlongBlock(): JsonField<Float> = distanceAlongBlock

                        /**
                         * Returns the raw JSON value of [stopTime].
                         *
                         * Unlike [stopTime], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("stopTime")
                        @ExcludeMissing
                        fun _stopTime(): JsonField<StopTime> = stopTime

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
                             * [BlockStopTime].
                             *
                             * The following fields are required:
                             * ```java
                             * .accumulatedSlackTime()
                             * .blockSequence()
                             * .distanceAlongBlock()
                             * .stopTime()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [BlockStopTime]. */
                        class Builder internal constructor() {

                            private var accumulatedSlackTime: JsonField<Float>? = null
                            private var blockSequence: JsonField<Long>? = null
                            private var distanceAlongBlock: JsonField<Float>? = null
                            private var stopTime: JsonField<StopTime>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(blockStopTime: BlockStopTime) = apply {
                                accumulatedSlackTime = blockStopTime.accumulatedSlackTime
                                blockSequence = blockStopTime.blockSequence
                                distanceAlongBlock = blockStopTime.distanceAlongBlock
                                stopTime = blockStopTime.stopTime
                                additionalProperties =
                                    blockStopTime.additionalProperties.toMutableMap()
                            }

                            fun accumulatedSlackTime(accumulatedSlackTime: Float) =
                                accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                            /**
                             * Sets [Builder.accumulatedSlackTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accumulatedSlackTime] with a
                             * well-typed [Float] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Float>) =
                                apply {
                                    this.accumulatedSlackTime = accumulatedSlackTime
                                }

                            fun blockSequence(blockSequence: Long) =
                                blockSequence(JsonField.of(blockSequence))

                            /**
                             * Sets [Builder.blockSequence] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.blockSequence] with a well-typed
                             * [Long] value instead. This method is primarily for setting the field
                             * to an undocumented or not yet supported value.
                             */
                            fun blockSequence(blockSequence: JsonField<Long>) = apply {
                                this.blockSequence = blockSequence
                            }

                            fun distanceAlongBlock(distanceAlongBlock: Float) =
                                distanceAlongBlock(JsonField.of(distanceAlongBlock))

                            /**
                             * Sets [Builder.distanceAlongBlock] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.distanceAlongBlock] with a
                             * well-typed [Float] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun distanceAlongBlock(distanceAlongBlock: JsonField<Float>) = apply {
                                this.distanceAlongBlock = distanceAlongBlock
                            }

                            fun stopTime(stopTime: StopTime) = stopTime(JsonField.of(stopTime))

                            /**
                             * Sets [Builder.stopTime] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.stopTime] with a well-typed
                             * [StopTime] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun stopTime(stopTime: JsonField<StopTime>) = apply {
                                this.stopTime = stopTime
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
                             * Returns an immutable instance of [BlockStopTime].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .accumulatedSlackTime()
                             * .blockSequence()
                             * .distanceAlongBlock()
                             * .stopTime()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): BlockStopTime =
                                BlockStopTime(
                                    checkRequired("accumulatedSlackTime", accumulatedSlackTime),
                                    checkRequired("blockSequence", blockSequence),
                                    checkRequired("distanceAlongBlock", distanceAlongBlock),
                                    checkRequired("stopTime", stopTime),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): BlockStopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            accumulatedSlackTime()
                            blockSequence()
                            distanceAlongBlock()
                            stopTime().validate()
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
                            (if (accumulatedSlackTime.asKnown().isPresent) 1 else 0) +
                                (if (blockSequence.asKnown().isPresent) 1 else 0) +
                                (if (distanceAlongBlock.asKnown().isPresent) 1 else 0) +
                                (stopTime.asKnown().getOrNull()?.validity() ?: 0)

                        class StopTime
                        private constructor(
                            private val arrivalTime: JsonField<Long>,
                            private val departureTime: JsonField<Long>,
                            private val stopId: JsonField<String>,
                            private val dropOffType: JsonField<Long>,
                            private val pickupType: JsonField<Long>,
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
                                @JsonProperty("stopId")
                                @ExcludeMissing
                                stopId: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("dropOffType")
                                @ExcludeMissing
                                dropOffType: JsonField<Long> = JsonMissing.of(),
                                @JsonProperty("pickupType")
                                @ExcludeMissing
                                pickupType: JsonField<Long> = JsonMissing.of(),
                            ) : this(
                                arrivalTime,
                                departureTime,
                                stopId,
                                dropOffType,
                                pickupType,
                                mutableMapOf(),
                            )

                            /**
                             * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                            /**
                             * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun departureTime(): Long = departureTime.getRequired("departureTime")

                            /**
                             * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun stopId(): String = stopId.getRequired("stopId")

                            /**
                             * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun dropOffType(): Optional<Long> =
                                dropOffType.getOptional("dropOffType")

                            /**
                             * @throws OnebusawaySdkInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun pickupType(): Optional<Long> = pickupType.getOptional("pickupType")

                            /**
                             * Returns the raw JSON value of [arrivalTime].
                             *
                             * Unlike [arrivalTime], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            fun _arrivalTime(): JsonField<Long> = arrivalTime

                            /**
                             * Returns the raw JSON value of [departureTime].
                             *
                             * Unlike [departureTime], this method doesn't throw if the JSON field
                             * has an unexpected type.
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
                             * Returns the raw JSON value of [dropOffType].
                             *
                             * Unlike [dropOffType], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("dropOffType")
                            @ExcludeMissing
                            fun _dropOffType(): JsonField<Long> = dropOffType

                            /**
                             * Returns the raw JSON value of [pickupType].
                             *
                             * Unlike [pickupType], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("pickupType")
                            @ExcludeMissing
                            fun _pickupType(): JsonField<Long> = pickupType

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
                                 * [StopTime].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .arrivalTime()
                                 * .departureTime()
                                 * .stopId()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [StopTime]. */
                            class Builder internal constructor() {

                                private var arrivalTime: JsonField<Long>? = null
                                private var departureTime: JsonField<Long>? = null
                                private var stopId: JsonField<String>? = null
                                private var dropOffType: JsonField<Long> = JsonMissing.of()
                                private var pickupType: JsonField<Long> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(stopTime: StopTime) = apply {
                                    arrivalTime = stopTime.arrivalTime
                                    departureTime = stopTime.departureTime
                                    stopId = stopTime.stopId
                                    dropOffType = stopTime.dropOffType
                                    pickupType = stopTime.pickupType
                                    additionalProperties =
                                        stopTime.additionalProperties.toMutableMap()
                                }

                                fun arrivalTime(arrivalTime: Long) =
                                    arrivalTime(JsonField.of(arrivalTime))

                                /**
                                 * Sets [Builder.arrivalTime] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.arrivalTime] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                    this.arrivalTime = arrivalTime
                                }

                                fun departureTime(departureTime: Long) =
                                    departureTime(JsonField.of(departureTime))

                                /**
                                 * Sets [Builder.departureTime] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.departureTime] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun departureTime(departureTime: JsonField<Long>) = apply {
                                    this.departureTime = departureTime
                                }

                                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                                /**
                                 * Sets [Builder.stopId] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.stopId] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun stopId(stopId: JsonField<String>) = apply {
                                    this.stopId = stopId
                                }

                                fun dropOffType(dropOffType: Long) =
                                    dropOffType(JsonField.of(dropOffType))

                                /**
                                 * Sets [Builder.dropOffType] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.dropOffType] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun dropOffType(dropOffType: JsonField<Long>) = apply {
                                    this.dropOffType = dropOffType
                                }

                                fun pickupType(pickupType: Long) =
                                    pickupType(JsonField.of(pickupType))

                                /**
                                 * Sets [Builder.pickupType] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.pickupType] with a well-typed
                                 * [Long] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun pickupType(pickupType: JsonField<Long>) = apply {
                                    this.pickupType = pickupType
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                                 * .arrivalTime()
                                 * .departureTime()
                                 * .stopId()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): StopTime =
                                    StopTime(
                                        checkRequired("arrivalTime", arrivalTime),
                                        checkRequired("departureTime", departureTime),
                                        checkRequired("stopId", stopId),
                                        dropOffType,
                                        pickupType,
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
                                stopId()
                                dropOffType()
                                pickupType()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (if (arrivalTime.asKnown().isPresent) 1 else 0) +
                                    (if (departureTime.asKnown().isPresent) 1 else 0) +
                                    (if (stopId.asKnown().isPresent) 1 else 0) +
                                    (if (dropOffType.asKnown().isPresent) 1 else 0) +
                                    (if (pickupType.asKnown().isPresent) 1 else 0)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StopTime &&
                                    arrivalTime == other.arrivalTime &&
                                    departureTime == other.departureTime &&
                                    stopId == other.stopId &&
                                    dropOffType == other.dropOffType &&
                                    pickupType == other.pickupType &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(
                                    arrivalTime,
                                    departureTime,
                                    stopId,
                                    dropOffType,
                                    pickupType,
                                    additionalProperties,
                                )
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, stopId=$stopId, dropOffType=$dropOffType, pickupType=$pickupType, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is BlockStopTime &&
                                accumulatedSlackTime == other.accumulatedSlackTime &&
                                blockSequence == other.blockSequence &&
                                distanceAlongBlock == other.distanceAlongBlock &&
                                stopTime == other.stopTime &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                accumulatedSlackTime,
                                blockSequence,
                                distanceAlongBlock,
                                stopTime,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "BlockStopTime{accumulatedSlackTime=$accumulatedSlackTime, blockSequence=$blockSequence, distanceAlongBlock=$distanceAlongBlock, stopTime=$stopTime, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Trip &&
                            accumulatedSlackTime == other.accumulatedSlackTime &&
                            blockStopTimes == other.blockStopTimes &&
                            distanceAlongBlock == other.distanceAlongBlock &&
                            tripId == other.tripId &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            accumulatedSlackTime,
                            blockStopTimes,
                            distanceAlongBlock,
                            tripId,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Trip{accumulatedSlackTime=$accumulatedSlackTime, blockStopTimes=$blockStopTimes, distanceAlongBlock=$distanceAlongBlock, tripId=$tripId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Configuration &&
                        activeServiceIds == other.activeServiceIds &&
                        trips == other.trips &&
                        inactiveServiceIds == other.inactiveServiceIds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(activeServiceIds, trips, inactiveServiceIds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Configuration{activeServiceIds=$activeServiceIds, trips=$trips, inactiveServiceIds=$inactiveServiceIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    id == other.id &&
                    configurations == other.configurations &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, configurations, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, configurations=$configurations, additionalProperties=$additionalProperties}"
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

        return other is BlockRetrieveResponse &&
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
        "BlockRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
