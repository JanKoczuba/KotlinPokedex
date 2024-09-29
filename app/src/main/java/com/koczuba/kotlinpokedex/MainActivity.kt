package com.koczuba.kotlinpokedex

import PokemonListScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.koczuba.kotlinpokedex.ui.theme.KotlinPokedexTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinPokedexTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = PokemonListScreen) {

                }

            }
        }
    }
}

