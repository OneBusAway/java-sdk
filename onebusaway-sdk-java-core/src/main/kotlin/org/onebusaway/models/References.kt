// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.onebusaway.core.Enum
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonField
import org.onebusaway.core.JsonMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable
import org.onebusaway.errors.OnebusawaySdkInvalidDataException

@NoAutoDetect
class References
@JsonCreator
private constructor(
    @JsonProperty("agencies")
    @ExcludeMissing
    private val agencies: JsonField<List<Agency>> = JsonMissing.of(),
    @JsonProperty("routes")
    @ExcludeMissing
    private val routes: JsonField<List<Route>> = JsonMissing.of(),
    @JsonProperty("situations")
    @ExcludeMissing
    private val situations: JsonField<List<Situation>> = JsonMissing.of(),
    @JsonProperty("stopTimes")
    @ExcludeMissing
    private val stopTimes: JsonField<List<StopTime>> = JsonMissing.of(),
    @JsonProperty("stops")
    @ExcludeMissing
    private val stops: JsonField<List<Stop>> = JsonMissing.of(),
    @JsonProperty("trips")
    @ExcludeMissing
    private val trips: JsonField<List<Trip>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun agencies(): List<Agency> = agencies.getRequired("agencies")

    fun routes(): List<Route> = routes.getRequired("routes")

    fun situations(): List<Situation> = situations.getRequired("situations")

    fun stopTimes(): List<StopTime> = stopTimes.getRequired("stopTimes")

    fun stops(): List<Stop> = stops.getRequired("stops")

    fun trips(): List<Trip> = trips.getRequired("trips")

    @JsonProperty("agencies") @ExcludeMissing fun _agencies() = agencies

    @JsonProperty("routes") @ExcludeMissing fun _routes() = routes

    @JsonProperty("situations") @ExcludeMissing fun _situations() = situations

    @JsonProperty("stopTimes") @ExcludeMissing fun _stopTimes() = stopTimes

    @JsonProperty("stops") @ExcludeMissing fun _stops() = stops

    @JsonProperty("trips") @ExcludeMissing fun _trips() = trips

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): References = apply {
        if (!validated) {
            agencies().forEach { it.validate() }
            routes().forEach { it.validate() }
            situations().forEach { it.validate() }
            stopTimes().forEach { it.validate() }
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

        private var agencies: JsonField<List<Agency>> = JsonMissing.of()
        private var routes: JsonField<List<Route>> = JsonMissing.of()
        private var situations: JsonField<List<Situation>> = JsonMissing.of()
        private var stopTimes: JsonField<List<StopTime>> = JsonMissing.of()
        private var stops: JsonField<List<Stop>> = JsonMissing.of()
        private var trips: JsonField<List<Trip>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(references: References) = apply {
            agencies = references.agencies
            routes = references.routes
            situations = references.situations
            stopTimes = references.stopTimes
            stops = references.stops
            trips = references.trips
            additionalProperties = references.additionalProperties.toMutableMap()
        }

        fun agencies(agencies: List<Agency>) = agencies(JsonField.of(agencies))

        fun agencies(agencies: JsonField<List<Agency>>) = apply { this.agencies = agencies }

        fun routes(routes: List<Route>) = routes(JsonField.of(routes))

        fun routes(routes: JsonField<List<Route>>) = apply { this.routes = routes }

        fun situations(situations: List<Situation>) = situations(JsonField.of(situations))

        fun situations(situations: JsonField<List<Situation>>) = apply {
            this.situations = situations
        }

        fun stopTimes(stopTimes: List<StopTime>) = stopTimes(JsonField.of(stopTimes))

        fun stopTimes(stopTimes: JsonField<List<StopTime>>) = apply { this.stopTimes = stopTimes }

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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): References =
            References(
                agencies.map { it.toImmutable() },
                routes.map { it.toImmutable() },
                situations.map { it.toImmutable() },
                stopTimes.map { it.toImmutable() },
                stops.map { it.toImmutable() },
                trips.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Agency
    @JsonCreator
    private constructor(
        @JsonProperty("disclaimer")
        @ExcludeMissing
        private val disclaimer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fareUrl")
        @ExcludeMissing
        private val fareUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lang")
        @ExcludeMissing
        private val lang: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        private val phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("privateService")
        @ExcludeMissing
        private val privateService: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timezone")
        @ExcludeMissing
        private val timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun disclaimer(): Optional<String> =
            Optional.ofNullable(disclaimer.getNullable("disclaimer"))

        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        fun fareUrl(): Optional<String> = Optional.ofNullable(fareUrl.getNullable("fareUrl"))

        fun id(): String = id.getRequired("id")

        fun lang(): Optional<String> = Optional.ofNullable(lang.getNullable("lang"))

        fun name(): String = name.getRequired("name")

        fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

        fun privateService(): Optional<Boolean> =
            Optional.ofNullable(privateService.getNullable("privateService"))

        fun timezone(): String = timezone.getRequired("timezone")

        fun url(): String = url.getRequired("url")

        @JsonProperty("disclaimer") @ExcludeMissing fun _disclaimer() = disclaimer

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonProperty("fareUrl") @ExcludeMissing fun _fareUrl() = fareUrl

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        @JsonProperty("privateService") @ExcludeMissing fun _privateService() = privateService

        @JsonProperty("timezone") @ExcludeMissing fun _timezone() = timezone

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Agency = apply {
            if (!validated) {
                disclaimer()
                email()
                fareUrl()
                id()
                lang()
                name()
                phone()
                privateService()
                timezone()
                url()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var disclaimer: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fareUrl: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var lang: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var privateService: JsonField<Boolean> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agency: Agency) = apply {
                disclaimer = agency.disclaimer
                email = agency.email
                fareUrl = agency.fareUrl
                id = agency.id
                lang = agency.lang
                name = agency.name
                phone = agency.phone
                privateService = agency.privateService
                timezone = agency.timezone
                url = agency.url
                additionalProperties = agency.additionalProperties.toMutableMap()
            }

            fun disclaimer(disclaimer: String) = disclaimer(JsonField.of(disclaimer))

            fun disclaimer(disclaimer: JsonField<String>) = apply { this.disclaimer = disclaimer }

            fun email(email: String) = email(JsonField.of(email))

            fun email(email: JsonField<String>) = apply { this.email = email }

            fun fareUrl(fareUrl: String) = fareUrl(JsonField.of(fareUrl))

            fun fareUrl(fareUrl: JsonField<String>) = apply { this.fareUrl = fareUrl }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun lang(lang: String) = lang(JsonField.of(lang))

            fun lang(lang: JsonField<String>) = apply { this.lang = lang }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun phone(phone: String) = phone(JsonField.of(phone))

            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            fun privateService(privateService: Boolean) =
                privateService(JsonField.of(privateService))

            fun privateService(privateService: JsonField<Boolean>) = apply {
                this.privateService = privateService
            }

            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            fun url(url: String) = url(JsonField.of(url))

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

            fun build(): Agency =
                Agency(
                    disclaimer,
                    email,
                    fareUrl,
                    id,
                    lang,
                    name,
                    phone,
                    privateService,
                    timezone,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Agency && disclaimer == other.disclaimer && email == other.email && fareUrl == other.fareUrl && id == other.id && lang == other.lang && name == other.name && phone == other.phone && privateService == other.privateService && timezone == other.timezone && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(disclaimer, email, fareUrl, id, lang, name, phone, privateService, timezone, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agency{disclaimer=$disclaimer, email=$email, fareUrl=$fareUrl, id=$id, lang=$lang, name=$name, phone=$phone, privateService=$privateService, timezone=$timezone, url=$url, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Route
    @JsonCreator
    private constructor(
        @JsonProperty("agencyId")
        @ExcludeMissing
        private val agencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("color")
        @ExcludeMissing
        private val color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("longName")
        @ExcludeMissing
        private val longName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nullSafeShortName")
        @ExcludeMissing
        private val nullSafeShortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shortName")
        @ExcludeMissing
        private val shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("textColor")
        @ExcludeMissing
        private val textColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun agencyId(): String = agencyId.getRequired("agencyId")

        fun color(): Optional<String> = Optional.ofNullable(color.getNullable("color"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun id(): String = id.getRequired("id")

        fun longName(): Optional<String> = Optional.ofNullable(longName.getNullable("longName"))

        fun nullSafeShortName(): Optional<String> =
            Optional.ofNullable(nullSafeShortName.getNullable("nullSafeShortName"))

        fun shortName(): Optional<String> = Optional.ofNullable(shortName.getNullable("shortName"))

        fun textColor(): Optional<String> = Optional.ofNullable(textColor.getNullable("textColor"))

        fun type(): Long = type.getRequired("type")

        fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

        @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

        @JsonProperty("color") @ExcludeMissing fun _color() = color

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("longName") @ExcludeMissing fun _longName() = longName

        @JsonProperty("nullSafeShortName")
        @ExcludeMissing
        fun _nullSafeShortName() = nullSafeShortName

        @JsonProperty("shortName") @ExcludeMissing fun _shortName() = shortName

        @JsonProperty("textColor") @ExcludeMissing fun _textColor() = textColor

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Route = apply {
            if (!validated) {
                agencyId()
                color()
                description()
                id()
                longName()
                nullSafeShortName()
                shortName()
                textColor()
                type()
                url()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var agencyId: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var longName: JsonField<String> = JsonMissing.of()
            private var nullSafeShortName: JsonField<String> = JsonMissing.of()
            private var shortName: JsonField<String> = JsonMissing.of()
            private var textColor: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(route: Route) = apply {
                agencyId = route.agencyId
                color = route.color
                description = route.description
                id = route.id
                longName = route.longName
                nullSafeShortName = route.nullSafeShortName
                shortName = route.shortName
                textColor = route.textColor
                type = route.type
                url = route.url
                additionalProperties = route.additionalProperties.toMutableMap()
            }

            fun agencyId(agencyId: String) = agencyId(JsonField.of(agencyId))

            fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

            fun color(color: String) = color(JsonField.of(color))

            fun color(color: JsonField<String>) = apply { this.color = color }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun longName(longName: String) = longName(JsonField.of(longName))

            fun longName(longName: JsonField<String>) = apply { this.longName = longName }

            fun nullSafeShortName(nullSafeShortName: String) =
                nullSafeShortName(JsonField.of(nullSafeShortName))

            fun nullSafeShortName(nullSafeShortName: JsonField<String>) = apply {
                this.nullSafeShortName = nullSafeShortName
            }

            fun shortName(shortName: String) = shortName(JsonField.of(shortName))

            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

            fun textColor(textColor: String) = textColor(JsonField.of(textColor))

            fun textColor(textColor: JsonField<String>) = apply { this.textColor = textColor }

            fun type(type: Long) = type(JsonField.of(type))

            fun type(type: JsonField<Long>) = apply { this.type = type }

            fun url(url: String) = url(JsonField.of(url))

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

            fun build(): Route =
                Route(
                    agencyId,
                    color,
                    description,
                    id,
                    longName,
                    nullSafeShortName,
                    shortName,
                    textColor,
                    type,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Route && agencyId == other.agencyId && color == other.color && description == other.description && id == other.id && longName == other.longName && nullSafeShortName == other.nullSafeShortName && shortName == other.shortName && textColor == other.textColor && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(agencyId, color, description, id, longName, nullSafeShortName, shortName, textColor, type, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Route{agencyId=$agencyId, color=$color, description=$description, id=$id, longName=$longName, nullSafeShortName=$nullSafeShortName, shortName=$shortName, textColor=$textColor, type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Situation
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creationTime")
        @ExcludeMissing
        private val creationTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("summary")
        @ExcludeMissing
        private val summary: JsonField<Summary> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<Description> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<Url> = JsonMissing.of(),
        @JsonProperty("activeWindows")
        @ExcludeMissing
        private val activeWindows: JsonField<List<ActiveWindow>> = JsonMissing.of(),
        @JsonProperty("allAffects")
        @ExcludeMissing
        private val allAffects: JsonField<List<AllAffect>> = JsonMissing.of(),
        @JsonProperty("consequences")
        @ExcludeMissing
        private val consequences: JsonField<List<Consequence>> = JsonMissing.of(),
        @JsonProperty("publicationWindows")
        @ExcludeMissing
        private val publicationWindows: JsonField<List<PublicationWindow>> = JsonMissing.of(),
        @JsonProperty("severity")
        @ExcludeMissing
        private val severity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consequenceMessage")
        @ExcludeMissing
        private val consequenceMessage: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique identifier for the situation. */
        fun id(): String = id.getRequired("id")

        /** Unix timestamp of when this situation was created. */
        fun creationTime(): Long = creationTime.getRequired("creationTime")

        /** Reason for the service alert, taken from TPEG codes. */
        fun reason(): Optional<Reason> = Optional.ofNullable(reason.getNullable("reason"))

        fun summary(): Optional<Summary> = Optional.ofNullable(summary.getNullable("summary"))

        fun description(): Optional<Description> =
            Optional.ofNullable(description.getNullable("description"))

        fun url(): Optional<Url> = Optional.ofNullable(url.getNullable("url"))

        fun activeWindows(): Optional<List<ActiveWindow>> =
            Optional.ofNullable(activeWindows.getNullable("activeWindows"))

        fun allAffects(): Optional<List<AllAffect>> =
            Optional.ofNullable(allAffects.getNullable("allAffects"))

        fun consequences(): Optional<List<Consequence>> =
            Optional.ofNullable(consequences.getNullable("consequences"))

        fun publicationWindows(): Optional<List<PublicationWindow>> =
            Optional.ofNullable(publicationWindows.getNullable("publicationWindows"))

        /** Severity of the situation. */
        fun severity(): Optional<String> = Optional.ofNullable(severity.getNullable("severity"))

        /** Message regarding the consequence of the situation. */
        fun consequenceMessage(): Optional<String> =
            Optional.ofNullable(consequenceMessage.getNullable("consequenceMessage"))

        /** Unique identifier for the situation. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Unix timestamp of when this situation was created. */
        @JsonProperty("creationTime") @ExcludeMissing fun _creationTime() = creationTime

        /** Reason for the service alert, taken from TPEG codes. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("summary") @ExcludeMissing fun _summary() = summary

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonProperty("activeWindows") @ExcludeMissing fun _activeWindows() = activeWindows

        @JsonProperty("allAffects") @ExcludeMissing fun _allAffects() = allAffects

        @JsonProperty("consequences") @ExcludeMissing fun _consequences() = consequences

        @JsonProperty("publicationWindows")
        @ExcludeMissing
        fun _publicationWindows() = publicationWindows

        /** Severity of the situation. */
        @JsonProperty("severity") @ExcludeMissing fun _severity() = severity

        /** Message regarding the consequence of the situation. */
        @JsonProperty("consequenceMessage")
        @ExcludeMissing
        fun _consequenceMessage() = consequenceMessage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Situation = apply {
            if (!validated) {
                id()
                creationTime()
                reason()
                summary().map { it.validate() }
                description().map { it.validate() }
                url().map { it.validate() }
                activeWindows().map { it.forEach { it.validate() } }
                allAffects().map { it.forEach { it.validate() } }
                consequences().map { it.forEach { it.validate() } }
                publicationWindows().map { it.forEach { it.validate() } }
                severity()
                consequenceMessage()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var creationTime: JsonField<Long> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var description: JsonField<Description> = JsonMissing.of()
            private var url: JsonField<Url> = JsonMissing.of()
            private var activeWindows: JsonField<List<ActiveWindow>> = JsonMissing.of()
            private var allAffects: JsonField<List<AllAffect>> = JsonMissing.of()
            private var consequences: JsonField<List<Consequence>> = JsonMissing.of()
            private var publicationWindows: JsonField<List<PublicationWindow>> = JsonMissing.of()
            private var severity: JsonField<String> = JsonMissing.of()
            private var consequenceMessage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(situation: Situation) = apply {
                id = situation.id
                creationTime = situation.creationTime
                reason = situation.reason
                summary = situation.summary
                description = situation.description
                url = situation.url
                activeWindows = situation.activeWindows
                allAffects = situation.allAffects
                consequences = situation.consequences
                publicationWindows = situation.publicationWindows
                severity = situation.severity
                consequenceMessage = situation.consequenceMessage
                additionalProperties = situation.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the situation. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the situation. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Unix timestamp of when this situation was created. */
            fun creationTime(creationTime: Long) = creationTime(JsonField.of(creationTime))

            /** Unix timestamp of when this situation was created. */
            fun creationTime(creationTime: JsonField<Long>) = apply {
                this.creationTime = creationTime
            }

            /** Reason for the service alert, taken from TPEG codes. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Reason for the service alert, taken from TPEG codes. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            fun description(description: Description) = description(JsonField.of(description))

            fun description(description: JsonField<Description>) = apply {
                this.description = description
            }

            fun url(url: Url) = url(JsonField.of(url))

            fun url(url: JsonField<Url>) = apply { this.url = url }

            fun activeWindows(activeWindows: List<ActiveWindow>) =
                activeWindows(JsonField.of(activeWindows))

            fun activeWindows(activeWindows: JsonField<List<ActiveWindow>>) = apply {
                this.activeWindows = activeWindows
            }

            fun allAffects(allAffects: List<AllAffect>) = allAffects(JsonField.of(allAffects))

            fun allAffects(allAffects: JsonField<List<AllAffect>>) = apply {
                this.allAffects = allAffects
            }

            fun consequences(consequences: List<Consequence>) =
                consequences(JsonField.of(consequences))

            fun consequences(consequences: JsonField<List<Consequence>>) = apply {
                this.consequences = consequences
            }

            fun publicationWindows(publicationWindows: List<PublicationWindow>) =
                publicationWindows(JsonField.of(publicationWindows))

            fun publicationWindows(publicationWindows: JsonField<List<PublicationWindow>>) = apply {
                this.publicationWindows = publicationWindows
            }

            /** Severity of the situation. */
            fun severity(severity: String) = severity(JsonField.of(severity))

            /** Severity of the situation. */
            fun severity(severity: JsonField<String>) = apply { this.severity = severity }

            /** Message regarding the consequence of the situation. */
            fun consequenceMessage(consequenceMessage: String) =
                consequenceMessage(JsonField.of(consequenceMessage))

            /** Message regarding the consequence of the situation. */
            fun consequenceMessage(consequenceMessage: JsonField<String>) = apply {
                this.consequenceMessage = consequenceMessage
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

            fun build(): Situation =
                Situation(
                    id,
                    creationTime,
                    reason,
                    summary,
                    description,
                    url,
                    activeWindows.map { it.toImmutable() },
                    allAffects.map { it.toImmutable() },
                    consequences.map { it.toImmutable() },
                    publicationWindows.map { it.toImmutable() },
                    severity,
                    consequenceMessage,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ActiveWindow
        @JsonCreator
        private constructor(
            @JsonProperty("from")
            @ExcludeMissing
            private val from: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing private val to: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Start time of the active window as a Unix timestamp. */
            fun from(): Optional<Long> = Optional.ofNullable(from.getNullable("from"))

            /** End time of the active window as a Unix timestamp. */
            fun to(): Optional<Long> = Optional.ofNullable(to.getNullable("to"))

            /** Start time of the active window as a Unix timestamp. */
            @JsonProperty("from") @ExcludeMissing fun _from() = from

            /** End time of the active window as a Unix timestamp. */
            @JsonProperty("to") @ExcludeMissing fun _to() = to

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ActiveWindow = apply {
                if (!validated) {
                    from()
                    to()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** Start time of the active window as a Unix timestamp. */
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the active window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /** End time of the active window as a Unix timestamp. */
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

                fun build(): ActiveWindow =
                    ActiveWindow(
                        from,
                        to,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class AllAffect
        @JsonCreator
        private constructor(
            @JsonProperty("agencyId")
            @ExcludeMissing
            private val agencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicationId")
            @ExcludeMissing
            private val applicationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("directionId")
            @ExcludeMissing
            private val directionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routeId")
            @ExcludeMissing
            private val routeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stopId")
            @ExcludeMissing
            private val stopId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tripId")
            @ExcludeMissing
            private val tripId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Identifier for the agency. */
            fun agencyId(): Optional<String> = Optional.ofNullable(agencyId.getNullable("agencyId"))

            /** Identifier for the application. */
            fun applicationId(): Optional<String> =
                Optional.ofNullable(applicationId.getNullable("applicationId"))

            /** Identifier for the direction. */
            fun directionId(): Optional<String> =
                Optional.ofNullable(directionId.getNullable("directionId"))

            /** Identifier for the route. */
            fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("routeId"))

            /** Identifier for the stop. */
            fun stopId(): Optional<String> = Optional.ofNullable(stopId.getNullable("stopId"))

            /** Identifier for the trip. */
            fun tripId(): Optional<String> = Optional.ofNullable(tripId.getNullable("tripId"))

            /** Identifier for the agency. */
            @JsonProperty("agencyId") @ExcludeMissing fun _agencyId() = agencyId

            /** Identifier for the application. */
            @JsonProperty("applicationId") @ExcludeMissing fun _applicationId() = applicationId

            /** Identifier for the direction. */
            @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

            /** Identifier for the route. */
            @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

            /** Identifier for the stop. */
            @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

            /** Identifier for the trip. */
            @JsonProperty("tripId") @ExcludeMissing fun _tripId() = tripId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AllAffect = apply {
                if (!validated) {
                    agencyId()
                    applicationId()
                    directionId()
                    routeId()
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

                /** Identifier for the agency. */
                fun agencyId(agencyId: JsonField<String>) = apply { this.agencyId = agencyId }

                /** Identifier for the application. */
                fun applicationId(applicationId: String) =
                    applicationId(JsonField.of(applicationId))

                /** Identifier for the application. */
                fun applicationId(applicationId: JsonField<String>) = apply {
                    this.applicationId = applicationId
                }

                /** Identifier for the direction. */
                fun directionId(directionId: String) = directionId(JsonField.of(directionId))

                /** Identifier for the direction. */
                fun directionId(directionId: JsonField<String>) = apply {
                    this.directionId = directionId
                }

                /** Identifier for the route. */
                fun routeId(routeId: String) = routeId(JsonField.of(routeId))

                /** Identifier for the route. */
                fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

                /** Identifier for the stop. */
                fun stopId(stopId: String) = stopId(JsonField.of(stopId))

                /** Identifier for the stop. */
                fun stopId(stopId: JsonField<String>) = apply { this.stopId = stopId }

                /** Identifier for the trip. */
                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /** Identifier for the trip. */
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

                fun build(): AllAffect =
                    AllAffect(
                        agencyId,
                        applicationId,
                        directionId,
                        routeId,
                        stopId,
                        tripId,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Consequence
        @JsonCreator
        private constructor(
            @JsonProperty("condition")
            @ExcludeMissing
            private val condition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conditionDetails")
            @ExcludeMissing
            private val conditionDetails: JsonField<ConditionDetails> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Condition of the consequence. */
            fun condition(): Optional<String> =
                Optional.ofNullable(condition.getNullable("condition"))

            fun conditionDetails(): Optional<ConditionDetails> =
                Optional.ofNullable(conditionDetails.getNullable("conditionDetails"))

            /** Condition of the consequence. */
            @JsonProperty("condition") @ExcludeMissing fun _condition() = condition

            @JsonProperty("conditionDetails")
            @ExcludeMissing
            fun _conditionDetails() = conditionDetails

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Consequence = apply {
                if (!validated) {
                    condition()
                    conditionDetails().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** Condition of the consequence. */
                fun condition(condition: JsonField<String>) = apply { this.condition = condition }

                fun conditionDetails(conditionDetails: ConditionDetails) =
                    conditionDetails(JsonField.of(conditionDetails))

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

                fun build(): Consequence =
                    Consequence(
                        condition,
                        conditionDetails,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ConditionDetails
            @JsonCreator
            private constructor(
                @JsonProperty("diversionPath")
                @ExcludeMissing
                private val diversionPath: JsonField<DiversionPath> = JsonMissing.of(),
                @JsonProperty("diversionStopIds")
                @ExcludeMissing
                private val diversionStopIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun diversionPath(): Optional<DiversionPath> =
                    Optional.ofNullable(diversionPath.getNullable("diversionPath"))

                fun diversionStopIds(): Optional<List<String>> =
                    Optional.ofNullable(diversionStopIds.getNullable("diversionStopIds"))

                @JsonProperty("diversionPath") @ExcludeMissing fun _diversionPath() = diversionPath

                @JsonProperty("diversionStopIds")
                @ExcludeMissing
                fun _diversionStopIds() = diversionStopIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ConditionDetails = apply {
                    if (!validated) {
                        diversionPath().map { it.validate() }
                        diversionStopIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var diversionPath: JsonField<DiversionPath> = JsonMissing.of()
                    private var diversionStopIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(conditionDetails: ConditionDetails) = apply {
                        diversionPath = conditionDetails.diversionPath
                        diversionStopIds = conditionDetails.diversionStopIds
                        additionalProperties = conditionDetails.additionalProperties.toMutableMap()
                    }

                    fun diversionPath(diversionPath: DiversionPath) =
                        diversionPath(JsonField.of(diversionPath))

                    fun diversionPath(diversionPath: JsonField<DiversionPath>) = apply {
                        this.diversionPath = diversionPath
                    }

                    fun diversionStopIds(diversionStopIds: List<String>) =
                        diversionStopIds(JsonField.of(diversionStopIds))

                    fun diversionStopIds(diversionStopIds: JsonField<List<String>>) = apply {
                        this.diversionStopIds = diversionStopIds
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

                    fun build(): ConditionDetails =
                        ConditionDetails(
                            diversionPath,
                            diversionStopIds.map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class DiversionPath
                @JsonCreator
                private constructor(
                    @JsonProperty("length")
                    @ExcludeMissing
                    private val length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("levels")
                    @ExcludeMissing
                    private val levels: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("points")
                    @ExcludeMissing
                    private val points: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Length of the diversion path. */
                    fun length(): Optional<Long> = Optional.ofNullable(length.getNullable("length"))

                    /** Levels of the diversion path. */
                    fun levels(): Optional<String> =
                        Optional.ofNullable(levels.getNullable("levels"))

                    /** Points of the diversion path. */
                    fun points(): Optional<String> =
                        Optional.ofNullable(points.getNullable("points"))

                    /** Length of the diversion path. */
                    @JsonProperty("length") @ExcludeMissing fun _length() = length

                    /** Levels of the diversion path. */
                    @JsonProperty("levels") @ExcludeMissing fun _levels() = levels

                    /** Points of the diversion path. */
                    @JsonProperty("points") @ExcludeMissing fun _points() = points

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): DiversionPath = apply {
                        if (!validated) {
                            length()
                            levels()
                            points()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

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

                        /** Length of the diversion path. */
                        fun length(length: JsonField<Long>) = apply { this.length = length }

                        /** Levels of the diversion path. */
                        fun levels(levels: String) = levels(JsonField.of(levels))

                        /** Levels of the diversion path. */
                        fun levels(levels: JsonField<String>) = apply { this.levels = levels }

                        /** Points of the diversion path. */
                        fun points(points: String) = points(JsonField.of(points))

                        /** Points of the diversion path. */
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

                        fun build(): DiversionPath =
                            DiversionPath(
                                length,
                                levels,
                                points,
                                additionalProperties.toImmutable(),
                            )
                    }

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

        @NoAutoDetect
        class Description
        @JsonCreator
        private constructor(
            @JsonProperty("lang")
            @ExcludeMissing
            private val lang: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Language of the description. */
            fun lang(): Optional<String> = Optional.ofNullable(lang.getNullable("lang"))

            /** Longer description of the situation. */
            fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

            /** Language of the description. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** Longer description of the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Description = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** Language of the description. */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Longer description of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** Longer description of the situation. */
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

                fun build(): Description =
                    Description(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class PublicationWindow
        @JsonCreator
        private constructor(
            @JsonProperty("from")
            @ExcludeMissing
            private val from: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing private val to: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Start time of the time window as a Unix timestamp. */
            fun from(): Long = from.getRequired("from")

            /** End time of the time window as a Unix timestamp. */
            fun to(): Long = to.getRequired("to")

            /** Start time of the time window as a Unix timestamp. */
            @JsonProperty("from") @ExcludeMissing fun _from() = from

            /** End time of the time window as a Unix timestamp. */
            @JsonProperty("to") @ExcludeMissing fun _to() = to

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PublicationWindow = apply {
                if (!validated) {
                    from()
                    to()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var from: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(publicationWindow: PublicationWindow) = apply {
                    from = publicationWindow.from
                    to = publicationWindow.to
                    additionalProperties = publicationWindow.additionalProperties.toMutableMap()
                }

                /** Start time of the time window as a Unix timestamp. */
                fun from(from: Long) = from(JsonField.of(from))

                /** Start time of the time window as a Unix timestamp. */
                fun from(from: JsonField<Long>) = apply { this.from = from }

                /** End time of the time window as a Unix timestamp. */
                fun to(to: Long) = to(JsonField.of(to))

                /** End time of the time window as a Unix timestamp. */
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

                fun build(): PublicationWindow =
                    PublicationWindow(
                        from,
                        to,
                        additionalProperties.toImmutable(),
                    )
            }

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

        class Reason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EQUIPMENT_REASON = of("equipmentReason")

                @JvmField val ENVIRONMENT_REASON = of("environmentReason")

                @JvmField val PERSONNEL_REASON = of("personnelReason")

                @JvmField val MISCELLANEOUS_REASON = of("miscellaneousReason")

                @JvmField val SECURITY_ALERT = of("securityAlert")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
            }

            enum class Value {
                EQUIPMENT_REASON,
                ENVIRONMENT_REASON,
                PERSONNEL_REASON,
                MISCELLANEOUS_REASON,
                SECURITY_ALERT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EQUIPMENT_REASON -> Value.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Value.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Value.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Value.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Value.SECURITY_ALERT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EQUIPMENT_REASON -> Known.EQUIPMENT_REASON
                    ENVIRONMENT_REASON -> Known.ENVIRONMENT_REASON
                    PERSONNEL_REASON -> Known.PERSONNEL_REASON
                    MISCELLANEOUS_REASON -> Known.MISCELLANEOUS_REASON
                    SECURITY_ALERT -> Known.SECURITY_ALERT
                    else -> throw OnebusawaySdkInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Summary
        @JsonCreator
        private constructor(
            @JsonProperty("lang")
            @ExcludeMissing
            private val lang: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Language of the summary. */
            fun lang(): Optional<String> = Optional.ofNullable(lang.getNullable("lang"))

            /** Short summary of the situation. */
            fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

            /** Language of the summary. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** Short summary of the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** Language of the summary. */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** Short summary of the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** Short summary of the situation. */
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

                fun build(): Summary =
                    Summary(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class Url
        @JsonCreator
        private constructor(
            @JsonProperty("lang")
            @ExcludeMissing
            private val lang: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Language of the URL. */
            fun lang(): Optional<String> = Optional.ofNullable(lang.getNullable("lang"))

            /** URL for more information about the situation. */
            fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

            /** Language of the URL. */
            @JsonProperty("lang") @ExcludeMissing fun _lang() = lang

            /** URL for more information about the situation. */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Url = apply {
                if (!validated) {
                    lang()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

                /** Language of the URL. */
                fun lang(lang: JsonField<String>) = apply { this.lang = lang }

                /** URL for more information about the situation. */
                fun value(value: String) = value(JsonField.of(value))

                /** URL for more information about the situation. */
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

                fun build(): Url =
                    Url(
                        lang,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

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

            return /* spotless:off */ other is Situation && id == other.id && creationTime == other.creationTime && reason == other.reason && summary == other.summary && description == other.description && url == other.url && activeWindows == other.activeWindows && allAffects == other.allAffects && consequences == other.consequences && publicationWindows == other.publicationWindows && severity == other.severity && consequenceMessage == other.consequenceMessage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creationTime, reason, summary, description, url, activeWindows, allAffects, consequences, publicationWindows, severity, consequenceMessage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Situation{id=$id, creationTime=$creationTime, reason=$reason, summary=$summary, description=$description, url=$url, activeWindows=$activeWindows, allAffects=$allAffects, consequences=$consequences, publicationWindows=$publicationWindows, severity=$severity, consequenceMessage=$consequenceMessage, additionalProperties=$additionalProperties}"
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
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("locationType")
        @ExcludeMissing
        private val locationType: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double> = JsonMissing.of(),
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

        fun direction(): Optional<String> = Optional.ofNullable(direction.getNullable("direction"))

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

        @JsonProperty("staticRouteIds") @ExcludeMissing fun _staticRouteIds() = staticRouteIds

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

            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

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

            fun routeIds(routeIds: JsonField<List<String>>) = apply { this.routeIds = routeIds }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
    class StopTime
    @JsonCreator
    private constructor(
        @JsonProperty("arrivalTime")
        @ExcludeMissing
        private val arrivalTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("departureTime")
        @ExcludeMissing
        private val departureTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("distanceAlongTrip")
        @ExcludeMissing
        private val distanceAlongTrip: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("historicalOccupancy")
        @ExcludeMissing
        private val historicalOccupancy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stopHeadsign")
        @ExcludeMissing
        private val stopHeadsign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stopId")
        @ExcludeMissing
        private val stopId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun arrivalTime(): Optional<Long> =
            Optional.ofNullable(arrivalTime.getNullable("arrivalTime"))

        fun departureTime(): Optional<Long> =
            Optional.ofNullable(departureTime.getNullable("departureTime"))

        fun distanceAlongTrip(): Optional<Double> =
            Optional.ofNullable(distanceAlongTrip.getNullable("distanceAlongTrip"))

        fun historicalOccupancy(): Optional<String> =
            Optional.ofNullable(historicalOccupancy.getNullable("historicalOccupancy"))

        fun stopHeadsign(): Optional<String> =
            Optional.ofNullable(stopHeadsign.getNullable("stopHeadsign"))

        fun stopId(): Optional<String> = Optional.ofNullable(stopId.getNullable("stopId"))

        @JsonProperty("arrivalTime") @ExcludeMissing fun _arrivalTime() = arrivalTime

        @JsonProperty("departureTime") @ExcludeMissing fun _departureTime() = departureTime

        @JsonProperty("distanceAlongTrip")
        @ExcludeMissing
        fun _distanceAlongTrip() = distanceAlongTrip

        @JsonProperty("historicalOccupancy")
        @ExcludeMissing
        fun _historicalOccupancy() = historicalOccupancy

        @JsonProperty("stopHeadsign") @ExcludeMissing fun _stopHeadsign() = stopHeadsign

        @JsonProperty("stopId") @ExcludeMissing fun _stopId() = stopId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StopTime = apply {
            if (!validated) {
                arrivalTime()
                departureTime()
                distanceAlongTrip()
                historicalOccupancy()
                stopHeadsign()
                stopId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun arrivalTime(arrivalTime: JsonField<Long>) = apply { this.arrivalTime = arrivalTime }

            fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

            fun departureTime(departureTime: JsonField<Long>) = apply {
                this.departureTime = departureTime
            }

            fun distanceAlongTrip(distanceAlongTrip: Double) =
                distanceAlongTrip(JsonField.of(distanceAlongTrip))

            fun distanceAlongTrip(distanceAlongTrip: JsonField<Double>) = apply {
                this.distanceAlongTrip = distanceAlongTrip
            }

            fun historicalOccupancy(historicalOccupancy: String) =
                historicalOccupancy(JsonField.of(historicalOccupancy))

            fun historicalOccupancy(historicalOccupancy: JsonField<String>) = apply {
                this.historicalOccupancy = historicalOccupancy
            }

            fun stopHeadsign(stopHeadsign: String) = stopHeadsign(JsonField.of(stopHeadsign))

            fun stopHeadsign(stopHeadsign: JsonField<String>) = apply {
                this.stopHeadsign = stopHeadsign
            }

            fun stopId(stopId: String) = stopId(JsonField.of(stopId))

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

            fun build(): StopTime =
                StopTime(
                    arrivalTime,
                    departureTime,
                    distanceAlongTrip,
                    historicalOccupancy,
                    stopHeadsign,
                    stopId,
                    additionalProperties.toImmutable(),
                )
        }

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
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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

        fun blockId(): Optional<String> = Optional.ofNullable(blockId.getNullable("blockId"))

        fun directionId(): Optional<String> =
            Optional.ofNullable(directionId.getNullable("directionId"))

        fun id(): String = id.getRequired("id")

        fun peakOffpeak(): Optional<Long> =
            Optional.ofNullable(peakOffpeak.getNullable("peakOffpeak"))

        fun routeId(): String = routeId.getRequired("routeId")

        fun routeShortName(): Optional<String> =
            Optional.ofNullable(routeShortName.getNullable("routeShortName"))

        fun serviceId(): String = serviceId.getRequired("serviceId")

        fun shapeId(): Optional<String> = Optional.ofNullable(shapeId.getNullable("shapeId"))

        fun timeZone(): Optional<String> = Optional.ofNullable(timeZone.getNullable("timeZone"))

        fun tripHeadsign(): Optional<String> =
            Optional.ofNullable(tripHeadsign.getNullable("tripHeadsign"))

        fun tripShortName(): Optional<String> =
            Optional.ofNullable(tripShortName.getNullable("tripShortName"))

        @JsonProperty("blockId") @ExcludeMissing fun _blockId() = blockId

        @JsonProperty("directionId") @ExcludeMissing fun _directionId() = directionId

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("peakOffpeak") @ExcludeMissing fun _peakOffpeak() = peakOffpeak

        @JsonProperty("routeId") @ExcludeMissing fun _routeId() = routeId

        @JsonProperty("routeShortName") @ExcludeMissing fun _routeShortName() = routeShortName

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

            fun peakOffpeak(peakOffpeak: JsonField<Long>) = apply { this.peakOffpeak = peakOffpeak }

            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

            fun routeShortName(routeShortName: String) =
                routeShortName(JsonField.of(routeShortName))

            fun routeShortName(routeShortName: JsonField<String>) = apply {
                this.routeShortName = routeShortName
            }

            fun serviceId(serviceId: String) = serviceId(JsonField.of(serviceId))

            fun serviceId(serviceId: JsonField<String>) = apply { this.serviceId = serviceId }

            fun shapeId(shapeId: String) = shapeId(JsonField.of(shapeId))

            fun shapeId(shapeId: JsonField<String>) = apply { this.shapeId = shapeId }

            fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            fun tripHeadsign(tripHeadsign: String) = tripHeadsign(JsonField.of(tripHeadsign))

            fun tripHeadsign(tripHeadsign: JsonField<String>) = apply {
                this.tripHeadsign = tripHeadsign
            }

            fun tripShortName(tripShortName: String) = tripShortName(JsonField.of(tripShortName))

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

        return /* spotless:off */ other is References && agencies == other.agencies && routes == other.routes && situations == other.situations && stopTimes == other.stopTimes && stops == other.stops && trips == other.trips && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(agencies, routes, situations, stopTimes, stops, trips, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "References{agencies=$agencies, routes=$routes, situations=$situations, stopTimes=$stopTimes, stops=$stops, trips=$trips, additionalProperties=$additionalProperties}"
}
