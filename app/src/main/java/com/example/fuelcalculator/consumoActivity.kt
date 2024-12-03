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

const val KEY_DISTANCIA = "resultdistancia.KEY_DISTANCIA"
class consumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val distanciaporpreco = intent.getFloatExtra(KEY_DISTANCIA, 0f)
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
                val result = distanciaporpreco/consumo

                val intent = Intent (this, resultActivity::class.java)
                intent.putExtra( KEY_RESULT, result )
                startActivity(intent)


            }

        }



    }
}