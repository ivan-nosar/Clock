package com.github.ivan.nosar.clock.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.ivan.nosar.clock.databinding.ListItemNotificationBinding
import com.github.ivan.nosar.clock.model.Notification

class NotificationsListAdapter(
    context: Context,
    private val dataSource: List<Notification>
) : RecyclerView.Adapter<NotificationsListAdapter.ViewHolder>() {

    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val itemBinding: ListItemNotificationBinding =
            ListItemNotificationBinding.inflate(inflater, parent, false)
        return ViewHolder(itemBinding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val notification: Notification = dataSource[position]
        holder.bind(notification)
    }

    override fun getItemCount() = dataSource.size

    class ViewHolder(val binding: ListItemNotificationBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(notification: Notification) {
            binding.notification = notification
            binding.executePendingBindings()
        }
    }
}
