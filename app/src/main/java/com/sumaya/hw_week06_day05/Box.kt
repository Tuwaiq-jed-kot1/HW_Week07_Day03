package com.sumaya.hw_week06_day05

import android.graphics.PointF

class Box(var start: PointF) {
    var end: PointF = start
    val startX: Float
        //get() = Math.min(start.x, end.x)
        get() = start.x.coerceAtLeast(end.x)

    val stopX: Float
        //get() = Math.max(start.x, end.x)
        //get() = start.x.coerceAtMost(end.x)
        get() = start.x.coerceAtMost(end.x)
        //get() = start.x.coerceAtLeast(end.x)

    val startY: Float
        //get() = Math.min(start.y, end.y)
        //get() = start.y.coerceAtMost(end.y)
        get() = start.y.coerceAtLeast(end.y)

    val stopY: Float
        //get() = Math.max(start.y, end.y)
        //get() = start.y.coerceAtLeast(end.y)
        get() = start.y.coerceAtMost(end.y)
}