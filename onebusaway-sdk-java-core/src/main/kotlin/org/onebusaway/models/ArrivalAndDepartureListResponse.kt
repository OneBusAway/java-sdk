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
class ArrivalAndDepartureListResponse
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
        internal fun from(arrivalAndDepartureListResponse: ArrivalAndDepartureListResponse) =
            apply {
                code = arrivalAndDepartureListResponse.code
                currentTime = arrivalAndDepartureListResponse.currentTime
                text = arrivalAndDepartureListResponse.text
                version = arrivalAndDepartureListResponse.version
                data = arrivalAndDepartureListResponse.data
                additionalProperties =
                    arrivalAndDepartureListResponse.additionalProperties.toMutableMap()
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

        fun build(): ArrivalAndDepartureListResponse =
            ArrivalAndDepartureListResponse(
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
            @JsonProperty("arrivalsAndDepartures")
            @ExcludeMissing
            private val arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun arrivalsAndDepartures(): List<ArrivalsAndDeparture> =
                arrivalsAndDepartures.getRequired("arrivalsAndDepartures")

            @JsonProperty("arrivalsAndDepartures")
            @ExcludeMissing
            fun _arrivalsAndDepartures() = arrivalsAndDepartures

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (!validated) {
                    arrivalsAndDepartures().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    arrivalsAndDepartures = entry.arrivalsAndDepartures
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun arrivalsAndDepartures(arrivalsAndDepartures: List<ArrivalsAndDeparture>) =
                    arrivalsAndDepartures(JsonField.of(arrivalsAndDepartures))

                fun arrivalsAndDepartures(
                    arrivalsAndDepartures: JsonField<List<ArrivalsAndDeparture>>
                ) = apply { this.arrivalsAndDepartures = arrivalsAndDepartures }

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
                        arrivalsAndDepartures.map { it.toImmutable() },
                        additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class ArrivalsAndDeparture
            @JsonCreator
            private constructor(
                @JsonProperty("actualTrack")
                @ExcludeMissing
                private val actualTrack: JsonField<String> = JsonMissing.of(),
                @JsonProperty("arrivalEnabled")
                @ExcludeMissing
                private val arrivalEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blockTripSequence")
                @ExcludeMissing
                private val blockTripSequence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("departureEnabled")
                @ExcludeMissing
                private val departureEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("distanceFromStop")
                @ExcludeMissing
                private val distanceFromStop: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("frequency")
                @ExcludeMissing
                private val frequency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("historicalOccupancy")
                @ExcludeMissing
                private val historicalOccupancy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lastUpdateTime")
                @ExcludeMissing
                private val lastUpdateTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("numberOfStopsAway")
                @ExcludeMissing
                private val numberOfStopsAway: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("occupancyStatus")
                @ExcludeMissing
                private val occupancyStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predicted")
                @ExcludeMissing
                private val predicted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("predictedArrivalInterval")
                @ExcludeMissing
                private val predictedArrivalInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predictedArrivalTime")
                @ExcludeMissing
                private val predictedArrivalTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("predictedDepartureInterval")
                @ExcludeMissing
                private val predictedDepartureInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("predictedDepartureTime")
                @ExcludeMissing
                private val predictedDepartureTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("predictedOccupancy")
                @ExcludeMissing
                private val predictedOccupancy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeId")
                @ExcludeMissing
                private val routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeLongName")
                @ExcludeMissing
                private val routeLongName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeShortName")
                @ExcludeMissing
                private val routeShortName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledArrivalInterval")
                @ExcludeMissing
                private val scheduledArrivalInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledArrivalTime")
                @ExcludeMissing
                private val scheduledArrivalTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("scheduledDepartureInterval")
                @ExcludeMissing
                private val scheduledDepartureInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduledDepartureTime")
                @ExcludeMissing
                private val scheduledDepartureTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("scheduledTrack")
                @ExcludeMissing
                private val scheduledTrack: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serviceDate")
                @ExcludeMissing
                private val serviceDate: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("situationIds")
                @ExcludeMissing
                private val situationIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                private val status: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopId")
                @ExcludeMissing
                private val stopId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopSequence")
                @ExcludeMissing
                private val stopSequence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalStopsInTrip")
                @ExcludeMissing
                private val totalStopsInTrip: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                private val tripHeadsign: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tripId")
                @ExcludeMissing
                private val tripId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tripStatus")
                @ExcludeMissing
                private val tripStatus: JsonField<TripStatus> = JsonMissing.of(),
                @JsonProperty("vehicleId")
                @ExcludeMissing
                private val vehicleId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The actual track information of the arriving transit vehicle. */
                fun actualTrack(): Optional<String> =
                    Optional.ofNullable(actualTrack.getNullable("actualTrack"))

                /** Indicates if riders can arrive on this transit vehicle. */
                fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                /** Index of this arrival’s trip into the sequence of trips for the active block. */
                fun blockTripSequence(): Long = blockTripSequence.getRequired("blockTripSequence")

                /** Indicates if riders can depart from this transit vehicle. */
                fun departureEnabled(): Boolean = departureEnabled.getRequired("departureEnabled")

                /** Distance of the arriving transit vehicle from the stop, in meters. */
                fun distanceFromStop(): Optional<Double> =
                    Optional.ofNullable(distanceFromStop.getNullable("distanceFromStop"))

                /** Information about frequency-based scheduling, if applicable to the trip. */
                fun frequency(): Optional<String> =
                    Optional.ofNullable(frequency.getNullable("frequency"))

                /** Historical occupancy information of the transit vehicle. */
                fun historicalOccupancy(): Optional<String> =
                    Optional.ofNullable(historicalOccupancy.getNullable("historicalOccupancy"))

                /** Timestamp of the last update time for this arrival. */
                fun lastUpdateTime(): Optional<Long> =
                    Optional.ofNullable(lastUpdateTime.getNullable("lastUpdateTime"))

                /**
                 * Number of stops between the arriving transit vehicle and the current stop
                 * (excluding the current stop).
                 */
                fun numberOfStopsAway(): Long = numberOfStopsAway.getRequired("numberOfStopsAway")

                /** Current occupancy status of the transit vehicle. */
                fun occupancyStatus(): Optional<String> =
                    Optional.ofNullable(occupancyStatus.getNullable("occupancyStatus"))

                /** Indicates if real-time arrival info is available for this trip. */
                fun predicted(): Optional<Boolean> =
                    Optional.ofNullable(predicted.getNullable("predicted"))

                /** Interval for predicted arrival time, if available. */
                fun predictedArrivalInterval(): Optional<String> =
                    Optional.ofNullable(
                        predictedArrivalInterval.getNullable("predictedArrivalInterval")
                    )

                /**
                 * Predicted arrival time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedArrivalTime(): Long =
                    predictedArrivalTime.getRequired("predictedArrivalTime")

                /** Interval for predicted departure time, if available. */
                fun predictedDepartureInterval(): Optional<String> =
                    Optional.ofNullable(
                        predictedDepartureInterval.getNullable("predictedDepartureInterval")
                    )

                /**
                 * Predicted departure time, in milliseconds since Unix epoch (zero if no real-time
                 * available).
                 */
                fun predictedDepartureTime(): Long =
                    predictedDepartureTime.getRequired("predictedDepartureTime")

                /** Predicted occupancy status of the transit vehicle. */
                fun predictedOccupancy(): Optional<String> =
                    Optional.ofNullable(predictedOccupancy.getNullable("predictedOccupancy"))

                /** The ID of the route for the arriving vehicle. */
                fun routeId(): String = routeId.getRequired("routeId")

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                fun routeLongName(): Optional<String> =
                    Optional.ofNullable(routeLongName.getNullable("routeLongName"))

                /**
                 * Optional route short name that potentially overrides the route short name in the
                 * referenced route element.
                 */
                fun routeShortName(): Optional<String> =
                    Optional.ofNullable(routeShortName.getNullable("routeShortName"))

                /** Interval for scheduled arrival time. */
                fun scheduledArrivalInterval(): Optional<String> =
                    Optional.ofNullable(
                        scheduledArrivalInterval.getNullable("scheduledArrivalInterval")
                    )

                /** Scheduled arrival time, in milliseconds since Unix epoch. */
                fun scheduledArrivalTime(): Long =
                    scheduledArrivalTime.getRequired("scheduledArrivalTime")

                /** Interval for scheduled departure time. */
                fun scheduledDepartureInterval(): Optional<String> =
                    Optional.ofNullable(
                        scheduledDepartureInterval.getNullable("scheduledDepartureInterval")
                    )

                /** Scheduled departure time, in milliseconds since Unix epoch. */
                fun scheduledDepartureTime(): Long =
                    scheduledDepartureTime.getRequired("scheduledDepartureTime")

                /** Scheduled track information of the arriving transit vehicle. */
                fun scheduledTrack(): Optional<String> =
                    Optional.ofNullable(scheduledTrack.getNullable("scheduledTrack"))

                /**
                 * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                 * service date for the trip.
                 */
                fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                /** References to situation elements (if any) applicable to this arrival. */
                fun situationIds(): Optional<List<String>> =
                    Optional.ofNullable(situationIds.getNullable("situationIds"))

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
                fun tripStatus(): Optional<TripStatus> =
                    Optional.ofNullable(tripStatus.getNullable("tripStatus"))

                /** ID of the transit vehicle serving this trip. */
                fun vehicleId(): String = vehicleId.getRequired("vehicleId")

                /** The actual track information of the arriving transit vehicle. */
                @JsonProperty("actualTrack") @ExcludeMissing fun _actualTrack() = actualTrack

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
                @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

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
                @JsonProperty("predicted") @ExcludeMissing fun _predicted() = predicted

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
                @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                /**
                 * Optional route long name that potentially overrides the route long name in the
                 * referenced route element.
                 */
                @JsonProperty("routeLongName") @ExcludeMissing fun _routeLongName() = routeLongName

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
                @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

                /** References to situation elements (if any) applicable to this arrival. */
                @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

                /** Current status of the arrival. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /** The ID of the stop the vehicle is arriving at. */
                @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                /**
                 * Index of the stop into the sequence of stops that make up the trip for this
                 * arrival.
                 */
                @JsonProperty("stopSequence") @ExcludeMissing fun _stopSequence() = stopSequence

                /** Total number of stops visited on the trip for this arrival. */
                @JsonProperty("totalStopsInTrip")
                @ExcludeMissing
                fun _totalStopsInTrip() = totalStopsInTrip

                /**
                 * Optional trip headsign that potentially overrides the trip headsign in the
                 * referenced trip element.
                 */
                @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

                /** The ID of the trip for the arriving vehicle. */
                @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                /** Trip-specific status for the arriving transit vehicle. */
                @JsonProperty("tripStatus") @ExcludeMissing fun _tripStatus() = tripStatus

                /** ID of the transit vehicle serving this trip. */
                @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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

                companion object {

                    @JvmStatic fun builder() = Builder()
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
                        actualTrack = arrivalsAndDeparture.actualTrack
                        arrivalEnabled = arrivalsAndDeparture.arrivalEnabled
                        blockTripSequence = arrivalsAndDeparture.blockTripSequence
                        departureEnabled = arrivalsAndDeparture.departureEnabled
                        distanceFromStop = arrivalsAndDeparture.distanceFromStop
                        frequency = arrivalsAndDeparture.frequency
                        historicalOccupancy = arrivalsAndDeparture.historicalOccupancy
                        lastUpdateTime = arrivalsAndDeparture.lastUpdateTime
                        numberOfStopsAway = arrivalsAndDeparture.numberOfStopsAway
                        occupancyStatus = arrivalsAndDeparture.occupancyStatus
                        predicted = arrivalsAndDeparture.predicted
                        predictedArrivalInterval = arrivalsAndDeparture.predictedArrivalInterval
                        predictedArrivalTime = arrivalsAndDeparture.predictedArrivalTime
                        predictedDepartureInterval = arrivalsAndDeparture.predictedDepartureInterval
                        predictedDepartureTime = arrivalsAndDeparture.predictedDepartureTime
                        predictedOccupancy = arrivalsAndDeparture.predictedOccupancy
                        routeId = arrivalsAndDeparture.routeId
                        routeLongName = arrivalsAndDeparture.routeLongName
                        routeShortName = arrivalsAndDeparture.routeShortName
                        scheduledArrivalInterval = arrivalsAndDeparture.scheduledArrivalInterval
                        scheduledArrivalTime = arrivalsAndDeparture.scheduledArrivalTime
                        scheduledDepartureInterval = arrivalsAndDeparture.scheduledDepartureInterval
                        scheduledDepartureTime = arrivalsAndDeparture.scheduledDepartureTime
                        scheduledTrack = arrivalsAndDeparture.scheduledTrack
                        serviceDate = arrivalsAndDeparture.serviceDate
                        situationIds = arrivalsAndDeparture.situationIds
                        status = arrivalsAndDeparture.status
                        stopId = arrivalsAndDeparture.stopId
                        stopSequence = arrivalsAndDeparture.stopSequence
                        totalStopsInTrip = arrivalsAndDeparture.totalStopsInTrip
                        tripHeadsign = arrivalsAndDeparture.tripHeadsign
                        tripId = arrivalsAndDeparture.tripId
                        tripStatus = arrivalsAndDeparture.tripStatus
                        vehicleId = arrivalsAndDeparture.vehicleId
                        additionalProperties =
                            arrivalsAndDeparture.additionalProperties.toMutableMap()
                    }

                    /** The actual track information of the arriving transit vehicle. */
                    fun actualTrack(actualTrack: String) = actualTrack(JsonField.of(actualTrack))

                    /** The actual track information of the arriving transit vehicle. */
                    fun actualTrack(actualTrack: JsonField<String>) = apply {
                        this.actualTrack = actualTrack
                    }

                    /** Indicates if riders can arrive on this transit vehicle. */
                    fun arrivalEnabled(arrivalEnabled: Boolean) =
                        arrivalEnabled(JsonField.of(arrivalEnabled))

                    /** Indicates if riders can arrive on this transit vehicle. */
                    fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                        this.arrivalEnabled = arrivalEnabled
                    }

                    /**
                     * Index of this arrival’s trip into the sequence of trips for the active block.
                     */
                    fun blockTripSequence(blockTripSequence: Long) =
                        blockTripSequence(JsonField.of(blockTripSequence))

                    /**
                     * Index of this arrival’s trip into the sequence of trips for the active block.
                     */
                    fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                        this.blockTripSequence = blockTripSequence
                    }

                    /** Indicates if riders can depart from this transit vehicle. */
                    fun departureEnabled(departureEnabled: Boolean) =
                        departureEnabled(JsonField.of(departureEnabled))

                    /** Indicates if riders can depart from this transit vehicle. */
                    fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                        this.departureEnabled = departureEnabled
                    }

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    fun distanceFromStop(distanceFromStop: Double) =
                        distanceFromStop(JsonField.of(distanceFromStop))

                    /** Distance of the arriving transit vehicle from the stop, in meters. */
                    fun distanceFromStop(distanceFromStop: JsonField<Double>) = apply {
                        this.distanceFromStop = distanceFromStop
                    }

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(frequency: JsonField<String>) = apply {
                        this.frequency = frequency
                    }

                    /** Historical occupancy information of the transit vehicle. */
                    fun historicalOccupancy(historicalOccupancy: String) =
                        historicalOccupancy(JsonField.of(historicalOccupancy))

                    /** Historical occupancy information of the transit vehicle. */
                    fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                        this.historicalOccupancy = historicalOccupancy
                    }

                    /** Timestamp of the last update time for this arrival. */
                    fun lastUpdateTime(lastUpdateTime: Long) =
                        lastUpdateTime(JsonField.of(lastUpdateTime))

                    /** Timestamp of the last update time for this arrival. */
                    fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                        this.lastUpdateTime = lastUpdateTime
                    }

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    fun numberOfStopsAway(numberOfStopsAway: Long) =
                        numberOfStopsAway(JsonField.of(numberOfStopsAway))

                    /**
                     * Number of stops between the arriving transit vehicle and the current stop
                     * (excluding the current stop).
                     */
                    fun numberOfStopsAway(numberOfStopsAway: JsonField<Long>) = apply {
                        this.numberOfStopsAway = numberOfStopsAway
                    }

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: String) =
                        occupancyStatus(JsonField.of(occupancyStatus))

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                        this.occupancyStatus = occupancyStatus
                    }

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(predicted: JsonField<Boolean>) = apply {
                        this.predicted = predicted
                    }

                    /** Interval for predicted arrival time, if available. */
                    fun predictedArrivalInterval(predictedArrivalInterval: String) =
                        predictedArrivalInterval(JsonField.of(predictedArrivalInterval))

                    /** Interval for predicted arrival time, if available. */
                    fun predictedArrivalInterval(predictedArrivalInterval: JsonField<String>) =
                        apply {
                            this.predictedArrivalInterval = predictedArrivalInterval
                        }

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedArrivalTime(predictedArrivalTime: Long) =
                        predictedArrivalTime(JsonField.of(predictedArrivalTime))

                    /**
                     * Predicted arrival time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedArrivalTime(predictedArrivalTime: JsonField<Long>) = apply {
                        this.predictedArrivalTime = predictedArrivalTime
                    }

                    /** Interval for predicted departure time, if available. */
                    fun predictedDepartureInterval(predictedDepartureInterval: String) =
                        predictedDepartureInterval(JsonField.of(predictedDepartureInterval))

                    /** Interval for predicted departure time, if available. */
                    fun predictedDepartureInterval(predictedDepartureInterval: JsonField<String>) =
                        apply {
                            this.predictedDepartureInterval = predictedDepartureInterval
                        }

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedDepartureTime(predictedDepartureTime: Long) =
                        predictedDepartureTime(JsonField.of(predictedDepartureTime))

                    /**
                     * Predicted departure time, in milliseconds since Unix epoch (zero if no
                     * real-time available).
                     */
                    fun predictedDepartureTime(predictedDepartureTime: JsonField<Long>) = apply {
                        this.predictedDepartureTime = predictedDepartureTime
                    }

                    /** Predicted occupancy status of the transit vehicle. */
                    fun predictedOccupancy(predictedOccupancy: String) =
                        predictedOccupancy(JsonField.of(predictedOccupancy))

                    /** Predicted occupancy status of the transit vehicle. */
                    fun predictedOccupancy(predictedOccupancy: JsonField<String>) = apply {
                        this.predictedOccupancy = predictedOccupancy
                    }

                    /** The ID of the route for the arriving vehicle. */
                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    /** The ID of the route for the arriving vehicle. */
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    /**
                     * Optional route long name that potentially overrides the route long name in
                     * the referenced route element.
                     */
                    fun routeLongName(routeLongName: String) =
                        routeLongName(JsonField.of(routeLongName))

                    /**
                     * Optional route long name that potentially overrides the route long name in
                     * the referenced route element.
                     */
                    fun routeLongName(routeLongName: JsonField<String>) = apply {
                        this.routeLongName = routeLongName
                    }

                    /**
                     * Optional route short name that potentially overrides the route short name in
                     * the referenced route element.
                     */
                    fun routeShortName(routeShortName: String) =
                        routeShortName(JsonField.of(routeShortName))

                    /**
                     * Optional route short name that potentially overrides the route short name in
                     * the referenced route element.
                     */
                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
                    }

                    /** Interval for scheduled arrival time. */
                    fun scheduledArrivalInterval(scheduledArrivalInterval: String) =
                        scheduledArrivalInterval(JsonField.of(scheduledArrivalInterval))

                    /** Interval for scheduled arrival time. */
                    fun scheduledArrivalInterval(scheduledArrivalInterval: JsonField<String>) =
                        apply {
                            this.scheduledArrivalInterval = scheduledArrivalInterval
                        }

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    fun scheduledArrivalTime(scheduledArrivalTime: Long) =
                        scheduledArrivalTime(JsonField.of(scheduledArrivalTime))

                    /** Scheduled arrival time, in milliseconds since Unix epoch. */
                    fun scheduledArrivalTime(scheduledArrivalTime: JsonField<Long>) = apply {
                        this.scheduledArrivalTime = scheduledArrivalTime
                    }

                    /** Interval for scheduled departure time. */
                    fun scheduledDepartureInterval(scheduledDepartureInterval: String) =
                        scheduledDepartureInterval(JsonField.of(scheduledDepartureInterval))

                    /** Interval for scheduled departure time. */
                    fun scheduledDepartureInterval(scheduledDepartureInterval: JsonField<String>) =
                        apply {
                            this.scheduledDepartureInterval = scheduledDepartureInterval
                        }

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    fun scheduledDepartureTime(scheduledDepartureTime: Long) =
                        scheduledDepartureTime(JsonField.of(scheduledDepartureTime))

                    /** Scheduled departure time, in milliseconds since Unix epoch. */
                    fun scheduledDepartureTime(scheduledDepartureTime: JsonField<Long>) = apply {
                        this.scheduledDepartureTime = scheduledDepartureTime
                    }

                    /** Scheduled track information of the arriving transit vehicle. */
                    fun scheduledTrack(scheduledTrack: String) =
                        scheduledTrack(JsonField.of(scheduledTrack))

                    /** Scheduled track information of the arriving transit vehicle. */
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
                    fun serviceDate(serviceDate: JsonField<Long>) = apply {
                        this.serviceDate = serviceDate
                    }

                    /** References to situation elements (if any) applicable to this arrival. */
                    fun situationIds(situationIds: List<String>) =
                        situationIds(JsonField.of(situationIds))

                    /** References to situation elements (if any) applicable to this arrival. */
                    fun situationIds(situationIds: JsonField<List<String>>) = apply {
                        this.situationIds = situationIds
                    }

                    /** Current status of the arrival. */
                    fun status(status: String) = status(JsonField.of(status))

                    /** Current status of the arrival. */
                    fun status(status: JsonField<String>) = apply { this.status = status }

                    /** The ID of the stop the vehicle is arriving at. */
                    fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                    /** The ID of the stop the vehicle is arriving at. */
                    fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    fun stopSequence(stopSequence: Long) = stopSequence(JsonField.of(stopSequence))

                    /**
                     * Index of the stop into the sequence of stops that make up the trip for this
                     * arrival.
                     */
                    fun stopSequence(stopSequence: JsonField<Long>) = apply {
                        this.stopSequence = stopSequence
                    }

                    /** Total number of stops visited on the trip for this arrival. */
                    fun totalStopsInTrip(totalStopsInTrip: Long) =
                        totalStopsInTrip(JsonField.of(totalStopsInTrip))

                    /** Total number of stops visited on the trip for this arrival. */
                    fun totalStopsInTrip(totalStopsInTrip: JsonField<Long>) = apply {
                        this.totalStopsInTrip = totalStopsInTrip
                    }

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

                    /**
                     * Optional trip headsign that potentially overrides the trip headsign in the
                     * referenced trip element.
                     */
                    fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                        this.tripHeadsign = tripHeadsign
                    }

                    /** The ID of the trip for the arriving vehicle. */
                    fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                    /** The ID of the trip for the arriving vehicle. */
                    fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                    /** Trip-specific status for the arriving transit vehicle. */
                    fun tripStatus(tripStatus: TripStatus) = tripStatus(JsonField.of(tripStatus))

                    /** Trip-specific status for the arriving transit vehicle. */
                    fun tripStatus(tripStatus: JsonField<TripStatus>) = apply {
                        this.tripStatus = tripStatus
                    }

                    /** ID of the transit vehicle serving this trip. */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /** ID of the transit vehicle serving this trip. */
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
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

                    fun build(): ArrivalsAndDeparture =
                        ArrivalsAndDeparture(
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
                            situationIds.map { it.toImmutable() },
                            status,
                            stopId,
                            stopSequence,
                            totalStopsInTrip,
                            tripHeadsign,
                            tripId,
                            tripStatus,
                            vehicleId,
                            additionalProperties.toImmutable(),
                        )
                }

                /** Trip-specific status for the arriving transit vehicle. */
                @NoAutoDetect
                class TripStatus
                @JsonCreator
                private constructor(
                    @JsonProperty("activeTripId")
                    @ExcludeMissing
                    private val activeTripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    private val blockTripSequence: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("closestStop")
                    @ExcludeMissing
                    private val closestStop: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    private val closestStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    private val distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    private val frequency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lastKnownDistanceAlongTrip")
                    @ExcludeMissing
                    private val lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lastKnownLocation")
                    @ExcludeMissing
                    private val lastKnownLocation: JsonField<LastKnownLocation> = JsonMissing.of(),
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    private val lastKnownOrientation: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    private val lastLocationUpdateTime: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    private val lastUpdateTime: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("nextStop")
                    @ExcludeMissing
                    private val nextStop: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nextStopTimeOffset")
                    @ExcludeMissing
                    private val nextStopTimeOffset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyCapacity")
                    @ExcludeMissing
                    private val occupancyCapacity: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyCount")
                    @ExcludeMissing
                    private val occupancyCount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("occupancyStatus")
                    @ExcludeMissing
                    private val occupancyStatus: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("orientation")
                    @ExcludeMissing
                    private val orientation: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("phase")
                    @ExcludeMissing
                    private val phase: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("position")
                    @ExcludeMissing
                    private val position: JsonField<Position> = JsonMissing.of(),
                    @JsonProperty("predicted")
                    @ExcludeMissing
                    private val predicted: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    private val scheduleDeviation: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    private val scheduledDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("serviceDate")
                    @ExcludeMissing
                    private val serviceDate: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("situationIds")
                    @ExcludeMissing
                    private val situationIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    private val status: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    private val totalDistanceAlongTrip: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("vehicleId")
                    @ExcludeMissing
                    private val vehicleId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Trip ID of the trip the vehicle is actively serving. */
                    fun activeTripId(): String = activeTripId.getRequired("activeTripId")

                    /** Index of the active trip into the sequence of trips for the active block. */
                    fun blockTripSequence(): Long =
                        blockTripSequence.getRequired("blockTripSequence")

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    fun closestStop(): String = closestStop.getRequired("closestStop")

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    fun closestStopTimeOffset(): Optional<Long> =
                        Optional.ofNullable(
                            closestStopTimeOffset.getNullable("closestStopTimeOffset")
                        )

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    fun distanceAlongTrip(): Double =
                        distanceAlongTrip.getRequired("distanceAlongTrip")

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    fun frequency(): Optional<String> =
                        Optional.ofNullable(frequency.getNullable("frequency"))

                    /**
                     * Last known distance along the trip received in real-time from the transit
                     * vehicle.
                     */
                    fun lastKnownDistanceAlongTrip(): Double =
                        lastKnownDistanceAlongTrip.getRequired("lastKnownDistanceAlongTrip")

                    /** Last known location of the transit vehicle. */
                    fun lastKnownLocation(): Optional<LastKnownLocation> =
                        Optional.ofNullable(lastKnownLocation.getNullable("lastKnownLocation"))

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    fun lastKnownOrientation(): Optional<Double> =
                        Optional.ofNullable(
                            lastKnownOrientation.getNullable("lastKnownOrientation")
                        )

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    fun lastLocationUpdateTime(): Long =
                        lastLocationUpdateTime.getRequired("lastLocationUpdateTime")

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    fun lastUpdateTime(): Long = lastUpdateTime.getRequired("lastUpdateTime")

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    fun nextStop(): Optional<String> =
                        Optional.ofNullable(nextStop.getNullable("nextStop"))

                    /**
                     * Time offset from the next stop to the current position of the transit vehicle
                     * (in seconds).
                     */
                    fun nextStopTimeOffset(): Optional<Long> =
                        Optional.ofNullable(nextStopTimeOffset.getNullable("nextStopTimeOffset"))

                    /** Capacity of the transit vehicle in terms of occupancy. */
                    fun occupancyCapacity(): Long =
                        occupancyCapacity.getRequired("occupancyCapacity")

                    /** Current count of occupants in the transit vehicle. */
                    fun occupancyCount(): Long = occupancyCount.getRequired("occupancyCount")

                    /** Current occupancy status of the transit vehicle. */
                    fun occupancyStatus(): String = occupancyStatus.getRequired("occupancyStatus")

                    /** Orientation of the transit vehicle, represented as an angle in degrees. */
                    fun orientation(): Optional<Double> =
                        Optional.ofNullable(orientation.getNullable("orientation"))

                    /** Current journey phase of the trip. */
                    fun phase(): String = phase.getRequired("phase")

                    /** Current position of the transit vehicle. */
                    fun position(): Optional<Position> =
                        Optional.ofNullable(position.getNullable("position"))

                    /** Indicates if real-time arrival info is available for this trip. */
                    fun predicted(): Boolean = predicted.getRequired("predicted")

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    fun scheduleDeviation(): Long =
                        scheduleDeviation.getRequired("scheduleDeviation")

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    fun scheduledDistanceAlongTrip(): Optional<Double> =
                        Optional.ofNullable(
                            scheduledDistanceAlongTrip.getNullable("scheduledDistanceAlongTrip")
                        )

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                    /** References to situation elements (if any) applicable to this trip. */
                    fun situationIds(): Optional<List<String>> =
                        Optional.ofNullable(situationIds.getNullable("situationIds"))

                    /** Current status modifiers for the trip. */
                    fun status(): String = status.getRequired("status")

                    /** Total length of the trip, in meters. */
                    fun totalDistanceAlongTrip(): Double =
                        totalDistanceAlongTrip.getRequired("totalDistanceAlongTrip")

                    /** ID of the transit vehicle currently serving the trip. */
                    fun vehicleId(): Optional<String> =
                        Optional.ofNullable(vehicleId.getNullable("vehicleId"))

                    /** Trip ID of the trip the vehicle is actively serving. */
                    @JsonProperty("activeTripId") @ExcludeMissing fun _activeTripId() = activeTripId

                    /** Index of the active trip into the sequence of trips for the active block. */
                    @JsonProperty("blockTripSequence")
                    @ExcludeMissing
                    fun _blockTripSequence() = blockTripSequence

                    /** ID of the closest stop to the current location of the transit vehicle. */
                    @JsonProperty("closestStop") @ExcludeMissing fun _closestStop() = closestStop

                    /**
                     * Time offset from the closest stop to the current position of the transit
                     * vehicle (in seconds).
                     */
                    @JsonProperty("closestStopTimeOffset")
                    @ExcludeMissing
                    fun _closestStopTimeOffset() = closestStopTimeOffset

                    /**
                     * Distance, in meters, the transit vehicle has progressed along the active
                     * trip.
                     */
                    @JsonProperty("distanceAlongTrip")
                    @ExcludeMissing
                    fun _distanceAlongTrip() = distanceAlongTrip

                    /** Information about frequency-based scheduling, if applicable to the trip. */
                    @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

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

                    /**
                     * Last known orientation value received in real-time from the transit vehicle.
                     */
                    @JsonProperty("lastKnownOrientation")
                    @ExcludeMissing
                    fun _lastKnownOrientation() = lastKnownOrientation

                    /**
                     * Timestamp of the last known real-time location update from the transit
                     * vehicle.
                     */
                    @JsonProperty("lastLocationUpdateTime")
                    @ExcludeMissing
                    fun _lastLocationUpdateTime() = lastLocationUpdateTime

                    /** Timestamp of the last known real-time update from the transit vehicle. */
                    @JsonProperty("lastUpdateTime")
                    @ExcludeMissing
                    fun _lastUpdateTime() = lastUpdateTime

                    /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                    @JsonProperty("nextStop") @ExcludeMissing fun _nextStop() = nextStop

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
                    @JsonProperty("orientation") @ExcludeMissing fun _orientation() = orientation

                    /** Current journey phase of the trip. */
                    @JsonProperty("phase") @ExcludeMissing fun _phase() = phase

                    /** Current position of the transit vehicle. */
                    @JsonProperty("position") @ExcludeMissing fun _position() = position

                    /** Indicates if real-time arrival info is available for this trip. */
                    @JsonProperty("predicted") @ExcludeMissing fun _predicted() = predicted

                    /**
                     * Deviation from the schedule in seconds (positive for late, negative for
                     * early).
                     */
                    @JsonProperty("scheduleDeviation")
                    @ExcludeMissing
                    fun _scheduleDeviation() = scheduleDeviation

                    /**
                     * Distance, in meters, the transit vehicle is scheduled to have progressed
                     * along the active trip.
                     */
                    @JsonProperty("scheduledDistanceAlongTrip")
                    @ExcludeMissing
                    fun _scheduledDistanceAlongTrip() = scheduledDistanceAlongTrip

                    /**
                     * Time, in milliseconds since the Unix epoch, of midnight for the start of the
                     * service date for the trip.
                     */
                    @JsonProperty("serviceDate") @ExcludeMissing fun _serviceDate() = serviceDate

                    /** References to situation elements (if any) applicable to this trip. */
                    @JsonProperty("situationIds") @ExcludeMissing fun _situationIds() = situationIds

                    /** Current status modifiers for the trip. */
                    @JsonProperty("status") @ExcludeMissing fun _status() = status

                    /** Total length of the trip, in meters. */
                    @JsonProperty("totalDistanceAlongTrip")
                    @ExcludeMissing
                    fun _totalDistanceAlongTrip() = totalDistanceAlongTrip

                    /** ID of the transit vehicle currently serving the trip. */
                    @JsonProperty("vehicleId") @ExcludeMissing fun _vehicleId() = vehicleId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var activeTripId: JsonField<String> = JsonMissing.of()
                        private var blockTripSequence: JsonField<Long> = JsonMissing.of()
                        private var closestStop: JsonField<String> = JsonMissing.of()
                        private var closestStopTimeOffset: JsonField<Long> = JsonMissing.of()
                        private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var frequency: JsonField<String> = JsonMissing.of()
                        private var lastKnownDistanceAlongTrip: JsonField<Double> = JsonMissing.of()
                        private var lastKnownLocation: JsonField<LastKnownLocation> =
                            JsonMissing.of()
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tripStatus: TripStatus) = apply {
                            activeTripId = tripStatus.activeTripId
                            blockTripSequence = tripStatus.blockTripSequence
                            closestStop = tripStatus.closestStop
                            closestStopTimeOffset = tripStatus.closestStopTimeOffset
                            distanceAlongTrip = tripStatus.distanceAlongTrip
                            frequency = tripStatus.frequency
                            lastKnownDistanceAlongTrip = tripStatus.lastKnownDistanceAlongTrip
                            lastKnownLocation = tripStatus.lastKnownLocation
                            lastKnownOrientation = tripStatus.lastKnownOrientation
                            lastLocationUpdateTime = tripStatus.lastLocationUpdateTime
                            lastUpdateTime = tripStatus.lastUpdateTime
                            nextStop = tripStatus.nextStop
                            nextStopTimeOffset = tripStatus.nextStopTimeOffset
                            occupancyCapacity = tripStatus.occupancyCapacity
                            occupancyCount = tripStatus.occupancyCount
                            occupancyStatus = tripStatus.occupancyStatus
                            orientation = tripStatus.orientation
                            phase = tripStatus.phase
                            position = tripStatus.position
                            predicted = tripStatus.predicted
                            scheduleDeviation = tripStatus.scheduleDeviation
                            scheduledDistanceAlongTrip = tripStatus.scheduledDistanceAlongTrip
                            serviceDate = tripStatus.serviceDate
                            situationIds = tripStatus.situationIds
                            status = tripStatus.status
                            totalDistanceAlongTrip = tripStatus.totalDistanceAlongTrip
                            vehicleId = tripStatus.vehicleId
                            additionalProperties = tripStatus.additionalProperties.toMutableMap()
                        }

                        /** Trip ID of the trip the vehicle is actively serving. */
                        fun activeTripId(activeTripId: String) =
                            activeTripId(JsonField.of(activeTripId))

                        /** Trip ID of the trip the vehicle is actively serving. */
                        fun activeTripId(activeTripId: JsonField<String>) = apply {
                            this.activeTripId = activeTripId
                        }

                        /**
                         * Index of the active trip into the sequence of trips for the active block.
                         */
                        fun blockTripSequence(blockTripSequence: Long) =
                            blockTripSequence(JsonField.of(blockTripSequence))

                        /**
                         * Index of the active trip into the sequence of trips for the active block.
                         */
                        fun blockTripSequence(blockTripSequence: JsonField<Long>) = apply {
                            this.blockTripSequence = blockTripSequence
                        }

                        /**
                         * ID of the closest stop to the current location of the transit vehicle.
                         */
                        fun closestStop(closestStop: String) =
                            closestStop(JsonField.of(closestStop))

                        /**
                         * ID of the closest stop to the current location of the transit vehicle.
                         */
                        fun closestStop(closestStop: JsonField<String>) = apply {
                            this.closestStop = closestStop
                        }

                        /**
                         * Time offset from the closest stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun closestStopTimeOffset(closestStopTimeOffset: Long) =
                            closestStopTimeOffset(JsonField.of(closestStopTimeOffset))

                        /**
                         * Time offset from the closest stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun closestStopTimeOffset(closestStopTimeOffset: JsonField<Long>) = apply {
                            this.closestStopTimeOffset = closestStopTimeOffset
                        }

                        /**
                         * Distance, in meters, the transit vehicle has progressed along the active
                         * trip.
                         */
                        fun distanceAlongTrip(distanceAlongTrip: Double) =
                            distanceAlongTrip(JsonField.of(distanceAlongTrip))

                        /**
                         * Distance, in meters, the transit vehicle has progressed along the active
                         * trip.
                         */
                        fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                            this.distanceAlongTrip = distanceAlongTrip
                        }

                        /**
                         * Information about frequency-based scheduling, if applicable to the trip.
                         */
                        fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                        /**
                         * Information about frequency-based scheduling, if applicable to the trip.
                         */
                        fun frequency(frequency: JsonField<String>) = apply {
                            this.frequency = frequency
                        }

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownDistanceAlongTrip(lastKnownDistanceAlongTrip: Double) =
                            lastKnownDistanceAlongTrip(JsonField.of(lastKnownDistanceAlongTrip))

                        /**
                         * Last known distance along the trip received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownDistanceAlongTrip(
                            lastKnownDistanceAlongTrip: JsonField<Double>
                        ) = apply { this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip }

                        /** Last known location of the transit vehicle. */
                        fun lastKnownLocation(lastKnownLocation: LastKnownLocation) =
                            lastKnownLocation(JsonField.of(lastKnownLocation))

                        /** Last known location of the transit vehicle. */
                        fun lastKnownLocation(lastKnownLocation: JsonField<LastKnownLocation>) =
                            apply {
                                this.lastKnownLocation = lastKnownLocation
                            }

                        /**
                         * Last known orientation value received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownOrientation(lastKnownOrientation: Double) =
                            lastKnownOrientation(JsonField.of(lastKnownOrientation))

                        /**
                         * Last known orientation value received in real-time from the transit
                         * vehicle.
                         */
                        fun lastKnownOrientation(lastKnownOrientation: JsonField<Double>) = apply {
                            this.lastKnownOrientation = lastKnownOrientation
                        }

                        /**
                         * Timestamp of the last known real-time location update from the transit
                         * vehicle.
                         */
                        fun lastLocationUpdateTime(lastLocationUpdateTime: Long) =
                            lastLocationUpdateTime(JsonField.of(lastLocationUpdateTime))

                        /**
                         * Timestamp of the last known real-time location update from the transit
                         * vehicle.
                         */
                        fun lastLocationUpdateTime(lastLocationUpdateTime: JsonField<Long>) =
                            apply {
                                this.lastLocationUpdateTime = lastLocationUpdateTime
                            }

                        /**
                         * Timestamp of the last known real-time update from the transit vehicle.
                         */
                        fun lastUpdateTime(lastUpdateTime: Long) =
                            lastUpdateTime(JsonField.of(lastUpdateTime))

                        /**
                         * Timestamp of the last known real-time update from the transit vehicle.
                         */
                        fun lastUpdateTime(lastUpdateTime: JsonField<Long>) = apply {
                            this.lastUpdateTime = lastUpdateTime
                        }

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        fun nextStop(nextStop: String) = nextStop(JsonField.of(nextStop))

                        /** ID of the next stop the transit vehicle is scheduled to arrive at. */
                        fun nextStop(nextStop: JsonField<String>) = apply {
                            this.nextStop = nextStop
                        }

                        /**
                         * Time offset from the next stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun nextStopTimeOffset(nextStopTimeOffset: Long) =
                            nextStopTimeOffset(JsonField.of(nextStopTimeOffset))

                        /**
                         * Time offset from the next stop to the current position of the transit
                         * vehicle (in seconds).
                         */
                        fun nextStopTimeOffset(nextStopTimeOffset: JsonField<Long>) = apply {
                            this.nextStopTimeOffset = nextStopTimeOffset
                        }

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        fun occupancyCapacity(occupancyCapacity: Long) =
                            occupancyCapacity(JsonField.of(occupancyCapacity))

                        /** Capacity of the transit vehicle in terms of occupancy. */
                        fun occupancyCapacity(occupancyCapacity: JsonField<Long>) = apply {
                            this.occupancyCapacity = occupancyCapacity
                        }

                        /** Current count of occupants in the transit vehicle. */
                        fun occupancyCount(occupancyCount: Long) =
                            occupancyCount(JsonField.of(occupancyCount))

                        /** Current count of occupants in the transit vehicle. */
                        fun occupancyCount(occupancyCount: JsonField<Long>) = apply {
                            this.occupancyCount = occupancyCount
                        }

                        /** Current occupancy status of the transit vehicle. */
                        fun occupancyStatus(occupancyStatus: String) =
                            occupancyStatus(JsonField.of(occupancyStatus))

                        /** Current occupancy status of the transit vehicle. */
                        fun occupancyStatus(occupancyStatus: JsonField<String>) = apply {
                            this.occupancyStatus = occupancyStatus
                        }

                        /**
                         * Orientation of the transit vehicle, represented as an angle in degrees.
                         */
                        fun orientation(orientation: Double) =
                            orientation(JsonField.of(orientation))

                        /**
                         * Orientation of the transit vehicle, represented as an angle in degrees.
                         */
                        fun orientation(orientation: JsonField<Double>) = apply {
                            this.orientation = orientation
                        }

                        /** Current journey phase of the trip. */
                        fun phase(phase: String) = phase(JsonField.of(phase))

                        /** Current journey phase of the trip. */
                        fun phase(phase: JsonField<String>) = apply { this.phase = phase }

                        /** Current position of the transit vehicle. */
                        fun position(position: Position) = position(JsonField.of(position))

                        /** Current position of the transit vehicle. */
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
                        }

                        /** Indicates if real-time arrival info is available for this trip. */
                        fun predicted(predicted: Boolean) = predicted(JsonField.of(predicted))

                        /** Indicates if real-time arrival info is available for this trip. */
                        fun predicted(predicted: JsonField<Boolean>) = apply {
                            this.predicted = predicted
                        }

                        /**
                         * Deviation from the schedule in seconds (positive for late, negative for
                         * early).
                         */
                        fun scheduleDeviation(scheduleDeviation: Long) =
                            scheduleDeviation(JsonField.of(scheduleDeviation))

                        /**
                         * Deviation from the schedule in seconds (positive for late, negative for
                         * early).
                         */
                        fun scheduleDeviation(scheduleDeviation: JsonField<Long>) = apply {
                            this.scheduleDeviation = scheduleDeviation
                        }

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed
                         * along the active trip.
                         */
                        fun scheduledDistanceAlongTrip(scheduledDistanceAlongTrip: Double) =
                            scheduledDistanceAlongTrip(JsonField.of(scheduledDistanceAlongTrip))

                        /**
                         * Distance, in meters, the transit vehicle is scheduled to have progressed
                         * along the active trip.
                         */
                        fun scheduledDistanceAlongTrip(
                            scheduledDistanceAlongTrip: JsonField<Double>
                        ) = apply { this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip }

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of
                         * the service date for the trip.
                         */
                        fun serviceDate(serviceDate: Long) = serviceDate(JsonField.of(serviceDate))

                        /**
                         * Time, in milliseconds since the Unix epoch, of midnight for the start of
                         * the service date for the trip.
                         */
                        fun serviceDate(serviceDate: JsonField<Long>) = apply {
                            this.serviceDate = serviceDate
                        }

                        /** References to situation elements (if any) applicable to this trip. */
                        fun situationIds(situationIds: List<String>) =
                            situationIds(JsonField.of(situationIds))

                        /** References to situation elements (if any) applicable to this trip. */
                        fun situationIds(situationIds: JsonField<List<String>>) = apply {
                            this.situationIds = situationIds
                        }

                        /** Current status modifiers for the trip. */
                        fun status(status: String) = status(JsonField.of(status))

                        /** Current status modifiers for the trip. */
                        fun status(status: JsonField<String>) = apply { this.status = status }

                        /** Total length of the trip, in meters. */
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: Double) =
                            totalDistanceAlongTrip(JsonField.of(totalDistanceAlongTrip))

                        /** Total length of the trip, in meters. */
                        fun totalDistanceAlongTrip(totalDistanceAlongTrip: JsonField<Double>) =
                            apply {
                                this.totalDistanceAlongTrip = totalDistanceAlongTrip
                            }

                        /** ID of the transit vehicle currently serving the trip. */
                        fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                        /** ID of the transit vehicle currently serving the trip. */
                        fun vehicleId(vehicleId: JsonField<String>) = apply {
                            this.vehicleId = vehicleId
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

                        fun build(): TripStatus =
                            TripStatus(
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
                                situationIds.map { it.toImmutable() },
                                status,
                                totalDistanceAlongTrip,
                                vehicleId,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /** Last known location of the transit vehicle. */
                    @NoAutoDetect
                    class LastKnownLocation
                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        private val lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        private val lon: JsonField<Double> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** Latitude of the last known location of the transit vehicle. */
                        fun lat(): Optional<Double> = Optional.ofNullable(lat.getNullable("lat"))

                        /** Longitude of the last known location of the transit vehicle. */
                        fun lon(): Optional<Double> = Optional.ofNullable(lon.getNullable("lon"))

                        /** Latitude of the last known location of the transit vehicle. */
                        @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                        /** Longitude of the last known location of the transit vehicle. */
                        @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): LastKnownLocation = apply {
                            if (!validated) {
                                lat()
                                lon()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(lastKnownLocation: LastKnownLocation) = apply {
                                lat = lastKnownLocation.lat
                                lon = lastKnownLocation.lon
                                additionalProperties =
                                    lastKnownLocation.additionalProperties.toMutableMap()
                            }

                            /** Latitude of the last known location of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the last known location of the transit vehicle. */
                            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                            /** Longitude of the last known location of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the last known location of the transit vehicle. */
                            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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

                            fun build(): LastKnownLocation =
                                LastKnownLocation(
                                    lat,
                                    lon,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is LastKnownLocation && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "LastKnownLocation{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                    }

                    /** Current position of the transit vehicle. */
                    @NoAutoDetect
                    class Position
                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        private val lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        private val lon: JsonField<Double> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /** Latitude of the current position of the transit vehicle. */
                        fun lat(): Optional<Double> = Optional.ofNullable(lat.getNullable("lat"))

                        /** Longitude of the current position of the transit vehicle. */
                        fun lon(): Optional<Double> = Optional.ofNullable(lon.getNullable("lon"))

                        /** Latitude of the current position of the transit vehicle. */
                        @JsonProperty("lat") @ExcludeMissing fun _lat() = lat

                        /** Longitude of the current position of the transit vehicle. */
                        @JsonProperty("lon") @ExcludeMissing fun _lon() = lon

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Position = apply {
                            if (!validated) {
                                lat()
                                lon()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lon: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(position: Position) = apply {
                                lat = position.lat
                                lon = position.lon
                                additionalProperties = position.additionalProperties.toMutableMap()
                            }

                            /** Latitude of the current position of the transit vehicle. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /** Latitude of the current position of the transit vehicle. */
                            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                            /** Longitude of the current position of the transit vehicle. */
                            fun lon(lon: Double) = lon(JsonField.of(lon))

                            /** Longitude of the current position of the transit vehicle. */
                            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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

                            fun build(): Position =
                                Position(
                                    lat,
                                    lon,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Position && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Position{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TripStatus && activeTripId == other.activeTripId && blockTripSequence == other.blockTripSequence && closestStop == other.closestStop && closestStopTimeOffset == other.closestStopTimeOffset && distanceAlongTrip == other.distanceAlongTrip && frequency == other.frequency && lastKnownDistanceAlongTrip == other.lastKnownDistanceAlongTrip && lastKnownLocation == other.lastKnownLocation && lastKnownOrientation == other.lastKnownOrientation && lastLocationUpdateTime == other.lastLocationUpdateTime && lastUpdateTime == other.lastUpdateTime && nextStop == other.nextStop && nextStopTimeOffset == other.nextStopTimeOffset && occupancyCapacity == other.occupancyCapacity && occupancyCount == other.occupancyCount && occupancyStatus == other.occupancyStatus && orientation == other.orientation && phase == other.phase && position == other.position && predicted == other.predicted && scheduleDeviation == other.scheduleDeviation && scheduledDistanceAlongTrip == other.scheduledDistanceAlongTrip && serviceDate == other.serviceDate && situationIds == other.situationIds && status == other.status && totalDistanceAlongTrip == other.totalDistanceAlongTrip && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(activeTripId, blockTripSequence, closestStop, closestStopTimeOffset, distanceAlongTrip, frequency, lastKnownDistanceAlongTrip, lastKnownLocation, lastKnownOrientation, lastLocationUpdateTime, lastUpdateTime, nextStop, nextStopTimeOffset, occupancyCapacity, occupancyCount, occupancyStatus, orientation, phase, position, predicted, scheduleDeviation, scheduledDistanceAlongTrip, serviceDate, situationIds, status, totalDistanceAlongTrip, vehicleId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TripStatus{activeTripId=$activeTripId, blockTripSequence=$blockTripSequence, closestStop=$closestStop, closestStopTimeOffset=$closestStopTimeOffset, distanceAlongTrip=$distanceAlongTrip, frequency=$frequency, lastKnownDistanceAlongTrip=$lastKnownDistanceAlongTrip, lastKnownLocation=$lastKnownLocation, lastKnownOrientation=$lastKnownOrientation, lastLocationUpdateTime=$lastLocationUpdateTime, lastUpdateTime=$lastUpdateTime, nextStop=$nextStop, nextStopTimeOffset=$nextStopTimeOffset, occupancyCapacity=$occupancyCapacity, occupancyCount=$occupancyCount, occupancyStatus=$occupancyStatus, orientation=$orientation, phase=$phase, position=$position, predicted=$predicted, scheduleDeviation=$scheduleDeviation, scheduledDistanceAlongTrip=$scheduledDistanceAlongTrip, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, totalDistanceAlongTrip=$totalDistanceAlongTrip, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ArrivalsAndDeparture && actualTrack == other.actualTrack && arrivalEnabled == other.arrivalEnabled && blockTripSequence == other.blockTripSequence && departureEnabled == other.departureEnabled && distanceFromStop == other.distanceFromStop && frequency == other.frequency && historicalOccupancy == other.historicalOccupancy && lastUpdateTime == other.lastUpdateTime && numberOfStopsAway == other.numberOfStopsAway && occupancyStatus == other.occupancyStatus && predicted == other.predicted && predictedArrivalInterval == other.predictedArrivalInterval && predictedArrivalTime == other.predictedArrivalTime && predictedDepartureInterval == other.predictedDepartureInterval && predictedDepartureTime == other.predictedDepartureTime && predictedOccupancy == other.predictedOccupancy && routeId == other.routeId && routeLongName == other.routeLongName && routeShortName == other.routeShortName && scheduledArrivalInterval == other.scheduledArrivalInterval && scheduledArrivalTime == other.scheduledArrivalTime && scheduledDepartureInterval == other.scheduledDepartureInterval && scheduledDepartureTime == other.scheduledDepartureTime && scheduledTrack == other.scheduledTrack && serviceDate == other.serviceDate && situationIds == other.situationIds && status == other.status && stopId == other.stopId && stopSequence == other.stopSequence && totalStopsInTrip == other.totalStopsInTrip && tripHeadsign == other.tripHeadsign && tripId == other.tripId && tripStatus == other.tripStatus && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(actualTrack, arrivalEnabled, blockTripSequence, departureEnabled, distanceFromStop, frequency, historicalOccupancy, lastUpdateTime, numberOfStopsAway, occupancyStatus, predicted, predictedArrivalInterval, predictedArrivalTime, predictedDepartureInterval, predictedDepartureTime, predictedOccupancy, routeId, routeLongName, routeShortName, scheduledArrivalInterval, scheduledArrivalTime, scheduledDepartureInterval, scheduledDepartureTime, scheduledTrack, serviceDate, situationIds, status, stopId, stopSequence, totalStopsInTrip, tripHeadsign, tripId, tripStatus, vehicleId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ArrivalsAndDeparture{actualTrack=$actualTrack, arrivalEnabled=$arrivalEnabled, blockTripSequence=$blockTripSequence, departureEnabled=$departureEnabled, distanceFromStop=$distanceFromStop, frequency=$frequency, historicalOccupancy=$historicalOccupancy, lastUpdateTime=$lastUpdateTime, numberOfStopsAway=$numberOfStopsAway, occupancyStatus=$occupancyStatus, predicted=$predicted, predictedArrivalInterval=$predictedArrivalInterval, predictedArrivalTime=$predictedArrivalTime, predictedDepartureInterval=$predictedDepartureInterval, predictedDepartureTime=$predictedDepartureTime, predictedOccupancy=$predictedOccupancy, routeId=$routeId, routeLongName=$routeLongName, routeShortName=$routeShortName, scheduledArrivalInterval=$scheduledArrivalInterval, scheduledArrivalTime=$scheduledArrivalTime, scheduledDepartureInterval=$scheduledDepartureInterval, scheduledDepartureTime=$scheduledDepartureTime, scheduledTrack=$scheduledTrack, serviceDate=$serviceDate, situationIds=$situationIds, status=$status, stopId=$stopId, stopSequence=$stopSequence, totalStopsInTrip=$totalStopsInTrip, tripHeadsign=$tripHeadsign, tripId=$tripId, tripStatus=$tripStatus, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && arrivalsAndDepartures == other.arrivalsAndDepartures && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(arrivalsAndDepartures, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{arrivalsAndDepartures=$arrivalsAndDepartures, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ArrivalAndDepartureListResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArrivalAndDepartureListResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
