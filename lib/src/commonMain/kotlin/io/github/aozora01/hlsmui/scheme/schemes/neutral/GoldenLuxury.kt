package io.github.firzaelbuho.hlsmui.styles.scheme.neutral


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme "Golden Luxury"
private val goldenLuxuryLightColorScheme = lightColorScheme(
    primary = Color(0xFFD7B572), // Pantone 130 C
    onPrimary = Color(0xFF442D00), // Pantone 7549 C
    primaryContainer = Color(0xFFFFE9A8), // Pantone 110 C
    onPrimaryContainer = Color(0xFF634400), // Pantone 141 C

    secondary = Color(0xFF495D7C), // Pantone 5415 C
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFCCE1FF), // Pantone 292 C
    onSecondaryContainer = Color(0xFF001D36), // Pantone 2767 C

    tertiary = Color(0xFF6D577D), // Pantone 534 C
    onTertiary = Color(0xFFFFFFFF), // White
    tertiaryContainer = Color(0xFFE9D6FA), // Pantone 267 C
    onTertiaryContainer = Color(0xFF27143B), // Pantone 2685 C

    background = Color(0xFFFFFBFE), // Pantone 113 C
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFFD7B572), // Pantone 130 C
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

// Dark Color Scheme "Golden Luxury"
private val goldenLuxuryDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFDB7D), // Pantone 116 C
    onPrimary = Color(0xFF5C4F15), // Pantone 137 C
    primaryContainer = Color(0xFF7B6329), // Pantone 141 C
    onPrimaryContainer = Color(0xFFFFE9A8), // Pantone 110 C

    secondary = Color(0xFFB1C6EA), // Pantone 299 C
    onSecondary = Color(0xFF253F5B), // Pantone 549 C
    secondaryContainer = Color(0xFF3B5572), // Pantone 541 C
    onSecondaryContainer = Color(0xFFCCE1FF), // Pantone 292 C

    tertiary = Color(0xFFD7BFD8), // Pantone 2593 C
    onTertiary = Color(0xFF42294C), // Pantone 268 C
    tertiaryContainer = Color(0xFF594062), // Pantone 2676 C
    onTertiaryContainer = Color(0xFFE9D6FA), // Pantone 267 C

    background = Color(0xFF1C1B1E), // Pantone Black 7 C
    onBackground = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C

    surface = Color(0xFF1C1B1E), // Pantone Black 7 C
    onSurface = Color(0xFFE6E1E5), // Pantone Cool Gray 1 C
    surfaceVariant = Color(0xFF49454F), // Pantone 424 C
    onSurfaceVariant = Color(0xFFCAC4D0), // Pantone 423 C

    surfaceTint = Color(0xFFFFDB7D), // Pantone 116 C
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

// HlsmColorScheme "Golden Luxury"
internal val GoldenLuxuryColorScheme = HColorScheme(
    name = "Golden Luxury",
    categories = listOf(HColorSchemeCategory.Neutral),
    light = goldenLuxuryLightColorScheme,
    dark = goldenLuxuryDarkColorScheme
)