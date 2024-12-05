package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Sunrise
private val sunriseLightColorScheme = lightColorScheme(
    primary = Color(0xFFFFEB3B),  // Yellow (Pantone 109 C)
    onPrimary = Color(0xFF210A00),  // Dark brown for contrast on primary
    primaryContainer = Color(0xFFFFF9C4),  // Lighter yellow for container (Pantone 100 C)
    onPrimaryContainer = Color(0xFF3F1500),  // Darker brown for text on container

    secondary = Color(0xFFFFA726),  // Orange yellow (Pantone 137 C)
    onSecondary = Color(0xFF2A0800),  // Dark brown for contrast
    secondaryContainer = Color(0xFFFFD195),  // Lighter orange yellow for container (Pantone 129 C)
    onSecondaryContainer = Color(0xFF480900),  // Darker brown for contrast

    tertiary = Color(0xFFFFC107),  // Gold (Pantone 130 C)
    onTertiary = Color(0xFF210000),  // Dark red for contrast on tertiary
    tertiaryContainer = Color(0xFFFFDC82),  // Lighter gold for container (Pantone 123 C)
    onTertiaryContainer = Color(0xFF410002),  // Darker red for contrast

    background = Color(0xFFFFFDE7),  // Very light warm yellow
    onBackground = Color(0xFF3F1500),  // Dark brown for text on background

    surface = Color(0xFFFFFDE7),  // Very light yellow for surface
    onSurface = Color(0xFF3F1500),  // Dark brown for text on surface
    surfaceVariant = Color(0xFFFFF59D),  // Light yellow for surface variant
    onSurfaceVariant = Color(0xFF480900),  // Darker brown for contrast

    surfaceTint = Color(0xFFFFEB3B),  // Tint with yellow
    inverseSurface = Color(0xFF3F1500),  // Dark brown surface inverse
    inverseOnSurface = Color(0xFFFFF4D7),  // Light yellow text for contrast

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFFFFB4AB),  // Light red container for error
    onErrorContainer = Color(0xFF410E0B),  // Dark red contrast in error container

    outline = Color(0xFF612A00),  // Brownish outline
    outlineVariant = Color(0xFFA35400),  // Lighter orange outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Sunrise
private val sunriseDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFF9C4),  // Lighter yellow (Pantone 100 C)
    onPrimary = Color(0xFF3F1500),  // Darker brown for contrast
    primaryContainer = Color(0xFF612A00),  // Dark brown container
    onPrimaryContainer = Color(0xFFFFF59D),  // Lighter yellow for contrast

    secondary = Color(0xFFFFD195),  // Lighter orange yellow (Pantone 129 C)
    onSecondary = Color(0xFF480900),  // Dark brown for contrast
    secondaryContainer = Color(0xFF480900),  // Dark brown container
    onSecondaryContainer = Color(0xFFFFD195),  // Lighter orange yellow for contrast

    tertiary = Color(0xFFFFDC82),  // Lighter gold (Pantone 123 C)
    onTertiary = Color(0xFF410002),  // Darker red for contrast
    tertiaryContainer = Color(0xFF210000),  // Dark red container for tertiary
    onTertiaryContainer = Color(0xFFFFDC82),  // Lighter gold for contrast

    background = Color(0xFF3F1500),  // Dark brown for background
    onBackground = Color(0xFFFFF4D7),  // Light warm yellow for contrast

    surface = Color(0xFF3F1500),  // Dark brown surface
    onSurface = Color(0xFFFFF4D7),  // Light warm yellow for contrast
    surfaceVariant = Color(0xFF612A00),  // Darker surface variant
    onSurfaceVariant = Color(0xFFFFF59D),  // Lighter yellow for contrast

    surfaceTint = Color(0xFFFFF9C4),  // Tint with lighter yellow
    inverseSurface = Color(0xFFFFF4D7),  // Light warm surface inverse
    inverseOnSurface = Color(0xFF3F1500),  // Dark text on light inverse surface

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFF8C1D18),  // Darker red for error container
    onErrorContainer = Color(0xFFFFB4AB),  // Light red for contrast

    outline = Color(0xFFA35400),  // Lighter orange outline
    outlineVariant = Color(0xFF612A00),  // Brownish outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sunrise
internal val SunriseColorScheme = HColorScheme(
    name = "Sunrise",
    categories = listOf(HColorSchemeCategory.Astronomy),
    light = sunriseLightColorScheme,
    dark = sunriseDarkColorScheme
)