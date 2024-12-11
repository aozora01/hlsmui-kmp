package io.github.firzaelbuho.hlsmui.styles.scheme.brand


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme "Search Engine"
private val searchEngineLightColorScheme = lightColorScheme(
    primary = Color(0xFF4285F4), // Pantone 293 C (Google Blue)
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFFD1E4FF), // Pantone 292 C
    onPrimaryContainer = Color(0xFF00225A), // Pantone 2945 C

    secondary = Color(0xFFEA4335), // Pantone 179 C (Google Red)
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFF8D9D7), // Pantone 171 C
    onSecondaryContainer = Color(0xFF410E0B), // Pantone 187 C

    tertiary = Color(0xFFFBBC05), // Pantone 123 C (Google Yellow)
    onTertiary = Color(0xFF3F3000), // Pantone 1375 C
    tertiaryContainer = Color(0xFFFFF1B3), // Pantone 106 C
    onTertiaryContainer = Color(0xFF6A5A00), // Pantone 130 C

    background = Color(0xFFFFFFFF), // White
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFF4285F4), // Pantone 293 C
    inverseSurface = Color(0xFF313033), // Pantone Black 7 C
    inverseOnSurface = Color(0xFFF4EFF4), // Pantone Cool Gray 1 C

    error = Color(0xFFB3261E), // Pantone 1807 C
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFFF9DEDC), // Pantone 179 C
    onErrorContainer = Color(0xFF410E0B), // Pantone 187 C

    outline = Color(0xFF79747E), // Pantone 429 C
    outlineVariant = Color(0xFFCAC4D0), // Pantone 423 C
    scrim = Color(0xFF000000) // Black
)

// Dark Color Scheme "Search Engine"
private val searchEngineDarkColorScheme = darkColorScheme(
    primary = Color(0xFF98BDFF), // Pantone 299 C
    onPrimary = Color(0xFF003580), // Pantone 3005 C
    primaryContainer = Color(0xFF004EAF), // Pantone 294 C
    onPrimaryContainer = Color(0xFFCCE1FF), // Pantone 292 C

    secondary = Color(0xFFFFB0A9), // Pantone 177 C
    onSecondary = Color(0xFF680003), // Pantone 1807 C
    secondaryContainer = Color(0xFF930006), // Pantone 1805 C
    onSecondaryContainer = Color(0xFFFFDAD4), // Pantone 171 C

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

    surfaceTint = Color(0xFF98BDFF), // Pantone 299 C
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

// HlsmColorScheme "Search Engine"
internal val SearchEngineColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Search Engine",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Brand),
    light = searchEngineLightColorScheme,
    dark = searchEngineDarkColorScheme
)