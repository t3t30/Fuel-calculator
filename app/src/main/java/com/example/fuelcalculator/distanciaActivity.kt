package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.dynamicanimation.animation.SpringForce
import androidx.lifecycle.viewmodel.CreationExtras
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_DISTANCIA = "KEY DISTANCIA"


class distanciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)


     val preco = intent.getFloatExtra("KEY PRICE", 0f)
        val txtdistancia = findViewById<TextInputEditText>(R.id.txtdistancia)
        val btndistancia = findViewById<Button>(R.id.btndistancia)

        btndistancia.setOnClickListener {

        val strdistancia: String= txtdistancia.text.toString()

        if (strdistancia == ""){
                Snackbar.make(
                    txtdistancia,
                    "Preencha uma distância válida!",
                    Snackbar.LENGTH_LONG) }
            else { val distancia = strdistancia.toFloat()


               val intent = Intent (this, consumoActivity::class.java)
               intent.putExtra(KEY_DISTANCIA, distancia)
               intent.putExtra("KEY PRICE", preco)
            startActivity(intent)
            }


        }



    }
}