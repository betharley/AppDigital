package com.betharley.marvelstudios

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderHeroi(view: View): RecyclerView.ViewHolder(view) {
    private val imgFoto: ImageView = view.findViewById(R.id.item_foto)
    private val txtNome: TextView = view.findViewById(R.id.item_nome)
    private val txtDescricao: TextView = view.findViewById(R.id.item_decricao)

    fun bind( personagem: Personagem ){
        imgFoto.setImageResource( personagem.foto )

        txtNome.text = personagem.nome
        txtDescricao.text = personagem.descricao
    }

}