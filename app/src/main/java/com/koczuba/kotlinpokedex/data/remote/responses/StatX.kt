package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class StatX(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)