package com.betharley.marvelstudios

import android.media.MediaMetadata
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)


        val personagem: Personagem = intent.extras!!.getSerializable("personagem") as Personagem

        if ( personagem != null ){

            val foto = findViewById<ImageView>(R.id.detalhe_foto)
            val nome = findViewById<TextView>(R.id.detalhe_nome)
            val detalhes = findViewById<TextView>(R.id.detalhe_descricao)
            val forca = findViewById<TextView>(R.id.detalhe_forca)

            foto.setImageResource( personagem.foto )
            nome.text = personagem.nome
            detalhes.text = personagem.descricao
            forca.text = "Força: " + personagem.forca.toString()

            val btnCombater = findViewById<Button>(R.id.detlhes_combater)

            btnCombater.setOnClickListener {
                Toast.makeText(this, "${personagem.nome} poder entrar em combate...", Toast.LENGTH_SHORT).show()
            }
        }

    }
}