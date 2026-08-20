package io.github.nikapink.hexis.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoSeance {
    @Insert
    suspend fun insertNewSeance(seance: Seance)

    @Query("SELECT * FROM seance")
    fun getAll(): Flow<List<Seance>>

}