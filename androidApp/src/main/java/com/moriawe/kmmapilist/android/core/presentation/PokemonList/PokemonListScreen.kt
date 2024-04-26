package com.moriawe.kmmapilist.android.core.presentation.PokemonList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moriawe.kmmapilist.core.presentation.PokemonList.PokemonListEvent
import com.moriawe.kmmapilist.core.presentation.PokemonList.PokemonListState

@Composable
fun PokemonListScreen(
    onEvent: PokemonListEvent,
    state: PokemonListState,
    onOpenDetail: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {

    }
}