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

@JsonDeserialize(builder = ResponseWrapper.Builder::class)
@NoAutoDetect
class ResponseWrapper private constructor(
  private val code: JsonField<Long>,
  private val currentTime: JsonField<Long>,
  private val text: JsonField<String>,
  private val version: JsonField<Long>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun code(): Long = code.getRequired("code")

    fun currentTime(): Long = currentTime.getRequired("currentTime")

    fun text(): String = text.getRequired("text")

    fun version(): Long = version.getRequired("version")

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ResponseWrapper = apply {
        if (!validated) {
          code()
          currentTime()
          text()
          version()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ResponseWrapper &&
          this.code == other.code &&
          this.currentTime == other.currentTime &&
          this.text == other.text &&
          this.version == other.version &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            code,
            currentTime,
            text,
            version,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "ResponseWrapper{code=$code, currentTime=$currentTime, text=$text, version=$version, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var code: JsonField<Long> = JsonMissing.of()
        private var currentTime: JsonField<Long> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responseWrapper: ResponseWrapper) = apply {
            this.code = responseWrapper.code
            this.currentTime = responseWrapper.currentTime
            this.text = responseWrapper.text
            this.version = responseWrapper.version
            additionalProperties(responseWrapper.additionalProperties)
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

        fun build(): ResponseWrapper = ResponseWrapper(
            code,
            currentTime,
            text,
            version,
            additionalProperties.toUnmodifiable(),
        )
    }
}
