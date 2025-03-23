package com.github.chromaticforge.chttp.data

import java.net.URL

data class Request(val url: URL, val headers: Map<String, String>)
