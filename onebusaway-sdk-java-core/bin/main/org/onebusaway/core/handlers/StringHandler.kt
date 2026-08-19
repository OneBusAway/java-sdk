@file:JvmName("StringHandler")

package org.onebusaway.core.handlers

import org.onebusaway.core.http.HttpResponse
import org.onebusaway.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
