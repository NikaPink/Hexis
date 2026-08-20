package io.github.nikapink.hexis.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SerieDao {
    @Insert
    suspend fun insertNewSerie(serie: Serie)

    @Query("SELECT * FROM serie")
    fun getAll(): Flow<List<Serie>>
}