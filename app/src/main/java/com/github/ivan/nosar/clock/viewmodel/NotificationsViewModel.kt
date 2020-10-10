package com.github.ivan.nosar.clock.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.github.ivan.nosar.clock.model.Notification
import com.github.ivan.nosar.clock.model.database.ClockDatabase

class NotificationsViewModel(application: Application) : AndroidViewModel(application) {
    val notifications: LiveData<List<Notification>> = liveData {
        val dao = ClockDatabase
            .getInstance(application, viewModelScope)
            .notificationDao()

        val a = dao.getAll()
        emit(a)
    }
}
