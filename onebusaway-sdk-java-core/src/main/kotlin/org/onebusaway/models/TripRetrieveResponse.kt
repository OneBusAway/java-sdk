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
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class TripRetrieveResponse
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

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("currentTime") @ExcludeMissing fun _currentTime() = currentTime

    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("data") @ExcludeMissing fun _data() = data

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

    fun validate(): TripRetrieveResponse = apply {
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
        internal fun from(tripRetrieveResponse: TripRetrieveResponse) = apply {
            code = tripRetrieveResponse.code
            currentTime = tripRetrieveResponse.currentTime
            text = tripRetrieveResponse.text
            version = tripRetrieveResponse.version
            data = tripRetrieveResponse.data
            additionalProperties = tripRetrieveResponse.additionalProperties.toMutableMap()
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

        fun build(): TripRetrieveResponse =
            TripRetrieveResponse(
                code,
                currentTime,
                text,
                version,
                data,
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

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonProperty("references") @ExcludeMissing fun _references() = references

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                    entry,
                    references,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("blockId")
            @ExcludeMissing
            private val blockId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("directionId")
            @ExcludeMissing
            private val directionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("peakOffpeak")
            @ExcludeMissing
            private val peakOffpeak: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("routeId")
            @ExcludeMissing
            private val routeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routeShortName")
            @ExcludeMissing
            private val routeShortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceId")
            @ExcludeMissing
            private val serviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shapeId")
            @ExcludeMissing
            private val shapeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeZone")
            @ExcludeMissing
            private val timeZone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripHeadsign")
            @ExcludeMissing
            private val tripHeadsign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripShortName")
            @ExcludeMissing
            private val tripShortName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun blockId(): Optional<String> = Optional.ofNullable(blockId.getNullable("blockId"))

            fun directionId(): Optional<String> =
                Optional.ofNullable(directionId.getNullable("directionId"))

            fun id(): String = id.getRequired("id")

            fun peakOffpeak(): Optional<Long> =
                Optional.ofNullable(peakOffpeak.getNullable("peakOffpeak"))

            fun routeId(): String = routeId.getRequired("routeId")

            fun routeShortName(): Optional<String> =
                Optional.ofNullable(routeShortName.getNullable("routeShortName"))

            fun serviceId(): String = serviceId.getRequired("serviceId")

            fun shapeId(): Optional<String> = Optional.ofNullable(shapeId.getNullable("shapeId"))

            fun timeZone(): Optional<String> = Optional.ofNullable(timeZone.getNullable("timeZone"))

            fun tripHeadsign(): Optional<String> =
                Optional.ofNullable(tripHeadsign.getNullable("tripHeadsign"))

            fun tripShortName(): Optional<String> =
                Optional.ofNullable(tripShortName.getNullable("tripShortName"))

            @JsonProperty("blockId") @ExcludeMissing fun _blockId() = blockId

            @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("peakOffpeak") @ExcludeMissing fun _peakOffpeak() = peakOffpeak

            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            @JsonProperty("routeShortName") @ExcludeMissing fun _routeShortName() = routeShortName

            @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

            @JsonProperty("shapeId") @ExcludeMissing fun _shapeId() = shapeId

            @JsonProperty("timeZone") @ExcludeMissing fun _timeZone() = timeZone

            @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

            @JsonProperty("tripShortName") @ExcludeMissing fun _tripShortName() = tripShortName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (!validated) {
                    blockId()
                    directionId()
                    id()
                    peakOffpeak()
                    routeId()
                    routeShortName()
                    serviceId()
                    shapeId()
                    timeZone()
                    tripHeadsign()
                    tripShortName()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var blockId: JsonField<String> = JsonMissing.of()
                private var directionId: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var peakOffpeak: JsonField<Long> = JsonMissing.of()
                private var routeId: JsonField<String> = JsonMissing.of()
                private var routeShortName: JsonField<String> = JsonMissing.of()
                private var serviceId: JsonField<String> = JsonMissing.of()
                private var shapeId: JsonField<String> = JsonMissing.of()
                private var timeZone: JsonField<String> = JsonMissing.of()
                private var tripHeadsign: JsonField<String> = JsonMissing.of()
                private var tripShortName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    blockId = entry.blockId
                    directionId = entry.directionId
                    id = entry.id
                    peakOffpeak = entry.peakOffpeak
                    routeId = entry.routeId
                    routeShortName = entry.routeShortName
                    serviceId = entry.serviceId
                    shapeId = entry.shapeId
                    timeZone = entry.timeZone
                    tripHeadsign = entry.tripHeadsign
                    tripShortName = entry.tripShortName
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                fun directionId(directionId: JsonField<String>) = apply {
                    this.directionId = directionId
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

                fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply {
                    this.peakOffpeak = peakOffpeak
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun routeShortName(routeShortName: String) =
                    routeShortName(JsonField.of(routeShortName))

                fun routeShortName(routeShortName: JsonField<String>) = apply {
                    this.routeShortName = routeShortName
                }

                fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                fun serviceId(serviceId: JsonField<String>) = apply { this.serviceId = serviceId }

                fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

                fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                    this.tripHeadsign = tripHeadsign
                }

                fun tripShortName(tripShortName: String) =
                    tripShortName(JsonField.of(tripShortName))

                fun tripShortName(tripShortName: JsonField<String>) = apply {
                    this.tripShortName = tripShortName
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
                        blockId,
                        directionId,
                        id,
                        peakOffpeak,
                        routeId,
                        routeShortName,
                        serviceId,
                        shapeId,
                        timeZone,
                        tripHeadsign,
                        tripShortName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && blockId == other.blockId && directionId == other.directionId && id == other.id && peakOffpeak == other.peakOffpeak && routeId == other.routeId && routeShortName == other.routeShortName && serviceId == other.serviceId && shapeId == other.shapeId && timeZone == other.timeZone && tripHeadsign == other.tripHeadsign && tripShortName == other.tripShortName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(blockId, directionId, id, peakOffpeak, routeId, routeShortName, serviceId, shapeId, timeZone, tripHeadsign, tripShortName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is TripRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TripRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
