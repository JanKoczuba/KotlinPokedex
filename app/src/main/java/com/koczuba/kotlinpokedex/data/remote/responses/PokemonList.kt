package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class PokemonList(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: Any,
    @SerialName("results")
    val results: List<Result>
)