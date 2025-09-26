// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.config

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
import org.onebusaway.core.checkRequired
import org.onebusaway.errors.OnebusawaySdkInvalidDataException
import org.onebusaway.models.References
import org.onebusaway.models.ResponseWrapper

class ConfigRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [ConfigRetrieveResponse].
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

    /** A builder for [ConfigRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configRetrieveResponse: ConfigRetrieveResponse) = apply {
            code = configRetrieveResponse.code
            currentTime = configRetrieveResponse.currentTime
            text = configRetrieveResponse.text
            version = configRetrieveResponse.version
            data = configRetrieveResponse.data
            additionalProperties = configRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ConfigRetrieveResponse].
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
        fun build(): ConfigRetrieveResponse =
            ConfigRetrieveResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConfigRetrieveResponse = apply {
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
            private val id: JsonField<String>,
            private val gitProperties: JsonField<GitProperties>,
            private val name: JsonField<String>,
            private val serviceDateFrom: JsonField<String>,
            private val serviceDateTo: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gitProperties")
                @ExcludeMissing
                gitProperties: JsonField<GitProperties> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serviceDateFrom")
                @ExcludeMissing
                serviceDateFrom: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serviceDateTo")
                @ExcludeMissing
                serviceDateTo: JsonField<String> = JsonMissing.of(),
            ) : this(id, gitProperties, name, serviceDateFrom, serviceDateTo, mutableMapOf())

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun gitProperties(): Optional<GitProperties> =
                gitProperties.getOptional("gitProperties")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun serviceDateFrom(): Optional<String> = serviceDateFrom.getOptional("serviceDateFrom")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun serviceDateTo(): Optional<String> = serviceDateTo.getOptional("serviceDateTo")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [gitProperties].
             *
             * Unlike [gitProperties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gitProperties")
            @ExcludeMissing
            fun _gitProperties(): JsonField<GitProperties> = gitProperties

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [serviceDateFrom].
             *
             * Unlike [serviceDateFrom], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("serviceDateFrom")
            @ExcludeMissing
            fun _serviceDateFrom(): JsonField<String> = serviceDateFrom

            /**
             * Returns the raw JSON value of [serviceDateTo].
             *
             * Unlike [serviceDateTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("serviceDateTo")
            @ExcludeMissing
            fun _serviceDateTo(): JsonField<String> = serviceDateTo

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

                private var id: JsonField<String> = JsonMissing.of()
                private var gitProperties: JsonField<GitProperties> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var serviceDateFrom: JsonField<String> = JsonMissing.of()
                private var serviceDateTo: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    gitProperties = entry.gitProperties
                    name = entry.name
                    serviceDateFrom = entry.serviceDateFrom
                    serviceDateTo = entry.serviceDateTo
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

                fun gitProperties(gitProperties: GitProperties) =
                    gitProperties(JsonField.of(gitProperties))

                /**
                 * Sets [Builder.gitProperties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gitProperties] with a well-typed [GitProperties]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun gitProperties(gitProperties: JsonField<GitProperties>) = apply {
                    this.gitProperties = gitProperties
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun serviceDateFrom(serviceDateFrom: String) =
                    serviceDateFrom(JsonField.of(serviceDateFrom))

                /**
                 * Sets [Builder.serviceDateFrom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceDateFrom] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun serviceDateFrom(serviceDateFrom: JsonField<String>) = apply {
                    this.serviceDateFrom = serviceDateFrom
                }

                fun serviceDateTo(serviceDateTo: String) =
                    serviceDateTo(JsonField.of(serviceDateTo))

                /**
                 * Sets [Builder.serviceDateTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceDateTo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun serviceDateTo(serviceDateTo: JsonField<String>) = apply {
                    this.serviceDateTo = serviceDateTo
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
                        id,
                        gitProperties,
                        name,
                        serviceDateFrom,
                        serviceDateTo,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                gitProperties().ifPresent { it.validate() }
                name()
                serviceDateFrom()
                serviceDateTo()
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
                    (gitProperties.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (serviceDateFrom.asKnown().isPresent) 1 else 0) +
                    (if (serviceDateTo.asKnown().isPresent) 1 else 0)

            class GitProperties
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val gitBranch: JsonField<String>,
                private val gitBuildHost: JsonField<String>,
                private val gitBuildTime: JsonField<String>,
                private val gitBuildUserEmail: JsonField<String>,
                private val gitBuildUserName: JsonField<String>,
                private val gitBuildVersion: JsonField<String>,
                private val gitClosestTagCommitCount: JsonField<String>,
                private val gitClosestTagName: JsonField<String>,
                private val gitCommitId: JsonField<String>,
                private val gitCommitIdAbbrev: JsonField<String>,
                private val gitCommitIdDescribe: JsonField<String>,
                private val gitCommitIdDescribeShort: JsonField<String>,
                private val gitCommitMessageFull: JsonField<String>,
                private val gitCommitMessageShort: JsonField<String>,
                private val gitCommitTime: JsonField<String>,
                private val gitCommitUserEmail: JsonField<String>,
                private val gitCommitUserName: JsonField<String>,
                private val gitDirty: JsonField<String>,
                private val gitRemoteOriginUrl: JsonField<String>,
                private val gitTags: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("git.branch")
                    @ExcludeMissing
                    gitBranch: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.build.host")
                    @ExcludeMissing
                    gitBuildHost: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.build.time")
                    @ExcludeMissing
                    gitBuildTime: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.build.user.email")
                    @ExcludeMissing
                    gitBuildUserEmail: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.build.user.name")
                    @ExcludeMissing
                    gitBuildUserName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.build.version")
                    @ExcludeMissing
                    gitBuildVersion: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.closest.tag.commit.count")
                    @ExcludeMissing
                    gitClosestTagCommitCount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.closest.tag.name")
                    @ExcludeMissing
                    gitClosestTagName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.id")
                    @ExcludeMissing
                    gitCommitId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.id.abbrev")
                    @ExcludeMissing
                    gitCommitIdAbbrev: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.id.describe")
                    @ExcludeMissing
                    gitCommitIdDescribe: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.id.describe-short")
                    @ExcludeMissing
                    gitCommitIdDescribeShort: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.message.full")
                    @ExcludeMissing
                    gitCommitMessageFull: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.message.short")
                    @ExcludeMissing
                    gitCommitMessageShort: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.time")
                    @ExcludeMissing
                    gitCommitTime: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.user.email")
                    @ExcludeMissing
                    gitCommitUserEmail: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.commit.user.name")
                    @ExcludeMissing
                    gitCommitUserName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.dirty")
                    @ExcludeMissing
                    gitDirty: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.remote.origin.url")
                    @ExcludeMissing
                    gitRemoteOriginUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git.tags")
                    @ExcludeMissing
                    gitTags: JsonField<String> = JsonMissing.of(),
                ) : this(
                    gitBranch,
                    gitBuildHost,
                    gitBuildTime,
                    gitBuildUserEmail,
                    gitBuildUserName,
                    gitBuildVersion,
                    gitClosestTagCommitCount,
                    gitClosestTagName,
                    gitCommitId,
                    gitCommitIdAbbrev,
                    gitCommitIdDescribe,
                    gitCommitIdDescribeShort,
                    gitCommitMessageFull,
                    gitCommitMessageShort,
                    gitCommitTime,
                    gitCommitUserEmail,
                    gitCommitUserName,
                    gitDirty,
                    gitRemoteOriginUrl,
                    gitTags,
                    mutableMapOf(),
                )

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBranch(): Optional<String> = gitBranch.getOptional("git.branch")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBuildHost(): Optional<String> = gitBuildHost.getOptional("git.build.host")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBuildTime(): Optional<String> = gitBuildTime.getOptional("git.build.time")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBuildUserEmail(): Optional<String> =
                    gitBuildUserEmail.getOptional("git.build.user.email")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBuildUserName(): Optional<String> =
                    gitBuildUserName.getOptional("git.build.user.name")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitBuildVersion(): Optional<String> =
                    gitBuildVersion.getOptional("git.build.version")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitClosestTagCommitCount(): Optional<String> =
                    gitClosestTagCommitCount.getOptional("git.closest.tag.commit.count")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitClosestTagName(): Optional<String> =
                    gitClosestTagName.getOptional("git.closest.tag.name")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitId(): Optional<String> = gitCommitId.getOptional("git.commit.id")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitIdAbbrev(): Optional<String> =
                    gitCommitIdAbbrev.getOptional("git.commit.id.abbrev")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitIdDescribe(): Optional<String> =
                    gitCommitIdDescribe.getOptional("git.commit.id.describe")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitIdDescribeShort(): Optional<String> =
                    gitCommitIdDescribeShort.getOptional("git.commit.id.describe-short")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitMessageFull(): Optional<String> =
                    gitCommitMessageFull.getOptional("git.commit.message.full")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitMessageShort(): Optional<String> =
                    gitCommitMessageShort.getOptional("git.commit.message.short")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitTime(): Optional<String> = gitCommitTime.getOptional("git.commit.time")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitUserEmail(): Optional<String> =
                    gitCommitUserEmail.getOptional("git.commit.user.email")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitCommitUserName(): Optional<String> =
                    gitCommitUserName.getOptional("git.commit.user.name")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitDirty(): Optional<String> = gitDirty.getOptional("git.dirty")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitRemoteOriginUrl(): Optional<String> =
                    gitRemoteOriginUrl.getOptional("git.remote.origin.url")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun gitTags(): Optional<String> = gitTags.getOptional("git.tags")

                /**
                 * Returns the raw JSON value of [gitBranch].
                 *
                 * Unlike [gitBranch], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("git.branch")
                @ExcludeMissing
                fun _gitBranch(): JsonField<String> = gitBranch

                /**
                 * Returns the raw JSON value of [gitBuildHost].
                 *
                 * Unlike [gitBuildHost], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.build.host")
                @ExcludeMissing
                fun _gitBuildHost(): JsonField<String> = gitBuildHost

                /**
                 * Returns the raw JSON value of [gitBuildTime].
                 *
                 * Unlike [gitBuildTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.build.time")
                @ExcludeMissing
                fun _gitBuildTime(): JsonField<String> = gitBuildTime

                /**
                 * Returns the raw JSON value of [gitBuildUserEmail].
                 *
                 * Unlike [gitBuildUserEmail], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.build.user.email")
                @ExcludeMissing
                fun _gitBuildUserEmail(): JsonField<String> = gitBuildUserEmail

                /**
                 * Returns the raw JSON value of [gitBuildUserName].
                 *
                 * Unlike [gitBuildUserName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.build.user.name")
                @ExcludeMissing
                fun _gitBuildUserName(): JsonField<String> = gitBuildUserName

                /**
                 * Returns the raw JSON value of [gitBuildVersion].
                 *
                 * Unlike [gitBuildVersion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.build.version")
                @ExcludeMissing
                fun _gitBuildVersion(): JsonField<String> = gitBuildVersion

                /**
                 * Returns the raw JSON value of [gitClosestTagCommitCount].
                 *
                 * Unlike [gitClosestTagCommitCount], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("git.closest.tag.commit.count")
                @ExcludeMissing
                fun _gitClosestTagCommitCount(): JsonField<String> = gitClosestTagCommitCount

                /**
                 * Returns the raw JSON value of [gitClosestTagName].
                 *
                 * Unlike [gitClosestTagName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.closest.tag.name")
                @ExcludeMissing
                fun _gitClosestTagName(): JsonField<String> = gitClosestTagName

                /**
                 * Returns the raw JSON value of [gitCommitId].
                 *
                 * Unlike [gitCommitId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.id")
                @ExcludeMissing
                fun _gitCommitId(): JsonField<String> = gitCommitId

                /**
                 * Returns the raw JSON value of [gitCommitIdAbbrev].
                 *
                 * Unlike [gitCommitIdAbbrev], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.id.abbrev")
                @ExcludeMissing
                fun _gitCommitIdAbbrev(): JsonField<String> = gitCommitIdAbbrev

                /**
                 * Returns the raw JSON value of [gitCommitIdDescribe].
                 *
                 * Unlike [gitCommitIdDescribe], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.id.describe")
                @ExcludeMissing
                fun _gitCommitIdDescribe(): JsonField<String> = gitCommitIdDescribe

                /**
                 * Returns the raw JSON value of [gitCommitIdDescribeShort].
                 *
                 * Unlike [gitCommitIdDescribeShort], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("git.commit.id.describe-short")
                @ExcludeMissing
                fun _gitCommitIdDescribeShort(): JsonField<String> = gitCommitIdDescribeShort

                /**
                 * Returns the raw JSON value of [gitCommitMessageFull].
                 *
                 * Unlike [gitCommitMessageFull], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.message.full")
                @ExcludeMissing
                fun _gitCommitMessageFull(): JsonField<String> = gitCommitMessageFull

                /**
                 * Returns the raw JSON value of [gitCommitMessageShort].
                 *
                 * Unlike [gitCommitMessageShort], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("git.commit.message.short")
                @ExcludeMissing
                fun _gitCommitMessageShort(): JsonField<String> = gitCommitMessageShort

                /**
                 * Returns the raw JSON value of [gitCommitTime].
                 *
                 * Unlike [gitCommitTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.time")
                @ExcludeMissing
                fun _gitCommitTime(): JsonField<String> = gitCommitTime

                /**
                 * Returns the raw JSON value of [gitCommitUserEmail].
                 *
                 * Unlike [gitCommitUserEmail], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.user.email")
                @ExcludeMissing
                fun _gitCommitUserEmail(): JsonField<String> = gitCommitUserEmail

                /**
                 * Returns the raw JSON value of [gitCommitUserName].
                 *
                 * Unlike [gitCommitUserName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.commit.user.name")
                @ExcludeMissing
                fun _gitCommitUserName(): JsonField<String> = gitCommitUserName

                /**
                 * Returns the raw JSON value of [gitDirty].
                 *
                 * Unlike [gitDirty], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("git.dirty")
                @ExcludeMissing
                fun _gitDirty(): JsonField<String> = gitDirty

                /**
                 * Returns the raw JSON value of [gitRemoteOriginUrl].
                 *
                 * Unlike [gitRemoteOriginUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("git.remote.origin.url")
                @ExcludeMissing
                fun _gitRemoteOriginUrl(): JsonField<String> = gitRemoteOriginUrl

                /**
                 * Returns the raw JSON value of [gitTags].
                 *
                 * Unlike [gitTags], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("git.tags")
                @ExcludeMissing
                fun _gitTags(): JsonField<String> = gitTags

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
                     * Returns a mutable builder for constructing an instance of [GitProperties].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GitProperties]. */
                class Builder internal constructor() {

                    private var gitBranch: JsonField<String> = JsonMissing.of()
                    private var gitBuildHost: JsonField<String> = JsonMissing.of()
                    private var gitBuildTime: JsonField<String> = JsonMissing.of()
                    private var gitBuildUserEmail: JsonField<String> = JsonMissing.of()
                    private var gitBuildUserName: JsonField<String> = JsonMissing.of()
                    private var gitBuildVersion: JsonField<String> = JsonMissing.of()
                    private var gitClosestTagCommitCount: JsonField<String> = JsonMissing.of()
                    private var gitClosestTagName: JsonField<String> = JsonMissing.of()
                    private var gitCommitId: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdAbbrev: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdDescribe: JsonField<String> = JsonMissing.of()
                    private var gitCommitIdDescribeShort: JsonField<String> = JsonMissing.of()
                    private var gitCommitMessageFull: JsonField<String> = JsonMissing.of()
                    private var gitCommitMessageShort: JsonField<String> = JsonMissing.of()
                    private var gitCommitTime: JsonField<String> = JsonMissing.of()
                    private var gitCommitUserEmail: JsonField<String> = JsonMissing.of()
                    private var gitCommitUserName: JsonField<String> = JsonMissing.of()
                    private var gitDirty: JsonField<String> = JsonMissing.of()
                    private var gitRemoteOriginUrl: JsonField<String> = JsonMissing.of()
                    private var gitTags: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gitProperties: GitProperties) = apply {
                        gitBranch = gitProperties.gitBranch
                        gitBuildHost = gitProperties.gitBuildHost
                        gitBuildTime = gitProperties.gitBuildTime
                        gitBuildUserEmail = gitProperties.gitBuildUserEmail
                        gitBuildUserName = gitProperties.gitBuildUserName
                        gitBuildVersion = gitProperties.gitBuildVersion
                        gitClosestTagCommitCount = gitProperties.gitClosestTagCommitCount
                        gitClosestTagName = gitProperties.gitClosestTagName
                        gitCommitId = gitProperties.gitCommitId
                        gitCommitIdAbbrev = gitProperties.gitCommitIdAbbrev
                        gitCommitIdDescribe = gitProperties.gitCommitIdDescribe
                        gitCommitIdDescribeShort = gitProperties.gitCommitIdDescribeShort
                        gitCommitMessageFull = gitProperties.gitCommitMessageFull
                        gitCommitMessageShort = gitProperties.gitCommitMessageShort
                        gitCommitTime = gitProperties.gitCommitTime
                        gitCommitUserEmail = gitProperties.gitCommitUserEmail
                        gitCommitUserName = gitProperties.gitCommitUserName
                        gitDirty = gitProperties.gitDirty
                        gitRemoteOriginUrl = gitProperties.gitRemoteOriginUrl
                        gitTags = gitProperties.gitTags
                        additionalProperties = gitProperties.additionalProperties.toMutableMap()
                    }

                    fun gitBranch(gitBranch: String) = gitBranch(JsonField.of(gitBranch))

                    /**
                     * Sets [Builder.gitBranch] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBranch] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun gitBranch(gitBranch: JsonField<String>) = apply {
                        this.gitBranch = gitBranch
                    }

                    fun gitBuildHost(gitBuildHost: String) =
                        gitBuildHost(JsonField.of(gitBuildHost))

                    /**
                     * Sets [Builder.gitBuildHost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBuildHost] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitBuildHost(gitBuildHost: JsonField<String>) = apply {
                        this.gitBuildHost = gitBuildHost
                    }

                    fun gitBuildTime(gitBuildTime: String) =
                        gitBuildTime(JsonField.of(gitBuildTime))

                    /**
                     * Sets [Builder.gitBuildTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBuildTime] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitBuildTime(gitBuildTime: JsonField<String>) = apply {
                        this.gitBuildTime = gitBuildTime
                    }

                    fun gitBuildUserEmail(gitBuildUserEmail: String) =
                        gitBuildUserEmail(JsonField.of(gitBuildUserEmail))

                    /**
                     * Sets [Builder.gitBuildUserEmail] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBuildUserEmail] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitBuildUserEmail(gitBuildUserEmail: JsonField<String>) = apply {
                        this.gitBuildUserEmail = gitBuildUserEmail
                    }

                    fun gitBuildUserName(gitBuildUserName: String) =
                        gitBuildUserName(JsonField.of(gitBuildUserName))

                    /**
                     * Sets [Builder.gitBuildUserName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBuildUserName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitBuildUserName(gitBuildUserName: JsonField<String>) = apply {
                        this.gitBuildUserName = gitBuildUserName
                    }

                    fun gitBuildVersion(gitBuildVersion: String) =
                        gitBuildVersion(JsonField.of(gitBuildVersion))

                    /**
                     * Sets [Builder.gitBuildVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitBuildVersion] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitBuildVersion(gitBuildVersion: JsonField<String>) = apply {
                        this.gitBuildVersion = gitBuildVersion
                    }

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: String) =
                        gitClosestTagCommitCount(JsonField.of(gitClosestTagCommitCount))

                    /**
                     * Sets [Builder.gitClosestTagCommitCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitClosestTagCommitCount] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: JsonField<String>) =
                        apply {
                            this.gitClosestTagCommitCount = gitClosestTagCommitCount
                        }

                    fun gitClosestTagName(gitClosestTagName: String) =
                        gitClosestTagName(JsonField.of(gitClosestTagName))

                    /**
                     * Sets [Builder.gitClosestTagName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitClosestTagName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitClosestTagName(gitClosestTagName: JsonField<String>) = apply {
                        this.gitClosestTagName = gitClosestTagName
                    }

                    fun gitCommitId(gitCommitId: String) = gitCommitId(JsonField.of(gitCommitId))

                    /**
                     * Sets [Builder.gitCommitId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitId(gitCommitId: JsonField<String>) = apply {
                        this.gitCommitId = gitCommitId
                    }

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: String) =
                        gitCommitIdAbbrev(JsonField.of(gitCommitIdAbbrev))

                    /**
                     * Sets [Builder.gitCommitIdAbbrev] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitIdAbbrev] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: JsonField<String>) = apply {
                        this.gitCommitIdAbbrev = gitCommitIdAbbrev
                    }

                    fun gitCommitIdDescribe(gitCommitIdDescribe: String) =
                        gitCommitIdDescribe(JsonField.of(gitCommitIdDescribe))

                    /**
                     * Sets [Builder.gitCommitIdDescribe] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitIdDescribe] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitIdDescribe(gitCommitIdDescribe: JsonField<String>) = apply {
                        this.gitCommitIdDescribe = gitCommitIdDescribe
                    }

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: String) =
                        gitCommitIdDescribeShort(JsonField.of(gitCommitIdDescribeShort))

                    /**
                     * Sets [Builder.gitCommitIdDescribeShort] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitIdDescribeShort] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: JsonField<String>) =
                        apply {
                            this.gitCommitIdDescribeShort = gitCommitIdDescribeShort
                        }

                    fun gitCommitMessageFull(gitCommitMessageFull: String) =
                        gitCommitMessageFull(JsonField.of(gitCommitMessageFull))

                    /**
                     * Sets [Builder.gitCommitMessageFull] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitMessageFull] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitMessageFull(gitCommitMessageFull: JsonField<String>) = apply {
                        this.gitCommitMessageFull = gitCommitMessageFull
                    }

                    fun gitCommitMessageShort(gitCommitMessageShort: String) =
                        gitCommitMessageShort(JsonField.of(gitCommitMessageShort))

                    /**
                     * Sets [Builder.gitCommitMessageShort] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitMessageShort] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitMessageShort(gitCommitMessageShort: JsonField<String>) = apply {
                        this.gitCommitMessageShort = gitCommitMessageShort
                    }

                    fun gitCommitTime(gitCommitTime: String) =
                        gitCommitTime(JsonField.of(gitCommitTime))

                    /**
                     * Sets [Builder.gitCommitTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitTime] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitTime(gitCommitTime: JsonField<String>) = apply {
                        this.gitCommitTime = gitCommitTime
                    }

                    fun gitCommitUserEmail(gitCommitUserEmail: String) =
                        gitCommitUserEmail(JsonField.of(gitCommitUserEmail))

                    /**
                     * Sets [Builder.gitCommitUserEmail] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitUserEmail] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitUserEmail(gitCommitUserEmail: JsonField<String>) = apply {
                        this.gitCommitUserEmail = gitCommitUserEmail
                    }

                    fun gitCommitUserName(gitCommitUserName: String) =
                        gitCommitUserName(JsonField.of(gitCommitUserName))

                    /**
                     * Sets [Builder.gitCommitUserName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitCommitUserName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitCommitUserName(gitCommitUserName: JsonField<String>) = apply {
                        this.gitCommitUserName = gitCommitUserName
                    }

                    fun gitDirty(gitDirty: String) = gitDirty(JsonField.of(gitDirty))

                    /**
                     * Sets [Builder.gitDirty] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitDirty] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun gitDirty(gitDirty: JsonField<String>) = apply { this.gitDirty = gitDirty }

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: String) =
                        gitRemoteOriginUrl(JsonField.of(gitRemoteOriginUrl))

                    /**
                     * Sets [Builder.gitRemoteOriginUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitRemoteOriginUrl] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: JsonField<String>) = apply {
                        this.gitRemoteOriginUrl = gitRemoteOriginUrl
                    }

                    fun gitTags(gitTags: String) = gitTags(JsonField.of(gitTags))

                    /**
                     * Sets [Builder.gitTags] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gitTags] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun gitTags(gitTags: JsonField<String>) = apply { this.gitTags = gitTags }

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
                     * Returns an immutable instance of [GitProperties].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): GitProperties =
                        GitProperties(
                            gitBranch,
                            gitBuildHost,
                            gitBuildTime,
                            gitBuildUserEmail,
                            gitBuildUserName,
                            gitBuildVersion,
                            gitClosestTagCommitCount,
                            gitClosestTagName,
                            gitCommitId,
                            gitCommitIdAbbrev,
                            gitCommitIdDescribe,
                            gitCommitIdDescribeShort,
                            gitCommitMessageFull,
                            gitCommitMessageShort,
                            gitCommitTime,
                            gitCommitUserEmail,
                            gitCommitUserName,
                            gitDirty,
                            gitRemoteOriginUrl,
                            gitTags,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GitProperties = apply {
                    if (validated) {
                        return@apply
                    }

                    gitBranch()
                    gitBuildHost()
                    gitBuildTime()
                    gitBuildUserEmail()
                    gitBuildUserName()
                    gitBuildVersion()
                    gitClosestTagCommitCount()
                    gitClosestTagName()
                    gitCommitId()
                    gitCommitIdAbbrev()
                    gitCommitIdDescribe()
                    gitCommitIdDescribeShort()
                    gitCommitMessageFull()
                    gitCommitMessageShort()
                    gitCommitTime()
                    gitCommitUserEmail()
                    gitCommitUserName()
                    gitDirty()
                    gitRemoteOriginUrl()
                    gitTags()
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
                    (if (gitBranch.asKnown().isPresent) 1 else 0) +
                        (if (gitBuildHost.asKnown().isPresent) 1 else 0) +
                        (if (gitBuildTime.asKnown().isPresent) 1 else 0) +
                        (if (gitBuildUserEmail.asKnown().isPresent) 1 else 0) +
                        (if (gitBuildUserName.asKnown().isPresent) 1 else 0) +
                        (if (gitBuildVersion.asKnown().isPresent) 1 else 0) +
                        (if (gitClosestTagCommitCount.asKnown().isPresent) 1 else 0) +
                        (if (gitClosestTagName.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitId.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitIdAbbrev.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitIdDescribe.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitIdDescribeShort.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitMessageFull.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitMessageShort.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitTime.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitUserEmail.asKnown().isPresent) 1 else 0) +
                        (if (gitCommitUserName.asKnown().isPresent) 1 else 0) +
                        (if (gitDirty.asKnown().isPresent) 1 else 0) +
                        (if (gitRemoteOriginUrl.asKnown().isPresent) 1 else 0) +
                        (if (gitTags.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GitProperties &&
                        gitBranch == other.gitBranch &&
                        gitBuildHost == other.gitBuildHost &&
                        gitBuildTime == other.gitBuildTime &&
                        gitBuildUserEmail == other.gitBuildUserEmail &&
                        gitBuildUserName == other.gitBuildUserName &&
                        gitBuildVersion == other.gitBuildVersion &&
                        gitClosestTagCommitCount == other.gitClosestTagCommitCount &&
                        gitClosestTagName == other.gitClosestTagName &&
                        gitCommitId == other.gitCommitId &&
                        gitCommitIdAbbrev == other.gitCommitIdAbbrev &&
                        gitCommitIdDescribe == other.gitCommitIdDescribe &&
                        gitCommitIdDescribeShort == other.gitCommitIdDescribeShort &&
                        gitCommitMessageFull == other.gitCommitMessageFull &&
                        gitCommitMessageShort == other.gitCommitMessageShort &&
                        gitCommitTime == other.gitCommitTime &&
                        gitCommitUserEmail == other.gitCommitUserEmail &&
                        gitCommitUserName == other.gitCommitUserName &&
                        gitDirty == other.gitDirty &&
                        gitRemoteOriginUrl == other.gitRemoteOriginUrl &&
                        gitTags == other.gitTags &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        gitBranch,
                        gitBuildHost,
                        gitBuildTime,
                        gitBuildUserEmail,
                        gitBuildUserName,
                        gitBuildVersion,
                        gitClosestTagCommitCount,
                        gitClosestTagName,
                        gitCommitId,
                        gitCommitIdAbbrev,
                        gitCommitIdDescribe,
                        gitCommitIdDescribeShort,
                        gitCommitMessageFull,
                        gitCommitMessageShort,
                        gitCommitTime,
                        gitCommitUserEmail,
                        gitCommitUserName,
                        gitDirty,
                        gitRemoteOriginUrl,
                        gitTags,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GitProperties{gitBranch=$gitBranch, gitBuildHost=$gitBuildHost, gitBuildTime=$gitBuildTime, gitBuildUserEmail=$gitBuildUserEmail, gitBuildUserName=$gitBuildUserName, gitBuildVersion=$gitBuildVersion, gitClosestTagCommitCount=$gitClosestTagCommitCount, gitClosestTagName=$gitClosestTagName, gitCommitId=$gitCommitId, gitCommitIdAbbrev=$gitCommitIdAbbrev, gitCommitIdDescribe=$gitCommitIdDescribe, gitCommitIdDescribeShort=$gitCommitIdDescribeShort, gitCommitMessageFull=$gitCommitMessageFull, gitCommitMessageShort=$gitCommitMessageShort, gitCommitTime=$gitCommitTime, gitCommitUserEmail=$gitCommitUserEmail, gitCommitUserName=$gitCommitUserName, gitDirty=$gitDirty, gitRemoteOriginUrl=$gitRemoteOriginUrl, gitTags=$gitTags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    id == other.id &&
                    gitProperties == other.gitProperties &&
                    name == other.name &&
                    serviceDateFrom == other.serviceDateFrom &&
                    serviceDateTo == other.serviceDateTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    gitProperties,
                    name,
                    serviceDateFrom,
                    serviceDateTo,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, gitProperties=$gitProperties, name=$name, serviceDateFrom=$serviceDateFrom, serviceDateTo=$serviceDateTo, additionalProperties=$additionalProperties}"
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

        return other is ConfigRetrieveResponse &&
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
        "ConfigRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
