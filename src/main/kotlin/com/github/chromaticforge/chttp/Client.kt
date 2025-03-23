package com.github.chromaticforge.chttp

import com.github.chromaticforge.chttp.data.Request
import com.github.chromaticforge.chttp.data.Response
import com.github.chromaticforge.chttp.utils.HTTPUtils.handleResponse
import java.net.HttpURLConnection

class Client {
    /**
     * Sends a `GET` request to the specified URL with optional custom headers.
     *
     * @param request Object containing the URL and optional headers.
     * @return Object containing the HTTP status code and response body as a string.
     */
    fun get(request: Request): Response {
        val connection = request.url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.connect()

        return handleResponse(connection)
    }

    /**
     * Sends a `POST` request to the specified URL with the provided JSON data and optional custom headers.
     * **Currently only supports json Content Types.**
     *
     * @param request Object containing the URL and optional headers.
     * @param data Json data to be sent in the body of the POST request.
     * @return Object containing the HTTP status code and response body as a string.
     */
    fun post(request: Request, data: String): Response {
        val connection = request.url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/json")
        connection.outputStream.write(data.toByteArray())
        connection.connect()

        return handleResponse(connection)
    }
}