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

       /* binding.mainButton.setOnClickListener {
             val rf = supportFragmentManager.
             val fr = rf as NavHostFragment
             val directions = fr.navController.findDestination(R.id.nav_graph)

           // fr.findNavController().navigate(directions)
            fr.apply {
                var directions = fr.context.run {
                    //findNavController().navigate()
                }
            }

            println(fr)
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            //fragmentTransaction.replace(R.id.nav_host_fragment,  )
            fragmentTransaction.commit()
        } */

        setContentView(binding.root)
    }
}