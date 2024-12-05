package io.github.firzaelbuho.hlsmui.styles.scheme.neutral

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme "Elegant"
private val elegantLightColorScheme = lightColorScheme(
    primary = Color(0xFF54497C), // Pantone 2366 C
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFFE0DDF8), // Pantone 2096 C
    onPrimaryContainer = Color(0xFF120734), // Pantone 2767 C

    secondary = Color(0xFFA789B1), // Pantone 269 C
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFF3DCF9), // Pantone 245 C
    onSecondaryContainer = Color(0xFF33134B), // Pantone 2685 C

    tertiary = Color(0xFFC6B893), // Pantone 459 C
    onTertiary = Color(0xFF382E0B), // Pantone 4695 C
    tertiaryContainer = Color(0xFFF0E7C1), // Pantone 131 C
    onTertiaryContainer = Color(0xFF53461E), // Pantone 464 C

    background = Color(0xFFFDFCF6), // Pantone 114 C
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFBFE), // Pantone 113 C
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFF54497C), // Pantone 2366 C
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

// Dark Color Scheme "Elegant"
private val elegantDarkColorScheme = darkColorScheme(
    primary = Color(0xFFC0B6E7), // Pantone 2603 C
    onPrimary = Color(0xFF251A49), // Pantone 2766 C
    primaryContainer = Color(0xFF3B3162), // Pantone 2736 C
    onPrimaryContainer = Color(0xFFD8D2EE), // Pantone 267 C

    secondary = Color(0xFFD0BFD8), // Pantone 2593 C
    onSecondary = Color(0xFF492861), // Pantone 268 C
    secondaryContainer = Color(0xFF634479), // Pantone 2676 C
    onSecondaryContainer = Color(0xFFE8D7F0), // Pantone 233 C

    tertiary = Color(0xFFD9CFB0), // Pantone 7503 C
    onTertiary = Color(0xFF4D4425), // Pantone 462 C
    tertiaryContainer = Color(0xFF645B3B), // Pantone 463 C
    onTertiaryContainer = Color(0xFFE6E1C1), // Pantone 7502 C

    background = Color(0xFF1C1B1E), // Pantone Black 7 C
    onBackground = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C

    surface = Color(0xFF1C1B1E), // Pantone Black 7 C
    onSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    surfaceVariant = Color(0xFF49454F), // Pantone 424 C
    onSurfaceVariant = Color(0xFFCAC4D0), // Pantone 423 C

    surfaceTint = Color(0xFFC0B6E7), // Pantone 2603 C
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

// HlsmColorScheme "Elegant"
internal val ElegantColorScheme = HColorScheme(
    name = "Elegant",
    categories = listOf(HColorSchemeCategory.Neutral),
    light = elegantLightColorScheme,
    dark = elegantDarkColorScheme
)