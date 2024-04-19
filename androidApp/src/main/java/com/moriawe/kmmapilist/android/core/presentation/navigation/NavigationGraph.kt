package com.moriawe.kmmapilist.android.core.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.navArgument
import com.moriawe.kmmapilist.android.core.presentation.PokemonDetail.PokemonDetailScreen
import com.moriawe.kmmapilist.android.core.presentation.PokemonList.PokemonListScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {

    val modifier = Modifier

    // -*- NAVIGATION -*- //
    NavHost(
        navController = navController,
        startDestination = Screen.PokemonListScreen.route,
        modifier = modifier.padding(innerPadding)
    ) {
        composable("pokemon_list_screen") {

        }
        composable(
            "pokemon_detail_screen/{pokemonName}",
            arguments = listOf(
                navArgument("pokemonName") {
                    type = NavType.StringType
                }
            )
        ) {
            val pokemonName = remember {
                it.arguments?.getString("pokemonName")
            }
        }
    }
//        composable(route = Screen.PokemonListScreen.route) {
//            val viewModel = hiltViewModel<TimerViewModel>()
//            val state by viewModel.timerState.collectAsState()
//            val onEvent = viewModel::onEvent
//            PokemonListScreen(
//                state = state,
//                modifier = modifier,
//                onEvent = onEvent,
//                onOpenDetail = {
//                    navController.navigate(Screen.PokemonDetailScreen.withArgs(it))
//                })
//        }
//        composable(route = Screen.PokemonDetailScreen.route) {
//            val viewModel = hiltViewModel<TimeSheetViewModel>()
//            val state by viewModel.timeSheetState.collectAsState()
//            val onEvent = viewModel::onEvent
//            PokemonDetailScreen(
//                state = state,
//                modifier = modifier,
//                onEvent = onEvent
//            )
//        }
//        // -*- Calling dialog from NavGraph with argument for timeItemId -*- //
//        // -*- It is strongly advised not to pass around complex data objects when navigating -*- //
//        dialog(
//            route = Screen.DialogScreen.route + "/{timeItemId}",
//            arguments = listOf(
//                navArgument("timeItemId") {
//                    type = NavType.IntType
//                }
//            )
//        ) { entry ->
//            // To receive the navargs in the viewModel you need to use the hilt viewModel factory this way
//            val viewModel =
//                hiltViewModel<DialogViewModel, DialogViewModel.DialogViewModelFactory> { factory ->
//                    factory.create(entry.arguments?.getInt("timeItemId"))
//                }
//            TimeItemDialog(
//                viewModel = viewModel,
//                modifier = modifier,
//                onHideDialog = {
//                    navController.popBackStack()
//                })
//            // If you want to receive the navargs in the compose ->
//            //timeItemId = entry.arguments?.getInt("timeItemId"),
//        }
//    }
}