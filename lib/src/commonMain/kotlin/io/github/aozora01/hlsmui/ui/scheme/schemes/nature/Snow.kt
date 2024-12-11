package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Snow
private val snowLightColorScheme = lightColorScheme(
    primary = Color(0xFF64B5F6),  // Sky blue (Pantone 292 C)
    onPrimary = Color(0xFF00324A),  // Dark blue for contrast on primary
    primaryContainer = Color(0xFFCCE4FF),  // Light sky blue for container (Pantone 290 C)
    onPrimaryContainer = Color(0xFF004E71),  // Darker blue for text on container

    secondary = Color(0xFF607D8B),  //  Bluish gray (Pantone 541 C)
    onSecondary = Color(0xFFFFFFFF),  // White for contrast
    secondaryContainer = Color(0xFFD7E3EB),  // Light bluish gray for container (Pantone 540 C)
    onSecondaryContainer = Color(0xFF1C343D),  // Dark bluish gray for contrast

    tertiary = Color(0xFF64B5F6),  // Sky blue (Pantone 292 C) - Same as primary for harmony
    onTertiary = Color(0xFF00324A),  // Dark blue for contrast on tertiary
    tertiaryContainer = Color(0xFFCCE4FF),  // Light sky blue for container (Pantone 290 C)
    onTertiaryContainer = Color(0xFF004E71),  // Darker blue for contrast

    background = Color(0xFFFDFEFF),  // Off-white background with a hint of blue
    onBackground = Color(0xFF1A1C1E),  // Dark gray for text on background

    surface = Color(0xFFFDFEFF),  // Off-white surface with a hint of blue
    onSurface = Color(0xFF1A1C1E),  // Dark gray for text on surface
    surfaceVariant = Color(0xFFE1E3E5),  // Light gray for surface variant
    onSurfaceVariant = Color(0xFF43474E),  // Darker gray for contrast

    surfaceTint = Color(0xFF64B5F6),  // Tint with sky blue
    inverseSurface = Color(0xFF2F3133),  // Dark gray surface inverse
    inverseOnSurface = Color(0xFFE4E6E8),  // Light gray text for contrast

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFF9DEDC),  // Light red container for error
    onErrorContainer = Color(0xFF410E0B),  // Dark red contrast in error container

    outline = Color(0xFF73777F),  // Grayish outline
    outlineVariant = Color(0xFFC3C7CF),  // Lighter gray outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Snow
private val snowDarkColorScheme = darkColorScheme(
    primary = Color(0xFF00688F),  // Darker sky blue (Pantone 300 C)
    onPrimary = Color(0xFFB1E5FF),  // Light sky blue for contrast
    primaryContainer = Color(0xFF004E71),  // Dark blue container
    onPrimaryContainer = Color(0xFFCCE4FF),  // Light sky blue for contrast

    secondary = Color(0xFFBFC9D2),  // Light bluish gray (Pantone 540 C)
    onSecondary = Color(0xFF25414B),  // Dark bluish gray for contrast
    secondaryContainer = Color(0xFF3B5862),  // Dark bluish gray container
    onSecondaryContainer = Color(0xFFD7E3EB),  // Light bluish gray for contrast

    tertiary = Color(0xFF00688F),  // Darker sky blue (Pantone 300 C) - Same as primary
    onTertiary = Color(0xFFB1E5FF),  // Light sky blue for contrast
    tertiaryContainer = Color(0xFF004E71),  // Dark blue container for tertiary
    onTertiaryContainer = Color(0xFFCCE4FF),  // Light sky blue for contrast

    background = Color(0xFF1A1C1E),  // Dark gray for background
    onBackground = Color(0xFFE4E6E8),  // Light gray for contrast

    surface = Color(0xFF1A1C1E),  // Dark gray surface
    onSurface = Color(0xFFE4E6E8),  // Light gray for contrast
    surfaceVariant = Color(0xFF43474E),  // Darker gray surface variant
    onSurfaceVariant = Color(0xFFC3C7CF),  // Lighter gray for contrast

    surfaceTint = Color(0xFF00688F),  // Tint with darker sky blue
    inverseSurface = Color(0xFFE4E6E8),  // Light gray surface inverse
    inverseOnSurface = Color(0xFF1A1C1E),  // Dark gray text on light inverse surface

    error = Color(0xFFF2B8B5),  // Light red for error
    onError = Color(0xFF601410),  // Dark red for text on error
    errorContainer = Color(0xFF8C1D18),  // Darker red for error container
    onErrorContainer = Color(0xFFF9DEDC),  // Light red for contrast

    outline = Color(0xFF8D9199),  // Light gray outline
    outlineVariant = Color(0xFF43474E),  // Darker gray outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Snow
internal val SnowColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Snow",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Nature),
    light = snowLightColorScheme,
    dark = snowDarkColorScheme
)
