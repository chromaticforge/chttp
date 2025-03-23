## chttp
Chromatic HTTP, a simple Kotlin HTTP library.

---

## info
Only supports `GET` and `POST` request right now.
`POST` requests can currently only send json data.

## example
I'll make better example at some point.
```kt
val client = Client()

fun getExampleBody(): String {
    val request = Request(URI("https://example.com").toURL())
    return client.get(request).body
}
```