package io.github.firzaelbuho.hlsmui.styles.scheme.classic

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme "Monochrome"
private val monochromeLightColorScheme = lightColorScheme(
    primary = Color(0xFFEEEEEE), // Light Gray
    onPrimary = Color(0xFF212121), // Dark Gray
    primaryContainer = Color(0xFFF3F3F3), // Lighter Gray
    onPrimaryContainer = Color(0xFF424242), // Medium Gray

    secondary = Color(0xFFCCCCCC), // Medium Gray
    onSecondary = Color(0xFF303030), // Darker Gray
    secondaryContainer = Color(0xFFE0E0E0), // Light Gray
    onSecondaryContainer = Color(0xFF545454), // Medium Dark Gray

    tertiary = Color(0xFFAAAAAA), // Medium Light Gray
    onTertiary = Color(0xFF424242), // Medium Gray
    tertiaryContainer = Color(0xFFDDDDDD), // Light Gray
    onTertiaryContainer = Color(0xFF616161), // Medium Dark Gray

    background = Color(0xFFFFFFFF), // White
    onBackground = Color(0xFF212121), // Dark Gray

    surface = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFF212121), // Dark Gray
    surfaceVariant = Color(0xFFEEEEEE), // Light Gray
    onSurfaceVariant = Color(0xFF424242), // Medium Gray

    surfaceTint = Color(0xFFEEEEEE), // Light Gray
    inverseSurface = Color(0xFF212121), // Dark Gray
    inverseOnSurface = Color(0xFFFFFFFF), // White

    error = Color(0xFF000000), // Black
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFF424242), // Medium Gray
    onErrorContainer = Color(0xFFDDDDDD), // Light Gray

    outline = Color(0xFF757575), // Light Gray
    outlineVariant = Color(0xFFBDBDBD), // Medium Gray
    scrim = Color(0xFF000000) // Black
)

// Dark Color Scheme "Monochrome"
private val monochromeDarkColorScheme = darkColorScheme(
    primary = Color(0xFF303030), // Darker Gray
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFF121212), // Almost Black
    onPrimaryContainer = Color(0xFF424242), // Medium Gray

    secondary = Color(0xFF424242), // Medium Gray
    onSecondary = Color(0xFFE0E0E0), // Light Gray
    secondaryContainer = Color(0xFF212121), // Dark Gray
    onSecondaryContainer = Color(0xFFCCCCCC), // Medium Gray

    tertiary = Color(0xFF545454), // Medium Dark Gray
    onTertiary = Color(0xFFDDDDDD), // Light Gray
    tertiaryContainer = Color(0xFF303030), // Darker Gray
    onTertiaryContainer = Color(0xFFAAAAAA), // Medium Light Gray

    background = Color(0xFF000000), // Black
    onBackground = Color(0xFFFFFFFF), // White

    surface = Color(0xFF000000), // Black
    onSurface = Color(0xFFFFFFFF), // White
    surfaceVariant = Color(0xFF212121), // Dark Gray
    onSurfaceVariant = Color(0xFF424242), // Medium Gray

    surfaceTint = Color(0xFF303030), // Darker Gray
    inverseSurface = Color(0xFFFFFFFF), // White
    inverseOnSurface = Color(0xFF212121), // Dark Gray

    error = Color(0xFFFFFFFF), // White
    onError = Color(0xFF000000), // Black
    errorContainer = Color(0xFFDDDDDD), // Light Gray
    onErrorContainer = Color(0xFF424242), // Medium Gray

    outline = Color(0xFF8D8D8D), // Light Gray
    outlineVariant = Color(0xFF424242), // Medium Gray
    scrim = Color(0xFF000000) // Black
)

// HlsmColorScheme "Monochrome"
internal val MonochromeColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Monochrome",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Classic),
    light = monochromeLightColorScheme,
    dark = monochromeDarkColorScheme
)