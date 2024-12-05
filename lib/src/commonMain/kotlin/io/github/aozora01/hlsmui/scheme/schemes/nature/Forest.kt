package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Forest
private val forestLightColorScheme = lightColorScheme(
    primary = Color(0xFF388039),  // Forest Green
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFB8DD8A),
    onPrimaryContainer = Color(0xFF002108),

    secondary = Color(0xFF5D6148),  // Moss Green
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE1E3C7),
    onSecondaryContainer = Color(0xFF191C00),

    tertiary = Color(0xFF775650),  // Brownish Gray
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD9D0),
    onTertiaryContainer =  Color(0xFF2E120B),

    background = Color(0xFFF9FCE0),  // Light Greenish Yellow
    onBackground = Color(0xFF1A1C16),

    surface = Color(0xFFF9FCE0),  // Light Greenish Yellow
    onSurface = Color(0xFF1A1C16),
    surfaceVariant = Color(0xFFE0E2C6),
    onSurfaceVariant = Color(0xFF444739),

    surfaceTint = Color(0xFF388039),  // Forest Green
    inverseSurface = Color(0xFF2F302A),
    inverseOnSurface = Color(0xFFF1F0E7),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF74776D),
    outlineVariant = Color(0xFFC4C6B9),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Forest
private val forestDarkColorScheme = darkColorScheme(
    primary = Color(0xFF9BCC9D),
    onPrimary = Color(0xFF00390A),
    primaryContainer = Color(0xFF1C531D),
    onPrimaryContainer = Color(0xFFB8DD8A),

    secondary = Color(0xFFC5C8AC),
    onSecondary = Color(0xFF2E311B),
    secondaryContainer = Color(0xFF45482D),
    onSecondaryContainer = Color(0xFFE1E3C7),

    tertiary = Color(0xFFE6BFA9),
    onTertiary = Color(0xFF482620),
    tertiaryContainer = Color(0xFF613C35),
    onTertiaryContainer = Color(0xFFFFD9D0),

    background = Color(0xFF1A1C16),
    onBackground = Color(0xFFE3E2DC),

    surface = Color(0xFF1A1C16),
    onSurface = Color(0xFFE3E2DC),
    surfaceVariant = Color(0xFF444739),
    onSurfaceVariant = Color(0xFFC5C8AC),

    surfaceTint = Color(0xFF9BCC9D),
    inverseSurface = Color(0xFFE3E2DC),
    inverseOnSurface = Color(0xFF1A1C16),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8D9183),
    outlineVariant = Color(0xFF434739),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Forest
internal val ForestColorScheme = HColorScheme(
    name = "Forest",
    categories = listOf(HColorSchemeCategory.Nature),
    light = forestLightColorScheme,
    dark = forestDarkColorScheme
)