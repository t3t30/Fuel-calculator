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
        val txtpreco = findViewById<TextView>(R.id.txttpreco)
        val txtdistancia = findViewById<TextView>(R.id.txttdistancia)
        val txtconsumo = findViewById<TextView>(R.id.txttconsumo)

        val total = distancia/consumo * preco

        val resultformat = String.format("R$ %.2f", total)
        txtresult.text = resultformat

        val precoformat = String.format("Preço da gasolina: %.2f", preco)
        txtpreco.text = precoformat

        val distanciaformat = String.format("Distância: %.2f" , distancia , "km %.2f")
        txtdistancia.text = distanciaformat

        val consumoformat = String.format("Consumo do carro: %.2f", consumo, "%.2f km/l")
        txtconsumo.text = consumoformat






    }
}