package com.betharley.setonclicklistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        btn_exibir?.setOnClickListener{
            val nome = edt_nome.text.toString().trim()

            if ( nome.equals("") || nome.isEmpty() || nome.equals(null) ){
                Toast.makeText(this, "Digite um nome", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            txt_exibir.text = nome

        }
    }
}