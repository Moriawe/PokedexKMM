package com.moriawe.kmmapilist.core.data

import com.moriawe.kmmapilist.core.domain.client.PokeClient
import com.moriawe.kmmapilist.core.domain.client.ServerError
import com.moriawe.kmmapilist.core.domain.client.ServerException
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.utils.io.errors.IOException

class KtorClient(
    private val httpClient: HttpClient
): PokeClient {

    private val baseUrl = "https://pokeapi.co/api/v2/pokemon/"

    override suspend fun getPokemonById(id: Int)  {
        val result = try {
            httpClient.get(baseUrl + id)
        } catch(e: IOException) {
            throw ServerException(ServerError.SERVER_UNAVAILABLE)
        }

        when(result.status.value) {
            in 200..299 -> Unit
            500 -> throw ServerException(ServerError.SERVER_ERROR)
            in 400..499 -> throw ServerException(ServerError.CLIENT_ERROR)
            else -> throw ServerException(ServerError.UNKNOWN_ERROR)
        }
    }

    override suspend fun getPokemonByName(name: String) {
        TODO("Not yet implemented")
    }
}