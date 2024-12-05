package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Sky
private val skyLightColorScheme = lightColorScheme(
    primary = Color(0xFF4791DB),  // Sky Blue
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD8E8FF),
    onPrimaryContainer = Color(0xFF00214D),

    secondary = Color(0xFF5C5E71),  // Grayish Blue
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE0E1F8),
    onSecondaryContainer = Color(0xFF191B2B),

    tertiary = Color(0xFF74546F),  // Dusky Purple
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFBD7F1),
    onTertiaryContainer =  Color(0xFF2C1128),

    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE0E1F8),
    onSurfaceVariant = Color(0xFF44464E),

    surfaceTint = Color(0xFF4791DB),  // Sky Blue
    inverseSurface = Color(0xFF2F2F33),
    inverseOnSurface = Color(0xFFF1F0F4),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF73777F),
    outlineVariant = Color(0xFFCAC4D0),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Sky
private val skyDarkColorScheme = darkColorScheme(
    primary = Color(0xFFA6C8FF),
    onPrimary = Color(0xFF003268),
    primaryContainer = Color(0xFF21498D),
    onPrimaryContainer = Color(0xFFD8E8FF),

    secondary = Color(0xFFC4C6DC),
    onSecondary = Color(0xFF2E3041),
    secondaryContainer = Color(0xFF444758),
    onSecondaryContainer = Color(0xFFE0E1F8),

    tertiary = Color(0xFFE5B9D7),
    onTertiary = Color(0xFF432840),
    tertiaryContainer = Color(0xFF5A3F57),
    onTertiaryContainer = Color(0xFFFBD7F1),

    background = Color(0xFF1C1B1F),
    onBackground = Color(0xFFE2E1E6),

    surface = Color(0xFF1C1B1F),
    onSurface = Color(0xFFE2E1E6),
    surfaceVariant = Color(0xFF44464E),
    onSurfaceVariant = Color(0xFFC4C6DC),

    surfaceTint = Color(0xFFA6C8FF),
    inverseSurface = Color(0xFFE2E1E6),
    inverseOnSurface = Color(0xFF1C1B1F),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8D9199),
    outlineVariant = Color(0xFF43474E),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sky
internal val SkyColorScheme = HColorScheme(
    name = "Sky",
    categories = listOf(HColorSchemeCategory.Astronomy),
    light = skyLightColorScheme,
    dark = skyDarkColorScheme
)


