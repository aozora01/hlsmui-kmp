package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory

// Light Color Scheme for Watermelon
private val watermelonLightColorScheme = lightColorScheme(
    primary = Color(0xFF00A550), // Green (Pantone 362 C) - Kulit Semangka
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF72F7A7),
    onPrimaryContainer = Color(0xFF00361B),

    secondary = Color(0xFFEE252C), // Red (Pantone 179 C) - Daging Semangka
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFFFD9DF),
    onSecondaryContainer = Color(0xFF410004),

    tertiary = Color(0xFF313131), // Black (Pantone Black C) - Biji Semangka
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFE3E3E3),
    onTertiaryContainer = Color(0xFF141414),

    background = Color(0xFFFFFBEB), // Light Yellowish White (Pantone 12-0738 TCX)
    onBackground = Color(0xFF1A1C19),

    surface = Color(0xFFFFFBEB), // Light Yellowish White (Pantone 12-0738 TCX)
    onSurface = Color(0xFF1A1C19),
    surfaceVariant = Color(0xFFDEE3DC),
    onSurfaceVariant = Color(0xFF434741),

    surfaceTint = Color(0xFF00A550), // Green (Pantone 362 C)
    inverseSurface = Color(0xFF2F312D),
    inverseOnSurface = Color(0xFFF1F0E7),

    error = Color(0xFFB3261E), // Dark Red (Pantone 2347 C)
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFF9DEDC),
    onErrorContainer = Color(0xFF410E0B),

    outline = Color(0xFF747771),
    outlineVariant = Color(0xFFC4C6C0),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Watermelon
private val watermelonDarkColorScheme = darkColorScheme(
    primary = Color(0xFF66D98A), // Light Green (Pantone 362 C tinted)
    onPrimary = Color(0xFF00381D),
    primaryContainer = Color(0xFF005128),
    onPrimaryContainer = Color(0xFF72F7A7),

    secondary = Color(0xFFFFB0B4), // Light Red (Pantone 179 C tinted)
    onSecondary = Color(0xFF680007),
    secondaryContainer = Color(0xFF930B13),
    onSecondaryContainer = Color(0xFFFFD9DF),

    tertiary = Color(0xFFBDBDBD), // Light Gray (Pantone Cool Gray 1 C)
    onTertiary = Color(0xFF212121),
    tertiaryContainer = Color(0xFF383838),
    onTertiaryContainer = Color(0xFFE3E3E3),

    background = Color(0xFF1A1C19), // Dark Greenish Gray (Pantone 447 C)
    onBackground = Color(0xFFE3E2DC),

    surface = Color(0xFF1A1C19), // Dark Greenish Gray (Pantone 447 C)
    onSurface = Color(0xFFE3E2DC),
    surfaceVariant = Color(0xFF434741),
    onSurfaceVariant = Color(0xFFC3C6C0),

    surfaceTint = Color(0xFF66D98A), // Light Green (Pantone 362 C tinted)
    inverseSurface = Color(0xFFE3E2DC),
    inverseOnSurface = Color(0xFF1A1C19),

    error = Color(0xFFF2B8B5), // Light Red (Pantone 1807 C)
    onError = Color(0xFF601410),
    errorContainer = Color(0xFF8C1D18),
    onErrorContainer = Color(0xFFF9DEDC),

    outline = Color(0xFF8D9089),
    outlineVariant = Color(0xFF434741),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Watermelon
internal val WatermelonColorScheme = HColorScheme(
    name = "Watermelon",
    categories = listOf(HColorSchemeCategory.Nature),
    light = watermelonLightColorScheme,
    dark = watermelonDarkColorScheme
)