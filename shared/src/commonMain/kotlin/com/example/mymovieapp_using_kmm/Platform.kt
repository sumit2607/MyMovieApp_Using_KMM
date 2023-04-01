package com.example.mymovieapp_using_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform