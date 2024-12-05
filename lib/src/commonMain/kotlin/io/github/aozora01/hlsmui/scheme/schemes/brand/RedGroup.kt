package io.github.firzaelbuho.hlsmui.styles.scheme.brand
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme "RedGroup"
private val redGroupLightColorScheme = lightColorScheme(
    primary = Color(0xFFFF4848), // Pantone 179 C (Merah JKT48)
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFFFFD9D7), // Pantone 171 C
    onPrimaryContainer = Color(0xFF680003), // Pantone 1807 C

    secondary = Color(0xFF00A1D6), // Pantone 293 C (Biru Cerah)
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFCCE1FF), // Pantone 292 C
    onSecondaryContainer = Color(0xFF00225A), // Pantone 2945 C

    tertiary = Color(0xFFFFC107), // Pantone 109 C (Kuning Cerah)
    onTertiary = Color(0xFF493E00), // Pantone 1245 C
    tertiaryContainer = Color(0xFFFFF9C4), // Pantone 102 C
    onTertiaryContainer = Color(0xFF7A6000), // Pantone 130 C

    background = Color(0xFFFFFFFF), // White
    onBackground = Color(0xFF1C1B1E), // Pantone Black 7 C

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF1C1B1E), // Pantone Black 7 C
    surfaceVariant = Color(0xFFE7E0EC), // Pantone 422 C
    onSurfaceVariant = Color(0xFF49454F), // Pantone 424 C

    surfaceTint = Color(0xFFFF4848), // Pantone 179 C
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

// Dark Color Scheme "RedGroup"
private val redGroupDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFB0A9), // Pantone 177 C
    onPrimary = Color(0xFF680003), // Pantone 1807 C
    primaryContainer = Color(0xFF930006), // Pantone 1805 C
    onPrimaryContainer = Color(0xFFFFDAD4), // Pantone 171 C

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

    surfaceTint = Color(0xFFFFB0A9), // Pantone 177 C
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

// HlsmColorScheme "RedGroup"
internal val RedGroupColorScheme = HColorScheme(
    name = "RedGroup",
    categories = listOf(HColorSchemeCategory.Brand),
    light = redGroupLightColorScheme,
    dark = redGroupDarkColorScheme
)