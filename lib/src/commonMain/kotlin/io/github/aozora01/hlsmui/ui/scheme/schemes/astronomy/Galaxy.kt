package io.github.firzaelbuho.hlsmui.styles.scheme.astronomy


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.ui.scheme.HColorScheme
import io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory


// Light Color Scheme for Galaxy
private val galaxyLightColorScheme = lightColorScheme(
    primary = Color(0xFF6B56C4),  // Deep Purple
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFEADDFF),
    onPrimaryContainer = Color(0xFF21005D),

    secondary = Color(0xFF595D70),  // Grayish Blue
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFDCE2F9),
    onSecondaryContainer = Color(0xFF161A29),

    tertiary = Color(0xFF7D576B),  // Dusky Rose
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD8E4),
    onTertiaryContainer =  Color(0xFF311123),

    background = Color(0xFFFEFBFF),  // Very Light Purple
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFEFBFF),  // Very Light Purple
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE2E1EC),
    onSurfaceVariant = Color(0xFF45464F),

    surfaceTint = Color(0xFF6B56C4),  // Deep Purple
    inverseSurface = Color(0xFF313033),
    inverseOnSurface = Color(0xFFF2F0F4),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF74777F),
    outlineVariant = Color(0xFFCAC4D0),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Galaxy
private val galaxyDarkColorScheme = darkColorScheme(
    primary = Color(0xFFD0BCFF),
    onPrimary = Color(0xFF381E72),
    primaryContainer = Color(0xFF4F378A),
    onPrimaryContainer = Color(0xFFEADDFF),

    secondary = Color(0xFFC5C7DD),
    onSecondary = Color(0xFF2E3141),
    secondaryContainer = Color(0xFF454858),
    onSecondaryContainer = Color(0xFFDCE2F9),

    tertiary = Color(0xFFEFB8D2),
    onTertiary = Color(0xFF492532),
    tertiaryContainer = Color(0xFF633B48),
    onTertiaryContainer = Color(0xFFFFD8E4),

    background = Color(0xFF1C1B1F),
    onBackground = Color(0xFFE3E2E6),

    surface = Color(0xFF1C1B1F),
    onSurface = Color(0xFFE3E2E6),
    surfaceVariant = Color(0xFF45464F),
    onSurfaceVariant = Color(0xFFC5C7DD),

    surfaceTint = Color(0xFFD0BCFF),
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

// Combine Light and Dark Color Schemes into HlsmColorScheme for Galaxy
internal val GalaxyColorScheme = io.github.aozora01.hlsmui.ui.scheme.HColorScheme(
    name = "Galaxy",
    categories = listOf(io.github.aozora01.hlsmui.ui.scheme.HColorSchemeCategory.Astronomy),
    light = galaxyLightColorScheme,
    dark = galaxyDarkColorScheme
)