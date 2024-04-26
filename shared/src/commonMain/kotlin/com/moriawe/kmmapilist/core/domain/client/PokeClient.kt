package com.moriawe.kmmapilist.core.domain.client

import com.moriawe.kmmapilist.core.data.model.PokeData

interface PokeClient {

    suspend fun getAllPokemons(): List<PokeData>

    suspend fun getPokemonById(
        id: Int
    ): PokeData

    suspend fun getPokemonByName(
        name: String
    ): PokeData
}