package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.core.content.res.ResourcesCompat

class Signature(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {
    private var path = Path()
    var signaturePaint = Paint().apply {
        isAntiAlias = true
        color = ResourcesCompat.getColor(resources, R.color.black, null)
        style = Paint.Style.STROKE
        strokeWidth = 12f
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val dX = event.x
        val dY = event.y
        when (event.action) {
            MotionEvent.ACTION_DOWN -> path.moveTo(dX, dY)
            MotionEvent.ACTION_MOVE -> path.lineTo(dX, dY)
            else -> return false
        }
        postInvalidate()
        return true

    }


    override fun onDraw(canvas: Canvas) {
        canvas.drawPath(path, signaturePaint);

    }

}