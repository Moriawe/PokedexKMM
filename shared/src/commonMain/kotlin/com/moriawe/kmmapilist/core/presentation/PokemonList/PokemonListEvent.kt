package com.moriawe.kmmapilist.core.presentation.PokemonList

sealed interface PokemonListEvent {
    data object GoToDetailScreen: PokemonListEvent

    data class SortOnType(val type: String): PokemonListEvent

    data class SortOnNumber(val number: Int): PokemonListEvent

    data class SortOnName(val name: String): PokemonListEvent
}