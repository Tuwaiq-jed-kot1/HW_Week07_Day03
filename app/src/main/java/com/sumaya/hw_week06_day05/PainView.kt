package com.sumaya.hw_week06_day05

import android.content.Context
import android.graphics.Color
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class PainView :View {


    companion object{
        var pathList =ArrayList<Path>()
        var colorList =ArrayList<Path>()

        var currentBrush = Color.BLACK

    }
    constructor(context:Context) : this(context,null){

    }
    constructor(context:Context,attrs:AttributeSet?) : this(context,attrs, 0){

    }
    constructor(context:Context , attrs:AttributeSet?, defStyleAttr:Int) : super(context,attrs,defStyleAttr){

    }


    private fun init(){

    }
}