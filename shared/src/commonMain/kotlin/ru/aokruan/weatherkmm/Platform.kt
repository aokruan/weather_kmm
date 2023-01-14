package ru.aokruan.weatherkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform