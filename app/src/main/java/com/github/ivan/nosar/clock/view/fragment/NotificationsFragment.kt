package com.github.ivan.nosar.clock.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.github.ivan.nosar.clock.databinding.FragmentNotificationsBinding
import com.github.ivan.nosar.clock.model.Notification
import com.github.ivan.nosar.clock.viewmodel.NotificationsViewModel

class NotificationsFragment : Fragment() {

    companion object {
        fun newInstance() = NotificationsFragment()
    }

    private lateinit var viewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialize viewModel - it will call `init` section
        viewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        // Initialize view and data bindings
        val binding: FragmentNotificationsBinding =
            FragmentNotificationsBinding
                .inflate(inflater, container, false)
                .apply {
                    // And pass viewModel to appropriate variable in data binding
                    data = viewModel
                }

        // It's impossible to fill ListView using data binding -
        // so we have to subscribe on updates of `viewModel.notifications` manually
        viewModel.notifications.observe(viewLifecycleOwner, Observer{ notifications: List<Notification> ->
            val adapter = ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, notifications)
            binding.listView.adapter = adapter
        })

        // Return the root view of binding
        return binding.root
    }
}
