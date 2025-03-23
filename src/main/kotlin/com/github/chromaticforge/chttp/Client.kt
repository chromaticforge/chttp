package com.github.chromaticforge.chttp

import com.github.chromaticforge.chttp.data.Content
import com.github.chromaticforge.chttp.data.Request
import com.github.chromaticforge.chttp.data.Response
import com.github.chromaticforge.chttp.utils.HTTPUtils
import com.github.chromaticforge.chttp.utils.HTTPUtils.handleResponse

class Client {
    fun get(request: Request): Response {
        val connection = HTTPUtils.createConnection(request)
        connection.connect()

        return handleResponse(connection)
    }

    fun post(request: Request, content: Content): Response {
        val connection = HTTPUtils.createConnection(request)
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", content.type.value)
        connection.outputStream.write(content.content.toByteArray())
        connection.connect()

        return handleResponse(connection)
    }
}