package io.github.aozora01.hlsmui.ui.color

import androidx.compose.ui.graphics.Color

data class HColor(
    val name: String,
    val color : Color
){
    companion object{
            // RGB
            val Red = HColor("Red", Color.Red)
        val Blue = HColor("Blue", Color.Blue)

        //CMYK
        val Black = HColor("Black", Color.Black)
//        val Yellow = HColor("Yellow", Color.Yellow)
//        val Magenta = HColor("Magenta", Color.Magenta)
        val Cyan = HColor("Cyan", Color.Cyan)

        // Other
        val White = HColor("White", Color.White)
        val Gray = HColor("Gray", (Color.Gray))
            val Orange = HColor("Orange", Color(0xFFFFA500)) // Dengan transparansi penuh (FF di depan)
            val Purple = HColor("Purple", Color(0xFF800080)) // Dengan transparansi penuh (FF di depan)

            //        val Pink = HColor("Pink", Color(0xFFC0CB))
            val Brown = HColor("Brown", Color(0xFF964B00))


            // Medal
            val Gold = HColor("Gold", Color(0xFFFFD700))      // Warna emas dengan alpha penuh
            val Silver = HColor("Silver", Color(0xFFC0C0C0))  // Warna perak dengan alpha penuh

//            val Bronze = HColor("Bronze", Color(0xFFCD7F32))  // Warna perunggu


            // Crayon

        // Yellow
        val Yellow = HColor("Yellow", Color.Yellow) // Pantone 109 C

        // Bronze
        val Bronze = HColor("Bronze", Color(181, 101, 29)) // Pantone 16-1348 TCX (Metallic) -  nilai RGB mendekati

        // Pink
        val Pink = HColor("Pink", Color(0xFFFFC0CB)) // Pantone 219 C


            // Green
        val Green = HColor("Green", Color.Green) // Pantone 355 C

        // Emerald
        val Emerald = HColor("Emerald", Color(0, 158, 96)) // Pantone 3278 C

        // Lilac
        val Lilac = HColor("Lilac", Color(200, 162, 200)) // Pantone 268 C

        // Azure
        val Azure = HColor("Azure", Color(0, 127, 255)) // Pantone 2935 C

        // Lime
        val Lime = HColor("Lime", Color(0, 255, 0)) // Pantone 376 C

        // Maroon
        val Maroon = HColor("Maroon", Color(128, 0, 0)) // Pantone 201 C

        // Lavender
        val Lavender = HColor("Lavender", Color(230, 230, 250)) // Pantone 266 C

        // Coral
        val Coral = HColor("Coral", Color(255, 127, 80)) // Pantone 16-1546 TCX (Living Coral) - nilai RGB mendekati

        // Magenta
        val Magenta = HColor("Magenta", Color.Magenta) // Pantone Process Magenta C

        // Navy
        val Navy = HColor("Navy", Color(0, 0, 128)) // Pantone 282 C

        // Sky Blue
        val SkyBlue = HColor("Sky Blue", Color(135, 206, 235)) // Pantone 14-4313 TCX (Skydiver) - nilai RGB mendekati

        // Apricot
        val Apricot = HColor("Apricot", Color(251, 206, 177)) // Pantone 14-1329 TCX (Apricot Ice) - nilai RGB mendekati

        // Baby Blue
        val BabyBlue = HColor("Baby Blue", Color(137, 207, 240)) // Pantone 12-4605 TCX (Baby Blue) - nilai RGB mendekati


        // Tailwind Colors
        val Gray_50 = HColor("Gray-50", Color(0xFFFAFAFA))
        val Gray_100 = HColor("Gray-100", Color(0xFFF4F4F5))
        val Gray_200 = HColor("Gray-200", Color(0xFFE4E4E7))
        val Gray_300 = HColor("Gray-300", Color(0xFFD4D4D8))
        val Gray_400 = HColor("Gray-400", Color(0xFFA1A1AA))
        val Gray_500 = HColor("Gray-500", Color(0xFF71717A))
        val Gray_600 = HColor("Gray-600", Color(0xFF52525B))
        val Gray_700 = HColor("Gray-700", Color(0xFF3F3F46))
        val Gray_800 = HColor("Gray-800", Color(0xFF27272A))
        val Gray_900 = HColor("Gray-900", Color(0xFF18181B))

        val Red_50 = HColor("Red-50", Color(0xFFFFF5F5))
        val Red_100 = HColor("Red-100", Color(0xFFFFE4E4))
        val Red_200 = HColor("Red-200", Color(0xFFFECACA))
        val Red_300 = HColor("Red-300", Color(0xFFFCA5A5))
        val Red_400 = HColor("Red-400", Color(0xFFF87171))
        val Red_500 = HColor("Red-500", Color(0xFFEF4444))
        val Red_600 = HColor("Red-600", Color(0xFFDC2626))
        val Red_700 = HColor("Red-700", Color(0xFFB91C1C))
        val Red_800 = HColor("Red-800", Color(0xFF991B1B))
        val Red_900 = HColor("Red-900", Color(0xFF7F1D1D))

        val Orange_50 = HColor("Orange-50", Color(0xFFFFF7ED))
        val Orange_100 = HColor("Orange-100", Color(0xFFFFEDD5))
        val Orange_200 = HColor("Orange-200", Color(0xFFFED7AA))
        val Orange_300 = HColor("Orange-300", Color(0xFFFDBA74))
        val Orange_400 = HColor("Orange-400", Color(0xFFFB923C))
        val Orange_500 = HColor("Orange-500", Color(0xFFF97316))
        val Orange_600 = HColor("Orange-600", Color(0xFFEA580C))
        val Orange_700 = HColor("Orange-700", Color(0xFFC2410C))
        val Orange_800 = HColor("Orange-800", Color(0xFF9A3412))
        val Orange_900 = HColor("Orange-900", Color(0xFF7C2D12))

        val Amber_50 = HColor("Amber-50", Color(0xFFFFFBEB))
        val Amber_100 = HColor("Amber-100", Color(0xFFFEF3C7))
        val Amber_200 = HColor("Amber-200", Color(0xFFFDE68A))
        val Amber_300 = HColor("Amber-300", Color(0xFFFCD34D))
        val Amber_400 = HColor("Amber-400", Color(0xFFFBBF24))
        val Amber_500 = HColor("Amber-500", Color(0xFFF59E0B))
        val Amber_600 = HColor("Amber-600", Color(0xFFD97706))
        val Amber_700 = HColor("Amber-700", Color(0xFFB45309))
        val Amber_800 = HColor("Amber-800", Color(0xFF92400E))
        val Amber_900 = HColor("Amber-900", Color(0xFF78350F))

        val Yellow_50 = HColor("Yellow-50", Color(0xFFFFFBEB))
        val Yellow_100 = HColor("Yellow-100", Color(0xFFFEF3C7))
        val Yellow_200 = HColor("Yellow-200", Color(0xFFFDE68A))
        val Yellow_300 = HColor("Yellow-300", Color(0xFFFCD34D))
        val Yellow_400 = HColor("Yellow-400", Color(0xFFFBBF24))
        val Yellow_500 = HColor("Yellow-500", Color(0xFFFACC15))
        val Yellow_600 = HColor("Yellow-600", Color(0xFFEAB308))
        val Yellow_700 = HColor("Yellow-700", Color(0xFFCA8A04))
        val Yellow_800 = HColor("Yellow-800", Color(0xFFA16207))
        val Yellow_900 = HColor("Yellow-900", Color(0xFF854D0E))

        val Rose_50 = HColor("Rose-50", Color(0xFFFFF1F2))
        val Rose_100 = HColor("Rose-100", Color(0xFFFFE4E6))
        val Rose_200 = HColor("Rose-200", Color(0xFFFECDD3))
        val Rose_300 = HColor("Rose-300", Color(0xFFFDA4AF))
        val Rose_400 = HColor("Rose-400", Color(0xFFFB7185))
        val Rose_500 = HColor("Rose-500", Color(0xFFF43F5E))
        val Rose_600 = HColor("Rose-600", Color(0xFFE11D48))
        val Rose_700 = HColor("Rose-700", Color(0xFFBE123C))
        val Rose_800 = HColor("Rose-800", Color(0xFF9F1239))
        val Rose_900 = HColor("Rose-900", Color(0xFF881337))

        val Lime_50 = HColor("Lime-50", Color(0xFFF7FEE7))
        val Lime_100 = HColor("Lime-100", Color(0xFFECFCCB))
        val Lime_200 = HColor("Lime-200", Color(0xFFD9F99D))
        val Lime_300 = HColor("Lime-300", Color(0xFFBEF264))
        val Lime_400 = HColor("Lime-400", Color(0xFFA3E635))
        val Lime_500 = HColor("Lime-500", Color(0xFF84CC16))
        val Lime_600 = HColor("Lime-600", Color(0xFF65A30D))
        val Lime_700 = HColor("Lime-700", Color(0xFF4D7C0F))
        val Lime_800 = HColor("Lime-800", Color(0xFF3F6212))
        val Lime_900 = HColor("Lime-900", Color(0xFF365314))

        val Teal_50 = HColor("Teal-50", Color(0xFFF0FDFA))
        val Teal_100 = HColor("Teal-100", Color(0xFFCCFBF1))
        val Teal_200 = HColor("Teal-200", Color(0xFF99F6E4))
        val Teal_300 = HColor("Teal-300", Color(0xFF5EEAD4))
        val Teal_400 = HColor("Teal-400", Color(0xFF2DD4BF))
        val Teal_500 = HColor("Teal-500", Color(0xFF14B8A6))
        val Teal_600 = HColor("Teal-600", Color(0xFF0D9488))
        val Teal_700 = HColor("Teal-700", Color(0xFF0F766E))
        val Teal_800 = HColor("Teal-800", Color(0xFF115E59))
        val Teal_900 = HColor("Teal-900", Color(0xFF134E4A))

        val Emerald_50 = HColor("Emerald-50", Color(0xFFECFDF5))
        val Emerald_100 = HColor("Emerald-100", Color(0xFFD1FAE5))
        val Emerald_200 = HColor("Emerald-200", Color(0xFFA7F3D0))
        val Emerald_300 = HColor("Emerald-300", Color(0xFF6EE7B7))
        val Emerald_400 = HColor("Emerald-400", Color(0xFF34D399))
        val Emerald_500 = HColor("Emerald-500", Color(0xFF10B981))
        val Emerald_600 = HColor("Emerald-600", Color(0xFF059669))
        val Emerald_700 = HColor("Emerald-700", Color(0xFF047857))
        val Emerald_800 = HColor("Emerald-800", Color(0xFF065F46))
        val Emerald_900 = HColor("Emerald-900", Color(0xFF064E3B))


    }
}

