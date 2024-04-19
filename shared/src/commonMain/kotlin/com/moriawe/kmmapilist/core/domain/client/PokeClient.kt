package com.moriawe.kmmapilist.core.domain.client

interface PokeClient {

    suspend fun getPokemonById(
        id: Int
    )

    suspend fun getPokemonByName(
        name: String
    )
}