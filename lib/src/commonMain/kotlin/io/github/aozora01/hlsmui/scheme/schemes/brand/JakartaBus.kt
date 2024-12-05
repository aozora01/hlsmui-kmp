package io.github.firzaelbuho.hlsmui.styles.scheme.brand
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.aozora01.hlsmui.scheme.HColorScheme
import io.github.aozora01.hlsmui.scheme.HColorSchemeCategory

// Light Color Scheme for Jakarta Bus
private val jakartaBusLightColorScheme = lightColorScheme(
    primary = Color(0xFFFF6F00), // Oranye Transjakarta
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFD180),
    onPrimaryContainer = Color(0xFF000000),
    inversePrimary = Color(0xFF4D4D4D),

    secondary = Color(0xFF0071BC), // Biru tua Transjakarta
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFCCE6FF), // Container biru muda
    onSecondaryContainer = Color(0xFF000000),

    tertiary = Color(0xFFE0E0E0),  // Abu-abu sebagai warna netral
    onTertiary = Color(0xFF000000),
    tertiaryContainer = Color(0xFFF5F5F5),
    onTertiaryContainer = Color(0xFF000000),

    background = Color(0xFFFFFFFF),  // Putih untuk latar belakang
    onBackground = Color(0xFF000000),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),

    surfaceVariant = Color(0xFFE0E0E0),  // Abu-abu sebagai variasi surface
    onSurfaceVariant = Color(0xFF000000),

    surfaceTint = Color(0xFFFF6F00),

    inverseSurface = Color(0xFF424242),
    inverseOnSurface = Color(0xFFE0E0E0),

    error = Color(0xFFB3261E),  // Merah yang lebih sesuai Material Design
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFF9DEDC),
    onErrorContainer = Color(0xFF410E0B),

    outline = Color(0xFF79747E),  // Outline abu-abu netral
    outlineVariant = Color(0xFFCAC4D0),

    scrim = Color(0x80000000),
)

// Dark Color Scheme for Jakarta Bus
private val jakartaBusDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6F00),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF985600), // Container oranye gelap
    onPrimaryContainer = Color(0xFFFFFFFF),

    secondary = Color(0xFF0071BC),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF004C8C), // Container biru gelap
    onSecondaryContainer = Color(0xFFFFFFFF),

    tertiary = Color(0xFFE0E0E0),
    onTertiary = Color(0xFF000000),
    tertiaryContainer = Color(0xFFBDBDBD), // Container abu-abu gelap
    onTertiaryContainer = Color(0xFFFFFFFF),

    background = Color(0xFF121212),
    onBackground = Color(0xFFE0E0E0),

    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFE0E0E0),

    surfaceVariant = Color(0xFF49454F),  // Abu-abu gelap sebagai variasi surface
    onSurfaceVariant = Color(0xFFCAC4D0),

    surfaceTint = Color(0xFFFF6F00),

    inverseSurface = Color(0xFFD0D0D0),
    inverseOnSurface = Color(0xFF000000),

    error = Color(0xFFF2B8B5),  // Merah yang lebih sesuai Material Design
    onError = Color(0xFF601410),
    errorContainer = Color(0xFF8C1D18),
    onErrorContainer = Color(0xFFF9DEDC),

    outline = Color(0xFF938F99),  // Outline abu-abu netral
    outlineVariant = Color(0xFF49454F),

    scrim = Color(0x80000000),
)

// Combine into HlsmColorScheme
internal val JakartaBusColorScheme = HColorScheme(
    name = "Jakarta Bus",
    categories = listOf(HColorSchemeCategory.Brand),
    light = jakartaBusLightColorScheme,
    dark = jakartaBusDarkColorScheme
)