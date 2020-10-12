package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.lang.Exception

class SignUpActivity : AppCompatActivity() {
    private val btnSignUp by lazy { findViewById<Button>(R.id.btnSignUp)}
    private val edtNameSignUp by lazy { findViewById<EditText>(R.id.edtNameSignUp)}
    private val edtEmailSignUp by lazy { findViewById<EditText>(R.id.edtEmailSignUp)}
    private val edtPasswordSignUp by lazy { findViewById<EditText>(R.id.edtPasswordSignUp)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnLoginSignUp.setOnClickListener {
            finish()
        }

        checkboxSignUp.setOnCheckedChangeListener { buttonView, isChecked ->
            btnSignUp.isEnabled = isChecked
        }

        btnSignUp.setOnClickListener {
            val nome = edtNameSignUp.text.toString().trim()
            val email = edtEmailSignUp.text.toString().trim()
            val senha = edtPasswordSignUp.text.toString().trim()

            if ( nome.isEmpty() )
                edtNameSignUp.error = "Digite o nome de usuário..."
            else if( email.isEmpty() )
                edtEmailSignUp.error = "Digite o seu email..."
            else if( senha.isEmpty() )
                edtPasswordSignUp.error = "Digite a senha..."
            else{
                try {
                    UserService.register( nome, email, senha)
                    Toast.makeText(this, "Cadastro registrado com Sucesso...", Toast.LENGTH_SHORT).show()

                    val intentHome = Intent(this, HomeActivity::class.java)
                    intentHome.putExtra("nome", nome)
                    startActivity( intentHome )

                    finish()
                }catch (erro: Exception){
                    Toast.makeText(this, "Erro ao realizar o cadastro...", Toast.LENGTH_SHORT).show()
                }
            }



        }

    }
}