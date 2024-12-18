package model

enum class HComponentName {
    GetStarted, Theme,
    Input, Button, Card, Divider, Icon,Switch, Select, Radio, TextField,OutlinedTextField,
    Text, Label, Body, Title, Headline,
    Color
}

class HComponent (
    val name:HComponentName,
    val title:String = "",
    val childern : List<HComponent> = emptyList()
)