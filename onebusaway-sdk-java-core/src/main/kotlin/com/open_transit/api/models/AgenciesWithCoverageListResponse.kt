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

@JsonDeserialize(builder = AgenciesWithCoverageListResponse.Builder::class)
@NoAutoDetect
class AgenciesWithCoverageListResponse
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

    fun validate(): AgenciesWithCoverageListResponse = apply {
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

        return other is AgenciesWithCoverageListResponse &&
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
        "AgenciesWithCoverageListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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
        internal fun from(agenciesWithCoverageListResponse: AgenciesWithCoverageListResponse) =
            apply {
                this.code = agenciesWithCoverageListResponse.code
                this.currentTime = agenciesWithCoverageListResponse.currentTime
                this.text = agenciesWithCoverageListResponse.text
                this.version = agenciesWithCoverageListResponse.version
                this.data = agenciesWithCoverageListResponse.data
                additionalProperties(agenciesWithCoverageListResponse.additionalProperties)
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

        fun build(): AgenciesWithCoverageListResponse =
            AgenciesWithCoverageListResponse(
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
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): List<List> = list.getRequired("list")

        fun references(): References = references.getRequired("references")

        @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

        @JsonProperty("list") @ExcludeMissing fun _list() = list

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                limitExceeded()
                list().forEach { it.validate() }
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
                this.limitExceeded == other.limitExceeded &&
                this.list == other.list &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        limitExceeded,
                        list,
                        references,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, references=$references, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var limitExceeded: JsonField<Boolean> = JsonMissing.of()
            private var list: JsonField<List<List>> = JsonMissing.of()
            private var references: JsonField<References> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.limitExceeded = data.limitExceeded
                this.list = data.list
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
                    references,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = List.Builder::class)
        @NoAutoDetect
        class List
        private constructor(
            private val agencyId: JsonField<String>,
            private val lat: JsonField<Double>,
            private val latSpan: JsonField<Double>,
            private val lon: JsonField<Double>,
            private val lonSpan: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun agencyId(): String = agencyId.getRequired("agencyId")

            fun lat(): Double = lat.getRequired("lat")

            fun latSpan(): Double = latSpan.getRequired("latSpan")

            fun lon(): Double = lon.getRequired("lon")

            fun lonSpan(): Double = lonSpan.getRequired("lonSpan")

            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

            @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

            @JsonProperty("latSpan") @ExcludeMissing fun _latSpan() = latSpan

            @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

            @JsonProperty("lonSpan") @ExcludeMissing fun _lonSpan() = lonSpan

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): List = apply {
                if (!validated) {
                    agencyId()
                    lat()
                    latSpan()
                    lon()
                    lonSpan()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is List &&
                    this.agencyId == other.agencyId &&
                    this.lat == other.lat &&
                    this.latSpan == other.latSpan &&
                    this.lon == other.lon &&
                    this.lonSpan == other.lonSpan &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            agencyId,
                            lat,
                            latSpan,
                            lon,
                            lonSpan,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "List{agencyId=$agencyId, lat=$lat, latSpan=$latSpan, lon=$lon, lonSpan=$lonSpan, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var agencyId: JsonField<String> = JsonMissing.of()
                private var lat: JsonField<Double> = JsonMissing.of()
                private var latSpan: JsonField<Double> = JsonMissing.of()
                private var lon: JsonField<Double> = JsonMissing.of()
                private var lonSpan: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(list: List) = apply {
                    this.agencyId = list.agencyId
                    this.lat = list.lat
                    this.latSpan = list.latSpan
                    this.lon = list.lon
                    this.lonSpan = list.lonSpan
                    additionalProperties(list.additionalProperties)
                }

                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                @JsonProperty("agencyId")
                @ExcludeMissing
                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                fun lat(lat: Double) = lat(JsonField.of(lat))

                @JsonProperty("lat")
                @ExcludeMissing
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                fun latSpan(latSpan: Double) = latSpan(JsonField.of(latSpan))

                @JsonProperty("latSpan")
                @ExcludeMissing
                fun latSpan(latSpan: JsonField<Double>) = apply { this.latSpan = latSpan }

                fun lon(lon: Double) = lon(JsonField.of(lon))

                @JsonProperty("lon")
                @ExcludeMissing
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                fun lonSpan(lonSpan: Double) = lonSpan(JsonField.of(lonSpan))

                @JsonProperty("lonSpan")
                @ExcludeMissing
                fun lonSpan(lonSpan: JsonField<Double>) = apply { this.lonSpan = lonSpan }

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
                        lat,
                        latSpan,
                        lon,
                        lonSpan,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}