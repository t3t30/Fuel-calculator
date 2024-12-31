package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_CONSUMO = "KEY CONSUMO"
class consumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val preco = intent.getFloatExtra("KEY PRICE", 0f )
        val distancia = intent.getFloatExtra("KEY DISTANCIA", 0F)
        val txtconsumo = findViewById<TextInputEditText>(R.id.txtconsumo)
        val btnconsumo = findViewById<Button>(R.id.btnconsumo)

        btnconsumo.setOnClickListener{
            val strconsumo: String = txtconsumo.text.toString()
            if (strconsumo == ""){
                Snackbar.make(
                    txtconsumo,
                    "Preencha um consumo válido!",
                    Snackbar.LENGTH_LONG ) }
            else{
                val consumo = strconsumo.toFloat()


                val intent = Intent (this, resultActivity::class.java)
                intent.putExtra( KEY_CONSUMO, consumo)
                intent.putExtra("KEY PRICE", preco)
                intent.putExtra("KEY DISTANCIA", distancia)
                startActivity(intent)


            }

        }



    }
}