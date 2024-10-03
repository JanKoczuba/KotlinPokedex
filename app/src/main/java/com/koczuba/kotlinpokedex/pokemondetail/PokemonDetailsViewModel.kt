package com.koczuba.kotlinpokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.koczuba.kotlinpokedex.data.remote.responses.Pokemon
import com.koczuba.kotlinpokedex.repository.PokemonRepository
import com.koczuba.kotlinpokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}