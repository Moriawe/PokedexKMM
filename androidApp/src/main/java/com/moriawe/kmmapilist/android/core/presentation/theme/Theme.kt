package com.example.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.moriawe.kmmapilist.core.presentation.theme.Colors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moriawe.kmmapilist.android.R


private val LightColors = lightColorScheme(
    primary = Color(Colors.md_theme_light_primary),
    onPrimary = Color(Colors.md_theme_light_onPrimary),
    primaryContainer = Color(Colors.md_theme_light_primaryContainer),
    onPrimaryContainer = Color(Colors.md_theme_light_onPrimaryContainer),
    secondary = Color(Colors.md_theme_light_secondary),
    onSecondary = Color(Colors.md_theme_light_onSecondary),
    secondaryContainer = Color(Colors.md_theme_light_secondaryContainer),
    onSecondaryContainer = Color(Colors.md_theme_light_onSecondaryContainer),
    tertiary = Color(Colors.md_theme_light_tertiary),
    onTertiary = Color(Colors.md_theme_light_onTertiary),
    tertiaryContainer = Color(Colors.md_theme_light_tertiaryContainer),
    onTertiaryContainer = Color(Colors.md_theme_light_onTertiaryContainer),
    error = Color(Colors.md_theme_light_error),
    errorContainer = Color(Colors.md_theme_light_errorContainer),
    onError = Color(Colors.md_theme_light_onError),
    onErrorContainer = Color(Colors.md_theme_light_onErrorContainer),
    background = Color(Colors.md_theme_light_background),
    onBackground = Color(Colors.md_theme_light_onBackground),
    surface = Color(Colors.md_theme_light_surface),
    onSurface = Color(Colors.md_theme_light_onSurface),
    surfaceVariant = Color(Colors.md_theme_light_surfaceVariant),
    onSurfaceVariant = Color(Colors.md_theme_light_onSurfaceVariant),
    outline = Color(Colors.md_theme_light_outline),
    inverseOnSurface = Color(Colors.md_theme_light_inverseOnSurface),
    inverseSurface = Color(Colors.md_theme_light_inverseSurface),
    inversePrimary = Color(Colors.md_theme_light_inversePrimary),
    surfaceTint = Color(Colors.md_theme_light_surfaceTint),
    outlineVariant = Color(Colors.md_theme_light_outlineVariant),
    scrim = Color(Colors.md_theme_light_scrim),
)


private val DarkColors = darkColorScheme(
    primary = Color(Colors.md_theme_dark_primary),
    onPrimary = Color(Colors.md_theme_dark_onPrimary),
    primaryContainer = Color(Colors.md_theme_dark_primaryContainer),
    onPrimaryContainer = Color(Colors.md_theme_dark_onPrimaryContainer),
    secondary = Color(Colors.md_theme_dark_secondary),
    onSecondary = Color(Colors.md_theme_dark_onSecondary),
    secondaryContainer = Color(Colors.md_theme_dark_secondaryContainer),
    onSecondaryContainer = Color(Colors.md_theme_dark_onSecondaryContainer),
    tertiary = Color(Colors.md_theme_dark_tertiary),
    onTertiary = Color(Colors.md_theme_dark_onTertiary),
    tertiaryContainer = Color(Colors.md_theme_dark_tertiaryContainer),
    onTertiaryContainer = Color(Colors.md_theme_dark_onTertiaryContainer),
    error = Color(Colors.md_theme_dark_error),
    errorContainer = Color(Colors.md_theme_dark_errorContainer),
    onError = Color(Colors.md_theme_dark_onError),
    onErrorContainer = Color(Colors.md_theme_dark_onErrorContainer),
    background = Color(Colors.md_theme_dark_background),
    onBackground = Color(Colors.md_theme_dark_onBackground),
    surface = Color(Colors.md_theme_dark_surface),
    onSurface = Color(Colors.md_theme_dark_onSurface),
    surfaceVariant = Color(Colors.md_theme_dark_surfaceVariant),
    onSurfaceVariant = Color(Colors.md_theme_dark_onSurfaceVariant),
    outline = Color(Colors.md_theme_dark_outline),
    inverseOnSurface = Color(Colors.md_theme_dark_inverseOnSurface),
    inverseSurface = Color(Colors.md_theme_dark_inverseSurface),
    inversePrimary = Color(Colors.md_theme_dark_inversePrimary),
    surfaceTint = Color(Colors.md_theme_dark_surfaceTint),
    outlineVariant = Color(Colors.md_theme_dark_outlineVariant),
    scrim = Color(Colors.md_theme_dark_scrim)
)

//TODO: Do these need to be here?
val typeNormal = Color(Colors.typeNormal_hexcolor)
val typeFire = Color(Colors.typeFire_hexcolor)
val typeWater = Color(Colors.typeWater_hexcolor)
val typeElectric = Color(Colors.typeElectric_hexcolor)
val typeGrass = Color(Colors.typeGrass_hexcolor)
val typeIce = Color(Colors.typeIce_hexcolor)
val typeFighting = Color(Colors.typeFighting_hexcolor)
val typePoison = Color(Colors.typePoison_hexcolor)
val typeGround = Color(Colors.typeGround_hexcolor)
val typeFlying = Color(Colors.typeFlying_hexcolor)
val typePsychic = Color(Colors.typePsychic_hexcolor)
val typeBug = Color(Colors.typeBug_hexcolor)
val typeRock = Color(Colors.typeRock_hexcolor)
val typeGhost = Color(Colors.typeGhost_hexcolor)
val typeDragon = Color(Colors.typeDragon_hexcolor)
val typeDark = Color(Colors.typeDark_hexcolor)
val typeSteel = Color(Colors.typeSteel_hexcolor)
val typeFairy = Color(Colors.typeFairy_hexcolor)

val HPColor = Color(Colors.HPColor_hexcolor)
val AtkColor = Color(Colors.AtkColor_hexcolor)
val DefColor = Color(Colors.DefColor_hexcolor)
val SpAtkColor = Color(Colors.SpAtkColor_hexcolor)
val SpDefColor = Color(Colors.SpDefColor_hexcolor)
val SpdColor = Color(Colors.SpdColor_hexcolor)

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (!useDarkTheme) {
        LightColors
    } else {
        DarkColors
    }

    val sedan = FontFamily(
        Font(
            resId = R.font.sedan_regular,
            weight = FontWeight.Normal
        ),
        Font(
            resId = R.font.sedan_italic,
            style = FontStyle.Italic
        )
    )

    val roboto = FontFamily(
        Font(
            resId = R.font.roboto_regular,
            weight = FontWeight.Normal
        ),
        Font(
            resId = R.font.roboto_bold,
            weight = FontWeight.Bold
        ),
        Font(
            resId = R.font.roboto_medium,
            weight = FontWeight.Normal
        ),
        Font(
            resId = R.font.roboto_light,
            weight = FontWeight.Light
        )
    )

    val typography = Typography(
        headlineLarge = TextStyle(
            fontFamily = sedan,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        ),
        headlineMedium = TextStyle(
            fontFamily = sedan,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        ),
        headlineSmall = TextStyle(
            fontFamily = sedan,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = roboto,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),
        bodySmall = TextStyle(
            fontFamily = roboto,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        colorScheme = colors,
        content = content,
        typography = typography,
        shapes = shapes
    )
}