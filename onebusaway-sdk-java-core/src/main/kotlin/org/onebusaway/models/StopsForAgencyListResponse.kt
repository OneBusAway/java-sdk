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

@JsonDeserialize(builder = StopsForAgencyListResponse.Builder::class)
@NoAutoDetect
class StopsForAgencyListResponse
private constructor(
    private val code: JsonField<Long>,
    private val currentTime: JsonField<Long>,
    private val text: JsonField<String>,
    private val version: JsonField<Long>,
    private val limitExceeded: JsonField<Boolean>,
    private val outOfRange: JsonField<Boolean>,
    private val list: JsonField<List<List>>,
    private val references: JsonField<References>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun limitExceeded(): Boolean = limitExceeded.getRequired("limitExceeded")

    fun outOfRange(): Optional<Boolean> = Optional.ofNullable(outOfRange.getNullable("outOfRange"))

    fun list(): List<List> = list.getRequired("list")

    fun references(): References = references.getRequired("references")

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

    @JsonProperty("limitExceeded") @ExcludeMissing fun _limitExceeded() = limitExceeded

    @JsonProperty("outOfRange") @ExcludeMissing fun _outOfRange() = outOfRange

    @JsonProperty("list") @ExcludeMissing fun _list() = list

    @JsonProperty("references") @ExcludeMissing fun _references() = references

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): StopsForAgencyListResponse = apply {
        if (!validated) {
            code()
            currentTime()
            text()
            version()
            limitExceeded()
            outOfRange()
            list().forEach { it.validate() }
            references().validate()
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
        private var limitExceeded: JsonField<Boolean> = JsonMissing.of()
        private var outOfRange: JsonField<Boolean> = JsonMissing.of()
        private var list: JsonField<List<List>> = JsonMissing.of()
        private var references: JsonField<References> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopsForAgencyListResponse: StopsForAgencyListResponse) = apply {
            this.code = stopsForAgencyListResponse.code
            this.currentTime = stopsForAgencyListResponse.currentTime
            this.text = stopsForAgencyListResponse.text
            this.version = stopsForAgencyListResponse.version
            this.limitExceeded = stopsForAgencyListResponse.limitExceeded
            this.outOfRange = stopsForAgencyListResponse.outOfRange
            this.list = stopsForAgencyListResponse.list
            this.references = stopsForAgencyListResponse.references
            additionalProperties(stopsForAgencyListResponse.additionalProperties)
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

        fun limitExceeded(limitExceeded: Boolean) = limitExceeded(JsonField.of(limitExceeded))

        @JsonProperty("limitExceeded")
        @ExcludeMissing
        fun limitExceeded(limitExceeded: JsonField<Boolean>) = apply {
            this.limitExceeded = limitExceeded
        }

        fun outOfRange(outOfRange: Boolean) = outOfRange(JsonField.of(outOfRange))

        @JsonProperty("outOfRange")
        @ExcludeMissing
        fun outOfRange(outOfRange: JsonField<Boolean>) = apply { this.outOfRange = outOfRange }

        fun list(list: List<List>) = list(JsonField.of(list))

        @JsonProperty("list")
        @ExcludeMissing
        fun list(list: JsonField<List<List>>) = apply { this.list = list }

        fun references(references: References) = references(JsonField.of(references))

        @JsonProperty("references")
        @ExcludeMissing
        fun references(references: JsonField<References>) = apply { this.references = references }

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

        fun build(): StopsForAgencyListResponse =
            StopsForAgencyListResponse(
                code,
                currentTime,
                text,
                version,
                limitExceeded,
                outOfRange,
                list.map { it.toImmutable() },
                references,
                additionalProperties.toImmutable(),
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
        private val routeIds: JsonField<List<String>>,
        private val staticRouteIds: JsonField<List<String>>,
        private val wheelchairBoarding: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        fun direction(): Optional<String> = Optional.ofNullable(direction.getNullable("direction"))

        fun id(): String = id.getRequired("id")

        fun lat(): Double = lat.getRequired("lat")

        fun locationType(): Optional<Long> =
            Optional.ofNullable(locationType.getNullable("locationType"))

        fun lon(): Double = lon.getRequired("lon")

        fun name(): String = name.getRequired("name")

        fun parent(): String = parent.getRequired("parent")

        fun routeIds(): List<String> = routeIds.getRequired("routeIds")

        fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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

            return /* spotless:off */ other is List && code == other.code && direction == other.direction && id == other.id && lat == other.lat && locationType == other.locationType && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, direction, id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, wheelchairBoarding, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "List{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StopsForAgencyListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && limitExceeded == other.limitExceeded && outOfRange == other.outOfRange && list == other.list && references == other.references && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, limitExceeded, outOfRange, list, references, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopsForAgencyListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, limitExceeded=$limitExceeded, outOfRange=$outOfRange, list=$list, references=$references, additionalProperties=$additionalProperties}"
}
