package com.codecipher.list

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class Card: LinearLayout{
    @JvmOverloads
    constructor(
            context: Context,
            attrs: AttributeSet? = null,
            defStyleAttr: Int = 0)
            : super(context, attrs, defStyleAttr)

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int)
            : super(context, attrs, defStyleAttr, defStyleRes)
    val inflater = LayoutInflater.from(context).inflate(R.layout.a, this, true)

    init {
        inflater
        orientation = VERTICAL
    }
    fun Write(a:String){
        inflater.findViewById<TextView>(R.id.textView_default).text=a
    }

}