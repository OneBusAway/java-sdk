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
class StopsForRouteListResponse
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

    fun validate(): StopsForRouteListResponse = apply {
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

    /** A builder for [StopsForRouteListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopsForRouteListResponse: StopsForRouteListResponse) = apply {
            code = stopsForRouteListResponse.code
            currentTime = stopsForRouteListResponse.currentTime
            text = stopsForRouteListResponse.text
            version = stopsForRouteListResponse.version
            data = stopsForRouteListResponse.data
            additionalProperties = stopsForRouteListResponse.additionalProperties.toMutableMap()
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

        fun build(): StopsForRouteListResponse =
            StopsForRouteListResponse(
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
            @JsonProperty("polylines")
            @ExcludeMissing
            private val polylines: JsonField<List<Polyline>> = JsonMissing.of(),
            @JsonProperty("routeId")
            @ExcludeMissing
            private val routeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stopGroupings")
            @ExcludeMissing
            private val stopGroupings: JsonField<List<StopGrouping>> = JsonMissing.of(),
            @JsonProperty("stopIds")
            @ExcludeMissing
            private val stopIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun polylines(): Optional<List<Polyline>> =
                Optional.ofNullable(polylines.getNullable("polylines"))

            fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("routeId"))

            fun stopGroupings(): Optional<List<StopGrouping>> =
                Optional.ofNullable(stopGroupings.getNullable("stopGroupings"))

            fun stopIds(): Optional<List<String>> =
                Optional.ofNullable(stopIds.getNullable("stopIds"))

            @JsonProperty("polylines")
            @ExcludeMissing
            fun _polylines(): JsonField<List<Polyline>> = polylines

            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            @JsonProperty("stopGroupings")
            @ExcludeMissing
            fun _stopGroupings(): JsonField<List<StopGrouping>> = stopGroupings

            @JsonProperty("stopIds")
            @ExcludeMissing
            fun _stopIds(): JsonField<List<String>> = stopIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                polylines().ifPresent { it.forEach { it.validate() } }
                routeId()
                stopGroupings().ifPresent { it.forEach { it.validate() } }
                stopIds()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var polylines: JsonField<MutableList<Polyline>>? = null
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopGroupings: JsonField<MutableList<StopGrouping>>? = null
                private var stopIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    polylines = entry.polylines.map { it.toMutableList() }
                    routeId = entry.routeId
                    stopGroupings = entry.stopGroupings.map { it.toMutableList() }
                    stopIds = entry.stopIds.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                    this.polylines = polylines.map { it.toMutableList() }
                }

                fun addPolyline(polyline: Polyline) = apply {
                    polylines =
                        (polylines ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(polyline)
                        }
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun stopGroupings(stopGroupings: List<StopGrouping>) =
                    stopGroupings(JsonField.of(stopGroupings))

                fun stopGroupings(stopGroupings: JsonField<List<StopGrouping>>) = apply {
                    this.stopGroupings = stopGroupings.map { it.toMutableList() }
                }

                fun addStopGrouping(stopGrouping: StopGrouping) = apply {
                    stopGroupings =
                        (stopGroupings ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(stopGrouping)
                        }
                }

                fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                fun stopIds(stopIds: JsonField<List<String>>) = apply {
                    this.stopIds = stopIds.map { it.toMutableList() }
                }

                fun addStopId(stopId: String) = apply {
                    stopIds =
                        (stopIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(stopId)
                        }
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
                        (polylines ?: JsonMissing.of()).map { it.toImmutable() },
                        routeId,
                        (stopGroupings ?: JsonMissing.of()).map { it.toImmutable() },
                        (stopIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Polyline
            @JsonCreator
            private constructor(
                @JsonProperty("length")
                @ExcludeMissing
                private val length: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("levels")
                @ExcludeMissing
                private val levels: JsonField<String> = JsonMissing.of(),
                @JsonProperty("points")
                @ExcludeMissing
                private val points: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun length(): Optional<Long> = Optional.ofNullable(length.getNullable("length"))

                fun levels(): Optional<String> = Optional.ofNullable(levels.getNullable("levels"))

                fun points(): Optional<String> = Optional.ofNullable(points.getNullable("points"))

                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                @JsonProperty("levels") @ExcludeMissing fun _levels(): JsonField<String> = levels

                @JsonProperty("points") @ExcludeMissing fun _points(): JsonField<String> = points

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Polyline = apply {
                    if (validated) {
                        return@apply
                    }

                    length()
                    levels()
                    points()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Polyline]. */
                class Builder internal constructor() {

                    private var length: JsonField<Long> = JsonMissing.of()
                    private var levels: JsonField<String> = JsonMissing.of()
                    private var points: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(polyline: Polyline) = apply {
                        length = polyline.length
                        levels = polyline.levels
                        points = polyline.points
                        additionalProperties = polyline.additionalProperties.toMutableMap()
                    }

                    fun length(length: Long) = length(JsonField.of(length))

                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    fun levels(levels: String) = levels(JsonField.of(levels))

                    fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                    fun points(points: String) = points(JsonField.of(points))

                    fun points(points: JsonField<String>) = apply { this.points = points }

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

                    fun build(): Polyline =
                        Polyline(
                            length,
                            levels,
                            points,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Polyline && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class StopGrouping
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<Name> = JsonMissing.of(),
                @JsonProperty("polylines")
                @ExcludeMissing
                private val polylines: JsonField<List<Polyline>> = JsonMissing.of(),
                @JsonProperty("stopIds")
                @ExcludeMissing
                private val stopIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

                fun name(): Optional<Name> = Optional.ofNullable(name.getNullable("name"))

                fun polylines(): Optional<List<Polyline>> =
                    Optional.ofNullable(polylines.getNullable("polylines"))

                fun stopIds(): Optional<List<String>> =
                    Optional.ofNullable(stopIds.getNullable("stopIds"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

                @JsonProperty("polylines")
                @ExcludeMissing
                fun _polylines(): JsonField<List<Polyline>> = polylines

                @JsonProperty("stopIds")
                @ExcludeMissing
                fun _stopIds(): JsonField<List<String>> = stopIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StopGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name().ifPresent { it.validate() }
                    polylines().ifPresent { it.forEach { it.validate() } }
                    stopIds()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopGrouping]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<Name> = JsonMissing.of()
                    private var polylines: JsonField<MutableList<Polyline>>? = null
                    private var stopIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopGrouping: StopGrouping) = apply {
                        id = stopGrouping.id
                        name = stopGrouping.name
                        polylines = stopGrouping.polylines.map { it.toMutableList() }
                        stopIds = stopGrouping.stopIds.map { it.toMutableList() }
                        additionalProperties = stopGrouping.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: Name) = name(JsonField.of(name))

                    fun name(name: JsonField<Name>) = apply { this.name = name }

                    fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                    fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                        this.polylines = polylines.map { it.toMutableList() }
                    }

                    fun addPolyline(polyline: Polyline) = apply {
                        polylines =
                            (polylines ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(polyline)
                            }
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    fun stopIds(stopIds: JsonField<List<String>>) = apply {
                        this.stopIds = stopIds.map { it.toMutableList() }
                    }

                    fun addStopId(stopId: String) = apply {
                        stopIds =
                            (stopIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(stopId)
                            }
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

                    fun build(): StopGrouping =
                        StopGrouping(
                            id,
                            name,
                            (polylines ?: JsonMissing.of()).map { it.toImmutable() },
                            (stopIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Name
                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("names")
                    @ExcludeMissing
                    private val names: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    fun names(): Optional<List<String>> =
                        Optional.ofNullable(names.getNullable("names"))

                    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    @JsonProperty("names")
                    @ExcludeMissing
                    fun _names(): JsonField<List<String>> = names

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Name = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        names()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Name]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var names: JsonField<MutableList<String>>? = null
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(name: Name) = apply {
                            this.name = name.name
                            names = name.names.map { it.toMutableList() }
                            type = name.type
                            additionalProperties = name.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun names(names: List<String>) = names(JsonField.of(names))

                        fun names(names: JsonField<List<String>>) = apply {
                            this.names = names.map { it.toMutableList() }
                        }

                        fun addName(name: String) = apply {
                            names =
                                (names ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(name)
                                }
                        }

                        fun type(type: String) = type(JsonField.of(type))

                        fun type(type: JsonField<String>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Name =
                            Name(
                                name,
                                (names ?: JsonMissing.of()).map { it.toImmutable() },
                                type,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Name && name == other.name && names == other.names && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, names, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Name{name=$name, names=$names, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Polyline
                @JsonCreator
                private constructor(
                    @JsonProperty("length")
                    @ExcludeMissing
                    private val length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("levels")
                    @ExcludeMissing
                    private val levels: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("points")
                    @ExcludeMissing
                    private val points: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun length(): Optional<Long> = Optional.ofNullable(length.getNullable("length"))

                    fun levels(): Optional<String> =
                        Optional.ofNullable(levels.getNullable("levels"))

                    fun points(): Optional<String> =
                        Optional.ofNullable(points.getNullable("points"))

                    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                    @JsonProperty("levels")
                    @ExcludeMissing
                    fun _levels(): JsonField<String> = levels

                    @JsonProperty("points")
                    @ExcludeMissing
                    fun _points(): JsonField<String> = points

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Polyline = apply {
                        if (validated) {
                            return@apply
                        }

                        length()
                        levels()
                        points()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Polyline]. */
                    class Builder internal constructor() {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(polyline: Polyline) = apply {
                            length = polyline.length
                            levels = polyline.levels
                            points = polyline.points
                            additionalProperties = polyline.additionalProperties.toMutableMap()
                        }

                        fun length(length: Long) = length(JsonField.of(length))

                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        fun levels(levels: String) = levels(JsonField.of(levels))

                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        fun points(points: String) = points(JsonField.of(points))

                        fun points(points: JsonField<String>) = apply { this.points = points }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Polyline =
                            Polyline(
                                length,
                                levels,
                                points,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Polyline && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StopGrouping && id == other.id && name == other.name && polylines == other.polylines && stopIds == other.stopIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, polylines, stopIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopGrouping{id=$id, name=$name, polylines=$polylines, stopIds=$stopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && polylines == other.polylines && routeId == other.routeId && stopGroupings == other.stopGroupings && stopIds == other.stopIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(polylines, routeId, stopGroupings, stopIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{polylines=$polylines, routeId=$routeId, stopGroupings=$stopGroupings, stopIds=$stopIds, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is StopsForRouteListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopsForRouteListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
