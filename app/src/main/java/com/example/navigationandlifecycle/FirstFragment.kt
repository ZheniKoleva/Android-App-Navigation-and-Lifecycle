package com.example.navigationandlifecycle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.navigationandlifecycle.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    lateinit var action: NavDirections

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()

        binding.button.setOnClickListener {
            findNavController().navigate(action)
        }

        (activity as SecondActivity).mainButton.setOnClickListener {
            findNavController().navigate(action)
        }

        return binding.root
    }
}