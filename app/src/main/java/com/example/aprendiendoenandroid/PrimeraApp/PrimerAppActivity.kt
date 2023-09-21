package com.example.aprendiendoenandroid.PrimeraApp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.aprendiendoenandroid.R

class PrimerAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_app)
        val botonEnviar = findViewById<AppCompatButton>(R.id.BotonEnviar)
        val edirText = findViewById<AppCompatEditText>(R.id.EditText)
        val editTextpass = findViewById<AppCompatEditText>(R.id.EditTextPassware)


        botonEnviar.setOnClickListener {
            val usuario = edirText.text.toString()
            val passware = editTextpass.text.toString()

            if(usuario.isNotEmpty()) {

                Log.i("David", "Hola: $usuario con contraseña $passware ")
            }else{
                Log.i("david","Usuario vacio")
            }
        }

        //Inicio al arrancar la pantalla en plan main
    }
}