package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    private val home_txt_nome by lazy{ findViewById<TextView>(R.id.home_txt_nome)}
    var nome: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nome = intent.getStringExtra("nome")

        if ( nome!!.isEmpty() || nome.equals("") || nome.equals(null)){
            Toast.makeText( this, "Erro com o nome do usuário", Toast.LENGTH_SHORT).show()
        }else{
            home_txt_nome.text = nome.toString()
        }

    }
}