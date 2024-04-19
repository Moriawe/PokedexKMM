package com.moriawe.kmmapilist.android.core.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Screen(
    val route: String,
    @StringRes val title: String,
    @DrawableRes val icon: Int? = null
) {
    data object PokemonListScreen :
        Screen("PokemonList", "Pokemon list")
    data object PokemonDetailScreen : Screen("PokemonDetail", "Details")

    // -*- Helper function to build a correct navigation route -*- //
    // -*- when you need to send an argument -*- //
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

    fun withArgs(vararg args: Int): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
