package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Sunset
private val sunsetLightColorScheme = lightColorScheme(
    primary = Color(0xFFFFC107),  // Gold
    onPrimary = Color(0xFF210000),  // Dark red for contrast on primary
    primaryContainer = Color(0xFFFFDC82),  // Lighter gold for container
    onPrimaryContainer = Color(0xFF410002),  // Darker red for text on container

    secondary = Color(0xFFFF9800),  // Orange
    onSecondary = Color(0xFF270A00),  // Dark brown for contrast
    secondaryContainer = Color(0xFFFFB74D),  // Lighter orange for container
    onSecondaryContainer = Color(0xFF450900),  // Darker brown for contrast

    tertiary = Color(0xFFF57C00),  // Darker orange
    onTertiary = Color(0xFF2A0800),  // Dark brown for contrast on tertiary
    tertiaryContainer = Color(0xFFFFA847),  // Lighter orange for container
    onTertiaryContainer = Color(0xFF480900),  // Darker brown for contrast

    background = Color(0xFFFFF8E1),  // Very light warm beige
    onBackground = Color(0xFF410002),  // Dark red for text on background

    surface = Color(0xFFFFF8E1),  // Very light beige for surface
    onSurface = Color(0xFF410002),  // Dark red for text on surface
    surfaceVariant = Color(0xFFFFE082),  // Light gold for surface variant
    onSurfaceVariant = Color(0xFF450900),  // Darker brown for contrast

    surfaceTint = Color(0xFFFFC107),  // Tint with gold
    inverseSurface = Color(0xFF410002),  // Dark red surface inverse
    inverseOnSurface = Color(0xFFFFF1D4),  // Light beige text for contrast

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFFFFB4AB),  // Light red container for error
    onErrorContainer = Color(0xFF410E0B),  // Dark red contrast in error container

    outline = Color(0xFF612100),  // Brownish-red outline
    outlineVariant = Color(0xFFA34500),  // Lighter orange outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Sunset
private val sunsetDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFDC82),  // Lighter gold
    onPrimary = Color(0xFF410002),  // Darker red for contrast
    primaryContainer = Color(0xFF612100),  // Dark red container
    onPrimaryContainer = Color(0xFFFFE082),  // Lighter gold for contrast

    secondary = Color(0xFFFFB74D),  // Lighter orange for secondary
    onSecondary = Color(0xFF450900),  // Dark brown for contrast
    secondaryContainer = Color(0xFF450900),  // Dark brown container
    onSecondaryContainer = Color(0xFFFFB74D),  // Lighter orange for contrast

    tertiary = Color(0xFFFFA847),  // Lighter orange
    onTertiary = Color(0xFF480900),  // Dark brown for contrast
    tertiaryContainer = Color(0xFF2A0800),  // Dark brown container for tertiary
    onTertiaryContainer = Color(0xFFFFA847),  // Lighter orange for contrast

    background = Color(0xFF410002),  // Dark red for background
    onBackground = Color(0xFFFFF1D4),  // Light warm beige for contrast

    surface = Color(0xFF410002),  // Dark red surface
    onSurface = Color(0xFFFFF1D4),  // Light warm beige for contrast
    surfaceVariant = Color(0xFF612100),  // Darker surface variant
    onSurfaceVariant = Color(0xFFFFE082),  // Lighter gold for contrast

    surfaceTint = Color(0xFFFFDC82),  // Tint with lighter gold
    inverseSurface = Color(0xFFFFF1D4),  // Light warm surface inverse
    inverseOnSurface = Color(0xFF410002),  // Dark text on light inverse surface

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFF8C1D18),  // Darker red for error container
    onErrorContainer = Color(0xFFFFB4AB),  // Light red for contrast

    outline = Color(0xFFA34500),  // Lighter orange outline
    outlineVariant = Color(0xFF612100),  // Brownish-red outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sunset
internal val SunsetColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Sunset",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Astronomy),
    light = sunsetLightColorScheme,
    dark = sunsetDarkColorScheme
)