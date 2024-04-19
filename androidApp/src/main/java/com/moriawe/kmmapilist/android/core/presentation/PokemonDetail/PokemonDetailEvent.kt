package com.moriawe.kmmapilist.android.core.presentation.PokemonDetail

sealed interface PokemonDetailEvent {

    data object GoBackToPokemonList: PokemonDetailEvent
}