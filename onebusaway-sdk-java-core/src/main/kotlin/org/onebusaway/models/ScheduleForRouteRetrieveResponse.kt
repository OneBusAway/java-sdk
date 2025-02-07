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

    fun validate(): ScheduleForRouteRetrieveResponse = apply {
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

    /** A builder for [ScheduleForRouteRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entry(): Entry = entry.getRequired("entry")

        @JsonProperty("entry") @ExcludeMissing fun _entry(): JsonField<Entry> = entry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            entry().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var entry: JsonField<Entry>? = null
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

            fun build(): Data =
                Data(checkRequired("entry", entry), additionalProperties.toImmutable())
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
            @JsonProperty("stops")
            @ExcludeMissing
            private val stops: JsonField<List<Stop>> = JsonMissing.of(),
            @JsonProperty("stopTripGroupings")
            @ExcludeMissing
            private val stopTripGroupings: JsonField<List<StopTripGrouping>> = JsonMissing.of(),
            @JsonProperty("trips")
            @ExcludeMissing
            private val trips: JsonField<List<Trip>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun routeId(): String = routeId.getRequired("routeId")

            fun scheduleDate(): Long = scheduleDate.getRequired("scheduleDate")

            fun serviceIds(): List<String> = serviceIds.getRequired("serviceIds")

            fun stops(): List<Stop> = stops.getRequired("stops")

            fun stopTripGroupings(): List<StopTripGrouping> =
                stopTripGroupings.getRequired("stopTripGroupings")

            fun trips(): List<Trip> = trips.getRequired("trips")

            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            @JsonProperty("scheduleDate")
            @ExcludeMissing
            fun _scheduleDate(): JsonField<Long> = scheduleDate

            @JsonProperty("serviceIds")
            @ExcludeMissing
            fun _serviceIds(): JsonField<List<String>> = serviceIds

            @JsonProperty("stops") @ExcludeMissing fun _stops(): JsonField<List<Stop>> = stops

            @JsonProperty("stopTripGroupings")
            @ExcludeMissing
            fun _stopTripGroupings(): JsonField<List<StopTripGrouping>> = stopTripGroupings

            @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                routeId()
                scheduleDate()
                serviceIds()
                stops().forEach { it.validate() }
                stopTripGroupings().forEach { it.validate() }
                trips().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var routeId: JsonField<String>? = null
                private var scheduleDate: JsonField<Long>? = null
                private var serviceIds: JsonField<MutableList<String>>? = null
                private var stops: JsonField<MutableList<Stop>>? = null
                private var stopTripGroupings: JsonField<MutableList<StopTripGrouping>>? = null
                private var trips: JsonField<MutableList<Trip>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    routeId = entry.routeId
                    scheduleDate = entry.scheduleDate
                    serviceIds = entry.serviceIds.map { it.toMutableList() }
                    stops = entry.stops.map { it.toMutableList() }
                    stopTripGroupings = entry.stopTripGroupings.map { it.toMutableList() }
                    trips = entry.trips.map { it.toMutableList() }
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
                    this.serviceIds = serviceIds.map { it.toMutableList() }
                }

                fun addServiceId(serviceId: String) = apply {
                    serviceIds =
                        (serviceIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(serviceId)
                        }
                }

                fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

                fun stops(stops: JsonField<List<Stop>>) = apply {
                    this.stops = stops.map { it.toMutableList() }
                }

                fun addStop(stop: Stop) = apply {
                    stops =
                        (stops ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(stop)
                        }
                }

                fun stopTripGroupings(stopTripGroupings: List<StopTripGrouping>) =
                    stopTripGroupings(JsonField.of(stopTripGroupings))

                fun stopTripGroupings(stopTripGroupings: JsonField<List<StopTripGrouping>>) =
                    apply {
                        this.stopTripGroupings = stopTripGroupings.map { it.toMutableList() }
                    }

                fun addStopTripGrouping(stopTripGrouping: StopTripGrouping) = apply {
                    stopTripGroupings =
                        (stopTripGroupings ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(stopTripGrouping)
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
                        checkRequired("routeId", routeId),
                        checkRequired("scheduleDate", scheduleDate),
                        checkRequired("serviceIds", serviceIds).map { it.toImmutable() },
                        checkRequired("stops", stops).map { it.toImmutable() },
                        checkRequired("stopTripGroupings", stopTripGroupings).map {
                            it.toImmutable()
                        },
                        checkRequired("trips", trips).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Stop
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lat")
                @ExcludeMissing
                private val lat: JsonField<Double> = JsonMissing.of(),
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
                @JsonProperty("code")
                @ExcludeMissing
                private val code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                private val direction: JsonField<String> = JsonMissing.of(),
                @JsonProperty("locationType")
                @ExcludeMissing
                private val locationType: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                private val wheelchairBoarding: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun lat(): Double = lat.getRequired("lat")

                fun lon(): Double = lon.getRequired("lon")

                fun name(): String = name.getRequired("name")

                fun parent(): String = parent.getRequired("parent")

                fun routeIds(): List<String> = routeIds.getRequired("routeIds")

                fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

                fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

                fun direction(): Optional<String> =
                    Optional.ofNullable(direction.getNullable("direction"))

                fun locationType(): Optional<Long> =
                    Optional.ofNullable(locationType.getNullable("locationType"))

                fun wheelchairBoarding(): Optional<String> =
                    Optional.ofNullable(wheelchairBoarding.getNullable("wheelchairBoarding"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

                @JsonProperty("routeIds")
                @ExcludeMissing
                fun _routeIds(): JsonField<List<String>> = routeIds

                @JsonProperty("staticRouteIds")
                @ExcludeMissing
                fun _staticRouteIds(): JsonField<List<String>> = staticRouteIds

                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                @JsonProperty("direction")
                @ExcludeMissing
                fun _direction(): JsonField<String> = direction

                @JsonProperty("locationType")
                @ExcludeMissing
                fun _locationType(): JsonField<Long> = locationType

                @JsonProperty("wheelchairBoarding")
                @ExcludeMissing
                fun _wheelchairBoarding(): JsonField<String> = wheelchairBoarding

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Stop = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    lat()
                    lon()
                    name()
                    parent()
                    routeIds()
                    staticRouteIds()
                    code()
                    direction()
                    locationType()
                    wheelchairBoarding()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Stop]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var lat: JsonField<Double>? = null
                    private var lon: JsonField<Double>? = null
                    private var name: JsonField<String>? = null
                    private var parent: JsonField<String>? = null
                    private var routeIds: JsonField<MutableList<String>>? = null
                    private var staticRouteIds: JsonField<MutableList<String>>? = null
                    private var code: JsonField<String> = JsonMissing.of()
                    private var direction: JsonField<String> = JsonMissing.of()
                    private var locationType: JsonField<Long> = JsonMissing.of()
                    private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stop: Stop) = apply {
                        id = stop.id
                        lat = stop.lat
                        lon = stop.lon
                        name = stop.name
                        parent = stop.parent
                        routeIds = stop.routeIds.map { it.toMutableList() }
                        staticRouteIds = stop.staticRouteIds.map { it.toMutableList() }
                        code = stop.code
                        direction = stop.direction
                        locationType = stop.locationType
                        wheelchairBoarding = stop.wheelchairBoarding
                        additionalProperties = stop.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun parent(parent: String) = parent(JsonField.of(parent))

                    fun parent(parent: JsonField<String>) = apply { this.parent = parent }

                    fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

                    fun routeIds(routeIds: JsonField<List<String>>) = apply {
                        this.routeIds = routeIds.map { it.toMutableList() }
                    }

                    fun addRouteId(routeId: String) = apply {
                        routeIds =
                            (routeIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(routeId)
                            }
                    }

                    fun staticRouteIds(staticRouteIds: List<String>) =
                        staticRouteIds(JsonField.of(staticRouteIds))

                    fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                        this.staticRouteIds = staticRouteIds.map { it.toMutableList() }
                    }

                    fun addStaticRouteId(staticRouteId: String) = apply {
                        staticRouteIds =
                            (staticRouteIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(staticRouteId)
                            }
                    }

                    fun code(code: String) = code(JsonField.of(code))

                    fun code(code: JsonField<String>) = apply { this.code = code }

                    fun direction(direction: String) = direction(JsonField.of(direction))

                    fun direction(direction: JsonField<String>) = apply {
                        this.direction = direction
                    }

                    fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

                    fun locationType(locationType: JsonField<Long>) = apply {
                        this.locationType = locationType
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
                            checkRequired("id", id),
                            checkRequired("lat", lat),
                            checkRequired("lon", lon),
                            checkRequired("name", name),
                            checkRequired("parent", parent),
                            checkRequired("routeIds", routeIds).map { it.toImmutable() },
                            checkRequired("staticRouteIds", staticRouteIds).map {
                                it.toImmutable()
                            },
                            code,
                            direction,
                            locationType,
                            wheelchairBoarding,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Stop && id == other.id && lat == other.lat && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && locationType == other.locationType && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, lat, lon, name, parent, routeIds, staticRouteIds, code, direction, locationType, wheelchairBoarding, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Stop{id=$id, lat=$lat, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, locationType=$locationType, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
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

                @JsonProperty("directionId")
                @ExcludeMissing
                fun _directionId(): JsonField<String> = directionId

                @JsonProperty("stopIds")
                @ExcludeMissing
                fun _stopIds(): JsonField<List<String>> = stopIds

                @JsonProperty("tripHeadsigns")
                @ExcludeMissing
                fun _tripHeadsigns(): JsonField<List<String>> = tripHeadsigns

                @JsonProperty("tripIds")
                @ExcludeMissing
                fun _tripIds(): JsonField<List<String>> = tripIds

                @JsonProperty("tripsWithStopTimes")
                @ExcludeMissing
                fun _tripsWithStopTimes(): JsonField<List<TripsWithStopTime>> = tripsWithStopTimes

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StopTripGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    directionId()
                    stopIds()
                    tripHeadsigns()
                    tripIds()
                    tripsWithStopTimes().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopTripGrouping]. */
                class Builder internal constructor() {

                    private var directionId: JsonField<String>? = null
                    private var stopIds: JsonField<MutableList<String>>? = null
                    private var tripHeadsigns: JsonField<MutableList<String>>? = null
                    private var tripIds: JsonField<MutableList<String>>? = null
                    private var tripsWithStopTimes: JsonField<MutableList<TripsWithStopTime>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopTripGrouping: StopTripGrouping) = apply {
                        directionId = stopTripGrouping.directionId
                        stopIds = stopTripGrouping.stopIds.map { it.toMutableList() }
                        tripHeadsigns = stopTripGrouping.tripHeadsigns.map { it.toMutableList() }
                        tripIds = stopTripGrouping.tripIds.map { it.toMutableList() }
                        tripsWithStopTimes =
                            stopTripGrouping.tripsWithStopTimes.map { it.toMutableList() }
                        additionalProperties = stopTripGrouping.additionalProperties.toMutableMap()
                    }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun stopIds(stopIds: List<String>) = stopIds(JsonField.of(stopIds))

                    fun stopIds(stopIds: JsonField<List<String>>) = apply {
                        this.stopIds = stopIds.map { it.toMutableList() }
                    }

                    fun addStopId(stopId: String) = apply {
                        stopIds =
                            (stopIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(stopId)
                            }
                    }

                    fun tripHeadsigns(tripHeadsigns: List<String>) =
                        tripHeadsigns(JsonField.of(tripHeadsigns))

                    fun tripHeadsigns(tripHeadsigns: JsonField<List<String>>) = apply {
                        this.tripHeadsigns = tripHeadsigns.map { it.toMutableList() }
                    }

                    fun addTripHeadsign(tripHeadsign: String) = apply {
                        tripHeadsigns =
                            (tripHeadsigns ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(tripHeadsign)
                            }
                    }

                    fun tripIds(tripIds: List<String>) = tripIds(JsonField.of(tripIds))

                    fun tripIds(tripIds: JsonField<List<String>>) = apply {
                        this.tripIds = tripIds.map { it.toMutableList() }
                    }

                    fun addTripId(tripId: String) = apply {
                        tripIds =
                            (tripIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(tripId)
                            }
                    }

                    fun tripsWithStopTimes(tripsWithStopTimes: List<TripsWithStopTime>) =
                        tripsWithStopTimes(JsonField.of(tripsWithStopTimes))

                    fun tripsWithStopTimes(tripsWithStopTimes: JsonField<List<TripsWithStopTime>>) =
                        apply {
                            this.tripsWithStopTimes = tripsWithStopTimes.map { it.toMutableList() }
                        }

                    fun addTripsWithStopTime(tripsWithStopTime: TripsWithStopTime) = apply {
                        tripsWithStopTimes =
                            (tripsWithStopTimes ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(tripsWithStopTime)
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

                    fun build(): StopTripGrouping =
                        StopTripGrouping(
                            checkRequired("directionId", directionId),
                            checkRequired("stopIds", stopIds).map { it.toImmutable() },
                            checkRequired("tripHeadsigns", tripHeadsigns).map { it.toImmutable() },
                            checkRequired("tripIds", tripIds).map { it.toImmutable() },
                            (tripsWithStopTimes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class TripsWithStopTime
                @JsonCreator
                private constructor(
                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    private val stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
                    @JsonProperty("tripId")
                    @ExcludeMissing
                    private val tripId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

                    fun tripId(): String = tripId.getRequired("tripId")

                    @JsonProperty("stopTimes")
                    @ExcludeMissing
                    fun _stopTimes(): JsonField<List<StopTime>> = stopTimes

                    @JsonProperty("tripId")
                    @ExcludeMissing
                    fun _tripId(): JsonField<String> = tripId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): TripsWithStopTime = apply {
                        if (validated) {
                            return@apply
                        }

                        stopTimes().forEach { it.validate() }
                        tripId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TripsWithStopTime]. */
                    class Builder internal constructor() {

                        private var stopTimes: JsonField<MutableList<StopTime>>? = null
                        private var tripId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tripsWithStopTime: TripsWithStopTime) = apply {
                            stopTimes = tripsWithStopTime.stopTimes.map { it.toMutableList() }
                            tripId = tripsWithStopTime.tripId
                            additionalProperties =
                                tripsWithStopTime.additionalProperties.toMutableMap()
                        }

                        fun stopTimes(stopTimes: List<StopTime>) =
                            stopTimes(JsonField.of(stopTimes))

                        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
                            this.stopTimes = stopTimes.map { it.toMutableList() }
                        }

                        fun addStopTime(stopTime: StopTime) = apply {
                            stopTimes =
                                (stopTimes ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(stopTime)
                                }
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

                        fun build(): TripsWithStopTime =
                            TripsWithStopTime(
                                checkRequired("stopTimes", stopTimes).map { it.toImmutable() },
                                checkRequired("tripId", tripId),
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
                        @JsonProperty("stopId")
                        @ExcludeMissing
                        private val stopId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        private val tripId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        private val serviceId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        private val stopHeadsign: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                        fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                        fun departureEnabled(): Boolean =
                            departureEnabled.getRequired("departureEnabled")

                        fun departureTime(): Long = departureTime.getRequired("departureTime")

                        fun stopId(): String = stopId.getRequired("stopId")

                        fun tripId(): String = tripId.getRequired("tripId")

                        fun serviceId(): Optional<String> =
                            Optional.ofNullable(serviceId.getNullable("serviceId"))

                        fun stopHeadsign(): Optional<String> =
                            Optional.ofNullable(stopHeadsign.getNullable("stopHeadsign"))

                        @JsonProperty("arrivalEnabled")
                        @ExcludeMissing
                        fun _arrivalEnabled(): JsonField<Boolean> = arrivalEnabled

                        @JsonProperty("arrivalTime")
                        @ExcludeMissing
                        fun _arrivalTime(): JsonField<Long> = arrivalTime

                        @JsonProperty("departureEnabled")
                        @ExcludeMissing
                        fun _departureEnabled(): JsonField<Boolean> = departureEnabled

                        @JsonProperty("departureTime")
                        @ExcludeMissing
                        fun _departureTime(): JsonField<Long> = departureTime

                        @JsonProperty("stopId")
                        @ExcludeMissing
                        fun _stopId(): JsonField<String> = stopId

                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun _tripId(): JsonField<String> = tripId

                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        fun _stopHeadsign(): JsonField<String> = stopHeadsign

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): StopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            arrivalEnabled()
                            arrivalTime()
                            departureEnabled()
                            departureTime()
                            stopId()
                            tripId()
                            serviceId()
                            stopHeadsign()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [StopTime]. */
                        class Builder internal constructor() {

                            private var arrivalEnabled: JsonField<Boolean>? = null
                            private var arrivalTime: JsonField<Long>? = null
                            private var departureEnabled: JsonField<Boolean>? = null
                            private var departureTime: JsonField<Long>? = null
                            private var stopId: JsonField<String>? = null
                            private var tripId: JsonField<String>? = null
                            private var serviceId: JsonField<String> = JsonMissing.of()
                            private var stopHeadsign: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(stopTime: StopTime) = apply {
                                arrivalEnabled = stopTime.arrivalEnabled
                                arrivalTime = stopTime.arrivalTime
                                departureEnabled = stopTime.departureEnabled
                                departureTime = stopTime.departureTime
                                stopId = stopTime.stopId
                                tripId = stopTime.tripId
                                serviceId = stopTime.serviceId
                                stopHeadsign = stopTime.stopHeadsign
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

                            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

                            fun stopHeadsign(stopHeadsign: String) =
                                stopHeadsign(JsonField.of(stopHeadsign))

                            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                                this.stopHeadsign = stopHeadsign
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

                            fun build(): StopTime =
                                StopTime(
                                    checkRequired("arrivalEnabled", arrivalEnabled),
                                    checkRequired("arrivalTime", arrivalTime),
                                    checkRequired("departureEnabled", departureEnabled),
                                    checkRequired("departureTime", departureTime),
                                    checkRequired("stopId", stopId),
                                    checkRequired("tripId", tripId),
                                    serviceId,
                                    stopHeadsign,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StopTime && arrivalEnabled == other.arrivalEnabled && arrivalTime == other.arrivalTime && departureEnabled == other.departureEnabled && departureTime == other.departureTime && stopId == other.stopId && tripId == other.tripId && serviceId == other.serviceId && stopHeadsign == other.stopHeadsign && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(arrivalEnabled, arrivalTime, departureEnabled, departureTime, stopId, tripId, serviceId, stopHeadsign, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "StopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, stopId=$stopId, tripId=$tripId, serviceId=$serviceId, stopHeadsign=$stopHeadsign, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TripsWithStopTime && stopTimes == other.stopTimes && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(stopTimes, tripId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TripsWithStopTime{stopTimes=$stopTimes, tripId=$tripId, additionalProperties=$additionalProperties}"
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
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeId")
                @ExcludeMissing
                private val routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("serviceId")
                @ExcludeMissing
                private val serviceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blockId")
                @ExcludeMissing
                private val blockId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("directionId")
                @ExcludeMissing
                private val directionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("peakOffpeak")
                @ExcludeMissing
                private val peakOffpeak: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("routeShortName")
                @ExcludeMissing
                private val routeShortName: JsonField<String> = JsonMissing.of(),
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

                fun id(): String = id.getRequired("id")

                fun routeId(): String = routeId.getRequired("routeId")

                fun serviceId(): String = serviceId.getRequired("serviceId")

                fun blockId(): Optional<String> =
                    Optional.ofNullable(blockId.getNullable("blockId"))

                fun directionId(): Optional<String> =
                    Optional.ofNullable(directionId.getNullable("directionId"))

                fun peakOffpeak(): Optional<Long> =
                    Optional.ofNullable(peakOffpeak.getNullable("peakOffpeak"))

                fun routeShortName(): Optional<String> =
                    Optional.ofNullable(routeShortName.getNullable("routeShortName"))

                fun shapeId(): Optional<String> =
                    Optional.ofNullable(shapeId.getNullable("shapeId"))

                fun timeZone(): Optional<String> =
                    Optional.ofNullable(timeZone.getNullable("timeZone"))

                fun tripHeadsign(): Optional<String> =
                    Optional.ofNullable(tripHeadsign.getNullable("tripHeadsign"))

                fun tripShortName(): Optional<String> =
                    Optional.ofNullable(tripShortName.getNullable("tripShortName"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

                @JsonProperty("serviceId")
                @ExcludeMissing
                fun _serviceId(): JsonField<String> = serviceId

                @JsonProperty("blockId") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

                @JsonProperty("directionId")
                @ExcludeMissing
                fun _directionId(): JsonField<String> = directionId

                @JsonProperty("peakOffpeak")
                @ExcludeMissing
                fun _peakOffpeak(): JsonField<Long> = peakOffpeak

                @JsonProperty("routeShortName")
                @ExcludeMissing
                fun _routeShortName(): JsonField<String> = routeShortName

                @JsonProperty("shapeId") @ExcludeMissing fun _shapeId(): JsonField<String> = shapeId

                @JsonProperty("timeZone")
                @ExcludeMissing
                fun _timeZone(): JsonField<String> = timeZone

                @JsonProperty("tripHeadsign")
                @ExcludeMissing
                fun _tripHeadsign(): JsonField<String> = tripHeadsign

                @JsonProperty("tripShortName")
                @ExcludeMissing
                fun _tripShortName(): JsonField<String> = tripShortName

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Trip = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    routeId()
                    serviceId()
                    blockId()
                    directionId()
                    peakOffpeak()
                    routeShortName()
                    shapeId()
                    timeZone()
                    tripHeadsign()
                    tripShortName()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Trip]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var routeId: JsonField<String>? = null
                    private var serviceId: JsonField<String>? = null
                    private var blockId: JsonField<String> = JsonMissing.of()
                    private var directionId: JsonField<String> = JsonMissing.of()
                    private var peakOffpeak: JsonField<Long> = JsonMissing.of()
                    private var routeShortName: JsonField<String> = JsonMissing.of()
                    private var shapeId: JsonField<String> = JsonMissing.of()
                    private var timeZone: JsonField<String> = JsonMissing.of()
                    private var tripHeadsign: JsonField<String> = JsonMissing.of()
                    private var tripShortName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(trip: Trip) = apply {
                        id = trip.id
                        routeId = trip.routeId
                        serviceId = trip.serviceId
                        blockId = trip.blockId
                        directionId = trip.directionId
                        peakOffpeak = trip.peakOffpeak
                        routeShortName = trip.routeShortName
                        shapeId = trip.shapeId
                        timeZone = trip.timeZone
                        tripHeadsign = trip.tripHeadsign
                        tripShortName = trip.tripShortName
                        additionalProperties = trip.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                    fun serviceId(serviceId: JsonField<String>) = apply {
                        this.serviceId = serviceId
                    }

                    fun blockId(blockId: String) = blockId(JsonField.of(blockId))

                    fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

                    fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                    fun directionId(directionId: JsonField<String>) = apply {
                        this.directionId = directionId
                    }

                    fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

                    fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply {
                        this.peakOffpeak = peakOffpeak
                    }

                    fun routeShortName(routeShortName: String) =
                        routeShortName(JsonField.of(routeShortName))

                    fun routeShortName(routeShortName: JsonField<String>) = apply {
                        this.routeShortName = routeShortName
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
                            checkRequired("id", id),
                            checkRequired("routeId", routeId),
                            checkRequired("serviceId", serviceId),
                            blockId,
                            directionId,
                            peakOffpeak,
                            routeShortName,
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

                    return /* spotless:off */ other is Trip && id == other.id && routeId == other.routeId && serviceId == other.serviceId && blockId == other.blockId && directionId == other.directionId && peakOffpeak == other.peakOffpeak && routeShortName == other.routeShortName && shapeId == other.shapeId && timeZone == other.timeZone && tripHeadsign == other.tripHeadsign && tripShortName == other.tripShortName && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, routeId, serviceId, blockId, directionId, peakOffpeak, routeShortName, shapeId, timeZone, tripHeadsign, tripShortName, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Trip{id=$id, routeId=$routeId, serviceId=$serviceId, blockId=$blockId, directionId=$directionId, peakOffpeak=$peakOffpeak, routeShortName=$routeShortName, shapeId=$shapeId, timeZone=$timeZone, tripHeadsign=$tripHeadsign, tripShortName=$tripShortName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && routeId == other.routeId && scheduleDate == other.scheduleDate && serviceIds == other.serviceIds && stops == other.stops && stopTripGroupings == other.stopTripGroupings && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(routeId, scheduleDate, serviceIds, stops, stopTripGroupings, trips, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{routeId=$routeId, scheduleDate=$scheduleDate, serviceIds=$serviceIds, stops=$stops, stopTripGroupings=$stopTripGroupings, trips=$trips, additionalProperties=$additionalProperties}"
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
