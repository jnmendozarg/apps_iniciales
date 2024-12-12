package com.jnmendozarg.apps_iniciales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jnmendozarg.apps_iniciales.saludaApp.NombreSaludoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludaApp = findViewById<Button>(R.id.btnSaludaApp)
        btnSaludaApp.setOnClickListener{
            navegarToSaludaApp()
        }
    }

    fun navegarToSaludaApp(){
        val intent =  Intent(this, NombreSaludoActivity::class.java )
        startActivity(intent)
    }


}