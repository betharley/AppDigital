package com.digitalhouse.rickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.adapter.MeuAdaptador
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.api.Personagem
import com.digitalhouse.rickapp.api.RickApi
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var lista: ArrayList<Personagem> = ArrayList<Personagem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        RickApi.getData(this, object: IRespostaDaApi {
            override fun obtevePersonagens(personagens: List<Personagem>) {
//                for (personagem in personagens ){
//                    lista.add( personagem )
//                }
                //lista.add( personagens[0] )
//                Picasso.get()
//                        .load(personagens[0].imagemUrl)
//                        .into(minhaImagem)
                val viewManager = LinearLayoutManager(applicationContext)
                var recyclerViewRick = findViewById<RecyclerView>(R.id.recyclerViewRick)
                val adaptador = MeuAdaptador(personagens)

                recyclerViewRick.apply {
                    setHasFixedSize(true)
                    layoutManager = viewManager
                    adapter = adaptador
                }
            }
        })
    }


}