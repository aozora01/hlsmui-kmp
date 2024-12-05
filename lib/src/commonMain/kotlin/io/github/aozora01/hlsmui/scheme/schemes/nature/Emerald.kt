package io.github.firzaelbuho.hlsmui.styles.scheme.nature

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory


// Light Color Scheme for Emerald
private val emeraldLightColorScheme = lightColorScheme(
    primary = Color(0xFF006D3B),  // Emerald Green
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF77F0A5),
    onPrimaryContainer = Color(0xFF00210E),

    secondary = Color(0xFF4A6241),  // Dark Green
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFCCE7BC),
    onSecondaryContainer = Color(0xFF051F07),

    tertiary = Color(0xFF53613F),  // Olive Green
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFD7E8C0),
    onTertiaryContainer =  Color(0xFF101F04),

    background = Color(0xFFF6FDE7),  // Light Greenish Yellow
    onBackground = Color(0xFF191C16),

    surface = Color(0xFFF6FDE7),  // Light Greenish Yellow
    onSurface = Color(0xFF191C16),
    surfaceVariant = Color(0xFFDEE5D0),
    onSurfaceVariant = Color(0xFF42483B),

    surfaceTint = Color(0xFF006D3B),  // Emerald Green
    inverseSurface = Color(0xFF2E312B),
    inverseOnSurface = Color(0xFFF0F0E7),

    error = Color(0xFFBA1A1A),  // Red
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    outline = Color(0xFF73786E),
    outlineVariant = Color(0xFFC3C8BA),
    scrim = Color(0xFF000000)
)

// Dark Color Scheme for Emerald
private val emeraldDarkColorScheme = darkColorScheme(
    primary = Color(0xFF5FD989),
    onPrimary = Color(0xFF00391A),
    primaryContainer = Color(0xFF005225),
    onPrimaryContainer = Color(0xFF77F0A5),

    secondary = Color(0xFFB3CEA1),
    onSecondary = Color(0xFF1C2E16),
    secondaryContainer = Color(0xFF33452A),
    onSecondaryContainer = Color(0xFFCCE7BC),

    tertiary = Color(0xFFBBC8A3),
    onTertiary = Color(0xFF243116),
    tertiaryContainer = Color(0xFF3A482A),
    onTertiaryContainer = Color(0xFFD7E8C0),

    background = Color(0xFF191C16),
    onBackground = Color(0xFFE2E3DC),

    surface = Color(0xFF191C16),
    onSurface = Color(0xFFE2E3DC),
    surfaceVariant = Color(0xFF42483B),
    onSurfaceVariant = Color(0xFFB3CEA1),

    surfaceTint = Color(0xFF5FD989),
    inverseSurface = Color(0xFFE2E3DC),
    inverseOnSurface = Color(0xFF191C16),

    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFB4AB),

    outline = Color(0xFF8C9287),
    outlineVariant = Color(0xFF42483B),
    scrim = Color(0xFF000000)
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Emerald
internal val EmeraldColorScheme = HColorScheme(
    name = "Emerald",
    categories = listOf(HColorSchemeCategory.Nature),
    light = emeraldLightColorScheme,
    dark = emeraldDarkColorScheme
)