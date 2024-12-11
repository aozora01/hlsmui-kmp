package model

enum class HComponentName {
    GetStarted, Theme, Input, Text, Button, Card, Divider, Icon,Switch, Select, Radio, TextField
}

class HComponent (
    val name:HComponentName,
    val title:String = "",
    val childern : List<HComponent> = emptyList()
)