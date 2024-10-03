package com.koczuba.kotlinpokedex.repository

import com.koczuba.kotlinpokedex.data.remote.PokeApi
import com.koczuba.kotlinpokedex.data.remote.responses.Pokemon
import com.koczuba.kotlinpokedex.data.remote.responses.PokemonList
import com.koczuba.kotlinpokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepositoryImplementation @Inject constructor(
    private val api: PokeApi
): PokemonRepository {

  override  suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        try {
            val response = api.getPokemonList(limit, offset)
            return Resource.Success(response)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
    }

    override  suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        try {
            val response = api.getPokemonInfo(pokemonName)
            return Resource.Success(response)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
    }
}