package io.github.firzaelbuho.hlsmui.styles.scheme.brand

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for LangitBiru
private val langitBiruLightColorScheme = lightColorScheme(
    primary = Color(0xFF0096FF),  // True Blue
    onPrimary = Color(0xFFFFFFFF),  // White for text on primary
    primaryContainer = Color(0xFFB3E5FF),  // Light blue for primary container
    onPrimaryContainer = Color(0xFF002744),  // Dark blue for text on primary container

    secondary = Color(0xFF0072CC),  // Medium blue for secondary
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFFB3D8FF),  // Light blue for secondary container
    onSecondaryContainer = Color(0xFF003B66),  // Dark blue for text on secondary container

    tertiary = Color(0xFF00C2FF),  // Bright cyan for accent
    onTertiary = Color(0xFF003B4D),  // Dark blue-cyan for text on tertiary
    tertiaryContainer = Color(0xFF80F1FF),  // Light cyan for tertiary container
    onTertiaryContainer = Color(0xFF002C36),  // Dark cyan for text on tertiary container

    background = Color(0xFFE6F7FF),  // Very light blue background
    onBackground = Color(0xFF002744),  // Dark blue for text on background

    surface = Color(0xFFE6F7FF),  // Light blue surface
    onSurface = Color(0xFF002744),  // Dark blue for text on surface
    surfaceVariant = Color(0xFFB3E5FF),  // Light blue variant for surface
    onSurfaceVariant = Color(0xFF003B66),  // Dark blue for text on surface variant

    surfaceTint = Color(0xFF0096FF),  // Tint with True Blue
    inverseSurface = Color(0xFF003B66),  // Dark blue for inverse surface
    inverseOnSurface = Color(0xFFB3E5FF),  // Light blue for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFCDD2),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFF0072CC),  // Medium blue for outline
    outlineVariant = Color(0xFFB3E5FF),  // Light blue for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for LangitBiru
private val langitBiruDarkColorScheme = darkColorScheme(
    primary = Color(0xFFB3E5FF),  // Light blue for primary
    onPrimary = Color(0xFF002744),  // Dark blue for text on primary
    primaryContainer = Color(0xFF0072CC),  // Medium blue for primary container
    onPrimaryContainer = Color(0xFFE6F7FF),  // Very light blue for text on primary container

    secondary = Color(0xFF80B3FF),  // Light blue for secondary
    onSecondary = Color(0xFF003B66),  // Dark blue for text on secondary
    secondaryContainer = Color(0xFF00509E),  // Medium blue for secondary container
    onSecondaryContainer = Color(0xFFB3D8FF),  // Light blue for text on secondary container

    tertiary = Color(0xFF80F1FF),  // Light cyan for tertiary
    onTertiary = Color(0xFF003B4D),  // Dark blue-cyan for text on tertiary
    tertiaryContainer = Color(0xFF00A1D6),  // Bright cyan for tertiary container
    onTertiaryContainer = Color(0xFF80F1FF),  // Light cyan for text on tertiary container

    background = Color(0xFF002744),  // Dark blue for background
    onBackground = Color(0xFFB3E5FF),  // Light blue for text on background

    surface = Color(0xFF002744),  // Dark blue for surface
    onSurface = Color(0xFFB3E5FF),  // Light blue for text on surface
    surfaceVariant = Color(0xFF003B66),  // Dark blue variant for surface
    onSurfaceVariant = Color(0xFFB3E5FF),  // Light blue for text on surface variant

    surfaceTint = Color(0xFFB3E5FF),  // Tint with light blue
    inverseSurface = Color(0xFFB3E5FF),  // Light blue for inverse surface
    inverseOnSurface = Color(0xFF003B66),  // Dark blue for text on inverse surface

    error = Color(0xFFFFCDD2),  // Light red for error
    onError = Color(0xFFD32F2F),  // Dark red for text on error
    errorContainer = Color(0xFFB71C1C),  // Dark red for error container
    onErrorContainer = Color(0xFFFFCDD2),  // Light red for text on error container

    outline = Color(0xFF80B3FF),  // Light blue for outline
    outlineVariant = Color(0xFF0072CC),  // Medium blue for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for LangitBiru
internal val LangitBiruColorScheme = HColorScheme(
    name = "Langit Biru",
    categories = listOf(HColorSchemeCategory.Brand),
    light = langitBiruLightColorScheme,
    dark = langitBiruDarkColorScheme
)

