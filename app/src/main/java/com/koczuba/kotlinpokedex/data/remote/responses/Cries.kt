package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Cries(
    @SerialName("latest")
    val latest: String,
    @SerialName("legacy")
    val legacy: String
)