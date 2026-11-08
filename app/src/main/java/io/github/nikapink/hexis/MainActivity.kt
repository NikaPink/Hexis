package io.github.nikapink.hexis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.nikapink.hexis.ui.screens.SeanceScreen
import io.github.nikapink.hexis.ui.theme.HexisTheme
import io.github.nikapink.hexis.view.SeanceViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HexisTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SeanceScreen(
                        modifier = Modifier.padding(innerPadding),
                        onAddSeance = { nom, dateMillisecondes ->
                            println("Nouvelle séance : $nom à $dateMillisecondes")

                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = MaterialTheme.colorScheme.primary) {



    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HexisTheme {
        Greeting("Android")
    }
}


