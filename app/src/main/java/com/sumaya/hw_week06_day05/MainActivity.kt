package com.sumaya.hw_week06_day05

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btn=findViewById(R.id.btn)
        var SignatureView : SignatureCustomView? = null
        fun changeColor(view:SignatureCustomView?){
            var currentPaint = Paint()
            currentPaint.color = Color.WHITE
        }
        btn.setOnClickListener {
            changeColor(SignatureView)
        }
    }
}