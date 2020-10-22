package com.betharley.marvelstudios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val lista: List<Personagem> = ArrayList<Personagem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = GridLayoutManager( this, 2)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerViewHeroi)

        var adaptador = AdaptadorHeroi( this, gerarLista() )

        recyclerView.setHasFixedSize( true )
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = adaptador


        gerarLista()
    }

    fun gerarLista(): List<Personagem> {
        val itens: ArrayList<Personagem>? = ArrayList<Personagem>()
        itens!!.add( Personagem(R.drawable.arqueiro, "Arqueiro", 60,"Usar arco e flecha. A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso.)" ))
        itens!!.add( Personagem(R.drawable.arvore, "Arvore", 90,"Usa os galhos para atacar. A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso.)" ))
        itens!!.add( Personagem(R.drawable.capitao_america, "Capitão America", 80,"Usa muito o escudo. A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso.)" ))
        itens!!.add( Personagem(R.drawable.dark, "Dark Said", 95,"Inimigo muito forte. A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso.)" ))
        itens!!.add( Personagem(R.drawable.dead_pool, "Dead Pool", 75,"Um heroi cheio de piadas). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.destino, "Dr Destino", 68,"Um dos Viloes). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.feiticeira, "Feiticeira", 88,"Muito Poderosa). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.homem_aranha, "Spider-Mar", 90,"Um heroi que usa mascara). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.homem_ferro, "Homem De Ferro", 65,"Usa uma armadura para o combate). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.sheild, "Hulk", 85,"Fica grande e verde). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.thor, "Thor", 80,"Fica grande e verde). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.sheild, "Sheild", 88,"Fica grande e verde). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.viuva_negra, "Viuva Negra", 92,"Fica grande e verde). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.capitao_america, "Capitão America", 80,"Usa muito o escudo. A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso.)" ))
        itens!!.add( Personagem(R.drawable.homem_aranha, "Spider-Mar", 90,"Um heroi que usa mascara). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))
        itens!!.add( Personagem(R.drawable.viuva_negra, "Viuva Negra", 76,"Fica grande e verde). A Marvel recebe mais votos que a DC, embora o enredo não mostra um lado como sendo vitorioso." ))

        return itens
    }
}