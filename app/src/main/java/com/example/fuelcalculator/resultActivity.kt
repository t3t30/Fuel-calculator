package com.example.fuelcalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT = "resultresult.KEY_RESULT"

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val preco = intent.getFloatExtra("KEY PRICE", 0f)
        val distancia = intent.getFloatExtra("KEY DISTANCIA", 0f)
        val consumo = intent.getFloatExtra("KEY CONSUMO", 0f)
        val txtresult = findViewById<TextView>(R.id.txtresult)

        val total = distancia/consumo * preco

        val resultformat = String.format("R$ %.2f", total)
        txtresult.text = resultformat






    }
}