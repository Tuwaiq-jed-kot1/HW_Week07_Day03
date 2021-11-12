package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class SignitureView(context: Context, attrs: AttributeSet? = null):
    View(context, attrs) {

        private var path: Path? = null
        private var paint: Paint? = null
        init {
            paint = Paint()
            path = Path()
            paint!!.isAntiAlias = true
            paint!!.color = Color.YELLOW
            paint!!.strokeWidth = 15F
            paint!!.style = Paint.Style.STROKE

        }

    override fun onDraw(canvas: Canvas) {
        path?.let { canvas.drawPath(it, paint!!) }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val px:Float = event.x
        val py:Float = event.y

//        var action = ""
        when(event.action){
            MotionEvent.ACTION_DOWN -> {
                path!!.moveTo(px,py)
            }
            MotionEvent.ACTION_MOVE -> {
                path!!.lineTo(px,py)

            }
            MotionEvent.ACTION_UP -> {
               Log.i("signture","stop writing")

        }else -> return false

    }
        invalidate()
        return true


    }
}