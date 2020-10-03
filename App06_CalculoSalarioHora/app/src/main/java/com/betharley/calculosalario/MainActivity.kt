package com.betharley.calculosalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular.setOnClickListener {
            calcularHoras()
        }
    }

    fun calcularHoras(){
        var qntHoras = edt_horas.text.toString().trim()
        var valorHora = edt_valor.text.toString().trim()

        if( qntHoras.isEmpty() || qntHoras == null || valorHora.isEmpty() || valorHora == null ){
            Toast.makeText(applicationContext, "Preencha os campos acima", Toast.LENGTH_SHORT).show()
        }else{
            var totalValor = qntHoras.toDouble() * valorHora.toDouble()
            var formatar = DecimalFormat("#,00")
            var resultado = formatar.format(totalValor)

            txt_resultado.text = "R$ ${resultado.toString()}"
        }
    }
}