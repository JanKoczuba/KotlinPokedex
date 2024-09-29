package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class DreamWorld(
    @SerialName("front_default")
    val frontDefault: String,
    @SerialName("front_female")
    val frontFemale: Any
)