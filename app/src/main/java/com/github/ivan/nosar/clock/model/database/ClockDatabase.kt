package com.github.ivan.nosar.clock.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.github.ivan.nosar.clock.model.Notification
import com.github.ivan.nosar.clock.model.database.prepopulate_callbacks.NotificationsPrepopulateCallback
import com.github.ivan.nosar.clock.model.database.dao.NotificationDao
import kotlinx.coroutines.CoroutineScope

@Database(
    version = 1,
    entities = [
        Notification::class
    ]
)
abstract class ClockDatabase : RoomDatabase() {

    abstract fun notificationDao(): NotificationDao

    companion object {
        @Volatile
        private var instance: ClockDatabase? = null

        fun getInstance(
            context: Context,
            scope: CoroutineScope
        ): ClockDatabase {
            synchronized(this) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ClockDatabase::class.java,
                        "clock_database"
                    )
                        // Adding a prepopulation callback in order to fill the database with the initial values.
                        // These callbacks will be invoked after the first data request
                        // (on showing the fragments with this data for the first time) -> these fragments will
                        // not contain an appropriate data. The data will be loaded properly
                        // on the next loading of fragment
                        // ToDo: Remove all the prepopulation callbacks before starting the production build
                        .addCallback(NotificationsPrepopulateCallback(context, scope))
                        .build()
                }

                return instance!!
            }
        }
    }
}