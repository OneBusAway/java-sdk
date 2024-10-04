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

@JsonDeserialize(builder = TripRetrieveResponse.Builder::class)
@NoAutoDetect
class TripRetrieveResponse
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
            this.code = tripRetrieveResponse.code
            this.currentTime = tripRetrieveResponse.currentTime
            this.text = tripRetrieveResponse.text
            this.version = tripRetrieveResponse.version
            this.data = tripRetrieveResponse.data
            additionalProperties(tripRetrieveResponse.additionalProperties)
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

        fun build(): TripRetrieveResponse =
            TripRetrieveResponse(
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
            private val blockId: JsonField<String>,
            private val directionId: JsonField<String>,
            private val id: JsonField<String>,
            private val peakOffpeak: JsonField<Long>,
            private val routeId: JsonField<String>,
            private val routeShortName: JsonField<String>,
            private val serviceId: JsonField<String>,
            private val shapeId: JsonField<String>,
            private val timeZone: JsonField<String>,
            private val tripHeadsign: JsonField<String>,
            private val tripShortName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
                    this.blockId = entry.blockId
                    this.directionId = entry.directionId
                    this.id = entry.id
                    this.peakOffpeak = entry.peakOffpeak
                    this.routeId = entry.routeId
                    this.routeShortName = entry.routeShortName
                    this.serviceId = entry.serviceId
                    this.shapeId = entry.shapeId
                    this.timeZone = entry.timeZone
                    this.tripHeadsign = entry.tripHeadsign
                    this.tripShortName = entry.tripShortName
                    additionalProperties(entry.additionalProperties)
                }

                fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                @JsonProperty("blockId")
                @ExcludeMissing
                fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                @JsonProperty("directionId")
                @ExcludeMissing
                fun directionId(directionId: JsonField<String>) = apply {
                    this.directionId = directionId
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

                @JsonProperty("peakOffpeak")
                @ExcludeMissing
                fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply {
                    this.peakOffpeak = peakOffpeak
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                @JsonProperty("routeId")
                @ExcludeMissing
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun routeShortName(routeShortName: String) =
                    routeShortName(JsonField.of(routeShortName))

                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun routeShortName(routeShortName: JsonField<String>) = apply {
                    this.routeShortName = routeShortName
                }

                fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                @JsonProperty("serviceId")
                @ExcludeMissing
                fun serviceId(serviceId: JsonField<String>) = apply { this.serviceId = serviceId }

                fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                @JsonProperty("shapeId")
                @ExcludeMissing
                fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                @JsonProperty("timeZone")
                @ExcludeMissing
                fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                    this.tripHeadsign = tripHeadsign
                }

                fun tripShortName(tripShortName: String) =
                    tripShortName(JsonField.of(tripShortName))

                @JsonProperty("tripShortName")
                @ExcludeMissing
                fun tripShortName(tripShortName: JsonField<String>) = apply {
                    this.tripShortName = tripShortName
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
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && this.blockId == other.blockId && this.directionId == other.directionId && this.id == other.id && this.peakOffpeak == other.peakOffpeak && this.routeId == other.routeId && this.routeShortName == other.routeShortName && this.serviceId == other.serviceId && this.shapeId == other.shapeId && this.timeZone == other.timeZone && this.tripHeadsign == other.tripHeadsign && this.tripShortName == other.tripShortName && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(blockId, directionId, id, peakOffpeak, routeId, routeShortName, serviceId, shapeId, timeZone, tripHeadsign, tripShortName, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Entry{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is TripRetrieveResponse && this.code == other.code && this.currentTime == other.currentTime && this.text == other.text && this.version == other.version && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(code, currentTime, text, version, data, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "TripRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
