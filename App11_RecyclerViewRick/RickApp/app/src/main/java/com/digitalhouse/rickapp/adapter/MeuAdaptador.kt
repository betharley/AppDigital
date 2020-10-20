package com.digitalhouse.rickapp.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.R
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso

class MeuAdaptador(private var lista: List<Personagem>):
    RecyclerView.Adapter<MeuAdaptador.ViewHolderRick>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRick {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rick, parent, false)
        return ViewHolderRick(view)
    }

    override fun onBindViewHolder(holder: ViewHolderRick, position: Int) {
        val personagem = lista.get( position )
        holder.bind( personagem )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class ViewHolderRick(view: View): RecyclerView.ViewHolder(view){
        private val txtNome: TextView = view.findViewById(R.id.item_nome)
        private val txtStatus: TextView = view.findViewById(R.id.item_status)
        private val txtSpecies: TextView = view.findViewById(R.id.item_species)
        private val txtLocation: TextView = view.findViewById(R.id.item_location)
        private val imgFoto: ImageView = view.findViewById(R.id.item_image)

        fun bind(personagem: Personagem){
            txtNome.text = personagem.nome
            txtStatus.text = personagem.status
            txtSpecies.text = personagem.especie
            txtLocation.text = personagem.localizacao.toString()

            Picasso.get()
                .load(personagem.imagemUrl)
                .into(imgFoto)
        }
    }

}