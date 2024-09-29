package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class GenerationI(
    @SerialName("red-blue")
    val redBlue: RedBlue,
    @SerialName("yellow")
    val yellow: Yellow
)