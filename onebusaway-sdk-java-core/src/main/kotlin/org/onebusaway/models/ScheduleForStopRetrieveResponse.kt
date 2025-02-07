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
class ScheduleForStopRetrieveResponse
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

    fun validate(): ScheduleForStopRetrieveResponse = apply {
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

    /** A builder for [ScheduleForStopRetrieveResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long>? = null
        private var currentTime: JsonField<Long>? = null
        private var text: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleForStopRetrieveResponse: ScheduleForStopRetrieveResponse) =
            apply {
                code = scheduleForStopRetrieveResponse.code
                currentTime = scheduleForStopRetrieveResponse.currentTime
                text = scheduleForStopRetrieveResponse.text
                version = scheduleForStopRetrieveResponse.version
                data = scheduleForStopRetrieveResponse.data
                additionalProperties =
                    scheduleForStopRetrieveResponse.additionalProperties.toMutableMap()
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

        fun build(): ScheduleForStopRetrieveResponse =
            ScheduleForStopRetrieveResponse(
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
            @JsonProperty("date")
            @ExcludeMissing
            private val date: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stopId")
            @ExcludeMissing
            private val stopId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stopRouteSchedules")
            @ExcludeMissing
            private val stopRouteSchedules: JsonField<List<StopRouteSchedule>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun date(): Long = date.getRequired("date")

            fun stopId(): String = stopId.getRequired("stopId")

            fun stopRouteSchedules(): List<StopRouteSchedule> =
                stopRouteSchedules.getRequired("stopRouteSchedules")

            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<Long> = date

            @JsonProperty("stopId") @ExcludeMissing fun _stopId(): JsonField<String> = stopId

            @JsonProperty("stopRouteSchedules")
            @ExcludeMissing
            fun _stopRouteSchedules(): JsonField<List<StopRouteSchedule>> = stopRouteSchedules

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                date()
                stopId()
                stopRouteSchedules().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var date: JsonField<Long>? = null
                private var stopId: JsonField<String>? = null
                private var stopRouteSchedules: JsonField<MutableList<StopRouteSchedule>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    date = entry.date
                    stopId = entry.stopId
                    stopRouteSchedules = entry.stopRouteSchedules.map { it.toMutableList() }
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun date(date: Long) = date(JsonField.of(date))

                fun date(date: JsonField<Long>) = apply { this.date = date }

                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                fun stopRouteSchedules(stopRouteSchedules: List<StopRouteSchedule>) =
                    stopRouteSchedules(JsonField.of(stopRouteSchedules))

                fun stopRouteSchedules(stopRouteSchedules: JsonField<List<StopRouteSchedule>>) =
                    apply {
                        this.stopRouteSchedules = stopRouteSchedules.map { it.toMutableList() }
                    }

                fun addStopRouteSchedule(stopRouteSchedule: StopRouteSchedule) = apply {
                    stopRouteSchedules =
                        (stopRouteSchedules ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(stopRouteSchedule)
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
                        checkRequired("date", date),
                        checkRequired("stopId", stopId),
                        checkRequired("stopRouteSchedules", stopRouteSchedules).map {
                            it.toImmutable()
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class StopRouteSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("routeId")
                @ExcludeMissing
                private val routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopRouteDirectionSchedules")
                @ExcludeMissing
                private val stopRouteDirectionSchedules:
                    JsonField<List<StopRouteDirectionSchedule>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun routeId(): String = routeId.getRequired("routeId")

                fun stopRouteDirectionSchedules(): List<StopRouteDirectionSchedule> =
                    stopRouteDirectionSchedules.getRequired("stopRouteDirectionSchedules")

                @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

                @JsonProperty("stopRouteDirectionSchedules")
                @ExcludeMissing
                fun _stopRouteDirectionSchedules(): JsonField<List<StopRouteDirectionSchedule>> =
                    stopRouteDirectionSchedules

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): StopRouteSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    routeId()
                    stopRouteDirectionSchedules().forEach { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StopRouteSchedule]. */
                class Builder internal constructor() {

                    private var routeId: JsonField<String>? = null
                    private var stopRouteDirectionSchedules:
                        JsonField<MutableList<StopRouteDirectionSchedule>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stopRouteSchedule: StopRouteSchedule) = apply {
                        routeId = stopRouteSchedule.routeId
                        stopRouteDirectionSchedules =
                            stopRouteSchedule.stopRouteDirectionSchedules.map { it.toMutableList() }
                        additionalProperties = stopRouteSchedule.additionalProperties.toMutableMap()
                    }

                    fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                    fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: List<StopRouteDirectionSchedule>
                    ) = stopRouteDirectionSchedules(JsonField.of(stopRouteDirectionSchedules))

                    fun stopRouteDirectionSchedules(
                        stopRouteDirectionSchedules: JsonField<List<StopRouteDirectionSchedule>>
                    ) = apply {
                        this.stopRouteDirectionSchedules =
                            stopRouteDirectionSchedules.map { it.toMutableList() }
                    }

                    fun addStopRouteDirectionSchedule(
                        stopRouteDirectionSchedule: StopRouteDirectionSchedule
                    ) = apply {
                        stopRouteDirectionSchedules =
                            (stopRouteDirectionSchedules ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(stopRouteDirectionSchedule)
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

                    fun build(): StopRouteSchedule =
                        StopRouteSchedule(
                            checkRequired("routeId", routeId),
                            checkRequired(
                                    "stopRouteDirectionSchedules",
                                    stopRouteDirectionSchedules
                                )
                                .map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class StopRouteDirectionSchedule
                @JsonCreator
                private constructor(
                    @JsonProperty("scheduleStopTimes")
                    @ExcludeMissing
                    private val scheduleStopTimes: JsonField<List<ScheduleStopTime>> =
                        JsonMissing.of(),
                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    private val tripHeadsign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("scheduleFrequencies")
                    @ExcludeMissing
                    private val scheduleFrequencies: JsonField<List<ScheduleFrequency>> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun scheduleStopTimes(): List<ScheduleStopTime> =
                        scheduleStopTimes.getRequired("scheduleStopTimes")

                    fun tripHeadsign(): String = tripHeadsign.getRequired("tripHeadsign")

                    fun scheduleFrequencies(): Optional<List<ScheduleFrequency>> =
                        Optional.ofNullable(scheduleFrequencies.getNullable("scheduleFrequencies"))

                    @JsonProperty("scheduleStopTimes")
                    @ExcludeMissing
                    fun _scheduleStopTimes(): JsonField<List<ScheduleStopTime>> = scheduleStopTimes

                    @JsonProperty("tripHeadsign")
                    @ExcludeMissing
                    fun _tripHeadsign(): JsonField<String> = tripHeadsign

                    @JsonProperty("scheduleFrequencies")
                    @ExcludeMissing
                    fun _scheduleFrequencies(): JsonField<List<ScheduleFrequency>> =
                        scheduleFrequencies

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): StopRouteDirectionSchedule = apply {
                        if (validated) {
                            return@apply
                        }

                        scheduleStopTimes().forEach { it.validate() }
                        tripHeadsign()
                        scheduleFrequencies().ifPresent { it.forEach { it.validate() } }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StopRouteDirectionSchedule]. */
                    class Builder internal constructor() {

                        private var scheduleStopTimes: JsonField<MutableList<ScheduleStopTime>>? =
                            null
                        private var tripHeadsign: JsonField<String>? = null
                        private var scheduleFrequencies:
                            JsonField<MutableList<ScheduleFrequency>>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(stopRouteDirectionSchedule: StopRouteDirectionSchedule) =
                            apply {
                                scheduleStopTimes =
                                    stopRouteDirectionSchedule.scheduleStopTimes.map {
                                        it.toMutableList()
                                    }
                                tripHeadsign = stopRouteDirectionSchedule.tripHeadsign
                                scheduleFrequencies =
                                    stopRouteDirectionSchedule.scheduleFrequencies.map {
                                        it.toMutableList()
                                    }
                                additionalProperties =
                                    stopRouteDirectionSchedule.additionalProperties.toMutableMap()
                            }

                        fun scheduleStopTimes(scheduleStopTimes: List<ScheduleStopTime>) =
                            scheduleStopTimes(JsonField.of(scheduleStopTimes))

                        fun scheduleStopTimes(
                            scheduleStopTimes: JsonField<List<ScheduleStopTime>>
                        ) = apply {
                            this.scheduleStopTimes = scheduleStopTimes.map { it.toMutableList() }
                        }

                        fun addScheduleStopTime(scheduleStopTime: ScheduleStopTime) = apply {
                            scheduleStopTimes =
                                (scheduleStopTimes ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(scheduleStopTime)
                                }
                        }

                        fun tripHeadsign(tripHeadsign: String) =
                            tripHeadsign(JsonField.of(tripHeadsign))

                        fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                            this.tripHeadsign = tripHeadsign
                        }

                        fun scheduleFrequencies(scheduleFrequencies: List<ScheduleFrequency>) =
                            scheduleFrequencies(JsonField.of(scheduleFrequencies))

                        fun scheduleFrequencies(
                            scheduleFrequencies: JsonField<List<ScheduleFrequency>>
                        ) = apply {
                            this.scheduleFrequencies =
                                scheduleFrequencies.map { it.toMutableList() }
                        }

                        fun addScheduleFrequency(scheduleFrequency: ScheduleFrequency) = apply {
                            scheduleFrequencies =
                                (scheduleFrequencies ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(scheduleFrequency)
                                }
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

                        fun build(): StopRouteDirectionSchedule =
                            StopRouteDirectionSchedule(
                                checkRequired("scheduleStopTimes", scheduleStopTimes).map {
                                    it.toImmutable()
                                },
                                checkRequired("tripHeadsign", tripHeadsign),
                                (scheduleFrequencies ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class ScheduleStopTime
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
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        private val tripId: JsonField<String> = JsonMissing.of(),
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

                        fun serviceId(): String = serviceId.getRequired("serviceId")

                        fun tripId(): String = tripId.getRequired("tripId")

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

                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun _tripId(): JsonField<String> = tripId

                        @JsonProperty("stopHeadsign")
                        @ExcludeMissing
                        fun _stopHeadsign(): JsonField<String> = stopHeadsign

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): ScheduleStopTime = apply {
                            if (validated) {
                                return@apply
                            }

                            arrivalEnabled()
                            arrivalTime()
                            departureEnabled()
                            departureTime()
                            serviceId()
                            tripId()
                            stopHeadsign()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ScheduleStopTime]. */
                        class Builder internal constructor() {

                            private var arrivalEnabled: JsonField<Boolean>? = null
                            private var arrivalTime: JsonField<Long>? = null
                            private var departureEnabled: JsonField<Boolean>? = null
                            private var departureTime: JsonField<Long>? = null
                            private var serviceId: JsonField<String>? = null
                            private var tripId: JsonField<String>? = null
                            private var stopHeadsign: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleStopTime: ScheduleStopTime) = apply {
                                arrivalEnabled = scheduleStopTime.arrivalEnabled
                                arrivalTime = scheduleStopTime.arrivalTime
                                departureEnabled = scheduleStopTime.departureEnabled
                                departureTime = scheduleStopTime.departureTime
                                serviceId = scheduleStopTime.serviceId
                                tripId = scheduleStopTime.tripId
                                stopHeadsign = scheduleStopTime.stopHeadsign
                                additionalProperties =
                                    scheduleStopTime.additionalProperties.toMutableMap()
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

                            fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                            fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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

                            fun build(): ScheduleStopTime =
                                ScheduleStopTime(
                                    checkRequired("arrivalEnabled", arrivalEnabled),
                                    checkRequired("arrivalTime", arrivalTime),
                                    checkRequired("departureEnabled", departureEnabled),
                                    checkRequired("departureTime", departureTime),
                                    checkRequired("serviceId", serviceId),
                                    checkRequired("tripId", tripId),
                                    stopHeadsign,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ScheduleStopTime && arrivalEnabled == other.arrivalEnabled && arrivalTime == other.arrivalTime && departureEnabled == other.departureEnabled && departureTime == other.departureTime && serviceId == other.serviceId && tripId == other.tripId && stopHeadsign == other.stopHeadsign && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(arrivalEnabled, arrivalTime, departureEnabled, departureTime, serviceId, tripId, stopHeadsign, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleStopTime{arrivalEnabled=$arrivalEnabled, arrivalTime=$arrivalTime, departureEnabled=$departureEnabled, departureTime=$departureTime, serviceId=$serviceId, tripId=$tripId, stopHeadsign=$stopHeadsign, additionalProperties=$additionalProperties}"
                    }

                    @NoAutoDetect
                    class ScheduleFrequency
                    @JsonCreator
                    private constructor(
                        @JsonProperty("endTime")
                        @ExcludeMissing
                        private val endTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("headway")
                        @ExcludeMissing
                        private val headway: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("serviceDate")
                        @ExcludeMissing
                        private val serviceDate: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        private val serviceId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("startTime")
                        @ExcludeMissing
                        private val startTime: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("tripId")
                        @ExcludeMissing
                        private val tripId: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun endTime(): Long = endTime.getRequired("endTime")

                        fun headway(): Long = headway.getRequired("headway")

                        fun serviceDate(): Long = serviceDate.getRequired("serviceDate")

                        fun serviceId(): String = serviceId.getRequired("serviceId")

                        fun startTime(): Long = startTime.getRequired("startTime")

                        fun tripId(): String = tripId.getRequired("tripId")

                        @JsonProperty("endTime")
                        @ExcludeMissing
                        fun _endTime(): JsonField<Long> = endTime

                        @JsonProperty("headway")
                        @ExcludeMissing
                        fun _headway(): JsonField<Long> = headway

                        @JsonProperty("serviceDate")
                        @ExcludeMissing
                        fun _serviceDate(): JsonField<Long> = serviceDate

                        @JsonProperty("serviceId")
                        @ExcludeMissing
                        fun _serviceId(): JsonField<String> = serviceId

                        @JsonProperty("startTime")
                        @ExcludeMissing
                        fun _startTime(): JsonField<Long> = startTime

                        @JsonProperty("tripId")
                        @ExcludeMissing
                        fun _tripId(): JsonField<String> = tripId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): ScheduleFrequency = apply {
                            if (validated) {
                                return@apply
                            }

                            endTime()
                            headway()
                            serviceDate()
                            serviceId()
                            startTime()
                            tripId()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ScheduleFrequency]. */
                        class Builder internal constructor() {

                            private var endTime: JsonField<Long>? = null
                            private var headway: JsonField<Long>? = null
                            private var serviceDate: JsonField<Long>? = null
                            private var serviceId: JsonField<String>? = null
                            private var startTime: JsonField<Long>? = null
                            private var tripId: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(scheduleFrequency: ScheduleFrequency) = apply {
                                endTime = scheduleFrequency.endTime
                                headway = scheduleFrequency.headway
                                serviceDate = scheduleFrequency.serviceDate
                                serviceId = scheduleFrequency.serviceId
                                startTime = scheduleFrequency.startTime
                                tripId = scheduleFrequency.tripId
                                additionalProperties =
                                    scheduleFrequency.additionalProperties.toMutableMap()
                            }

                            fun endTime(endTime: Long) = endTime(JsonField.of(endTime))

                            fun endTime(endTime: JsonField<Long>) = apply { this.endTime = endTime }

                            fun headway(headway: Long) = headway(JsonField.of(headway))

                            fun headway(headway: JsonField<Long>) = apply { this.headway = headway }

                            fun serviceDate(serviceDate: Long) =
                                serviceDate(JsonField.of(serviceDate))

                            fun serviceDate(serviceDate: JsonField<Long>) = apply {
                                this.serviceDate = serviceDate
                            }

                            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

                            fun serviceId(serviceId: JsonField<String>) = apply {
                                this.serviceId = serviceId
                            }

                            fun startTime(startTime: Long) = startTime(JsonField.of(startTime))

                            fun startTime(startTime: JsonField<Long>) = apply {
                                this.startTime = startTime
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

                            fun build(): ScheduleFrequency =
                                ScheduleFrequency(
                                    checkRequired("endTime", endTime),
                                    checkRequired("headway", headway),
                                    checkRequired("serviceDate", serviceDate),
                                    checkRequired("serviceId", serviceId),
                                    checkRequired("startTime", startTime),
                                    checkRequired("tripId", tripId),
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ScheduleFrequency && endTime == other.endTime && headway == other.headway && serviceDate == other.serviceDate && serviceId == other.serviceId && startTime == other.startTime && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(endTime, headway, serviceDate, serviceId, startTime, tripId, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ScheduleFrequency{endTime=$endTime, headway=$headway, serviceDate=$serviceDate, serviceId=$serviceId, startTime=$startTime, tripId=$tripId, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is StopRouteDirectionSchedule && scheduleStopTimes == other.scheduleStopTimes && tripHeadsign == other.tripHeadsign && scheduleFrequencies == other.scheduleFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(scheduleStopTimes, tripHeadsign, scheduleFrequencies, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StopRouteDirectionSchedule{scheduleStopTimes=$scheduleStopTimes, tripHeadsign=$tripHeadsign, scheduleFrequencies=$scheduleFrequencies, additionalProperties=$additionalProperties}"
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
