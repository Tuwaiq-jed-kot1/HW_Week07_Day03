package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.core.graphics.red
import java.security.KeyStore
import kotlin.math.log

class CustomView(context: Context, attrs:AttributeSet?=null):View(context,attrs) {
    private var paint: Paint? = null
    private var path: Path? = null

    init {
        paint = Paint()
        path = Path()
        paint!!.color = Color.WHITE
        paint!!.strokeWidth = 10f
        paint!!.style = Paint.Style.STROKE
        paint!!.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        canvas!!.drawPath(path!!, paint!!)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val xPos: Float = event!!.x
        val yPos: Float = event.y
        event.action.apply {

            MotionEvent.ACTION_MOVE.also {  path!!.lineTo(xPos, yPos) }.also {
                path!!.moveTo(xPos, yPos)
            }
        }

        invalidate()
        return true
    }

}