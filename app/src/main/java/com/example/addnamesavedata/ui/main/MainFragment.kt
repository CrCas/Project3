package com.example.addnamesavedata.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addnamesavedata.R

class MainFragment : Fragment() {

    private var _binding: Fragment? = null
    private val binding get() = _binding!!
    var activityCallback: Fragment.InstantiationException? = null

    interface InstantiationExecption {
        fun onButtonClick(text: String)
    }

    companion object {
        fun newInstance() = MainFragment().apply {  }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val buttonCallback = button2
        val textView = textView
        val name =  editTextTextPersonName


    }

    }


