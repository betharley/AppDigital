package com.betharley.conversor

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        btn_converter.setOnClickListener{
            var resultado = edt_temperatura.text.toString().trim()

            if ( resultado == null || resultado.equals("") || resultado.isEmpty() ){
                Log.i("RESULTADO ", "" + resultado.toString())
            }else{
                var fahrenheit = resultado.toDouble()
                fahrenheit = ( (fahrenheit * 9) / 5) + 32

                Log.i("RESULTADO ", "" + resultado.toString())

                txt_resultado.text = "${fahrenheit} °F"
            }

        }

    }
}