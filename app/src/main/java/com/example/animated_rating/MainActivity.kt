package com.example.animated_rating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManagerNonConfig
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState:Bundle?){
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    button_add.setOnClickListener{
        val fragmentone = FragmentOne()
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragmentone).commit()
    }
}}


