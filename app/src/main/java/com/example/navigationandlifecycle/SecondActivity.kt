package com.example.navigationandlifecycle

import android.app.Activity
import android.os.Bundle
import com.example.navigationandlifecycle.databinding.ActivitySecondBinding

class SecondActivity: Activity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_second)
    }

}