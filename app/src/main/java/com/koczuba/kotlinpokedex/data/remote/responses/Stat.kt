package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Stat(
    @SerialName("base_stat")
    val baseStat: Int,
    @SerialName("effort")
    val effort: Int,
    @SerialName("stat")
    val stat: StatX
)