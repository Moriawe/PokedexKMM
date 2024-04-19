package com.moriawe.kmmapilist.core.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonData(
    val id:Int = 0,
    val name:String = "",
    val height: Float = 0f,
    val weight: Float = 0f,
    val backDefaultImg: String = "",
    val frontDefaultImg: String = "",
    val hp: Int? = null,
    val attack : Int? = null,
    val defense : Int? = null,
    val specialAttack : Int? = null,
    val specialDefense : Int? = null,
    val speed : Int? = null,
    val type : List<PokeType>? = null,
)