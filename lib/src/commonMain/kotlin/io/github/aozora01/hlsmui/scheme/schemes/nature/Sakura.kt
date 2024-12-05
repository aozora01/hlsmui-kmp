package io.github.firzaelbuho.hlsmui.styles.scheme.nature
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Warna dari Pantone yang akan digunakan
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.*

// Light Color Scheme for Sakura
private val sakuraLightColorScheme = lightColorScheme(
    primary = Color(0xFFF1D9E7),  // Pink Dogwood
    onPrimary = Color(0xFF210036),  // Deep Purple
    primaryContainer = Color(0xFFFFF0F7),  // Pale Pink Dogwood
    onPrimaryContainer = Color(0xFF7D004F),  // Deep Red

    secondary = Color(0xFFE2B9D5),  // Light Pink
    onSecondary = Color(0xFF28003A),  // Deep Purple
    secondaryContainer = Color(0xFFFFE0EC),  // Very Light Pink
    onSecondaryContainer = Color(0xFF840056),  // Deep Red

    tertiary = Color(0xFFC5B7E7),  // Light Purple
    onTertiary = Color(0xFF1D004B),  // Deep Purple
    tertiaryContainer = Color(0xFFE7DEFF),  // Very Light Purple
    onTertiaryContainer = Color(0xFF4A007A),  // Deep Purple

    background = Color(0xFFFFFBFE),  // Almost White
    onBackground = Color(0xFF1C1B1F),  // Dark Gray

    surface = Color(0xFFFFFBFE),  // Almost White
    onSurface = Color(0xFF1C1B1F),  // Dark Gray
    surfaceVariant = Color(0xFFE1E2EC),  // Light Gray
    onSurfaceVariant = Color(0xFF44474F),  // Dark Gray

    surfaceTint = Color(0xFFDB4C73),  // Deep Pink
    inverseSurface = Color(0xFF313033),  // Dark Gray
    inverseOnSurface = Color(0xFFF2F0F4),  // Light Gray

    error = Color(0xFFBA1A1A),  // Red
    onError = Color(0xFFFFFFFF),  // White
    errorContainer = Color(0xFFFFDAD6),  // Light Red
    onErrorContainer = Color(0xFF410002),  // Dark Red

    outline = Color(0xFF74777F),  // Gray
    outlineVariant = Color(0xFFCAC4D0),  // Light Gray
    scrim = Color(0xFF000000)  // Black
)

// Dark Color Scheme for Sakura
private val sakuraDarkColorScheme = darkColorScheme(
    primary = Color(0xFFDB4C73),  // Deep Pink
    onPrimary = Color(0xFFFFE0EC),  // Very Light Pink
    primaryContainer = Color(0xFF930041),  // Deep Red
    onPrimaryContainer = Color(0xFFFFD9E7),  // Light Pink

    secondary = Color(0xFFDB4C73),  // Deep Pink
    onSecondary = Color(0xFFFFE0EC),  // Very Light Pink
    secondaryContainer = Color(0xFF930041),  // Deep Red
    onSecondaryContainer = Color(0xFFFFD9E7),  // Light Pink

    tertiary = Color(0xFFB3A0E2),  // Light Purple
    onTertiary = Color(0xFF300067),  // Deep Purple
    tertiaryContainer = Color(0xFF482780),  // Deep Purple
    onTertiaryContainer = Color(0xFFD8C2EE),  // Light Purple

    background = Color(0xFF1C1B1F),  // Dark Gray
    onBackground = Color(0xFFE3E2E6),  // Light Gray

    surface = Color(0xFF1C1B1F),  // Dark Gray
    onSurface = Color(0xFFE3E2E6),  // Light Gray
    surfaceVariant = Color(0xFF44474F),  // Dark Gray
    onSurfaceVariant = Color(0xFFC6C7DC),  // Light Gray

    surfaceTint = Color(0xFFDB4C73),  // Deep Pink
    inverseSurface = Color(0xFFE3E2E6),  // Light Gray
    inverseOnSurface = Color(0xFF1C1B1F),  // Dark Gray

    error = Color(0xFFFFB4AB),  // Light Red
    onError = Color(0xFF690005),  // Dark Red
    errorContainer = Color(0xFF93000A),  // Dark Red
    onErrorContainer = Color(0xFFFFB4AB),  // Light Red

    outline = Color(0xFF8D9199),  // Gray
    outlineVariant = Color(0xFF43474E),  // Dark Gray
    scrim = Color(0xFF000000)  // Black
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sakura
internal val SakuraColorScheme = HColorScheme(
    name = "Sakura",
    categories = listOf(HColorSchemeCategory.Nature),
    light = sakuraLightColorScheme,
    dark = sakuraDarkColorScheme
)