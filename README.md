## chttp
Chromatic HTTP, a simple Kotlin HTTP library.

---

## info
Only supports `GET` and `POST` request right now.
`POST` requests can only send json, jsonld, css, csv, eventstream, html, javascript, plain, xml types.

## example
I'll make better example at some point.
```kt
val client = Client()

fun postExample(): Response {
    val url = URI("https://example.com").toURL()
    val request = Request(Methods.POST, url)
    val content = Content(ContentTypes.JSON, "{ \"key\": \"value\" }")
    return client.post(request, content)
}
```