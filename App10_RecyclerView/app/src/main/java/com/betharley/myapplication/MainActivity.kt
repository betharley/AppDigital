package com.betharley.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        var lista = criarMinhaLista()

        val adaptador = lista?.let { ConversarAdaptador(it) }

        recyclerView.apply {
            layoutManager = viewManager
            adapter = adaptador
        }

    }

    fun criarMinhaLista(): ArrayList<Conversa>? {
        var lista: ArrayList<Conversa>? = ArrayList<Conversa>()

        lista!!.add( Conversa(R.drawable.foto_viuva, "Beth Arley", "Ola tudo bem ?", "08:56") )
        lista!!.add( Conversa(R.drawable.images, "Lucas", "Vamos aprender Kotlin", "10:23") )
        lista!!.add( Conversa(R.drawable.transferir, "Marcela", "Vamos aprender VBA", "12:50") )
        lista!!.add( Conversa(R.drawable.profile, "Adriana", "Vamos aprender JAVA", "09:41") )
        lista!!.add( Conversa(R.drawable.foto_viuva, "Monica", "Vamos aprender JavaScript", "11:32") )
        lista!!.add( Conversa(R.drawable.images, "Gabriel", "Vamos aprender C++", "11:32") )
        lista!!.add( Conversa(R.drawable.transferir, "Samuel", "Vamos aprender HTML", "11:32") )
        lista!!.add( Conversa(R.drawable.profile, "Thiago", "Vamos aprender CSS", "11:32") )

        return lista
    }

}