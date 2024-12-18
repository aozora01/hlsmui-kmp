import kotlinx.browser.window

//actual fun copyToClipBoard(text: String) {
//    window.navigator.clipboard.writeText(text)
//}
actual fun openUrl(url: String) {
    window.open(url, "_blank")
}