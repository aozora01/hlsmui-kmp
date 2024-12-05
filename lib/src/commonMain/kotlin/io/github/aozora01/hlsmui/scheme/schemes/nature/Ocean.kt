package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Ocean
private val oceanLightColorScheme = lightColorScheme(
    primary = Color(0xFF006992),  // Deep teal (Pantone 326 C)
    onPrimary = Color(0xFFFFFFFF),  // White for contrast on primary
    primaryContainer = Color(0xFFB6E3FA),  // Light teal for container (Pantone 321 C)
    onPrimaryContainer = Color(0xFF002132),  // Dark teal for text on container

    secondary = Color(0xFF4A6268),  // Grayish teal (Pantone 552 C)
    onSecondary = Color(0xFFFFFFFF),  // White for contrast
    secondaryContainer = Color(0xFFCCE8EF),  // Light grayish teal for container (Pantone 550 C)
    onSecondaryContainer = Color(0xFF061F24),  // Dark grayish teal for contrast

    tertiary = Color(0xFF3F6B51),  // Greenish teal (Pantone 343 C)
    onTertiary = Color(0xFFFFFFFF),  // White for contrast on tertiary
    tertiaryContainer = Color(0xFFC0F1D9),  // Light greenish teal for container (Pantone 342 C)
    onTertiaryContainer = Color(0xFF002112),  // Dark greenish teal for contrast

    background = Color(0xFFFDFCFF),  // Off-white background
    onBackground = Color(0xFF1A1C1E),  // Dark gray for text on background

    surface = Color(0xFFFDFCFF),  // Off-white surface
    onSurface = Color(0xFF1A1C1E),  // Dark gray for text on surface
    surfaceVariant = Color(0xFFE1E3E5),  // Light gray for surface variant
    onSurfaceVariant = Color(0xFF43474E),  // Darker gray for contrast

    surfaceTint = Color(0xFF006992),  // Tint with deep teal
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

// Dark Color Scheme for Ocean
private val oceanDarkColorScheme = darkColorScheme(
    primary = Color(0xFF7AD6FF),  // Light teal (Pantone 314 C)
    onPrimary = Color(0xFF00364D),  // Darker teal for contrast
    primaryContainer = Color(0xFF004E71),  // Dark teal container
    onPrimaryContainer = Color(0xFFB6E3FA),  // Light teal for contrast

    secondary = Color(0xFFBFC9D2),  // Light grayish teal (Pantone 550 C)
    onSecondary = Color(0xFF1C343D),  // Dark grayish teal for contrast
    secondaryContainer = Color(0xFF3B5862),  // Dark grayish teal container
    onSecondaryContainer = Color(0xFFCCE8EF),  // Light grayish teal for contrast

    tertiary = Color(0xFF98D2B6),  // Light greenish teal (Pantone 342 C)
    onTertiary = Color(0xFF003821),  // Dark greenish teal for contrast
    tertiaryContainer = Color(0xFF1E4F30),  // Dark greenish teal container for tertiary
    onTertiaryContainer = Color(0xFFC0F1D9),  // Light greenish teal for contrast

    background = Color(0xFF1A1C1E),  // Dark gray for background
    onBackground = Color(0xFFE4E6E8),  // Light gray for contrast

    surface = Color(0xFF1A1C1E),  // Dark gray surface
    onSurface = Color(0xFFE4E6E8),  // Light gray for contrast
    surfaceVariant = Color(0xFF43474E),  // Darker gray surface variant
    onSurfaceVariant = Color(0xFFC3C7CF),  // Lighter gray for contrast

    surfaceTint = Color(0xFF7AD6FF),  // Tint with light teal
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

// Combine Light and Dark Color Schemes into HlsmColorScheme for Ocean
internal val OceanColorScheme = HColorScheme(
    name = "Ocean",
    categories = listOf(HColorSchemeCategory.Nature),
    light = oceanLightColorScheme,
    dark = oceanDarkColorScheme
)