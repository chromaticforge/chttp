package com.github.chromaticforge.chttp.data

enum class ContentTypes(val value: String) {
    JSON("application/json"),
    JSONLD("application/ld+json"),
    CSS("text/css"),
    CSV("text/csv"),
    EVENT_STREAM("text/event-stream"),
    HTML("text/html"),
    JAVASCRIPT("text/javascript"),
    PLAIN("text/plain"),
    XML("text/xml"),
}