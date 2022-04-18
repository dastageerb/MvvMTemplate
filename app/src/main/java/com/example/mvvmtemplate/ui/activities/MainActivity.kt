package com.example.mvvmtemplate.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmtemplate.R
import com.example.mvvmtemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    var _binding:ActivityMainBinding?=null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        _binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





    } // onCreate closed
} // MainActivity