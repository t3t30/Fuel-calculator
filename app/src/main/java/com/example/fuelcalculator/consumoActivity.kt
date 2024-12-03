package com.example.fuelcalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
const val  KEY_PREC = "resultpreco.KEY_PRECO"
const val KEY_DISTANCIA = "resultdistancia.KEY_DISTANCIA"
class consumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val preco = intent.getFloatExtra(KEY_PRCO, 0f)
        val



    }
}