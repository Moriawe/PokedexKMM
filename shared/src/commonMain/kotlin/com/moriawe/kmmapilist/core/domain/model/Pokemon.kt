package com.moriawe.kmmapilist.core.domain.model

class Pokemon(
    val id: Int = 0,
    val name: String = "",
    val type: List<PokeType>? = null,
)