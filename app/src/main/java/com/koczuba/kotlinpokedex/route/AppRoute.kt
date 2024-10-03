import kotlinx.serialization.Serializable
import java.util.Locale

@Serializable
object PokemonListScreenNav


@Serializable
data class PokemonDetailsNav(
    val dominantColor: Int?,
    val pokemonName: String,
)