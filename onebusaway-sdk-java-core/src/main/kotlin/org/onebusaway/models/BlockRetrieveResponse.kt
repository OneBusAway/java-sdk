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
class BlockRetrieveResponse
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

    fun validate(): BlockRetrieveResponse = apply {
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
        internal fun from(blockRetrieveResponse: BlockRetrieveResponse) = apply {
            code = blockRetrieveResponse.code
            currentTime = blockRetrieveResponse.currentTime
            text = blockRetrieveResponse.text
            version = blockRetrieveResponse.version
            data = blockRetrieveResponse.data
            additionalProperties = blockRetrieveResponse.additionalProperties.toMutableMap()
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

        fun build(): BlockRetrieveResponse =
            BlockRetrieveResponse(
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
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configurations")
            @ExcludeMissing
            private val configurations: JsonField<List<Configuration>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun configurations(): List<Configuration> = configurations.getRequired("configurations")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("configurations") @ExcludeMissing fun _configurations() = configurations

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (!validated) {
                    id()
                    configurations().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var configurations: JsonField<List<Configuration>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    configurations = entry.configurations
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun configurations(configurations: List<Configuration>) =
                    configurations(JsonField.of(configurations))

                fun configurations(configurations: JsonField<List<Configuration>>) = apply {
                    this.configurations = configurations
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
                        id,
                        configurations.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Configuration
            @JsonCreator
            private constructor(
                @JsonProperty("activeServiceIds")
                @ExcludeMissing
                private val activeServiceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                private val inactiveServiceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("trips")
                @ExcludeMissing
                private val trips: JsonField<List<Trip>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun activeServiceIds(): List<String> =
                    activeServiceIds.getRequired("activeServiceIds")

                fun inactiveServiceIds(): Optional<List<String>> =
                    Optional.ofNullable(inactiveServiceIds.getNullable("inactiveServiceIds"))

                fun trips(): List<Trip> = trips.getRequired("trips")

                @JsonProperty("activeServiceIds")
                @ExcludeMissing
                fun _activeServiceIds() = activeServiceIds

                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                fun _inactiveServiceIds() = inactiveServiceIds

                @JsonProperty("trips") @ExcludeMissing fun _trips() = trips

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Configuration = apply {
                    if (!validated) {
                        activeServiceIds()
                        inactiveServiceIds()
                        trips().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var activeServiceIds: JsonField<List<String>> = JsonMissing.of()
                    private var inactiveServiceIds: JsonField<List<String>> = JsonMissing.of()
                    private var trips: JsonField<List<Trip>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(configuration: Configuration) = apply {
                        activeServiceIds = configuration.activeServiceIds
                        inactiveServiceIds = configuration.inactiveServiceIds
                        trips = configuration.trips
                        additionalProperties = configuration.additionalProperties.toMutableMap()
                    }

                    fun activeServiceIds(activeServiceIds: List<String>) =
                        activeServiceIds(JsonField.of(activeServiceIds))

                    fun activeServiceIds(activeServiceIds: JsonField<List<String>>) = apply {
                        this.activeServiceIds = activeServiceIds
                    }

                    fun inactiveServiceIds(inactiveServiceIds: List<String>) =
                        inactiveServiceIds(JsonField.of(inactiveServiceIds))

                    fun inactiveServiceIds(inactiveServiceIds: JsonField<List<String>>) = apply {
                        this.inactiveServiceIds = inactiveServiceIds
                    }

                    fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                    fun trips(trips: JsonField<List<Trip>>) = apply { this.trips = trips }

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

                    fun build(): Configuration =
                        Configuration(
                            activeServiceIds.map { it.toImmutable() },
                            inactiveServiceIds.map { it.toImmutable() },
                            trips.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Trip
                @JsonCreator
                private constructor(
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    private val tripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("distanceAlongBlock")
                    @ExcludeMissing
                    private val distanceAlongBlock: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("accumulatedSlackTime")
                    @ExcludeMissing
                    private val accumulatedSlackTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("blockStopTimes")
                    @ExcludeMissing
                    private val blockStopTimes: JsonField<List<BlockStopTime>> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun tripId(): String = tripId.getRequired("tripId")

                    fun distanceAlongBlock(): Double =
                        distanceAlongBlock.getRequired("distanceAlongBlock")

                    fun accumulatedSlackTime(): Double =
                        accumulatedSlackTime.getRequired("accumulatedSlackTime")

                    fun blockStopTimes(): List<BlockStopTime> =
                        blockStopTimes.getRequired("blockStopTimes")

                    @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                    @JsonProperty("distanceAlongBlock")
                    @ExcludeMissing
                    fun _distanceAlongBlock() = distanceAlongBlock

                    @JsonProperty("accumulatedSlackTime")
                    @ExcludeMissing
                    fun _accumulatedSlackTime() = accumulatedSlackTime

                    @JsonProperty("blockStopTimes")
                    @ExcludeMissing
                    fun _blockStopTimes() = blockStopTimes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Trip = apply {
                        if (!validated) {
                            tripId()
                            distanceAlongBlock()
                            accumulatedSlackTime()
                            blockStopTimes().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var tripId: JsonField<String> = JsonMissing.of()
                        private var distanceAlongBlock: JsonField<Double> = JsonMissing.of()
                        private var accumulatedSlackTime: JsonField<Double> = JsonMissing.of()
                        private var blockStopTimes: JsonField<List<BlockStopTime>> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(trip: Trip) = apply {
                            tripId = trip.tripId
                            distanceAlongBlock = trip.distanceAlongBlock
                            accumulatedSlackTime = trip.accumulatedSlackTime
                            blockStopTimes = trip.blockStopTimes
                            additionalProperties = trip.additionalProperties.toMutableMap()
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                        fun distanceAlongBlock(distanceAlongBlock: Double) =
                            distanceAlongBlock(JsonField.of(distanceAlongBlock))

                        fun distanceAlongBlock(distanceAlongBlock: JsonField<Double>) = apply {
                            this.distanceAlongBlock = distanceAlongBlock
                        }

                        fun accumulatedSlackTime(accumulatedSlackTime: Double) =
                            accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                        fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) = apply {
                            this.accumulatedSlackTime = accumulatedSlackTime
                        }

                        fun blockStopTimes(blockStopTimes: List<BlockStopTime>) =
                            blockStopTimes(JsonField.of(blockStopTimes))

                        fun blockStopTimes(blockStopTimes: JsonField<List<BlockStopTime>>) = apply {
                            this.blockStopTimes = blockStopTimes
                        }

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

                        fun build(): Trip =
                            Trip(
                                tripId,
                                distanceAlongBlock,
                                accumulatedSlackTime,
                                blockStopTimes.map { it.toImmutable() },
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class BlockStopTime
                    @JsonCreator
                    private constructor(
                        @JsonProperty("blockSequence")
                        @ExcludeMissing
                        private val blockSequence: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        private val distanceAlongBlock: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        private val accumulatedSlackTime: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("stopTime")
                        @ExcludeMissing
                        private val stopTime: JsonField<StopTime> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun blockSequence(): Long = blockSequence.getRequired("blockSequence")

                        fun distanceAlongBlock(): Double =
                            distanceAlongBlock.getRequired("distanceAlongBlock")

                        fun accumulatedSlackTime(): Double =
                            accumulatedSlackTime.getRequired("accumulatedSlackTime")

                        fun stopTime(): StopTime = stopTime.getRequired("stopTime")

                        @JsonProperty("blockSequence")
                        @ExcludeMissing
                        fun _blockSequence() = blockSequence

                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        fun _distanceAlongBlock() = distanceAlongBlock

                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        fun _accumulatedSlackTime() = accumulatedSlackTime

                        @JsonProperty("stopTime") @ExcludeMissing fun _stopTime() = stopTime

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): BlockStopTime = apply {
                            if (!validated) {
                                blockSequence()
                                distanceAlongBlock()
                                accumulatedSlackTime()
                                stopTime().validate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var blockSequence: JsonField<Long> = JsonMissing.of()
                            private var distanceAlongBlock: JsonField<Double> = JsonMissing.of()
                            private var accumulatedSlackTime: JsonField<Double> = JsonMissing.of()
                            private var stopTime: JsonField<StopTime> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(blockStopTime: BlockStopTime) = apply {
                                blockSequence = blockStopTime.blockSequence
                                distanceAlongBlock = blockStopTime.distanceAlongBlock
                                accumulatedSlackTime = blockStopTime.accumulatedSlackTime
                                stopTime = blockStopTime.stopTime
                                additionalProperties =
                                    blockStopTime.additionalProperties.toMutableMap()
                            }

                            fun blockSequence(blockSequence: Long) =
                                blockSequence(JsonField.of(blockSequence))

                            fun blockSequence(blockSequence: JsonField<Long>) = apply {
                                this.blockSequence = blockSequence
                            }

                            fun distanceAlongBlock(distanceAlongBlock: Double) =
                                distanceAlongBlock(JsonField.of(distanceAlongBlock))

                            fun distanceAlongBlock(distanceAlongBlock: JsonField<Double>) = apply {
                                this.distanceAlongBlock = distanceAlongBlock
                            }

                            fun accumulatedSlackTime(accumulatedSlackTime: Double) =
                                accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                            fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) =
                                apply {
                                    this.accumulatedSlackTime = accumulatedSlackTime
                                }

                            fun stopTime(stopTime: StopTime) = stopTime(JsonField.of(stopTime))

                            fun stopTime(stopTime: JsonField<StopTime>) = apply {
                                this.stopTime = stopTime
                            }

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

                            fun build(): BlockStopTime =
                                BlockStopTime(
                                    blockSequence,
                                    distanceAlongBlock,
                                    accumulatedSlackTime,
                                    stopTime,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @NoAutoDetect
                        class StopTime
                        @JsonCreator
                        private constructor(
                            @JsonProperty("stopId")
                            @ExcludeMissing
                            private val stopId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            private val arrivalTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            private val departureTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("pickupType")
                            @ExcludeMissing
                            private val pickupType: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("dropOffType")
                            @ExcludeMissing
                            private val dropOffType: JsonField<Long> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun stopId(): String = stopId.getRequired("stopId")

                            fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                            fun departureTime(): Long = departureTime.getRequired("departureTime")

                            fun pickupType(): Optional<Long> =
                                Optional.ofNullable(pickupType.getNullable("pickupType"))

                            fun dropOffType(): Optional<Long> =
                                Optional.ofNullable(dropOffType.getNullable("dropOffType"))

                            @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            fun _arrivalTime() = arrivalTime

                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            fun _departureTime() = departureTime

                            @JsonProperty("pickupType")
                            @ExcludeMissing
                            fun _pickupType() = pickupType

                            @JsonProperty("dropOffType")
                            @ExcludeMissing
                            fun _dropOffType() = dropOffType

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): StopTime = apply {
                                if (!validated) {
                                    stopId()
                                    arrivalTime()
                                    departureTime()
                                    pickupType()
                                    dropOffType()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var stopId: JsonField<String> = JsonMissing.of()
                                private var arrivalTime: JsonField<Long> = JsonMissing.of()
                                private var departureTime: JsonField<Long> = JsonMissing.of()
                                private var pickupType: JsonField<Long> = JsonMissing.of()
                                private var dropOffType: JsonField<Long> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(stopTime: StopTime) = apply {
                                    stopId = stopTime.stopId
                                    arrivalTime = stopTime.arrivalTime
                                    departureTime = stopTime.departureTime
                                    pickupType = stopTime.pickupType
                                    dropOffType = stopTime.dropOffType
                                    additionalProperties =
                                        stopTime.additionalProperties.toMutableMap()
                                }

                                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                                fun stopId(stopId: JsonField<String>) = apply {
                                    this.stopId = stopId
                                }

                                fun arrivalTime(arrivalTime: Long) =
                                    arrivalTime(JsonField.of(arrivalTime))

                                fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                    this.arrivalTime = arrivalTime
                                }

                                fun departureTime(departureTime: Long) =
                                    departureTime(JsonField.of(departureTime))

                                fun departureTime(departureTime: JsonField<Long>) = apply {
                                    this.departureTime = departureTime
                                }

                                fun pickupType(pickupType: Long) =
                                    pickupType(JsonField.of(pickupType))

                                fun pickupType(pickupType: JsonField<Long>) = apply {
                                    this.pickupType = pickupType
                                }

                                fun dropOffType(dropOffType: Long) =
                                    dropOffType(JsonField.of(dropOffType))

                                fun dropOffType(dropOffType: JsonField<Long>) = apply {
                                    this.dropOffType = dropOffType
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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

                                fun build(): StopTime =
                                    StopTime(
                                        stopId,
                                        arrivalTime,
                                        departureTime,
                                        pickupType,
                                        dropOffType,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is StopTime && stopId == other.stopId && arrivalTime == other.arrivalTime && departureTime == other.departureTime && pickupType == other.pickupType && dropOffType == other.dropOffType && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(stopId, arrivalTime, departureTime, pickupType, dropOffType, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "StopTime{stopId=$stopId, arrivalTime=$arrivalTime, departureTime=$departureTime, pickupType=$pickupType, dropOffType=$dropOffType, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is BlockStopTime && blockSequence == other.blockSequence && distanceAlongBlock == other.distanceAlongBlock && accumulatedSlackTime == other.accumulatedSlackTime && stopTime == other.stopTime && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(blockSequence, distanceAlongBlock, accumulatedSlackTime, stopTime, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "BlockStopTime{blockSequence=$blockSequence, distanceAlongBlock=$distanceAlongBlock, accumulatedSlackTime=$accumulatedSlackTime, stopTime=$stopTime, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Trip && tripId == other.tripId && distanceAlongBlock == other.distanceAlongBlock && accumulatedSlackTime == other.accumulatedSlackTime && blockStopTimes == other.blockStopTimes && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tripId, distanceAlongBlock, accumulatedSlackTime, blockStopTimes, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Trip{tripId=$tripId, distanceAlongBlock=$distanceAlongBlock, accumulatedSlackTime=$accumulatedSlackTime, blockStopTimes=$blockStopTimes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Configuration && activeServiceIds == other.activeServiceIds && inactiveServiceIds == other.inactiveServiceIds && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(activeServiceIds, inactiveServiceIds, trips, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Configuration{activeServiceIds=$activeServiceIds, inactiveServiceIds=$inactiveServiceIds, trips=$trips, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && id == other.id && configurations == other.configurations && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, configurations, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, configurations=$configurations, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is BlockRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlockRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
