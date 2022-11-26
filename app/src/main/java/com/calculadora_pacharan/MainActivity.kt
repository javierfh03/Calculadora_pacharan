package com.calculadora_pacharan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()


    }

    fun insertarValor(view: View){
        var endrina = findViewById<TextView>(R.id.textViewCantEndrina).text.toString().toInt()
        var cafe = findViewById<TextView>(R.id.textViewCantCafe).text.toString().toInt()
        var canela = findViewById<TextView>(R.id.textViewCantCanela).text.toString().toInt()
        var manzanilla = findViewById<TextView>(R.id.textViewCantManzanilla).text.toString().toInt()
        var anis = findViewById<EditText>(R.id.editCantAnis).text.toString().toInt()

        endrina = anis * 300
        cafe = anis * 5
        manzanilla = anis * 5
        canela = anis * 1

        findViewById<TextView>(R.id.textViewCantEndrina).text = endrina.toString()
        findViewById<TextView>(R.id.textViewCantCafe).text = cafe.toString()
        findViewById<TextView>(R.id.textViewCantCanela).text = canela.toString()
        findViewById<TextView>(R.id.textViewCantManzanilla).text = manzanilla.toString()
    }
}