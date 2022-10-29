package com.example.navigationandlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.navigationandlifecycle.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    lateinit var action: NavDirections

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()

        binding.button.setOnClickListener {
            findNavController().navigate(action)
        }

        (activity as SecondActivity).mainButton.setOnClickListener {
            findNavController().navigate(action)
        }

        return binding.root
    }
}