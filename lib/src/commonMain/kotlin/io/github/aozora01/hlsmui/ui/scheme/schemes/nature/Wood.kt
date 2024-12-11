package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Wood
private val woodLightColorScheme = lightColorScheme(
    primary = Color(0xFF5D4037),  // Brown
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFE3C1B7),
    onPrimaryContainer = Color(0xFF19100B),

    secondary = Color(0xFF5E4F41),  // Dark Brown
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE2DDC2),
    onSecondaryContainer = Color(0xFF1A170D),

    tertiary = Color(0xFF516342),  // Greenish Brown
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFD4E9BE),
    onTertiaryContainer =  Color(0xFF0E2004),

    background = Color(0xFFF9FCE0),  // Light Yellowish Brown
    onBackground = Color(0xFF1C1B17),

    surface = Color(0xFFF9FCE0),  // Light Yellowish Brown
    onSurface = Color(0xFF1C1B17),
    surfaceVariant = Color(0xFFE1E2C7),
    onSurfaceVariant = Color(0xFF44473A),

    surfaceTint = Color(0xFF5D4037),  // Brown
    inverseSurface = Color(0xFF302F2B),
    inverseOnSurface = Color(0xFFF2F0E7),

    error = Color(0xFFBA1A1A),  // Red
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF75776D),
    outlineVariant = Color(0xFFC5C6B9),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Wood
private val woodDarkColorScheme = darkColorScheme(
    primary = Color(0xFFC7A99A),
    onPrimary = Color(0xFF2D1912),
    primaryContainer = Color(0xFF432E25),
    onPrimaryContainer = Color(0xFFE3C1B7),

    secondary = Color(0xFFC8B9A7),
    onSecondary = Color(0xFF2F281E),
    secondaryContainer = Color(0xFF463F2F),
    onSecondaryContainer = Color(0xFFE2DDC2),

    tertiary = Color(0xFFBBC8A4),
    onTertiary = Color(0xFF253117),
    tertiaryContainer = Color(0xFF3B482B),
    onTertiaryContainer = Color(0xFFD4E9BE),

    background = Color(0xFF1C1B17),
    onBackground = Color(0xFFE3E2DC),

    surface = Color(0xFF1C1B17),
    onSurface = Color(0xFFE3E2DC),
    surfaceVariant = Color(0xFF44473A),
    onSurfaceVariant = Color(0xFFC8B9A7),

    surfaceTint = Color(0xFFC7A99A),
    inverseSurface = Color(0xFFE3E2DC),
    inverseOnSurface = Color(0xFF1C1B17),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8D9183),
    outlineVariant = Color(0xFF434739),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Wood
internal val WoodColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Wood",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Nature),
    light = woodLightColorScheme,
    dark = woodDarkColorScheme
)
