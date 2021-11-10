package com.sumaya.hw_week06_day05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sumaya.hw_week06_day05.R

class MainActivity : AppCompatActivity() {
    private lateinit var changeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeBtn = findViewById(R.id.button)
    }
}