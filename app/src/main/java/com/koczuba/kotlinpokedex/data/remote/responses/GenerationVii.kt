package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class GenerationVii(
    @SerialName("icons")
    val icons: Icons,
    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)