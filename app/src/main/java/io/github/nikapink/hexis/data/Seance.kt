package io.github.nikapink.hexis.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Seance(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val date: Long

)

