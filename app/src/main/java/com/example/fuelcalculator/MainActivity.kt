 package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



 /*
 objetivo: tenho que fazer um app que calcule quanto gasta um caroo em uma viagem
 variaveis para coletar:
 - consumo do carro/litro
 - preço do combustivel
 - distancia
 o que necessito fazer:
 - home page com botao para proxima pag
 - conectar botao
 - paginas unitarias para cada textimputedittext
 - pegar todas intents colocadas pelo usuario
 - criar logica do calculo
 - mostrar resultado em reais
 - mostrar resumo de tudo que foi posto pelo user
 - criar user interface depois de finalizado.

  */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


          val btniniciar = findViewById<Button>(R.id.btniniciar)

            btniniciar.setOnClickListener {
                val intent = Intent (this, precoActivity::class.java)
                startActivity(intent)
            }








        }
    }

//backend ok