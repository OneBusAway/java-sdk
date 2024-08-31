// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.open_transit.api.core.ExcludeMissing
import com.open_transit.api.core.JsonField
import com.open_transit.api.core.JsonMissing
import com.open_transit.api.core.JsonValue
import com.open_transit.api.core.NoAutoDetect
import com.open_transit.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ScheduleForRouteRetrieveResponse.Builder::class)
@NoAutoDetect
class ScheduleForRouteRetrieveResponse
private constructor(
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

    fun validate(): ScheduleForRouteRetrieveResponse = apply {
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

        return other is ScheduleForRouteRetrieveResponse &&
            this.code == other.code &&
            this.currentTime == other.currentTime &&
            this.text == other.text &&
            this.version == other.version &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

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
        "ScheduleForRouteRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"

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
        internal fun from(scheduleForRouteRetrieveResponse: ScheduleForRouteRetrieveResponse) =
            apply {
                this.code = scheduleForRouteRetrieveResponse.code
                this.currentTime = scheduleForRouteRetrieveResponse.currentTime
                this.text = scheduleForRouteRetrieveResponse.text
                this.version = scheduleForRouteRetrieveResponse.version
                this.data = scheduleForRouteRetrieveResponse.data
                additionalProperties(scheduleForRouteRetrieveResponse.additionalProperties)
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

        fun build(): ScheduleForRouteRetrieveResponse =
            ScheduleForRouteRetrieveResponse(
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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun entry(): Entry = entry.getRequired("entry")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
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
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(entry, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Data{entry=$entry, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.entry = data.entry
                additionalProperties(data.additionalProperties)
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            @JsonProperty("entry")
            @ExcludeMissing
            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

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

            fun build(): Data = Data(entry, additionalProperties.toUnmodifiable())
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val routeId: JsonField<String>,
            private val scheduleDate: JsonField<Long>,
            private val serviceIds: JsonField<List<String>>,
            private val stopTripGroupings: JsonField<List<StopTripGrouping>>,
            private val stops: JsonField<List<Stop>>,
            private val trips: JsonField<List<Trip>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun routeId(): String = routeId.getRequired("routeId")

            fun scheduleDate(): Long = scheduleDate.getRequired("scheduleDate")

            fun serviceIds(): List<String> = serviceIds.getRequired("serviceIds")

            fun stopTripGroupings(): List<StopTripGrouping> =
                stopTripGroupings.getRequired("stopTripGroupings")

            fun stops(): List<Stop> = stops.getRequired("stops")

            fun trips(): List<Trip> = trips.getRequired("trips")

            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            @JsonProperty("scheduleDate") @ExcludeMissing fun _scheduleDate() = scheduleDate

            @JsonProperty("serviceIds") @ExcludeMissing fun _serviceIds() = serviceIds

            @JsonProperty("stopTripGroupings")
            @ExcludeMissing
            fun _stopTripGroupings() = stopTripGroupings

            @JsonProperty("stops") @ExcludeMissing fun _stops() = stops

            @JsonProperty("trips") @ExcludeMissing fun _trips() = trips

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                    routeId()
                    scheduleDate()
                    serviceIds()
                    stopTripGroupings().forEach { it.validate() }
                    stops().forEach { it.validate() }
                    trips().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    this.routeId == other.routeId &&
                    this.scheduleDate == other.scheduleDate &&
                    this.serviceIds == other.serviceIds &&
                    this.stopTripGroupings == other.stopTripGroupings &&
                    this.stops == other.stops &&
                    this.trips == other.trips &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            routeId,
                            scheduleDate,
                            serviceIds,
                            stopTripGroupings,
                            stops,
                            trips,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Entry{routeId=$routeId, scheduleDate=$scheduleDate, serviceIds=$serviceIds, stopTripGroupings=$stopTripGroupings, stops=$stops, trips=$trips, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var routeId: JsonField<String> = JsonMissing.of()
                private var scheduleDate: JsonField<Long> = JsonMissing.of()
                private var serviceIds: JsonField<List<String>> = JsonMissing.of()
                private var stopTripGroupings: JsonField<List<StopTripGrouping>> = JsonMissing.of()
                private var stops: JsonField<List<Stop>> = JsonMissing.of()
                private var trips: JsonField<List<Trip>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.routeId = entry.routeId
                    this.scheduleDate = entry.scheduleDate
                    this.serviceIds = entry.serviceIds
                    this.stopTripGroupings = entry.stopTripGroupings
                    this.stops = entry.stops
                    this.trips = entry.trips
                    additionalProperties(entry.additionalProperties)
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                @JsonProperty("routeId")
                @ExcludeMissing
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun scheduleDate(scheduleDate: Long) = scheduleDate(JsonField.of(scheduleDate))

                @JsonProperty("scheduleDate")
                @ExcludeMissing
                fun scheduleDate(scheduleDate: JsonField<Long>) = apply {
                    this.scheduleDate = scheduleDate
                }

                fun serviceIds(serviceIds: List<String>) = serviceIds(JsonField.of(serviceIds))

                @JsonProperty("serviceIds")
                @ExcludeMissing
                fun serviceIds(serviceIds: JsonField<List<String>>) = apply {
                    this.serviceIds = serviceIds
                }

                fun stopTripGroupings(stopTripGroupings: List<StopTripGrouping>) =
                    stopTripGroupings(JsonField.of(stopTripGroupings))

                @JsonProperty("stopTripGroupings")
                @ExcludeMissing
                fun stopTripGroupings(stopTripGroupings: JsonField<List<StopTripGrouping>>) =
                    apply {
                        this.stopTripGroupings = stopTripGroupings
                    }

                fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

                @JsonProperty("stops")
                @ExcludeMissing
                fun stops(stops: JsonField<List<Stop>>) = apply { this.stops = stops }

                fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

                @JsonProperty("trips")
                @ExcludeMissing
                fun trips(trips: JsonField<List<Trip>>) = apply { this.trips = trips }

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
                        routeId,
                        scheduleDate,
                        serviceIds.map { it.toUnmodifiable() },
                        stopTripGroupings.map { it.toUnmodifiable() },
                        stops.map { it.toUnmodifiable() },
                        trips.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Stop.Builder::class)
            @NoAutoDetect
            class Stop
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

                private var hashCode: Int = 0

                fun code(): String = code.getRequired("code")

                fun direction(): Optional<String> =
                    Optional.ofNullable(direction.getNullable("direction"))

                fun id(): String = id.getRequired("id")

                fun lat(): Double = lat.getRequired("lat")

                fun locationType(): Optional<Long> =
                    Optional.ofNullable(locationType.getNullable("locationType"))

                fun lon(): Double = lon.getRequired("lon")

                fun name(): String = name.getRequired("name")

                fun parent(): Optional<String> = Optional.ofNullable(parent.getNullable("parent"))

                fun routeIds(): Optional<List<String>> =
                    Optional.ofNullable(routeIds.getNullable("routeIds"))

                fun staticRouteIds(): Optional<List<String>> =
                    Optional.ofNullable(staticRouteIds.getNullable("staticRouteIds"))

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

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun _staticRouteIds() = staticRouteIds

                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun _wheelchairBoarding() = wheelchairBoarding

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Stop = apply {
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Stop &&
                        this.code == other.code &&
                        this.direction == other.direction &&
                        this.id == other.id &&
                        this.lat == other.lat &&
                        this.locationType == other.locationType &&
                        this.lon == other.lon &&
                        this.name == other.name &&
                        this.parent == other.parent &&
                        this.routeIds == other.routeIds &&
                        this.staticRouteIds == other.staticRouteIds &&
                        this.wheelchairBoarding == other.wheelchairBoarding &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                code,
                                direction,
                                id,
                                lat,
                                locationType,
                                lon,
                                name,
                                parent,
                                routeIds,
                                staticRouteIds,
                                wheelchairBoarding,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Stop{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"

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
                    internal fun from(stop: Stop) = apply {
                        this.code = stop.code
                        this.direction = stop.direction
                        this.id = stop.id
                        this.lat = stop.lat
                        this.locationType = stop.locationType
                        this.lon = stop.lon
                        this.name = stop.name
                        this.parent = stop.parent
                        this.routeIds = stop.routeIds
                        this.staticRouteIds = stop.staticRouteIds
                        this.wheelchairBoarding = stop.wheelchairBoarding
                        additionalProperties(stop.additionalProperties)
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun direction(direction: String) = direction(JsonField.of(direction))

                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun direction(direction: JsonField<String>) = apply {
                        this.direction = direction
                    }

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
                    fun routeIds(routeIds: JsonField<List<String>>) = apply {
                        this.routeIds = routeIds
                    }

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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Stop =
                        Stop(
                            code,
                            direction,
                            id,
                            lat,
                            locationType,
                            lon,
                            name,
                            parent,
                            routeIds.map { it.toUnmodifiable() },
                            staticRouteIds.map { it.toUnmodifiable() },
                            wheelchairBoarding,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            @JsonDeserialize(builder = StopTripGrouping.Builder::class)
            @NoAutoDetect
            class StopTripGrouping
            private constructor(
                private val directionId: JsonField<String>,
                private val stopIds: JsonField<List<String>>,
                private val tripHeadsigns: JsonField<List<String>>,
                private val tripIds: JsonField<List<String>>,
                private val tripsWithStopTimes: JsonField<List<TripsWithStopTime>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun directionId(): String = directionId.getRequired("directionId")

                fun stopIds(): List<String> = stopIds.getRequired("stopIds")

                fun tripHeadsigns(): List<String> = tripHeadsigns.getRequired("tripHeadsigns")

                fun tripIds(): List<String> = tripIds.getRequired("tripIds")

                fun tripsWithStopTimes(): Optional<List<TripsWithStopTime>> =
                    Optional.ofNullable(tripsWithStopTimes.getNullable("tripsWithStopTimes"))

                @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

                @JsonProperty("stopIds") @ExcludeMissing fun _stopIds() = stopIds

                @JsonProperty("tripHeadsigns") @ExcludeMissing fun _tripHeadsigns() = tripHeadsigns

                @JsonProperty("tripIds") @ExcludeMissing fun _tripIds() = tripIds

                @JsonProperty("tripsWithStopTimes")
                @ExcludeMissing
                fun _tripsWithStopTimes() = tripsWithStopTimes

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): StopTripGrouping = apply {
                    if (!validated) {
                        directionId()
                        stopIds()
                        tripHeadsigns()
                        tripIds()
                        tripsWithStopTimes().map { it.forEach { it.validate() } }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StopTripGrouping &&
                        this.directionId == other.directionId &&
                        this.stopIds == other.stopIds &&
                        this.tripHeadsigns == other.tripHeadsigns &&
                        this.tripIds == other.tripIds &&
                        this.tripsWithStopTimes == other.tripsWithStopTimes &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                directionId,
                                stopIds,
                                tripHeadsigns,
                                tripIds,
                                tripsWithStopTimes,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "StopTripGrouping{directionId=$directionId, stopIds=$stopIds, tripHeadsigns=$tripHeadsigns, tripIds=$tripIds, tripsWithStopTimes=$tripsWithStopTimes, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var directionId: JsonField<String> = JsonMissing.of()
                    private var stopIds: JsonField<List<String>> = JsonMissing.of()
                    private var tripHeadsigns: JsonField<List<String>> = JsonMissing.of()
                    private var tripIds: JsonField<List<String>> = JsonMissing.of()
                    private var tripsWithStopTimes: JsonField<List<TripsWithStopTime>> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopTripGrouping: StopTripGrouping) = apply {
                        this.directionId = stopTripGrouping.directionId
                        this.stopIds = stopTripGrouping.stopIds
                        this.tripHeadsigns = stopTripGrouping.tripHeadsigns
                        this.tripIds = stopTripGrouping.tripIds
                        this.tripsWithStopTimes = stopTripGrouping.tripsWithStopTimes
                        additionalProperties(stopTripGrouping.additionalProperties)
                    }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    @JsonProperty("directionId")
                    @ExcludeMissing
                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    @JsonProperty("stopIds")
                    @ExcludeMissing
                    fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

                    fun tripHeadsigns(tripHeadsigns: List<String>) =
                        tripHeadsigns(JsonField.of(tripHeadsigns))

                    @JsonProperty("tripHeadsigns")
                    @ExcludeMissing
                    fun tripHeadsigns(tripHeadsigns: JsonField<List<String>>) = apply {
                        this.tripHeadsigns = tripHeadsigns
                    }

                    fun tripIds(tripIds: List<String>) = tripIds(JsonField.of(tripIds))

                    @JsonProperty("tripIds")
                    @ExcludeMissing
                    fun tripIds(tripIds: JsonField<List<String>>) = apply { this.tripIds = tripIds }

                    fun tripsWithStopTimes(tripsWithStopTimes: List<TripsWithStopTime>) =
                        tripsWithStopTimes(JsonField.of(tripsWithStopTimes))

                    @JsonProperty("tripsWithStopTimes")
                    @ExcludeMissing
                    fun tripsWithStopTimes(tripsWithStopTimes: JsonField<List<TripsWithStopTime>>) =
                        apply {
                            this.tripsWithStopTimes = tripsWithStopTimes
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

                    fun build(): StopTripGrouping =
                        StopTripGrouping(
                            directionId,
                            stopIds.map { it.toUnmodifiable() },
                            tripHeadsigns.map { it.toUnmodifiable() },
                            tripIds.map { it.toUnmodifiable() },
                            tripsWithStopTimes.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = TripsWithStopTime.Builder::class)
                @NoAutoDetect
                class TripsWithStopTime
                private constructor(
                    private val tripId: JsonField<String>,
                    private val stopTimes: JsonField<List<StopTime>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun tripId(): String = tripId.getRequired("tripId")

                    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

                    @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                    @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TripsWithStopTime = apply {
                        if (!validated) {
                            tripId()
                            stopTimes().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TripsWithStopTime &&
                            this.tripId == other.tripId &&
                            this.stopTimes == other.stopTimes &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    tripId,
                                    stopTimes,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TripsWithStopTime{tripId=$tripId, stopTimes=$stopTimes, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var tripId: JsonField<String> = JsonMissing.of()
                        private var stopTimes: JsonField<List<StopTime>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tripsWithStopTime: TripsWithStopTime) = apply {
                            this.tripId = tripsWithStopTime.tripId
                            this.stopTimes = tripsWithStopTime.stopTimes
                            additionalProperties(tripsWithStopTime.additionalProperties)
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                        fun stopTimes(stopTimes: List<StopTime>) =
                            stopTimes(JsonField.of(stopTimes))

                        @JsonProperty("stopTimes")
                        @ExcludeMissing
                        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
                            this.stopTimes = stopTimes
                        }

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

                        fun build(): TripsWithStopTime =
                            TripsWithStopTime(
                                tripId,
                                stopTimes.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = StopTime.Builder::class)
                    @NoAutoDetect
                    class StopTime
                    private constructor(
                        private val arrivalEnabled: JsonField<Boolean>,
                        private val arrivalTime: JsonField<Long>,
                        private val departureEnabled: JsonField<Boolean>,
                        private val departureTime: JsonField<Long>,
                        private val serviceId: JsonField<String>,
                        private val stopHeadsign: JsonField<String>,
                        private val stopId: JsonField<String>,
                        private val tripId: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                        fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                        fun departureEnabled(): Boolean =
                            departureEnabled.getRequired("departureEnabled")

                        fun departureTime(): Long = departureTime.getRequired("departureTime")

                        fun serviceId(): Optional<String> =
                            Optional.ofNullable(serviceId.getNullable("serviceId"))

                        fun stopHeadsign(): Optional<String> =
                            Optional.ofNullable(stopHeadsign.getNullable("stopHeadsign"))

                        fun stopId(): String = stopId.getRequired("stopId")

                        fun tripId(): String = tripId.getRequired("tripId")

                        @JsonProperty("arrivalEnabled")
                        @ExcludeMissing
                        fun _arrivalEnabled() = arrivalEnabled

                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        fun _arrivalTime() = arrivalTime

                        @JsonProperty("departureEnabled")
                        @ExcludeMissing
                        fun _departureEnabled() = departureEnabled

                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        fun _departureTime() = departureTime

                        @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        fun _stopHeadsign() = stopHeadsign

                        @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

                        @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): StopTime = apply {
                            if (!validated) {
                                arrivalEnabled()
                                arrivalTime()
                                departureEnabled()
                                departureTime()
                                serviceId()
                                stopHeadsign()
                                stopId()
                                tripId()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is StopTime &&
                                this.arrivalEnabled == other.arrivalEnabled &&
                                this.arrivalTime == other.arrivalTime &&
                                this.departureEnabled == other.departureEnabled &&
                                this.departureTime == other.departureTime &&
                                this.serviceId == other.serviceId &&
                                this.stopHeadsign == other.stopHeadsign &&
                                this.stopId == other.stopId &&
                                this.tripId == other.tripId &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        arrivalEnabled,
                                        arrivalTime,
                                        departureEnabled,
                                        departureTime,
                                        serviceId,
                                        stopHeadsign,
                                        stopId,
                                        tripId,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "StopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, serviceId=$serviceId, stopHeadsign=$stopHeadsign, stopId=$stopId, tripId=$tripId, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var arrivalEnabled: JsonField<Boolean> = JsonMissing.of()
                            private var arrivalTime: JsonField<Long> = JsonMissing.of()
                            private var departureEnabled: JsonField<Boolean> = JsonMissing.of()
                            private var departureTime: JsonField<Long> = JsonMissing.of()
                            private var serviceId: JsonField<String> = JsonMissing.of()
                            private var stopHeadsign: JsonField<String> = JsonMissing.of()
                            private var stopId: JsonField<String> = JsonMissing.of()
                            private var tripId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(stopTime: StopTime) = apply {
                                this.arrivalEnabled = stopTime.arrivalEnabled
                                this.arrivalTime = stopTime.arrivalTime
                                this.departureEnabled = stopTime.departureEnabled
                                this.departureTime = stopTime.departureTime
                                this.serviceId = stopTime.serviceId
                                this.stopHeadsign = stopTime.stopHeadsign
                                this.stopId = stopTime.stopId
                                this.tripId = stopTime.tripId
                                additionalProperties(stopTime.additionalProperties)
                            }

                            fun arrivalEnabled(arrivalEnabled: Boolean) =
                                arrivalEnabled(JsonField.of(arrivalEnabled))

                            @JsonProperty("arrivalEnabled")
                            @ExcludeMissing
                            fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                                this.arrivalEnabled = arrivalEnabled
                            }

                            fun arrivalTime(arrivalTime: Long) =
                                arrivalTime(JsonField.of(arrivalTime))

                            @JsonProperty("arrivalTime")
                            @ExcludeMissing
                            fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                this.arrivalTime = arrivalTime
                            }

                            fun departureEnabled(departureEnabled: Boolean) =
                                departureEnabled(JsonField.of(departureEnabled))

                            @JsonProperty("departureEnabled")
                            @ExcludeMissing
                            fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                                this.departureEnabled = departureEnabled
                            }

                            fun departureTime(departureTime: Long) =
                                departureTime(JsonField.of(departureTime))

                            @JsonProperty("departureTime")
                            @ExcludeMissing
                            fun departureTime(departureTime: JsonField<Long>) = apply {
                                this.departureTime = departureTime
                            }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            @JsonProperty("serviceId")
                            @ExcludeMissing
                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

                            fun stopHeadsign(stopHeadsign: String) =
                                stopHeadsign(JsonField.of(stopHeadsign))

                            @JsonProperty("stopHeadsign")
                            @ExcludeMissing
                            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                                this.stopHeadsign = stopHeadsign
                            }

                            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                            @JsonProperty("stopId")
                            @ExcludeMissing
                            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            @JsonProperty("tripId")
                            @ExcludeMissing
                            fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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

                            fun build(): StopTime =
                                StopTime(
                                    arrivalEnabled,
                                    arrivalTime,
                                    departureEnabled,
                                    departureTime,
                                    serviceId,
                                    stopHeadsign,
                                    stopId,
                                    tripId,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }

            @JsonDeserialize(builder = Trip.Builder::class)
            @NoAutoDetect
            class Trip
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

                private var hashCode: Int = 0

                fun blockId(): Optional<String> =
                    Optional.ofNullable(blockId.getNullable("blockId"))

                fun directionId(): Optional<String> =
                    Optional.ofNullable(directionId.getNullable("directionId"))

                fun id(): String = id.getRequired("id")

                fun peakOffpeak(): Optional<Long> =
                    Optional.ofNullable(peakOffpeak.getNullable("peakOffpeak"))

                fun routeId(): String = routeId.getRequired("routeId")

                fun routeShortName(): Optional<String> =
                    Optional.ofNullable(routeShortName.getNullable("routeShortName"))

                fun serviceId(): String = serviceId.getRequired("serviceId")

                fun shapeId(): Optional<String> =
                    Optional.ofNullable(shapeId.getNullable("shapeId"))

                fun timeZone(): Optional<String> =
                    Optional.ofNullable(timeZone.getNullable("timeZone"))

                fun tripHeadsign(): Optional<String> =
                    Optional.ofNullable(tripHeadsign.getNullable("tripHeadsign"))

                fun tripShortName(): Optional<String> =
                    Optional.ofNullable(tripShortName.getNullable("tripShortName"))

                @JsonProperty("blockId") @ExcludeMissing fun _blockId() = blockId

                @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("peakOffpeak") @ExcludeMissing fun _peakOffpeak() = peakOffpeak

                @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun _routeShortName() = routeShortName

                @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

                @JsonProperty("shapeId") @ExcludeMissing fun _shapeId() = shapeId

                @JsonProperty("timeZone") @ExcludeMissing fun _timeZone() = timeZone

                @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

                @JsonProperty("tripShortName") @ExcludeMissing fun _tripShortName() = tripShortName

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Trip = apply {
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trip &&
                        this.blockId == other.blockId &&
                        this.directionId == other.directionId &&
                        this.id == other.id &&
                        this.peakOffpeak == other.peakOffpeak &&
                        this.routeId == other.routeId &&
                        this.routeShortName == other.routeShortName &&
                        this.serviceId == other.serviceId &&
                        this.shapeId == other.shapeId &&
                        this.timeZone == other.timeZone &&
                        this.tripHeadsign == other.tripHeadsign &&
                        this.tripShortName == other.tripShortName &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
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
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Trip{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"

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
                    internal fun from(trip: Trip) = apply {
                        this.blockId = trip.blockId
                        this.directionId = trip.directionId
                        this.id = trip.id
                        this.peakOffpeak = trip.peakOffpeak
                        this.routeId = trip.routeId
                        this.routeShortName = trip.routeShortName
                        this.serviceId = trip.serviceId
                        this.shapeId = trip.shapeId
                        this.timeZone = trip.timeZone
                        this.tripHeadsign = trip.tripHeadsign
                        this.tripShortName = trip.tripShortName
                        additionalProperties(trip.additionalProperties)
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
                    fun serviceId(serviceId: JsonField<String>) = apply {
                        this.serviceId = serviceId
                    }

                    fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                    @JsonProperty("shapeId")
                    @ExcludeMissing
                    fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    @JsonProperty("timeZone")
                    @ExcludeMissing
                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

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

                    fun build(): Trip =
                        Trip(
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
            }
        }
    }
}
