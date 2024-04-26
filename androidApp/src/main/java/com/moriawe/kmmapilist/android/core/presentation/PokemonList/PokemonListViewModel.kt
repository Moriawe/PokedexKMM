package com.moriawe.kmmapilist.android.core.presentation.PokemonList

import androidx.lifecycle.ViewModel
import com.moriawe.kmmapilist.core.domain.model.Pokemon
import com.moriawe.kmmapilist.core.presentation.PokemonList.PokemonListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor (

): ViewModel() {

    private val _pokemonListState = MutableStateFlow(
        PokemonListState())


    val pokemonListState: StateFlow<PokemonListState> = _pokemonListState.asStateFlow()

}