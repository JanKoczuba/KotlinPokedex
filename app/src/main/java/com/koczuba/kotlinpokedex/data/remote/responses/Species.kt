package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Species(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)