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

    fun validate(): BlockRetrieveResponse = apply {
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

    /** A builder for [BlockRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
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
            @JsonProperty("configurations")
            @ExcludeMissing
            private val configurations: JsonField<List<Configuration>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun configurations(): List<Configuration> = configurations.getRequired("configurations")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("configurations")
            @ExcludeMissing
            fun _configurations(): JsonField<List<Configuration>> = configurations

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                configurations().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var configurations: JsonField<MutableList<Configuration>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    configurations = entry.configurations.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun configurations(configurations: List<Configuration>) =
                    configurations(JsonField.of(configurations))

                fun configurations(configurations: JsonField<List<Configuration>>) = apply {
                    this.configurations = configurations.map { it.toMutableList() }
                }

                fun addConfiguration(configuration: Configuration) = apply {
                    configurations =
                        (configurations ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(configuration)
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
                        checkRequired("id", id),
                        checkRequired("configurations", configurations).map { it.toImmutable() },
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
                @JsonProperty("trips")
                @ExcludeMissing
                private val trips: JsonField<List<Trip>> = JsonMissing.of(),
                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                private val inactiveServiceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun activeServiceIds(): List<String> =
                    activeServiceIds.getRequired("activeServiceIds")

                fun trips(): List<Trip> = trips.getRequired("trips")

                fun inactiveServiceIds(): Optional<List<String>> =
                    Optional.ofNullable(inactiveServiceIds.getNullable("inactiveServiceIds"))

                @JsonProperty("activeServiceIds")
                @ExcludeMissing
                fun _activeServiceIds(): JsonField<List<String>> = activeServiceIds

                @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                fun _inactiveServiceIds(): JsonField<List<String>> = inactiveServiceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Configuration = apply {
                    if (validated) {
                        return@apply
                    }

                    activeServiceIds()
                    trips().forEach { it.validate() }
                    inactiveServiceIds()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Configuration]. */
                class Builder internal constructor() {

                    private var activeServiceIds: JsonField<MutableList<String>>? = null
                    private var trips: JsonField<MutableList<Trip>>? = null
                    private var inactiveServiceIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(configuration: Configuration) = apply {
                        activeServiceIds = configuration.activeServiceIds.map { it.toMutableList() }
                        trips = configuration.trips.map { it.toMutableList() }
                        inactiveServiceIds =
                            configuration.inactiveServiceIds.map { it.toMutableList() }
                        additionalProperties = configuration.additionalProperties.toMutableMap()
                    }

                    fun activeServiceIds(activeServiceIds: List<String>) =
                        activeServiceIds(JsonField.of(activeServiceIds))

                    fun activeServiceIds(activeServiceIds: JsonField<List<String>>) = apply {
                        this.activeServiceIds = activeServiceIds.map { it.toMutableList() }
                    }

                    fun addActiveServiceId(activeServiceId: String) = apply {
                        activeServiceIds =
                            (activeServiceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(activeServiceId)
                            }
                    }

                    fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                    fun trips(trips: JsonField<List<Trip>>) = apply {
                        this.trips = trips.map { it.toMutableList() }
                    }

                    fun addTrip(trip: Trip) = apply {
                        trips =
                            (trips ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(trip)
                            }
                    }

                    fun inactiveServiceIds(inactiveServiceIds: List<String>) =
                        inactiveServiceIds(JsonField.of(inactiveServiceIds))

                    fun inactiveServiceIds(inactiveServiceIds: JsonField<List<String>>) = apply {
                        this.inactiveServiceIds = inactiveServiceIds.map { it.toMutableList() }
                    }

                    fun addInactiveServiceId(inactiveServiceId: String) = apply {
                        inactiveServiceIds =
                            (inactiveServiceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(inactiveServiceId)
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

                    fun build(): Configuration =
                        Configuration(
                            checkRequired("activeServiceIds", activeServiceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("trips", trips).map { it.toImmutable() },
                            (inactiveServiceIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Trip
                @JsonCreator
                private constructor(
                    @JsonProperty("accumulatedSlackTime")
                    @ExcludeMissing
                    private val accumulatedSlackTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("blockStopTimes")
                    @ExcludeMissing
                    private val blockStopTimes: JsonField<List<BlockStopTime>> = JsonMissing.of(),
                    @JsonProperty("distanceAlongBlock")
                    @ExcludeMissing
                    private val distanceAlongBlock: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    private val tripId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun accumulatedSlackTime(): Double =
                        accumulatedSlackTime.getRequired("accumulatedSlackTime")

                    fun blockStopTimes(): List<BlockStopTime> =
                        blockStopTimes.getRequired("blockStopTimes")

                    fun distanceAlongBlock(): Double =
                        distanceAlongBlock.getRequired("distanceAlongBlock")

                    fun tripId(): String = tripId.getRequired("tripId")

                    @JsonProperty("accumulatedSlackTime")
                    @ExcludeMissing
                    fun _accumulatedSlackTime(): JsonField<Double> = accumulatedSlackTime

                    @JsonProperty("blockStopTimes")
                    @ExcludeMissing
                    fun _blockStopTimes(): JsonField<List<BlockStopTime>> = blockStopTimes

                    @JsonProperty("distanceAlongBlock")
                    @ExcludeMissing
                    fun _distanceAlongBlock(): JsonField<Double> = distanceAlongBlock

                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun _tripId(): JsonField<String> = tripId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Trip = apply {
                        if (validated) {
                            return@apply
                        }

                        accumulatedSlackTime()
                        blockStopTimes().forEach { it.validate() }
                        distanceAlongBlock()
                        tripId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Trip]. */
                    class Builder internal constructor() {

                        private var accumulatedSlackTime: JsonField<Double>? = null
                        private var blockStopTimes: JsonField<MutableList<BlockStopTime>>? = null
                        private var distanceAlongBlock: JsonField<Double>? = null
                        private var tripId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(trip: Trip) = apply {
                            accumulatedSlackTime = trip.accumulatedSlackTime
                            blockStopTimes = trip.blockStopTimes.map { it.toMutableList() }
                            distanceAlongBlock = trip.distanceAlongBlock
                            tripId = trip.tripId
                            additionalProperties = trip.additionalProperties.toMutableMap()
                        }

                        fun accumulatedSlackTime(accumulatedSlackTime: Double) =
                            accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                        fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) = apply {
                            this.accumulatedSlackTime = accumulatedSlackTime
                        }

                        fun blockStopTimes(blockStopTimes: List<BlockStopTime>) =
                            blockStopTimes(JsonField.of(blockStopTimes))

                        fun blockStopTimes(blockStopTimes: JsonField<List<BlockStopTime>>) = apply {
                            this.blockStopTimes = blockStopTimes.map { it.toMutableList() }
                        }

                        fun addBlockStopTime(blockStopTime: BlockStopTime) = apply {
                            blockStopTimes =
                                (blockStopTimes ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(blockStopTime)
                                }
                        }

                        fun distanceAlongBlock(distanceAlongBlock: Double) =
                            distanceAlongBlock(JsonField.of(distanceAlongBlock))

                        fun distanceAlongBlock(distanceAlongBlock: JsonField<Double>) = apply {
                            this.distanceAlongBlock = distanceAlongBlock
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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
                                checkRequired("accumulatedSlackTime", accumulatedSlackTime),
                                checkRequired("blockStopTimes", blockStopTimes).map {
                                    it.toImmutable()
                                },
                                checkRequired("distanceAlongBlock", distanceAlongBlock),
                                checkRequired("tripId", tripId),
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class BlockStopTime
                    @JsonCreator
                    private constructor(
                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        private val accumulatedSlackTime: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("blockSequence")
                        @ExcludeMissing
                        private val blockSequence: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        private val distanceAlongBlock: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("stopTime")
                        @ExcludeMissing
                        private val stopTime: JsonField<StopTime> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun accumulatedSlackTime(): Double =
                            accumulatedSlackTime.getRequired("accumulatedSlackTime")

                        fun blockSequence(): Long = blockSequence.getRequired("blockSequence")

                        fun distanceAlongBlock(): Double =
                            distanceAlongBlock.getRequired("distanceAlongBlock")

                        fun stopTime(): StopTime = stopTime.getRequired("stopTime")

                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        fun _accumulatedSlackTime(): JsonField<Double> = accumulatedSlackTime

                        @JsonProperty("blockSequence")
                        @ExcludeMissing
                        fun _blockSequence(): JsonField<Long> = blockSequence

                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        fun _distanceAlongBlock(): JsonField<Double> = distanceAlongBlock

                        @JsonProperty("stopTime")
                        @ExcludeMissing
                        fun _stopTime(): JsonField<StopTime> = stopTime

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): BlockStopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            accumulatedSlackTime()
                            blockSequence()
                            distanceAlongBlock()
                            stopTime().validate()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [BlockStopTime]. */
                        class Builder internal constructor() {

                            private var accumulatedSlackTime: JsonField<Double>? = null
                            private var blockSequence: JsonField<Long>? = null
                            private var distanceAlongBlock: JsonField<Double>? = null
                            private var stopTime: JsonField<StopTime>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(blockStopTime: BlockStopTime) = apply {
                                accumulatedSlackTime = blockStopTime.accumulatedSlackTime
                                blockSequence = blockStopTime.blockSequence
                                distanceAlongBlock = blockStopTime.distanceAlongBlock
                                stopTime = blockStopTime.stopTime
                                additionalProperties =
                                    blockStopTime.additionalProperties.toMutableMap()
                            }

                            fun accumulatedSlackTime(accumulatedSlackTime: Double) =
                                accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                            fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) =
                                apply {
                                    this.accumulatedSlackTime = accumulatedSlackTime
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
                                    checkRequired("accumulatedSlackTime", accumulatedSlackTime),
                                    checkRequired("blockSequence", blockSequence),
                                    checkRequired("distanceAlongBlock", distanceAlongBlock),
                                    checkRequired("stopTime", stopTime),
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @NoAutoDetect
                        class StopTime
                        @JsonCreator
                        private constructor(
                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            private val arrivalTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            private val departureTime: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("stopId")
                            @ExcludeMissing
                            private val stopId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("dropOffType")
                            @ExcludeMissing
                            private val dropOffType: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("pickupType")
                            @ExcludeMissing
                            private val pickupType: JsonField<Long> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                            fun departureTime(): Long = departureTime.getRequired("departureTime")

                            fun stopId(): String = stopId.getRequired("stopId")

                            fun dropOffType(): Optional<Long> =
                                Optional.ofNullable(dropOffType.getNullable("dropOffType"))

                            fun pickupType(): Optional<Long> =
                                Optional.ofNullable(pickupType.getNullable("pickupType"))

                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            fun _arrivalTime(): JsonField<Long> = arrivalTime

                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            fun _departureTime(): JsonField<Long> = departureTime

                            @JsonProperty("stopId")
                            @ExcludeMissing
                            fun _stopId(): JsonField<String> = stopId

                            @JsonProperty("dropOffType")
                            @ExcludeMissing
                            fun _dropOffType(): JsonField<Long> = dropOffType

                            @JsonProperty("pickupType")
                            @ExcludeMissing
                            fun _pickupType(): JsonField<Long> = pickupType

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): StopTime = apply {
                                if (validated) {
                                    return@apply
                                }

                                arrivalTime()
                                departureTime()
                                stopId()
                                dropOffType()
                                pickupType()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [StopTime]. */
                            class Builder internal constructor() {

                                private var arrivalTime: JsonField<Long>? = null
                                private var departureTime: JsonField<Long>? = null
                                private var stopId: JsonField<String>? = null
                                private var dropOffType: JsonField<Long> = JsonMissing.of()
                                private var pickupType: JsonField<Long> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(stopTime: StopTime) = apply {
                                    arrivalTime = stopTime.arrivalTime
                                    departureTime = stopTime.departureTime
                                    stopId = stopTime.stopId
                                    dropOffType = stopTime.dropOffType
                                    pickupType = stopTime.pickupType
                                    additionalProperties =
                                        stopTime.additionalProperties.toMutableMap()
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

                                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                                fun stopId(stopId: JsonField<String>) = apply {
                                    this.stopId = stopId
                                }

                                fun dropOffType(dropOffType: Long) =
                                    dropOffType(JsonField.of(dropOffType))

                                fun dropOffType(dropOffType: JsonField<Long>) = apply {
                                    this.dropOffType = dropOffType
                                }

                                fun pickupType(pickupType: Long) =
                                    pickupType(JsonField.of(pickupType))

                                fun pickupType(pickupType: JsonField<Long>) = apply {
                                    this.pickupType = pickupType
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
                                        checkRequired("arrivalTime", arrivalTime),
                                        checkRequired("departureTime", departureTime),
                                        checkRequired("stopId", stopId),
                                        dropOffType,
                                        pickupType,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is StopTime && arrivalTime == other.arrivalTime && departureTime == other.departureTime && stopId == other.stopId && dropOffType == other.dropOffType && pickupType == other.pickupType && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(arrivalTime, departureTime, stopId, dropOffType, pickupType, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, stopId=$stopId, dropOffType=$dropOffType, pickupType=$pickupType, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is BlockStopTime && accumulatedSlackTime == other.accumulatedSlackTime && blockSequence == other.blockSequence && distanceAlongBlock == other.distanceAlongBlock && stopTime == other.stopTime && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(accumulatedSlackTime, blockSequence, distanceAlongBlock, stopTime, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "BlockStopTime{accumulatedSlackTime=$accumulatedSlackTime, blockSequence=$blockSequence, distanceAlongBlock=$distanceAlongBlock, stopTime=$stopTime, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Trip && accumulatedSlackTime == other.accumulatedSlackTime && blockStopTimes == other.blockStopTimes && distanceAlongBlock == other.distanceAlongBlock && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(accumulatedSlackTime, blockStopTimes, distanceAlongBlock, tripId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Trip{accumulatedSlackTime=$accumulatedSlackTime, blockStopTimes=$blockStopTimes, distanceAlongBlock=$distanceAlongBlock, tripId=$tripId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Configuration && activeServiceIds == other.activeServiceIds && trips == other.trips && inactiveServiceIds == other.inactiveServiceIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(activeServiceIds, trips, inactiveServiceIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Configuration{activeServiceIds=$activeServiceIds, trips=$trips, inactiveServiceIds=$inactiveServiceIds, additionalProperties=$additionalProperties}"
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
