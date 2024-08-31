// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.open_transit.api.core.ExcludeMissing
import com.open_transit.api.core.JsonField
import com.open_transit.api.core.JsonMissing
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.NoAutoDetect
import com.open_transit.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ConfigRetrieveResponse.Builder::class)
@NoAutoDetect
class ConfigRetrieveResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    fun toResponseWrapper(): ResponseWrapper =
        ResponseWrapper.builder()
            .code(code)
            .currentTime(currentTime)
            .text(text)
            .version(version)
            .build()

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigRetrieveResponse &&
            this.code == other.code &&
            this.currentTime == other.currentTime &&
            this.text == other.text &&
            this.version == other.version &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    code,
                    currentTime,
                    text,
                    version,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ConfigRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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
            this.code = configRetrieveResponse.code
            this.currentTime = configRetrieveResponse.currentTime
            this.text = configRetrieveResponse.text
            this.version = configRetrieveResponse.version
            this.data = configRetrieveResponse.data
            additionalProperties(configRetrieveResponse.additionalProperties)
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        @JsonProperty("currentTime")
        @ExcludeMissing
        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ConfigRetrieveResponse =
            ConfigRetrieveResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val entry: JsonField<Entry>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.entry == other.entry &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        entry,
                        references,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.entry = data.entry
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            @JsonProperty("entry")
            @ExcludeMissing
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

            fun references(references: References) = references(JsonField.of(references))

            @JsonProperty("references")
            @ExcludeMissing
            fun references(references: JsonField<References>) = apply {
                this.references = references
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Data =
                Data(
                    entry,
                    references,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val gitProperties: JsonField<GitProperties>,
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val serviceDateFrom: JsonField<String>,
            private val serviceDateTo: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    this.gitProperties == other.gitProperties &&
                    this.id == other.id &&
                    this.name == other.name &&
                    this.serviceDateFrom == other.serviceDateFrom &&
                    this.serviceDateTo == other.serviceDateTo &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            gitProperties,
                            id,
                            name,
                            serviceDateFrom,
                            serviceDateTo,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Entry{gitProperties=$gitProperties, id=$id, name=$name, serviceDateFrom=$serviceDateFrom, serviceDateTo=$serviceDateTo, additionalProperties=$additionalProperties}"

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
                    this.gitProperties = entry.gitProperties
                    this.id = entry.id
                    this.name = entry.name
                    this.serviceDateFrom = entry.serviceDateFrom
                    this.serviceDateTo = entry.serviceDateTo
                    additionalProperties(entry.additionalProperties)
                }

                fun gitProperties(gitProperties: GitProperties) =
                    gitProperties(JsonField.of(gitProperties))

                @JsonProperty("gitProperties")
                @ExcludeMissing
                fun gitProperties(gitProperties: JsonField<GitProperties>) = apply {
                    this.gitProperties = gitProperties
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun serviceDateFrom(serviceDateFrom: String) =
                    serviceDateFrom(JsonField.of(serviceDateFrom))

                @JsonProperty("serviceDateFrom")
                @ExcludeMissing
                fun serviceDateFrom(serviceDateFrom: JsonField<String>) = apply {
                    this.serviceDateFrom = serviceDateFrom
                }

                fun serviceDateTo(serviceDateTo: String) =
                    serviceDateTo(JsonField.of(serviceDateTo))

                @JsonProperty("serviceDateTo")
                @ExcludeMissing
                fun serviceDateTo(serviceDateTo: JsonField<String>) = apply {
                    this.serviceDateTo = serviceDateTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Entry =
                    Entry(
                        gitProperties,
                        id,
                        name,
                        serviceDateFrom,
                        serviceDateTo,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = GitProperties.Builder::class)
            @NoAutoDetect
            class GitProperties
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
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GitProperties &&
                        this.gitBranch == other.gitBranch &&
                        this.gitBuildHost == other.gitBuildHost &&
                        this.gitBuildTime == other.gitBuildTime &&
                        this.gitBuildUserEmail == other.gitBuildUserEmail &&
                        this.gitBuildUserName == other.gitBuildUserName &&
                        this.gitBuildVersion == other.gitBuildVersion &&
                        this.gitClosestTagCommitCount == other.gitClosestTagCommitCount &&
                        this.gitClosestTagName == other.gitClosestTagName &&
                        this.gitCommitId == other.gitCommitId &&
                        this.gitCommitIdAbbrev == other.gitCommitIdAbbrev &&
                        this.gitCommitIdDescribe == other.gitCommitIdDescribe &&
                        this.gitCommitIdDescribeShort == other.gitCommitIdDescribeShort &&
                        this.gitCommitMessageFull == other.gitCommitMessageFull &&
                        this.gitCommitMessageShort == other.gitCommitMessageShort &&
                        this.gitCommitTime == other.gitCommitTime &&
                        this.gitCommitUserEmail == other.gitCommitUserEmail &&
                        this.gitCommitUserName == other.gitCommitUserName &&
                        this.gitDirty == other.gitDirty &&
                        this.gitRemoteOriginUrl == other.gitRemoteOriginUrl &&
                        this.gitTags == other.gitTags &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
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
                    return hashCode
                }

                override fun toString() =
                    "GitProperties{gitBranch=$gitBranch, gitBuildHost=$gitBuildHost, gitBuildTime=$gitBuildTime, gitBuildUserEmail=$gitBuildUserEmail, gitBuildUserName=$gitBuildUserName, gitBuildVersion=$gitBuildVersion, gitClosestTagCommitCount=$gitClosestTagCommitCount, gitClosestTagName=$gitClosestTagName, gitCommitId=$gitCommitId, gitCommitIdAbbrev=$gitCommitIdAbbrev, gitCommitIdDescribe=$gitCommitIdDescribe, gitCommitIdDescribeShort=$gitCommitIdDescribeShort, gitCommitMessageFull=$gitCommitMessageFull, gitCommitMessageShort=$gitCommitMessageShort, gitCommitTime=$gitCommitTime, gitCommitUserEmail=$gitCommitUserEmail, gitCommitUserName=$gitCommitUserName, gitDirty=$gitDirty, gitRemoteOriginUrl=$gitRemoteOriginUrl, gitTags=$gitTags, additionalProperties=$additionalProperties}"

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
                        this.gitBranch = gitProperties.gitBranch
                        this.gitBuildHost = gitProperties.gitBuildHost
                        this.gitBuildTime = gitProperties.gitBuildTime
                        this.gitBuildUserEmail = gitProperties.gitBuildUserEmail
                        this.gitBuildUserName = gitProperties.gitBuildUserName
                        this.gitBuildVersion = gitProperties.gitBuildVersion
                        this.gitClosestTagCommitCount = gitProperties.gitClosestTagCommitCount
                        this.gitClosestTagName = gitProperties.gitClosestTagName
                        this.gitCommitId = gitProperties.gitCommitId
                        this.gitCommitIdAbbrev = gitProperties.gitCommitIdAbbrev
                        this.gitCommitIdDescribe = gitProperties.gitCommitIdDescribe
                        this.gitCommitIdDescribeShort = gitProperties.gitCommitIdDescribeShort
                        this.gitCommitMessageFull = gitProperties.gitCommitMessageFull
                        this.gitCommitMessageShort = gitProperties.gitCommitMessageShort
                        this.gitCommitTime = gitProperties.gitCommitTime
                        this.gitCommitUserEmail = gitProperties.gitCommitUserEmail
                        this.gitCommitUserName = gitProperties.gitCommitUserName
                        this.gitDirty = gitProperties.gitDirty
                        this.gitRemoteOriginUrl = gitProperties.gitRemoteOriginUrl
                        this.gitTags = gitProperties.gitTags
                        additionalProperties(gitProperties.additionalProperties)
                    }

                    fun gitBranch(gitBranch: String) = gitBranch(JsonField.of(gitBranch))

                    @JsonProperty("git.branch")
                    @ExcludeMissing
                    fun gitBranch(gitBranch: JsonField<String>) = apply {
                        this.gitBranch = gitBranch
                    }

                    fun gitBuildHost(gitBuildHost: String) =
                        gitBuildHost(JsonField.of(gitBuildHost))

                    @JsonProperty("git.build.host")
                    @ExcludeMissing
                    fun gitBuildHost(gitBuildHost: JsonField<String>) = apply {
                        this.gitBuildHost = gitBuildHost
                    }

                    fun gitBuildTime(gitBuildTime: String) =
                        gitBuildTime(JsonField.of(gitBuildTime))

                    @JsonProperty("git.build.time")
                    @ExcludeMissing
                    fun gitBuildTime(gitBuildTime: JsonField<String>) = apply {
                        this.gitBuildTime = gitBuildTime
                    }

                    fun gitBuildUserEmail(gitBuildUserEmail: String) =
                        gitBuildUserEmail(JsonField.of(gitBuildUserEmail))

                    @JsonProperty("git.build.user.email")
                    @ExcludeMissing
                    fun gitBuildUserEmail(gitBuildUserEmail: JsonField<String>) = apply {
                        this.gitBuildUserEmail = gitBuildUserEmail
                    }

                    fun gitBuildUserName(gitBuildUserName: String) =
                        gitBuildUserName(JsonField.of(gitBuildUserName))

                    @JsonProperty("git.build.user.name")
                    @ExcludeMissing
                    fun gitBuildUserName(gitBuildUserName: JsonField<String>) = apply {
                        this.gitBuildUserName = gitBuildUserName
                    }

                    fun gitBuildVersion(gitBuildVersion: String) =
                        gitBuildVersion(JsonField.of(gitBuildVersion))

                    @JsonProperty("git.build.version")
                    @ExcludeMissing
                    fun gitBuildVersion(gitBuildVersion: JsonField<String>) = apply {
                        this.gitBuildVersion = gitBuildVersion
                    }

                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: String) =
                        gitClosestTagCommitCount(JsonField.of(gitClosestTagCommitCount))

                    @JsonProperty("git.closest.tag.commit.count")
                    @ExcludeMissing
                    fun gitClosestTagCommitCount(gitClosestTagCommitCount: JsonField<String>) =
                        apply {
                            this.gitClosestTagCommitCount = gitClosestTagCommitCount
                        }

                    fun gitClosestTagName(gitClosestTagName: String) =
                        gitClosestTagName(JsonField.of(gitClosestTagName))

                    @JsonProperty("git.closest.tag.name")
                    @ExcludeMissing
                    fun gitClosestTagName(gitClosestTagName: JsonField<String>) = apply {
                        this.gitClosestTagName = gitClosestTagName
                    }

                    fun gitCommitId(gitCommitId: String) = gitCommitId(JsonField.of(gitCommitId))

                    @JsonProperty("git.commit.id")
                    @ExcludeMissing
                    fun gitCommitId(gitCommitId: JsonField<String>) = apply {
                        this.gitCommitId = gitCommitId
                    }

                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: String) =
                        gitCommitIdAbbrev(JsonField.of(gitCommitIdAbbrev))

                    @JsonProperty("git.commit.id.abbrev")
                    @ExcludeMissing
                    fun gitCommitIdAbbrev(gitCommitIdAbbrev: JsonField<String>) = apply {
                        this.gitCommitIdAbbrev = gitCommitIdAbbrev
                    }

                    fun gitCommitIdDescribe(gitCommitIdDescribe: String) =
                        gitCommitIdDescribe(JsonField.of(gitCommitIdDescribe))

                    @JsonProperty("git.commit.id.describe")
                    @ExcludeMissing
                    fun gitCommitIdDescribe(gitCommitIdDescribe: JsonField<String>) = apply {
                        this.gitCommitIdDescribe = gitCommitIdDescribe
                    }

                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: String) =
                        gitCommitIdDescribeShort(JsonField.of(gitCommitIdDescribeShort))

                    @JsonProperty("git.commit.id.describe-short")
                    @ExcludeMissing
                    fun gitCommitIdDescribeShort(gitCommitIdDescribeShort: JsonField<String>) =
                        apply {
                            this.gitCommitIdDescribeShort = gitCommitIdDescribeShort
                        }

                    fun gitCommitMessageFull(gitCommitMessageFull: String) =
                        gitCommitMessageFull(JsonField.of(gitCommitMessageFull))

                    @JsonProperty("git.commit.message.full")
                    @ExcludeMissing
                    fun gitCommitMessageFull(gitCommitMessageFull: JsonField<String>) = apply {
                        this.gitCommitMessageFull = gitCommitMessageFull
                    }

                    fun gitCommitMessageShort(gitCommitMessageShort: String) =
                        gitCommitMessageShort(JsonField.of(gitCommitMessageShort))

                    @JsonProperty("git.commit.message.short")
                    @ExcludeMissing
                    fun gitCommitMessageShort(gitCommitMessageShort: JsonField<String>) = apply {
                        this.gitCommitMessageShort = gitCommitMessageShort
                    }

                    fun gitCommitTime(gitCommitTime: String) =
                        gitCommitTime(JsonField.of(gitCommitTime))

                    @JsonProperty("git.commit.time")
                    @ExcludeMissing
                    fun gitCommitTime(gitCommitTime: JsonField<String>) = apply {
                        this.gitCommitTime = gitCommitTime
                    }

                    fun gitCommitUserEmail(gitCommitUserEmail: String) =
                        gitCommitUserEmail(JsonField.of(gitCommitUserEmail))

                    @JsonProperty("git.commit.user.email")
                    @ExcludeMissing
                    fun gitCommitUserEmail(gitCommitUserEmail: JsonField<String>) = apply {
                        this.gitCommitUserEmail = gitCommitUserEmail
                    }

                    fun gitCommitUserName(gitCommitUserName: String) =
                        gitCommitUserName(JsonField.of(gitCommitUserName))

                    @JsonProperty("git.commit.user.name")
                    @ExcludeMissing
                    fun gitCommitUserName(gitCommitUserName: JsonField<String>) = apply {
                        this.gitCommitUserName = gitCommitUserName
                    }

                    fun gitDirty(gitDirty: String) = gitDirty(JsonField.of(gitDirty))

                    @JsonProperty("git.dirty")
                    @ExcludeMissing
                    fun gitDirty(gitDirty: JsonField<String>) = apply { this.gitDirty = gitDirty }

                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: String) =
                        gitRemoteOriginUrl(JsonField.of(gitRemoteOriginUrl))

                    @JsonProperty("git.remote.origin.url")
                    @ExcludeMissing
                    fun gitRemoteOriginUrl(gitRemoteOriginUrl: JsonField<String>) = apply {
                        this.gitRemoteOriginUrl = gitRemoteOriginUrl
                    }

                    fun gitTags(gitTags: String) = gitTags(JsonField.of(gitTags))

                    @JsonProperty("git.tags")
                    @ExcludeMissing
                    fun gitTags(gitTags: JsonField<String>) = apply { this.gitTags = gitTags }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }
}
