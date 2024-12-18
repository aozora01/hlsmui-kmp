package app.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Generate : Screen("generate")
    object Test : Screen("test")
    object Documentation : Screen("documentation")
    object About : Screen("about")


    // Jika membutuhkan argumen, tambahkan properti/route dinamis
    object Detail : Screen("detail/{id}") {
        fun createRoute(id: String) = "detail/$id"
    }
}