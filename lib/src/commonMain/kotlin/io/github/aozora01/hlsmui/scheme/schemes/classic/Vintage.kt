package io.github.firzaelbuho.hlsmui.styles.scheme.classic

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme "Vintage"
private val vintageLightColorScheme = lightColorScheme(
    primary = Color(0xFFA7963C), // Pantone 7406 C
    onPrimary = Color(0xFF252415), // Pantone 4695 C
    primaryContainer = Color(0xFFC5C098), // Pantone 7404 C
    onPrimaryContainer = Color(0xFF3D3B21), // Pantone 7548 C

    secondary = Color(0xFF847B45), // Pantone 7497 C
    onSecondary = Color(0xFF222116), // Pantone 4645 C
    secondaryContainer = Color(0xFFA9A26A), // Pantone 7501 C
    onSecondaryContainer = Color(0xFF3B3A27), // Pantone 7547 C

    tertiary = Color(0xFFCA7373), // Pantone 485 C
    onTertiary = Color(0xFF411C1C), // Pantone 4895 C
    tertiaryContainer = Color(0xFFDCA3A3), // Pantone 181 C
    onTertiaryContainer = Color(0xFF5D2828), // Pantone 187 C

    background = Color(0xFFF9F6ED), // Pantone 7541 C
    onBackground = Color(0xFF1D1B16), // Pantone Black 7 C

    surface = Color(0xFFFDFCF6), // Pantone 114 C
    onSurface = Color(0xFF1D1B16), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFFA7963C), // Pantone 7406 C
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

// Dark Color Scheme "Vintage"
private val vintageDarkColorScheme = darkColorScheme(
    primary = Color(0xFFB6AC6F), // Pantone 7402 C
    onPrimary = Color(0xFF3C3A25), // Pantone 7546 C
    primaryContainer = Color(0xFF53503B), // Pantone 7547 C
    onPrimaryContainer = Color(0xFFC0BA8F), // Pantone 7403 C

    secondary = Color(0xFF99926B), // Pantone 7499 C
    onSecondary = Color(0xFF393828), // Pantone 462 C
    secondaryContainer = Color(0xFF52503E), // Pantone 463 C
    onSecondaryContainer = Color(0xFFBDB68F), // Pantone 7503 C

    tertiary = Color(0xFFD8C2C2), // Pantone 701 C
    onTertiary = Color(0xFF5B2F2F), // Pantone 484 C
    tertiaryContainer = Color(0xFF784545), // Pantone 1805 C
    onTertiaryContainer = Color(0xFFEFBDBD), // Pantone 177 C

    background = Color(0xFF1C1B1E), // Pantone Black 7 C
    onBackground = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C

    surface = Color(0xFF1C1B1E), // Pantone Black 7 C
    onSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    surfaceVariant = Color(0xFF49454F), // Pantone 424 C
    onSurfaceVariant = Color(0xFFCAC4D0), // Pantone 423 C

    surfaceTint = Color(0xFFB6AC6F), // Pantone 7402 C
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

// HlsmColorScheme "Vintage"
internal val VintageColorScheme = HColorScheme(
    name = "Vintage",
    categories = listOf(HColorSchemeCategory.Classic),
    light = vintageLightColorScheme,
    dark = vintageDarkColorScheme
)