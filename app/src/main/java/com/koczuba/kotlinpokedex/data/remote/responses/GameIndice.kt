package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class GameIndice(
    @SerialName("game_index")
    val gameIndex: Int,
    @SerialName("version")
    val version: Version
)