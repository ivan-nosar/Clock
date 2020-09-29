package com.github.ivan.nosar.clock.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.ivan.nosar.clock.model.Notification

class NotificationsViewModel : ViewModel() {
    private val _notifications: MutableLiveData<MutableList<Notification>> =
        MutableLiveData<MutableList<Notification>>()
    val notifications: LiveData<MutableList<Notification>>
        get() = _notifications

    private val _text = MutableLiveData<String>("")
    val text: LiveData<String> = _text

    init {
        loadData()
    }

    private fun loadData() {
        _text.value = "Hello world";
        _notifications.value = mutableListOf(
            Notification("First notification"),
            Notification("Second notification"),
            Notification("Third notification"),
            Notification("Fourth notification")
        )
    }
}
