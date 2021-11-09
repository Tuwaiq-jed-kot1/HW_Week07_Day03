package com.sumaya.hw_week06_day05

import android.graphics.PointF

class Box(private val start: PointF) {
    var end: PointF = start
    val left: Float
        get() = start.x.coerceAtMost(end.x)
    val right: Float
        get() = start.x.coerceAtLeast(end.x)
    val top: Float
        get() = start.y.coerceAtMost(end.y)
    val buttom: Float
        get() = start.y.coerceAtLeast(end.y)
}