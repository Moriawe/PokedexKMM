package com.moriawe.kmmapilist.core.domain.use_case

import com.moriawe.kmmapilist.core.data.model.PokeData
import com.moriawe.kmmapilist.core.domain.client.PokeClient
import com.moriawe.kmmapilist.core.domain.model.Pokemon
import com.moriawe.kmmapilist.core.domain.client.Resource
import com.moriawe.kmmapilist.core.domain.client.ServerException

class GetPokemonByName(
    private val client: PokeClient
) {

    suspend fun execute(
        pokemonName: String
    ): Resource<Pokemon> {
        return try {
            val pokeData: PokeData = client.getPokemonByName(
                name = pokemonName
            )
            val pokemon = Pokemon(
                id = pokeData.id,
                name = pokeData.name,
                type = pokeData.type
            )
            Resource.Success(pokemon)
        } catch(e: ServerException) {
            e.printStackTrace()
            Resource.Error(e)
        }
    }
}