package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Cries(
    @SerialName("latest")
    val latest: String,
    @SerialName("legacy")
    val legacy: String
)