package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculator.databinding.ActivityPrecoBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
// recuperar dados do botao, textimputedittext
// passar dados adelante com putextra

const val KEY_PRECO_FUEL = "KEY PRICE"


class precoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco)

        // recuperar o txtimput e o botao
        val txtpreco = findViewById<TextInputEditText>(R.id.txtpreco)
        val btnproximo1 = findViewById<Button>(R.id.btnpreco)

        btnproximo1.setOnClickListener {
            val txtprecostr: String = txtpreco.text.toString()
            if (txtprecostr == ""){
                Snackbar.make(
                txtpreco,
                "Preencha com o preço!",
                Snackbar.LENGTH_LONG ) }
            else { val preco = txtprecostr.toFloat()

                //nao esquecer de colocar extras
                val intent = Intent (this, distanciaActivity::class.java)
                intent.putExtra( KEY_PRECO_FUEL, preco)
                startActivity(intent)


            }
        }







        }





    }
