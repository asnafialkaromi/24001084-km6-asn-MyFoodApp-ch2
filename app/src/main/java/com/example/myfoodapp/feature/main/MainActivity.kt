package com.example.myfoodapp.feature.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfoodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /*setBottomNavigation()*/
    }

    /*private fun setBottomNavigation() {
        val navController = findNavController(R.id.bot_nav_manin)
        binding.botNavManin.setupWithNavController(navController)
    }*/


}