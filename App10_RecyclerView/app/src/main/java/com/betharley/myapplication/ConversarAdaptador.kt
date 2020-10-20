package com.betharley.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ConversarAdaptador(private val lista: List<Conversa> ):
    RecyclerView.Adapter<ConversarAdaptador.ConversaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return ConversaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {
        val conversa = lista.get( position )
        holder.bind( conversa )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class ConversaViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val nome: TextView = view.findViewById(R.id.item_nome)
        private val mensagem: TextView = view.findViewById(R.id.item_mensagem)
        private val hora: TextView = view.findViewById(R.id.item_hora)
        private val imagem: CircleImageView = view.findViewById(R.id.item_imagem)

        fun bind(conversa: Conversa){
            nome.text = conversa.nome
            mensagem.text = conversa.mensagem
            hora.text = conversa.hora
            imagem.setImageResource(conversa.imagem)
        }
    }
}