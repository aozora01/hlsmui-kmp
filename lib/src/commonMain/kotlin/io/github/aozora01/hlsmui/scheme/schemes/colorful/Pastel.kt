package io.github.firzaelbuho.hlsmui.styles.scheme.colorful


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme "Pastel"
private val pastelLightColorScheme = lightColorScheme(
    primary = Color(0xFFB0A7D6), // Pantone 2603 C
    onPrimary = Color(0xFF382E5B), // Pantone 2736 C
    primaryContainer = Color(0xFFD8D1EE), // Pantone 267 C
    onPrimaryContainer = Color(0xFF5B4478), // Pantone 2676 C

    secondary = Color(0xFFA3D1C4), // Pantone 375 C
    onSecondary = Color(0xFF1A372B), // Pantone 343 C
    secondaryContainer = Color(0xFFC4E9D9), // Pantone 363 C
    onSecondaryContainer = Color(0xFF2E5041), // Pantone 3425 C

    tertiary = Color(0xFFFFD97D), // Pantone 116 C
    onTertiary = Color(0xFF5C4F15), // Pantone 137 C
    tertiaryContainer = Color(0xFFFFE9A8), // Pantone 110 C
    onTertiaryContainer = Color(0xFF7B6329), // Pantone 141 C

    background = Color(0xFFFFFBFE), // Pantone 113 C
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFFB0A7D6), // Pantone 2603 C
    inverseSurface = Color(0xFF313033), // Pantone Black 7 C
    inverseOnSurface = Color(0xFFF4EFF4), // Pantone Cool Gray 1 C

    error = Color(0xFFBA1B1B), // Pantone Red 032 C
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFFFFDAD4), // Pantone 171 C
    onErrorContainer = Color(0xFF410E0B), // Pantone 187 C

    outline = Color(0xFF79747E), // Pantone 429 C
    outlineVariant = Color(0xFFCAC4D0), // Pantone 423 C
    scrim = Color(0xFF000000) // Black
)

// Dark Color Scheme "Pastel"
private val pastelDarkColorScheme = darkColorScheme(
    primary = Color(0xFFC0B6E7), // Pantone 2603 C
    onPrimary = Color(0xFF251A49), // Pantone 2766 C
    primaryContainer = Color(0xFF3B3162), // Pantone 2736 C
    onPrimaryContainer = Color(0xFFD8D2EE), // Pantone 267 C

    secondary = Color(0xFF78C8B6), // Pantone 368 C
    onSecondary = Color(0xFF2B4C42), // Pantone 342 C
    secondaryContainer = Color(0xFF416357), // Pantone 3425 C
    onSecondaryContainer = Color(0xFFB8DFD0), // Pantone 361 C

    tertiary = Color(0xFFFFDB7D), // Pantone 116 C
    onTertiary = Color(0xFF5C4F15), // Pantone 137 C
    tertiaryContainer = Color(0xFF7B6329), // Pantone 141 C
    onTertiaryContainer = Color(0xFFFFE9A8), // Pantone 110 C

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
    scrim = Color(0xFF000000) // Black
)

// HlsmColorScheme "Pastel"
internal val PastelColorScheme = HColorScheme(
    name = "Pastel",
    categories = listOf(HColorSchemeCategory.Colorful),
    light = pastelLightColorScheme,
    dark = pastelDarkColorScheme
)