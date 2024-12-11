import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import app.App
import di.initKoin


@Composable fun MainView()  {
    initKoin()
    App()
}

@Preview
@Composable
fun AppPreview() {

    App()
}
