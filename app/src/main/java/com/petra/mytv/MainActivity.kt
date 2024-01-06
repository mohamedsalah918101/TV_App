package com.petra.mytv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById(R.id.button1) as Button
        val button2 = findViewById(R.id.button2) as Button
        val button3 = findViewById(R.id.button3) as Button

        button1.setOnClickListener(){
            val videoFragment: Fragment = VideoFragment()
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, videoFragment).commit()
        }
        button2.setOnClickListener(){
            val videoFragment: Fragment = VideoFragment()
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, videoFragment).commit()
        }
        button3.setOnClickListener(){
            val videoFragment: Fragment = VideoFragment()
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, videoFragment).commit()
        }
    }
}