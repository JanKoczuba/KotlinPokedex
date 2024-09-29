import kotlinx.serialization.Serializable
import java.util.Locale

@Serializable
object PokemonListScreen


@Serializable
data class PokemonDetails(
    val dominantColor: Int?,
    val pokemonName: String,
)