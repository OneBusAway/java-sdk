// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.models.scheduleforroute

import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.onebusaway.core.Params
import org.onebusaway.core.http.Headers
import org.onebusaway.core.http.QueryParams

/** Retrieve the full schedule for a route on a particular day */
class ScheduleForRouteRetrieveParams
private constructor(
    private val routeId: String?,
    private val date: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    /**
     * The date for which you want to request a schedule in the format YYYY-MM-DD (optional,
     * defaults to current date)
     */
    fun date(): Optional<LocalDate> = Optional.ofNullable(date)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScheduleForRouteRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScheduleForRouteRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduleForRouteRetrieveParams]. */
    class Builder internal constructor() {

        private var routeId: String? = null
        private var date: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scheduleForRouteRetrieveParams: ScheduleForRouteRetrieveParams) = apply {
            routeId = scheduleForRouteRetrieveParams.routeId
            date = scheduleForRouteRetrieveParams.date
            additionalHeaders = scheduleForRouteRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = scheduleForRouteRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String?) = apply { this.routeId = routeId }

        /** Alias for calling [Builder.routeId] with `routeId.orElse(null)`. */
        fun routeId(routeId: Optional<String>) = routeId(routeId.getOrNull())

        /**
         * The date for which you want to request a schedule in the format YYYY-MM-DD (optional,
         * defaults to current date)
         */
        fun date(date: LocalDate?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<LocalDate>) = date(date.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ScheduleForRouteRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScheduleForRouteRetrieveParams =
            ScheduleForRouteRetrieveParams(
                routeId,
                date,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> routeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                date?.let { put("date", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduleForRouteRetrieveParams && routeId == other.routeId && date == other.date && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, date, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScheduleForRouteRetrieveParams{routeId=$routeId, date=$date, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
