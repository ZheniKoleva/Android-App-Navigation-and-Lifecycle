package com.example.navigationandlifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationandlifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        binding.secondActivityTextView.text =
            intent.extras?.getString("title") ?: binding.secondActivityTextView.text

        setContentView(binding.root)
    }
}