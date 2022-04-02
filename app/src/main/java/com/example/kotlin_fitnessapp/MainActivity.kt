package com.example.kotlin_fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_fitnessapp.fragments.DaysFragment
import com.example.kotlin_fitnessapp.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}