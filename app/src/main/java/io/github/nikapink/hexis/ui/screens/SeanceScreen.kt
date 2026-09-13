package io.github.nikapink.hexis.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun SeanceScreen(modifier: Modifier = Modifier, onAddSeance: (String, Long) -> Unit) {
    val name = remember { mutableStateOf("") }

    Column(modifier = modifier) {
        TextField(value = name.value, onValueChange = { name.value = it })

        Button(onClick = { onAddSeance(name.value, System.currentTimeMillis()) }) {
            Text("Insert seance")
        }
    }
}
