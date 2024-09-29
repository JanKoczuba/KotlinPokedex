package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Type(
    @SerialName("slot")
    val slot: Int,
    @SerialName("type")
    val type: TypeX
)