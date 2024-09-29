package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Emerald(
    @SerialName("front_default")
    val frontDefault: String,
    @SerialName("front_shiny")
    val frontShiny: String
)