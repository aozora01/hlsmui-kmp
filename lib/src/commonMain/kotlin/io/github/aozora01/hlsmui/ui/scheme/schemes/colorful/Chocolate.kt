package io.github.firzaelbuho.hlsmui.styles.scheme.colorful

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Chocolate
private val chocolateLightColorScheme = lightColorScheme(
    primary = Color(0xFF663A2C),  // Milk Chocolate
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFE5C0A9),
    onPrimaryContainer = Color(0xFF20150C),

    secondary = Color(0xFF59443B),  // Dark Chocolate
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFDDCFB3),
    onSecondaryContainer = Color(0xFF18120E),

    tertiary = Color(0xFF765642),  // Caramel
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD9BD),
    onTertiaryContainer =  Color(0xFF2C1600),

    background = Color(0xFFFEFBFF),  // Off-White
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFEFBFF),  // Off-White
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE2E1EC),
    onSurfaceVariant = Color(0xFF45464F),

    surfaceTint = Color(0xFF663A2C),  // Milk Chocolate
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

// Dark Color Scheme for Chocolate
private val chocolateDarkColorScheme = darkColorScheme(
    primary = Color(0xFFC7A99A),
    onPrimary = Color(0xFF372019),
    primaryContainer = Color(0xFF4D3629),
    onPrimaryContainer = Color(0xFFE5C0A9),

    secondary = Color(0xFFC8B9A7),
    onSecondary = Color(0xFF2F281E),
    secondaryContainer = Color(0xFF463F2F),
    onSecondaryContainer = Color(0xFFDDCFB3),

    tertiary = Color(0xFFE6C3A4),
    onTertiary = Color(0xFF432A0D),
    tertiaryContainer = Color(0xFF5D3F21),
    onTertiaryContainer = Color(0xFFFFD9BD),

    background = Color(0xFF1C1B1F),
    onBackground = Color(0xFFE3E2E6),

    surface = Color(0xFF1C1B1F),
    onSurface = Color(0xFFE3E2E6),
    surfaceVariant = Color(0xFF45464F),
    onSurfaceVariant = Color(0xFFC8B9A7),

    surfaceTint = Color(0xFFC7A99A),
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

// Combine Light and Dark Color Schemes into HlsmColorScheme for Chocolate
internal val ChocolateColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Chocolate",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Colorful),
    light = chocolateLightColorScheme,
    dark = chocolateDarkColorScheme
)
