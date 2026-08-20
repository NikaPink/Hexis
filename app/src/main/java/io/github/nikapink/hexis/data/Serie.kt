package io.github.nikapink.hexis.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = SeanceExercice::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("exerciceId"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class Serie(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val weight: Int,
    val rep: Int,
    val exerciceId: Long
)