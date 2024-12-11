package io.github.firzaelbuho.hlsmui.styles.scheme.colorful


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme "Lolipop"
private val lolipopLightColorScheme = lightColorScheme(
    primary = Color(0xFFDC548F), // Pantone 219 C
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFFFFD9ED), // Pantone 217 C
    onPrimaryContainer = Color(0xFF581531), // Pantone 2347 C

    secondary = Color(0xFF63D19F), // Pantone 369 C
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFD9FFF0), // Pantone 362 C
    onSecondaryContainer = Color(0xFF134934), // Pantone 348 C

    tertiary = Color(0xFFFDD835), // Pantone 109 C
    onTertiary = Color(0xFF493E00), // Pantone 1245 C
    tertiaryContainer = Color(0xFFFFF9C4), // Pantone 102 C
    onTertiaryContainer = Color(0xFF7A6000), // Pantone 130 C

    background = Color(0xFFFFF8E1), // Pantone 123 C
    onBackground = Color(0xFF44373D), // Pantone 421 C

    surface = Color(0xFFFFF3E0), // Pantone 115 C
    onSurface = Color(0xFF44373D), // Pantone 421 C
    surfaceVariant = Color(0xFFF4DDD5), // Pantone 159 C
    onSurfaceVariant = Color(0xFF5C444A), // Pantone 485 C

    surfaceTint = Color(0xFFDC548F), // Pantone 219 C
    inverseSurface = Color(0xFF31252A), // Pantone 431 C
    inverseOnSurface = Color(0xFFEBE0E5), // Pantone 7541 C

    error = Color(0xFFBA1B1B), // Pantone Red 032 C
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFFFFDAD4), // Pantone 171 C
    onErrorContainer = Color(0xFF410E0B), // Pantone 187 C

    outline = Color(0xFF8D7A85), // Pantone 7542 C
    outlineVariant = Color(0xFFD7C6D0), // Pantone 492 C
    scrim = Color(0xFF000000) // Hitam untuk scrim
)

// Dark Color Scheme "Lolipop"
private val lolipopDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFB0D3), // Pantone Rhodamine Red C
    onPrimary = Color(0xFF73234E), // Pantone 234 C
    primaryContainer = Color(0xFF933A65), // Pantone 235 C
    onPrimaryContainer = Color(0xFFFFD9ED), // Pantone 217 C

    secondary = Color(0xFF44A37A), // Pantone 376 C
    onSecondary = Color(0xFF1A372B), // Pantone 343 C
    secondaryContainer = Color(0xFF2E5041), // Pantone 3425 C
    onSecondaryContainer = Color(0xFFC4E9D9), // Pantone 363 C

    tertiary = Color(0xFFFFDB7D), // Pantone 116 C
    onTertiary = Color(0xFF5C4F15), // Pantone 137 C
    tertiaryContainer = Color(0xFF7B6329), // Pantone 141 C
    onTertiaryContainer = Color(0xFFFFE9A8), // Pantone 110 C

    background = Color(0xFF1C1B1E), // Pantone 432 C
    onBackground = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C

    surface = Color(0xFF1C1B1E), // Pantone 432 C
    onSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    surfaceVariant = Color(0xFF49454F), // Pantone 424 C
    onSurfaceVariant = Color(0xFFCAC4D0), // Pantone 423 C

    surfaceTint = Color(0xFFFFB0D3), // Pantone Rhodamine Red C
    inverseSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    inverseOnSurface = Color(0xFF313033), // Pantone Black 7 C

    error = Color(0xFFFFB4A9), // Pantone 177 C
    onError = Color(0xFF680003), // Pantone 1807 C
    errorContainer = Color(0xFFFFDAD4), // Pantone 171 C
    onErrorContainer = Color(0xFF930006), // Pantone 1805 C

    outline = Color(0xFF938F99), // Pantone 429 C
    outlineVariant = Color(0xFF49454F), // Pantone 424 C
    scrim = Color(0xFF000000) // Hitam untuk scrim
)

// HlsmColorScheme "Lolipop"
internal val LolipopColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Lolipop",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Colorful),
    light = lolipopLightColorScheme,
    dark = lolipopDarkColorScheme
)