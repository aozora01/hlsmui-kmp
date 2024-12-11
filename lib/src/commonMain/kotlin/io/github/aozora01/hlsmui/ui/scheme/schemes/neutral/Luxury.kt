package io.github.firzaelbuho.hlsmui.styles.scheme.neutral


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme "Luxury"
private val luxuryLightColorScheme = lightColorScheme(
    primary = Color(0xFF9C27B0), // Pantone 2685 C
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFFF3E0F9), // Pantone 233 C
    onPrimaryContainer = Color(0xFF380047), // Pantone 2695 C

    secondary = Color(0xFF6B388A), // Pantone 267 C
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFF1DCFA), // Pantone 245 C
    onSecondaryContainer = Color(0xFF250046), // Pantone 2685 C

    tertiary = Color(0xFFD7B572), // Pantone 130 C
    onTertiary = Color(0xFF442D00), // Pantone 7549 C
    tertiaryContainer = Color(0xFFFFE9A8), // Pantone 110 C
    onTertiaryContainer = Color(0xFF634400), // Pantone 141 C

    background = Color(0xFFFFFBFE), // Pantone 113 C
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFF9C27B0), // Pantone 2685 C
    inverseSurface = Color(0xFF313033), // Pantone Black 7 C
    inverseOnSurface = Color(0xFFF4EFF4), // Pantone Cool Gray 1 C

    error = Color(0xFFB3261E), // Pantone 1807 C
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFFF9DEDC), // Pantone 179 C
    onErrorContainer = Color(0xFF410E0B), // Pantone 187 C

    outline = Color(0xFF79747E), // Pantone 429 C
    outlineVariant = Color(0xFFCAC4D0), // Pantone 423 C
    scrim = Color(0xFF000000) // Hitam untuk scrim
)

// Dark Color Scheme "Luxury"
private val luxuryDarkColorScheme = darkColorScheme(
    primary = Color(0xFFD0BCEE), // Pantone 2332 C
    onPrimary = Color(0xFF4A1464), // Pantone 2696 C
    primaryContainer = Color(0xFF632980), // Pantone 2362 C
    onPrimaryContainer = Color(0xFFEADDFA), // Pantone 2096 C

    secondary = Color(0xFFD0BCDF), // Pantone 2593 C
    onSecondary = Color(0xFF381552), // Pantone 528 C
    secondaryContainer = Color(0xFF4F2B6B), // Pantone 2676 C
    onSecondaryContainer = Color(0xFFE9D6F7), // Pantone 2603 C

    tertiary = Color(0xFFE6CF8D), // Pantone 123 C
    onTertiary = Color(0xFF5D4416), // Pantone 464 C
    tertiaryContainer = Color(0xFF795D2C), // Pantone 7547 C
    onTertiaryContainer = Color(0xFFF9E2A9), // Pantone 115 C

    background = Color(0xFF1C1B1E), // Pantone Black 7 C
    onBackground = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C

    surface = Color(0xFF1C1B1E), // Pantone Black 7 C
    onSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    surfaceVariant = Color(0xFF49454F), // Pantone 424 C
    onSurfaceVariant = Color(0xFFCAC4D0), // Pantone 423 C

    surfaceTint = Color(0xFFD0BCEE), // Pantone 2332 C
    inverseSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    inverseOnSurface = Color(0xFF313033), // Pantone Black 7 C

    error = Color(0xFFF2B8B5), // Pantone 701 C
    onError = Color(0xFF601410), // Pantone 485 C
    errorContainer = Color(0xFF8C1D18), // Pantone 181 C
    onErrorContainer = Color(0xFFF9DEDC), // Pantone 179 C

    outline = Color(0xFF938F99), // Pantone 429 C
    outlineVariant = Color(0xFF49454F), // Pantone 424 C
    scrim = Color(0xFF000000) // Hitam untuk scrim
)

// HlsmColorScheme "Luxury"
internal val LuxuryColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Luxury",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Neutral),
    light = luxuryLightColorScheme,
    dark = luxuryDarkColorScheme
)
