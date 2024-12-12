package com.jnmendozarg.apps_iniciales.saludaApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.jnmendozarg.apps_iniciales.R

class NombreSaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre_saludo)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val etnombre = findViewById<AppCompatEditText>(R.id.etNombre)

        btnSaludar.setOnClickListener {
            val nombre = etnombre.text.toString()
            saludar(nombre)
        }

    }

    private  fun saludar(nombre: String){
        if(nombre.isNotEmpty()){
            val intent = Intent(this, ResultadoSaludoActivity::class.java)
            intent.putExtra("EXTRA_NOMBRE", nombre)
            startActivity(intent)
            //Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
            //Log.i("jnmendozarg", "boton pulsado ${nombre}")
        }
    }

}