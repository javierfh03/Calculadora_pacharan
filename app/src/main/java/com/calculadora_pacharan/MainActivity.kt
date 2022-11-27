package com.calculadora_pacharan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        val texto = findViewById<TextView>(R.id.editCantAnis)
        texto.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(p0: Editable?) {}

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                calcular()
            }
        })
    }

    fun calcular(){
        val campo = findViewById<EditText>(R.id.editCantAnis).text;
        var anis = 0

        if (!campo.toString().equals("")){
            anis = campo.toString().toInt()
        }

        if (anis < 100000){
            findViewById<TextView>(R.id.textViewCantEndrina).text = (anis * 300).toString()
            findViewById<TextView>(R.id.textViewCantCafe).text = (anis * 5).toString()
            findViewById<TextView>(R.id.textViewCantCanela).text = (anis * 1).toString()
            findViewById<TextView>(R.id.textViewCantManzanilla).text = (anis * 5).toString()
        }
    }
}