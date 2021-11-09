package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var paint:Paint?=null
    private var path :Path?=null

    init {
        paint=Paint()
        path=Path()
        paint!!.color=Color.BLACK
        paint!!.strokeWidth=10f
        paint!!.style=Paint.Style.STROKE
        paint!!.isAntiAlias=true
    }

    override fun onDraw(canvas: Canvas?) {
        canvas!!.drawPath(path!!,paint!!)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val xpos:Float=event!!.x
        val ypos:Float=event!!.y

        when (event!!.action)
        {
            MotionEvent.ACTION_DOWN ->{
                path!!.moveTo(xpos,ypos)
            }
            MotionEvent.ACTION_MOVE ->{
                path!!.lineTo(xpos,ypos)
            }
            MotionEvent.ACTION_UP ->{
            }
            else ->{

            }
        }
        invalidate()
        return true
    }




}