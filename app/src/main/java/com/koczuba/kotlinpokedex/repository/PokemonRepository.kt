package com.koczuba.kotlinpokedex.repository

import com.koczuba.kotlinpokedex.data.remote.responses.Pokemon
import com.koczuba.kotlinpokedex.data.remote.responses.PokemonList
import com.koczuba.kotlinpokedex.util.Resource

interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
}