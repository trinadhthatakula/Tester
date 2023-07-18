package com.simple.tester

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform