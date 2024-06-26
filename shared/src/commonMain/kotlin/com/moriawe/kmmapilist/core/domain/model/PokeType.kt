package com.moriawe.kmmapilist.core.domain.model

enum class PokeType(val type:String) {
    NORMAL("NORMAL"),
    FIRE("FIRE"),
    WATER("WATER"),
    ELECTRIC("ELECTRIC"),
    GRASS("GRASS"),
    ICE("ICE"),
    FIGHTING("FIGHTING"),
    POISON("POISON"),
    GROUND("GROUND"),
    FLYING("FLYING"),
    PSYCHIC("PSYCHIC"),
    BUG("BUG"),
    ROCK("ROCK"),
    GHOST("GHOST"),
    DRAGON("DRAGON"),
    DARK("DARK"),
    STEEL("STEEL"),
    FAIRY("FAIRY");

    companion object {
        fun getAsPokeType(value: String): PokeType? = PokeType.entries.find { it.type.lowercase() == value }
    }
}