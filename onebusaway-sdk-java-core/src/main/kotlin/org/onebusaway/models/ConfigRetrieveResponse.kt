// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class ConfigRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("currentTime")
    @ExcludeMissing
    private val currentTime: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("text") @ExcludeMissing private val text: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    private var validated: Boolean = false

    fun validate(): ConfigRetrieveResponse = apply {
        if (!validated) {
            code()
            currentTime()
            text()
            version()
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var code: JsonField<Long> = JsonMissing.of()
        private var currentTime: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
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

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

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

        fun build(): ConfigRetrieveResponse =
            ConfigRetrieveResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("entry")
        @ExcludeMissing
        private val entry: JsonField<Entry> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        private val references: JsonField<References> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                entry = data.entry
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

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

            fun build(): Data =
                Data(
                    entry,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("gitProperties")
            @ExcludeMissing
            private val gitProperties: JsonField<GitProperties> = JsonMissing.of(),
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceDateFrom")
            @ExcludeMissing
            private val serviceDateFrom: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceDateTo")
            @ExcludeMissing
            private val serviceDateTo: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun gitProperties(): Optional<GitProperties> =
                Optional.ofNullable(gitProperties.getNullable("gitProperties"))

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun serviceDateFrom(): Optional<String> =
                Optional.ofNullable(serviceDateFrom.getNullable("serviceDateFrom"))

            fun serviceDateTo(): Optional<String> =
                Optional.ofNullable(serviceDateTo.getNullable("serviceDateTo"))

            @JsonProperty("gitProperties") @ExcludeMissing fun _gitProperties() = gitProperties

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("serviceDateFrom")
            @ExcludeMissing
            fun _serviceDateFrom() = serviceDateFrom

            @JsonProperty("serviceDateTo") @ExcludeMissing fun _serviceDateTo() = serviceDateTo

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (!validated) {
                    gitProperties().map { it.validate() }
                    id()
                    name()
                    serviceDateFrom()
                    serviceDateTo()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var gitProperties: JsonField<GitProperties> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var serviceDateFrom: JsonField<String> = JsonMissing.of()
                private var serviceDateTo: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    gitProperties = entry.gitProperties
                    id = entry.id
                    name = entry.name
                    serviceDateFrom = entry.serviceDateFrom
                    serviceDateTo = entry.serviceDateTo
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun gitProperties(gitProperties: GitProperties) =
                    gitProperties(JsonField.of(gitProperties))

                fun gitProperties(gitProperties: JsonField<GitProperties>) = apply {
                    this.gitProperties = gitProperties
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun serviceDateFrom(serviceDateFrom: String) =
                    serviceDateFrom(JsonField.of(serviceDateFrom))

                fun serviceDateFrom(serviceDateFrom: JsonField<String>) = apply {
                    this.serviceDateFrom = serviceDateFrom
                }

                fun serviceDateTo(serviceDateTo: String) =
                    serviceDateTo(JsonField.of(serviceDateTo))

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

                fun build(): Entry =
                    Entry(
                        gitProperties,
                        id,
                        name,
                        serviceDateFrom,
                        serviceDateTo,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class GitProperties
            @JsonCreator
            private constructor(
                @JsonProperty("git.branch")
                @ExcludeMissing
                private val gitBranch: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.host")
                @ExcludeMissing
                private val gitBuildHost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.time")
                @ExcludeMissing
                private val gitBuildTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.user.email")
                @ExcludeMissing
                private val gitBuildUserEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.user.name")
                @ExcludeMissing
                private val gitBuildUserName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.build.version")
                @ExcludeMissing
                private val gitBuildVersion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.closest.tag.commit.count")
                @ExcludeMissing
                private val gitClosestTagCommitCount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.closest.tag.name")
                @ExcludeMissing
                private val gitClosestTagName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id")
                @ExcludeMissing
                private val gitCommitId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.abbrev")
                @ExcludeMissing
                private val gitCommitIdAbbrev: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.describe")
                @ExcludeMissing
                private val gitCommitIdDescribe: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.id.describe-short")
                @ExcludeMissing
                private val gitCommitIdDescribeShort: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.message.full")
                @ExcludeMissing
                private val gitCommitMessageFull: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.message.short")
                @ExcludeMissing
                private val gitCommitMessageShort: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.time")
                @ExcludeMissing
                private val gitCommitTime: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.user.email")
                @ExcludeMissing
                private val gitCommitUserEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.commit.user.name")
                @ExcludeMissing
                private val gitCommitUserName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.dirty")
                @ExcludeMissing
                private val gitDirty: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.remote.origin.url")
                @ExcludeMissing
                private val gitRemoteOriginUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git.tags")
                @ExcludeMissing
                private val gitTags: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun gitBranch(): Optional<String> =
                    Optional.ofNullable(gitBranch.getNullable("git.branch"))

                fun gitBuildHost(): Optional<String> =
                    Optional.ofNullable(gitBuildHost.getNullable("git.build.host"))

                fun gitBuildTime(): Optional<String> =
                    Optional.ofNullable(gitBuildTime.getNullable("git.build.time"))

                fun gitBuildUserEmail(): Optional<String> =
                    Optional.ofNullable(gitBuildUserEmail.getNullable("git.build.user.email"))

                fun gitBuildUserName(): Optional<String> =
                    Optional.ofNullable(gitBuildUserName.getNullable("git.build.user.name"))

                fun gitBuildVersion(): Optional<String> =
                    Optional.ofNullable(gitBuildVersion.getNullable("git.build.version"))

                fun gitClosestTagCommitCount(): Optional<String> =
                    Optional.ofNullable(
                        gitClosestTagCommitCount.getNullable("git.closest.tag.commit.count")
                    )

                fun gitClosestTagName(): Optional<String> =
                    Optional.ofNullable(gitClosestTagName.getNullable("git.closest.tag.name"))

                fun gitCommitId(): Optional<String> =
                    Optional.ofNullable(gitCommitId.getNullable("git.commit.id"))

                fun gitCommitIdAbbrev(): Optional<String> =
                    Optional.ofNullable(gitCommitIdAbbrev.getNullable("git.commit.id.abbrev"))

                fun gitCommitIdDescribe(): Optional<String> =
                    Optional.ofNullable(gitCommitIdDescribe.getNullable("git.commit.id.describe"))

                fun gitCommitIdDescribeShort(): Optional<String> =
                    Optional.ofNullable(
                        gitCommitIdDescribeShort.getNullable("git.commit.id.describe-short")
                    )

                fun gitCommitMessageFull(): Optional<String> =
                    Optional.ofNullable(gitCommitMessageFull.getNullable("git.commit.message.full"))

                fun gitCommitMessageShort(): Optional<String> =
                    Optional.ofNullable(
                        gitCommitMessageShort.getNullable("git.commit.message.short")
                    )

                fun gitCommitTime(): Optional<String> =
                    Optional.ofNullable(gitCommitTime.getNullable("git.commit.time"))

                fun gitCommitUserEmail(): Optional<String> =
                    Optional.ofNullable(gitCommitUserEmail.getNullable("git.commit.user.email"))

                fun gitCommitUserName(): Optional<String> =
                    Optional.ofNullable(gitCommitUserName.getNullable("git.commit.user.name"))

                fun gitDirty(): Optional<String> =
                    Optional.ofNullable(gitDirty.getNullable("git.dirty"))

                fun gitRemoteOriginUrl(): Optional<String> =
                    Optional.ofNullable(gitRemoteOriginUrl.getNullable("git.remote.origin.url"))

                fun gitTags(): Optional<String> =
                    Optional.ofNullable(gitTags.getNullable("git.tags"))

                @JsonProperty("git.branch") @ExcludeMissing fun _gitBranch() = gitBranch

                @JsonProperty("git.build.host") @ExcludeMissing fun _gitBuildHost() = gitBuildHost

                @JsonProperty("git.build.time") @ExcludeMissing fun _gitBuildTime() = gitBuildTime

                @JsonProperty("git.build.user.email")
                @ExcludeMissing
                fun _gitBuildUserEmail() = gitBuildUserEmail

                @JsonProperty("git.build.user.name")
                @ExcludeMissing
                fun _gitBuildUserName() = gitBuildUserName

                @JsonProperty("git.build.version")
                @ExcludeMissing
                fun _gitBuildVersion() = gitBuildVersion

                @JsonProperty("git.closest.tag.commit.count")
                @ExcludeMissing
                fun _gitClosestTagCommitCount() = gitClosestTagCommitCount

                @JsonProperty("git.closest.tag.name")
                @ExcludeMissing
                fun _gitClosestTagName() = gitClosestTagName

                @JsonProperty("git.commit.id") @ExcludeMissing fun _gitCommitId() = gitCommitId

                @JsonProperty("git.commit.id.abbrev")
                @ExcludeMissing
                fun _gitCommitIdAbbrev() = gitCommitIdAbbrev

                @JsonProperty("git.commit.id.describe")
                @ExcludeMissing
                fun _gitCommitIdDescribe() = gitCommitIdDescribe

                @JsonProperty("git.commit.id.describe-short")
                @ExcludeMissing
                fun _gitCommitIdDescribeShort() = gitCommitIdDescribeShort

                @JsonProperty("git.commit.message.full")
                @ExcludeMissing
                fun _gitCommitMessageFull() = gitCommitMessageFull

                @JsonProperty("git.commit.message.short")
                @ExcludeMissing
                fun _gitCommitMessageShort() = gitCommitMessageShort

                @JsonProperty("git.commit.time")
                @ExcludeMissing
                fun _gitCommitTime() = gitCommitTime

                @JsonProperty("git.commit.user.email")
                @ExcludeMissing
                fun _gitCommitUserEmail() = gitCommitUserEmail

                @JsonProperty("git.commit.user.name")
                @ExcludeMissing
                fun _gitCommitUserName() = gitCommitUserName

                @JsonProperty("git.dirty") @ExcludeMissing fun _gitDirty() = gitDirty

                @JsonProperty("git.remote.origin.url")
                @ExcludeMissing
                fun _gitRemoteOriginUrl() = gitRemoteOriginUrl

                @JsonProperty("git.tags") @ExcludeMissing fun _gitTags() = gitTags

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): GitProperties = apply {
                    if (!validated) {
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
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

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

                    fun gitBranch(gitBranch: JsonField<String>) = apply {
                        this.gitBranch = gitBranch
                    }

                    fun gitBuildHost(gitBuildHost: String) =
                        gitBuildHost(JsonField.of(gitBuildHost))

                    fun gitBuildHost(gitBuildHost: JsonField<String>) = apply {
                        this.gitBuildHost = gitBuildHost
                    }

                    fun gitBuildTime(gitBuildTime: String) =
                        gitBuildTime(JsonField.of(gitBuildTime))

                    fun gitBuildTime(gitBuildTime: JsonField<String>) = apply {
                        this.gitBuildTime = gitBuildTime
                    }

                    fun gitBuildUserEmail(gitBuildUserEmail: String) =
                        gitBuildUserEmail(JsonField.of(gitBuildUserEmail))

                    fun gitBuildUserEmail(gitBuildUserEmail: JsonField<String>) = apply {
                        this.gitBuildUserEmail = gitBuildUserEmail
                    }

                    fun gitBuildUserName(gitBuildUserName: String) =
                        gitBuildUserName(JsonField.of(gitBuildUserName))

                    fun gitBuildUserName(gitBuildUserName: JsonField<String>) = apply {
                        this.gitBuildUserName = gitBuildUserName
                    }

                    fun gitBuildVersion(gitBuildVersion: String) =
                        gitBuildVersion(JsonField.of(gitBuildVersion))

                    fun gitBuildVersion(gitBuildVersion: JsonField<String>) = apply {
                        this.gitBuildVersion = gitBuildVersion
                    }

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: String) =
                        gitClosestTagCommitCount(JsonField.of(gitClosestTagCommitCount))

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: JsonField<String>) =
                        apply {
                            this.gitClosestTagCommitCount = gitClosestTagCommitCount
                        }

                    fun gitClosestTagName(gitClosestTagName: String) =
                        gitClosestTagName(JsonField.of(gitClosestTagName))

                    fun gitClosestTagName(gitClosestTagName: JsonField<String>) = apply {
                        this.gitClosestTagName = gitClosestTagName
                    }

                    fun gitCommitId(gitCommitId: String) = gitCommitId(JsonField.of(gitCommitId))

                    fun gitCommitId(gitCommitId: JsonField<String>) = apply {
                        this.gitCommitId = gitCommitId
                    }

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: String) =
                        gitCommitIdAbbrev(JsonField.of(gitCommitIdAbbrev))

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: JsonField<String>) = apply {
                        this.gitCommitIdAbbrev = gitCommitIdAbbrev
                    }

                    fun gitCommitIdDescribe(gitCommitIdDescribe: String) =
                        gitCommitIdDescribe(JsonField.of(gitCommitIdDescribe))

                    fun gitCommitIdDescribe(gitCommitIdDescribe: JsonField<String>) = apply {
                        this.gitCommitIdDescribe = gitCommitIdDescribe
                    }

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: String) =
                        gitCommitIdDescribeShort(JsonField.of(gitCommitIdDescribeShort))

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: JsonField<String>) =
                        apply {
                            this.gitCommitIdDescribeShort = gitCommitIdDescribeShort
                        }

                    fun gitCommitMessageFull(gitCommitMessageFull: String) =
                        gitCommitMessageFull(JsonField.of(gitCommitMessageFull))

                    fun gitCommitMessageFull(gitCommitMessageFull: JsonField<String>) = apply {
                        this.gitCommitMessageFull = gitCommitMessageFull
                    }

                    fun gitCommitMessageShort(gitCommitMessageShort: String) =
                        gitCommitMessageShort(JsonField.of(gitCommitMessageShort))

                    fun gitCommitMessageShort(gitCommitMessageShort: JsonField<String>) = apply {
                        this.gitCommitMessageShort = gitCommitMessageShort
                    }

                    fun gitCommitTime(gitCommitTime: String) =
                        gitCommitTime(JsonField.of(gitCommitTime))

                    fun gitCommitTime(gitCommitTime: JsonField<String>) = apply {
                        this.gitCommitTime = gitCommitTime
                    }

                    fun gitCommitUserEmail(gitCommitUserEmail: String) =
                        gitCommitUserEmail(JsonField.of(gitCommitUserEmail))

                    fun gitCommitUserEmail(gitCommitUserEmail: JsonField<String>) = apply {
                        this.gitCommitUserEmail = gitCommitUserEmail
                    }

                    fun gitCommitUserName(gitCommitUserName: String) =
                        gitCommitUserName(JsonField.of(gitCommitUserName))

                    fun gitCommitUserName(gitCommitUserName: JsonField<String>) = apply {
                        this.gitCommitUserName = gitCommitUserName
                    }

                    fun gitDirty(gitDirty: String) = gitDirty(JsonField.of(gitDirty))

                    fun gitDirty(gitDirty: JsonField<String>) = apply { this.gitDirty = gitDirty }

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: String) =
                        gitRemoteOriginUrl(JsonField.of(gitRemoteOriginUrl))

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: JsonField<String>) = apply {
                        this.gitRemoteOriginUrl = gitRemoteOriginUrl
                    }

                    fun gitTags(gitTags: String) = gitTags(JsonField.of(gitTags))

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
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GitProperties && gitBranch == other.gitBranch && gitBuildHost == other.gitBuildHost && gitBuildTime == other.gitBuildTime && gitBuildUserEmail == other.gitBuildUserEmail && gitBuildUserName == other.gitBuildUserName && gitBuildVersion == other.gitBuildVersion && gitClosestTagCommitCount == other.gitClosestTagCommitCount && gitClosestTagName == other.gitClosestTagName && gitCommitId == other.gitCommitId && gitCommitIdAbbrev == other.gitCommitIdAbbrev && gitCommitIdDescribe == other.gitCommitIdDescribe && gitCommitIdDescribeShort == other.gitCommitIdDescribeShort && gitCommitMessageFull == other.gitCommitMessageFull && gitCommitMessageShort == other.gitCommitMessageShort && gitCommitTime == other.gitCommitTime && gitCommitUserEmail == other.gitCommitUserEmail && gitCommitUserName == other.gitCommitUserName && gitDirty == other.gitDirty && gitRemoteOriginUrl == other.gitRemoteOriginUrl && gitTags == other.gitTags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(gitBranch, gitBuildHost, gitBuildTime, gitBuildUserEmail, gitBuildUserName, gitBuildVersion, gitClosestTagCommitCount, gitClosestTagName, gitCommitId, gitCommitIdAbbrev, gitCommitIdDescribe, gitCommitIdDescribeShort, gitCommitMessageFull, gitCommitMessageShort, gitCommitTime, gitCommitUserEmail, gitCommitUserName, gitDirty, gitRemoteOriginUrl, gitTags, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GitProperties{gitBranch=$gitBranch, gitBuildHost=$gitBuildHost, gitBuildTime=$gitBuildTime, gitBuildUserEmail=$gitBuildUserEmail, gitBuildUserName=$gitBuildUserName, gitBuildVersion=$gitBuildVersion, gitClosestTagCommitCount=$gitClosestTagCommitCount, gitClosestTagName=$gitClosestTagName, gitCommitId=$gitCommitId, gitCommitIdAbbrev=$gitCommitIdAbbrev, gitCommitIdDescribe=$gitCommitIdDescribe, gitCommitIdDescribeShort=$gitCommitIdDescribeShort, gitCommitMessageFull=$gitCommitMessageFull, gitCommitMessageShort=$gitCommitMessageShort, gitCommitTime=$gitCommitTime, gitCommitUserEmail=$gitCommitUserEmail, gitCommitUserName=$gitCommitUserName, gitDirty=$gitDirty, gitRemoteOriginUrl=$gitRemoteOriginUrl, gitTags=$gitTags, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && gitProperties == other.gitProperties && id == other.id && name == other.name && serviceDateFrom == other.serviceDateFrom && serviceDateTo == other.serviceDateTo && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(gitProperties, id, name, serviceDateFrom, serviceDateTo, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{gitProperties=$gitProperties, id=$id, name=$name, serviceDateFrom=$serviceDateFrom, serviceDateTo=$serviceDateTo, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ConfigRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
