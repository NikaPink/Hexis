package io.github.nikapink.hexis.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Seance::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("seanceId"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class SeanceExercice(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val seanceId: Long
)



