package com.sumaya.hw_week06_day05

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.sumaya.hw_week06_day05.PaintView.Companion.colorList
import com.sumaya.hw_week06_day05.PaintView.Companion.currentBrush
import com.sumaya.hw_week06_day05.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    //companion.. the var will be global
    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hide the name of the app
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val whiteBtn = findViewById<ImageButton>(R.id.whiteColor)
        val cleanAll = findViewById<ImageButton>(R.id.clean)

        //to change the color
        redBtn.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
            Toast.makeText(this,"red",Toast.LENGTH_LONG).show()
        }
        blueBtn.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
            Toast.makeText(this,"blue",Toast.LENGTH_LONG).show()
        }
        blackBtn.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
            Toast.makeText(this,"black",Toast.LENGTH_LONG).show()
        }
        whiteBtn.setOnClickListener {
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)
            Toast.makeText(this,"white",Toast.LENGTH_LONG).show()
        }
        cleanAll.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
            Toast.makeText(this,"clean",Toast.LENGTH_LONG).show()
        }
    }

    private fun currentColor(color:Int){
        //to change color
        currentBrush = color
        //new path
        path = Path()
    }
}