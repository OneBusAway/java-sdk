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
class StopsForAgencyListResponse
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
    @JsonProperty("limitExceeded")
    @ExcludeMissing
    private val limitExceeded: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("list")
    @ExcludeMissing
    private val list: JsonField<kotlin.collections.List<List>> = JsonMissing.of(),
    @JsonProperty("references")
    @ExcludeMissing
    private val references: JsonField<References> = JsonMissing.of(),
    @JsonProperty("outOfRange")
    @ExcludeMissing
    private val outOfRange: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

    fun list(): kotlin.collections.List<List> = list.getRequired("list")

    fun references(): References = references.getRequired("references")

    fun outOfRange(): Optional<Boolean> = Optional.ofNullable(outOfRange.getNullable("outOfRange"))

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime(): JsonField<Long> = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("limitExceeded")
    @ExcludeMissing
    fun _limitExceeded(): JsonField<Boolean> = limitExceeded

    @JsonProperty("list")
    @ExcludeMissing
    fun _list(): JsonField<kotlin.collections.List<List>> = list

    @JsonProperty("references")
    @ExcludeMissing
    fun _references(): JsonField<References> = references

    @JsonProperty("outOfRange") @ExcludeMissing fun _outOfRange(): JsonField<Boolean> = outOfRange

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

    fun validate(): StopsForAgencyListResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        currentTime()
        text()
        version()
        limitExceeded()
        list().forEach { it.validate() }
        references().validate()
        outOfRange()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StopsForAgencyListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var limitExceeded: JsonField<Boolean>? = null
        private var list: JsonField<MutableList<List>>? = null
        private var references: JsonField<References>? = null
        private var outOfRange: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopsForAgencyListResponse: StopsForAgencyListResponse) = apply {
            code = stopsForAgencyListResponse.code
            currentTime = stopsForAgencyListResponse.currentTime
            text = stopsForAgencyListResponse.text
            version = stopsForAgencyListResponse.version
            limitExceeded = stopsForAgencyListResponse.limitExceeded
            list = stopsForAgencyListResponse.list.map { it.toMutableList() }
            references = stopsForAgencyListResponse.references
            outOfRange = stopsForAgencyListResponse.outOfRange
            additionalProperties = stopsForAgencyListResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        fun currentTime(currentTime: JsonField<Long>) = apply { this.currentTime = currentTime }

        fun text(text: String) = text(JsonField.of(text))

        fun text(text: JsonField<String>) = apply { this.text = text }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        fun references(references: JsonField<References>) = apply { this.references = references }

        fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

        fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

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

        fun build(): StopsForAgencyListResponse =
            StopsForAgencyListResponse(
                checkRequired("code", code),
                checkRequired("currentTime", currentTime),
                checkRequired("text", text),
                checkRequired("version", version),
                checkRequired("limitExceeded", limitExceeded),
                checkRequired("list", list).map { it.toImmutable() },
                checkRequired("references", references),
                outOfRange,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class List
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routeIds")
        @ExcludeMissing
        private val routeIds: JsonField<kotlin.collections.List<String>> = JsonMissing.of(),
        @JsonProperty("staticRouteIds")
        @ExcludeMissing
        private val staticRouteIds: JsonField<kotlin.collections.List<String>> = JsonMissing.of(),
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

        fun routeIds(): kotlin.collections.List<String> = routeIds.getRequired("routeIds")

        fun staticRouteIds(): kotlin.collections.List<String> =
            staticRouteIds.getRequired("staticRouteIds")

        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        fun direction(): Optional<String> = Optional.ofNullable(direction.getNullable("direction"))

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
        fun _routeIds(): JsonField<kotlin.collections.List<String>> = routeIds

        @JsonProperty("staticRouteIds")
        @ExcludeMissing
        fun _staticRouteIds(): JsonField<kotlin.collections.List<String>> = staticRouteIds

        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

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

        fun validate(): List = apply {
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

        /** A builder for [List]. */
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
            internal fun from(list: List) = apply {
                id = list.id
                lat = list.lat
                lon = list.lon
                name = list.name
                parent = list.parent
                routeIds = list.routeIds.map { it.toMutableList() }
                staticRouteIds = list.staticRouteIds.map { it.toMutableList() }
                code = list.code
                direction = list.direction
                locationType = list.locationType
                wheelchairBoarding = list.wheelchairBoarding
                additionalProperties = list.additionalProperties.toMutableMap()
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

            fun routeIds(routeIds: kotlin.collections.List<String>) =
                routeIds(JsonField.of(routeIds))

            fun routeIds(routeIds: JsonField<kotlin.collections.List<String>>) = apply {
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

            fun staticRouteIds(staticRouteIds: kotlin.collections.List<String>) =
                staticRouteIds(JsonField.of(staticRouteIds))

            fun staticRouteIds(staticRouteIds: JsonField<kotlin.collections.List<String>>) = apply {
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): List =
                List(
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

            return /* spotless:off */ other is List && id == other.id && lat == other.lat && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && locationType == other.locationType && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, lat, lon, name, parent, routeIds, staticRouteIds, code, direction, locationType, wheelchairBoarding, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "List{id=$id, lat=$lat, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, locationType=$locationType, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForAgencyListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && limitExceeded == other.limitExceeded && list == other.list && references == other.references && outOfRange == other.outOfRange && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, limitExceeded, list, references, outOfRange, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopsForAgencyListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, limitExceeded=$limitExceeded, list=$list, references=$references, outOfRange=$outOfRange, additionalProperties=$additionalProperties}"
}
