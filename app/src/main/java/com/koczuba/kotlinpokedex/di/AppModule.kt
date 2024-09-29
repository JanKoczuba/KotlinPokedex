package com.koczuba.kotlinpokedex.di

import com.koczuba.kotlinpokedex.data.remote.PokeApi
import com.koczuba.kotlinpokedex.repository.PokemonRepository
import com.koczuba.kotlinpokedex.repository.PokemonRepositoryImplementation
import com.koczuba.kotlinpokedex.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
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
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}