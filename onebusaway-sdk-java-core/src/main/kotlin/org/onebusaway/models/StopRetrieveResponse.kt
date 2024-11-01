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
import org.onebusaway.core.toImmutable

@JsonDeserialize(builder = StopRetrieveResponse.Builder::class)
@NoAutoDetect
class StopRetrieveResponse
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

    fun validate(): StopRetrieveResponse = apply {
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
        internal fun from(stopRetrieveResponse: StopRetrieveResponse) = apply {
            this.code = stopRetrieveResponse.code
            this.currentTime = stopRetrieveResponse.currentTime
            this.text = stopRetrieveResponse.text
            this.version = stopRetrieveResponse.version
            this.data = stopRetrieveResponse.data
            additionalProperties(stopRetrieveResponse.additionalProperties)
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

        fun build(): StopRetrieveResponse =
            StopRetrieveResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toImmutable(),
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
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val code: JsonField<String>,
            private val direction: JsonField<String>,
            private val id: JsonField<String>,
            private val lat: JsonField<Double>,
            private val locationType: JsonField<Long>,
            private val lon: JsonField<Double>,
            private val name: JsonField<String>,
            private val parent: JsonField<String>,
            private val routeIds: JsonField<List<String>>,
            private val staticRouteIds: JsonField<List<String>>,
            private val wheelchairBoarding: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun code(): String = code.getRequired("code")

            fun direction(): Optional<String> =
                Optional.ofNullable(direction.getNullable("direction"))

            fun id(): String = id.getRequired("id")

            fun lat(): Double = lat.getRequired("lat")

            fun locationType(): Optional<Long> =
                Optional.ofNullable(locationType.getNullable("locationType"))

            fun lon(): Double = lon.getRequired("lon")

            fun name(): String = name.getRequired("name")

            fun parent(): Optional<String> = Optional.ofNullable(parent.getNullable("parent"))

            fun routeIds(): Optional<List<String>> =
                Optional.ofNullable(routeIds.getNullable("routeIds"))

            fun staticRouteIds(): Optional<List<String>> =
                Optional.ofNullable(staticRouteIds.getNullable("staticRouteIds"))

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

            fun validate(): Entry = apply {
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
                private var routeIds: JsonField<List<String>> = JsonMissing.of()
                private var staticRouteIds: JsonField<List<String>> = JsonMissing.of()
                private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.code = entry.code
                    this.direction = entry.direction
                    this.id = entry.id
                    this.lat = entry.lat
                    this.locationType = entry.locationType
                    this.lon = entry.lon
                    this.name = entry.name
                    this.parent = entry.parent
                    this.routeIds = entry.routeIds
                    this.staticRouteIds = entry.staticRouteIds
                    this.wheelchairBoarding = entry.wheelchairBoarding
                    additionalProperties(entry.additionalProperties)
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

                fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                @JsonProperty("routeIds")
                @ExcludeMissing
                fun routeIds(routeIds: JsonField<List<String>>) = apply { this.routeIds = routeIds }

                fun staticRouteIds(staticRouteIds: List<String>) =
                    staticRouteIds(JsonField.of(staticRouteIds))

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
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

                fun build(): Entry =
                    Entry(
                        code,
                        direction,
                        id,
                        lat,
                        locationType,
                        lon,
                        name,
                        parent,
                        routeIds.map { it.toImmutable() },
                        staticRouteIds.map { it.toImmutable() },
                        wheelchairBoarding,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && this.code == other.code && this.direction == other.direction && this.id == other.id && this.lat == other.lat && this.locationType == other.locationType && this.lon == other.lon && this.name == other.name && this.parent == other.parent && this.routeIds == other.routeIds && this.staticRouteIds == other.staticRouteIds && this.wheelchairBoarding == other.wheelchairBoarding && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(code, direction, id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, wheelchairBoarding, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Entry{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && this.entry == other.entry && this.references == other.references && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(entry, references, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopRetrieveResponse && this.code == other.code && this.currentTime == other.currentTime && this.text == other.text && this.version == other.version && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(code, currentTime, text, version, data, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "StopRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
