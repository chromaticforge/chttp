package com.github.chromaticforge.chttp.utils

import com.github.chromaticforge.chttp.data.Request
import com.github.chromaticforge.chttp.data.Response
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection

object HTTPUtils {
    fun handleResponse(connection: HttpURLConnection): Response {
        val statusCode = connection.responseCode
        val response = StringBuilder()
        val reader = BufferedReader(InputStreamReader(connection.inputStream))

        var line: String?
        while (reader.readLine().also { line = it } != null) {
            response.append(line)
        }
        reader.close()

        return Response(statusCode, response.toString())
    }

    fun createConnection(request: Request): HttpURLConnection {
        val connection = request.url.openConnection() as HttpURLConnection
        connection.requestMethod = request.method.name
        return connection
    }
}