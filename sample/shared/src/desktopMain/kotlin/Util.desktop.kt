import java.awt.Desktop
import java.net.URI

//actual fun copyToClipBoard(text: String) {
//}
actual fun openUrl(url: String) {
    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
        try {
            Desktop.getDesktop().browse(URI(url))
        } catch (e: Exception) {
            // Tangani error, misalnya dengan menampilkan pesan error
            println("Error opening URL: ${e.message}")
        }
    } else {
        // Platform tidak mendukung Desktop API atau action BROWSE
        println("Cannot open URL on this platform.")
    }
}