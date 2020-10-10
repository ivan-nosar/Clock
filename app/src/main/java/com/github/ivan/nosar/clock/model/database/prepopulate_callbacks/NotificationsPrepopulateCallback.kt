package com.github.ivan.nosar.clock.model.database.prepopulate_callbacks

import android.content.Context
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.github.ivan.nosar.clock.model.Notification
import com.github.ivan.nosar.clock.model.database.ClockDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class NotificationsPrepopulateCallback(
    private val context: Context,
    private val scope: CoroutineScope
) : RoomDatabase.Callback() {

    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)
        // insert the data on the IO Thread
        scope.launch {
            val notifications = arrayOf(
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification"),
                Notification("First notification"),
                Notification("Second notification"),
                Notification("Third notification"),
                Notification("Fourth notification")
            )
            ClockDatabase.getInstance(context, scope).notificationDao().insert(
                *notifications
            )
        }
    }
}