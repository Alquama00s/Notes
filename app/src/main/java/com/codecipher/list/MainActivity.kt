package com.codecipher.list

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add =findViewById<Button>(R.id.button)
        val def =findViewById<TextView>(R.id.textView_def)
        val scroll=findViewById<LinearLayout>(R.id.scroll)
        val text=findViewById<EditText>(R.id.Text)
        val inflater = this.layoutInflater
        //val dynamic= inflater.from().inflate(R.layout.a,null,true)
        var a=0
        add.setOnClickListener{
            val new=Card(this)
            new.Write("${text.text}")
            scroll.addView(new)
            if(a==0) {
                (def.parent as ViewGroup).removeView(def)
            }
            a++
        }
    }
}