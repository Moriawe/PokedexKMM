package com.moriawe.kmmapilist.core.domain.use_case

import com.moriawe.kmmapilist.core.domain.client.PokeClient
import com.moriawe.kmmapilist.core.domain.client.Resource
import com.moriawe.kmmapilist.core.domain.client.ServerException
import com.moriawe.kmmapilist.core.domain.model.Pokemon

class GetAllPokemons(
    private val client: PokeClient
) {

    suspend fun execute(): Resource<List<Pokemon>> {
        return try {
            val pokemonList = client.getAllPokemons()
            Resource.Success(pokemonList)
        } catch(e: ServerException) {
            e.printStackTrace()
            Resource.Error(e)
        }
    }

}