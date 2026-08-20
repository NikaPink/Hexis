package io.github.nikapink.hexis.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class SeanceRepository(private val seanceDao: SeanceDao, private val seanceExerciceDao: SeanceExerciceDao, private val serieDao: SerieDao) {
    val allSeance: Flow<List<Seance>> = seanceDao.getAll()
    val allExercice: Flow<List<SeanceExercice>> = seanceExerciceDao.getAll()
    val allSerie: Flow<List<Serie>> = serieDao.getAll()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(seance: Seance) {
        seanceDao.insertNewSeance(seance)
    }

    @WorkerThread
    suspend fun insert(seanceExercice: SeanceExercice) {
        seanceExerciceDao.insertNewExercice(seanceExercice)
    }

    @WorkerThread
    suspend fun insert(serie: Serie) {
        serieDao.insertNewSerie(serie)
    }

}