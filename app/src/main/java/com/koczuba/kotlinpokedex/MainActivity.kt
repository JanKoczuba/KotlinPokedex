package com.koczuba.kotlinpokedex

import PokemonListScreenNav
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.koczuba.kotlinpokedex.pokemonlist.PokemonListScreen
import com.koczuba.kotlinpokedex.ui.theme.KotlinPokedexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinPokedexTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = PokemonListScreenNav) {
                    composable<PokemonListScreenNav> {
                        PokemonListScreen(navController= navController)
                    }
                }

            }
        }
    }
}

