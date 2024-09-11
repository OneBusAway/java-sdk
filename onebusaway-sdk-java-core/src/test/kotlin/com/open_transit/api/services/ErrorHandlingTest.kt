// File generated from our OpenAPI spec by Stainless.

package com.open_transit.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.open_transit.api.client.OnebusawaySdkClient
import com.open_transit.api.client.okhttp.OnebusawaySdkOkHttpClient
import com.open_transit.api.core.JsonString
import com.open_transit.api.core.jsonMapper
import com.open_transit.api.errors.BadRequestException
import com.open_transit.api.errors.InternalServerException
import com.open_transit.api.errors.NotFoundException
import com.open_transit.api.errors.OnebusawaySdkError
import com.open_transit.api.errors.OnebusawaySdkException
import com.open_transit.api.errors.PermissionDeniedException
import com.open_transit.api.errors.RateLimitException
import com.open_transit.api.errors.UnauthorizedException
import com.open_transit.api.errors.UnexpectedStatusCodeException
import com.open_transit.api.errors.UnprocessableEntityException
import com.open_transit.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ONEBUSAWAY_SDK_ERROR: OnebusawaySdkError =
        OnebusawaySdkError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: OnebusawaySdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OnebusawaySdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun currentTimesRetrieve200() {
        val params = CurrentTimeRetrieveParams.builder().build()

        val expected = CurrentTimeRetrieveResponse.builder().build()

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.currentTime().retrieve(params)).isEqualTo(expected)
    }

    @Test
    fun currentTimesRetrieve400() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAY_SDK_ERROR)
            })
    }

    @Test
    fun currentTimesRetrieve401() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAY_SDK_ERROR)
            })
    }

    @Test
    fun currentTimesRetrieve403() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve404() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAY_SDK_ERROR)
            })
    }

    @Test
    fun currentTimesRetrieve422() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun currentTimesRetrieve429() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), ONEBUSAWAY_SDK_ERROR)
            })
    }

    @Test
    fun currentTimesRetrieve500() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    ONEBUSAWAY_SDK_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(ONEBUSAWAY_SDK_ERROR))
                )
        )

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(ONEBUSAWAY_SDK_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OnebusawaySdkException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = CurrentTimeRetrieveParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.currentTime().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    ImmutableListMultimap.of(),
                    OnebusawaySdkError.builder().build()
                )
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
