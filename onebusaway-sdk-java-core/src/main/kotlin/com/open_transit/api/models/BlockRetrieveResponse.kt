// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.open_transit.api.core.BaseDeserializer
import com.open_transit.api.core.BaseSerializer
import com.open_transit.api.core.getOrThrow
import com.open_transit.api.core.ExcludeMissing
import com.open_transit.api.core.JsonMissing
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.JsonNull
import com.open_transit.api.core.JsonField
import com.open_transit.api.core.Enum
import com.open_transit.api.core.toUnmodifiable
import com.open_transit.api.core.NoAutoDetect
import com.open_transit.api.errors.OnebusawaySdkInvalidDataException

@JsonDeserialize(builder = BlockRetrieveResponse.Builder::class)
@NoAutoDetect
class BlockRetrieveResponse private constructor(
  private val code: JsonField<Long>,
  private val currentTime: JsonField<Long>,
  private val text: JsonField<String>,
  private val version: JsonField<Long>,
  private val data: JsonField<Data>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

    fun data(): Data = data.getRequired("data")

    fun toResponseWrapper(): ResponseWrapper = ResponseWrapper.builder().code(code).currentTime(currentTime).text(text).version(version).build()

    @JsonProperty("code")
    @ExcludeMissing
    fun _code() = code

    @JsonProperty("currentTime")
    @ExcludeMissing
    fun _currentTime() = currentTime

    @JsonProperty("text")
    @ExcludeMissing
    fun _text() = text

    @JsonProperty("version")
    @ExcludeMissing
    fun _version() = version

    @JsonProperty("data")
    @ExcludeMissing
    fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is BlockRetrieveResponse &&
          this.code == other.code &&
          this.currentTime == other.currentTime &&
          this.text == other.text &&
          this.version == other.version &&
          this.data == other.data &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
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

    override fun toString() = "BlockRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
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
            this.code = blockRetrieveResponse.code
            this.currentTime = blockRetrieveResponse.currentTime
            this.text = blockRetrieveResponse.text
            this.version = blockRetrieveResponse.version
            this.data = blockRetrieveResponse.data
            additionalProperties(blockRetrieveResponse.additionalProperties)
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply {
            this.code = code
        }

        fun currentTime(currentTime: Long) = currentTime(JsonField.of(currentTime))

        @JsonProperty("currentTime")
        @ExcludeMissing
        fun currentTime(currentTime: JsonField<Long>) = apply {
            this.currentTime = currentTime
        }

        fun text(text: String) = text(JsonField.of(text))

        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply {
            this.text = text
        }

        fun version(version: Long) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply {
            this.version = version
        }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply {
            this.data = data
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

        fun build(): BlockRetrieveResponse = BlockRetrieveResponse(
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
    class Data private constructor(private val entry: JsonField<Entry>, private val references: JsonField<References>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun entry(): Entry = entry.getRequired("entry")

        fun references(): References = references.getRequired("references")

        @JsonProperty("entry")
        @ExcludeMissing
        fun _entry() = entry

        @JsonProperty("references")
        @ExcludeMissing
        fun _references() = references

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

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Data &&
              this.entry == other.entry &&
              this.references == other.references &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                entry,
                references,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Data{entry=$entry, references=$references, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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
            fun entry(entry: JsonField<Entry>) = apply {
                this.entry = entry
            }

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

            fun build(): Data = Data(
                entry,
                references,
                additionalProperties.toUnmodifiable(),
            )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry private constructor(private val id: JsonField<String>, private val configurations: JsonField<List<Configuration>>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun configurations(): List<Configuration> = configurations.getRequired("configurations")

            @JsonProperty("id")
            @ExcludeMissing
            fun _id() = id

            @JsonProperty("configurations")
            @ExcludeMissing
            fun _configurations() = configurations

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                  id()
                  configurations().forEach { it.validate() }
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Entry &&
                  this.id == other.id &&
                  this.configurations == other.configurations &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    id,
                    configurations,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "Entry{id=$id, configurations=$configurations, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var configurations: JsonField<List<Configuration>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.id = entry.id
                    this.configurations = entry.configurations
                    additionalProperties(entry.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply {
                    this.id = id
                }

                fun configurations(configurations: List<Configuration>) = configurations(JsonField.of(configurations))

                @JsonProperty("configurations")
                @ExcludeMissing
                fun configurations(configurations: JsonField<List<Configuration>>) = apply {
                    this.configurations = configurations
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

                fun build(): Entry = Entry(
                    id,
                    configurations.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
            }

            @JsonDeserialize(builder = Configuration.Builder::class)
            @NoAutoDetect
            class Configuration private constructor(
              private val activeServiceIds: JsonField<List<String>>,
              private val inactiveServiceIds: JsonField<List<String>>,
              private val trips: JsonField<List<Trip>>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun activeServiceIds(): List<String> = activeServiceIds.getRequired("activeServiceIds")

                fun inactiveServiceIds(): Optional<List<String>> = Optional.ofNullable(inactiveServiceIds.getNullable("inactiveServiceIds"))

                fun trips(): List<Trip> = trips.getRequired("trips")

                @JsonProperty("activeServiceIds")
                @ExcludeMissing
                fun _activeServiceIds() = activeServiceIds

                @JsonProperty("inactiveServiceIds")
                @ExcludeMissing
                fun _inactiveServiceIds() = inactiveServiceIds

                @JsonProperty("trips")
                @ExcludeMissing
                fun _trips() = trips

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Configuration = apply {
                    if (!validated) {
                      activeServiceIds()
                      inactiveServiceIds()
                      trips().forEach { it.validate() }
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Configuration &&
                      this.activeServiceIds == other.activeServiceIds &&
                      this.inactiveServiceIds == other.inactiveServiceIds &&
                      this.trips == other.trips &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        activeServiceIds,
                        inactiveServiceIds,
                        trips,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Configuration{activeServiceIds=$activeServiceIds, inactiveServiceIds=$inactiveServiceIds, trips=$trips, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var activeServiceIds: JsonField<List<String>> = JsonMissing.of()
                    private var inactiveServiceIds: JsonField<List<String>> = JsonMissing.of()
                    private var trips: JsonField<List<Trip>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(configuration: Configuration) = apply {
                        this.activeServiceIds = configuration.activeServiceIds
                        this.inactiveServiceIds = configuration.inactiveServiceIds
                        this.trips = configuration.trips
                        additionalProperties(configuration.additionalProperties)
                    }

                    fun activeServiceIds(activeServiceIds: List<String>) = activeServiceIds(JsonField.of(activeServiceIds))

                    @JsonProperty("activeServiceIds")
                    @ExcludeMissing
                    fun activeServiceIds(activeServiceIds: JsonField<List<String>>) = apply {
                        this.activeServiceIds = activeServiceIds
                    }

                    fun inactiveServiceIds(inactiveServiceIds: List<String>) = inactiveServiceIds(JsonField.of(inactiveServiceIds))

                    @JsonProperty("inactiveServiceIds")
                    @ExcludeMissing
                    fun inactiveServiceIds(inactiveServiceIds: JsonField<List<String>>) = apply {
                        this.inactiveServiceIds = inactiveServiceIds
                    }

                    fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                    @JsonProperty("trips")
                    @ExcludeMissing
                    fun trips(trips: JsonField<List<Trip>>) = apply {
                        this.trips = trips
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

                    fun build(): Configuration = Configuration(
                        activeServiceIds.map { it.toUnmodifiable() },
                        inactiveServiceIds.map { it.toUnmodifiable() },
                        trips.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
                }

                @JsonDeserialize(builder = Trip.Builder::class)
                @NoAutoDetect
                class Trip private constructor(
                  private val tripId: JsonField<String>,
                  private val distanceAlongBlock: JsonField<Double>,
                  private val accumulatedSlackTime: JsonField<Double>,
                  private val blockStopTimes: JsonField<List<BlockStopTime>>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun tripId(): String = tripId.getRequired("tripId")

                    fun distanceAlongBlock(): Double = distanceAlongBlock.getRequired("distanceAlongBlock")

                    fun accumulatedSlackTime(): Double = accumulatedSlackTime.getRequired("accumulatedSlackTime")

                    fun blockStopTimes(): List<BlockStopTime> = blockStopTimes.getRequired("blockStopTimes")

                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun _tripId() = tripId

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

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is Trip &&
                          this.tripId == other.tripId &&
                          this.distanceAlongBlock == other.distanceAlongBlock &&
                          this.accumulatedSlackTime == other.accumulatedSlackTime &&
                          this.blockStopTimes == other.blockStopTimes &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            tripId,
                            distanceAlongBlock,
                            accumulatedSlackTime,
                            blockStopTimes,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "Trip{tripId=$tripId, distanceAlongBlock=$distanceAlongBlock, accumulatedSlackTime=$accumulatedSlackTime, blockStopTimes=$blockStopTimes, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var tripId: JsonField<String> = JsonMissing.of()
                        private var distanceAlongBlock: JsonField<Double> = JsonMissing.of()
                        private var accumulatedSlackTime: JsonField<Double> = JsonMissing.of()
                        private var blockStopTimes: JsonField<List<BlockStopTime>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(trip: Trip) = apply {
                            this.tripId = trip.tripId
                            this.distanceAlongBlock = trip.distanceAlongBlock
                            this.accumulatedSlackTime = trip.accumulatedSlackTime
                            this.blockStopTimes = trip.blockStopTimes
                            additionalProperties(trip.additionalProperties)
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun tripId(tripId: JsonField<String>) = apply {
                            this.tripId = tripId
                        }

                        fun distanceAlongBlock(distanceAlongBlock: Double) = distanceAlongBlock(JsonField.of(distanceAlongBlock))

                        @JsonProperty("distanceAlongBlock")
                        @ExcludeMissing
                        fun distanceAlongBlock(distanceAlongBlock: JsonField<Double>) = apply {
                            this.distanceAlongBlock = distanceAlongBlock
                        }

                        fun accumulatedSlackTime(accumulatedSlackTime: Double) = accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                        @JsonProperty("accumulatedSlackTime")
                        @ExcludeMissing
                        fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) = apply {
                            this.accumulatedSlackTime = accumulatedSlackTime
                        }

                        fun blockStopTimes(blockStopTimes: List<BlockStopTime>) = blockStopTimes(JsonField.of(blockStopTimes))

                        @JsonProperty("blockStopTimes")
                        @ExcludeMissing
                        fun blockStopTimes(blockStopTimes: JsonField<List<BlockStopTime>>) = apply {
                            this.blockStopTimes = blockStopTimes
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

                        fun build(): Trip = Trip(
                            tripId,
                            distanceAlongBlock,
                            accumulatedSlackTime,
                            blockStopTimes.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                    }

                    @JsonDeserialize(builder = BlockStopTime.Builder::class)
                    @NoAutoDetect
                    class BlockStopTime private constructor(
                      private val blockSequence: JsonField<Long>,
                      private val distanceAlongBlock: JsonField<Double>,
                      private val accumulatedSlackTime: JsonField<Double>,
                      private val stopTime: JsonField<StopTime>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun blockSequence(): Long = blockSequence.getRequired("blockSequence")

                        fun distanceAlongBlock(): Double = distanceAlongBlock.getRequired("distanceAlongBlock")

                        fun accumulatedSlackTime(): Double = accumulatedSlackTime.getRequired("accumulatedSlackTime")

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

                        @JsonProperty("stopTime")
                        @ExcludeMissing
                        fun _stopTime() = stopTime

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is BlockStopTime &&
                              this.blockSequence == other.blockSequence &&
                              this.distanceAlongBlock == other.distanceAlongBlock &&
                              this.accumulatedSlackTime == other.accumulatedSlackTime &&
                              this.stopTime == other.stopTime &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                blockSequence,
                                distanceAlongBlock,
                                accumulatedSlackTime,
                                stopTime,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "BlockStopTime{blockSequence=$blockSequence, distanceAlongBlock=$distanceAlongBlock, accumulatedSlackTime=$accumulatedSlackTime, stopTime=$stopTime, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var blockSequence: JsonField<Long> = JsonMissing.of()
                            private var distanceAlongBlock: JsonField<Double> = JsonMissing.of()
                            private var accumulatedSlackTime: JsonField<Double> = JsonMissing.of()
                            private var stopTime: JsonField<StopTime> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(blockStopTime: BlockStopTime) = apply {
                                this.blockSequence = blockStopTime.blockSequence
                                this.distanceAlongBlock = blockStopTime.distanceAlongBlock
                                this.accumulatedSlackTime = blockStopTime.accumulatedSlackTime
                                this.stopTime = blockStopTime.stopTime
                                additionalProperties(blockStopTime.additionalProperties)
                            }

                            fun blockSequence(blockSequence: Long) = blockSequence(JsonField.of(blockSequence))

                            @JsonProperty("blockSequence")
                            @ExcludeMissing
                            fun blockSequence(blockSequence: JsonField<Long>) = apply {
                                this.blockSequence = blockSequence
                            }

                            fun distanceAlongBlock(distanceAlongBlock: Double) = distanceAlongBlock(JsonField.of(distanceAlongBlock))

                            @JsonProperty("distanceAlongBlock")
                            @ExcludeMissing
                            fun distanceAlongBlock(distanceAlongBlock: JsonField<Double>) = apply {
                                this.distanceAlongBlock = distanceAlongBlock
                            }

                            fun accumulatedSlackTime(accumulatedSlackTime: Double) = accumulatedSlackTime(JsonField.of(accumulatedSlackTime))

                            @JsonProperty("accumulatedSlackTime")
                            @ExcludeMissing
                            fun accumulatedSlackTime(accumulatedSlackTime: JsonField<Double>) = apply {
                                this.accumulatedSlackTime = accumulatedSlackTime
                            }

                            fun stopTime(stopTime: StopTime) = stopTime(JsonField.of(stopTime))

                            @JsonProperty("stopTime")
                            @ExcludeMissing
                            fun stopTime(stopTime: JsonField<StopTime>) = apply {
                                this.stopTime = stopTime
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

                            fun build(): BlockStopTime = BlockStopTime(
                                blockSequence,
                                distanceAlongBlock,
                                accumulatedSlackTime,
                                stopTime,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        @JsonDeserialize(builder = StopTime.Builder::class)
                        @NoAutoDetect
                        class StopTime private constructor(
                          private val stopId: JsonField<String>,
                          private val arrivalTime: JsonField<Long>,
                          private val departureTime: JsonField<Long>,
                          private val pickupType: JsonField<Long>,
                          private val dropOffType: JsonField<Long>,
                          private val additionalProperties: Map<String, JsonValue>,

                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun stopId(): String = stopId.getRequired("stopId")

                            fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                            fun departureTime(): Long = departureTime.getRequired("departureTime")

                            fun pickupType(): Optional<Long> = Optional.ofNullable(pickupType.getNullable("pickupType"))

                            fun dropOffType(): Optional<Long> = Optional.ofNullable(dropOffType.getNullable("dropOffType"))

                            @JsonProperty("stopId")
                            @ExcludeMissing
                            fun _stopId() = stopId

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
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is StopTime &&
                                  this.stopId == other.stopId &&
                                  this.arrivalTime == other.arrivalTime &&
                                  this.departureTime == other.departureTime &&
                                  this.pickupType == other.pickupType &&
                                  this.dropOffType == other.dropOffType &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(
                                    stopId,
                                    arrivalTime,
                                    departureTime,
                                    pickupType,
                                    dropOffType,
                                    additionalProperties,
                                )
                              }
                              return hashCode
                            }

                            override fun toString() = "StopTime{stopId=$stopId, arrivalTime=$arrivalTime, departureTime=$departureTime, pickupType=$pickupType, dropOffType=$dropOffType, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var stopId: JsonField<String> = JsonMissing.of()
                                private var arrivalTime: JsonField<Long> = JsonMissing.of()
                                private var departureTime: JsonField<Long> = JsonMissing.of()
                                private var pickupType: JsonField<Long> = JsonMissing.of()
                                private var dropOffType: JsonField<Long> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(stopTime: StopTime) = apply {
                                    this.stopId = stopTime.stopId
                                    this.arrivalTime = stopTime.arrivalTime
                                    this.departureTime = stopTime.departureTime
                                    this.pickupType = stopTime.pickupType
                                    this.dropOffType = stopTime.dropOffType
                                    additionalProperties(stopTime.additionalProperties)
                                }

                                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                                @JsonProperty("stopId")
                                @ExcludeMissing
                                fun stopId(stopId: JsonField<String>) = apply {
                                    this.stopId = stopId
                                }

                                fun arrivalTime(arrivalTime: Long) = arrivalTime(JsonField.of(arrivalTime))

                                @JsonProperty("arrivalTime")
                                @ExcludeMissing
                                fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                    this.arrivalTime = arrivalTime
                                }

                                fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

                                @JsonProperty("departureTime")
                                @ExcludeMissing
                                fun departureTime(departureTime: JsonField<Long>) = apply {
                                    this.departureTime = departureTime
                                }

                                fun pickupType(pickupType: Long) = pickupType(JsonField.of(pickupType))

                                @JsonProperty("pickupType")
                                @ExcludeMissing
                                fun pickupType(pickupType: JsonField<Long>) = apply {
                                    this.pickupType = pickupType
                                }

                                fun dropOffType(dropOffType: Long) = dropOffType(JsonField.of(dropOffType))

                                @JsonProperty("dropOffType")
                                @ExcludeMissing
                                fun dropOffType(dropOffType: JsonField<Long>) = apply {
                                    this.dropOffType = dropOffType
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

                                fun build(): StopTime = StopTime(
                                    stopId,
                                    arrivalTime,
                                    departureTime,
                                    pickupType,
                                    dropOffType,
                                    additionalProperties.toUnmodifiable(),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
