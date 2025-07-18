// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.stop

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

class StopRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [StopRetrieveResponse].
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

    /** A builder for [StopRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopRetrieveResponse: StopRetrieveResponse) = apply {
            code = stopRetrieveResponse.code
            currentTime = stopRetrieveResponse.currentTime
            text = stopRetrieveResponse.text
            version = stopRetrieveResponse.version
            data = stopRetrieveResponse.data
            additionalProperties = stopRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [StopRetrieveResponse].
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
        fun build(): StopRetrieveResponse =
            StopRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StopRetrieveResponse = apply {
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
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent")
                @ExcludeMissing
                parent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeIds")
                @ExcludeMissing
                routeIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                staticRouteIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
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
            fun lat(): Double = lat.getRequired("lat")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun locationType(): Long = locationType.getRequired("locationType")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lon(): Double = lon.getRequired("lon")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parent(): String = parent.getRequired("parent")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routeIds(): List<String> = routeIds.getRequired("routeIds")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun direction(): Optional<String> = direction.getOptional("direction")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [locationType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parent].
             *
             * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
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
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Entry].
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

            /** A builder for [Entry]. */
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
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    lat = entry.lat
                    locationType = entry.locationType
                    lon = entry.lon
                    name = entry.name
                    parent = entry.parent
                    routeIds = entry.routeIds.map { it.toMutableList() }
                    staticRouteIds = entry.staticRouteIds.map { it.toMutableList() }
                    code = entry.code
                    direction = entry.direction
                    wheelchairBoarding = entry.wheelchairBoarding
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

                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                /**
                 * Sets [Builder.locationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locationType] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locationType(locationType: JsonField<Long>) = apply {
                    this.locationType = locationType
                }

                fun lon(lon: Double) = lon(JsonField.of(lon))

                /**
                 * Sets [Builder.lon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lon] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun parent(parent: String) = parent(JsonField.of(parent))

                /**
                 * Sets [Builder.parent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parent] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                /**
                 * Sets [Builder.routeIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeIds] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.staticRouteIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun direction(direction: String) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                fun wheelchairBoarding(wheelchairBoarding: String) =
                    wheelchairBoarding(JsonField.of(wheelchairBoarding))

                /**
                 * Sets [Builder.wheelchairBoarding] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wheelchairBoarding] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Entry].
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
                fun build(): Entry =
                    Entry(
                        checkRequired("id", id),
                        checkRequired("lat", lat),
                        checkRequired("locationType", locationType),
                        checkRequired("lon", lon),
                        checkRequired("name", name),
                        checkRequired("parent", parent),
                        checkRequired("routeIds", routeIds).map { it.toImmutable() },
                        checkRequired("staticRouteIds", staticRouteIds).map { it.toImmutable() },
                        code,
                        direction,
                        wheelchairBoarding,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
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

                return /* spotless:off */ other is Entry && id == other.id && lat == other.lat && locationType == other.locationType && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, code, direction, wheelchairBoarding, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && entry == other.entry && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entry, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
