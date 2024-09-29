package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Other(
    @SerialName("dream_world")
    val dreamWorld: DreamWorld,
    @SerialName("home")
    val home: Home,
    @SerialName("official-artwork")
    val officialArtwork: OfficialArtwork,
    @SerialName("showdown")
    val showdown: Showdown
)