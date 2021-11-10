package com.sumaya.hw_week06_day05

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
private lateinit var button: Button
    companion object{
        var path = Path()
        var painBrush = Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
button=findViewById(R.id.btnEmotion)
//        button.animate().apply {
//
//
//
//        }.start()


    }
}