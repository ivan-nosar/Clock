package com.github.ivan.nosar.clock.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Notification(
    @ColumnInfo(name = "title") val title: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
