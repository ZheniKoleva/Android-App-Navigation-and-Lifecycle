package com.example.navigationandlifecycle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationandlifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    lateinit var mainButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        binding.textView.text =
            intent.extras?.getString("title") ?: binding.textView.text

        mainButton = binding.mainButton

        setContentView(binding.root)
    }
}