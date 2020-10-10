package com.github.ivan.nosar.clock.model.database.dao

import androidx.room.*
import com.github.ivan.nosar.clock.model.Notification

@Dao
interface NotificationDao {
    @Query("SELECT * FROM notification")
    suspend fun getAll(): List<Notification>

    @Query("SELECT * FROM notification WHERE id IN (:ids)")
    suspend fun getAllByIds(ids: IntArray): List<Notification>

    @Query("SELECT * FROM notification WHERE id == :id")
    suspend fun getById(id: Int): Notification

    @Insert
    suspend fun insert(vararg notifications: Notification)

    @Delete
    suspend fun delete(notification: Notification)

    @Query("DELETE FROM notification")
    suspend fun deleteAll()

    @Update
    suspend fun update(vararg notifications: Notification)
}