package com.koczuba.kotlinpokedex

import PokemonDetailsNav
import PokemonListScreenNav
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.koczuba.kotlinpokedex.pokemondetail.PokemonDetailScreen
import com.koczuba.kotlinpokedex.pokemonlist.PokemonListScreen
import com.koczuba.kotlinpokedex.ui.theme.KotlinPokedexTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

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
                        PokemonListScreen(navController = navController)
                    }
                    composable<PokemonDetailsNav> { stackEntry ->
                        val args = stackEntry.toRoute<PokemonDetailsNav>()
                        val dominantColor = remember {
                            val color = args.dominantColor
                            color?.let { Color(it) } ?: Color.White
                        }
                        val pokemonName = remember {
                            args.pokemonName.replaceFirstChar { it.lowercase(Locale.ROOT) }
                        }
                        PokemonDetailScreen(
                            dominantColor = dominantColor,
                            pokemonName = pokemonName,
                            navController = navController
                        )
                    }
                }

            }
        }
    }
}

