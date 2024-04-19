package com.moriawe.kmmapilist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform