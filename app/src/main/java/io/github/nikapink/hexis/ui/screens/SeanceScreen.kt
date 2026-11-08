package io.github.nikapink.hexis.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.nikapink.hexis.data.Seance


@Composable
fun SeanceScreen(
    modifier: Modifier = Modifier,
    onAddSeance: (String, Long) -> Unit,
    seances: List<Seance>
) {
    var name by remember { mutableStateOf("") }

    Column(modifier = modifier) {
        TextField(value = name, onValueChange = { name = it })

        Button(onClick = {
            onAddSeance(name, System.currentTimeMillis())
            name = ""

        }) {
            Text("Insert seance")
        }

        LazyColumn() {
            items(seances) {
                Text(it.name)
            }
        }
    }
}
