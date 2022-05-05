package com.example.exercicio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val qtd: String = findViewById<EditText?>(R.id.n_quant).text.toString();
        val button: Button = findViewById(R.id.butaoop);
        val salgado: String = findViewById<TextView>(R.id.preco).text.toString();

        val valorT = qtd.toDouble()*salgado.toDouble();

        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("total", valorT.toString())
        startActivity(intent);


    }
}