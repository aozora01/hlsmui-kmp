//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import io.github.aozora01.hlsmui.component.text.HLabel
//import io.github.aozora01.hlsmui.component.text.SizeCategory
//
//@Composable
//fun <T> HTable(
//        items:List<T>,
//        columnNames:List<String>,
//        weights:List<Float>,
//        cell: @Composable (T) -> Unit,
////        header: @Composable () -> Unit
//    ){
//
//    val cellModifier = Modifier
////        .border(1.dp, MaterialTheme.colorScheme.onBackground)
//        .padding(16.dp)
//    val rowModifier = Modifier
////        .border(1.dp, MaterialTheme.colorScheme.onBackground)
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(1.dp, MaterialTheme.colorScheme.onBackground)
//
//    ) {
//
//        // header
//        Row(
//            modifier = rowModifier
//                .background(MaterialTheme.colorScheme.primaryContainer)
//                .border(1.dp, MaterialTheme.colorScheme.onBackground)
//
//        ) {
//
//
//            columnNames.forEachIndexed {index, it ->
//                Box(
//                    modifier = cellModifier.weight(weights.get(index)),
//                    contentAlignment = Alignment.Center
//                ){
//                    HLabel(text = it, size = SizeCategory.Medium)
//                }
//            }
//
//        }
//
//        // content
//        items.forEach {
//            Row(
//                modifier = rowModifier.background(MaterialTheme.colorScheme.surfaceVariant)
//            ) {
//                val titles = listOf(
//                    it.,
//                    it.type,
//                    it.default,
//                    if(it.required) "✅" else "❌",
//                    it.description)
//                titles.forEachIndexed {index, it ->
//                    Box(
//                        modifier = cellModifier.weight(weights.get(index)),
//                        contentAlignment = Alignment.Center
//                    ){
//                        HLabel(text = it)
//                    }
//                }
//
//            }
//        }
//
//
//    }
//}