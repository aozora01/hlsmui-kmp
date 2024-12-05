package test

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import io.github.aozora01.hlsmui.component.input.HSwitch
import io.github.aozora01.hlsmui.component.input.textfield.HOutlinedTextField

@Composable
fun TestSwitch(){
    var isOn by remember { mutableStateOf(true) }

    HSwitch(
        isChecked = isOn,
        onCheckedChange = {
            isOn = it
        },
//        switchOnLabel = { HLabel("ON") },
//        switchOffLabel = { HLabel("OFF") }
    )
}



@Composable
fun TestSelect(){

    data class Car(val name: String, val price:Int)

    val items = listOf(Car("Car 1", 10000), Car("Car 2", 20000), Car("Car 3", 30000))
    var item by remember { mutableStateOf(items.first()) }

//    HSelect (
//        selectedOption = item,
//        options = items,
//        onOptionSelected = { item = it },
//        optionLabel = { HLabel(it.name) },
//        selectedOptionLabel = { HLabel(it.name) }
//    )
}

@Composable
fun TestRadio(){

    data class Car(val name: String, val price:Int)

    val items = listOf(Car("Car 1", 10000), Car("Car 2", 20000), Car("Car 3", 30000))
    var item by remember { mutableStateOf(items.first()) }

//    HRadio (
//        selectedOption = item,
//        options = items,
//        onOptionSelected = { item = it },
////        optionLabel = { HLabel(it.name) },
//    )
}




