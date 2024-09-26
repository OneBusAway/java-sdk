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

@JsonDeserialize(builder = StopsForLocationListResponse.Builder::class)
@NoAutoDetect
class StopsForLocationListResponse
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

    fun validate(): StopsForLocationListResponse = apply {
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

        return other is StopsForLocationListResponse &&
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
        "StopsForLocationListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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
        internal fun from(stopsForLocationListResponse: StopsForLocationListResponse) = apply {
            this.code = stopsForLocationListResponse.code
            this.currentTime = stopsForLocationListResponse.currentTime
            this.text = stopsForLocationListResponse.text
            this.version = stopsForLocationListResponse.version
            this.data = stopsForLocationListResponse.data
            additionalProperties(stopsForLocationListResponse.additionalProperties)
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

        fun build(): StopsForLocationListResponse =
            StopsForLocationListResponse(
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
        private val list: JsonField<kotlin.collections.List<List>>,
        private val references: JsonField<References>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

        fun list(): kotlin.collections.List<List> = list.getRequired("list")

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
            private var list: JsonField<kotlin.collections.List<List>> = JsonMissing.of()
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

            fun list(list: kotlin.collections.List<List>) = list(JsonField.of(list))

            @JsonProperty("list")
            @ExcludeMissing
            fun list(list: JsonField<kotlin.collections.List<List>>) = apply { this.list = list }

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
            private val code: JsonField<String>,
            private val direction: JsonField<String>,
            private val id: JsonField<String>,
            private val lat: JsonField<Double>,
            private val locationType: JsonField<Long>,
            private val lon: JsonField<Double>,
            private val name: JsonField<String>,
            private val parent: JsonField<String>,
            private val routeIds: JsonField<kotlin.collections.List<String>>,
            private val staticRouteIds: JsonField<kotlin.collections.List<String>>,
            private val wheelchairBoarding: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

            fun direction(): Optional<String> =
                Optional.ofNullable(direction.getNullable("direction"))

            fun id(): String = id.getRequired("id")

            fun lat(): Double = lat.getRequired("lat")

            fun locationType(): Optional<Long> =
                Optional.ofNullable(locationType.getNullable("locationType"))

            fun lon(): Double = lon.getRequired("lon")

            fun name(): String = name.getRequired("name")

            fun parent(): String = parent.getRequired("parent")

            fun routeIds(): kotlin.collections.List<String> = routeIds.getRequired("routeIds")

            fun staticRouteIds(): kotlin.collections.List<String> =
                staticRouteIds.getRequired("staticRouteIds")

            fun wheelchairBoarding(): Optional<String> =
                Optional.ofNullable(wheelchairBoarding.getNullable("wheelchairBoarding"))

            @JsonProperty("code") @ExcludeMissing fun _code() = code

            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

            @JsonProperty("locationType") @ExcludeMissing fun _locationType() = locationType

            @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

            @JsonProperty("routeIds") @ExcludeMissing fun _routeIds() = routeIds

            @JsonProperty("staticRouteIds") @ExcludeMissing fun _staticRouteIds() = staticRouteIds

            @JsonProperty("wheelchairBoarding")
            @ExcludeMissing
            fun _wheelchairBoarding() = wheelchairBoarding

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): List = apply {
                if (!validated) {
                    code()
                    direction()
                    id()
                    lat()
                    locationType()
                    lon()
                    name()
                    parent()
                    routeIds()
                    staticRouteIds()
                    wheelchairBoarding()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is List &&
                    this.code == other.code &&
                    this.direction == other.direction &&
                    this.id == other.id &&
                    this.lat == other.lat &&
                    this.locationType == other.locationType &&
                    this.lon == other.lon &&
                    this.name == other.name &&
                    this.parent == other.parent &&
                    this.routeIds == other.routeIds &&
                    this.staticRouteIds == other.staticRouteIds &&
                    this.wheelchairBoarding == other.wheelchairBoarding &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            code,
                            direction,
                            id,
                            lat,
                            locationType,
                            lon,
                            name,
                            parent,
                            routeIds,
                            staticRouteIds,
                            wheelchairBoarding,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "List{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var code: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var lat: JsonField<Double> = JsonMissing.of()
                private var locationType: JsonField<Long> = JsonMissing.of()
                private var lon: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var parent: JsonField<String> = JsonMissing.of()
                private var routeIds: JsonField<kotlin.collections.List<String>> = JsonMissing.of()
                private var staticRouteIds: JsonField<kotlin.collections.List<String>> =
                    JsonMissing.of()
                private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(list: List) = apply {
                    this.code = list.code
                    this.direction = list.direction
                    this.id = list.id
                    this.lat = list.lat
                    this.locationType = list.locationType
                    this.lon = list.lon
                    this.name = list.name
                    this.parent = list.parent
                    this.routeIds = list.routeIds
                    this.staticRouteIds = list.staticRouteIds
                    this.wheelchairBoarding = list.wheelchairBoarding
                    additionalProperties(list.additionalProperties)
                }

                fun code(code: String) = code(JsonField.of(code))

                @JsonProperty("code")
                @ExcludeMissing
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun direction(direction: String) = direction(JsonField.of(direction))

                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun lat(lat: Double) = lat(JsonField.of(lat))

                @JsonProperty("lat")
                @ExcludeMissing
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                @JsonProperty("locationType")
                @ExcludeMissing
                fun locationType(locationType: JsonField<Long>) = apply {
                    this.locationType = locationType
                }

                fun lon(lon: Double) = lon(JsonField.of(lon))

                @JsonProperty("lon")
                @ExcludeMissing
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun parent(parent: String) = parent(JsonField.of(parent))

                @JsonProperty("parent")
                @ExcludeMissing
                fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                fun routeIds(routeIds: kotlin.collections.List<String>) =
                    routeIds(JsonField.of(routeIds))

                @JsonProperty("routeIds")
                @ExcludeMissing
                fun routeIds(routeIds: JsonField<kotlin.collections.List<String>>) = apply {
                    this.routeIds = routeIds
                }

                fun staticRouteIds(staticRouteIds: kotlin.collections.List<String>) =
                    staticRouteIds(JsonField.of(staticRouteIds))

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun staticRouteIds(staticRouteIds: JsonField<kotlin.collections.List<String>>) =
                    apply {
                        this.staticRouteIds = staticRouteIds
                    }

                fun wheelchairBoarding(wheelchairBoarding: String) =
                    wheelchairBoarding(JsonField.of(wheelchairBoarding))

                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun wheelchairBoarding(wheelchairBoarding: JsonField<String>) = apply {
                    this.wheelchairBoarding = wheelchairBoarding
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

                fun build(): List =
                    List(
                        code,
                        direction,
                        id,
                        lat,
                        locationType,
                        lon,
                        name,
                        parent,
                        routeIds.map { it.toUnmodifiable() },
                        staticRouteIds.map { it.toUnmodifiable() },
                        wheelchairBoarding,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
