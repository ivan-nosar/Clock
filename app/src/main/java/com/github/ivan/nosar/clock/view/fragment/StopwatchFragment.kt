package com.github.ivan.nosar.clock.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.github.ivan.nosar.clock.R
import com.github.ivan.nosar.clock.viewmodel.StopwatchViewModel

class StopwatchFragment : Fragment() {

    companion object {
        fun newInstance() = StopwatchFragment()
    }

    private lateinit var viewModel: StopwatchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stopwatch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StopwatchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
