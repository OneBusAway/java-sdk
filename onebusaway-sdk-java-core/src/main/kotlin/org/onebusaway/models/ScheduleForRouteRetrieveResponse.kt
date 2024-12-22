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
class ScheduleForRouteRetrieveResponse
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
                code = scheduleForRouteRetrieveResponse.code
                currentTime = scheduleForRouteRetrieveResponse.currentTime
                text = scheduleForRouteRetrieveResponse.text
                version = scheduleForRouteRetrieveResponse.version
                data = scheduleForRouteRetrieveResponse.data
                additionalProperties =
                    scheduleForRouteRetrieveResponse.additionalProperties.toMutableMap()
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

        fun build(): ScheduleForRouteRetrieveResponse =
            ScheduleForRouteRetrieveResponse(
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        @JsonProperty("entry") @ExcludeMissing fun _entry() = entry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                entry().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entry: JsonField<Entry> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                entry = data.entry
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun entry(entry: Entry) = entry(JsonField.of(entry))

            fun entry(entry: JsonField<Entry>) = apply { this.entry = entry }

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

            fun build(): Data = Data(entry, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class Entry
        @JsonCreator
        private constructor(
            @JsonProperty("routeId")
            @ExcludeMissing
            private val routeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduleDate")
            @ExcludeMissing
            private val scheduleDate: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("serviceIds")
            @ExcludeMissing
            private val serviceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("stopTripGroupings")
            @ExcludeMissing
            private val stopTripGroupings: JsonField<List<StopTripGrouping>> = JsonMissing.of(),
            @JsonProperty("stops")
            @ExcludeMissing
            private val stops: JsonField<List<Stop>> = JsonMissing.of(),
            @JsonProperty("trips")
            @ExcludeMissing
            private val trips: JsonField<List<Trip>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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

            private var validated: Boolean = false

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
                    routeId = entry.routeId
                    scheduleDate = entry.scheduleDate
                    serviceIds = entry.serviceIds
                    stopTripGroupings = entry.stopTripGroupings
                    stops = entry.stops
                    trips = entry.trips
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                fun scheduleDate(scheduleDate: Long) = scheduleDate(JsonField.of(scheduleDate))

                fun scheduleDate(scheduleDate: JsonField<Long>) = apply {
                    this.scheduleDate = scheduleDate
                }

                fun serviceIds(serviceIds: List<String>) = serviceIds(JsonField.of(serviceIds))

                fun serviceIds(serviceIds: JsonField<List<String>>) = apply {
                    this.serviceIds = serviceIds
                }

                fun stopTripGroupings(stopTripGroupings: List<StopTripGrouping>) =
                    stopTripGroupings(JsonField.of(stopTripGroupings))

                fun stopTripGroupings(stopTripGroupings: JsonField<List<StopTripGrouping>>) =
                    apply {
                        this.stopTripGroupings = stopTripGroupings
                    }

                fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

                fun stops(stops: JsonField<List<Stop>>) = apply { this.stops = stops }

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

                fun build(): Entry =
                    Entry(
                        routeId,
                        scheduleDate,
                        serviceIds.map { it.toImmutable() },
                        stopTripGroupings.map { it.toImmutable() },
                        stops.map { it.toImmutable() },
                        trips.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Stop
            @JsonCreator
            private constructor(
                @JsonProperty("code")
                @ExcludeMissing
                private val code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                private val direction: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lat")
                @ExcludeMissing
                private val lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("locationType")
                @ExcludeMissing
                private val locationType: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("lon")
                @ExcludeMissing
                private val lon: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent")
                @ExcludeMissing
                private val parent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeIds")
                @ExcludeMissing
                private val routeIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                private val staticRouteIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                private val wheelchairBoarding: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

                fun direction(): Optional<String> =
                    Optional.ofNullable(direction.getNullable("direction"))

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

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun _staticRouteIds() = staticRouteIds

                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun _wheelchairBoarding() = wheelchairBoarding

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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
                        code = stop.code
                        direction = stop.direction
                        id = stop.id
                        lat = stop.lat
                        locationType = stop.locationType
                        lon = stop.lon
                        name = stop.name
                        parent = stop.parent
                        routeIds = stop.routeIds
                        staticRouteIds = stop.staticRouteIds
                        wheelchairBoarding = stop.wheelchairBoarding
                        additionalProperties = stop.additionalProperties.toMutableMap()
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun direction(direction: String) = direction(JsonField.of(direction))

                    fun direction(direction: JsonField<String>) = apply {
                        this.direction = direction
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                    fun locationType(locationType: JsonField<Long>) = apply {
                        this.locationType = locationType
                    }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun parent(parent: String) = parent(JsonField.of(parent))

                    fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                    fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                    fun routeIds(routeIds: JsonField<List<String>>) = apply {
                        this.routeIds = routeIds
                    }

                    fun staticRouteIds(staticRouteIds: List<String>) =
                        staticRouteIds(JsonField.of(staticRouteIds))

                    fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                        this.staticRouteIds = staticRouteIds
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

                    return /* spotless:off */ other is Stop && code == other.code && direction == other.direction && id == other.id && lat == other.lat && locationType == other.locationType && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(code, direction, id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, wheelchairBoarding, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Stop{code=$code, direction=$direction, id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class StopTripGrouping
            @JsonCreator
            private constructor(
                @JsonProperty("directionId")
                @ExcludeMissing
                private val directionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopIds")
                @ExcludeMissing
                private val stopIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("tripHeadsigns")
                @ExcludeMissing
                private val tripHeadsigns: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("tripIds")
                @ExcludeMissing
                private val tripIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("tripsWithStopTimes")
                @ExcludeMissing
                private val tripsWithStopTimes: JsonField<List<TripsWithStopTime>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

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

                private var validated: Boolean = false

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
                        directionId = stopTripGrouping.directionId
                        stopIds = stopTripGrouping.stopIds
                        tripHeadsigns = stopTripGrouping.tripHeadsigns
                        tripIds = stopTripGrouping.tripIds
                        tripsWithStopTimes = stopTripGrouping.tripsWithStopTimes
                        additionalProperties = stopTripGrouping.additionalProperties.toMutableMap()
                    }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    fun stopIds(stopIds: JsonField<List<String>>) = apply { this.stopIds = stopIds }

                    fun tripHeadsigns(tripHeadsigns: List<String>) =
                        tripHeadsigns(JsonField.of(tripHeadsigns))

                    fun tripHeadsigns(tripHeadsigns: JsonField<List<String>>) = apply {
                        this.tripHeadsigns = tripHeadsigns
                    }

                    fun tripIds(tripIds: List<String>) = tripIds(JsonField.of(tripIds))

                    fun tripIds(tripIds: JsonField<List<String>>) = apply { this.tripIds = tripIds }

                    fun tripsWithStopTimes(tripsWithStopTimes: List<TripsWithStopTime>) =
                        tripsWithStopTimes(JsonField.of(tripsWithStopTimes))

                    fun tripsWithStopTimes(tripsWithStopTimes: JsonField<List<TripsWithStopTime>>) =
                        apply {
                            this.tripsWithStopTimes = tripsWithStopTimes
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

                    fun build(): StopTripGrouping =
                        StopTripGrouping(
                            directionId,
                            stopIds.map { it.toImmutable() },
                            tripHeadsigns.map { it.toImmutable() },
                            tripIds.map { it.toImmutable() },
                            tripsWithStopTimes.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class TripsWithStopTime
                @JsonCreator
                private constructor(
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    private val tripId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    private val stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun tripId(): String = tripId.getRequired("tripId")

                    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

                    @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                    @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): TripsWithStopTime = apply {
                        if (!validated) {
                            tripId()
                            stopTimes().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

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
                            tripId = tripsWithStopTime.tripId
                            stopTimes = tripsWithStopTime.stopTimes
                            additionalProperties =
                                tripsWithStopTime.additionalProperties.toMutableMap()
                        }

                        fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                        fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                        fun stopTimes(stopTimes: List<StopTime>) =
                            stopTimes(JsonField.of(stopTimes))

                        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
                            this.stopTimes = stopTimes
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

                        fun build(): TripsWithStopTime =
                            TripsWithStopTime(
                                tripId,
                                stopTimes.map { it.toImmutable() },
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class StopTime
                    @JsonCreator
                    private constructor(
                        @JsonProperty("arrivalEnabled")
                        @ExcludeMissing
                        private val arrivalEnabled: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        private val arrivalTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("departureEnabled")
                        @ExcludeMissing
                        private val departureEnabled: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        private val departureTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        private val serviceId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        private val stopHeadsign: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stopId")
                        @ExcludeMissing
                        private val stopId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        private val tripId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

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

                        private var validated: Boolean = false

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
                                arrivalEnabled = stopTime.arrivalEnabled
                                arrivalTime = stopTime.arrivalTime
                                departureEnabled = stopTime.departureEnabled
                                departureTime = stopTime.departureTime
                                serviceId = stopTime.serviceId
                                stopHeadsign = stopTime.stopHeadsign
                                stopId = stopTime.stopId
                                tripId = stopTime.tripId
                                additionalProperties = stopTime.additionalProperties.toMutableMap()
                            }

                            fun arrivalEnabled(arrivalEnabled: Boolean) =
                                arrivalEnabled(JsonField.of(arrivalEnabled))

                            fun arrivalEnabled(arrivalEnabled: JsonField<Boolean>) = apply {
                                this.arrivalEnabled = arrivalEnabled
                            }

                            fun arrivalTime(arrivalTime: Long) =
                                arrivalTime(JsonField.of(arrivalTime))

                            fun arrivalTime(arrivalTime: JsonField<Long>) = apply {
                                this.arrivalTime = arrivalTime
                            }

                            fun departureEnabled(departureEnabled: Boolean) =
                                departureEnabled(JsonField.of(departureEnabled))

                            fun departureEnabled(departureEnabled: JsonField<Boolean>) = apply {
                                this.departureEnabled = departureEnabled
                            }

                            fun departureTime(departureTime: Long) =
                                departureTime(JsonField.of(departureTime))

                            fun departureTime(departureTime: JsonField<Long>) = apply {
                                this.departureTime = departureTime
                            }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

                            fun stopHeadsign(stopHeadsign: String) =
                                stopHeadsign(JsonField.of(stopHeadsign))

                            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                                this.stopHeadsign = stopHeadsign
                            }

                            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

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
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StopTime && arrivalEnabled == other.arrivalEnabled && arrivalTime == other.arrivalTime && departureEnabled == other.departureEnabled && departureTime == other.departureTime && serviceId == other.serviceId && stopHeadsign == other.stopHeadsign && stopId == other.stopId && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(arrivalEnabled, arrivalTime, departureEnabled, departureTime, serviceId, stopHeadsign, stopId, tripId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "StopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, serviceId=$serviceId, stopHeadsign=$stopHeadsign, stopId=$stopId, tripId=$tripId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TripsWithStopTime && tripId == other.tripId && stopTimes == other.stopTimes && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(tripId, stopTimes, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TripsWithStopTime{tripId=$tripId, stopTimes=$stopTimes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StopTripGrouping && directionId == other.directionId && stopIds == other.stopIds && tripHeadsigns == other.tripHeadsigns && tripIds == other.tripIds && tripsWithStopTimes == other.tripsWithStopTimes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(directionId, stopIds, tripHeadsigns, tripIds, tripsWithStopTimes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopTripGrouping{directionId=$directionId, stopIds=$stopIds, tripHeadsigns=$tripHeadsigns, tripIds=$tripIds, tripsWithStopTimes=$tripsWithStopTimes, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Trip
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

                private var validated: Boolean = false

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
                        blockId = trip.blockId
                        directionId = trip.directionId
                        id = trip.id
                        peakOffpeak = trip.peakOffpeak
                        routeId = trip.routeId
                        routeShortName = trip.routeShortName
                        serviceId = trip.serviceId
                        shapeId = trip.shapeId
                        timeZone = trip.timeZone
                        tripHeadsign = trip.tripHeadsign
                        tripShortName = trip.tripShortName
                        additionalProperties = trip.additionalProperties.toMutableMap()
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

                    fun serviceId(serviceId: JsonField<String>) = apply {
                        this.serviceId = serviceId
                    }

                    fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

                    fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

                    fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

                    fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

                    fun tripHeadsign(tripHeadsign: String) =
                        tripHeadsign(JsonField.of(tripHeadsign))

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
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Trip && blockId == other.blockId && directionId == other.directionId && id == other.id && peakOffpeak == other.peakOffpeak && routeId == other.routeId && routeShortName == other.routeShortName && serviceId == other.serviceId && shapeId == other.shapeId && timeZone == other.timeZone && tripHeadsign == other.tripHeadsign && tripShortName == other.tripShortName && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(blockId, directionId, id, peakOffpeak, routeId, routeShortName, serviceId, shapeId, timeZone, tripHeadsign, tripShortName, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Trip{blockId=$blockId, directionId=$directionId, id=$id, peakOffpeak=$peakOffpeak, routeId=$routeId, routeShortName=$routeShortName, serviceId=$serviceId, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && routeId == other.routeId && scheduleDate == other.scheduleDate && serviceIds == other.serviceIds && stopTripGroupings == other.stopTripGroupings && stops == other.stops && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(routeId, scheduleDate, serviceIds, stopTripGroupings, stops, trips, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{routeId=$routeId, scheduleDate=$scheduleDate, serviceIds=$serviceIds, stopTripGroupings=$stopTripGroupings, stops=$stops, trips=$trips, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && entry == other.entry && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entry, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{entry=$entry, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduleForRouteRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleForRouteRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
