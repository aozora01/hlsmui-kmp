package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme "Black Hole"
private val blackHoleLightColorScheme = lightColorScheme(
    primary = Color(0xFF000000), // Black (Representing the void)
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFF424242), // Dark Gray
    onPrimaryContainer = Color(0xFFDDDDDD), // Light Gray

    secondary = Color(0xFF616161), // Medium Dark Gray
    onSecondary = Color(0xFFFFFFFF), // White
    secondaryContainer = Color(0xFFE0E0E0), // Light Gray
    onSecondaryContainer = Color(0xFF121212), // Almost Black

    tertiary = Color(0xFF8D8D8D), // Light Gray
    onTertiary = Color(0xFF000000), // Black
    tertiaryContainer = Color(0xFFBDBDBD), // Medium Gray
    onTertiaryContainer = Color(0xFF303030), // Darker Gray

    background = Color(0xFF212121), // Dark Gray
    onBackground = Color(0xFFFFFFFF), // White

    surface = Color(0xFF303030), // Darker Gray
    onSurface = Color(0xFFFFFFFF), // White
    surfaceVariant = Color(0xFF424242), // Medium Gray
    onSurfaceVariant = Color(0xFFDDDDDD), // Light Gray

    surfaceTint = Color(0xFF000000), // Black
    inverseSurface = Color(0xFFE0E0E0), // Light Gray
    inverseOnSurface = Color(0xFF303030), // Darker Gray

    error = Color(0xFFFFB4A9), // Pantone 177 C
    onError = Color(0xFF680003), // Pantone 1807 C
    errorContainer = Color(0xFFFFDAD4), // Pantone 171 C
    onErrorContainer = Color(0xFF930006), // Pantone 1805 C

    outline = Color(0xFF8D8D8D), // Light Gray
    outlineVariant = Color(0xFF424242), // Medium Gray
    scrim = Color(0xFF000000) // Black
)

// Dark Color Scheme "Black Hole"
private val blackHoleDarkColorScheme = darkColorScheme(
    primary = Color(0xFFDDDDDD), // Light Gray
    onPrimary = Color(0xFF000000), // Black
    primaryContainer = Color(0xFF121212), // Almost Black
    onPrimaryContainer = Color(0xFFE0E0E0), // Light Gray

    secondary = Color(0xFFCCCCCC), // Medium Gray
    onSecondary = Color(0xFF212121), // Dark Gray
    secondaryContainer = Color(0xFF303030), // Darker Gray
    onSecondaryContainer = Color(0xFFAAAAAA), // Medium Light Gray

    tertiary = Color(0xFFAAAAAA), // Medium Light Gray
    onTertiary = Color(0xFF303030), // Darker Gray
    tertiaryContainer = Color(0xFF424242), // Medium Gray
    onTertiaryContainer = Color(0xFFBDBDBD), // Medium Gray

    background = Color(0xFF000000), // Black
    onBackground = Color(0xFFDDDDDD), // Light Gray

    surface = Color(0xFF212121), // Dark Gray
    onSurface = Color(0xFFDDDDDD), // Light Gray
    surfaceVariant = Color(0xFF303030), // Darker Gray
    onSurfaceVariant = Color(0xFFAAAAAA), // Medium Light Gray

    surfaceTint = Color(0xFFDDDDDD), // Light Gray
    inverseSurface = Color(0xFF303030), // Darker Gray
    inverseOnSurface = Color(0xFFE0E0E0), // Light Gray

    error = Color(0xFFFFB4A9), // Pantone 177 C
    onError = Color(0xFF680003), // Pantone 1807 C
    errorContainer = Color(0xFFFFDAD4), // Pantone 171 C
    onErrorContainer = Color(0xFF930006), // Pantone 1805 C

    outline = Color(0xFF8D8D8D), // Light Gray
    outlineVariant = Color(0xFF424242), // Medium Gray
    scrim = Color(0xFF000000) // Black
)

// HlsmColorScheme "Black Hole"
internal val BlackHoleColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Black Hole",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Astronomy),
    light = blackHoleLightColorScheme,
    dark = blackHoleDarkColorScheme
)