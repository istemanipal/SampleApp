package com.example.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //create databinding object for main activity layout and set mainactivity to get layout from it
        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
    }
}