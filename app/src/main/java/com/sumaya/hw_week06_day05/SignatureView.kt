package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.shapes.Shape
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class SignatureView (context: Context, attrs: AttributeSet?=null): View(context,attrs){
    private var line: Path=Path()
    val lines = mutableListOf<Path>() //CONTAINER

    var sPaintPaint = Paint().apply {
        color = 0xff000000.toInt()
        style =Paint.Style.STROKE
        strokeWidth=7F
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y=event.y

        when(event.action){
            MotionEvent.ACTION_DOWN -> {
              //start drawing
                line.moveTo(x,y)
            }
            MotionEvent.ACTION_MOVE -> {
             //update the position
                line.lineTo(x,y)
            }
            MotionEvent.ACTION_UP -> {
                lines.add(line)

            }
            MotionEvent.ACTION_CANCEL-> {
                // in this case it means draw out of the screen boundary
            }

        }
        invalidate()
        return true
    }

    override fun onDraw(canvas: Canvas) {
        if ((this.background as ColorDrawable).equals(resources.getColor(R.color.black))) {
            sPaintPaint.color=0xffFFFFFF.toInt()
            for (i in lines) {
                canvas.drawPath(i, sPaintPaint)
            }
        } else {
            for (i in lines) {
                canvas.drawPath(i, sPaintPaint)
            }
        }
    }

}