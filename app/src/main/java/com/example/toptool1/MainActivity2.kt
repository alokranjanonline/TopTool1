package com.example.toptool1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //setSupportActionBar(findViewById(R.id.my_toolbar))
        val actionBar = supportActionBar
        actionBar!!.title = "  Alok Ranjan"
        //actionBar.subtitle = "   Design a custom Action Bar"
        //actionBar.setDisplayUseLogoEnabled(true)
        //actionBar.setDisplayShowHomeEnabled(true)
    }
}