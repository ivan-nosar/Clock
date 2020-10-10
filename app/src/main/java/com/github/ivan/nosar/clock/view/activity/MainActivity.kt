package com.github.ivan.nosar.clock.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.ivan.nosar.clock.R
import com.github.ivan.nosar.clock.databinding.ActivityMainBinding
import com.github.ivan.nosar.clock.view.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    companion object {
        const val SELECTED_TAB_ID_KEY: String = "MainActivity.SELECTED_TAB_ID_KEY"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.bottomNavigation.setOnNavigationItemSelectedListener(bottomNavigationListener)

        if (savedInstanceState == null || savedInstanceState.containsKey(SELECTED_TAB_ID_KEY)) {
            binding.bottomNavigation.selectedItemId = R.id.notifications
        } else {
            // ToDo: Check either it's correct implementation
            // ToDo: Implement saving the state
            binding.bottomNavigation.selectedItemId = savedInstanceState.getInt(SELECTED_TAB_ID_KEY)
        }

        val view = binding.root
        setContentView(view)
    }

    private val bottomNavigationListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        val fragment = when (menuItem.itemId) {
            R.id.notifications -> NotificationsFragment()
            R.id.clock -> ClockFragment()
            R.id.calendar -> CalendarFragment()
            R.id.timer -> TimerFragment()
            R.id.stopwatch -> StopwatchFragment()
            else -> null
        }

        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(binding.fragmentsRoot.id, fragment, fragment.javaClass.simpleName)
                .commit()

            return@OnNavigationItemSelectedListener true
        }

        false
    }
}
