package com.sumaya.hw_week06_day05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var cView :SignatureView
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cView=findViewById(R.id.signatureView)
        btn =findViewById(R.id.button)

    }
}