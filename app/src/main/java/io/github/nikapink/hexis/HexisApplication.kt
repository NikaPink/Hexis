package io.github.nikapink.hexis

import android.app.Application
import io.github.nikapink.hexis.data.SeanceDatabase
import io.github.nikapink.hexis.data.SeanceRepository

class HexisApplication : Application() {
    val database by lazy { SeanceDatabase.getDatabase(this) }
    val repository by lazy { SeanceRepository(database.getSeanceDao(), database.getSeanceExerciceDao(), database.getSerieDao()) }
}