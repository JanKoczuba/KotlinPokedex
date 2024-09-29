package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class GenerationIi(
    @SerialName("crystal")
    val crystal: Crystal,
    @SerialName("gold")
    val gold: Gold,
    @SerialName("silver")
    val silver: Silver
)