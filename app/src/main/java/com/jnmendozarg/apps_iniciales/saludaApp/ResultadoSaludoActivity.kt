package com.jnmendozarg.apps_iniciales.saludaApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jnmendozarg.apps_iniciales.R

class ResultadoSaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_saludo)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        val nombre: String = intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        tvResultado.text = "Hola ${ nombre}"

    }
}