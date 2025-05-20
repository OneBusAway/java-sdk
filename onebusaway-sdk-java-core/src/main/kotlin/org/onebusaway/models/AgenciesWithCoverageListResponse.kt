// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.checkRequired
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class AgenciesWithCoverageListResponse
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

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

    fun validate(): AgenciesWithCoverageListResponse = apply {
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgenciesWithCoverageListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agenciesWithCoverageListResponse: AgenciesWithCoverageListResponse) =
            apply {
                code = agenciesWithCoverageListResponse.code
                currentTime = agenciesWithCoverageListResponse.currentTime
                text = agenciesWithCoverageListResponse.text
                version = agenciesWithCoverageListResponse.version
                data = agenciesWithCoverageListResponse.data
                additionalProperties =
                    agenciesWithCoverageListResponse.additionalProperties.toMutableMap()
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

        fun build(): AgenciesWithCoverageListResponse =
            AgenciesWithCoverageListResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("data", data),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("limitExceeded")
        @ExcludeMissing
        private val limitExceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("list")
        @ExcludeMissing
        private val list: JsonField<kotlin.collections.List<List>> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        private val references: JsonField<References> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): kotlin.collections.List<List> = list.getRequired("list")

        fun references(): References = references.getRequired("references")

        @JsonProperty("limitExceeded")
        @ExcludeMissing
        fun _limitExceeded(): JsonField<Boolean> = limitExceeded

        @JsonProperty("list")
        @ExcludeMissing
        fun _list(): JsonField<kotlin.collections.List<List>> = list

        @JsonProperty("references")
        @ExcludeMissing
        fun _references(): JsonField<References> = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            limitExceeded()
            list().forEach { it.validate() }
            references().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var limitExceeded: JsonField<Boolean>? = null
            private var list: JsonField<MutableList<List>>? = null
            private var references: JsonField<References>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                limitExceeded = data.limitExceeded
                list = data.list.map { it.toMutableList() }
                references = data.references
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

            fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
                this.limitExceeded = limitExceeded
            }

            fun list(list: kotlin.collections.List<List>) = list(JsonField.of(list))

            fun list(list: JsonField<kotlin.collections.List<List>>) = apply {
                this.list = list.map { it.toMutableList() }
            }

            fun addList(list: List) = apply {
                this.list =
                    (this.list ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(list)
                    }
            }

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
                    checkRequired("limitExceeded", limitExceeded),
                    checkRequired("list", list).map { it.toImmutable() },
                    checkRequired("references", references),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class List
        @JsonCreator
        private constructor(
            @JsonProperty("agencyId")
            @ExcludeMissing
            private val agencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat")
            @ExcludeMissing
            private val lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("latSpan")
            @ExcludeMissing
            private val latSpan: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon")
            @ExcludeMissing
            private val lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lonSpan")
            @ExcludeMissing
            private val lonSpan: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun agencyId(): String = agencyId.getRequired("agencyId")

            fun lat(): Double = lat.getRequired("lat")

            fun latSpan(): Double = latSpan.getRequired("latSpan")

            fun lon(): Double = lon.getRequired("lon")

            fun lonSpan(): Double = lonSpan.getRequired("lonSpan")

            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId(): JsonField<String> = agencyId

            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            @JsonProperty("latSpan") @ExcludeMissing fun _latSpan(): JsonField<Double> = latSpan

            @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

            @JsonProperty("lonSpan") @ExcludeMissing fun _lonSpan(): JsonField<Double> = lonSpan

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): List = apply {
                if (validated) {
                    return@apply
                }

                agencyId()
                lat()
                latSpan()
                lon()
                lonSpan()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [List]. */
            class Builder internal constructor() {

                private var agencyId: JsonField<String>? = null
                private var lat: JsonField<Double>? = null
                private var latSpan: JsonField<Double>? = null
                private var lon: JsonField<Double>? = null
                private var lonSpan: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(list: List) = apply {
                    agencyId = list.agencyId
                    lat = list.lat
                    latSpan = list.latSpan
                    lon = list.lon
                    lonSpan = list.lonSpan
                    additionalProperties = list.additionalProperties.toMutableMap()
                }

                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                fun lat(lat: Double) = lat(JsonField.of(lat))

                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                fun latSpan(latSpan: Double) = latSpan(JsonField.of(latSpan))

                fun latSpan(latSpan: JsonField<Double>) = apply { this.latSpan = latSpan }

                fun lon(lon: Double) = lon(JsonField.of(lon))

                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                fun lonSpan(lonSpan: Double) = lonSpan(JsonField.of(lonSpan))

                fun lonSpan(lonSpan: JsonField<Double>) = apply { this.lonSpan = lonSpan }

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

                fun build(): List =
                    List(
                        checkRequired("agencyId", agencyId),
                        checkRequired("lat", lat),
                        checkRequired("latSpan", latSpan),
                        checkRequired("lon", lon),
                        checkRequired("lonSpan", lonSpan),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is List && agencyId == other.agencyId && lat == other.lat && latSpan == other.latSpan && lon == other.lon && lonSpan == other.lonSpan && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(agencyId, lat, latSpan, lon, lonSpan, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "List{agencyId=$agencyId, lat=$lat, latSpan=$latSpan, lon=$lon, lonSpan=$lonSpan, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && limitExceeded == other.limitExceeded && list == other.list && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(limitExceeded, list, references, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{limitExceeded=$limitExceeded, list=$list, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgenciesWithCoverageListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgenciesWithCoverageListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
