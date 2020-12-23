package com.codecipher.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add =findViewById<Button>( R.id.button)
        val def =findViewById<TextView>(R.id.textView_default)
        val text=findViewById<EditText>(R.id.Text)
        add.setOnClickListener{
            def.text=text.text;
        }
    }
}