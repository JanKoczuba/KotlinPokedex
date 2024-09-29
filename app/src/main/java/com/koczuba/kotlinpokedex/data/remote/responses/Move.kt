package com.koczuba.kotlinpokedex.data.remote.responses


import kotlinx.serialization.SerialName

data class Move(
    @SerialName("move")
    val move: MoveX,
    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)