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

@JsonDeserialize(builder = ArrivalAndDepartureListResponse.Builder::class)
@NoAutoDetect
class ArrivalAndDepartureListResponse private constructor(
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

    fun validate(): ArrivalAndDepartureListResponse = apply {
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

      return other is ArrivalAndDepartureListResponse &&
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

    override fun toString() = "ArrivalAndDepartureListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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
        internal fun from(arrivalAndDepartureListResponse: ArrivalAndDepartureListResponse) = apply {
            this.code = arrivalAndDepartureListResponse.code
            this.currentTime = arrivalAndDepartureListResponse.currentTime
            this.text = arrivalAndDepartureListResponse.text
            this.version = arrivalAndDepartureListResponse.version
            this.data = arrivalAndDepartureListResponse.data
            additionalProperties(arrivalAndDepartureListResponse.additionalProperties)
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

        fun build(): ArrivalAndDepartureListResponse = ArrivalAndDepartureListResponse(
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
        class Entry private constructor(private val arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun arrivalsAndDepartures(): List<ArrivalsAndDeparture> = arrivalsAndDepartures.getRequired("arrivalsAndDepartures")

            @JsonProperty("arrivalsAndDepartures")
            @ExcludeMissing
            fun _arrivalsAndDepartures() = arrivalsAndDepartures

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                  arrivalsAndDepartures().forEach { it.validate() }
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Entry &&
                  this.arrivalsAndDepartures == other.arrivalsAndDepartures &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(arrivalsAndDepartures, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "Entry{arrivalsAndDepartures=$arrivalsAndDepartures, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.arrivalsAndDepartures = entry.arrivalsAndDepartures
                    additionalProperties(entry.additionalProperties)
                }

                fun arrivalsAndDepartures(arrivalsAndDepartures: List<ArrivalsAndDeparture>) = arrivalsAndDepartures(JsonField.of(arrivalsAndDepartures))

                @JsonProperty("arrivalsAndDepartures")
                @ExcludeMissing
                fun arrivalsAndDepartures(arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>>) = apply {
                    this.arrivalsAndDepartures = arrivalsAndDepartures
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

                fun build(): Entry = Entry(arrivalsAndDepartures.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
            }

            @JsonDeserialize(builder = ArrivalsAndDeparture.Builder::class)
            @NoAutoDetect
            class ArrivalsAndDeparture private constructor(
              private val actualTrack: JsonField<String>,
              private val arrivalEnabled: JsonField<Boolean>,
              private val blockTripSequence: JsonField<Long>,
              private val departureEnabled: JsonField<Boolean>,
              private val distanceFromStop: JsonField<Double>,
              private val frequency: JsonField<String>,
              private val historicalOccupancy: JsonField<String>,
              private val lastUpdateTime: JsonField<Long>,
              private val numberOfStopsAway: JsonField<Long>,
              private val occupancyStatus: JsonField<String>,
              private val predicted: JsonField<Boolean>,
              private val predictedArrivalInterval: JsonField<String>,
              private val predictedArrivalTime: JsonField<Long>,
              private val predictedDepartureInterval: JsonField<String>,
              private val predictedDepartureTime: JsonField<Long>,
              private val predictedOccupancy: JsonField<String>,
              private val routeId: JsonField<String>,
              private val routeLongName: JsonField<String>,
              private val routeShortName: JsonField<String>,
              private val scheduledArrivalInterval: JsonField<String>,
              private val scheduledArrivalTime: JsonField<Long>,
              private val scheduledDepartureInterval: JsonField<String>,
              private val scheduledDepartureTime: JsonField<Long>,
              private val scheduledTrack: JsonField<String>,
              private val serviceDate: JsonField<Long>,
              private val situationIds: JsonField<List<String>>,
              private val status: JsonField<String>,
              private val stopId: JsonField<String>,
              private val stopSequence: JsonField<Long>,
              private val totalStopsInTrip: JsonField<Long>,
              private val tripHeadsign: JsonField<String>,
              private val tripId: JsonField<String>,
              private val tripStatus: JsonField<TripStatus>,
              private val vehicleId: JsonField<String>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The actual track information of the arriving transit vehicle. */
                fun actualTrack(): Optional<String> = Optional.ofNullable(actualTrack.getNullable("actualTrack"))

                /** Indicates if riders can arrive on this transit vehicle. */
                fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /** Indicates if riders can depart from this transit vehicle. */
                fun departureEnabled(): Boolean = departureEnabled.getRequired("departureEnabled")

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                fun distanceFromStop(): Optional<Double> = Optional.ofNullable(distanceFromStop.getNullable("distanceFromStop"))

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(): Optional<String> = Optional.ofNullable(frequency.getNullable("frequency"))

                /** Historical occupancy information of the transit vehicle. */
                fun historicalOccupancy(): Optional<String> = Optional.ofNullable(historicalOccupancy.getNullable("historicalOccupancy"))

                /** Timestamp of the last update time for this arrival. */
                fun lastUpdateTime(): Optional<Long> = Optional.ofNullable(lastUpdateTime.getNullable("lastUpdateTime"))

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                fun numberOfStopsAway(): Long = numberOfStopsAway.getRequired("numberOfStopsAway")

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(): Optional<String> = Optional.ofNullable(occupancyStatus.getNullable("occupancyStatus"))

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(): Optional<Boolean> = Optional.ofNullable(predicted.getNullable("predicted"))

                /** Interval for predicted arrival time, if available. */
                fun predictedArrivalInterval(): Optional<String> = Optional.ofNullable(predictedArrivalInterval.getNullable("predictedArrivalInterval"))

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedArrivalTime(): Long = predictedArrivalTime.getRequired("predictedArrivalTime")

                /** Interval for predicted departure time, if available. */
                fun predictedDepartureInterval(): Optional<String> = Optional.ofNullable(predictedDepartureInterval.getNullable("predictedDepartureInterval"))

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedDepartureTime(): Long = predictedDepartureTime.getRequired("predictedDepartureTime")

                /** Predicted occupancy status of the transit vehicle. */
                fun predictedOccupancy(): Optional<String> = Optional.ofNullable(predictedOccupancy.getNullable("predictedOccupancy"))

                /** The ID of the route for the arriving vehicle. */
                fun routeId(): String = routeId.getRequired("routeId")

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                fun routeLongName(): Optional<String> = Optional.ofNullable(routeLongName.getNullable("routeLongName"))

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                fun routeShortName(): Optional<String> = Optional.ofNullable(routeShortName.getNullable("routeShortName"))

                /** Interval for scheduled arrival time. */
                fun scheduledArrivalInterval(): Optional<String> = Optional.ofNullable(scheduledArrivalInterval.getNullable("scheduledArrivalInterval"))

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                fun scheduledArrivalTime(): Long = scheduledArrivalTime.getRequired("scheduledArrivalTime")

                /** Interval for scheduled departure time. */
                fun scheduledDepartureInterval(): Optional<String> = Optional.ofNullable(scheduledDepartureInterval.getNullable("scheduledDepartureInterval"))

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                fun scheduledDepartureTime(): Long = scheduledDepartureTime.getRequired("scheduledDepartureTime")

                /** Scheduled track information of the arriving transit vehicle. */
                fun scheduledTrack(): Optional<String> = Optional.ofNullable(scheduledTrack.getNullable("scheduledTrack"))

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /** References to situation elements (if any) applicable to this arrival. */
                fun situationIds(): Optional<List<String>> = Optional.ofNullable(situationIds.getNullable("situationIds"))

                /** Current status of the arrival. */
                fun status(): Optional<String> = Optional.ofNullable(status.getNullable("status"))

                /** The ID of the stop the vehicle is arriving at. */
                fun stopId(): String = stopId.getRequired("stopId")

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                fun stopSequence(): Long = stopSequence.getRequired("stopSequence")

                /** Total number of stops visited on the trip for this arrival. */
                fun totalStopsInTrip(): Long = totalStopsInTrip.getRequired("totalStopsInTrip")

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

                /** The ID of the trip for the arriving vehicle. */
                fun tripId(): String = tripId.getRequired("tripId")

                /** Trip-specific status for the arriving transit vehicle. */
                fun tripStatus(): Optional<TripStatus> = Optional.ofNullable(tripStatus.getNullable("tripStatus"))

                /** ID of the transit vehicle serving this trip. */
                fun vehicleId(): String = vehicleId.getRequired("vehicleId")

                /** The actual track information of the arriving transit vehicle. */
                @JsonProperty("actualTrack")
                @ExcludeMissing
                fun _actualTrack() = actualTrack

                /** Indicates if riders can arrive on this transit vehicle. */
                @JsonProperty("arrivalEnabled")
                @ExcludeMissing
                fun _arrivalEnabled() = arrivalEnabled

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                fun _blockTripSequence() = blockTripSequence

                /** Indicates if riders can depart from this transit vehicle. */
                @JsonProperty("departureEnabled")
                @ExcludeMissing
                fun _departureEnabled() = departureEnabled

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                @JsonProperty("distanceFromStop")
                @ExcludeMissing
                fun _distanceFromStop() = distanceFromStop

                /** Information about frequency-based scheduling, if applicable to the trip. */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency() = frequency

                /** Historical occupancy information of the transit vehicle. */
                @JsonProperty("historicalOccupancy")
                @ExcludeMissing
                fun _historicalOccupancy() = historicalOccupancy

                /** Timestamp of the last update time for this arrival. */
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                fun _lastUpdateTime() = lastUpdateTime

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                @JsonProperty("numberOfStopsAway")
                @ExcludeMissing
                fun _numberOfStopsAway() = numberOfStopsAway

                /** Current occupancy status of the transit vehicle. */
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                fun _occupancyStatus() = occupancyStatus

                /** Indicates if real-time arrival info is available for this trip. */
                @JsonProperty("predicted")
                @ExcludeMissing
                fun _predicted() = predicted

                /** Interval for predicted arrival time, if available. */
                @JsonProperty("predictedArrivalInterval")
                @ExcludeMissing
                fun _predictedArrivalInterval() = predictedArrivalInterval

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                @JsonProperty("predictedArrivalTime")
                @ExcludeMissing
                fun _predictedArrivalTime() = predictedArrivalTime

                /** Interval for predicted departure time, if available. */
                @JsonProperty("predictedDepartureInterval")
                @ExcludeMissing
                fun _predictedDepartureInterval() = predictedDepartureInterval

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                @JsonProperty("predictedDepartureTime")
                @ExcludeMissing
                fun _predictedDepartureTime() = predictedDepartureTime

                /** Predicted occupancy status of the transit vehicle. */
                @JsonProperty("predictedOccupancy")
                @ExcludeMissing
                fun _predictedOccupancy() = predictedOccupancy

                /** The ID of the route for the arriving vehicle. */
                @JsonProperty("routeId")
                @ExcludeMissing
                fun _routeId() = routeId

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                @JsonProperty("routeLongName")
                @ExcludeMissing
                fun _routeLongName() = routeLongName

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun _routeShortName() = routeShortName

                /** Interval for scheduled arrival time. */
                @JsonProperty("scheduledArrivalInterval")
                @ExcludeMissing
                fun _scheduledArrivalInterval() = scheduledArrivalInterval

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                @JsonProperty("scheduledArrivalTime")
                @ExcludeMissing
                fun _scheduledArrivalTime() = scheduledArrivalTime

                /** Interval for scheduled departure time. */
                @JsonProperty("scheduledDepartureInterval")
                @ExcludeMissing
                fun _scheduledDepartureInterval() = scheduledDepartureInterval

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                @JsonProperty("scheduledDepartureTime")
                @ExcludeMissing
                fun _scheduledDepartureTime() = scheduledDepartureTime

                /** Scheduled track information of the arriving transit vehicle. */
                @JsonProperty("scheduledTrack")
                @ExcludeMissing
                fun _scheduledTrack() = scheduledTrack

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                @JsonProperty("serviceDate")
                @ExcludeMissing
                fun _serviceDate() = serviceDate

                /** References to situation elements (if any) applicable to this arrival. */
                @JsonProperty("situationIds")
                @ExcludeMissing
                fun _situationIds() = situationIds

                /** Current status of the arrival. */
                @JsonProperty("status")
                @ExcludeMissing
                fun _status() = status

                /** The ID of the stop the vehicle is arriving at. */
                @JsonProperty("stopId")
                @ExcludeMissing
                fun _stopId() = stopId

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                @JsonProperty("stopSequence")
                @ExcludeMissing
                fun _stopSequence() = stopSequence

                /** Total number of stops visited on the trip for this arrival. */
                @JsonProperty("totalStopsInTrip")
                @ExcludeMissing
                fun _totalStopsInTrip() = totalStopsInTrip

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                fun _tripHeadsign() = tripHeadsign

                /** The ID of the trip for the arriving vehicle. */
                @JsonProperty("tripId")
                @ExcludeMissing
                fun _tripId() = tripId

                /** Trip-specific status for the arriving transit vehicle. */
                @JsonProperty("tripStatus")
                @ExcludeMissing
                fun _tripStatus() = tripStatus

                /** ID of the transit vehicle serving this trip. */
                @JsonProperty("vehicleId")
                @ExcludeMissing
                fun _vehicleId() = vehicleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ArrivalsAndDeparture = apply {
                    if (!validated) {
                      actualTrack()
                      arrivalEnabled()
                      blockTripSequence()
                      departureEnabled()
                      distanceFromStop()
                      frequency()
                      historicalOccupancy()
                      lastUpdateTime()
                      numberOfStopsAway()
                      occupancyStatus()
                      predicted()
                      predictedArrivalInterval()
                      predictedArrivalTime()
                      predictedDepartureInterval()
                      predictedDepartureTime()
                      predictedOccupancy()
                      routeId()
                      routeLongName()
                      routeShortName()
                      scheduledArrivalInterval()
                      scheduledArrivalTime()
                      scheduledDepartureInterval()
                      scheduledDepartureTime()
                      scheduledTrack()
                      serviceDate()
                      situationIds()
                      status()
                      stopId()
                      stopSequence()
                      totalStopsInTrip()
                      tripHeadsign()
                      tripId()
                      tripStatus().map { it.validate() }
                      vehicleId()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is ArrivalsAndDeparture &&
                      this.actualTrack == other.actualTrack &&
                      this.arrivalEnabled == other.arrivalEnabled &&
                      this.blockTripSequence == other.blockTripSequence &&
                      this.departureEnabled == other.departureEnabled &&
                      this.distanceFromStop == other.distanceFromStop &&
                      this.frequency == other.frequency &&
                      this.historicalOccupancy == other.historicalOccupancy &&
                      this.lastUpdateTime == other.lastUpdateTime &&
                      this.numberOfStopsAway == other.numberOfStopsAway &&
                      this.occupancyStatus == other.occupancyStatus &&
                      this.predicted == other.predicted &&
                      this.predictedArrivalInterval == other.predictedArrivalInterval &&
                      this.predictedArrivalTime == other.predictedArrivalTime &&
                      this.predictedDepartureInterval == other.predictedDepartureInterval &&
                      this.predictedDepartureTime == other.predictedDepartureTime &&
                      this.predictedOccupancy == other.predictedOccupancy &&
                      this.routeId == other.routeId &&
                      this.routeLongName == other.routeLongName &&
                      this.routeShortName == other.routeShortName &&
                      this.scheduledArrivalInterval == other.scheduledArrivalInterval &&
                      this.scheduledArrivalTime == other.scheduledArrivalTime &&
                      this.scheduledDepartureInterval == other.scheduledDepartureInterval &&
                      this.scheduledDepartureTime == other.scheduledDepartureTime &&
                      this.scheduledTrack == other.scheduledTrack &&
                      this.serviceDate == other.serviceDate &&
                      this.situationIds == other.situationIds &&
                      this.status == other.status &&
                      this.stopId == other.stopId &&
                      this.stopSequence == other.stopSequence &&
                      this.totalStopsInTrip == other.totalStopsInTrip &&
                      this.tripHeadsign == other.tripHeadsign &&
                      this.tripId == other.tripId &&
                      this.tripStatus == other.tripStatus &&
                      this.vehicleId == other.vehicleId &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        actualTrack,
                        arrivalEnabled,
                        blockTripSequence,
                        departureEnabled,
                        distanceFromStop,
                        frequency,
                        historicalOccupancy,
                        lastUpdateTime,
                        numberOfStopsAway,
                        occupancyStatus,
                        predicted,
                        predictedArrivalInterval,
                        predictedArrivalTime,
                        predictedDepartureInterval,
                        predictedDepartureTime,
                        predictedOccupancy,
                        routeId,
                        routeLongName,
                        routeShortName,
                        scheduledArrivalInterval,
                        scheduledArrivalTime,
                        scheduledDepartureInterval,
                        scheduledDepartureTime,
                        scheduledTrack,
                        serviceDate,
                        situationIds,
                        status,
                        stopId,
                        stopSequence,
                        totalStopsInTrip,
                        tripHeadsign,
                        tripId,
                        tripStatus,
                        vehicleId,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "ArrivalsAndDeparture{actualTrack=$actualTrack, arrivalEnabled=$arrivalEnabled, blockTripSequence=$blockTripSequence, departureEnabled=$departureEnabled, distanceFromStop=$distanceFromStop, frequency=$frequency, historicalOccupancy=$historicalOccupancy, lastUpdateTime=$lastUpdateTime, numberOfStopsAway=$numberOfStopsAway, occupancyStatus=$occupancyStatus, predicted=$predicted, predictedArrivalInterval=$predictedArrivalInterval, predictedArrivalTime=$predictedArrivalTime, predictedDepartureInterval=$predictedDepartureInterval, predictedDepartureTime=$predictedDepartureTime, predictedOccupancy=$predictedOccupancy, routeId=$routeId, routeLongName=$routeLongName, routeShortName=$routeShortName, scheduledArrivalInterval=$scheduledArrivalInterval, scheduledArrivalTime=$scheduledArrivalTime, scheduledDepartureInterval=$scheduledDepartureInterval, scheduledDepartureTime=$scheduledDepartureTime, scheduledTrack=$scheduledTrack, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, stopId=$stopId, stopSequence=$stopSequence, totalStopsInTrip=$totalStopsInTrip, tripHeadsign=$tripHeadsign, tripId=$tripId, tripStatus=$tripStatus, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var actualTrack: JsonField<String> = JsonMissing.of()
                    private var arrivalEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                    private var departureEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var distanceFromStop: JsonField<Double> = JsonMissing.of()
                    private var frequency: JsonField<String> = JsonMissing.of()
                    private var historicalOccupancy: JsonField<String> = JsonMissing.of()
                    private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                    private var numberOfStopsAway: JsonField<Long> = JsonMissing.of()
                    private var occupancyStatus: JsonField<String> = JsonMissing.of()
                    private var predicted: JsonField<Boolean> = JsonMissing.of()
                    private var predictedArrivalInterval: JsonField<String> = JsonMissing.of()
                    private var predictedArrivalTime: JsonField<Long> = JsonMissing.of()
                    private var predictedDepartureInterval: JsonField<String> = JsonMissing.of()
                    private var predictedDepartureTime: JsonField<Long> = JsonMissing.of()
                    private var predictedOccupancy: JsonField<String> = JsonMissing.of()
                    private var routeId: JsonField<String> = JsonMissing.of()
                    private var routeLongName: JsonField<String> = JsonMissing.of()
                    private var routeShortName: JsonField<String> = JsonMissing.of()
                    private var scheduledArrivalInterval: JsonField<String> = JsonMissing.of()
                    private var scheduledArrivalTime: JsonField<Long> = JsonMissing.of()
                    private var scheduledDepartureInterval: JsonField<String> = JsonMissing.of()
                    private var scheduledDepartureTime: JsonField<Long> = JsonMissing.of()
                    private var scheduledTrack: JsonField<String> = JsonMissing.of()
                    private var serviceDate: JsonField<Long> = JsonMissing.of()
                    private var situationIds: JsonField<List<String>> = JsonMissing.of()
                    private var status: JsonField<String> = JsonMissing.of()
                    private var stopId: JsonField<String> = JsonMissing.of()
                    private var stopSequence: JsonField<Long> = JsonMissing.of()
                    private var totalStopsInTrip: JsonField<Long> = JsonMissing.of()
                    private var tripHeadsign: JsonField<String> = JsonMissing.of()
                    private var tripId: JsonField<String> = JsonMissing.of()
                    private var tripStatus: JsonField<TripStatus> = JsonMissing.of()
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(arrivalsAndDeparture: ArrivalsAndDeparture) = apply {
                        this.actualTrack = arrivalsAndDeparture.actualTrack
                        this.arrivalEnabled = arrivalsAndDeparture.arrivalEnabled
                        this.blockTripSequence = arrivalsAndDeparture.blockTripSequence
                        this.departureEnabled = arrivalsAndDeparture.departureEnabled
                        this.distanceFromStop = arrivalsAndDeparture.distanceFromStop
                        this.frequency = arrivalsAndDeparture.frequency
                        this.historicalOccupancy = arrivalsAndDeparture.historicalOccupancy
                        this.lastUpdateTime = arrivalsAndDeparture.lastUpdateTime
                        this.numberOfStopsAway = arrivalsAndDeparture.numberOfStopsAway
                        this.occupancyStatus = arrivalsAndDeparture.occupancyStatus
                        this.predicted = arrivalsAndDeparture.predicted
                        this.predictedArrivalInterval = arrivalsAndDeparture.predictedArrivalInterval
                        this.predictedArrivalTime = arrivalsAndDeparture.predictedArrivalTime
                        this.predictedDepartureInterval = arrivalsAndDeparture.predictedDepartureInterval
                        this.predictedDepartureTime = arrivalsAndDeparture.predictedDepartureTime
                        this.predictedOccupancy = arrivalsAndDeparture.predictedOccupancy
                        this.routeId = arrivalsAndDeparture.routeId
                        this.routeLongName = arrivalsAndDeparture.routeLongName
                        this.routeShortName = arrivalsAndDeparture.routeShortName
                        this.scheduledArrivalInterval = arrivalsAndDeparture.scheduledArrivalInterval
                        this.scheduledArrivalTime = arrivalsAndDeparture.scheduledArrivalTime
                        this.scheduledDepartureInterval = arrivalsAndDeparture.scheduledDepartureInterval
                        this.scheduledDepartureTime = arrivalsAndDeparture.scheduledDepartureTime
                        this.scheduledTrack = arrivalsAndDeparture.scheduledTrack
                        this.serviceDate = arrivalsAndDeparture.serviceDate
                        this.situationIds = arrivalsAndDeparture.situationIds
                        this.status = arrivalsAndDeparture.status
                        this.stopId = arrivalsAndDeparture.stopId
                        this.stopSequence = arrivalsAndDeparture.stopSequence
                        this.totalStopsInTrip = arrivalsAndDeparture.totalStopsInTrip
                        this.tripHeadsign = arrivalsAndDeparture.tripHeadsign
                        this.tripId = arrivalsAndDeparture.tripId
                        this.tripStatus = arrivalsAndDeparture.tripStatus
                        this.vehicleId = arrivalsAndDeparture.vehicleId
                        additionalProperties(arrivalsAndDeparture.additionalProperties)
                    }

                    /** The actual track information of the arriving transit vehicle. */
                    fun actualTrack(actualTrack: String) = actualTrack(JsonField.of(actualTrack))

                    /** The actual track information of the arriving transit vehicle. */
                    @JsonProperty("actualTrack")
                    @ExcludeMissing
                    fun actualTrack(actualTrack: JsonField<String>) = apply {
                        this.actualTrack = actualTrack
                    }

                    /** Indicates if riders can arrive on this transit vehicle. */
                    fun arrivalEnabled(arrivalEnabled: Boolean) = arrivalEnabled(JsonField.of(arrivalEnabled))

                    /** Indicates if riders can arrive on this transit vehicle. */
                    @JsonProperty("arrivalEnabled")
                    @ExcludeMissing
                    fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                        this.arrivalEnabled = arrivalEnabled
                    }

                    /** Index of this arrival’s trip into the sequence of trips for the active block. */
                    fun blockTripSequence(blockTripSequence: Long) = blockTripSequence(JsonField.of(blockTripSequence))

                    /** Index of this arrival’s trip into the sequence of trips for the active block. */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** Indicates if riders can depart from this transit vehicle. */
                    fun departureEnabled(departureEnabled: Boolean) = departureEnabled(JsonField.of(departureEnabled))

                    /** Indicates if riders can depart from this transit vehicle. */
                    @JsonProperty("departureEnabled")
                    @ExcludeMissing
                    fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                        this.departureEnabled = departureEnabled
                    }

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    fun distanceFromStop(distanceFromStop: Double) = distanceFromStop(JsonField.of(distanceFromStop))

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    @JsonProperty("distanceFromStop")
                    @ExcludeMissing
                    fun distanceFromStop(distanceFromStop: JsonField<Double>) = apply {
                        this.distanceFromStop = distanceFromStop
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /** Historical occupancy information of the transit vehicle. */
                    fun historicalOccupancy(historicalOccupancy: String) = historicalOccupancy(JsonField.of(historicalOccupancy))

                    /** Historical occupancy information of the transit vehicle. */
                    @JsonProperty("historicalOccupancy")
                    @ExcludeMissing
                    fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                        this.historicalOccupancy = historicalOccupancy
                    }

                    /** Timestamp of the last update time for this arrival. */
                    fun lastUpdateTime(lastUpdateTime: Long) = lastUpdateTime(JsonField.of(lastUpdateTime))

                    /** Timestamp of the last update time for this arrival. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    fun numberOfStopsAway(numberOfStopsAway: Long) = numberOfStopsAway(JsonField.of(numberOfStopsAway))

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    @JsonProperty("numberOfStopsAway")
                    @ExcludeMissing
                    fun numberOfStopsAway(numberOfStopsAway: JsonField<Long>) = apply {
                        this.numberOfStopsAway = numberOfStopsAway
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) = occupancyStatus(JsonField.of(occupancyStatus))

                    /** Current occupancy status of the transit vehicle. */
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /** Interval for predicted arrival time, if available. */
                    fun predictedArrivalInterval(predictedArrivalInterval: String) = predictedArrivalInterval(JsonField.of(predictedArrivalInterval))

                    /** Interval for predicted arrival time, if available. */
                    @JsonProperty("predictedArrivalInterval")
                    @ExcludeMissing
                    fun predictedArrivalInterval(predictedArrivalInterval: JsonField<String>) = apply {
                        this.predictedArrivalInterval = predictedArrivalInterval
                    }

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                     * available).
                     */
                    fun predictedArrivalTime(predictedArrivalTime: Long) = predictedArrivalTime(JsonField.of(predictedArrivalTime))

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                     * available).
                     */
                    @JsonProperty("predictedArrivalTime")
                    @ExcludeMissing
                    fun predictedArrivalTime(predictedArrivalTime: JsonField<Long>) = apply {
                        this.predictedArrivalTime = predictedArrivalTime
                    }

                    /** Interval for predicted departure time, if available. */
                    fun predictedDepartureInterval(predictedDepartureInterval: String) = predictedDepartureInterval(JsonField.of(predictedDepartureInterval))

                    /** Interval for predicted departure time, if available. */
                    @JsonProperty("predictedDepartureInterval")
                    @ExcludeMissing
                    fun predictedDepartureInterval(predictedDepartureInterval: JsonField<String>) = apply {
                        this.predictedDepartureInterval = predictedDepartureInterval
                    }

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                     * available).
                     */
                    fun predictedDepartureTime(predictedDepartureTime: Long) = predictedDepartureTime(JsonField.of(predictedDepartureTime))

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                     * available).
                     */
                    @JsonProperty("predictedDepartureTime")
                    @ExcludeMissing
                    fun predictedDepartureTime(predictedDepartureTime: JsonField<Long>) = apply {
                        this.predictedDepartureTime = predictedDepartureTime
                    }

                    /** Predicted occupancy status of the transit vehicle. */
                    fun predictedOccupancy(predictedOccupancy: String) = predictedOccupancy(JsonField.of(predictedOccupancy))

                    /** Predicted occupancy status of the transit vehicle. */
                    @JsonProperty("predictedOccupancy")
                    @ExcludeMissing
                    fun predictedOccupancy(predictedOccupancy: JsonField<String>) = apply {
                        this.predictedOccupancy = predictedOccupancy
                    }

                    /** The ID of the route for the arriving vehicle. */
                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    /** The ID of the route for the arriving vehicle. */
                    @JsonProperty("routeId")
                    @ExcludeMissing
                    fun routeId(routeId: JsonField<String>) = apply {
                        this.routeId = routeId
                    }

                    /**
                     * Optional route long name that potentially overrides the route long name in the
                     * referenced route element.
                     */
                    fun routeLongName(routeLongName: String) = routeLongName(JsonField.of(routeLongName))

                    /**
                     * Optional route long name that potentially overrides the route long name in the
                     * referenced route element.
                     */
                    @JsonProperty("routeLongName")
                    @ExcludeMissing
                    fun routeLongName(routeLongName: JsonField<String>) = apply {
                        this.routeLongName = routeLongName
                    }

                    /**
                     * Optional route short name that potentially overrides the route short name in the
                     * referenced route element.
                     */
                    fun routeShortName(routeShortName: String) = routeShortName(JsonField.of(routeShortName))

                    /**
                     * Optional route short name that potentially overrides the route short name in the
                     * referenced route element.
                     */
                    @JsonProperty("routeShortName")
                    @ExcludeMissing
                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
                    }

                    /** Interval for scheduled arrival time. */
                    fun scheduledArrivalInterval(scheduledArrivalInterval: String) = scheduledArrivalInterval(JsonField.of(scheduledArrivalInterval))

                    /** Interval for scheduled arrival time. */
                    @JsonProperty("scheduledArrivalInterval")
                    @ExcludeMissing
                    fun scheduledArrivalInterval(scheduledArrivalInterval: JsonField<String>) = apply {
                        this.scheduledArrivalInterval = scheduledArrivalInterval
                    }

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    fun scheduledArrivalTime(scheduledArrivalTime: Long) = scheduledArrivalTime(JsonField.of(scheduledArrivalTime))

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    @JsonProperty("scheduledArrivalTime")
                    @ExcludeMissing
                    fun scheduledArrivalTime(scheduledArrivalTime: JsonField<Long>) = apply {
                        this.scheduledArrivalTime = scheduledArrivalTime
                    }

                    /** Interval for scheduled departure time. */
                    fun scheduledDepartureInterval(scheduledDepartureInterval: String) = scheduledDepartureInterval(JsonField.of(scheduledDepartureInterval))

                    /** Interval for scheduled departure time. */
                    @JsonProperty("scheduledDepartureInterval")
                    @ExcludeMissing
                    fun scheduledDepartureInterval(scheduledDepartureInterval: JsonField<String>) = apply {
                        this.scheduledDepartureInterval = scheduledDepartureInterval
                    }

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    fun scheduledDepartureTime(scheduledDepartureTime: Long) = scheduledDepartureTime(JsonField.of(scheduledDepartureTime))

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    @JsonProperty("scheduledDepartureTime")
                    @ExcludeMissing
                    fun scheduledDepartureTime(scheduledDepartureTime: JsonField<Long>) = apply {
                        this.scheduledDepartureTime = scheduledDepartureTime
                    }

                    /** Scheduled track information of the arriving transit vehicle. */
                    fun scheduledTrack(scheduledTrack: String) = scheduledTrack(JsonField.of(scheduledTrack))

                    /** Scheduled track information of the arriving transit vehicle. */
                    @JsonProperty("scheduledTrack")
                    @ExcludeMissing
                    fun scheduledTrack(scheduledTrack: JsonField<String>) = apply {
                        this.scheduledTrack = scheduledTrack
                    }

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** References to situation elements (if any) applicable to this arrival. */
                    fun situationIds(situationIds: List<String>) = situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this arrival. */
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    fun situationIds(situationIds: JsonField<List<String>>) = apply {
                        this.situationIds = situationIds
                    }

                    /** Current status of the arrival. */
                    fun status(status: String) = status(JsonField.of(status))

                    /** Current status of the arrival. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun status(status: JsonField<String>) = apply {
                        this.status = status
                    }

                    /** The ID of the stop the vehicle is arriving at. */
                    fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                    /** The ID of the stop the vehicle is arriving at. */
                    @JsonProperty("stopId")
                    @ExcludeMissing
                    fun stopId(stopId: JsonField<String>) = apply {
                        this.stopId = stopId
                    }

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    fun stopSequence(stopSequence: Long) = stopSequence(JsonField.of(stopSequence))

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    @JsonProperty("stopSequence")
                    @ExcludeMissing
                    fun stopSequence(stopSequence: JsonField<Long>) = apply {
                        this.stopSequence = stopSequence
                    }

                    /** Total number of stops visited on the trip for this arrival. */
                    fun totalStopsInTrip(totalStopsInTrip: Long) = totalStopsInTrip(JsonField.of(totalStopsInTrip))

                    /** Total number of stops visited on the trip for this arrival. */
                    @JsonProperty("totalStopsInTrip")
                    @ExcludeMissing
                    fun totalStopsInTrip(totalStopsInTrip: JsonField<Long>) = apply {
                        this.totalStopsInTrip = totalStopsInTrip
                    }

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                        this.tripHeadsign = tripHeadsign
                    }

                    /** The ID of the trip for the arriving vehicle. */
                    fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                    /** The ID of the trip for the arriving vehicle. */
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun tripId(tripId: JsonField<String>) = apply {
                        this.tripId = tripId
                    }

                    /** Trip-specific status for the arriving transit vehicle. */
                    fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                    /** Trip-specific status for the arriving transit vehicle. */
                    @JsonProperty("tripStatus")
                    @ExcludeMissing
                    fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                        this.tripStatus = tripStatus
                    }

                    /** ID of the transit vehicle serving this trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /** ID of the transit vehicle serving this trip. */
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
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

                    fun build(): ArrivalsAndDeparture = ArrivalsAndDeparture(
                        actualTrack,
                        arrivalEnabled,
                        blockTripSequence,
                        departureEnabled,
                        distanceFromStop,
                        frequency,
                        historicalOccupancy,
                        lastUpdateTime,
                        numberOfStopsAway,
                        occupancyStatus,
                        predicted,
                        predictedArrivalInterval,
                        predictedArrivalTime,
                        predictedDepartureInterval,
                        predictedDepartureTime,
                        predictedOccupancy,
                        routeId,
                        routeLongName,
                        routeShortName,
                        scheduledArrivalInterval,
                        scheduledArrivalTime,
                        scheduledDepartureInterval,
                        scheduledDepartureTime,
                        scheduledTrack,
                        serviceDate,
                        situationIds.map { it.toUnmodifiable() },
                        status,
                        stopId,
                        stopSequence,
                        totalStopsInTrip,
                        tripHeadsign,
                        tripId,
                        tripStatus,
                        vehicleId,
                        additionalProperties.toUnmodifiable(),
                    )
                }

                /** Trip-specific status for the arriving transit vehicle. */
                @JsonDeserialize(builder = TripStatus.Builder::class)
                @NoAutoDetect
                class TripStatus private constructor(
                  private val activeTripId: JsonField<String>,
                  private val blockTripSequence: JsonField<Long>,
                  private val closestStop: JsonField<String>,
                  private val closestStopTimeOffset: JsonField<Long>,
                  private val distanceAlongTrip: JsonField<Double>,
                  private val frequency: JsonField<String>,
                  private val lastKnownDistanceAlongTrip: JsonField<Double>,
                  private val lastKnownLocation: JsonField<LastKnownLocation>,
                  private val lastKnownOrientation: JsonField<Double>,
                  private val lastLocationUpdateTime: JsonField<Long>,
                  private val lastUpdateTime: JsonField<Long>,
                  private val nextStop: JsonField<String>,
                  private val nextStopTimeOffset: JsonField<Long>,
                  private val occupancyCapacity: JsonField<Long>,
                  private val occupancyCount: JsonField<Long>,
                  private val occupancyStatus: JsonField<String>,
                  private val orientation: JsonField<Double>,
                  private val phase: JsonField<String>,
                  private val position: JsonField<Position>,
                  private val predicted: JsonField<Boolean>,
                  private val scheduleDeviation: JsonField<Long>,
                  private val scheduledDistanceAlongTrip: JsonField<Double>,
                  private val serviceDate: JsonField<Long>,
                  private val situationIds: JsonField<List<String>>,
                  private val status: JsonField<String>,
                  private val totalDistanceAlongTrip: JsonField<Double>,
                  private val vehicleId: JsonField<String>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(): String = closestStop.getRequired("closestStop")

                    /**
                     * Time offset from the closest stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun closestStopTimeOffset(): Optional<Long> = Optional.ofNullable(closestStopTimeOffset.getNullable("closestStopTimeOffset"))

                    /** Distance, in meters, the transit vehicle has progressed along the active trip. */
                    fun distanceAlongTrip(): Double = distanceAlongTrip.getRequired("distanceAlongTrip")

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(): Optional<String> = Optional.ofNullable(frequency.getNullable("frequency"))

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(): Double = lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(): Optional<LastKnownLocation> = Optional.ofNullable(lastKnownLocation.getNullable("lastKnownLocation"))

                    /** Last known orientation value received in real-time from the transit vehicle. */
                    fun lastKnownOrientation(): Optional<Double> = Optional.ofNullable(lastKnownOrientation.getNullable("lastKnownOrientation"))

                    /** Timestamp of the last known real-time location update from the transit vehicle. */
                    fun lastLocationUpdateTime(): Long = lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(): Optional<String> = Optional.ofNullable(nextStop.getNullable("nextStop"))

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(): Optional<Long> = Optional.ofNullable(nextStopTimeOffset.getNullable("nextStopTimeOffset"))

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(): Long = occupancyCapacity.getRequired("occupancyCapacity")

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(): Optional<Double> = Optional.ofNullable(orientation.getNullable("orientation"))

                    /** Current journey phase of the trip. */
                    fun phase(): String = phase.getRequired("phase")

                    /** Current position of the transit vehicle. */
                    fun position(): Optional<Position> = Optional.ofNullable(position.getNullable("position"))

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(): Boolean = predicted.getRequired("predicted")

                    /** Deviation from the schedule in seconds (positive for late, negative for early). */
                    fun scheduleDeviation(): Long = scheduleDeviation.getRequired("scheduleDeviation")

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed along
                     * the active trip.
                     */
                    fun scheduledDistanceAlongTrip(): Optional<Double> = Optional.ofNullable(scheduledDistanceAlongTrip.getNullable("scheduledDistanceAlongTrip"))

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(): Optional<List<String>> = Optional.ofNullable(situationIds.getNullable("situationIds"))

                    /** Current status modifiers for the trip. */
                    fun status(): String = status.getRequired("status")

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(): Double = totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(): Optional<String> = Optional.ofNullable(vehicleId.getNullable("vehicleId"))

                    /** Trip ID of the trip the vehicle is actively serving. */
                    @JsonProperty("activeTripId")
                    @ExcludeMissing
                    fun _activeTripId() = activeTripId

                    /** Index of the active trip into the sequence of trips for the active block. */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun _blockTripSequence() = blockTripSequence

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    @JsonProperty("closestStop")
                    @ExcludeMissing
                    fun _closestStop() = closestStop

                    /**
                     * Time offset from the closest stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    fun _closestStopTimeOffset() = closestStopTimeOffset

                    /** Distance, in meters, the transit vehicle has progressed along the active trip. */
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun _distanceAlongTrip() = distanceAlongTrip

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun _frequency() = frequency

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastKnownDistanceAlongTrip")
                    @ExcludeMissing
                    fun _lastKnownDistanceAlongTrip() = lastKnownDistanceAlongTrip

                    /** Last known location of the transit vehicle. */
                    @JsonProperty("lastKnownLocation")
                    @ExcludeMissing
                    fun _lastKnownLocation() = lastKnownLocation

                    /** Last known orientation value received in real-time from the transit vehicle. */
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    fun _lastKnownOrientation() = lastKnownOrientation

                    /** Timestamp of the last known real-time location update from the transit vehicle. */
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    fun _lastLocationUpdateTime() = lastLocationUpdateTime

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun _lastUpdateTime() = lastUpdateTime

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    @JsonProperty("nextStop")
                    @ExcludeMissing
                    fun _nextStop() = nextStop

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    @JsonProperty("nextStopTimeOffset")
                    @ExcludeMissing
                    fun _nextStopTimeOffset() = nextStopTimeOffset

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    @JsonProperty("occupancyCapacity")
                    @ExcludeMissing
                    fun _occupancyCapacity() = occupancyCapacity

                    /** Current count of occupants in the transit vehicle. */
                    @JsonProperty("occupancyCount")
                    @ExcludeMissing
                    fun _occupancyCount() = occupancyCount

                    /** Current occupancy status of the transit vehicle. */
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    fun _occupancyStatus() = occupancyStatus

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    @JsonProperty("orientation")
                    @ExcludeMissing
                    fun _orientation() = orientation

                    /** Current journey phase of the trip. */
                    @JsonProperty("phase")
                    @ExcludeMissing
                    fun _phase() = phase

                    /** Current position of the transit vehicle. */
                    @JsonProperty("position")
                    @ExcludeMissing
                    fun _position() = position

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    fun _predicted() = predicted

                    /** Deviation from the schedule in seconds (positive for late, negative for early). */
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    fun _scheduleDeviation() = scheduleDeviation

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed along
                     * the active trip.
                     */
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    fun _scheduledDistanceAlongTrip() = scheduledDistanceAlongTrip

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    fun _serviceDate() = serviceDate

                    /** References to situation elements (if any) applicable to this trip. */
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    fun _situationIds() = situationIds

                    /** Current status modifiers for the trip. */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun _status() = status

                    /** Total length of the trip, in meters. */
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    fun _totalDistanceAlongTrip() = totalDistanceAlongTrip

                    /** ID of the transit vehicle currently serving the trip. */
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    fun _vehicleId() = vehicleId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TripStatus = apply {
                        if (!validated) {
                          activeTripId()
                          blockTripSequence()
                          closestStop()
                          closestStopTimeOffset()
                          distanceAlongTrip()
                          frequency()
                          lastKnownDistanceAlongTrip()
                          lastKnownLocation().map { it.validate() }
                          lastKnownOrientation()
                          lastLocationUpdateTime()
                          lastUpdateTime()
                          nextStop()
                          nextStopTimeOffset()
                          occupancyCapacity()
                          occupancyCount()
                          occupancyStatus()
                          orientation()
                          phase()
                          position().map { it.validate() }
                          predicted()
                          scheduleDeviation()
                          scheduledDistanceAlongTrip()
                          serviceDate()
                          situationIds()
                          status()
                          totalDistanceAlongTrip()
                          vehicleId()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is TripStatus &&
                          this.activeTripId == other.activeTripId &&
                          this.blockTripSequence == other.blockTripSequence &&
                          this.closestStop == other.closestStop &&
                          this.closestStopTimeOffset == other.closestStopTimeOffset &&
                          this.distanceAlongTrip == other.distanceAlongTrip &&
                          this.frequency == other.frequency &&
                          this.lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip &&
                          this.lastKnownLocation == other.lastKnownLocation &&
                          this.lastKnownOrientation == other.lastKnownOrientation &&
                          this.lastLocationUpdateTime == other.lastLocationUpdateTime &&
                          this.lastUpdateTime == other.lastUpdateTime &&
                          this.nextStop == other.nextStop &&
                          this.nextStopTimeOffset == other.nextStopTimeOffset &&
                          this.occupancyCapacity == other.occupancyCapacity &&
                          this.occupancyCount == other.occupancyCount &&
                          this.occupancyStatus == other.occupancyStatus &&
                          this.orientation == other.orientation &&
                          this.phase == other.phase &&
                          this.position == other.position &&
                          this.predicted == other.predicted &&
                          this.scheduleDeviation == other.scheduleDeviation &&
                          this.scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip &&
                          this.serviceDate == other.serviceDate &&
                          this.situationIds == other.situationIds &&
                          this.status == other.status &&
                          this.totalDistanceAlongTrip == other.totalDistanceAlongTrip &&
                          this.vehicleId == other.vehicleId &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            activeTripId,
                            blockTripSequence,
                            closestStop,
                            closestStopTimeOffset,
                            distanceAlongTrip,
                            frequency,
                            lastKnownDistanceAlongTrip,
                            lastKnownLocation,
                            lastKnownOrientation,
                            lastLocationUpdateTime,
                            lastUpdateTime,
                            nextStop,
                            nextStopTimeOffset,
                            occupancyCapacity,
                            occupancyCount,
                            occupancyStatus,
                            orientation,
                            phase,
                            position,
                            predicted,
                            scheduleDeviation,
                            scheduledDistanceAlongTrip,
                            serviceDate,
                            situationIds,
                            status,
                            totalDistanceAlongTrip,
                            vehicleId,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, closestStopTimeOffset=$closestStopTimeOffset, distanceAlongTrip=$distanceAlongTrip, frequency=$frequency, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, orientation=$orientation, phase=$phase, position=$position, predicted=$predicted, scheduleDeviation=$scheduleDeviation, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var activeTripId: JsonField<String> = JsonMissing.of()
                        private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                        private var closestStop: JsonField<String> = JsonMissing.of()
                        private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                        private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var frequency: JsonField<String> = JsonMissing.of()
                        private var lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of()
                        private var lastKnownOrientation: JsonField<Double> = JsonMissing.of()
                        private var lastLocationUpdateTime: JsonField<Long> = JsonMissing.of()
                        private var lastUpdateTime: JsonField<Long> = JsonMissing.of()
                        private var nextStop: JsonField<String> = JsonMissing.of()
                        private var nextStopTimeOffset: JsonField<Long> = JsonMissing.of()
                        private var occupancyCapacity: JsonField<Long> = JsonMissing.of()
                        private var occupancyCount: JsonField<Long> = JsonMissing.of()
                        private var occupancyStatus: JsonField<String> = JsonMissing.of()
                        private var orientation: JsonField<Double> = JsonMissing.of()
                        private var phase: JsonField<String> = JsonMissing.of()
                        private var position: JsonField<Position> = JsonMissing.of()
                        private var predicted: JsonField<Boolean> = JsonMissing.of()
                        private var scheduleDeviation: JsonField<Long> = JsonMissing.of()
                        private var scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var serviceDate: JsonField<Long> = JsonMissing.of()
                        private var situationIds: JsonField<List<String>> = JsonMissing.of()
                        private var status: JsonField<String> = JsonMissing.of()
                        private var totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var vehicleId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tripStatus: TripStatus) = apply {
                            this.activeTripId = tripStatus.activeTripId
                            this.blockTripSequence = tripStatus.blockTripSequence
                            this.closestStop = tripStatus.closestStop
                            this.closestStopTimeOffset = tripStatus.closestStopTimeOffset
                            this.distanceAlongTrip = tripStatus.distanceAlongTrip
                            this.frequency = tripStatus.frequency
                            this.lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                            this.lastKnownLocation = tripStatus.lastKnownLocation
                            this.lastKnownOrientation = tripStatus.lastKnownOrientation
                            this.lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                            this.lastUpdateTime = tripStatus.lastUpdateTime
                            this.nextStop = tripStatus.nextStop
                            this.nextStopTimeOffset = tripStatus.nextStopTimeOffset
                            this.occupancyCapacity = tripStatus.occupancyCapacity
                            this.occupancyCount = tripStatus.occupancyCount
                            this.occupancyStatus = tripStatus.occupancyStatus
                            this.orientation = tripStatus.orientation
                            this.phase = tripStatus.phase
                            this.position = tripStatus.position
                            this.predicted = tripStatus.predicted
                            this.scheduleDeviation = tripStatus.scheduleDeviation
                            this.scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                            this.serviceDate = tripStatus.serviceDate
                            this.situationIds = tripStatus.situationIds
                            this.status = tripStatus.status
                            this.totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                            this.vehicleId = tripStatus.vehicleId
                            additionalProperties(tripStatus.additionalProperties)
                        }

                        /** Trip ID of the trip the vehicle is actively serving. */
                        fun activeTripId(activeTripId: String) = activeTripId(JsonField.of(activeTripId))

                        /** Trip ID of the trip the vehicle is actively serving. */
                        @JsonProperty("activeTripId")
                        @ExcludeMissing
                        fun activeTripId(activeTripId: JsonField<String>) = apply {
                            this.activeTripId = activeTripId
                        }

                        /** Index of the active trip into the sequence of trips for the active block. */
                        fun blockTripSequence(blockTripSequence: Long) = blockTripSequence(JsonField.of(blockTripSequence))

                        /** Index of the active trip into the sequence of trips for the active block. */
                        @JsonProperty("blockTripSequence")
                        @ExcludeMissing
                        fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                            this.blockTripSequence = blockTripSequence
                        }

                        /** ID of the closest stop to the current location of the transit vehicle. */
                        fun closestStop(closestStop: String) = closestStop(JsonField.of(closestStop))

                        /** ID of the closest stop to the current location of the transit vehicle. */
                        @JsonProperty("closestStop")
                        @ExcludeMissing
                        fun closestStop(closestStop: JsonField<String>) = apply {
                            this.closestStop = closestStop
                        }

                        /**
                         * Time offset from the closest stop to the current position of the transit vehicle
                         * (in seconds).
                         */
                        fun closestStopTimeOffset(closestStopTimeOffset: Long) = closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                        /**
                         * Time offset from the closest stop to the current position of the transit vehicle
                         * (in seconds).
                         */
                        @JsonProperty("closestStopTimeOffset")
                        @ExcludeMissing
                        fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                            this.closestStopTimeOffset = closestStopTimeOffset
                        }

                        /** Distance, in meters, the transit vehicle has progressed along the active trip. */
                        fun distanceAlongTrip(distanceAlongTrip: Double) = distanceAlongTrip(JsonField.of(distanceAlongTrip))

                        /** Distance, in meters, the transit vehicle has progressed along the active trip. */
                        @JsonProperty("distanceAlongTrip")
                        @ExcludeMissing
                        fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                            this.distanceAlongTrip = distanceAlongTrip
                        }

                        /** Information about frequency-based scheduling, if applicable to the trip. */
                        fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                        /** Information about frequency-based scheduling, if applicable to the trip. */
                        @JsonProperty("frequency")
                        @ExcludeMissing
                        fun frequency(frequency: JsonField<String>) = apply {
                            this.frequency = frequency
                        }

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) = lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        @JsonProperty("lastKnownDistanceAlongTrip")
                        @ExcludeMissing
                        fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: JsonField<Double>) = apply {
                            this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip
                        }

                        /** Last known location of the transit vehicle. */
                        fun lastKnownLocation(lastKnownLocation: LastKnownLocation) = lastKnownLocation(JsonField.of(lastKnownLocation))

                        /** Last known location of the transit vehicle. */
                        @JsonProperty("lastKnownLocation")
                        @ExcludeMissing
                        fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) = apply {
                            this.lastKnownLocation = lastKnownLocation
                        }

                        /** Last known orientation value received in real-time from the transit vehicle. */
                        fun lastKnownOrientation(lastKnownOrientation: Double) = lastKnownOrientation(JsonField.of(lastKnownOrientation))

                        /** Last known orientation value received in real-time from the transit vehicle. */
                        @JsonProperty("lastKnownOrientation")
                        @ExcludeMissing
                        fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                            this.lastKnownOrientation = lastKnownOrientation
                        }

                        /** Timestamp of the last known real-time location update from the transit vehicle. */
                        fun lastLocationUpdateTime(lastLocationUpdateTime: Long) = lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                        /** Timestamp of the last known real-time location update from the transit vehicle. */
                        @JsonProperty("lastLocationUpdateTime")
                        @ExcludeMissing
                        fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) = apply {
                            this.lastLocationUpdateTime = lastLocationUpdateTime
                        }

                        /** Timestamp of the last known real-time update from the transit vehicle. */
                        fun lastUpdateTime(lastUpdateTime: Long) = lastUpdateTime(JsonField.of(lastUpdateTime))

                        /** Timestamp of the last known real-time update from the transit vehicle. */
                        @JsonProperty("lastUpdateTime")
                        @ExcludeMissing
                        fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                            this.lastUpdateTime = lastUpdateTime
                        }

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        @JsonProperty("nextStop")
                        @ExcludeMissing
                        fun nextStop(nextStop: JsonField<String>) = apply {
                            this.nextStop = nextStop
                        }

                        /**
                         * Time offset from the next stop to the current position of the transit vehicle
                         * (in seconds).
                         */
                        fun nextStopTimeOffset(nextStopTimeOffset: Long) = nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                        /**
                         * Time offset from the next stop to the current position of the transit vehicle
                         * (in seconds).
                         */
                        @JsonProperty("nextStopTimeOffset")
                        @ExcludeMissing
                        fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                            this.nextStopTimeOffset = nextStopTimeOffset
                        }

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        fun occupancyCapacity(occupancyCapacity: Long) = occupancyCapacity(JsonField.of(occupancyCapacity))

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        @JsonProperty("occupancyCapacity")
                        @ExcludeMissing
                        fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                            this.occupancyCapacity = occupancyCapacity
                        }

                        /** Current count of occupants in the transit vehicle. */
                        fun occupancyCount(occupancyCount: Long) = occupancyCount(JsonField.of(occupancyCount))

                        /** Current count of occupants in the transit vehicle. */
                        @JsonProperty("occupancyCount")
                        @ExcludeMissing
                        fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                            this.occupancyCount = occupancyCount
                        }

                        /** Current occupancy status of the transit vehicle. */
                        fun occupancyStatus(occupancyStatus: String) = occupancyStatus(JsonField.of(occupancyStatus))

                        /** Current occupancy status of the transit vehicle. */
                        @JsonProperty("occupancyStatus")
                        @ExcludeMissing
                        fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                            this.occupancyStatus = occupancyStatus
                        }

                        /** Orientation of the transit vehicle, represented as an angle in degrees. */
                        fun orientation(orientation: Double) = orientation(JsonField.of(orientation))

                        /** Orientation of the transit vehicle, represented as an angle in degrees. */
                        @JsonProperty("orientation")
                        @ExcludeMissing
                        fun orientation(orientation: JsonField<Double>) = apply {
                            this.orientation = orientation
                        }

                        /** Current journey phase of the trip. */
                        fun phase(phase: String) = phase(JsonField.of(phase))

                        /** Current journey phase of the trip. */
                        @JsonProperty("phase")
                        @ExcludeMissing
                        fun phase(phase: JsonField<String>) = apply {
                            this.phase = phase
                        }

                        /** Current position of the transit vehicle. */
                        fun position(position: Position) = position(JsonField.of(position))

                        /** Current position of the transit vehicle. */
                        @JsonProperty("position")
                        @ExcludeMissing
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
                        }

                        /** Indicates if real-time arrival info is available for this trip. */
                        fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                        /** Indicates if real-time arrival info is available for this trip. */
                        @JsonProperty("predicted")
                        @ExcludeMissing
                        fun predicted(predicted: JsonField<Boolean>) = apply {
                            this.predicted = predicted
                        }

                        /** Deviation from the schedule in seconds (positive for late, negative for early). */
                        fun scheduleDeviation(scheduleDeviation: Long) = scheduleDeviation(JsonField.of(scheduleDeviation))

                        /** Deviation from the schedule in seconds (positive for late, negative for early). */
                        @JsonProperty("scheduleDeviation")
                        @ExcludeMissing
                        fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                            this.scheduleDeviation = scheduleDeviation
                        }

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed along
                         * the active trip.
                         */
                        fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) = scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed along
                         * the active trip.
                         */
                        @JsonProperty("scheduledDistanceAlongTrip")
                        @ExcludeMissing
                        fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: JsonField<Double>) = apply {
                            this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip
                        }

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                         * service date for the trip.
                         */
                        fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                         * service date for the trip.
                         */
                        @JsonProperty("serviceDate")
                        @ExcludeMissing
                        fun serviceDate(serviceDate: JsonField<Long>) = apply {
                            this.serviceDate = serviceDate
                        }

                        /** References to situation elements (if any) applicable to this trip. */
                        fun situationIds(situationIds: List<String>) = situationIds(JsonField.of(situationIds))

                        /** References to situation elements (if any) applicable to this trip. */
                        @JsonProperty("situationIds")
                        @ExcludeMissing
                        fun situationIds(situationIds: JsonField<List<String>>) = apply {
                            this.situationIds = situationIds
                        }

                        /** Current status modifiers for the trip. */
                        fun status(status: String) = status(JsonField.of(status))

                        /** Current status modifiers for the trip. */
                        @JsonProperty("status")
                        @ExcludeMissing
                        fun status(status: JsonField<String>) = apply {
                            this.status = status
                        }

                        /** Total length of the trip, in meters. */
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) = totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                        /** Total length of the trip, in meters. */
                        @JsonProperty("totalDistanceAlongTrip")
                        @ExcludeMissing
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) = apply {
                            this.totalDistanceAlongTrip = totalDistanceAlongTrip
                        }

                        /** ID of the transit vehicle currently serving the trip. */
                        fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                        /** ID of the transit vehicle currently serving the trip. */
                        @JsonProperty("vehicleId")
                        @ExcludeMissing
                        fun vehicleId(vehicleId: JsonField<String>) = apply {
                            this.vehicleId = vehicleId
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

                        fun build(): TripStatus = TripStatus(
                            activeTripId,
                            blockTripSequence,
                            closestStop,
                            closestStopTimeOffset,
                            distanceAlongTrip,
                            frequency,
                            lastKnownDistanceAlongTrip,
                            lastKnownLocation,
                            lastKnownOrientation,
                            lastLocationUpdateTime,
                            lastUpdateTime,
                            nextStop,
                            nextStopTimeOffset,
                            occupancyCapacity,
                            occupancyCount,
                            occupancyStatus,
                            orientation,
                            phase,
                            position,
                            predicted,
                            scheduleDeviation,
                            scheduledDistanceAlongTrip,
                            serviceDate,
                            situationIds.map { it.toUnmodifiable() },
                            status,
                            totalDistanceAlongTrip,
                            vehicleId,
                            additionalProperties.toUnmodifiable(),
                        )
                    }

                    /** Last known location of the transit vehicle. */
                    @JsonDeserialize(builder = LastKnownLocation.Builder::class)
                    @NoAutoDetect
                    class LastKnownLocation private constructor(private val lat: JsonField<Double>, private val lon: JsonField<Double>, private val additionalProperties: Map<String, JsonValue>, ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(): Optional<Double> = Optional.ofNullable(lat.getNullable("lat"))

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(): Optional<Double> = Optional.ofNullable(lon.getNullable("lon"))

                        /** Latitude of the last known location of the transit vehicle. */
                        @JsonProperty("lat")
                        @ExcludeMissing
                        fun _lat() = lat

                        /** Longitude of the last known location of the transit vehicle. */
                        @JsonProperty("lon")
                        @ExcludeMissing
                        fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): LastKnownLocation = apply {
                            if (!validated) {
                              lat()
                              lon()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is LastKnownLocation &&
                              this.lat == other.lat &&
                              this.lon == other.lon &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                lat,
                                lon,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                                this.lat = lastKnownLocation.lat
                                this.lon = lastKnownLocation.lon
                                additionalProperties(lastKnownLocation.additionalProperties)
                            }

                            /** Latitude of the last known location of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the last known location of the transit vehicle. */
                            @JsonProperty("lat")
                            @ExcludeMissing
                            fun lat(lat: JsonField<Double>) = apply {
                                this.lat = lat
                            }

                            /** Longitude of the last known location of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the last known location of the transit vehicle. */
                            @JsonProperty("lon")
                            @ExcludeMissing
                            fun lon(lon: JsonField<Double>) = apply {
                                this.lon = lon
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

                            fun build(): LastKnownLocation = LastKnownLocation(
                                lat,
                                lon,
                                additionalProperties.toUnmodifiable(),
                            )
                        }
                    }

                    /** Current position of the transit vehicle. */
                    @JsonDeserialize(builder = Position.Builder::class)
                    @NoAutoDetect
                    class Position private constructor(private val lat: JsonField<Double>, private val lon: JsonField<Double>, private val additionalProperties: Map<String, JsonValue>, ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(): Optional<Double> = Optional.ofNullable(lat.getNullable("lat"))

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(): Optional<Double> = Optional.ofNullable(lon.getNullable("lon"))

                        /** Latitude of the current position of the transit vehicle. */
                        @JsonProperty("lat")
                        @ExcludeMissing
                        fun _lat() = lat

                        /** Longitude of the current position of the transit vehicle. */
                        @JsonProperty("lon")
                        @ExcludeMissing
                        fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Position = apply {
                            if (!validated) {
                              lat()
                              lon()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is Position &&
                              this.lat == other.lat &&
                              this.lon == other.lon &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                lat,
                                lon,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(position: Position) = apply {
                                this.lat = position.lat
                                this.lon = position.lon
                                additionalProperties(position.additionalProperties)
                            }

                            /** Latitude of the current position of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the current position of the transit vehicle. */
                            @JsonProperty("lat")
                            @ExcludeMissing
                            fun lat(lat: JsonField<Double>) = apply {
                                this.lat = lat
                            }

                            /** Longitude of the current position of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the current position of the transit vehicle. */
                            @JsonProperty("lon")
                            @ExcludeMissing
                            fun lon(lon: JsonField<Double>) = apply {
                                this.lon = lon
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

                            fun build(): Position = Position(
                                lat,
                                lon,
                                additionalProperties.toUnmodifiable(),
                            )
                        }
                    }
                }
            }
        }
    }
}
