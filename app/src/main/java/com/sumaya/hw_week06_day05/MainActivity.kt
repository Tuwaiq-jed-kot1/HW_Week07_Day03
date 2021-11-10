package com.sumaya.hw_week06_day05

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Xml
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var customView :SignView
    lateinit var botton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customView =findViewById(R.id.signatureView)
        botton =findViewById(R.id.button)

    }
}