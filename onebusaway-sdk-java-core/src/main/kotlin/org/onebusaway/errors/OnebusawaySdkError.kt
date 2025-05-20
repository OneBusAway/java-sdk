// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import org.onebusaway.core.ExcludeMissing
import org.onebusaway.core.JsonValue
import org.onebusaway.core.NoAutoDetect
import org.onebusaway.core.immutableEmptyMap
import org.onebusaway.core.toImmutable

@NoAutoDetect
class OnebusawaySdkError
@JsonCreator
private constructor(
    @JsonAnyGetter
    @ExcludeMissing
    @JsonAnySetter
    @get:JvmName("additionalProperties")
    val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnebusawaySdkError]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onebusawaySdkError: OnebusawaySdkError) = apply {
            additionalProperties = onebusawaySdkError.additionalProperties.toMutableMap()
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

        fun build(): OnebusawaySdkError = OnebusawaySdkError(additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnebusawaySdkError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */

    override fun toString() = "OnebusawaySdkError{additionalProperties=$additionalProperties}"
}
