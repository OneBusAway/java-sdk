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
import org.onebusaway.core.toImmutable

@JsonDeserialize(builder = ScheduleForStopRetrieveResponse.Builder::class)
@NoAutoDetect
class ScheduleForStopRetrieveResponse
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

    fun validate(): ScheduleForStopRetrieveResponse = apply {
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
        internal fun from(scheduleForStopRetrieveResponse: ScheduleForStopRetrieveResponse) =
            apply {
                this.code = scheduleForStopRetrieveResponse.code
                this.currentTime = scheduleForStopRetrieveResponse.currentTime
                this.text = scheduleForStopRetrieveResponse.text
                this.version = scheduleForStopRetrieveResponse.version
                this.data = scheduleForStopRetrieveResponse.data
                additionalProperties(scheduleForStopRetrieveResponse.additionalProperties)
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

        fun build(): ScheduleForStopRetrieveResponse =
            ScheduleForStopRetrieveResponse(
                code,
                currentTime,
                text,
                version,
                data,
                additionalProperties.toImmutable(),
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
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Entry.Builder::class)
        @NoAutoDetect
        class Entry
        private constructor(
            private val date: JsonField<Long>,
            private val stopId: JsonField<String>,
            private val stopRouteSchedules: JsonField<List<StopRouteSchedule>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun date(): Long = date.getRequired("date")

            fun stopId(): String = stopId.getRequired("stopId")

            fun stopRouteSchedules(): List<StopRouteSchedule> =
                stopRouteSchedules.getRequired("stopRouteSchedules")

            @JsonProperty("date") @ExcludeMissing fun _date() = date

            @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

            @JsonProperty("stopRouteSchedules")
            @ExcludeMissing
            fun _stopRouteSchedules() = stopRouteSchedules

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Entry = apply {
                if (!validated) {
                    date()
                    stopId()
                    stopRouteSchedules().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var date: JsonField<Long> = JsonMissing.of()
                private var stopId: JsonField<String> = JsonMissing.of()
                private var stopRouteSchedules: JsonField<List<StopRouteSchedule>> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    this.date = entry.date
                    this.stopId = entry.stopId
                    this.stopRouteSchedules = entry.stopRouteSchedules
                    additionalProperties(entry.additionalProperties)
                }

                fun date(date: Long) = date(JsonField.of(date))

                @JsonProperty("date")
                @ExcludeMissing
                fun date(date: JsonField<Long>) = apply { this.date = date }

                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                @JsonProperty("stopId")
                @ExcludeMissing
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                fun stopRouteSchedules(stopRouteSchedules: List<StopRouteSchedule>) =
                    stopRouteSchedules(JsonField.of(stopRouteSchedules))

                @JsonProperty("stopRouteSchedules")
                @ExcludeMissing
                fun stopRouteSchedules(stopRouteSchedules: JsonField<List<StopRouteSchedule>>) =
                    apply {
                        this.stopRouteSchedules = stopRouteSchedules
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
                        date,
                        stopId,
                        stopRouteSchedules.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = StopRouteSchedule.Builder::class)
            @NoAutoDetect
            class StopRouteSchedule
            private constructor(
                private val routeId: JsonField<String>,
                private val stopRouteDirectionSchedules:
                    JsonField<List<StopRouteDirectionSchedule>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun routeId(): String = routeId.getRequired("routeId")

                fun stopRouteDirectionSchedules(): List<StopRouteDirectionSchedule> =
                    stopRouteDirectionSchedules.getRequired("stopRouteDirectionSchedules")

                @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

                @JsonProperty("stopRouteDirectionSchedules")
                @ExcludeMissing
                fun _stopRouteDirectionSchedules() = stopRouteDirectionSchedules

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): StopRouteSchedule = apply {
                    if (!validated) {
                        routeId()
                        stopRouteDirectionSchedules().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var routeId: JsonField<String> = JsonMissing.of()
                    private var stopRouteDirectionSchedules:
                        JsonField<List<StopRouteDirectionSchedule>> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopRouteSchedule: StopRouteSchedule) = apply {
                        this.routeId = stopRouteSchedule.routeId
                        this.stopRouteDirectionSchedules =
                            stopRouteSchedule.stopRouteDirectionSchedules
                        additionalProperties(stopRouteSchedule.additionalProperties)
                    }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    @JsonProperty("routeId")
                    @ExcludeMissing
                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: List<StopRouteDirectionSchedule>
                    ) = stopRouteDirectionSchedules(JsonField.of(stopRouteDirectionSchedules))

                    @JsonProperty("stopRouteDirectionSchedules")
                    @ExcludeMissing
                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: JsonField<List<StopRouteDirectionSchedule>>
                    ) = apply { this.stopRouteDirectionSchedules = stopRouteDirectionSchedules }

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

                    fun build(): StopRouteSchedule =
                        StopRouteSchedule(
                            routeId,
                            stopRouteDirectionSchedules.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = StopRouteDirectionSchedule.Builder::class)
                @NoAutoDetect
                class StopRouteDirectionSchedule
                private constructor(
                    private val scheduleFrequencies: JsonField<List<ScheduleFrequency>>,
                    private val scheduleStopTimes: JsonField<List<ScheduleStopTime>>,
                    private val tripHeadsign: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun scheduleFrequencies(): Optional<List<ScheduleFrequency>> =
                        Optional.ofNullable(scheduleFrequencies.getNullable("scheduleFrequencies"))

                    fun scheduleStopTimes(): List<ScheduleStopTime> =
                        scheduleStopTimes.getRequired("scheduleStopTimes")

                    fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

                    @JsonProperty("scheduleFrequencies")
                    @ExcludeMissing
                    fun _scheduleFrequencies() = scheduleFrequencies

                    @JsonProperty("scheduleStopTimes")
                    @ExcludeMissing
                    fun _scheduleStopTimes() = scheduleStopTimes

                    @JsonProperty("tripHeadsign") @ExcludeMissing fun _tripHeadsign() = tripHeadsign

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): StopRouteDirectionSchedule = apply {
                        if (!validated) {
                            scheduleFrequencies().map { it.forEach { it.validate() } }
                            scheduleStopTimes().forEach { it.validate() }
                            tripHeadsign()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var scheduleFrequencies: JsonField<List<ScheduleFrequency>> =
                            JsonMissing.of()
                        private var scheduleStopTimes: JsonField<List<ScheduleStopTime>> =
                            JsonMissing.of()
                        private var tripHeadsign: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(stopRouteDirectionSchedule: StopRouteDirectionSchedule) =
                            apply {
                                this.scheduleFrequencies =
                                    stopRouteDirectionSchedule.scheduleFrequencies
                                this.scheduleStopTimes =
                                    stopRouteDirectionSchedule.scheduleStopTimes
                                this.tripHeadsign = stopRouteDirectionSchedule.tripHeadsign
                                additionalProperties(
                                    stopRouteDirectionSchedule.additionalProperties
                                )
                            }

                        fun scheduleFrequencies(scheduleFrequencies: List<ScheduleFrequency>) =
                            scheduleFrequencies(JsonField.of(scheduleFrequencies))

                        @JsonProperty("scheduleFrequencies")
                        @ExcludeMissing
                        fun scheduleFrequencies(
                            scheduleFrequencies: JsonField<List<ScheduleFrequency>>
                        ) = apply { this.scheduleFrequencies = scheduleFrequencies }

                        fun scheduleStopTimes(scheduleStopTimes: List<ScheduleStopTime>) =
                            scheduleStopTimes(JsonField.of(scheduleStopTimes))

                        @JsonProperty("scheduleStopTimes")
                        @ExcludeMissing
                        fun scheduleStopTimes(
                            scheduleStopTimes: JsonField<List<ScheduleStopTime>>
                        ) = apply { this.scheduleStopTimes = scheduleStopTimes }

                        fun tripHeadsign(tripHeadsign: String) =
                            tripHeadsign(JsonField.of(tripHeadsign))

                        @JsonProperty("tripHeadsign")
                        @ExcludeMissing
                        fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                            this.tripHeadsign = tripHeadsign
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

                        fun build(): StopRouteDirectionSchedule =
                            StopRouteDirectionSchedule(
                                scheduleFrequencies.map { it.toImmutable() },
                                scheduleStopTimes.map { it.toImmutable() },
                                tripHeadsign,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(builder = ScheduleStopTime.Builder::class)
                    @NoAutoDetect
                    class ScheduleStopTime
                    private constructor(
                        private val arrivalEnabled: JsonField<Boolean>,
                        private val arrivalTime: JsonField<Long>,
                        private val departureEnabled: JsonField<Boolean>,
                        private val departureTime: JsonField<Long>,
                        private val serviceId: JsonField<String>,
                        private val stopHeadsign: JsonField<String>,
                        private val tripId: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun arrivalEnabled(): Boolean = arrivalEnabled.getRequired("arrivalEnabled")

                        fun arrivalTime(): Long = arrivalTime.getRequired("arrivalTime")

                        fun departureEnabled(): Boolean =
                            departureEnabled.getRequired("departureEnabled")

                        fun departureTime(): Long = departureTime.getRequired("departureTime")

                        fun serviceId(): String = serviceId.getRequired("serviceId")

                        fun stopHeadsign(): Optional<String> =
                            Optional.ofNullable(stopHeadsign.getNullable("stopHeadsign"))

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

                        @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ScheduleStopTime = apply {
                            if (!validated) {
                                arrivalEnabled()
                                arrivalTime()
                                departureEnabled()
                                departureTime()
                                serviceId()
                                stopHeadsign()
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
                            private var tripId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleStopTime: ScheduleStopTime) = apply {
                                this.arrivalEnabled = scheduleStopTime.arrivalEnabled
                                this.arrivalTime = scheduleStopTime.arrivalTime
                                this.departureEnabled = scheduleStopTime.departureEnabled
                                this.departureTime = scheduleStopTime.departureTime
                                this.serviceId = scheduleStopTime.serviceId
                                this.stopHeadsign = scheduleStopTime.stopHeadsign
                                this.tripId = scheduleStopTime.tripId
                                additionalProperties(scheduleStopTime.additionalProperties)
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

                            fun build(): ScheduleStopTime =
                                ScheduleStopTime(
                                    arrivalEnabled,
                                    arrivalTime,
                                    departureEnabled,
                                    departureTime,
                                    serviceId,
                                    stopHeadsign,
                                    tripId,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ScheduleStopTime && arrivalEnabled == other.arrivalEnabled && arrivalTime == other.arrivalTime && departureEnabled == other.departureEnabled && departureTime == other.departureTime && serviceId == other.serviceId && stopHeadsign == other.stopHeadsign && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(arrivalEnabled, arrivalTime, departureEnabled, departureTime, serviceId, stopHeadsign, tripId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleStopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, serviceId=$serviceId, stopHeadsign=$stopHeadsign, tripId=$tripId, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(builder = ScheduleFrequency.Builder::class)
                    @NoAutoDetect
                    class ScheduleFrequency
                    private constructor(
                        private val serviceDate: JsonField<Long>,
                        private val startTime: JsonField<Long>,
                        private val endTime: JsonField<Long>,
                        private val headway: JsonField<Long>,
                        private val serviceId: JsonField<String>,
                        private val tripId: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                        fun startTime(): Long = startTime.getRequired("startTime")

                        fun endTime(): Long = endTime.getRequired("endTime")

                        fun headway(): Long = headway.getRequired("headway")

                        fun serviceId(): String = serviceId.getRequired("serviceId")

                        fun tripId(): String = tripId.getRequired("tripId")

                        @JsonProperty("serviceDate")
                        @ExcludeMissing
                        fun _serviceDate() = serviceDate

                        @JsonProperty("startTime") @ExcludeMissing fun _startTime() = startTime

                        @JsonProperty("endTime") @ExcludeMissing fun _endTime() = endTime

                        @JsonProperty("headway") @ExcludeMissing fun _headway() = headway

                        @JsonProperty("serviceId") @ExcludeMissing fun _serviceId() = serviceId

                        @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ScheduleFrequency = apply {
                            if (!validated) {
                                serviceDate()
                                startTime()
                                endTime()
                                headway()
                                serviceId()
                                tripId()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var serviceDate: JsonField<Long> = JsonMissing.of()
                            private var startTime: JsonField<Long> = JsonMissing.of()
                            private var endTime: JsonField<Long> = JsonMissing.of()
                            private var headway: JsonField<Long> = JsonMissing.of()
                            private var serviceId: JsonField<String> = JsonMissing.of()
                            private var tripId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleFrequency: ScheduleFrequency) = apply {
                                this.serviceDate = scheduleFrequency.serviceDate
                                this.startTime = scheduleFrequency.startTime
                                this.endTime = scheduleFrequency.endTime
                                this.headway = scheduleFrequency.headway
                                this.serviceId = scheduleFrequency.serviceId
                                this.tripId = scheduleFrequency.tripId
                                additionalProperties(scheduleFrequency.additionalProperties)
                            }

                            fun serviceDate(serviceDate: Long) =
                                serviceDate(JsonField.of(serviceDate))

                            @JsonProperty("serviceDate")
                            @ExcludeMissing
                            fun serviceDate(serviceDate: JsonField<Long>) = apply {
                                this.serviceDate = serviceDate
                            }

                            fun startTime(startTime: Long) = startTime(JsonField.of(startTime))

                            @JsonProperty("startTime")
                            @ExcludeMissing
                            fun startTime(startTime: JsonField<Long>) = apply {
                                this.startTime = startTime
                            }

                            fun endTime(endTime: Long) = endTime(JsonField.of(endTime))

                            @JsonProperty("endTime")
                            @ExcludeMissing
                            fun endTime(endTime: JsonField<Long>) = apply { this.endTime = endTime }

                            fun headway(headway: Long) = headway(JsonField.of(headway))

                            @JsonProperty("headway")
                            @ExcludeMissing
                            fun headway(headway: JsonField<Long>) = apply { this.headway = headway }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            @JsonProperty("serviceId")
                            @ExcludeMissing
                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

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

                            fun build(): ScheduleFrequency =
                                ScheduleFrequency(
                                    serviceDate,
                                    startTime,
                                    endTime,
                                    headway,
                                    serviceId,
                                    tripId,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ScheduleFrequency && serviceDate == other.serviceDate && startTime == other.startTime && endTime == other.endTime && headway == other.headway && serviceId == other.serviceId && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(serviceDate, startTime, endTime, headway, serviceId, tripId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleFrequency{serviceDate=$serviceDate, startTime=$startTime, endTime=$endTime, headway=$headway, serviceId=$serviceId, tripId=$tripId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is StopRouteDirectionSchedule && scheduleFrequencies == other.scheduleFrequencies && scheduleStopTimes == other.scheduleStopTimes && tripHeadsign == other.tripHeadsign && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(scheduleFrequencies, scheduleStopTimes, tripHeadsign, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StopRouteDirectionSchedule{scheduleFrequencies=$scheduleFrequencies, scheduleStopTimes=$scheduleStopTimes, tripHeadsign=$tripHeadsign, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StopRouteSchedule && routeId == other.routeId && stopRouteDirectionSchedules == other.stopRouteDirectionSchedules && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(routeId, stopRouteDirectionSchedules, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StopRouteSchedule{routeId=$routeId, stopRouteDirectionSchedules=$stopRouteDirectionSchedules, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entry && date == other.date && stopId == other.stopId && stopRouteSchedules == other.stopRouteSchedules && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(date, stopId, stopRouteSchedules, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{date=$date, stopId=$stopId, stopRouteSchedules=$stopRouteSchedules, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ScheduleForStopRetrieveResponse && code == other.code && currentTime == other.currentTime && text == other.text && version == other.version && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, currentTime, text, version, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleForStopRetrieveResponse{code=$code, currentTime=$currentTime, text=$text, version=$version, data=$data, additionalProperties=$additionalProperties}"
}
