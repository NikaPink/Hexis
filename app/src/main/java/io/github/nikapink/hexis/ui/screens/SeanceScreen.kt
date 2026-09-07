package io.github.nikapink.hexis.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun AddName(modifier: Modifier = Modifier) {
    val name = remember { mutableStateOf("") }
    TextField(modifier = modifier, value = name.value, onValueChange = { name.value = it })
}

@Composable
fun AddDate(modifier: Modifier = Modifier) {
    val date = remember { mutableStateOf(System.currentTimeMillis()) }
}

@Composable
fun InsertSeance(modifier: Modifier = Modifier) {
    val insert = remember { mutableStateOf(false) }
    Button(modifier = modifier, onClick = {insert.value = !insert.value}) {
        Text("Insert seance")
    }
    
}
