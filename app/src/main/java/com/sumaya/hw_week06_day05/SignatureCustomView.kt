package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class SignatureCustomView(context: Context, attrs: AttributeSet? = null) : View(context,attrs){

    private val path = Path()
    private val paint = Paint()
    init {
        paint.strokeWidth = 15f
        paint.isAntiAlias = true
        paint.style=Paint.Style.STROKE
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_DOWN -> path.moveTo(event.x,event.y)
            MotionEvent.ACTION_MOVE -> path.lineTo(event.x,event.y)
            MotionEvent.ACTION_UP -> {}
            else -> return false
        }
        invalidate()
        return true
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawPath(path,paint)
    }

}