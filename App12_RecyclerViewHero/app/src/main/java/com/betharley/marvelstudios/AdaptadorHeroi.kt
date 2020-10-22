package com.betharley.marvelstudios

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AdaptadorHeroi(private val contexto: Context, private val lista: List<Personagem>): RecyclerView.Adapter<ViewHolderHeroi>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHeroi {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return ViewHolderHeroi(view)
    }

    override fun onBindViewHolder(holder: ViewHolderHeroi, position: Int) {
        holder.bind( lista[position] )

        val personagem = lista.get( position )

        holder.itemView.setOnClickListener{
            Toast.makeText(contexto, "${personagem.nome}", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(contexto, DetalhesActivity::class.java)
            intent.putExtra("personagem", personagem)
            contexto.startActivity( intent )
        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}