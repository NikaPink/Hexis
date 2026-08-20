package io.github.nikapink.hexis.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoSeanceExercice {
    @Insert
    suspend fun insertNewExercice(seanceExercice: SeanceExercice)

    @Query("SELECT * FROM seanceExercice")
    fun getAll(): Flow<List<SeanceExercice>>
}