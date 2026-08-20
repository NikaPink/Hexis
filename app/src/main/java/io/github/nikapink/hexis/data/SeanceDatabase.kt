package io.github.nikapink.hexis.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Seance::class, SeanceExercice::class, Serie::class])
abstract class SeanceDatabase : RoomDatabase() {
    abstract fun getSeanceDao(): SeanceDao
    abstract fun getSeanceExerciceDao(): SeanceExerciceDao
    abstract fun getSerieDao(): SerieDao

    companion object {
        @Volatile
        private var INSTANCE: SeanceDatabase? = null

        fun getDatabase(context: Context): SeanceDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SeanceDatabase::class.java,
                    "seance_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}
