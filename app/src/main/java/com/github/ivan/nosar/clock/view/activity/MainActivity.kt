package com.github.ivan.nosar.clock.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.ivan.nosar.clock.R
import com.github.ivan.nosar.clock.databinding.ActivityMainBinding
import com.github.ivan.nosar.clock.view.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.bottomNavigation.setOnNavigationItemSelectedListener(bottomNavigationListener)

        if (savedInstanceState == null) {
            binding.bottomNavigation.selectedItemId = R.id.notifications
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
