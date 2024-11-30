// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.onebusaway.client.OnebusawaySdkClient
import org.onebusaway.client.okhttp.OnebusawaySdkOkHttpClient
import org.onebusaway.core.JsonString
import org.onebusaway.core.http.Headers
import org.onebusaway.core.jsonMapper
import org.onebusaway.errors.BadRequestException
import org.onebusaway.errors.InternalServerException
import org.onebusaway.errors.NotFoundException
import org.onebusaway.errors.OnebusawaySdkError
import org.onebusaway.errors.OnebusawaySdkException
import org.onebusaway.errors.PermissionDeniedException
import org.onebusaway.errors.RateLimitException
import org.onebusaway.errors.UnauthorizedException
import org.onebusaway.errors.UnexpectedStatusCodeException
import org.onebusaway.errors.UnprocessableEntityException
import org.onebusaway.models.*

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
                assertBadRequest(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
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
                assertUnauthorized(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
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
                    Headers.builder().put("Foo", "Bar").build(),
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
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), ONEBUSAWAY_SDK_ERROR)
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
                    Headers.builder().put("Foo", "Bar").build(),
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
                assertRateLimit(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ONEBUSAWAY_SDK_ERROR
                )
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
                    Headers.builder().put("Foo", "Bar").build(),
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
                    Headers.builder().put("Foo", "Bar").build(),
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
                assertBadRequest(e, Headers.builder().build(), OnebusawaySdkError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: OnebusawaySdkError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: OnebusawaySdkError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: OnebusawaySdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
