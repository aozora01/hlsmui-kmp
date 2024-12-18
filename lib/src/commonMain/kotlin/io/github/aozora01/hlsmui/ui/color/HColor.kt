package io.github.aozora01.hlsmui.ui.color

import androidx.compose.ui.graphics.Color

enum class HColor(val color: Color) {
        // RGB
        Red(Color.Red),
        Blue(Color.Blue),

        // CMYK
        Black(Color.Black),
        Cyan(Color.Cyan),

        // Other
        White(Color.White),
        Gray(Color.Gray),
        Orange(Color(0xFFFFA500)),
        Purple(Color(0xFF800080)),
        Brown(Color(0xFF964B00)),

        // Medal
        Gold(Color(0xFFFFD700)),
        Silver(Color(0xFFC0C0C0)),

        // Crayon
        Yellow(Color.Yellow), // Pantone 109 C
        Bronze(Color(181, 101, 29)), // Pantone 16-1348 TCX (Metallic)
        Pink(Color(0xFFFFC0CB)), // Pantone 219 C
        Green(Color.Green), // Pantone 355 C
        Emerald(Color(0, 158, 96)), // Pantone 3278 C
        Lilac(Color(200, 162, 200)), // Pantone 268 C
        Azure(Color(0, 127, 255)), // Pantone 2935 C
        Lime(Color(0, 255, 0)), // Pantone 376 C
        Maroon(Color(128, 0, 0)), // Pantone 201 C
        Lavender(Color(230, 230, 250)), // Pantone 266 C
        Coral(Color(255, 127, 80)), // Pantone 16-1546 TCX (Living Coral)
        Magenta(Color.Magenta), // Pantone Process Magenta C
        Navy(Color(0, 0, 128)), // Pantone 282 C
        SkyBlue(Color(135, 206, 235)), // Pantone 14-4313 TCX (Skydiver)
        Apricot(Color(251, 206, 177)), // Pantone 14-1329 TCX (Apricot Ice)
        BabyBlue(Color(137, 207, 240)), // Pantone 12-4605 TCX (Baby Blue)

        // Tailwind Colors
        Gray_50(Color(0xFFFAFAFA)),
        Gray_100(Color(0xFFF4F4F5)),
        Gray_200(Color(0xFFE4E4E7)),
        Gray_300(Color(0xFFD4D4D8)),
        Gray_400(Color(0xFFA1A1AA)),
        Gray_500(Color(0xFF71717A)),
        Gray_600(Color(0xFF52525B)),
        Gray_700(Color(0xFF3F3F46)),
        Gray_800(Color(0xFF27272A)),
        Gray_900(Color(0xFF18181B)),

        Red_50(Color(0xFFFFF5F5)),
        Red_100(Color(0xFFFFE4E4)),
        Red_200(Color(0xFFFECACA)),
        Red_300(Color(0xFFFCA5A5)),
        Red_400(Color(0xFFF87171)),
        Red_500(Color(0xFFEF4444)),
        Red_600(Color(0xFFDC2626)),
        Red_700(Color(0xFFB91C1C)),
        Red_800(Color(0xFF991B1B)),
        Red_900(Color(0xFF7F1D1D)),

        Orange_50(Color(0xFFFFF7ED)),
        Orange_100(Color(0xFFFFEDD5)),
        Orange_200(Color(0xFFFED7AA)),
        Orange_300(Color(0xFFFDBA74)),
        Orange_400(Color(0xFFFB923C)),
        Orange_500(Color(0xFFF97316)),
        Orange_600(Color(0xFFEA580C)),
        Orange_700(Color(0xFFC2410C)),
        Orange_800(Color(0xFF9A3412)),
        Orange_900(Color(0xFF7C2D12)),

        Amber_50(Color(0xFFFFFBEB)),
        Amber_100(Color(0xFFFEF3C7)),
        Amber_200(Color(0xFFFDE68A)),
        Amber_300(Color(0xFFFCD34D)),
        Amber_400(Color(0xFFFBBF24)),
        Amber_500(Color(0xFFF59E0B)),
        Amber_600(Color(0xFFD97706)),
        Amber_700(Color(0xFFB45309)),
        Amber_800(Color(0xFF92400E)),
        Amber_900(Color(0xFF78350F)),

        Yellow_50(Color(0xFFFFFBEB)),
        Yellow_100(Color(0xFFFEF3C7)),
        Yellow_200(Color(0xFFFDE68A)),
        Yellow_300(Color(0xFFFCD34D)),
        Yellow_400(Color(0xFFFBBF24)),
        Yellow_500(Color(0xFFFACC15)),
        Yellow_600(Color(0xFFEAB308)),
        Yellow_700(Color(0xFFCA8A04)),
        Yellow_800(Color(0xFFA16207)),
        Yellow_900(Color(0xFF854D0E)),

        Rose_50(Color(0xFFFFF1F2)),
        Rose_100(Color(0xFFFFE4E6)),
        Rose_200(Color(0xFFFECDD3)),
        Rose_300(Color(0xFFFDA4AF)),
        Rose_400(Color(0xFFFB7185)),
        Rose_500(Color(0xFFF43F5E)),
        Rose_600(Color(0xFFE11D48)),
        Rose_700(Color(0xFFBE123C)),
        Rose_800(Color(0xFF9F1239)),
        Rose_900(Color(0xFF881337)),

        Lime_50(Color(0xFFF7FEE7)),
        Lime_100(Color(0xFFECFCCB)),
        Lime_200(Color(0xFFD9F99D)),
        Lime_300(Color(0xFFBEF264)),
        Lime_400(Color(0xFFA3E635)),
        Lime_500(Color(0xFF84CC16)),
        Lime_600(Color(0xFF65A30D)),
        Lime_700(Color(0xFF4D7C0F)),
        Lime_800(Color(0xFF3F6212)),
        Lime_900(Color(0xFF365314)),

        Teal_50(Color(0xFFF0FDFA)),
        Teal_100(Color(0xFFCCFBF1)),
        Teal_200(Color(0xFF99F6E4)),
        Teal_300(Color(0xFF5EEAD4)),
        Teal_400(Color(0xFF2DD4BF)),
        Teal_500(Color(0xFF14B8A6)),
        Teal_600(Color(0xFF0D9488)),
        Teal_700(Color(0xFF0F766E)),
        Teal_800(Color(0xFF115E59)),
        Teal_900(Color(0xFF134E4A)),

        Emerald_50(Color(0xFFECFDF5)),
        Emerald_100(Color(0xFFD1FAE5)),
        Emerald_200(Color(0xFFA7F3D0)),
        Emerald_300(Color(0xFF6EE7B7)),
        Emerald_400(Color(0xFF34D399)),
        Emerald_500(Color(0xFF10B981)),
        Emerald_600(Color(0xFF059669)),
        Emerald_700(Color(0xFF047857)),
        Emerald_800(Color(0xFF065F46)),
        Emerald_900(Color(0xFF064E3B)),

        
}