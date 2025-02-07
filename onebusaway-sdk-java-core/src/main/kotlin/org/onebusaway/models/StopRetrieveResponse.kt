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
import org.onebusaway.core.checkRequired
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class StopRetrieveResponse
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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun build(): StopRetrieveResponse =
            StopRetrieveResponse(
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

        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

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

            entry().validate()
            references().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    checkRequired("entry", entry),
                    checkRequired("references", references),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat")
            @ExcludeMissing
            private val lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon")
            @ExcludeMissing
            private val lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent")
            @ExcludeMissing
            private val parent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routeIds")
            @ExcludeMissing
            private val routeIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("staticRouteIds")
            @ExcludeMissing
            private val staticRouteIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("code")
            @ExcludeMissing
            private val code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locationType")
            @ExcludeMissing
            private val locationType: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("wheelchairBoarding")
            @ExcludeMissing
            private val wheelchairBoarding: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun lat(): Double = lat.getRequired("lat")

            fun lon(): Double = lon.getRequired("lon")

            fun name(): String = name.getRequired("name")

            fun parent(): String = parent.getRequired("parent")

            fun routeIds(): List<String> = routeIds.getRequired("routeIds")

            fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

            fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

            fun direction(): Optional<String> =
                Optional.ofNullable(direction.getNullable("direction"))

            fun locationType(): Optional<Long> =
                Optional.ofNullable(locationType.getNullable("locationType"))

            fun wheelchairBoarding(): Optional<String> =
                Optional.ofNullable(wheelchairBoarding.getNullable("wheelchairBoarding"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

            @JsonProperty("routeIds")
            @ExcludeMissing
            fun _routeIds(): JsonField<List<String>> = routeIds

            @JsonProperty("staticRouteIds")
            @ExcludeMissing
            fun _staticRouteIds(): JsonField<List<String>> = staticRouteIds

            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<String> = direction

            @JsonProperty("locationType")
            @ExcludeMissing
            fun _locationType(): JsonField<Long> = locationType

            @JsonProperty("wheelchairBoarding")
            @ExcludeMissing
            fun _wheelchairBoarding(): JsonField<String> = wheelchairBoarding

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                lat()
                lon()
                name()
                parent()
                routeIds()
                staticRouteIds()
                code()
                direction()
                locationType()
                wheelchairBoarding()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var lat: JsonField<Double>? = null
                private var lon: JsonField<Double>? = null
                private var name: JsonField<String>? = null
                private var parent: JsonField<String>? = null
                private var routeIds: JsonField<MutableList<String>>? = null
                private var staticRouteIds: JsonField<MutableList<String>>? = null
                private var code: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<String> = JsonMissing.of()
                private var locationType: JsonField<Long> = JsonMissing.of()
                private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    lat = entry.lat
                    lon = entry.lon
                    name = entry.name
                    parent = entry.parent
                    routeIds = entry.routeIds.map { it.toMutableList() }
                    staticRouteIds = entry.staticRouteIds.map { it.toMutableList() }
                    code = entry.code
                    direction = entry.direction
                    locationType = entry.locationType
                    wheelchairBoarding = entry.wheelchairBoarding
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun lat(lat: Double) = lat(JsonField.of(lat))

                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                fun lon(lon: Double) = lon(JsonField.of(lon))

                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun parent(parent: String) = parent(JsonField.of(parent))

                fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                fun routeIds(routeIds: JsonField<List<String>>) = apply {
                    this.routeIds = routeIds.map { it.toMutableList() }
                }

                fun addRouteId(routeId: String) = apply {
                    routeIds =
                        (routeIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(routeId)
                        }
                }

                fun staticRouteIds(staticRouteIds: List<String>) =
                    staticRouteIds(JsonField.of(staticRouteIds))

                fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                    this.staticRouteIds = staticRouteIds.map { it.toMutableList() }
                }

                fun addStaticRouteId(staticRouteId: String) = apply {
                    staticRouteIds =
                        (staticRouteIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(staticRouteId)
                        }
                }

                fun code(code: String) = code(JsonField.of(code))

                fun code(code: JsonField<String>) = apply { this.code = code }

                fun direction(direction: String) = direction(JsonField.of(direction))

                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                fun locationType(locationType: JsonField<Long>) = apply {
                    this.locationType = locationType
                }

                fun wheelchairBoarding(wheelchairBoarding: String) =
                    wheelchairBoarding(JsonField.of(wheelchairBoarding))

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

                fun build(): Entry =
                    Entry(
                        checkRequired("id", id),
                        checkRequired("lat", lat),
                        checkRequired("lon", lon),
                        checkRequired("name", name),
                        checkRequired("parent", parent),
                        checkRequired("routeIds", routeIds).map { it.toImmutable() },
                        checkRequired("staticRouteIds", staticRouteIds).map { it.toImmutable() },
                        code,
                        direction,
                        locationType,
                        wheelchairBoarding,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && id == other.id && lat == other.lat && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && locationType == other.locationType && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, lat, lon, name, parent, routeIds, staticRouteIds, code, direction, locationType, wheelchairBoarding, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, lat=$lat, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, locationType=$locationType, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
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
