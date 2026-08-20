package io.github.nikapink.hexis.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Seance::class, SeanceExercice::class, Serie::class])
abstract class SeanceDatabase : RoomDatabase() {
    abstract fun getSeanceDao(): SeanceDao
    abstract fun getSeanceExerciceDao(): SeanceExerciceDao
    abstract fun getSerieDao(): SerieDao
}
