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

@JsonDeserialize(builder = StopsForRouteListResponse.Builder::class)
@NoAutoDetect
class StopsForRouteListResponse
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

    fun validate(): StopsForRouteListResponse = apply {
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
        internal fun from(stopsForRouteListResponse: StopsForRouteListResponse) = apply {
            this.code = stopsForRouteListResponse.code
            this.currentTime = stopsForRouteListResponse.currentTime
            this.text = stopsForRouteListResponse.text
            this.version = stopsForRouteListResponse.version
            this.data = stopsForRouteListResponse.data
            additionalProperties(stopsForRouteListResponse.additionalProperties)
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

        fun build(): StopsForRouteListResponse =
            StopsForRouteListResponse(
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val polylines: JsonField<List<Polyline>>,
            private val routeId: JsonField<String>,
            private val stopGroupings: JsonField<List<StopGrouping>>,
            private val stopIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun polylines(): Optional<List<Polyline>> =
                Optional.ofNullable(polylines.getNullable("polylines"))

            fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("routeId"))

            fun stopGroupings(): Optional<List<StopGrouping>> =
                Optional.ofNullable(stopGroupings.getNullable("stopGroupings"))

            fun stopIds(): Optional<List<String>> =
                Optional.ofNullable(stopIds.getNullable("stopIds"))

            @JsonProperty("polylines") @ExcludeMissing fun _polylines() = polylines

            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            @JsonProperty("stopGroupings") @ExcludeMissing fun _stopGroupings() = stopGroupings

            @JsonProperty("stopIds") @ExcludeMissing fun _stopIds() = stopIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                    polylines().map { it.forEach { it.validate() } }
                    routeId()
                    stopGroupings().map { it.forEach { it.validate() } }
                    stopIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var polylines: JsonField<List<Polyline>> = JsonMissing.of()
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopGroupings: JsonField<List<StopGrouping>> = JsonMissing.of()
                private var stopIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.polylines = entry.polylines
                    this.routeId = entry.routeId
                    this.stopGroupings = entry.stopGroupings
                    this.stopIds = entry.stopIds
                    additionalProperties(entry.additionalProperties)
                }

                fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                @JsonProperty("polylines")
                @ExcludeMissing
                fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                    this.polylines = polylines
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                @JsonProperty("routeId")
                @ExcludeMissing
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun stopGroupings(stopGroupings: List<StopGrouping>) =
                    stopGroupings(JsonField.of(stopGroupings))

                @JsonProperty("stopGroupings")
                @ExcludeMissing
                fun stopGroupings(stopGroupings: JsonField<List<StopGrouping>>) = apply {
                    this.stopGroupings = stopGroupings
                }

                fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                @JsonProperty("stopIds")
                @ExcludeMissing
                fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

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
                        polylines.map { it.toUnmodifiable() },
                        routeId,
                        stopGroupings.map { it.toUnmodifiable() },
                        stopIds.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Polyline.Builder::class)
            @NoAutoDetect
            class Polyline
            private constructor(
                private val length: JsonField<Long>,
                private val levels: JsonField<String>,
                private val points: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun length(): Optional<Long> = Optional.ofNullable(length.getNullable("length"))

                fun levels(): Optional<String> = Optional.ofNullable(levels.getNullable("levels"))

                fun points(): Optional<String> = Optional.ofNullable(points.getNullable("points"))

                @JsonProperty("length") @ExcludeMissing fun _length() = length

                @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                @JsonProperty("points") @ExcludeMissing fun _points() = points

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Polyline = apply {
                    if (!validated) {
                        length()
                        levels()
                        points()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var length: JsonField<Long> = JsonMissing.of()
                    private var levels: JsonField<String> = JsonMissing.of()
                    private var points: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(polyline: Polyline) = apply {
                        this.length = polyline.length
                        this.levels = polyline.levels
                        this.points = polyline.points
                        additionalProperties(polyline.additionalProperties)
                    }

                    fun length(length: Long) = length(JsonField.of(length))

                    @JsonProperty("length")
                    @ExcludeMissing
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    fun levels(levels: String) = levels(JsonField.of(levels))

                    @JsonProperty("levels")
                    @ExcludeMissing
                    fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                    fun points(points: String) = points(JsonField.of(points))

                    @JsonProperty("points")
                    @ExcludeMissing
                    fun points(points: JsonField<String>) = apply { this.points = points }

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

                    fun build(): Polyline =
                        Polyline(
                            length,
                            levels,
                            points,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Polyline &&
                        this.length == other.length &&
                        this.levels == other.levels &&
                        this.points == other.points &&
                        this.additionalProperties == other.additionalProperties
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                length,
                                levels,
                                points,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = StopGrouping.Builder::class)
            @NoAutoDetect
            class StopGrouping
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<Name>,
                private val polylines: JsonField<List<Polyline>>,
                private val stopIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

                fun name(): Optional<Name> = Optional.ofNullable(name.getNullable("name"))

                fun polylines(): Optional<List<Polyline>> =
                    Optional.ofNullable(polylines.getNullable("polylines"))

                fun stopIds(): Optional<List<String>> =
                    Optional.ofNullable(stopIds.getNullable("stopIds"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("polylines") @ExcludeMissing fun _polylines() = polylines

                @JsonProperty("stopIds") @ExcludeMissing fun _stopIds() = stopIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): StopGrouping = apply {
                    if (!validated) {
                        id()
                        name().map { it.validate() }
                        polylines().map { it.forEach { it.validate() } }
                        stopIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<Name> = JsonMissing.of()
                    private var polylines: JsonField<List<Polyline>> = JsonMissing.of()
                    private var stopIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopGrouping: StopGrouping) = apply {
                        this.id = stopGrouping.id
                        this.name = stopGrouping.name
                        this.polylines = stopGrouping.polylines
                        this.stopIds = stopGrouping.stopIds
                        additionalProperties(stopGrouping.additionalProperties)
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: Name) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<Name>) = apply { this.name = name }

                    fun polylines(polylines: List<Polyline>) = polylines(JsonField.of(polylines))

                    @JsonProperty("polylines")
                    @ExcludeMissing
                    fun polylines(polylines: JsonField<List<Polyline>>) = apply {
                        this.polylines = polylines
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    @JsonProperty("stopIds")
                    @ExcludeMissing
                    fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

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

                    fun build(): StopGrouping =
                        StopGrouping(
                            id,
                            name,
                            polylines.map { it.toUnmodifiable() },
                            stopIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = Name.Builder::class)
                @NoAutoDetect
                class Name
                private constructor(
                    private val name: JsonField<String>,
                    private val names: JsonField<List<String>>,
                    private val type: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    fun names(): Optional<List<String>> =
                        Optional.ofNullable(names.getNullable("names"))

                    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonProperty("names") @ExcludeMissing fun _names() = names

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Name = apply {
                        if (!validated) {
                            name()
                            names()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var names: JsonField<List<String>> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(name: Name) = apply {
                            this.name = name.name
                            this.names = name.names
                            this.type = name.type
                            additionalProperties(name.additionalProperties)
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun names(names: List<String>) = names(JsonField.of(names))

                        @JsonProperty("names")
                        @ExcludeMissing
                        fun names(names: JsonField<List<String>>) = apply { this.names = names }

                        fun type(type: String) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<String>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Name =
                            Name(
                                name,
                                names.map { it.toUnmodifiable() },
                                type,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Name &&
                            this.name == other.name &&
                            this.names == other.names &&
                            this.type == other.type &&
                            this.additionalProperties == other.additionalProperties
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    name,
                                    names,
                                    type,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Name{name=$name, names=$names, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Polyline.Builder::class)
                @NoAutoDetect
                class Polyline
                private constructor(
                    private val length: JsonField<Long>,
                    private val levels: JsonField<String>,
                    private val points: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun length(): Optional<Long> = Optional.ofNullable(length.getNullable("length"))

                    fun levels(): Optional<String> =
                        Optional.ofNullable(levels.getNullable("levels"))

                    fun points(): Optional<String> =
                        Optional.ofNullable(points.getNullable("points"))

                    @JsonProperty("length") @ExcludeMissing fun _length() = length

                    @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                    @JsonProperty("points") @ExcludeMissing fun _points() = points

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Polyline = apply {
                        if (!validated) {
                            length()
                            levels()
                            points()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(polyline: Polyline) = apply {
                            this.length = polyline.length
                            this.levels = polyline.levels
                            this.points = polyline.points
                            additionalProperties(polyline.additionalProperties)
                        }

                        fun length(length: Long) = length(JsonField.of(length))

                        @JsonProperty("length")
                        @ExcludeMissing
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        fun levels(levels: String) = levels(JsonField.of(levels))

                        @JsonProperty("levels")
                        @ExcludeMissing
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        fun points(points: String) = points(JsonField.of(points))

                        @JsonProperty("points")
                        @ExcludeMissing
                        fun points(points: JsonField<String>) = apply { this.points = points }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Polyline =
                            Polyline(
                                length,
                                levels,
                                points,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Polyline &&
                            this.length == other.length &&
                            this.levels == other.levels &&
                            this.points == other.points &&
                            this.additionalProperties == other.additionalProperties
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    length,
                                    levels,
                                    points,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Polyline{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopGrouping &&
                        this.id == other.id &&
                        this.name == other.name &&
                        this.polylines == other.polylines &&
                        this.stopIds == other.stopIds &&
                        this.additionalProperties == other.additionalProperties
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                name,
                                polylines,
                                stopIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "StopGrouping{id=$id, name=$name, polylines=$polylines, stopIds=$stopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    this.polylines == other.polylines &&
                    this.routeId == other.routeId &&
                    this.stopGroupings == other.stopGroupings &&
                    this.stopIds == other.stopIds &&
                    this.additionalProperties == other.additionalProperties
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            polylines,
                            routeId,
                            stopGroupings,
                            stopIds,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Entry{polylines=$polylines, routeId=$routeId, stopGroupings=$stopGroupings, stopIds=$stopIds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.entry == other.entry &&
                this.references == other.references &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StopsForRouteListResponse &&
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
        "StopsForRouteListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
