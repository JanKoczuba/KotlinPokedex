package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class GenerationV(
    @SerialName("black-white")
    val blackWhite: BlackWhite
)