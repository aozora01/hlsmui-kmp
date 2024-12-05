package io.github.firzaelbuho.hlsmui.styles.scheme.colorful

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Cupcake
private val cupcakeLightColorScheme = lightColorScheme(
    primary = Color(0xFF9C3880),  // Pinkish Purple
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFD7F3),
    onPrimaryContainer = Color(0xFF3E0033),

    secondary = Color(0xFF6C57A7),  // Light Purple
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE9DDFF),
    onSecondaryContainer = Color(0xFF261440),

    tertiary = Color(0xFF824B99),  // Mauve
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD7F7),
    onTertiaryContainer =  Color(0xFF350049),

    background = Color(0xFFFFFBFE),  // Almost White
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFFFBFE),  // Almost White
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE2E1EC),
    onSurfaceVariant = Color(0xFF45464F),

    surfaceTint = Color(0xFF9C3880),  // Pinkish Purple
    inverseSurface = Color(0xFF313033),
    inverseOnSurface = Color(0xFFF2F0F4),

    error = Color(0xFFBA1A1A),  // Red
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF74777F),
    outlineVariant = Color(0xFFCAC4D0),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Cupcake
private val cupcakeDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFB1D8),
    onPrimary = Color(0xFF660055),
    primaryContainer = Color(0xFF8C006C),
    onPrimaryContainer = Color(0xFFFFD7F3),

    secondary = Color(0xFFD3BDFF),
    onSecondary = Color(0xFF392963),
    secondaryContainer = Color(0xFF50437A),
    onSecondaryContainer = Color(0xFFE9DDFF),

    tertiary = Color(0xFFE9B9EE),
    onTertiary = Color(0xFF4B135D),
    tertiaryContainer = Color(0xFF642A73),
    onTertiaryContainer = Color(0xFFFFD7F7),

    background = Color(0xFF1C1B1F),
    onBackground = Color(0xFFE3E2E6),

    surface = Color(0xFF1C1B1F),
    onSurface = Color(0xFFE3E2E6),
    surfaceVariant = Color(0xFF45464F),
    onSurfaceVariant = Color(0xFFC7C6DC),

    surfaceTint = Color(0xFFFFB1D8),
    inverseSurface = Color(0xFFE3E2E6),
    inverseOnSurface = Color(0xFF1C1B1F),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8D9199),
    outlineVariant = Color(0xFF43474E),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Cupcake
internal val CupcakeColorScheme = HColorScheme(
    name = "Cupcake",
    categories = listOf(HColorSchemeCategory.Colorful),
    light = cupcakeLightColorScheme,
    dark = cupcakeDarkColorScheme
)
