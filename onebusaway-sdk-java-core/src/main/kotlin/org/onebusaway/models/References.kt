// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Enum
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.checkKnown
import org.onebusaway.core.checkRequired
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

class References
private constructor(
    private val agencies: JsonField<List<Agency>>,
    private val routes: JsonField<List<Route>>,
    private val situations: JsonField<List<Situation>>,
    private val stops: JsonField<List<Stop>>,
    private val stopTimes: JsonField<List<StopTime>>,
    private val trips: JsonField<List<Trip>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agencies")
        @ExcludeMissing
        agencies: JsonField<List<Agency>> = JsonMissing.of(),
        @JsonProperty("routes") @ExcludeMissing routes: JsonField<List<Route>> = JsonMissing.of(),
        @JsonProperty("situations")
        @ExcludeMissing
        situations: JsonField<List<Situation>> = JsonMissing.of(),
        @JsonProperty("stops") @ExcludeMissing stops: JsonField<List<Stop>> = JsonMissing.of(),
        @JsonProperty("stopTimes")
        @ExcludeMissing
        stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
        @JsonProperty("trips") @ExcludeMissing trips: JsonField<List<Trip>> = JsonMissing.of(),
    ) : this(agencies, routes, situations, stops, stopTimes, trips, mutableMapOf())

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agencies(): List<Agency> = agencies.getRequired("agencies")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routes(): List<Route> = routes.getRequired("routes")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun situations(): List<Situation> = situations.getRequired("situations")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stops(): List<Stop> = stops.getRequired("stops")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

    /**
     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trips(): List<Trip> = trips.getRequired("trips")

    /**
     * Returns the raw JSON value of [agencies].
     *
     * Unlike [agencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agencies") @ExcludeMissing fun _agencies(): JsonField<List<Agency>> = agencies

    /**
     * Returns the raw JSON value of [routes].
     *
     * Unlike [routes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routes") @ExcludeMissing fun _routes(): JsonField<List<Route>> = routes

    /**
     * Returns the raw JSON value of [situations].
     *
     * Unlike [situations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("situations")
    @ExcludeMissing
    fun _situations(): JsonField<List<Situation>> = situations

    /**
     * Returns the raw JSON value of [stops].
     *
     * Unlike [stops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stops") @ExcludeMissing fun _stops(): JsonField<List<Stop>> = stops

    /**
     * Returns the raw JSON value of [stopTimes].
     *
     * Unlike [stopTimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopTimes")
    @ExcludeMissing
    fun _stopTimes(): JsonField<List<StopTime>> = stopTimes

    /**
     * Returns the raw JSON value of [trips].
     *
     * Unlike [trips], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [References].
         *
         * The following fields are required:
         * ```java
         * .agencies()
         * .routes()
         * .situations()
         * .stops()
         * .stopTimes()
         * .trips()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [References]. */
    class Builder internal constructor() {

        private var agencies: JsonField<MutableList<Agency>>? = null
        private var routes: JsonField<MutableList<Route>>? = null
        private var situations: JsonField<MutableList<Situation>>? = null
        private var stops: JsonField<MutableList<Stop>>? = null
        private var stopTimes: JsonField<MutableList<StopTime>>? = null
        private var trips: JsonField<MutableList<Trip>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(references: References) = apply {
            agencies = references.agencies.map { it.toMutableList() }
            routes = references.routes.map { it.toMutableList() }
            situations = references.situations.map { it.toMutableList() }
            stops = references.stops.map { it.toMutableList() }
            stopTimes = references.stopTimes.map { it.toMutableList() }
            trips = references.trips.map { it.toMutableList() }
            additionalProperties = references.additionalProperties.toMutableMap()
        }

        fun agencies(agencies: List<Agency>) = agencies(JsonField.of(agencies))

        /**
         * Sets [Builder.agencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agencies] with a well-typed `List<Agency>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agencies(agencies: JsonField<List<Agency>>) = apply {
            this.agencies = agencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [Agency] to [agencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgency(agency: Agency) = apply {
            agencies =
                (agencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agencies", it).add(agency)
                }
        }

        fun routes(routes: List<Route>) = routes(JsonField.of(routes))

        /**
         * Sets [Builder.routes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routes] with a well-typed `List<Route>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routes(routes: JsonField<List<Route>>) = apply {
            this.routes = routes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Route] to [routes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoute(route: Route) = apply {
            routes =
                (routes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routes", it).add(route)
                }
        }

        fun situations(situations: List<Situation>) = situations(JsonField.of(situations))

        /**
         * Sets [Builder.situations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.situations] with a well-typed `List<Situation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun situations(situations: JsonField<List<Situation>>) = apply {
            this.situations = situations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Situation] to [situations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSituation(situation: Situation) = apply {
            situations =
                (situations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("situations", it).add(situation)
                }
        }

        fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

        /**
         * Sets [Builder.stops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stops] with a well-typed `List<Stop>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stops(stops: JsonField<List<Stop>>) = apply {
            this.stops = stops.map { it.toMutableList() }
        }

        /**
         * Adds a single [Stop] to [stops].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStop(stop: Stop) = apply {
            stops =
                (stops ?: JsonField.of(mutableListOf())).also { checkKnown("stops", it).add(stop) }
        }

        fun stopTimes(stopTimes: List<StopTime>) = stopTimes(JsonField.of(stopTimes))

        /**
         * Sets [Builder.stopTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopTimes] with a well-typed `List<StopTime>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply {
            this.stopTimes = stopTimes.map { it.toMutableList() }
        }

        /**
         * Adds a single [StopTime] to [stopTimes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStopTime(stopTime: StopTime) = apply {
            stopTimes =
                (stopTimes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stopTimes", it).add(stopTime)
                }
        }

        fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

        /**
         * Sets [Builder.trips] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trips] with a well-typed `List<Trip>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trips(trips: JsonField<List<Trip>>) = apply {
            this.trips = trips.map { it.toMutableList() }
        }

        /**
         * Adds a single [Trip] to [trips].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrip(trip: Trip) = apply {
            trips =
                (trips ?: JsonField.of(mutableListOf())).also { checkKnown("trips", it).add(trip) }
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

        /**
         * Returns an immutable instance of [References].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agencies()
         * .routes()
         * .situations()
         * .stops()
         * .stopTimes()
         * .trips()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): References =
            References(
                checkRequired("agencies", agencies).map { it.toImmutable() },
                checkRequired("routes", routes).map { it.toImmutable() },
                checkRequired("situations", situations).map { it.toImmutable() },
                checkRequired("stops", stops).map { it.toImmutable() },
                checkRequired("stopTimes", stopTimes).map { it.toImmutable() },
                checkRequired("trips", trips).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): References = apply {
        if (validated) {
            return@apply
        }

        agencies().forEach { it.validate() }
        routes().forEach { it.validate() }
        situations().forEach { it.validate() }
        stops().forEach { it.validate() }
        stopTimes().forEach { it.validate() }
        trips().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OnebusawaySdkInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (agencies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (routes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (situations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (stops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (stopTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (trips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Agency
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val timezone: JsonField<String>,
        private val url: JsonField<String>,
        private val disclaimer: JsonField<String>,
        private val email: JsonField<String>,
        private val fareUrl: JsonField<String>,
        private val lang: JsonField<String>,
        private val phone: JsonField<String>,
        private val privateService: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disclaimer")
            @ExcludeMissing
            disclaimer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fareUrl") @ExcludeMissing fareUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lang") @ExcludeMissing lang: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("privateService")
            @ExcludeMissing
            privateService: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            name,
            timezone,
            url,
            disclaimer,
            email,
            fareUrl,
            lang,
            phone,
            privateService,
            mutableMapOf(),
        )

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timezone(): String = timezone.getRequired("timezone")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun disclaimer(): Optional<String> = disclaimer.getOptional("disclaimer")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fareUrl(): Optional<String> = fareUrl.getOptional("fareUrl")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lang(): Optional<String> = lang.getOptional("lang")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun privateService(): Optional<Boolean> = privateService.getOptional("privateService")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [disclaimer].
         *
         * Unlike [disclaimer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("disclaimer")
        @ExcludeMissing
        fun _disclaimer(): JsonField<String> = disclaimer

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [fareUrl].
         *
         * Unlike [fareUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fareUrl") @ExcludeMissing fun _fareUrl(): JsonField<String> = fareUrl

        /**
         * Returns the raw JSON value of [lang].
         *
         * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [privateService].
         *
         * Unlike [privateService], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("privateService")
        @ExcludeMissing
        fun _privateService(): JsonField<Boolean> = privateService

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Agency].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .timezone()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Agency]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var timezone: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var disclaimer: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fareUrl: JsonField<String> = JsonMissing.of()
            private var lang: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var privateService: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agency: Agency) = apply {
                id = agency.id
                name = agency.name
                timezone = agency.timezone
                url = agency.url
                disclaimer = agency.disclaimer
                email = agency.email
                fareUrl = agency.fareUrl
                lang = agency.lang
                phone = agency.phone
                privateService = agency.privateService
                additionalProperties = agency.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun disclaimer(disclaimer: String) = disclaimer(JsonField.of(disclaimer))

            /**
             * Sets [Builder.disclaimer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disclaimer] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disclaimer(disclaimer: JsonField<String>) = apply { this.disclaimer = disclaimer }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun fareUrl(fareUrl: String) = fareUrl(JsonField.of(fareUrl))

            /**
             * Sets [Builder.fareUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fareUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fareUrl(fareUrl: JsonField<String>) = apply { this.fareUrl = fareUrl }

            fun lang(lang: String) = lang(JsonField.of(lang))

            /**
             * Sets [Builder.lang] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lang] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lang(lang: JsonField<String>) = apply { this.lang = lang }

            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            fun privateService(privateService: Boolean) =
                privateService(JsonField.of(privateService))

            /**
             * Sets [Builder.privateService] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privateService] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privateService(privateService: JsonField<Boolean>) = apply {
                this.privateService = privateService
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

            /**
             * Returns an immutable instance of [Agency].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .timezone()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Agency =
                Agency(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("timezone", timezone),
                    checkRequired("url", url),
                    disclaimer,
                    email,
                    fareUrl,
                    lang,
                    phone,
                    privateService,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Agency = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            timezone()
            url()
            disclaimer()
            email()
            fareUrl()
            lang()
            phone()
            privateService()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (disclaimer.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (fareUrl.asKnown().isPresent) 1 else 0) +
                (if (lang.asKnown().isPresent) 1 else 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (if (privateService.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Agency && id == other.id && name == other.name && timezone == other.timezone && url == other.url && disclaimer == other.disclaimer && email == other.email && fareUrl == other.fareUrl && lang == other.lang && phone == other.phone && privateService == other.privateService && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, timezone, url, disclaimer, email, fareUrl, lang, phone, privateService, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agency{id=$id, name=$name, timezone=$timezone, url=$url, disclaimer=$disclaimer, email=$email, fareUrl=$fareUrl, lang=$lang, phone=$phone, privateService=$privateService, additionalProperties=$additionalProperties}"
    }

    class Route
    private constructor(
        private val id: JsonField<String>,
        private val agencyId: JsonField<String>,
        private val type: JsonField<Long>,
        private val color: JsonField<String>,
        private val description: JsonField<String>,
        private val longName: JsonField<String>,
        private val nullSafeShortName: JsonField<String>,
        private val shortName: JsonField<String>,
        private val textColor: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agencyId")
            @ExcludeMissing
            agencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("longName")
            @ExcludeMissing
            longName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nullSafeShortName")
            @ExcludeMissing
            nullSafeShortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shortName")
            @ExcludeMissing
            shortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("textColor")
            @ExcludeMissing
            textColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            agencyId,
            type,
            color,
            description,
            longName,
            nullSafeShortName,
            shortName,
            textColor,
            url,
            mutableMapOf(),
        )

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agencyId(): String = agencyId.getRequired("agencyId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Long = type.getRequired("type")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun color(): Optional<String> = color.getOptional("color")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun longName(): Optional<String> = longName.getOptional("longName")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nullSafeShortName(): Optional<String> =
            nullSafeShortName.getOptional("nullSafeShortName")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shortName(): Optional<String> = shortName.getOptional("shortName")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun textColor(): Optional<String> = textColor.getOptional("textColor")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [agencyId].
         *
         * Unlike [agencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agencyId") @ExcludeMissing fun _agencyId(): JsonField<String> = agencyId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Long> = type

        /**
         * Returns the raw JSON value of [color].
         *
         * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [longName].
         *
         * Unlike [longName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longName") @ExcludeMissing fun _longName(): JsonField<String> = longName

        /**
         * Returns the raw JSON value of [nullSafeShortName].
         *
         * Unlike [nullSafeShortName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nullSafeShortName")
        @ExcludeMissing
        fun _nullSafeShortName(): JsonField<String> = nullSafeShortName

        /**
         * Returns the raw JSON value of [shortName].
         *
         * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

        /**
         * Returns the raw JSON value of [textColor].
         *
         * Unlike [textColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("textColor") @ExcludeMissing fun _textColor(): JsonField<String> = textColor

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Route].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agencyId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Route]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var agencyId: JsonField<String>? = null
            private var type: JsonField<Long>? = null
            private var color: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var longName: JsonField<String> = JsonMissing.of()
            private var nullSafeShortName: JsonField<String> = JsonMissing.of()
            private var shortName: JsonField<String> = JsonMissing.of()
            private var textColor: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(route: Route) = apply {
                id = route.id
                agencyId = route.agencyId
                type = route.type
                color = route.color
                description = route.description
                longName = route.longName
                nullSafeShortName = route.nullSafeShortName
                shortName = route.shortName
                textColor = route.textColor
                url = route.url
                additionalProperties = route.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

            /**
             * Sets [Builder.agencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agencyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

            fun type(type: Long) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Long>) = apply { this.type = type }

            fun color(color: String) = color(JsonField.of(color))

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun longName(longName: String) = longName(JsonField.of(longName))

            /**
             * Sets [Builder.longName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longName(longName: JsonField<String>) = apply { this.longName = longName }

            fun nullSafeShortName(nullSafeShortName: String) =
                nullSafeShortName(JsonField.of(nullSafeShortName))

            /**
             * Sets [Builder.nullSafeShortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nullSafeShortName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                this.nullSafeShortName = nullSafeShortName
            }

            fun shortName(shortName: String) = shortName(JsonField.of(shortName))

            /**
             * Sets [Builder.shortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shortName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

            fun textColor(textColor: String) = textColor(JsonField.of(textColor))

            /**
             * Sets [Builder.textColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textColor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textColor(textColor: JsonField<String>) = apply { this.textColor = textColor }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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

            /**
             * Returns an immutable instance of [Route].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agencyId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Route =
                Route(
                    checkRequired("id", id),
                    checkRequired("agencyId", agencyId),
                    checkRequired("type", type),
                    color,
                    description,
                    longName,
                    nullSafeShortName,
                    shortName,
                    textColor,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Route = apply {
            if (validated) {
                return@apply
            }

            id()
            agencyId()
            type()
            color()
            description()
            longName()
            nullSafeShortName()
            shortName()
            textColor()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (agencyId.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (color.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (longName.asKnown().isPresent) 1 else 0) +
                (if (nullSafeShortName.asKnown().isPresent) 1 else 0) +
                (if (shortName.asKnown().isPresent) 1 else 0) +
                (if (textColor.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Route && id == other.id && agencyId == other.agencyId && type == other.type && color == other.color && description == other.description && longName == other.longName && nullSafeShortName == other.nullSafeShortName && shortName == other.shortName && textColor == other.textColor && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, agencyId, type, color, description, longName, nullSafeShortName, shortName, textColor, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Route{id=$id, agencyId=$agencyId, type=$type, color=$color, description=$description, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, url=$url, additionalProperties=$additionalProperties}"
    }

    class Situation
    private constructor(
        private val id: JsonField<String>,
        private val creationTime: JsonField<Long>,
        private val activeWindows: JsonField<List<ActiveWindow>>,
        private val allAffects: JsonField<List<AllAffect>>,
        private val consequenceMessage: JsonField<String>,
        private val consequences: JsonField<List<Consequence>>,
        private val description: JsonField<Description>,
        private val publicationWindows: JsonField<List<PublicationWindow>>,
        private val reason: JsonField<Reason>,
        private val severity: JsonField<String>,
        private val summary: JsonField<Summary>,
        private val url: JsonField<Url>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creationTime")
            @ExcludeMissing
            creationTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("activeWindows")
            @ExcludeMissing
            activeWindows: JsonField<List<ActiveWindow>> = JsonMissing.of(),
            @JsonProperty("allAffects")
            @ExcludeMissing
            allAffects: JsonField<List<AllAffect>> = JsonMissing.of(),
            @JsonProperty("consequenceMessage")
            @ExcludeMissing
            consequenceMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("consequences")
            @ExcludeMissing
            consequences: JsonField<List<Consequence>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<Description> = JsonMissing.of(),
            @JsonProperty("publicationWindows")
            @ExcludeMissing
            publicationWindows: JsonField<List<PublicationWindow>> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<Url> = JsonMissing.of(),
        ) : this(
            id,
            creationTime,
            activeWindows,
            allAffects,
            consequenceMessage,
            consequences,
            description,
            publicationWindows,
            reason,
            severity,
            summary,
            url,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the situation.
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Unix timestamp of when this situation was created.
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creationTime(): Long = creationTime.getRequired("creationTime")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun activeWindows(): Optional<List<ActiveWindow>> =
            activeWindows.getOptional("activeWindows")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allAffects(): Optional<List<AllAffect>> = allAffects.getOptional("allAffects")

        /**
         * Message regarding the consequence of the situation.
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun consequenceMessage(): Optional<String> =
            consequenceMessage.getOptional("consequenceMessage")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun consequences(): Optional<List<Consequence>> = consequences.getOptional("consequences")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<Description> = description.getOptional("description")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun publicationWindows(): Optional<List<PublicationWindow>> =
            publicationWindows.getOptional("publicationWindows")

        /**
         * Reason for the service alert, taken from TPEG codes.
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reason(): Optional<Reason> = reason.getOptional("reason")

        /**
         * Severity of the situation.
         *
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun severity(): Optional<String> = severity.getOptional("severity")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun summary(): Optional<Summary> = summary.getOptional("summary")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun url(): Optional<Url> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creationTime].
         *
         * Unlike [creationTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creationTime")
        @ExcludeMissing
        fun _creationTime(): JsonField<Long> = creationTime

        /**
         * Returns the raw JSON value of [activeWindows].
         *
         * Unlike [activeWindows], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activeWindows")
        @ExcludeMissing
        fun _activeWindows(): JsonField<List<ActiveWindow>> = activeWindows

        /**
         * Returns the raw JSON value of [allAffects].
         *
         * Unlike [allAffects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allAffects")
        @ExcludeMissing
        fun _allAffects(): JsonField<List<AllAffect>> = allAffects

        /**
         * Returns the raw JSON value of [consequenceMessage].
         *
         * Unlike [consequenceMessage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("consequenceMessage")
        @ExcludeMissing
        fun _consequenceMessage(): JsonField<String> = consequenceMessage

        /**
         * Returns the raw JSON value of [consequences].
         *
         * Unlike [consequences], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("consequences")
        @ExcludeMissing
        fun _consequences(): JsonField<List<Consequence>> = consequences

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<Description> = description

        /**
         * Returns the raw JSON value of [publicationWindows].
         *
         * Unlike [publicationWindows], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("publicationWindows")
        @ExcludeMissing
        fun _publicationWindows(): JsonField<List<PublicationWindow>> = publicationWindows

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<String> = severity

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Situation].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creationTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Situation]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creationTime: JsonField<Long>? = null
            private var activeWindows: JsonField<MutableList<ActiveWindow>>? = null
            private var allAffects: JsonField<MutableList<AllAffect>>? = null
            private var consequenceMessage: JsonField<String> = JsonMissing.of()
            private var consequences: JsonField<MutableList<Consequence>>? = null
            private var description: JsonField<Description> = JsonMissing.of()
            private var publicationWindows: JsonField<MutableList<PublicationWindow>>? = null
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var severity: JsonField<String> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var url: JsonField<Url> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(situation: Situation) = apply {
                id = situation.id
                creationTime = situation.creationTime
                activeWindows = situation.activeWindows.map { it.toMutableList() }
                allAffects = situation.allAffects.map { it.toMutableList() }
                consequenceMessage = situation.consequenceMessage
                consequences = situation.consequences.map { it.toMutableList() }
                description = situation.description
                publicationWindows = situation.publicationWindows.map { it.toMutableList() }
                reason = situation.reason
                severity = situation.severity
                summary = situation.summary
                url = situation.url
                additionalProperties = situation.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the situation. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Unix timestamp of when this situation was created. */
            fun creationTime(creationTime: Long) = creationTime(JsonField.of(creationTime))

            /**
             * Sets [Builder.creationTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creationTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creationTime(creationTime: JsonField<Long>) = apply {
                this.creationTime = creationTime
            }

            fun activeWindows(activeWindows: List<ActiveWindow>) =
                activeWindows(JsonField.of(activeWindows))

            /**
             * Sets [Builder.activeWindows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeWindows] with a well-typed
             * `List<ActiveWindow>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun activeWindows(activeWindows: JsonField<List<ActiveWindow>>) = apply {
                this.activeWindows = activeWindows.map { it.toMutableList() }
            }

            /**
             * Adds a single [ActiveWindow] to [activeWindows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addActiveWindow(activeWindow: ActiveWindow) = apply {
                activeWindows =
                    (activeWindows ?: JsonField.of(mutableListOf())).also {
                        checkKnown("activeWindows", it).add(activeWindow)
                    }
            }

            fun allAffects(allAffects: List<AllAffect>) = allAffects(JsonField.of(allAffects))

            /**
             * Sets [Builder.allAffects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allAffects] with a well-typed `List<AllAffect>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allAffects(allAffects: JsonField<List<AllAffect>>) = apply {
                this.allAffects = allAffects.map { it.toMutableList() }
            }

            /**
             * Adds a single [AllAffect] to [allAffects].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllAffect(allAffect: AllAffect) = apply {
                allAffects =
                    (allAffects ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allAffects", it).add(allAffect)
                    }
            }

            /** Message regarding the consequence of the situation. */
            fun consequenceMessage(consequenceMessage: String) =
                consequenceMessage(JsonField.of(consequenceMessage))

            /**
             * Sets [Builder.consequenceMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consequenceMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consequenceMessage(consequenceMessage: JsonField<String>) = apply {
                this.consequenceMessage = consequenceMessage
            }

            fun consequences(consequences: List<Consequence>) =
                consequences(JsonField.of(consequences))

            /**
             * Sets [Builder.consequences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consequences] with a well-typed `List<Consequence>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun consequences(consequences: JsonField<List<Consequence>>) = apply {
                this.consequences = consequences.map { it.toMutableList() }
            }

            /**
             * Adds a single [Consequence] to [consequences].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConsequence(consequence: Consequence) = apply {
                consequences =
                    (consequences ?: JsonField.of(mutableListOf())).also {
                        checkKnown("consequences", it).add(consequence)
                    }
            }

            fun description(description: Description) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [Description] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<Description>) = apply {
                this.description = description
            }

            fun publicationWindows(publicationWindows: List<PublicationWindow>) =
                publicationWindows(JsonField.of(publicationWindows))

            /**
             * Sets [Builder.publicationWindows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publicationWindows] with a well-typed
             * `List<PublicationWindow>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun publicationWindows(publicationWindows: JsonField<List<PublicationWindow>>) = apply {
                this.publicationWindows = publicationWindows.map { it.toMutableList() }
            }

            /**
             * Adds a single [PublicationWindow] to [publicationWindows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPublicationWindow(publicationWindow: PublicationWindow) = apply {
                publicationWindows =
                    (publicationWindows ?: JsonField.of(mutableListOf())).also {
                        checkKnown("publicationWindows", it).add(publicationWindow)
                    }
            }

            /** Reason for the service alert, taken from TPEG codes. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** Severity of the situation. */
            fun severity(severity: String) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<String>) = apply { this.severity = severity }

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            fun url(url: Url) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [Url] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<Url>) = apply { this.url = url }

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

            /**
             * Returns an immutable instance of [Situation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creationTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Situation =
                Situation(
                    checkRequired("id", id),
                    checkRequired("creationTime", creationTime),
                    (activeWindows ?: JsonMissing.of()).map { it.toImmutable() },
                    (allAffects ?: JsonMissing.of()).map { it.toImmutable() },
                    consequenceMessage,
                    (consequences ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    (publicationWindows ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    severity,
                    summary,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Situation = apply {
            if (validated) {
                return@apply
            }

            id()
            creationTime()
            activeWindows().ifPresent { it.forEach { it.validate() } }
            allAffects().ifPresent { it.forEach { it.validate() } }
            consequenceMessage()
            consequences().ifPresent { it.forEach { it.validate() } }
            description().ifPresent { it.validate() }
            publicationWindows().ifPresent { it.forEach { it.validate() } }
            reason().ifPresent { it.validate() }
            severity()
            summary().ifPresent { it.validate() }
            url().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (creationTime.asKnown().isPresent) 1 else 0) +
                (activeWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (allAffects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (consequenceMessage.asKnown().isPresent) 1 else 0) +
                (consequences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (description.asKnown().getOrNull()?.validity() ?: 0) +
                (publicationWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0) +
                (if (severity.asKnown().isPresent) 1 else 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0) +
                (url.asKnown().getOrNull()?.validity() ?: 0)

        class ActiveWindow
        private constructor(
            private val from: JsonField<Long>,
            private val to: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("from") @ExcludeMissing from: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<Long> = JsonMissing.of(),
            ) : this(from, to, mutableMapOf())

            /**
             * Start time of the active window as a Unix timestamp.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun from(): Optional<Long> = from.getOptional("from")

            /**
             * End time of the active window as a Unix timestamp.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun to(): Optional<Long> = to.getOptional("to")

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<Long> = from

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<Long> = to

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ActiveWindow]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ActiveWindow]. */
            class Builder internal constructor() {

                private var from: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(activeWindow: ActiveWindow) = apply {
                    from = activeWindow.from
                    to = activeWindow.to
                    additionalProperties = activeWindow.additionalProperties.toMutableMap()
                }

                /** Start time of the active window as a Unix timestamp. */
                fun from(from: Long) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the active window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun to(to: JsonField<Long>) = apply { this.to = to }

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

                /**
                 * Returns an immutable instance of [ActiveWindow].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ActiveWindow =
                    ActiveWindow(from, to, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ActiveWindow = apply {
                if (validated) {
                    return@apply
                }

                from()
                to()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (from.asKnown().isPresent) 1 else 0) + (if (to.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ActiveWindow && from == other.from && to == other.to && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(from, to, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ActiveWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"
        }

        class AllAffect
        private constructor(
            private val agencyId: JsonField<String>,
            private val applicationId: JsonField<String>,
            private val directionId: JsonField<String>,
            private val routeId: JsonField<String>,
            private val stopId: JsonField<String>,
            private val tripId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("agencyId")
                @ExcludeMissing
                agencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applicationId")
                @ExcludeMissing
                applicationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("directionId")
                @ExcludeMissing
                directionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routeId")
                @ExcludeMissing
                routeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stopId")
                @ExcludeMissing
                stopId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tripId") @ExcludeMissing tripId: JsonField<String> = JsonMissing.of(),
            ) : this(agencyId, applicationId, directionId, routeId, stopId, tripId, mutableMapOf())

            /**
             * Identifier for the agency.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun agencyId(): Optional<String> = agencyId.getOptional("agencyId")

            /**
             * Identifier for the application.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun applicationId(): Optional<String> = applicationId.getOptional("applicationId")

            /**
             * Identifier for the direction.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun directionId(): Optional<String> = directionId.getOptional("directionId")

            /**
             * Identifier for the route.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routeId(): Optional<String> = routeId.getOptional("routeId")

            /**
             * Identifier for the stop.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stopId(): Optional<String> = stopId.getOptional("stopId")

            /**
             * Identifier for the trip.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tripId(): Optional<String> = tripId.getOptional("tripId")

            /**
             * Returns the raw JSON value of [agencyId].
             *
             * Unlike [agencyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId(): JsonField<String> = agencyId

            /**
             * Returns the raw JSON value of [applicationId].
             *
             * Unlike [applicationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("applicationId")
            @ExcludeMissing
            fun _applicationId(): JsonField<String> = applicationId

            /**
             * Returns the raw JSON value of [directionId].
             *
             * Unlike [directionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("directionId")
            @ExcludeMissing
            fun _directionId(): JsonField<String> = directionId

            /**
             * Returns the raw JSON value of [routeId].
             *
             * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

            /**
             * Returns the raw JSON value of [stopId].
             *
             * Unlike [stopId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stopId") @ExcludeMissing fun _stopId(): JsonField<String> = stopId

            /**
             * Returns the raw JSON value of [tripId].
             *
             * Unlike [tripId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tripId") @ExcludeMissing fun _tripId(): JsonField<String> = tripId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AllAffect]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AllAffect]. */
            class Builder internal constructor() {

                private var agencyId: JsonField<String> = JsonMissing.of()
                private var applicationId: JsonField<String> = JsonMissing.of()
                private var directionId: JsonField<String> = JsonMissing.of()
                private var routeId: JsonField<String> = JsonMissing.of()
                private var stopId: JsonField<String> = JsonMissing.of()
                private var tripId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(allAffect: AllAffect) = apply {
                    agencyId = allAffect.agencyId
                    applicationId = allAffect.applicationId
                    directionId = allAffect.directionId
                    routeId = allAffect.routeId
                    stopId = allAffect.stopId
                    tripId = allAffect.tripId
                    additionalProperties = allAffect.additionalProperties.toMutableMap()
                }

                /** Identifier for the agency. */
                fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

                /**
                 * Sets [Builder.agencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agencyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                /** Identifier for the application. */
                fun applicationId(applicationId: String) =
                    applicationId(JsonField.of(applicationId))

                /**
                 * Sets [Builder.applicationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applicationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun applicationId(applicationId: JsonField<String>) = apply {
                    this.applicationId = applicationId
                }

                /** Identifier for the direction. */
                fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                /**
                 * Sets [Builder.directionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun directionId(directionId: JsonField<String>) = apply {
                    this.directionId = directionId
                }

                /** Identifier for the route. */
                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                /**
                 * Sets [Builder.routeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                /** Identifier for the stop. */
                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                /**
                 * Sets [Builder.stopId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                /** Identifier for the trip. */
                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /**
                 * Sets [Builder.tripId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

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

                /**
                 * Returns an immutable instance of [AllAffect].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AllAffect =
                    AllAffect(
                        agencyId,
                        applicationId,
                        directionId,
                        routeId,
                        stopId,
                        tripId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AllAffect = apply {
                if (validated) {
                    return@apply
                }

                agencyId()
                applicationId()
                directionId()
                routeId()
                stopId()
                tripId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (agencyId.asKnown().isPresent) 1 else 0) +
                    (if (applicationId.asKnown().isPresent) 1 else 0) +
                    (if (directionId.asKnown().isPresent) 1 else 0) +
                    (if (routeId.asKnown().isPresent) 1 else 0) +
                    (if (stopId.asKnown().isPresent) 1 else 0) +
                    (if (tripId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AllAffect && agencyId == other.agencyId && applicationId == other.applicationId && directionId == other.directionId && routeId == other.routeId && stopId == other.stopId && tripId == other.tripId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(agencyId, applicationId, directionId, routeId, stopId, tripId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AllAffect{agencyId=$agencyId, applicationId=$applicationId, directionId=$directionId, routeId=$routeId, stopId=$stopId, tripId=$tripId, additionalProperties=$additionalProperties}"
        }

        class Consequence
        private constructor(
            private val condition: JsonField<String>,
            private val conditionDetails: JsonField<ConditionDetails>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("condition")
                @ExcludeMissing
                condition: JsonField<String> = JsonMissing.of(),
                @JsonProperty("conditionDetails")
                @ExcludeMissing
                conditionDetails: JsonField<ConditionDetails> = JsonMissing.of(),
            ) : this(condition, conditionDetails, mutableMapOf())

            /**
             * Condition of the consequence.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun condition(): Optional<String> = condition.getOptional("condition")

            /**
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun conditionDetails(): Optional<ConditionDetails> =
                conditionDetails.getOptional("conditionDetails")

            /**
             * Returns the raw JSON value of [condition].
             *
             * Unlike [condition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("condition")
            @ExcludeMissing
            fun _condition(): JsonField<String> = condition

            /**
             * Returns the raw JSON value of [conditionDetails].
             *
             * Unlike [conditionDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conditionDetails")
            @ExcludeMissing
            fun _conditionDetails(): JsonField<ConditionDetails> = conditionDetails

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Consequence]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Consequence]. */
            class Builder internal constructor() {

                private var condition: JsonField<String> = JsonMissing.of()
                private var conditionDetails: JsonField<ConditionDetails> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(consequence: Consequence) = apply {
                    condition = consequence.condition
                    conditionDetails = consequence.conditionDetails
                    additionalProperties = consequence.additionalProperties.toMutableMap()
                }

                /** Condition of the consequence. */
                fun condition(condition: String) = condition(JsonField.of(condition))

                /**
                 * Sets [Builder.condition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.condition] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun condition(condition: JsonField<String>) = apply { this.condition = condition }

                fun conditionDetails(conditionDetails: ConditionDetails) =
                    conditionDetails(JsonField.of(conditionDetails))

                /**
                 * Sets [Builder.conditionDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conditionDetails] with a well-typed
                 * [ConditionDetails] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun conditionDetails(conditionDetails: JsonField<ConditionDetails>) = apply {
                    this.conditionDetails = conditionDetails
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

                /**
                 * Returns an immutable instance of [Consequence].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Consequence =
                    Consequence(condition, conditionDetails, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Consequence = apply {
                if (validated) {
                    return@apply
                }

                condition()
                conditionDetails().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (condition.asKnown().isPresent) 1 else 0) +
                    (conditionDetails.asKnown().getOrNull()?.validity() ?: 0)

            class ConditionDetails
            private constructor(
                private val diversionPath: JsonField<DiversionPath>,
                private val diversionStopIds: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("diversionPath")
                    @ExcludeMissing
                    diversionPath: JsonField<DiversionPath> = JsonMissing.of(),
                    @JsonProperty("diversionStopIds")
                    @ExcludeMissing
                    diversionStopIds: JsonField<List<String>> = JsonMissing.of(),
                ) : this(diversionPath, diversionStopIds, mutableMapOf())

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun diversionPath(): Optional<DiversionPath> =
                    diversionPath.getOptional("diversionPath")

                /**
                 * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun diversionStopIds(): Optional<List<String>> =
                    diversionStopIds.getOptional("diversionStopIds")

                /**
                 * Returns the raw JSON value of [diversionPath].
                 *
                 * Unlike [diversionPath], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("diversionPath")
                @ExcludeMissing
                fun _diversionPath(): JsonField<DiversionPath> = diversionPath

                /**
                 * Returns the raw JSON value of [diversionStopIds].
                 *
                 * Unlike [diversionStopIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("diversionStopIds")
                @ExcludeMissing
                fun _diversionStopIds(): JsonField<List<String>> = diversionStopIds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ConditionDetails].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ConditionDetails]. */
                class Builder internal constructor() {

                    private var diversionPath: JsonField<DiversionPath> = JsonMissing.of()
                    private var diversionStopIds: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(conditionDetails: ConditionDetails) = apply {
                        diversionPath = conditionDetails.diversionPath
                        diversionStopIds =
                            conditionDetails.diversionStopIds.map { it.toMutableList() }
                        additionalProperties = conditionDetails.additionalProperties.toMutableMap()
                    }

                    fun diversionPath(diversionPath: DiversionPath) =
                        diversionPath(JsonField.of(diversionPath))

                    /**
                     * Sets [Builder.diversionPath] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.diversionPath] with a well-typed
                     * [DiversionPath] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun diversionPath(diversionPath: JsonField<DiversionPath>) = apply {
                        this.diversionPath = diversionPath
                    }

                    fun diversionStopIds(diversionStopIds: List<String>) =
                        diversionStopIds(JsonField.of(diversionStopIds))

                    /**
                     * Sets [Builder.diversionStopIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.diversionStopIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun diversionStopIds(diversionStopIds: JsonField<List<String>>) = apply {
                        this.diversionStopIds = diversionStopIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [diversionStopIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addDiversionStopId(diversionStopId: String) = apply {
                        diversionStopIds =
                            (diversionStopIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("diversionStopIds", it).add(diversionStopId)
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

                    /**
                     * Returns an immutable instance of [ConditionDetails].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ConditionDetails =
                        ConditionDetails(
                            diversionPath,
                            (diversionStopIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ConditionDetails = apply {
                    if (validated) {
                        return@apply
                    }

                    diversionPath().ifPresent { it.validate() }
                    diversionStopIds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: OnebusawaySdkInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (diversionPath.asKnown().getOrNull()?.validity() ?: 0) +
                        (diversionStopIds.asKnown().getOrNull()?.size ?: 0)

                class DiversionPath
                private constructor(
                    private val length: JsonField<Long>,
                    private val levels: JsonField<String>,
                    private val points: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("length")
                        @ExcludeMissing
                        length: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("levels")
                        @ExcludeMissing
                        levels: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("points")
                        @ExcludeMissing
                        points: JsonField<String> = JsonMissing.of(),
                    ) : this(length, levels, points, mutableMapOf())

                    /**
                     * Length of the diversion path.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun length(): Optional<Long> = length.getOptional("length")

                    /**
                     * Levels of the diversion path.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun levels(): Optional<String> = levels.getOptional("levels")

                    /**
                     * Points of the diversion path.
                     *
                     * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun points(): Optional<String> = points.getOptional("points")

                    /**
                     * Returns the raw JSON value of [length].
                     *
                     * Unlike [length], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                    /**
                     * Returns the raw JSON value of [levels].
                     *
                     * Unlike [levels], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("levels")
                    @ExcludeMissing
                    fun _levels(): JsonField<String> = levels

                    /**
                     * Returns the raw JSON value of [points].
                     *
                     * Unlike [points], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("points")
                    @ExcludeMissing
                    fun _points(): JsonField<String> = points

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [DiversionPath].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DiversionPath]. */
                    class Builder internal constructor() {

                        private var length: JsonField<Long> = JsonMissing.of()
                        private var levels: JsonField<String> = JsonMissing.of()
                        private var points: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(diversionPath: DiversionPath) = apply {
                            length = diversionPath.length
                            levels = diversionPath.levels
                            points = diversionPath.points
                            additionalProperties = diversionPath.additionalProperties.toMutableMap()
                        }

                        /** Length of the diversion path. */
                        fun length(length: Long) = length(JsonField.of(length))

                        /**
                         * Sets [Builder.length] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.length] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        /** Levels of the diversion path. */
                        fun levels(levels: String) = levels(JsonField.of(levels))

                        /**
                         * Sets [Builder.levels] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.levels] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        /** Points of the diversion path. */
                        fun points(points: String) = points(JsonField.of(points))

                        /**
                         * Sets [Builder.points] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.points] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun points(points: JsonField<String>) = apply { this.points = points }

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

                        /**
                         * Returns an immutable instance of [DiversionPath].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): DiversionPath =
                            DiversionPath(
                                length,
                                levels,
                                points,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): DiversionPath = apply {
                        if (validated) {
                            return@apply
                        }

                        length()
                        levels()
                        points()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: OnebusawaySdkInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (length.asKnown().isPresent) 1 else 0) +
                            (if (levels.asKnown().isPresent) 1 else 0) +
                            (if (points.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiversionPath && length == other.length && levels == other.levels && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(length, levels, points, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DiversionPath{length=$length, levels=$levels, points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionDetails && diversionPath == other.diversionPath && diversionStopIds == other.diversionStopIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(diversionPath, diversionStopIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionDetails{diversionPath=$diversionPath, diversionStopIds=$diversionStopIds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Consequence && condition == other.condition && conditionDetails == other.conditionDetails && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(condition, conditionDetails, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Consequence{condition=$condition, conditionDetails=$conditionDetails, additionalProperties=$additionalProperties}"
        }

        class Description
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lang") @ExcludeMissing lang: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(lang, value, mutableMapOf())

            /**
             * Language of the description.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lang(): Optional<String> = lang.getOptional("lang")

            /**
             * Longer description of the situation.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [lang].
             *
             * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Description]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Description]. */
            class Builder internal constructor() {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(description: Description) = apply {
                    lang = description.lang
                    value = description.value
                    additionalProperties = description.additionalProperties.toMutableMap()
                }

                /** Language of the description. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /**
                 * Sets [Builder.lang] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lang] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Longer description of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Description].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Description =
                    Description(lang, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Description = apply {
                if (validated) {
                    return@apply
                }

                lang()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (lang.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Description && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Description{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        class PublicationWindow
        private constructor(
            private val from: JsonField<Long>,
            private val to: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("from") @ExcludeMissing from: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("to") @ExcludeMissing to: JsonField<Long> = JsonMissing.of(),
            ) : this(from, to, mutableMapOf())

            /**
             * Start time of the time window as a Unix timestamp.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun from(): Long = from.getRequired("from")

            /**
             * End time of the time window as a Unix timestamp.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun to(): Long = to.getRequired("to")

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<Long> = from

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<Long> = to

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PublicationWindow].
                 *
                 * The following fields are required:
                 * ```java
                 * .from()
                 * .to()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PublicationWindow]. */
            class Builder internal constructor() {

                private var from: JsonField<Long>? = null
                private var to: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(publicationWindow: PublicationWindow) = apply {
                    from = publicationWindow.from
                    to = publicationWindow.to
                    additionalProperties = publicationWindow.additionalProperties.toMutableMap()
                }

                /** Start time of the time window as a Unix timestamp. */
                fun from(from: Long) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the time window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun to(to: JsonField<Long>) = apply { this.to = to }

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

                /**
                 * Returns an immutable instance of [PublicationWindow].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .from()
                 * .to()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PublicationWindow =
                    PublicationWindow(
                        checkRequired("from", from),
                        checkRequired("to", to),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PublicationWindow = apply {
                if (validated) {
                    return@apply
                }

                from()
                to()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (from.asKnown().isPresent) 1 else 0) + (if (to.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PublicationWindow && from == other.from && to == other.to && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(from, to, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PublicationWindow{from=$from, to=$to, additionalProperties=$additionalProperties}"
        }

        /** Reason for the service alert, taken from TPEG codes. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EQUIPMENT_REASON = of("equipmentReason")

                @JvmField val ENVIRONMENT_REASON = of("environmentReason")

                @JvmField val PERSONNEL_REASON = of("personnelReason")

                @JvmField val MISCELLANEOUS_REASON = of("miscellaneousReason")

                @JvmField val SECURITY_ALERT = of("securityAlert")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EQUIPMENT_REASON -> Value.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Value.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Value.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Value.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Value.SECURITY_ALERT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OnebusawaySdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    EQUIPMENT_REASON -> Known.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Known.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Known.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Known.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Known.SECURITY_ALERT
                    else -> throw OnebusawaySdkInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OnebusawaySdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OnebusawaySdkInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Reason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Summary
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lang") @ExcludeMissing lang: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(lang, value, mutableMapOf())

            /**
             * Language of the summary.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lang(): Optional<String> = lang.getOptional("lang")

            /**
             * Short summary of the situation.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [lang].
             *
             * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    lang = summary.lang
                    value = summary.value
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /** Language of the summary. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /**
                 * Sets [Builder.lang] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lang] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Short summary of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary = Summary(lang, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                lang()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (lang.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Summary && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        class Url
        private constructor(
            private val lang: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lang") @ExcludeMissing lang: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(lang, value, mutableMapOf())

            /**
             * Language of the URL.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lang(): Optional<String> = lang.getOptional("lang")

            /**
             * URL for more information about the situation.
             *
             * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [lang].
             *
             * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Url]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Url]. */
            class Builder internal constructor() {

                private var lang: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(url: Url) = apply {
                    lang = url.lang
                    value = url.value
                    additionalProperties = url.additionalProperties.toMutableMap()
                }

                /** Language of the URL. */
                fun lang(lang: String) = lang(JsonField.of(lang))

                /**
                 * Sets [Builder.lang] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lang] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** URL for more information about the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                /**
                 * Returns an immutable instance of [Url].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Url = Url(lang, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Url = apply {
                if (validated) {
                    return@apply
                }

                lang()
                value()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OnebusawaySdkInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (lang.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Url && lang == other.lang && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lang, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Url{lang=$lang, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Situation && id == other.id && creationTime == other.creationTime && activeWindows == other.activeWindows && allAffects == other.allAffects && consequenceMessage == other.consequenceMessage && consequences == other.consequences && description == other.description && publicationWindows == other.publicationWindows && reason == other.reason && severity == other.severity && summary == other.summary && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creationTime, activeWindows, allAffects, consequenceMessage, consequences, description, publicationWindows, reason, severity, summary, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Situation{id=$id, creationTime=$creationTime, activeWindows=$activeWindows, allAffects=$allAffects, consequenceMessage=$consequenceMessage, consequences=$consequences, description=$description, publicationWindows=$publicationWindows, reason=$reason, severity=$severity, summary=$summary, url=$url, additionalProperties=$additionalProperties}"
    }

    class Stop
    private constructor(
        private val id: JsonField<String>,
        private val lat: JsonField<Double>,
        private val locationType: JsonField<Long>,
        private val lon: JsonField<Double>,
        private val name: JsonField<String>,
        private val parent: JsonField<String>,
        private val routeIds: JsonField<List<String>>,
        private val staticRouteIds: JsonField<List<String>>,
        private val code: JsonField<String>,
        private val direction: JsonField<String>,
        private val wheelchairBoarding: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("locationType")
            @ExcludeMissing
            locationType: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent") @ExcludeMissing parent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routeIds")
            @ExcludeMissing
            routeIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("staticRouteIds")
            @ExcludeMissing
            staticRouteIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wheelchairBoarding")
            @ExcludeMissing
            wheelchairBoarding: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            lat,
            locationType,
            lon,
            name,
            parent,
            routeIds,
            staticRouteIds,
            code,
            direction,
            wheelchairBoarding,
            mutableMapOf(),
        )

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Double = lat.getRequired("lat")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locationType(): Long = locationType.getRequired("locationType")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Double = lon.getRequired("lon")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parent(): String = parent.getRequired("parent")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routeIds(): List<String> = routeIds.getRequired("routeIds")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun staticRouteIds(): List<String> = staticRouteIds.getRequired("staticRouteIds")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun direction(): Optional<String> = direction.getOptional("direction")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wheelchairBoarding(): Optional<String> =
            wheelchairBoarding.getOptional("wheelchairBoarding")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [locationType].
         *
         * Unlike [locationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locationType")
        @ExcludeMissing
        fun _locationType(): JsonField<Long> = locationType

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<String> = parent

        /**
         * Returns the raw JSON value of [routeIds].
         *
         * Unlike [routeIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routeIds")
        @ExcludeMissing
        fun _routeIds(): JsonField<List<String>> = routeIds

        /**
         * Returns the raw JSON value of [staticRouteIds].
         *
         * Unlike [staticRouteIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("staticRouteIds")
        @ExcludeMissing
        fun _staticRouteIds(): JsonField<List<String>> = staticRouteIds

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [wheelchairBoarding].
         *
         * Unlike [wheelchairBoarding], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wheelchairBoarding")
        @ExcludeMissing
        fun _wheelchairBoarding(): JsonField<String> = wheelchairBoarding

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Stop].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .lat()
             * .locationType()
             * .lon()
             * .name()
             * .parent()
             * .routeIds()
             * .staticRouteIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stop]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var lat: JsonField<Double>? = null
            private var locationType: JsonField<Long>? = null
            private var lon: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var parent: JsonField<String>? = null
            private var routeIds: JsonField<MutableList<String>>? = null
            private var staticRouteIds: JsonField<MutableList<String>>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var wheelchairBoarding: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stop: Stop) = apply {
                id = stop.id
                lat = stop.lat
                locationType = stop.locationType
                lon = stop.lon
                name = stop.name
                parent = stop.parent
                routeIds = stop.routeIds.map { it.toMutableList() }
                staticRouteIds = stop.staticRouteIds.map { it.toMutableList() }
                code = stop.code
                direction = stop.direction
                wheelchairBoarding = stop.wheelchairBoarding
                additionalProperties = stop.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            fun locationType(locationType: Long) = locationType(JsonField.of(locationType))

            /**
             * Sets [Builder.locationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationType] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationType(locationType: JsonField<Long>) = apply {
                this.locationType = locationType
            }

            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parent(parent: String) = parent(JsonField.of(parent))

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parent(parent: JsonField<String>) = apply { this.parent = parent }

            fun routeIds(routeIds: List<String>) = routeIds(JsonField.of(routeIds))

            /**
             * Sets [Builder.routeIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routeIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routeIds(routeIds: JsonField<List<String>>) = apply {
                this.routeIds = routeIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [routeIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRouteId(routeId: String) = apply {
                routeIds =
                    (routeIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routeIds", it).add(routeId)
                    }
            }

            fun staticRouteIds(staticRouteIds: List<String>) =
                staticRouteIds(JsonField.of(staticRouteIds))

            /**
             * Sets [Builder.staticRouteIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.staticRouteIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun staticRouteIds(staticRouteIds: JsonField<List<String>>) = apply {
                this.staticRouteIds = staticRouteIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [staticRouteIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStaticRouteId(staticRouteId: String) = apply {
                staticRouteIds =
                    (staticRouteIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("staticRouteIds", it).add(staticRouteId)
                    }
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            fun wheelchairBoarding(wheelchairBoarding: String) =
                wheelchairBoarding(JsonField.of(wheelchairBoarding))

            /**
             * Sets [Builder.wheelchairBoarding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wheelchairBoarding] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Stop].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .lat()
             * .locationType()
             * .lon()
             * .name()
             * .parent()
             * .routeIds()
             * .staticRouteIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Stop =
                Stop(
                    checkRequired("id", id),
                    checkRequired("lat", lat),
                    checkRequired("locationType", locationType),
                    checkRequired("lon", lon),
                    checkRequired("name", name),
                    checkRequired("parent", parent),
                    checkRequired("routeIds", routeIds).map { it.toImmutable() },
                    checkRequired("staticRouteIds", staticRouteIds).map { it.toImmutable() },
                    code,
                    direction,
                    wheelchairBoarding,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            id()
            lat()
            locationType()
            lon()
            name()
            parent()
            routeIds()
            staticRouteIds()
            code()
            direction()
            wheelchairBoarding()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (locationType.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (parent.asKnown().isPresent) 1 else 0) +
                (routeIds.asKnown().getOrNull()?.size ?: 0) +
                (staticRouteIds.asKnown().getOrNull()?.size ?: 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (direction.asKnown().isPresent) 1 else 0) +
                (if (wheelchairBoarding.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stop && id == other.id && lat == other.lat && locationType == other.locationType && lon == other.lon && name == other.name && parent == other.parent && routeIds == other.routeIds && staticRouteIds == other.staticRouteIds && code == other.code && direction == other.direction && wheelchairBoarding == other.wheelchairBoarding && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, lat, locationType, lon, name, parent, routeIds, staticRouteIds, code, direction, wheelchairBoarding, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stop{id=$id, lat=$lat, locationType=$locationType, lon=$lon, name=$name, parent=$parent, routeIds=$routeIds, staticRouteIds=$staticRouteIds, code=$code, direction=$direction, wheelchairBoarding=$wheelchairBoarding, additionalProperties=$additionalProperties}"
    }

    class StopTime
    private constructor(
        private val arrivalTime: JsonField<Long>,
        private val departureTime: JsonField<Long>,
        private val distanceAlongTrip: JsonField<Double>,
        private val historicalOccupancy: JsonField<String>,
        private val stopHeadsign: JsonField<String>,
        private val stopId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arrivalTime")
            @ExcludeMissing
            arrivalTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("departureTime")
            @ExcludeMissing
            departureTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("distanceAlongTrip")
            @ExcludeMissing
            distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("historicalOccupancy")
            @ExcludeMissing
            historicalOccupancy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stopHeadsign")
            @ExcludeMissing
            stopHeadsign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stopId") @ExcludeMissing stopId: JsonField<String> = JsonMissing.of(),
        ) : this(
            arrivalTime,
            departureTime,
            distanceAlongTrip,
            historicalOccupancy,
            stopHeadsign,
            stopId,
            mutableMapOf(),
        )

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun arrivalTime(): Optional<Long> = arrivalTime.getOptional("arrivalTime")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun departureTime(): Optional<Long> = departureTime.getOptional("departureTime")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distanceAlongTrip(): Optional<Double> =
            distanceAlongTrip.getOptional("distanceAlongTrip")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun historicalOccupancy(): Optional<String> =
            historicalOccupancy.getOptional("historicalOccupancy")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun stopHeadsign(): Optional<String> = stopHeadsign.getOptional("stopHeadsign")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun stopId(): Optional<String> = stopId.getOptional("stopId")

        /**
         * Returns the raw JSON value of [arrivalTime].
         *
         * Unlike [arrivalTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arrivalTime")
        @ExcludeMissing
        fun _arrivalTime(): JsonField<Long> = arrivalTime

        /**
         * Returns the raw JSON value of [departureTime].
         *
         * Unlike [departureTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("departureTime")
        @ExcludeMissing
        fun _departureTime(): JsonField<Long> = departureTime

        /**
         * Returns the raw JSON value of [distanceAlongTrip].
         *
         * Unlike [distanceAlongTrip], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distanceAlongTrip")
        @ExcludeMissing
        fun _distanceAlongTrip(): JsonField<Double> = distanceAlongTrip

        /**
         * Returns the raw JSON value of [historicalOccupancy].
         *
         * Unlike [historicalOccupancy], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("historicalOccupancy")
        @ExcludeMissing
        fun _historicalOccupancy(): JsonField<String> = historicalOccupancy

        /**
         * Returns the raw JSON value of [stopHeadsign].
         *
         * Unlike [stopHeadsign], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stopHeadsign")
        @ExcludeMissing
        fun _stopHeadsign(): JsonField<String> = stopHeadsign

        /**
         * Returns the raw JSON value of [stopId].
         *
         * Unlike [stopId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stopId") @ExcludeMissing fun _stopId(): JsonField<String> = stopId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [StopTime]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StopTime]. */
        class Builder internal constructor() {

            private var arrivalTime: JsonField<Long> = JsonMissing.of()
            private var departureTime: JsonField<Long> = JsonMissing.of()
            private var distanceAlongTrip: JsonField<Double> = JsonMissing.of()
            private var historicalOccupancy: JsonField<String> = JsonMissing.of()
            private var stopHeadsign: JsonField<String> = JsonMissing.of()
            private var stopId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stopTime: StopTime) = apply {
                arrivalTime = stopTime.arrivalTime
                departureTime = stopTime.departureTime
                distanceAlongTrip = stopTime.distanceAlongTrip
                historicalOccupancy = stopTime.historicalOccupancy
                stopHeadsign = stopTime.stopHeadsign
                stopId = stopTime.stopId
                additionalProperties = stopTime.additionalProperties.toMutableMap()
            }

            fun arrivalTime(arrivalTime: Long) = arrivalTime(JsonField.of(arrivalTime))

            /**
             * Sets [Builder.arrivalTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrivalTime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrivalTime(arrivalTime: JsonField<Long>) = apply { this.arrivalTime = arrivalTime }

            fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

            /**
             * Sets [Builder.departureTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.departureTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun departureTime(departureTime: JsonField<Long>) = apply {
                this.departureTime = departureTime
            }

            fun distanceAlongTrip(distanceAlongTrip: Double) =
                distanceAlongTrip(JsonField.of(distanceAlongTrip))

            /**
             * Sets [Builder.distanceAlongTrip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceAlongTrip] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                this.distanceAlongTrip = distanceAlongTrip
            }

            fun historicalOccupancy(historicalOccupancy: String) =
                historicalOccupancy(JsonField.of(historicalOccupancy))

            /**
             * Sets [Builder.historicalOccupancy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.historicalOccupancy] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                this.historicalOccupancy = historicalOccupancy
            }

            fun stopHeadsign(stopHeadsign: String) = stopHeadsign(JsonField.of(stopHeadsign))

            /**
             * Sets [Builder.stopHeadsign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopHeadsign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                this.stopHeadsign = stopHeadsign
            }

            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

            /**
             * Sets [Builder.stopId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

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

            /**
             * Returns an immutable instance of [StopTime].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StopTime =
                StopTime(
                    arrivalTime,
                    departureTime,
                    distanceAlongTrip,
                    historicalOccupancy,
                    stopHeadsign,
                    stopId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StopTime = apply {
            if (validated) {
                return@apply
            }

            arrivalTime()
            departureTime()
            distanceAlongTrip()
            historicalOccupancy()
            stopHeadsign()
            stopId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (arrivalTime.asKnown().isPresent) 1 else 0) +
                (if (departureTime.asKnown().isPresent) 1 else 0) +
                (if (distanceAlongTrip.asKnown().isPresent) 1 else 0) +
                (if (historicalOccupancy.asKnown().isPresent) 1 else 0) +
                (if (stopHeadsign.asKnown().isPresent) 1 else 0) +
                (if (stopId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StopTime && arrivalTime == other.arrivalTime && departureTime == other.departureTime && distanceAlongTrip == other.distanceAlongTrip && historicalOccupancy == other.historicalOccupancy && stopHeadsign == other.stopHeadsign && stopId == other.stopId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(arrivalTime, departureTime, distanceAlongTrip, historicalOccupancy, stopHeadsign, stopId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StopTime{arrivalTime=$arrivalTime, departureTime=$departureTime, distanceAlongTrip=$distanceAlongTrip, historicalOccupancy=$historicalOccupancy, stopHeadsign=$stopHeadsign, stopId=$stopId, additionalProperties=$additionalProperties}"
    }

    class Trip
    private constructor(
        private val id: JsonField<String>,
        private val routeId: JsonField<String>,
        private val serviceId: JsonField<String>,
        private val blockId: JsonField<String>,
        private val directionId: JsonField<String>,
        private val peakOffpeak: JsonField<Long>,
        private val routeShortName: JsonField<String>,
        private val shapeId: JsonField<String>,
        private val timeZone: JsonField<String>,
        private val tripHeadsign: JsonField<String>,
        private val tripShortName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routeId") @ExcludeMissing routeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceId")
            @ExcludeMissing
            serviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("blockId") @ExcludeMissing blockId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("directionId")
            @ExcludeMissing
            directionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("peakOffpeak")
            @ExcludeMissing
            peakOffpeak: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("routeShortName")
            @ExcludeMissing
            routeShortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shapeId") @ExcludeMissing shapeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeZone")
            @ExcludeMissing
            timeZone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripHeadsign")
            @ExcludeMissing
            tripHeadsign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripShortName")
            @ExcludeMissing
            tripShortName: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            routeId,
            serviceId,
            blockId,
            directionId,
            peakOffpeak,
            routeShortName,
            shapeId,
            timeZone,
            tripHeadsign,
            tripShortName,
            mutableMapOf(),
        )

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routeId(): String = routeId.getRequired("routeId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun serviceId(): String = serviceId.getRequired("serviceId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun blockId(): Optional<String> = blockId.getOptional("blockId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun directionId(): Optional<String> = directionId.getOptional("directionId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun peakOffpeak(): Optional<Long> = peakOffpeak.getOptional("peakOffpeak")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routeShortName(): Optional<String> = routeShortName.getOptional("routeShortName")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shapeId(): Optional<String> = shapeId.getOptional("shapeId")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timeZone(): Optional<String> = timeZone.getOptional("timeZone")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tripHeadsign(): Optional<String> = tripHeadsign.getOptional("tripHeadsign")

        /**
         * @throws OnebusawaySdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tripShortName(): Optional<String> = tripShortName.getOptional("tripShortName")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [routeId].
         *
         * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routeId") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

        /**
         * Returns the raw JSON value of [serviceId].
         *
         * Unlike [serviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("serviceId") @ExcludeMissing fun _serviceId(): JsonField<String> = serviceId

        /**
         * Returns the raw JSON value of [blockId].
         *
         * Unlike [blockId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blockId") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

        /**
         * Returns the raw JSON value of [directionId].
         *
         * Unlike [directionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("directionId")
        @ExcludeMissing
        fun _directionId(): JsonField<String> = directionId

        /**
         * Returns the raw JSON value of [peakOffpeak].
         *
         * Unlike [peakOffpeak], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("peakOffpeak")
        @ExcludeMissing
        fun _peakOffpeak(): JsonField<Long> = peakOffpeak

        /**
         * Returns the raw JSON value of [routeShortName].
         *
         * Unlike [routeShortName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routeShortName")
        @ExcludeMissing
        fun _routeShortName(): JsonField<String> = routeShortName

        /**
         * Returns the raw JSON value of [shapeId].
         *
         * Unlike [shapeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shapeId") @ExcludeMissing fun _shapeId(): JsonField<String> = shapeId

        /**
         * Returns the raw JSON value of [timeZone].
         *
         * Unlike [timeZone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeZone") @ExcludeMissing fun _timeZone(): JsonField<String> = timeZone

        /**
         * Returns the raw JSON value of [tripHeadsign].
         *
         * Unlike [tripHeadsign], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tripHeadsign")
        @ExcludeMissing
        fun _tripHeadsign(): JsonField<String> = tripHeadsign

        /**
         * Returns the raw JSON value of [tripShortName].
         *
         * Unlike [tripShortName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tripShortName")
        @ExcludeMissing
        fun _tripShortName(): JsonField<String> = tripShortName

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Trip].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .routeId()
             * .serviceId()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            /**
             * Sets [Builder.routeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

            /**
             * Sets [Builder.serviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceId(serviceId: JsonField<String>) = apply { this.serviceId = serviceId }

            fun blockId(blockId: String) = blockId(JsonField.of(blockId))

            /**
             * Sets [Builder.blockId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

            fun directionId(directionId: String) = directionId(JsonField.of(directionId))

            /**
             * Sets [Builder.directionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directionId(directionId: JsonField<String>) = apply {
                this.directionId = directionId
            }

            fun peakOffpeak(peakOffpeak: Long) = peakOffpeak(JsonField.of(peakOffpeak))

            /**
             * Sets [Builder.peakOffpeak] to an arbitrary JSON value.
             *
             * You should usually call [Builder.peakOffpeak] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply { this.peakOffpeak = peakOffpeak }

            fun routeShortName(routeShortName: String) =
                routeShortName(JsonField.of(routeShortName))

            /**
             * Sets [Builder.routeShortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routeShortName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routeShortName(routeShortName: JsonField<String>) = apply {
                this.routeShortName = routeShortName
            }

            fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

            /**
             * Sets [Builder.shapeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shapeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

            fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

            /**
             * Sets [Builder.timeZone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeZone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

            /**
             * Sets [Builder.tripHeadsign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tripHeadsign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                this.tripHeadsign = tripHeadsign
            }

            fun tripShortName(tripShortName: String) = tripShortName(JsonField.of(tripShortName))

            /**
             * Sets [Builder.tripShortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tripShortName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Trip].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .routeId()
             * .serviceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OnebusawaySdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (routeId.asKnown().isPresent) 1 else 0) +
                (if (serviceId.asKnown().isPresent) 1 else 0) +
                (if (blockId.asKnown().isPresent) 1 else 0) +
                (if (directionId.asKnown().isPresent) 1 else 0) +
                (if (peakOffpeak.asKnown().isPresent) 1 else 0) +
                (if (routeShortName.asKnown().isPresent) 1 else 0) +
                (if (shapeId.asKnown().isPresent) 1 else 0) +
                (if (timeZone.asKnown().isPresent) 1 else 0) +
                (if (tripHeadsign.asKnown().isPresent) 1 else 0) +
                (if (tripShortName.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is References && agencies == other.agencies && routes == other.routes && situations == other.situations && stops == other.stops && stopTimes == other.stopTimes && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(agencies, routes, situations, stops, stopTimes, trips, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "References{agencies=$agencies, routes=$routes, situations=$situations, stops=$stops, stopTimes=$stopTimes, trips=$trips, additionalProperties=$additionalProperties}"
}
