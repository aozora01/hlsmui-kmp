package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Eclipse
private val eclipseLightColorScheme = lightColorScheme(
    primary = Color(0xFF673AB7),  // Deep purple (Pantone 267 C)
    onPrimary = Color(0xFFFFFFFF),  // White for contrast on primary
    primaryContainer = Color(0xFFEADEFC),  // Light lavender for container (Pantone 265 C)
    onPrimaryContainer = Color(0xFF21005D),  // Dark purple for text on container

    secondary = Color(0xFF625B71),  //  Grayish purple (Pantone 433 C)
    onSecondary = Color(0xFFFFFFFF),  // White for contrast
    secondaryContainer = Color(0xFFE8DEF8),  // Light grayish purple for container (Pantone 431 C)
    onSecondaryContainer = Color(0xFF1D192B),  // Dark grayish purple for contrast

    tertiary = Color(0xFF7D5260),  // Dusty rose (Pantone 7437 C)
    onTertiary = Color(0xFFFFFFFF),  // White for contrast on tertiary
    tertiaryContainer = Color(0xFFFFD8E4),  // Light dusty rose for container (Pantone 7435 C)
    onTertiaryContainer = Color(0xFF31111D),  // Dark dusty rose for contrast

    background = Color(0xFFFDFCFB),  // Off-white background
    onBackground = Color(0xFF1C1B1F),  // Dark gray for text on background

    surface = Color(0xFFFDFCFB),  // Off-white surface
    onSurface = Color(0xFF1C1B1F),  // Dark gray for text on surface
    surfaceVariant = Color(0xFFE7E0EC),  // Light gray for surface variant
    onSurfaceVariant = Color(0xFF49454F),  // Darker gray for contrast

    surfaceTint = Color(0xFF673AB7),  // Tint with deep purple
    inverseSurface = Color(0xFF313033),  // Dark gray surface inverse
    inverseOnSurface = Color(0xFFE6E1E5),  // Light gray text for contrast

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFF9DEDC),  // Light red container for error
    onErrorContainer = Color(0xFF410E0B),  // Dark red contrast in error container

    outline = Color(0xFF79747E),  // Grayish outline
    outlineVariant = Color(0xFFCAC4D0),  // Lighter gray outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Eclipse
private val eclipseDarkColorScheme = darkColorScheme(
    primary = Color(0xFFD0BCFF),  // Light purple (Pantone 265 C)
    onPrimary = Color(0xFF381E72),  // Darker purple for contrast
    primaryContainer = Color(0xFF4F378B),  // Dark purple container
    onPrimaryContainer = Color(0xFFEADEFC),  // Light lavender for contrast

    secondary = Color(0xFFCCC2DC),  // Light grayish purple (Pantone 431 C)
    onSecondary = Color(0xFF332D41),  // Dark grayish purple for contrast
    secondaryContainer = Color(0xFF4A4458),  // Dark grayish purple container
    onSecondaryContainer = Color(0xFFE8DEF8),  // Light grayish purple for contrast

    tertiary = Color(0xFFEFB8C8),  // Light dusty rose (Pantone 7435 C)
    onTertiary = Color(0xFF492532),  // Dark dusty rose for contrast
    tertiaryContainer = Color(0xFF633B48),  // Dark dusty rose container for tertiary
    onTertiaryContainer = Color(0xFFEFB8C8),  // Light dusty rose for contrast

    background = Color(0xFF1C1B1F),  // Dark gray for background
    onBackground = Color(0xFFE6E1E5),  // Light gray for contrast

    surface = Color(0xFF1C1B1F),  // Dark gray surface
    onSurface = Color(0xFFE6E1E5),  // Light gray for contrast
    surfaceVariant = Color(0xFF49454F),  // Darker gray surface variant
    onSurfaceVariant = Color(0xFFCAC4D0),  // Lighter gray for contrast

    surfaceTint = Color(0xFFD0BCFF),  // Tint with light purple
    inverseSurface = Color(0xFFE6E1E5),  // Light gray surface inverse
    inverseOnSurface = Color(0xFF1C1B1F),  // Dark gray text on light inverse surface

    error = Color(0xFFF2B8B5),  // Light red for error
    onError = Color(0xFF601410),  // Dark red for text on error
    errorContainer = Color(0xFF8C1D18),  // Darker red for error container
    onErrorContainer = Color(0xFFF9DEDC),  // Light red for contrast

    outline = Color(0xFF938F99),  // Light gray outline
    outlineVariant = Color(0xFF49454F),  // Darker gray outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Eclipse
internal val EclipseColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Eclipse",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Astronomy),
    light = eclipseLightColorScheme,
    dark = eclipseDarkColorScheme
)

