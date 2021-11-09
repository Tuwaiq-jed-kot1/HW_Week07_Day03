package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class SignatureCustomView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {
    private var path: Path = Path()
    private val paintColor = Color.BLACK
    private var paint: Paint = Paint().apply {
        color = paintColor
        strokeWidth = 8f
        style = Paint.Style.STROKE
        isAntiAlias = true
    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        val current = PointF(event.x,event.y)
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                path.moveTo(current.x, current.y)
            }
            MotionEvent.ACTION_MOVE -> {
                path.lineTo(current.x, current.y)
            }
        }
        invalidate()
        return true
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawPath(path, paint)
    }
}