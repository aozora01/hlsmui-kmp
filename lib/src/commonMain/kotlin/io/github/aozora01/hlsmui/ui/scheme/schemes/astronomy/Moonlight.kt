package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory

// Light Color Scheme for Moonlight
private val moonlightLightColorScheme = lightColorScheme(
    primary = Color(0xFF4459A6),  // Deep Blue
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD8E2FF),
    onPrimaryContainer = Color(0xFF00174A),

    secondary = Color(0xFF54576E),  // Grayish Blue
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFD7D9F9),
    onSecondaryContainer = Color(0xFF12152B),

    tertiary = Color(0xFF745675),  // Dusky Purple
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFBD8E4),
    onTertiaryContainer =  Color(0xFF2C1229),

    background = Color(0xFFFEFBFF),  // Very Light Blue
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFEFBFF),  // Very Light Blue
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE1E2EC),
    onSurfaceVariant = Color(0xFF44464E),

    surfaceTint = Color(0xFF4459A6),  // Deep Blue
    inverseSurface = Color(0xFF303033),
    inverseOnSurface = Color(0xFFF2F0F4),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF73777F),
    outlineVariant = Color(0xFFCAC4D0),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Moonlight
private val moonlightDarkColorScheme = darkColorScheme(
    primary = Color(0xFFBFCFFF),
    onPrimary = Color(0xFF002E68),
    primaryContainer = Color(0xFF20448C),
    onPrimaryContainer = Color(0xFFD8E2FF),

    secondary = Color(0xFFBCC2DD),
    onSecondary = Color(0xFF282B3F),
    secondaryContainer = Color(0xFF3F4258),
    onSecondaryContainer = Color(0xFFD7D9F9),

    tertiary = Color(0xFFE4B9D7),
    onTertiary = Color(0xFF422738),
    tertiaryContainer = Color(0xFF593D4D),
    onTertiaryContainer = Color(0xFFFBD8E4),

    background = Color(0xFF1C1B1F),  // Dark Blue
    onBackground = Color(0xFFE3E2E6),

    surface = Color(0xFF1C1B1F),  // Dark Blue
    onSurface = Color(0xFFE3E2E6),
    surfaceVariant = Color(0xFF44464E),
    onSurfaceVariant = Color(0xFFBCC2DD),

    surfaceTint = Color(0xFFBFCFFF),
    inverseSurface = Color(0xFFE3E2E6),
    inverseOnSurface = Color(0xFF1C1B1F),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8D9199),
    outlineVariant = Color(0xFF43474E),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Moonlight
internal val MoonlightColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Moonlight",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Astronomy),
    light = moonlightLightColorScheme,
    dark = moonlightDarkColorScheme
)