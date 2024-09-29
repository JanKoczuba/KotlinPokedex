package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class RubySapphire(
    @SerialName("back_default")
    val backDefault: String,
    @SerialName("back_shiny")
    val backShiny: String,
    @SerialName("front_default")
    val frontDefault: String,
    @SerialName("front_shiny")
    val frontShiny: String
)