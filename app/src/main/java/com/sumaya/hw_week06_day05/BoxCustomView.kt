package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PointF
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class BoxCustomView(context: Context, attrs: AttributeSet? = null): View(context, attrs) {
    private var currentBox: Box? = null
    private val boxen = mutableListOf<Box>()
    private val boxPaint = Paint().apply {
        //color = 0x22ff0000.toInt() //red
        color = 0xff0000ff.toInt() //blue
    }
    private val canvasBg = Paint().apply {
        //color = Color.rgb(0,0,0) //Black //0xff00ff00.toInt()
        color = Color.rgb(255,255,255) //white //0xff00ff00.toInt()
    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        val current = PointF(event.x, event.y)
        var action = ""
        when(event.action){
            MotionEvent.ACTION_DOWN -> {
                action = "ACTION_DOWN"
                currentBox = Box(current).also {
                    boxen.add(it)
                }
            }
            MotionEvent.ACTION_MOVE -> {
                action = "ACTION_MOVE"
                updateMove(current)
            }
            MotionEvent.ACTION_UP -> {
                action = "ACTION_UP"
                updateMove(current)
                currentBox = null
            }
            MotionEvent.ACTION_CANCEL -> {
                action = "ACTION_CANCEL"
                currentBox = null
            }

        }
        Log.i("Box", "$action at x=${current.x} & y=${current.y} ")
        return true
    }

    private fun updateMove(current: PointF) {
        currentBox?.let {
            //it.start = current
            //it.end = current
            it.end = current
            invalidate()
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawPaint(canvasBg)
        boxen.forEach { box ->
            //canvas.drawRect(box.left, box.top, box.right, box.bottom, boxPaint)
            canvas.drawLine(box.startX, box.startY, box.stopX, box.stopY, boxPaint)
            //canvas.drawRect(box.startX, box.stopX, box.startY, box.stopY, boxPaint)
        }
    }

}