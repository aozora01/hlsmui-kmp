package io.github.firzaelbuho.hlsmui.styles.scheme.nature


// Light Color Scheme for Lavender
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Lavender
private val lavenderLightColorScheme = lightColorScheme(
    primary = Color(0xFF6B56C4),  // Lavender
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFE9DDFF),
    onPrimaryContainer = Color(0xFF22005E),

    secondary = Color(0xFF5C5D71),  // Grayish Purple
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE1E0F9),
    onSecondaryContainer = Color(0xFF191A2B),

    tertiary = Color(0xFF76576E),  // Dusky Rose
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD8E5),
    onTertiaryContainer =  Color(0xFF2E1229),

    background = Color(0xFFFEFBFF),  // Very Light Purple
    onBackground = Color(0xFF1C1B1F),

    surface = Color(0xFFFEFBFF),  // Very Light Purple
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE2E2EC),
    onSurfaceVariant = Color(0xFF44474F),

    surfaceTint = Color(0xFF6B56C4),  // Lavender
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

// Dark Color Scheme for Lavender
private val lavenderDarkColorScheme = darkColorScheme(
    primary = Color(0xFFD1BCFF),
    onPrimary = Color(0xFF381E73),
    primaryContainer = Color(0xFF4F378B),
    onPrimaryContainer = Color(0xFFE9DDFF),

    secondary = Color(0xFFC6C7DC),
    onSecondary = Color(0xFF2F3042),
    secondaryContainer = Color(0xFF464759),
    onSecondaryContainer = Color(0xFFE1E0F9),

    tertiary = Color(0xFFE5B9D7),
    onTertiary = Color(0xFF482533),
    tertiaryContainer = Color(0xFF603B49),
    onTertiaryContainer = Color(0xFFFFD8E5),

    background = Color(0xFF1C1B1F),
    onBackground = Color(0xFFE3E2E6),

    surface = Color(0xFF1C1B1F),
    onSurface = Color(0xFFE3E2E6),
    surfaceVariant = Color(0xFF44474F),
    onSurfaceVariant = Color(0xFFC6C7DC),

    surfaceTint = Color(0xFFD1BCFF),
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

// Combine Light and Dark Color Schemes into HlsmColorScheme for Lavender
internal val LavenderColorScheme = HColorScheme(
    name = "Lavender",
    categories = listOf(HColorSchemeCategory.Nature),
    light = lavenderLightColorScheme,
    dark = lavenderDarkColorScheme
)

