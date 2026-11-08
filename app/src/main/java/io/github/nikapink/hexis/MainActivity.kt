package io.github.nikapink.hexis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.nikapink.hexis.data.Seance
import io.github.nikapink.hexis.ui.screens.SeanceScreen
import io.github.nikapink.hexis.ui.theme.HexisTheme
import io.github.nikapink.hexis.view.SeanceViewModel
import io.github.nikapink.hexis.view.SeanceViewModelFactory

class MainActivity : ComponentActivity() {
    private val seanceViewModel: SeanceViewModel by viewModels {
        SeanceViewModelFactory((application as HexisApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HexisTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val seances by seanceViewModel.allSeance.collectAsState(initial = emptyList())
                    SeanceScreen(
                        modifier = Modifier.padding(innerPadding),
                        onAddSeance = { nom, dateMillisecondes ->
                            seanceViewModel.insert(
                                seance = Seance(
                                    name = nom,
                                    date = dateMillisecondes
                                )
                            )
                        },
                        seances = seances,
                    )
                }
            }
        }
    }
}



