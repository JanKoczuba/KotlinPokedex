package com.koczuba.kotlinpokedex.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.koczuba.kotlinpokedex.data.remote.PokeApi
import com.koczuba.kotlinpokedex.repository.PokemonRepository
import com.koczuba.kotlinpokedex.repository.PokemonRepositoryImplementation
import com.koczuba.kotlinpokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepositoryImplementation(api) as PokemonRepository

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        val networkJson = Json { ignoreUnknownKeys = true }
        return Retrofit.Builder()
           .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}