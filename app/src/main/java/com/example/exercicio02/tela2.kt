package com.example.exercicio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val extras:Bundle? = intent.extras

        val string:String? = extras?.getString("total");
        val valorTotal: TextView = findViewById(R.id.txt);
        valorTotal.setText(string)

    }
}