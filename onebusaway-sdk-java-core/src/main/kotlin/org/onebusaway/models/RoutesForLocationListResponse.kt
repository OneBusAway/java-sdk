// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.toUnmodifiable

@JsonDeserialize(builder = RoutesForLocationListResponse.Builder::class)
@NoAutoDetect
class RoutesForLocationListResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    fun validate(): RoutesForLocationListResponse = apply {
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
        internal fun from(routesForLocationListResponse: RoutesForLocationListResponse) = apply {
            this.code = routesForLocationListResponse.code
            this.currentTime = routesForLocationListResponse.currentTime
            this.text = routesForLocationListResponse.text
            this.version = routesForLocationListResponse.version
            this.data = routesForLocationListResponse.data
            additionalProperties(routesForLocationListResponse.additionalProperties)
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

        fun build(): RoutesForLocationListResponse =
            RoutesForLocationListResponse(
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
        private val limitExceeded: JsonField<Boolean>,
        private val list: JsonField<List<List>>,
        private val outOfRange: JsonField<Boolean>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): List<List> = list.getRequired("list")

        fun outOfRange(): Boolean = outOfRange.getRequired("outOfRange")

        fun references(): References = references.getRequired("references")

        @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

        @JsonProperty("list") @ExcludeMissing fun _list() = list

        @JsonProperty("outOfRange") @ExcludeMissing fun _outOfRange() = outOfRange

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                limitExceeded()
                list().forEach { it.validate() }
                outOfRange()
                references().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var limitExceeded: JsonField<Boolean> = JsonMissing.of()
            private var list: JsonField<List<List>> = JsonMissing.of()
            private var outOfRange: JsonField<Boolean> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.limitExceeded = data.limitExceeded
                this.list = data.list
                this.outOfRange = data.outOfRange
                this.references = data.references
                additionalProperties(data.additionalProperties)
            }

            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            @JsonProperty("limitExceeded")
            @ExcludeMissing
            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun list(list: List<List>) = list(JsonField.of(list))

            @JsonProperty("list")
            @ExcludeMissing
            fun list(list: JsonField<List<List>>) = apply { this.list = list }

            fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

            @JsonProperty("outOfRange")
            @ExcludeMissing
            fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

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
                    limitExceeded,
                    list.map { it.toUnmodifiable() },
                    outOfRange,
                    references,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = List.Builder::class)
        @NoAutoDetect
        class List
        private constructor(
            private val agencyId: JsonField<String>,
            private val color: JsonField<String>,
            private val description: JsonField<String>,
            private val id: JsonField<String>,
            private val longName: JsonField<String>,
            private val nullSafeShortName: JsonField<String>,
            private val shortName: JsonField<String>,
            private val textColor: JsonField<String>,
            private val type: JsonField<Long>,
            private val url: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun agencyId(): String = agencyId.getRequired("agencyId")

            fun color(): Optional<String> = Optional.ofNullable(color.getNullable("color"))

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            fun id(): String = id.getRequired("id")

            fun longName(): Optional<String> = Optional.ofNullable(longName.getNullable("longName"))

            fun nullSafeShortName(): Optional<String> =
                Optional.ofNullable(nullSafeShortName.getNullable("nullSafeShortName"))

            fun shortName(): Optional<String> =
                Optional.ofNullable(shortName.getNullable("shortName"))

            fun textColor(): Optional<String> =
                Optional.ofNullable(textColor.getNullable("textColor"))

            fun type(): Long = type.getRequired("type")

            fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

            @JsonProperty("color") @ExcludeMissing fun _color() = color

            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("longName") @ExcludeMissing fun _longName() = longName

            @JsonProperty("nullSafeShortName")
            @ExcludeMissing
            fun _nullSafeShortName() = nullSafeShortName

            @JsonProperty("shortName") @ExcludeMissing fun _shortName() = shortName

            @JsonProperty("textColor") @ExcludeMissing fun _textColor() = textColor

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("url") @ExcludeMissing fun _url() = url

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): List = apply {
                if (!validated) {
                    agencyId()
                    color()
                    description()
                    id()
                    longName()
                    nullSafeShortName()
                    shortName()
                    textColor()
                    type()
                    url()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var agencyId: JsonField<String> = JsonMissing.of()
                private var color: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var longName: JsonField<String> = JsonMissing.of()
                private var nullSafeShortName: JsonField<String> = JsonMissing.of()
                private var shortName: JsonField<String> = JsonMissing.of()
                private var textColor: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Long> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(list: List) = apply {
                    this.agencyId = list.agencyId
                    this.color = list.color
                    this.description = list.description
                    this.id = list.id
                    this.longName = list.longName
                    this.nullSafeShortName = list.nullSafeShortName
                    this.shortName = list.shortName
                    this.textColor = list.textColor
                    this.type = list.type
                    this.url = list.url
                    additionalProperties(list.additionalProperties)
                }

                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                @JsonProperty("agencyId")
                @ExcludeMissing
                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                fun color(color: String) = color(JsonField.of(color))

                @JsonProperty("color")
                @ExcludeMissing
                fun color(color: JsonField<String>) = apply { this.color = color }

                fun description(description: String) = description(JsonField.of(description))

                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun longName(longName: String) = longName(JsonField.of(longName))

                @JsonProperty("longName")
                @ExcludeMissing
                fun longName(longName: JsonField<String>) = apply { this.longName = longName }

                fun nullSafeShortName(nullSafeShortName: String) =
                    nullSafeShortName(JsonField.of(nullSafeShortName))

                @JsonProperty("nullSafeShortName")
                @ExcludeMissing
                fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                    this.nullSafeShortName = nullSafeShortName
                }

                fun shortName(shortName: String) = shortName(JsonField.of(shortName))

                @JsonProperty("shortName")
                @ExcludeMissing
                fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

                fun textColor(textColor: String) = textColor(JsonField.of(textColor))

                @JsonProperty("textColor")
                @ExcludeMissing
                fun textColor(textColor: JsonField<String>) = apply { this.textColor = textColor }

                fun type(type: Long) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Long>) = apply { this.type = type }

                fun url(url: String) = url(JsonField.of(url))

                @JsonProperty("url")
                @ExcludeMissing
                fun url(url: JsonField<String>) = apply { this.url = url }

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

                fun build(): List =
                    List(
                        agencyId,
                        color,
                        description,
                        id,
                        longName,
                        nullSafeShortName,
                        shortName,
                        textColor,
                        type,
                        url,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is List &&
                    this.agencyId == other.agencyId &&
                    this.color == other.color &&
                    this.description == other.description &&
                    this.id == other.id &&
                    this.longName == other.longName &&
                    this.nullSafeShortName == other.nullSafeShortName &&
                    this.shortName == other.shortName &&
                    this.textColor == other.textColor &&
                    this.type == other.type &&
                    this.url == other.url &&
                    this.additionalProperties == other.additionalProperties
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            agencyId,
                            color,
                            description,
                            id,
                            longName,
                            nullSafeShortName,
                            shortName,
                            textColor,
                            type,
                            url,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "List{agencyId=$agencyId, color=$color, description=$description, id=$id, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.limitExceeded == other.limitExceeded &&
                this.list == other.list &&
                this.outOfRange == other.outOfRange &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        limitExceeded,
                        list,
                        outOfRange,
                        references,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, outOfRange=$outOfRange, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutesForLocationListResponse &&
            this.code == other.code &&
            this.currentTime == other.currentTime &&
            this.text == other.text &&
            this.version == other.version &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

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
        "RoutesForLocationListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
